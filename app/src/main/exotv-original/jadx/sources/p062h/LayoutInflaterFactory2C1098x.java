package p062h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0148n;
import androidx.lifecycle.InterfaceC0164v;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import okhttp3.internal.p129ws.C2155f;
import p002a1.AbstractC0026j;
import p005a4.C0073c;
import p010b.C0527q;
import p011b0.AbstractC0537c;
import p054g.AbstractC1026a;
import p070i0.C1219d;
import p070i0.C1220e;
import p087k.AbstractC1536a;
import p087k.C1538c;
import p087k.C1543h;
import p095l.C1622h;
import p095l.C1623i;
import p095l.C1630p;
import p095l.InterfaceC1625k;
import p095l.MenuC1627m;
import p104m.AbstractC1763q2;
import p104m.C1720g;
import p104m.C1723g2;
import p104m.C1736k;
import p104m.C1743l2;
import p104m.C1770t;
import p104m.InterfaceC1706c1;
import p104m.InterfaceC1710d1;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p105m0.C1843r0;
import p105m0.InterfaceC1821k;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.x */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1098x extends AbstractC1089o implements InterfaceC1625k, LayoutInflater.Factory2 {

    /* renamed from: p0 */
    public static final C2192k f4654p0 = new C2192k(0);

    /* renamed from: q0 */
    public static final int[] f4655q0 = {R.attr.windowBackground};

    /* renamed from: r0 */
    public static final boolean f4656r0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A */
    public InterfaceC1706c1 f4657A;

    /* renamed from: B */
    public C1091q f4658B;

    /* renamed from: C */
    public C1091q f4659C;

    /* renamed from: D */
    public AbstractC1536a f4660D;

    /* renamed from: E */
    public ActionBarContextView f4661E;

    /* renamed from: F */
    public PopupWindow f4662F;

    /* renamed from: G */
    public RunnableC1090p f4663G;

    /* renamed from: I */
    public boolean f4665I;

    /* renamed from: J */
    public ViewGroup f4666J;

    /* renamed from: K */
    public TextView f4667K;

    /* renamed from: L */
    public boolean f4668L;

    /* renamed from: M */
    public boolean f4669M;

    /* renamed from: N */
    public boolean f4670N;

    /* renamed from: O */
    public boolean f4671O;

    /* renamed from: P */
    public boolean f4672P;

    /* renamed from: Q */
    public boolean f4673Q;

    /* renamed from: R */
    public boolean f4674R;

    /* renamed from: S */
    public boolean f4675S;

    /* renamed from: T */
    public C1097w[] f4676T;

    /* renamed from: U */
    public C1097w f4677U;

    /* renamed from: V */
    public boolean f4678V;

    /* renamed from: W */
    public boolean f4679W;

    /* renamed from: X */
    public boolean f4680X;

    /* renamed from: Y */
    public boolean f4681Y;

    /* renamed from: Z */
    public Configuration f4682Z;

    /* renamed from: a0 */
    public final int f4683a0;

    /* renamed from: b0 */
    public int f4684b0;

    /* renamed from: c0 */
    public int f4685c0;

    /* renamed from: d0 */
    public boolean f4686d0;

    /* renamed from: e0 */
    public C1094t f4687e0;

    /* renamed from: f0 */
    public C1094t f4688f0;

    /* renamed from: g0 */
    public boolean f4689g0;

    /* renamed from: h0 */
    public int f4690h0;

    /* renamed from: j0 */
    public boolean f4692j0;

    /* renamed from: k0 */
    public Rect f4693k0;

    /* renamed from: l0 */
    public Rect f4694l0;

    /* renamed from: m0 */
    public C1069a0 f4695m0;

    /* renamed from: n0 */
    public OnBackInvokedDispatcher f4696n0;

    /* renamed from: o0 */
    public C0527q f4697o0;

    /* renamed from: s */
    public final Object f4698s;

    /* renamed from: t */
    public final Context f4699t;

    /* renamed from: u */
    public Window f4700u;

    /* renamed from: v */
    public WindowCallbackC1093s f4701v;

    /* renamed from: w */
    public final Object f4702w;

    /* renamed from: x */
    public C1081g0 f4703x;

    /* renamed from: y */
    public C1543h f4704y;

    /* renamed from: z */
    public CharSequence f4705z;

    /* renamed from: H */
    public C1843r0 f4664H = null;

    /* renamed from: i0 */
    public final RunnableC1090p f4691i0 = new RunnableC1090p(this, 0);

    public LayoutInflaterFactory2C1098x(Context context, Window window, InterfaceC1084j interfaceC1084j, Object obj) {
        AbstractActivityC1083i abstractActivityC1083i = null;
        this.f4683a0 = -100;
        this.f4699t = context;
        this.f4702w = interfaceC1084j;
        this.f4698s = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1083i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1083i = (AbstractActivityC1083i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1083i != null) {
                this.f4683a0 = ((LayoutInflaterFactory2C1098x) abstractActivityC1083i.m2285k()).f4683a0;
            }
        }
        if (this.f4683a0 == -100) {
            String name = this.f4698s.getClass().getName();
            C2192k c2192k = f4654p0;
            Integer num = (Integer) c2192k.get(name);
            if (num != null) {
                this.f4683a0 = num.intValue();
                c2192k.remove(this.f4698s.getClass().getName());
            }
        }
        if (window != null) {
            m2332n(window);
        }
        C1770t.m3455d();
    }

    /* renamed from: o */
    public static C1219d m2321o(Context context) {
        C1219d c1219d;
        C1219d c1219d2;
        if (Build.VERSION.SDK_INT >= 33 || (c1219d = AbstractC1089o.f4614l) == null) {
            return null;
        }
        C1220e c1220e = c1219d.f5102a;
        C1219d c1219dM2669a = C1219d.m2669a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (c1220e.f5103a.isEmpty()) {
            c1219d2 = C1219d.f5101b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c1219dM2669a.f5102a.f5103a.size() + c1220e.f5103a.size()) {
                Locale locale = i < c1220e.f5103a.size() ? c1220e.f5103a.get(i) : c1219dM2669a.f5102a.f5103a.get(i - c1220e.f5103a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c1219d2 = new C1219d(new C1220e(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c1219d2.f5102a.f5103a.isEmpty() ? c1219dM2669a : c1219d2;
    }

    /* renamed from: s */
    public static Configuration m2322s(Context context, int i, C1219d c1219d, Configuration configuration, boolean z7) {
        int i4 = i != 1 ? i != 2 ? z7 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (c1219d != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(c1219d.f5102a.f5103a.toLanguageTags()));
        }
        return configuration2;
    }

    /* renamed from: A */
    public final void m2323A(int i) {
        this.f4690h0 = (1 << i) | this.f4690h0;
        if (this.f4689g0) {
            return;
        }
        View decorView = this.f4700u.getDecorView();
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        decorView.postOnAnimation(this.f4691i0);
        this.f4689g0 = true;
    }

    /* renamed from: B */
    public final int m2324B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f4688f0 == null) {
                            this.f4688f0 = new C1094t(this, context);
                        }
                        return this.f4688f0.mo93f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m2340x(context).mo93f();
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: C */
    public final boolean m2325C() {
        InterfaceC1710d1 interfaceC1710d1;
        C1723g2 c1723g2;
        boolean z7 = this.f4678V;
        this.f4678V = false;
        C1097w c1097wM2341y = m2341y(0);
        if (!c1097wM2341y.f4650m) {
            AbstractC1536a abstractC1536a = this.f4660D;
            if (abstractC1536a != null) {
                abstractC1536a.mo2257a();
                return true;
            }
            m2342z();
            C1081g0 c1081g0 = this.f4703x;
            if (c1081g0 == null || (interfaceC1710d1 = c1081g0.f4591t) == null || (c1723g2 = ((C1743l2) interfaceC1710d1).f6626a.f756U) == null || c1723g2.f6553k == null) {
                return false;
            }
            C1723g2 c1723g22 = ((C1743l2) interfaceC1710d1).f6626a.f756U;
            C1630p c1630p = c1723g22 == null ? null : c1723g22.f6553k;
            if (c1630p != null) {
                c1630p.collapseActionView();
            }
        } else if (!z7) {
            m2335r(c1097wM2341y, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f6194o.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2326D(C1097w c1097w, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z7 = c1097w.f4650m;
        int i4 = c1097w.f4638a;
        if (z7 || this.f4681Y) {
            return;
        }
        Context context = this.f4699t;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f4700u.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, c1097w.f4645h)) {
            m2335r(c1097w, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m2328F(c1097w, keyEvent)) {
            return;
        }
        C1096v c1096v = c1097w.f4642e;
        if (c1096v != null && !c1097w.f4651n) {
            View view = c1097w.f4644g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            c1097w.f4649l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = c1097w.f4640c;
            layoutParams2.windowAnimations = c1097w.f4641d;
            windowManager.addView(c1097w.f4642e, layoutParams2);
            c1097w.f4650m = true;
            if (i4 != 0) {
                m2330H();
                return;
            }
            return;
        }
        if (c1096v == null) {
            m2342z();
            C1081g0 c1081g0 = this.f4703x;
            Context contextM2279i0 = c1081g0 != null ? c1081g0.m2279i0() : null;
            if (contextM2279i0 != null) {
                context = contextM2279i0;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(com.exotv.net.R.attr.actionBarPopupTheme, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            }
            themeNewTheme.resolveAttribute(com.exotv.net.R.attr.panelMenuListTheme, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                themeNewTheme.applyStyle(i9, true);
            } else {
                themeNewTheme.applyStyle(com.exotv.net.R.style.Theme_AppCompat_CompactMenu, true);
            }
            C1538c c1538c = new C1538c(context, 0);
            c1538c.getTheme().setTo(themeNewTheme);
            c1097w.f4647j = c1538c;
            TypedArray typedArrayObtainStyledAttributes = c1538c.obtainStyledAttributes(AbstractC1026a.f4317j);
            c1097w.f4639b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            c1097w.f4641d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            c1097w.f4642e = new C1096v(this, c1097w.f4647j);
            c1097w.f4640c = 81;
        } else if (c1097w.f4651n && c1096v.getChildCount() > 0) {
            c1097w.f4642e.removeAllViews();
        }
        View view2 = c1097w.f4644g;
        if (view2 == null) {
            if (c1097w.f4645h != null) {
                if (this.f4659C == null) {
                    this.f4659C = new C1091q(this, 3);
                }
                C1091q c1091q = this.f4659C;
                if (c1097w.f4646i == null) {
                    C1623i c1623i = new C1623i(c1097w.f4647j);
                    c1097w.f4646i = c1623i;
                    c1623i.f6193n = c1091q;
                    MenuC1627m menuC1627m = c1097w.f4645h;
                    menuC1627m.m3307b(c1623i, menuC1627m.f6209j);
                }
                C1623i c1623i2 = c1097w.f4646i;
                C1096v c1096v2 = c1097w.f4642e;
                if (c1623i2.f6192m == null) {
                    c1623i2.f6192m = (ExpandedMenuView) c1623i2.f6190k.inflate(com.exotv.net.R.layout.abc_expanded_menu_layout, (ViewGroup) c1096v2, false);
                    if (c1623i2.f6194o == null) {
                        c1623i2.f6194o = new C1622h(c1623i2);
                    }
                    c1623i2.f6192m.setAdapter((ListAdapter) c1623i2.f6194o);
                    c1623i2.f6192m.setOnItemClickListener(c1623i2);
                }
                ExpandedMenuView expandedMenuView = c1623i2.f6192m;
                c1097w.f4643f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            c1097w.f4651n = true;
            return;
        }
        c1097w.f4643f = view2;
        if (c1097w.f4643f != null) {
            if (c1097w.f4644g == null) {
                C1623i c1623i3 = c1097w.f4646i;
                if (c1623i3.f6194o == null) {
                    c1623i3.f6194o = new C1622h(c1623i3);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = c1097w.f4643f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c1097w.f4642e.setBackgroundResource(c1097w.f4639b);
            ViewParent parent = c1097w.f4643f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c1097w.f4643f);
            }
            c1097w.f4642e.addView(c1097w.f4643f, layoutParams3);
            if (!c1097w.f4643f.hasFocus()) {
                c1097w.f4643f.requestFocus();
            }
        }
        c1097w.f4651n = true;
        return;
        i = -2;
        c1097w.f4649l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = c1097w.f4640c;
        layoutParams22.windowAnimations = c1097w.f4641d;
        windowManager.addView(c1097w.f4642e, layoutParams22);
        c1097w.f4650m = true;
        if (i4 != 0) {
        }
    }

    /* renamed from: E */
    public final boolean m2327E(C1097w c1097w, int i, KeyEvent keyEvent) {
        MenuC1627m menuC1627m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1097w.f4648k || m2328F(c1097w, keyEvent)) && (menuC1627m = c1097w.f4645h) != null) {
            return menuC1627m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2328F(C1097w c1097w, KeyEvent keyEvent) {
        InterfaceC1706c1 interfaceC1706c1;
        InterfaceC1706c1 interfaceC1706c12;
        Resources.Theme themeNewTheme;
        InterfaceC1706c1 interfaceC1706c13;
        InterfaceC1706c1 interfaceC1706c14;
        if (!this.f4681Y) {
            boolean z7 = c1097w.f4648k;
            int i = c1097w.f4638a;
            if (z7) {
                return true;
            }
            C1097w c1097w2 = this.f4677U;
            if (c1097w2 != null && c1097w2 != c1097w) {
                m2335r(c1097w2, false);
            }
            Window.Callback callback = this.f4700u.getCallback();
            if (callback != null) {
                c1097w.f4644g = callback.onCreatePanelView(i);
            }
            boolean z8 = i == 0 || i == 108;
            if (z8 && (interfaceC1706c14 = this.f4657A) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1706c14;
                actionBarOverlayLayout.m464j();
                ((C1743l2) actionBarOverlayLayout.f697n).f6637l = true;
            }
            if (c1097w.f4644g == null) {
                MenuC1627m menuC1627m = c1097w.f4645h;
                if (menuC1627m == null || c1097w.f4652o) {
                    if (menuC1627m == null) {
                        Context context = this.f4699t;
                        if ((i == 0 || i == 108) && this.f4657A != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.exotv.net.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.exotv.net.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.exotv.net.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C1538c c1538c = new C1538c(context, 0);
                                c1538c.getTheme().setTo(themeNewTheme);
                                context = c1538c;
                            }
                        }
                        MenuC1627m menuC1627m2 = new MenuC1627m(context);
                        menuC1627m2.f6213n = this;
                        MenuC1627m menuC1627m3 = c1097w.f4645h;
                        if (menuC1627m2 != menuC1627m3) {
                            if (menuC1627m3 != null) {
                                menuC1627m3.m3315r(c1097w.f4646i);
                            }
                            c1097w.f4645h = menuC1627m2;
                            C1623i c1623i = c1097w.f4646i;
                            if (c1623i != null) {
                                menuC1627m2.m3307b(c1623i, menuC1627m2.f6209j);
                            }
                        }
                        if (c1097w.f4645h != null) {
                            if (z8 && (interfaceC1706c12 = this.f4657A) != null) {
                                if (this.f4658B == null) {
                                    this.f4658B = new C1091q(this, 2);
                                }
                                ((ActionBarOverlayLayout) interfaceC1706c12).m465l(c1097w.f4645h, this.f4658B);
                            }
                            c1097w.f4645h.m3320w();
                            if (callback.onCreatePanelMenu(i, c1097w.f4645h)) {
                                c1097w.f4652o = false;
                            } else {
                                MenuC1627m menuC1627m4 = c1097w.f4645h;
                                if (menuC1627m4 != null) {
                                    if (menuC1627m4 != null) {
                                        menuC1627m4.m3315r(c1097w.f4646i);
                                    }
                                    c1097w.f4645h = null;
                                }
                                if (z8 && (interfaceC1706c1 = this.f4657A) != null) {
                                    ((ActionBarOverlayLayout) interfaceC1706c1).m465l(null, this.f4658B);
                                }
                            }
                        }
                    }
                }
                c1097w.f4645h.m3320w();
                Bundle bundle = c1097w.f4653p;
                if (bundle != null) {
                    c1097w.f4645h.m3316s(bundle);
                    c1097w.f4653p = null;
                }
                if (!callback.onPreparePanel(0, c1097w.f4644g, c1097w.f4645h)) {
                    if (z8 && (interfaceC1706c13 = this.f4657A) != null) {
                        ((ActionBarOverlayLayout) interfaceC1706c13).m465l(null, this.f4658B);
                    }
                    c1097w.f4645h.m3319v();
                    return false;
                }
                c1097w.f4645h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c1097w.f4645h.m3319v();
            }
            c1097w.f4648k = true;
            c1097w.f4649l = false;
            this.f4677U = c1097w;
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void m2329G() {
        if (this.f4665I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: H */
    public final void m2330H() {
        C0527q c0527q;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z7 = false;
            if (this.f4696n0 != null && (m2341y(0).f4650m || this.f4660D != null)) {
                z7 = true;
            }
            if (z7 && this.f4697o0 == null) {
                this.f4697o0 = AbstractC1086l.m2299i(this.f4696n0, this);
            } else {
                if (z7 || (c0527q = this.f4697o0) == null) {
                    return;
                }
                AbstractC1086l.m2303m(this.f4696n0, c0527q);
                this.f4697o0 = null;
            }
        }
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: a */
    public final void mo2307a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4699t);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1098x) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: c */
    public final void mo2308c() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strM1262c;
        this.f4679W = true;
        m2331m(false, true);
        m2339w();
        Object obj = this.f4698s;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM1262c = AbstractC0537c.m1262c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM1262c = null;
            }
            if (strM1262c != null) {
                C1081g0 c1081g0 = this.f4703x;
                if (c1081g0 == null) {
                    this.f4692j0 = true;
                } else {
                    c1081g0.m2281k0(true);
                }
            }
            synchronized (AbstractC1089o.f4619q) {
                AbstractC1089o.m2306e(this);
                AbstractC1089o.f4618p.add(new WeakReference(this));
            }
        }
        this.f4682Z = new Configuration(this.f4699t.getResources().getConfiguration());
        this.f4680X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p062h.AbstractC1089o
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2309d() {
        if (this.f4698s instanceof Activity) {
            synchronized (AbstractC1089o.f4619q) {
                AbstractC1089o.m2306e(this);
            }
        }
        if (this.f4689g0) {
            this.f4700u.getDecorView().removeCallbacks(this.f4691i0);
        }
        this.f4681Y = true;
        if (this.f4683a0 != -100) {
            Object obj = this.f4698s;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f4654p0.put(this.f4698s.getClass().getName(), Integer.valueOf(this.f4683a0));
            } else {
                f4654p0.remove(this.f4698s.getClass().getName());
            }
        }
        C1094t c1094t = this.f4687e0;
        if (c1094t != null) {
            c1094t.m90c();
        }
        C1094t c1094t2 = this.f4688f0;
        if (c1094t2 != null) {
            c1094t2.m90c();
        }
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: f */
    public final boolean mo2310f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f4674R && i == 108) {
            return false;
        }
        if (this.f4670N && i == 1) {
            this.f4670N = false;
        }
        if (i == 1) {
            m2329G();
            this.f4674R = true;
            return true;
        }
        if (i == 2) {
            m2329G();
            this.f4668L = true;
            return true;
        }
        if (i == 5) {
            m2329G();
            this.f4669M = true;
            return true;
        }
        if (i == 10) {
            m2329G();
            this.f4672P = true;
            return true;
        }
        if (i == 108) {
            m2329G();
            this.f4670N = true;
            return true;
        }
        if (i != 109) {
            return this.f4700u.requestFeature(i);
        }
        m2329G();
        this.f4671O = true;
        return true;
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: g */
    public final void mo2311g(int i) {
        m2338v();
        ViewGroup viewGroup = (ViewGroup) this.f4666J.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4699t).inflate(i, viewGroup);
        this.f4701v.m2317a(this.f4700u.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m3416h() != false) goto L20;
     */
    @Override // p095l.InterfaceC1625k
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2264h(MenuC1627m menuC1627m) {
        ActionMenuView actionMenuView;
        C1736k c1736k;
        C1736k c1736k2;
        C1736k c1736k3;
        InterfaceC1706c1 interfaceC1706c1 = this.f4657A;
        if (interfaceC1706c1 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1706c1;
            actionBarOverlayLayout.m464j();
            Toolbar toolbar = ((C1743l2) actionBarOverlayLayout.f697n).f6626a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f762j) != null && actionMenuView.f711B) {
                if (ViewConfiguration.get(this.f4699t).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f4657A;
                    actionBarOverlayLayout2.m464j();
                    ActionMenuView actionMenuView2 = ((C1743l2) actionBarOverlayLayout2.f697n).f6626a.f762j;
                    if (actionMenuView2 != null) {
                        C1736k c1736k4 = actionMenuView2.f712C;
                        if (c1736k4 != null) {
                            if (c1736k4.f6587D == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f4700u.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f4657A;
                actionBarOverlayLayout3.m464j();
                ActionMenuView actionMenuView3 = ((C1743l2) actionBarOverlayLayout3.f697n).f6626a.f762j;
                if (actionMenuView3 != null && (c1736k2 = actionMenuView3.f712C) != null && c1736k2.m3416h()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f4657A;
                    actionBarOverlayLayout4.m464j();
                    ActionMenuView actionMenuView4 = ((C1743l2) actionBarOverlayLayout4.f697n).f6626a.f762j;
                    if (actionMenuView4 != null && (c1736k3 = actionMenuView4.f712C) != null) {
                        c1736k3.m3415f();
                    }
                    if (this.f4681Y) {
                        return;
                    }
                    callback.onPanelClosed(108, m2341y(0).f4645h);
                    return;
                }
                if (callback == null || this.f4681Y) {
                    return;
                }
                if (this.f4689g0 && (1 & this.f4690h0) != 0) {
                    View decorView = this.f4700u.getDecorView();
                    RunnableC1090p runnableC1090p = this.f4691i0;
                    decorView.removeCallbacks(runnableC1090p);
                    runnableC1090p.run();
                }
                C1097w c1097wM2341y = m2341y(0);
                MenuC1627m menuC1627m2 = c1097wM2341y.f4645h;
                if (menuC1627m2 == null || c1097wM2341y.f4652o || !callback.onPreparePanel(0, c1097wM2341y.f4644g, menuC1627m2)) {
                    return;
                }
                callback.onMenuOpened(108, c1097wM2341y.f4645h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f4657A;
                actionBarOverlayLayout5.m464j();
                ActionMenuView actionMenuView5 = ((C1743l2) actionBarOverlayLayout5.f697n).f6626a.f762j;
                if (actionMenuView5 == null || (c1736k = actionMenuView5.f712C) == null) {
                    return;
                }
                c1736k.m3417l();
                return;
            }
        }
        C1097w c1097wM2341y2 = m2341y(0);
        c1097wM2341y2.f4651n = true;
        m2335r(c1097wM2341y2, false);
        m2326D(c1097wM2341y2, null);
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: i */
    public final void mo2312i(View view) {
        m2338v();
        ViewGroup viewGroup = (ViewGroup) this.f4666J.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4701v.m2317a(this.f4700u.getCallback());
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: j */
    public final void mo2313j(View view, ViewGroup.LayoutParams layoutParams) {
        m2338v();
        ViewGroup viewGroup = (ViewGroup) this.f4666J.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4701v.m2317a(this.f4700u.getCallback());
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: k */
    public final boolean mo2267k(MenuC1627m menuC1627m, MenuItem menuItem) {
        C1097w c1097w;
        Window.Callback callback = this.f4700u.getCallback();
        if (callback != null && !this.f4681Y) {
            MenuC1627m menuC1627mMo3294k = menuC1627m.mo3294k();
            C1097w[] c1097wArr = this.f4676T;
            int length = c1097wArr != null ? c1097wArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c1097w = c1097wArr[i];
                    if (c1097w != null && c1097w.f4645h == menuC1627mMo3294k) {
                        break;
                    }
                    i++;
                } else {
                    c1097w = null;
                    break;
                }
            }
            if (c1097w != null) {
                return callback.onMenuItemSelected(c1097w.f4638a, menuItem);
            }
        }
        return false;
    }

    @Override // p062h.AbstractC1089o
    /* renamed from: l */
    public final void mo2314l(CharSequence charSequence) {
        this.f4705z = charSequence;
        InterfaceC1706c1 interfaceC1706c1 = this.f4657A;
        if (interfaceC1706c1 != null) {
            interfaceC1706c1.setWindowTitle(charSequence);
            return;
        }
        C1081g0 c1081g0 = this.f4703x;
        if (c1081g0 == null) {
            TextView textView = this.f4667K;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1743l2 c1743l2 = (C1743l2) c1081g0.f4591t;
        if (c1743l2.f6632g) {
            return;
        }
        Toolbar toolbar = c1743l2.f6626a;
        c1743l2.f6633h = charSequence;
        if ((c1743l2.f6627b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1743l2.f6632g) {
                AbstractC1828m0.m3609n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2331m(boolean z7, boolean z8) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        int i;
        boolean z9;
        Object obj;
        Object obj2;
        if (this.f4681Y) {
            return false;
        }
        int i4 = this.f4683a0;
        if (i4 == -100) {
            i4 = AbstractC1089o.f4613k;
        }
        Context context = this.f4699t;
        int iM2324B = m2324B(context, i4);
        int i8 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        C1219d c1219dM2321o = i8 < 33 ? m2321o(context) : null;
        if (!z8 && c1219dM2321o != null) {
            c1219dM2321o = C1219d.m2669a(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationM2322s = m2322s(context, iM2324B, c1219dM2321o, null, false);
        boolean z10 = this.f4686d0;
        boolean z11 = true;
        Object obj3 = this.f4698s;
        if (z10 || !(obj3 instanceof Activity)) {
            this.f4686d0 = true;
            i = this.f4685c0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i8 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f4685c0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f4685c0 = 0;
                }
                this.f4686d0 = true;
                i = this.f4685c0;
            }
        }
        Configuration configuration = this.f4682Z;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i9 = configuration.uiMode & 48;
        int i10 = configurationM2322s.uiMode & 48;
        C1219d c1219dM2669a = C1219d.m2669a(configuration.getLocales().toLanguageTags());
        C1219d c1219dM2669a2 = c1219dM2321o == null ? null : C1219d.m2669a(configurationM2322s.getLocales().toLanguageTags());
        int i11 = i9 != i10 ? 512 : 0;
        if (c1219dM2669a2 != null && !c1219dM2669a.equals(c1219dM2669a2)) {
            i11 |= 8196;
        }
        if (((~i) & i11) != 0 && z7 && this.f4679W && ((f4656r0 || this.f4680X) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (!activity.isChild()) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 31 && (i11 & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM2322s.getLayoutDirection());
                }
                if (i12 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0127c0(7, activity));
                }
                z9 = true;
            }
        } else {
            z9 = false;
        }
        if (z9 || i11 == 0) {
            z11 = z9;
        } else {
            boolean z12 = (i11 & i) == i11;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i10;
            if (c1219dM2669a2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(c1219dM2669a2.f5102a.f5103a.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 26 && i13 < 28) {
                if (!AbstractC0715d.f2799m) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        AbstractC0715d.f2798l = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e8) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
                    }
                    AbstractC0715d.f2799m = true;
                }
                Field field = AbstractC0715d.f2798l;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e9) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!AbstractC0715d.f2793g) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                AbstractC0715d.f2792f = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e10) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                            }
                            AbstractC0715d.f2793g = true;
                        }
                        Field field2 = AbstractC0715d.f2792f;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e11) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                            }
                            if (obj2 != null) {
                                if (!AbstractC0715d.f2795i) {
                                    try {
                                        AbstractC0715d.f2794h = Class.forName("android.content.res.ThemedResourceCache");
                                    } catch (ClassNotFoundException e12) {
                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e12);
                                    }
                                    AbstractC0715d.f2795i = true;
                                }
                                Class cls = AbstractC0715d.f2794h;
                                if (cls != null) {
                                    if (!AbstractC0715d.f2797k) {
                                        try {
                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                            AbstractC0715d.f2796j = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e13) {
                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e13);
                                        }
                                        AbstractC0715d.f2797k = true;
                                    }
                                    Field field3 = AbstractC0715d.f2796j;
                                    if (field3 != null) {
                                        try {
                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                        } catch (IllegalAccessException e14) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e14);
                                        }
                                        if (longSparseArray != null) {
                                            longSparseArray.clear();
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                            if (obj2 != null) {
                            }
                        }
                    }
                }
            }
            int i14 = this.f4684b0;
            if (i14 != 0) {
                context.setTheme(i14);
                context.getTheme().applyStyle(this.f4684b0, true);
            }
            if (z12 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC0164v) {
                    if (((InterfaceC0164v) activity2).mo224e().mo569b().compareTo(EnumC0148n.f927l) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                        this.f4700u.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.f4680X && !this.f4681Y) {
                    activity2.onConfigurationChanged(configuration2);
                    this.f4700u.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (c1219dM2669a2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(C1219d.m2669a(context.getResources().getConfiguration().getLocales().toLanguageTags()).f5102a.f5103a.toLanguageTags()));
        }
        if (i4 == 0) {
            m2340x(context).m97j();
        } else {
            C1094t c1094t = this.f4687e0;
            if (c1094t != null) {
                c1094t.m90c();
            }
        }
        if (i4 == 3) {
            if (this.f4688f0 == null) {
                this.f4688f0 = new C1094t(this, context);
            }
            this.f4688f0.m97j();
        } else {
            C1094t c1094t2 = this.f4688f0;
            if (c1094t2 != null) {
                c1094t2.m90c();
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2332n(Window window) {
        Drawable drawableM3480c;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        C0527q c0527q;
        int resourceId;
        if (this.f4700u != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC1093s) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC1093s windowCallbackC1093s = new WindowCallbackC1093s(this, callback);
        this.f4701v = windowCallbackC1093s;
        window.setCallback(windowCallbackC1093s);
        Context context = this.f4699t;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f4655q0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM3480c = null;
        } else {
            C1770t c1770tM3453a = C1770t.m3453a();
            synchronized (c1770tM3453a) {
                drawableM3480c = c1770tM3453a.f6749a.m3480c(resourceId, context, true);
            }
        }
        if (drawableM3480c != null) {
            window.setBackgroundDrawable(drawableM3480c);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f4700u = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f4696n0) != null) {
            return;
        }
        Object obj = this.f4698s;
        if (onBackInvokedDispatcher != null && (c0527q = this.f4697o0) != null) {
            AbstractC1086l.m2303m(onBackInvokedDispatcher, c0527q);
            this.f4697o0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f4696n0 = AbstractC1086l.m2292b(activity);
            } else {
                this.f4696n0 = null;
            }
        }
        m2330H();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:117:0x01e1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p062h.LayoutInflaterFactory2C1098x.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: p */
    public final void m2333p(int i, C1097w c1097w, MenuC1627m menuC1627m) {
        if (menuC1627m == null) {
            if (c1097w == null && i >= 0) {
                C1097w[] c1097wArr = this.f4676T;
                if (i < c1097wArr.length) {
                    c1097w = c1097wArr[i];
                }
            }
            if (c1097w != null) {
                menuC1627m = c1097w.f4645h;
            }
        }
        if ((c1097w == null || c1097w.f4650m) && !this.f4681Y) {
            WindowCallbackC1093s windowCallbackC1093s = this.f4701v;
            Window.Callback callback = this.f4700u.getCallback();
            windowCallbackC1093s.getClass();
            try {
                windowCallbackC1093s.f4630m = true;
                callback.onPanelClosed(i, menuC1627m);
            } finally {
                windowCallbackC1093s.f4630m = false;
            }
        }
    }

    /* renamed from: q */
    public final void m2334q(MenuC1627m menuC1627m) {
        C1736k c1736k;
        if (this.f4675S) {
            return;
        }
        this.f4675S = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4657A;
        actionBarOverlayLayout.m464j();
        ActionMenuView actionMenuView = ((C1743l2) actionBarOverlayLayout.f697n).f6626a.f762j;
        if (actionMenuView != null && (c1736k = actionMenuView.f712C) != null) {
            c1736k.m3415f();
            C1720g c1720g = c1736k.f6586C;
            if (c1720g != null && c1720g.m3339b()) {
                c1720g.f6279j.dismiss();
            }
        }
        Window.Callback callback = this.f4700u.getCallback();
        if (callback != null && !this.f4681Y) {
            callback.onPanelClosed(108, menuC1627m);
        }
        this.f4675S = false;
    }

    /* renamed from: r */
    public final void m2335r(C1097w c1097w, boolean z7) {
        C1096v c1096v;
        InterfaceC1706c1 interfaceC1706c1;
        C1736k c1736k;
        if (z7 && c1097w.f4638a == 0 && (interfaceC1706c1 = this.f4657A) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1706c1;
            actionBarOverlayLayout.m464j();
            ActionMenuView actionMenuView = ((C1743l2) actionBarOverlayLayout.f697n).f6626a.f762j;
            if (actionMenuView != null && (c1736k = actionMenuView.f712C) != null && c1736k.m3416h()) {
                m2334q(c1097w.f4645h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f4699t.getSystemService("window");
        if (windowManager != null && c1097w.f4650m && (c1096v = c1097w.f4642e) != null) {
            windowManager.removeView(c1096v);
            if (z7) {
                m2333p(c1097w.f4638a, c1097w, null);
            }
        }
        c1097w.f4648k = false;
        c1097w.f4649l = false;
        c1097w.f4650m = false;
        c1097w.f4643f = null;
        c1097w.f4651n = true;
        if (this.f4677U == c1097w) {
            this.f4677U = null;
        }
        if (c1097w.f4638a == 0) {
            m2330H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2336t(KeyEvent keyEvent) {
        View decorView;
        boolean z7;
        boolean zM2328F;
        ActionMenuView actionMenuView;
        C1736k c1736k;
        C1736k c1736k2;
        C1736k c1736k3;
        Object obj = this.f4698s;
        if ((!(obj instanceof InterfaceC1821k) && !(obj instanceof DialogInterfaceC1080g)) || (decorView = this.f4700u.getDecorView()) == null || !AbstractC0714c.m1490C(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC1093s windowCallbackC1093s = this.f4701v;
                Window.Callback callback = this.f4700u.getCallback();
                windowCallbackC1093s.getClass();
                try {
                    windowCallbackC1093s.f4629l = true;
                    if (!callback.dispatchKeyEvent(keyEvent)) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode == 4) {
                                this.f4678V = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    C1097w c1097wM2341y = m2341y(0);
                                    if (!c1097wM2341y.f4650m) {
                                        m2328F(c1097wM2341y, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f4660D == null) {
                                    C1097w c1097wM2341y2 = m2341y(0);
                                    InterfaceC1706c1 interfaceC1706c1 = this.f4657A;
                                    Context context = this.f4699t;
                                    if (interfaceC1706c1 != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1706c1;
                                        actionBarOverlayLayout.m464j();
                                        Toolbar toolbar = ((C1743l2) actionBarOverlayLayout.f697n).f6626a;
                                        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f762j) == null || !actionMenuView.f711B || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            boolean z8 = c1097wM2341y2.f4650m;
                                            if (z8 || c1097wM2341y2.f4649l) {
                                                m2335r(c1097wM2341y2, true);
                                                z7 = z8;
                                            } else {
                                                if (c1097wM2341y2.f4648k) {
                                                    if (c1097wM2341y2.f4652o) {
                                                        c1097wM2341y2.f4648k = false;
                                                        zM2328F = m2328F(c1097wM2341y2, keyEvent);
                                                    } else {
                                                        zM2328F = true;
                                                    }
                                                    if (zM2328F) {
                                                        m2326D(c1097wM2341y2, keyEvent);
                                                        z7 = true;
                                                    }
                                                }
                                                z7 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f4657A;
                                            actionBarOverlayLayout2.m464j();
                                            ActionMenuView actionMenuView2 = ((C1743l2) actionBarOverlayLayout2.f697n).f6626a.f762j;
                                            if (actionMenuView2 == null || (c1736k2 = actionMenuView2.f712C) == null || !c1736k2.m3416h()) {
                                                if (!this.f4681Y && m2328F(c1097wM2341y2, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f4657A;
                                                    actionBarOverlayLayout3.m464j();
                                                    ActionMenuView actionMenuView3 = ((C1743l2) actionBarOverlayLayout3.f697n).f6626a.f762j;
                                                    if (actionMenuView3 != null && (c1736k = actionMenuView3.f712C) != null && c1736k.m3417l()) {
                                                        z7 = true;
                                                    }
                                                }
                                                z7 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f4657A;
                                                actionBarOverlayLayout4.m464j();
                                                ActionMenuView actionMenuView4 = ((C1743l2) actionBarOverlayLayout4.f697n).f6626a.f762j;
                                                if (actionMenuView4 == null || (c1736k3 = actionMenuView4.f712C) == null || !c1736k3.m3415f()) {
                                                    z7 = false;
                                                }
                                            }
                                        }
                                        if (z7) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        if (!m2325C()) {
                            return false;
                        }
                    }
                } finally {
                    windowCallbackC1093s.f4629l = false;
                }
            }
        }
        return true;
    }

    /* renamed from: u */
    public final void m2337u(int i) {
        C1097w c1097wM2341y = m2341y(i);
        if (c1097wM2341y.f4645h != null) {
            Bundle bundle = new Bundle();
            c1097wM2341y.f4645h.m3317t(bundle);
            if (bundle.size() > 0) {
                c1097wM2341y.f4653p = bundle;
            }
            c1097wM2341y.f4645h.m3320w();
            c1097wM2341y.f4645h.clear();
        }
        c1097wM2341y.f4652o = true;
        c1097wM2341y.f4651n = true;
        if ((i == 108 || i == 0) && this.f4657A != null) {
            C1097w c1097wM2341y2 = m2341y(0);
            c1097wM2341y2.f4648k = false;
            m2328F(c1097wM2341y2, null);
        }
    }

    /* renamed from: v */
    public final void m2338v() {
        ViewGroup viewGroup;
        if (this.f4665I) {
            return;
        }
        Context context = this.f4699t;
        int[] iArr = AbstractC1026a.f4317j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i4 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(C2155f.PAYLOAD_SHORT, false)) {
            mo2310f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo2310f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo2310f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo2310f(10);
        }
        this.f4673Q = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m2339w();
        this.f4700u.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f4674R) {
            viewGroup = this.f4672P ? (ViewGroup) layoutInflaterFrom.inflate(com.exotv.net.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.exotv.net.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f4673Q) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.exotv.net.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f4671O = false;
            this.f4670N = false;
        } else if (this.f4670N) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.exotv.net.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1538c(context, typedValue.resourceId) : context).inflate(com.exotv.net.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1706c1 interfaceC1706c1 = (InterfaceC1706c1) viewGroup.findViewById(com.exotv.net.R.id.decor_content_parent);
            this.f4657A = interfaceC1706c1;
            interfaceC1706c1.setWindowCallback(this.f4700u.getCallback());
            if (this.f4671O) {
                ((ActionBarOverlayLayout) this.f4657A).m463i(109);
            }
            if (this.f4668L) {
                ((ActionBarOverlayLayout) this.f4657A).m463i(2);
            }
            if (this.f4669M) {
                ((ActionBarOverlayLayout) this.f4657A).m463i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4670N + ", windowActionBarOverlay: " + this.f4671O + ", android:windowIsFloating: " + this.f4673Q + ", windowActionModeOverlay: " + this.f4672P + ", windowNoTitle: " + this.f4674R + " }");
        }
        C1091q c1091q = new C1091q(this, i);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1804e0.m3538j(viewGroup, c1091q);
        if (this.f4657A == null) {
            this.f4667K = (TextView) viewGroup.findViewById(com.exotv.net.R.id.title);
        }
        boolean z7 = AbstractC1763q2.f6715a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.exotv.net.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4700u.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f4700u.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C1091q(this, i4));
        this.f4666J = viewGroup;
        Object obj = this.f4698s;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4705z;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1706c1 interfaceC1706c12 = this.f4657A;
            if (interfaceC1706c12 != null) {
                interfaceC1706c12.setWindowTitle(title);
            } else {
                C1081g0 c1081g0 = this.f4703x;
                if (c1081g0 != null) {
                    C1743l2 c1743l2 = (C1743l2) c1081g0.f4591t;
                    if (!c1743l2.f6632g) {
                        Toolbar toolbar = c1743l2.f6626a;
                        c1743l2.f6633h = title;
                        if ((c1743l2.f6627b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (c1743l2.f6632g) {
                                AbstractC1828m0.m3609n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f4667K;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4666J.findViewById(R.id.content);
        View decorView = this.f4700u.getDecorView();
        contentFrameLayout2.f731p.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f4665I = true;
        C1097w c1097wM2341y = m2341y(0);
        if (this.f4681Y || c1097wM2341y.f4645h != null) {
            return;
        }
        m2323A(108);
    }

    /* renamed from: w */
    public final void m2339w() {
        if (this.f4700u == null) {
            Object obj = this.f4698s;
            if (obj instanceof Activity) {
                m2332n(((Activity) obj).getWindow());
            }
        }
        if (this.f4700u == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: x */
    public final AbstractC0026j m2340x(Context context) {
        if (this.f4687e0 == null) {
            if (C0073c.f322n == null) {
                Context applicationContext = context.getApplicationContext();
                C0073c.f322n = new C0073c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4687e0 = new C1094t(this, C0073c.f322n);
        }
        return this.f4687e0;
    }

    /* renamed from: y */
    public final C1097w m2341y(int i) {
        C1097w[] c1097wArr = this.f4676T;
        if (c1097wArr == null || c1097wArr.length <= i) {
            C1097w[] c1097wArr2 = new C1097w[i + 1];
            if (c1097wArr != null) {
                System.arraycopy(c1097wArr, 0, c1097wArr2, 0, c1097wArr.length);
            }
            this.f4676T = c1097wArr2;
            c1097wArr = c1097wArr2;
        }
        C1097w c1097w = c1097wArr[i];
        if (c1097w != null) {
            return c1097w;
        }
        C1097w c1097w2 = new C1097w();
        c1097w2.f4638a = i;
        c1097w2.f4651n = false;
        c1097wArr[i] = c1097w2;
        return c1097w2;
    }

    /* renamed from: z */
    public final void m2342z() {
        m2338v();
        if (this.f4670N && this.f4703x == null) {
            Object obj = this.f4698s;
            if (obj instanceof Activity) {
                this.f4703x = new C1081g0((Activity) obj, this.f4671O);
            } else if (obj instanceof Dialog) {
                this.f4703x = new C1081g0((Dialog) obj);
            }
            C1081g0 c1081g0 = this.f4703x;
            if (c1081g0 != null) {
                c1081g0.m2281k0(this.f4692j0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
