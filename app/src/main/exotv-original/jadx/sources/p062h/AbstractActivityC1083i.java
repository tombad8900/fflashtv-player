package p062h;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.EnumC0148n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p002a1.AbstractComponentCallbacksC0050v;
import p002a1.C0035n0;
import p002a1.C0036o;
import p002a1.C0052w;
import p002a1.C0053w0;
import p002a1.C0056y;
import p002a1.C0058z;
import p004a3.C0063a;
import p004a3.C0067e;
import p010b.AbstractActivityC0522l;
import p011b0.AbstractC0537c;
import p017b6.AbstractC0622v;
import p029d0.AbstractC0786b;
import p029d0.AbstractC0794j;
import p047f1.C0931a;
import p062h.AbstractActivityC1083i;
import p070i0.C1219d;
import p087k.C1538c;
import p087k.C1543h;
import p087k.C1545j;
import p096l0.InterfaceC1641a;
import p104m.C1743l2;
import p104m.C1770t;
import p104m.C1787y1;
import p130p.C2189h;
import p130p.C2193l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.i */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1083i extends AbstractActivityC0522l implements InterfaceC1084j {

    /* renamed from: D */
    public boolean f4601D;

    /* renamed from: E */
    public boolean f4602E;

    /* renamed from: G */
    public LayoutInflaterFactory2C1098x f4604G;

    /* renamed from: B */
    public final C0036o f4599B = new C0036o(1, new C0058z(this));

    /* renamed from: C */
    public final C0166x f4600C = new C0166x(this);

    /* renamed from: F */
    public boolean f4603F = true;

    public AbstractActivityC1083i() {
        ((C0067e) this.f2140m.f7451m).m254e("android:support:lifecycle", new C0052w(0, this));
        final int i = 0;
        m1245g(new InterfaceC1641a(this) { // from class: a1.x

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC1083i f269b;

            {
                this.f269b = this;
            }

            @Override // p096l0.InterfaceC1641a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f269b.f4599B.m174q();
                        break;
                    default:
                        this.f269b.f4599B.m174q();
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f2147t.add(new InterfaceC1641a(this) { // from class: a1.x

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC1083i f269b;

            {
                this.f269b = this;
            }

            @Override // p096l0.InterfaceC1641a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f269b.f4599B.m174q();
                        break;
                    default:
                        this.f269b.f4599B.m174q();
                        break;
                }
            }
        });
        m1246h(new C0056y(this, 0));
        ((C0067e) this.f2140m.f7451m).m254e("androidx:appcompat", new C0063a(this));
        m1246h(new C1082h(this));
    }

    /* renamed from: l */
    public static boolean m2284l(C0035n0 c0035n0) {
        boolean zM2284l = false;
        for (AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v : c0035n0.f117c.m80k()) {
            if (abstractComponentCallbacksC0050v != null) {
                C0058z c0058z = abstractComponentCallbacksC0050v.f210B;
                if ((c0058z == null ? null : c0058z.f281t) != null) {
                    zM2284l |= m2284l(abstractComponentCallbacksC0050v.m226g());
                }
                C0053w0 c0053w0 = abstractComponentCallbacksC0050v.f231W;
                EnumC0148n enumC0148n = EnumC0148n.f928m;
                if (c0053w0 != null) {
                    c0053w0.m240f();
                    if (c0053w0.f266l.f951m.compareTo(enumC0148n) >= 0) {
                        abstractComponentCallbacksC0050v.f231W.f266l.m587n();
                        zM2284l = true;
                    }
                }
                if (abstractComponentCallbacksC0050v.f230V.f951m.compareTo(enumC0148n) >= 0) {
                    abstractComponentCallbacksC0050v.f230V.m587n();
                    zM2284l = true;
                }
            }
        }
        return zM2284l;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1248j();
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        layoutInflaterFactory2C1098x.m2338v();
        ((ViewGroup) layoutInflaterFactory2C1098x.f4666J.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1098x.f4701v.m2317a(layoutInflaterFactory2C1098x.f4700u.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Method method;
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        layoutInflaterFactory2C1098x.f4679W = true;
        int i = layoutInflaterFactory2C1098x.f4683a0;
        if (i == -100) {
            i = AbstractC1089o.f4613k;
        }
        int iM2324B = layoutInflaterFactory2C1098x.m2324B(context, i);
        if (AbstractC1089o.m2305b(context) && AbstractC1089o.m2305b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC1089o.f4620r) {
                    try {
                        C1219d c1219d = AbstractC1089o.f4614l;
                        if (c1219d == null) {
                            if (AbstractC1089o.f4615m == null) {
                                AbstractC1089o.f4615m = C1219d.m2669a(AbstractC0537c.m1264e(context));
                            }
                            if (!AbstractC1089o.f4615m.f5102a.f5103a.isEmpty()) {
                                AbstractC1089o.f4614l = AbstractC1089o.f4615m;
                            }
                        } else if (!c1219d.equals(AbstractC1089o.f4615m)) {
                            C1219d c1219d2 = AbstractC1089o.f4614l;
                            AbstractC1089o.f4615m = c1219d2;
                            AbstractC0537c.m1263d(context, c1219d2.f5102a.f5103a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC1089o.f4617o) {
                AbstractC1089o.f4612j.execute(new RunnableC1085k(context, 0));
            }
        }
        C1219d c1219dM2321o = LayoutInflaterFactory2C1098x.m2321o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1098x.m2322s(context, iM2324B, c1219dM2321o, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C1538c) {
            try {
                ((C1538c) context).m3216a(LayoutInflaterFactory2C1098x.m2322s(context, iM2324B, c1219dM2321o, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C1098x.f4656r0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f8 = configuration3.fontScale;
                    float f9 = configuration4.fontScale;
                    if (f8 != f9) {
                        configuration.fontScale = f9;
                    }
                    int i4 = configuration3.mcc;
                    int i8 = configuration4.mcc;
                    if (i4 != i8) {
                        configuration.mcc = i8;
                    }
                    int i9 = configuration3.mnc;
                    int i10 = configuration4.mnc;
                    if (i9 != i10) {
                        configuration.mnc = i10;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i12 = configuration3.touchscreen;
                    int i13 = configuration4.touchscreen;
                    if (i12 != i13) {
                        configuration.touchscreen = i13;
                    }
                    int i14 = configuration3.keyboard;
                    int i15 = configuration4.keyboard;
                    if (i14 != i15) {
                        configuration.keyboard = i15;
                    }
                    int i16 = configuration3.keyboardHidden;
                    int i17 = configuration4.keyboardHidden;
                    if (i16 != i17) {
                        configuration.keyboardHidden = i17;
                    }
                    int i18 = configuration3.navigation;
                    int i19 = configuration4.navigation;
                    if (i18 != i19) {
                        configuration.navigation = i19;
                    }
                    int i20 = configuration3.navigationHidden;
                    int i21 = configuration4.navigationHidden;
                    if (i20 != i21) {
                        configuration.navigationHidden = i21;
                    }
                    int i22 = configuration3.orientation;
                    int i23 = configuration4.orientation;
                    if (i22 != i23) {
                        configuration.orientation = i23;
                    }
                    int i24 = configuration3.screenLayout & 15;
                    int i25 = configuration4.screenLayout & 15;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 192;
                    int i27 = configuration4.screenLayout & 192;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 48;
                    int i29 = configuration4.screenLayout & 48;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 768;
                    int i31 = configuration4.screenLayout & 768;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    if (i11 >= 26) {
                        AbstractC0622v.m1391c(configuration3, configuration4, configuration);
                    }
                    int i32 = configuration3.uiMode & 15;
                    int i33 = configuration4.uiMode & 15;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.uiMode & 48;
                    int i35 = configuration4.uiMode & 48;
                    if (i34 != i35) {
                        configuration.uiMode |= i35;
                    }
                    int i36 = configuration3.screenWidthDp;
                    int i37 = configuration4.screenWidthDp;
                    if (i36 != i37) {
                        configuration.screenWidthDp = i37;
                    }
                    int i38 = configuration3.screenHeightDp;
                    int i39 = configuration4.screenHeightDp;
                    if (i38 != i39) {
                        configuration.screenHeightDp = i39;
                    }
                    int i40 = configuration3.smallestScreenWidthDp;
                    int i41 = configuration4.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration.smallestScreenWidthDp = i41;
                    }
                    int i42 = configuration3.densityDpi;
                    int i43 = configuration4.densityDpi;
                    if (i42 != i43) {
                        configuration.densityDpi = i43;
                    }
                }
            }
            Configuration configurationM2322s = LayoutInflaterFactory2C1098x.m2322s(context, iM2324B, c1219dM2321o, configuration, true);
            C1538c c1538c = new C1538c(context, com.exotv.net.R.style.Theme_AppCompat_Empty);
            c1538c.m3216a(configurationM2322s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c1538c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0794j.m1946a(theme);
                    } else {
                        synchronized (AbstractC0786b.f3547e) {
                            if (AbstractC0786b.f3549g) {
                                method = AbstractC0786b.f3548f;
                                if (method != null) {
                                }
                            } else {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC0786b.f3548f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                AbstractC0786b.f3549g = true;
                                method = AbstractC0786b.f3548f;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, null);
                                    } catch (IllegalAccessException | InvocationTargetException e8) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                                        AbstractC0786b.f3548f = null;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c1538c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C1098x) m2285k()).m2342z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p011b0.AbstractActivityC0539e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C1098x) m2285k()).m2342z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f4601D);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4602E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4603F);
        if (getApplication() != null) {
            C2193l c2193l = ((C0931a) new C0036o(mo222b(), C0931a.f3994c).m172o(C0931a.class)).f3995b;
            if (c2193l.f7659l > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (c2193l.f7659l > 0) {
                    if (c2193l.f7658k[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(c2193l.f7657j[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0058z) this.f4599B.f143k).f280s.m156v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        layoutInflaterFactory2C1098x.m2338v();
        return layoutInflaterFactory2C1098x.f4700u.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        if (layoutInflaterFactory2C1098x.f4704y == null) {
            layoutInflaterFactory2C1098x.m2342z();
            C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
            layoutInflaterFactory2C1098x.f4704y = new C1543h(c1081g0 != null ? c1081g0.m2279i0() : layoutInflaterFactory2C1098x.f4699t);
        }
        return layoutInflaterFactory2C1098x.f4704y;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        if (layoutInflaterFactory2C1098x.f4703x != null) {
            layoutInflaterFactory2C1098x.m2342z();
            layoutInflaterFactory2C1098x.f4703x.getClass();
            layoutInflaterFactory2C1098x.m2323A(0);
        }
    }

    /* renamed from: k */
    public final AbstractC1089o m2285k() {
        if (this.f4604G == null) {
            ExecutorC1087m executorC1087m = AbstractC1089o.f4612j;
            this.f4604G = new LayoutInflaterFactory2C1098x(this, null, this, this);
        }
        return this.f4604G;
    }

    /* renamed from: m */
    public final void m2286m() {
        super.onDestroy();
        ((C0058z) this.f4599B.f143k).f280s.m145k();
        this.f4600C.m585l(EnumC0146m.ON_DESTROY);
    }

    /* renamed from: n */
    public final boolean m2287n(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0058z) this.f4599B.f143k).f280s.m143i();
        }
        return false;
    }

    /* renamed from: o */
    public final void m2288o() {
        super.onPostResume();
        this.f4600C.m585l(EnumC0146m.ON_RESUME);
        C0035n0 c0035n0 = ((C0058z) this.f4599B.f143k).f280s;
        c0035n0.f106E = false;
        c0035n0.f107F = false;
        c0035n0.f113L.f174g = false;
        c0035n0.m154t(7);
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        this.f4599B.m174q();
        super.onActivityResult(i, i4, intent);
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        if (layoutInflaterFactory2C1098x.f4670N && layoutInflaterFactory2C1098x.f4665I) {
            layoutInflaterFactory2C1098x.m2342z();
            C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
            if (c1081g0 != null) {
                c1081g0.m2282l0(c1081g0.f4587p.getResources().getBoolean(com.exotv.net.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1770t c1770tM3453a = C1770t.m3453a();
        Context context = layoutInflaterFactory2C1098x.f4699t;
        synchronized (c1770tM3453a) {
            C1787y1 c1787y1 = c1770tM3453a.f6749a;
            synchronized (c1787y1) {
                C2189h c2189h = (C2189h) c1787y1.f6814b.get(context);
                if (c2189h != null) {
                    c2189h.m3965a();
                }
            }
        }
        layoutInflaterFactory2C1098x.f4682Z = new Configuration(layoutInflaterFactory2C1098x.f4699t.getResources().getConfiguration());
        layoutInflaterFactory2C1098x.m2331m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p010b.AbstractActivityC0522l, p011b0.AbstractActivityC0539e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4600C.m585l(EnumC0146m.ON_CREATE);
        C0035n0 c0035n0 = ((C0058z) this.f4599B.f143k).f280s;
        c0035n0.f106E = false;
        c0035n0.f107F = false;
        c0035n0.f113L.f174g = false;
        c0035n0.m154t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0058z) this.f4599B.f143k).f280s.f120f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m2286m();
        m2285k().mo2309d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM1260a;
        if (!m2287n(i, menuItem)) {
            LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
            layoutInflaterFactory2C1098x.m2342z();
            C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
            if (menuItem.getItemId() != 16908332 || c1081g0 == null || (((C1743l2) c1081g0.f4591t).f6627b & 4) == 0 || (intentM1260a = AbstractC0537c.m1260a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM1260a)) {
                navigateUpTo(intentM1260a);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM1260a2 = AbstractC0537c.m1260a(this);
            if (intentM1260a2 == null) {
                intentM1260a2 = AbstractC0537c.m1260a(this);
            }
            if (intentM1260a2 != null) {
                ComponentName component = intentM1260a2.getComponent();
                if (component == null) {
                    component = intentM1260a2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM1261b = AbstractC0537c.m1261b(this, component);
                    while (intentM1261b != null) {
                        arrayList.add(size, intentM1261b);
                        intentM1261b = AbstractC0537c.m1261b(this, intentM1261b.getComponent());
                    }
                    arrayList.add(intentM1260a2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4602E = false;
        ((C0058z) this.f4599B.f143k).f280s.m154t(5);
        this.f4600C.m585l(EnumC0146m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1098x) m2285k()).m2338v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m2288o();
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        layoutInflaterFactory2C1098x.m2342z();
        C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
        if (c1081g0 != null) {
            c1081g0.f4582I = true;
        }
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f4599B.m174q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0036o c0036o = this.f4599B;
        c0036o.m174q();
        super.onResume();
        this.f4602E = true;
        ((C0058z) c0036o.f143k).f280s.m159y(true);
    }

    @Override // android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        m2289p();
        ((LayoutInflaterFactory2C1098x) m2285k()).m2331m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f4599B.m174q();
    }

    @Override // android.app.Activity
    public final void onStop() {
        m2290q();
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2285k();
        layoutInflaterFactory2C1098x.m2342z();
        C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
        if (c1081g0 != null) {
            c1081g0.f4582I = false;
            C1545j c1545j = c1081g0.f4581H;
            if (c1545j != null) {
                c1545j.m3222a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m2285k().mo2314l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C1098x) m2285k()).m2342z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final void m2289p() {
        C0036o c0036o = this.f4599B;
        c0036o.m174q();
        C0058z c0058z = (C0058z) c0036o.f143k;
        super.onStart();
        this.f4603F = false;
        if (!this.f4601D) {
            this.f4601D = true;
            C0035n0 c0035n0 = c0058z.f280s;
            c0035n0.f106E = false;
            c0035n0.f107F = false;
            c0035n0.f113L.f174g = false;
            c0035n0.m154t(4);
        }
        c0058z.f280s.m159y(true);
        this.f4600C.m585l(EnumC0146m.ON_START);
        C0035n0 c0035n02 = c0058z.f280s;
        c0035n02.f106E = false;
        c0035n02.f107F = false;
        c0035n02.f113L.f174g = false;
        c0035n02.m154t(5);
    }

    /* renamed from: q */
    public final void m2290q() {
        C0036o c0036o;
        super.onStop();
        this.f4603F = true;
        do {
            c0036o = this.f4599B;
        } while (m2284l(((C0058z) c0036o.f143k).f280s));
        C0035n0 c0035n0 = ((C0058z) c0036o.f143k).f280s;
        c0035n0.f107F = true;
        c0035n0.f113L.f174g = true;
        c0035n0.m154t(4);
        this.f4600C.m585l(EnumC0146m.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m1248j();
        m2285k().mo2311g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C1098x) m2285k()).f4684b0 = i;
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity
    public void setContentView(View view) {
        m1248j();
        m2285k().mo2312i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1248j();
        m2285k().mo2313j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0058z) this.f4599B.f143k).f280s.f120f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
