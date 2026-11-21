package p062h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p070i0.C1219d;
import p130p.C2182a;
import p130p.C2187f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.o */
/* loaded from: classes.dex */
public abstract class AbstractC1089o {

    /* renamed from: j */
    public static final ExecutorC1087m f4612j = new ExecutorC1087m(new ExecutorC1088n(0));

    /* renamed from: k */
    public static final int f4613k = -100;

    /* renamed from: l */
    public static C1219d f4614l = null;

    /* renamed from: m */
    public static C1219d f4615m = null;

    /* renamed from: n */
    public static Boolean f4616n = null;

    /* renamed from: o */
    public static boolean f4617o = false;

    /* renamed from: p */
    public static final C2187f f4618p = new C2187f(0);

    /* renamed from: q */
    public static final Object f4619q = new Object();

    /* renamed from: r */
    public static final Object f4620r = new Object();

    /* renamed from: b */
    public static boolean m2305b(Context context) {
        if (f4616n == null) {
            try {
                int i = AbstractServiceC1071b0.f4521j;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1071b0.class), 640).metaData;
                if (bundle != null) {
                    f4616n = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f4616n = Boolean.FALSE;
            }
        }
        return f4616n.booleanValue();
    }

    /* renamed from: e */
    public static void m2306e(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x) {
        synchronized (f4619q) {
            try {
                C2187f c2187f = f4618p;
                c2187f.getClass();
                C2182a c2182a = new C2182a(c2187f);
                while (c2182a.hasNext()) {
                    AbstractC1089o abstractC1089o = (AbstractC1089o) ((WeakReference) c2182a.next()).get();
                    if (abstractC1089o == layoutInflaterFactory2C1098x || abstractC1089o == null) {
                        c2182a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2307a();

    /* renamed from: c */
    public abstract void mo2308c();

    /* renamed from: d */
    public abstract void mo2309d();

    /* renamed from: f */
    public abstract boolean mo2310f(int i);

    /* renamed from: g */
    public abstract void mo2311g(int i);

    /* renamed from: i */
    public abstract void mo2312i(View view);

    /* renamed from: j */
    public abstract void mo2313j(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: l */
    public abstract void mo2314l(CharSequence charSequence);
}
