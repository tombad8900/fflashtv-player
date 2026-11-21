package p087k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.c */
/* loaded from: classes.dex */
public final class C1538c extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f5859f;

    /* renamed from: a */
    public int f5860a;

    /* renamed from: b */
    public Resources.Theme f5861b;

    /* renamed from: c */
    public LayoutInflater f5862c;

    /* renamed from: d */
    public Configuration f5863d;

    /* renamed from: e */
    public Resources f5864e;

    public C1538c(Context context, int i) {
        super(context);
        this.f5860a = i;
    }

    /* renamed from: a */
    public final void m3216a(Configuration configuration) {
        if (this.f5864e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f5863d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f5863d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m3217b() {
        if (this.f5861b == null) {
            this.f5861b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5861b.setTo(theme);
            }
        }
        this.f5861b.applyStyle(this.f5860a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f5864e == null) {
            Configuration configuration = this.f5863d;
            if (configuration == null) {
                this.f5864e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f5859f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f5859f = configuration2;
                    }
                    if (configuration.equals(f5859f)) {
                    }
                }
                this.f5864e = createConfigurationContext(this.f5863d).getResources();
            }
        }
        return this.f5864e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5862c == null) {
            this.f5862c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5862c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f5861b;
        if (theme != null) {
            return theme;
        }
        if (this.f5860a == 0) {
            this.f5860a = R.style.Theme_AppCompat_Light;
        }
        m3217b();
        return this.f5861b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f5860a != i) {
            this.f5860a = i;
            m3217b();
        }
    }
}
