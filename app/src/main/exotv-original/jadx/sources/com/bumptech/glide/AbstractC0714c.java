package com.bumptech.glide;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.StatFs;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.media3.common.C0247v0;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p005a4.C0073c;
import p005a4.C0087j;
import p011b0.AbstractC0538d;
import p024c5.C0661f;
import p029d0.AbstractC0795k;
import p032d3.AbstractC0838w;
import p037e0.AbstractC0850a;
import p037e0.C0853d;
import p044e7.C0924a;
import p044e7.C0926c;
import p061g7.C1062i;
import p065h3.C1158c;
import p065h3.C1163h;
import p068h6.AbstractC1198e;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.C1322p;
import p082j3.C1496i;
import p087k.C1538c;
import p095l.C1629o;
import p102l6.C1688e;
import p102l6.C1690g;
import p105m0.AbstractC1828m0;
import p105m0.C1825l0;
import p105m0.C1837p0;
import p105m0.InterfaceC1821k;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p111m6.C1923r;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p134p3.C2209c;
import p137p6.C2228i;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2226g;
import p137p6.InterfaceC2227h;
import p142q2.C2258g;
import p149r0.C2287a;
import p151r3.C2291c;
import p171t5.AbstractC2436a;
import p185v3.AbstractC2536f;
import p185v3.C2540j;
import p185v3.C2541k;
import p189v7.AbstractC2585p;
import p189v7.C2556a0;
import p189v7.C2558b0;
import p189v7.C2592w;
import p197w6.AbstractC2704a;
import p207y0.C2790g;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public abstract class AbstractC0714c {

    /* renamed from: j */
    public static boolean f2781j = true;

    /* renamed from: k */
    public static volatile boolean f2782k = true;

    /* renamed from: l */
    public static boolean f2783l;

    /* renamed from: m */
    public static Method f2784m;

    /* renamed from: n */
    public static boolean f2785n;

    /* renamed from: o */
    public static Field f2786o;

    /* renamed from: A */
    public static Bitmap m1488A(byte[] bArr, int i) throws IOException {
        int i4 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (bitmapDecodeByteArray == null) {
            throw C0247v0.createForMalformedContainer("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C2790g c2790g = new C2790g(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (c2790g.m4879c()) {
                case 3:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = 270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
            }
            if (i4 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    /* renamed from: B */
    public static C0853d[] m1489B(C0853d[] c0853dArr) {
        C0853d[] c0853dArr2 = new C0853d[c0853dArr.length];
        for (int i = 0; i < c0853dArr.length; i++) {
            c0853dArr2[i] = new C0853d(c0853dArr[i]);
        }
        return c0853dArr2;
    }

    /* renamed from: C */
    public static boolean m1490C(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C1825l0.f6904d;
        C1825l0 c1825l0 = (C1825l0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c1825l0 == null) {
            c1825l0 = new C1825l0();
            c1825l0.f6905a = null;
            c1825l0.f6906b = null;
            c1825l0.f6907c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1825l0);
        }
        WeakReference weakReference2 = c1825l0.f6907c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1825l0.f6907c = new WeakReference(keyEvent);
        if (c1825l0.f6906b == null) {
            c1825l0.f6906b = new SparseArray();
        }
        SparseArray sparseArray = c1825l0.f6906b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw AbstractC0008a1.m10f(size, arrayList);
    }

    /* renamed from: D */
    public static boolean m1491D(InterfaceC1821k interfaceC1821k, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC1821k != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC1821k.mo1268d(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f2783l) {
                            try {
                                f2784m = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f2783l = true;
                        }
                        Method method = f2784m;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC1828m0.m3598c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2785n) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2786o = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2785n = true;
                }
                Field field = f2786o;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC1828m0.m3598c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC1828m0.m3598c(view, keyEvent)) || interfaceC1821k.mo1268d(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m1492E(long j, long j8, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j9 = j / j8;
        long j10 = j - (j8 * j9);
        if (j10 != 0) {
            int i = ((int) ((j ^ j8) >> 63)) | 1;
            switch (AbstractC1198e.f5076a[roundingMode.ordinal()]) {
                case 1:
                    if (j10 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case 3:
                    break;
                case 4:
                    return j9 + i;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long jAbs = Math.abs(j10);
                    long jAbs2 = jAbs - (Math.abs(j8) - jAbs);
                    return jAbs2 != 0 ? j9 : j9;
                default:
                    throw new AssertionError();
            }
        }
    }

    /* renamed from: F */
    public static boolean m1493F(CharSequence charSequence, String str) {
        char c8;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length == str.length()) {
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == str.charAt(i) || ((c8 = (char) ((r3 | ' ') - 97)) < 26 && c8 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static View m1494G(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View viewFindViewById = viewGroup.getChildAt(i4).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* renamed from: H */
    public static long m1495H(long j, long j8) {
        AbstractC0715d.m1565l(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, j);
        AbstractC0715d.m1565l("b", j8);
        if (j == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j9 = j8 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j9) {
            long j10 = jNumberOfTrailingZeros - j9;
            long j11 = (j10 >> 63) & j10;
            long j12 = (j10 - j11) - j11;
            j9 += j11;
            jNumberOfTrailingZeros = j12 >> Long.numberOfTrailingZeros(j12);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* renamed from: I */
    public static int m1496I(Context context, int i, int i4) {
        TypedValue typedValueM4340o = AbstractC2436a.m4340o(context.getTheme(), i);
        Integer numValueOf = typedValueM4340o != null ? Integer.valueOf(m1509X(context, typedValueM4340o)) : null;
        return numValueOf != null ? numValueOf.intValue() : i4;
    }

    /* renamed from: J */
    public static Drawable m1497J(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f2782k) {
                return m1504Q(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f2782k = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC0795k.f3568a;
        return resources.getDrawable(i, theme);
    }

    /* renamed from: K */
    public static int m1498K(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* renamed from: L */
    public static String m1499L(String str, String str2) {
        for (String str3 : AbstractC1206h.m2638L0(AbstractC1206h.m2648V0(AbstractC1206h.m2635I0(str, "Intent"), ';'), new char[]{';'})) {
            int iM2627A0 = AbstractC1206h.m2627A0(str3, '=', 0, 6);
            if (iM2627A0 > 0) {
                String strSubstring = str3.substring(0, iM2627A0);
                AbstractC2980h.m5135d("substring(...)", strSubstring);
                if (strSubstring.equalsIgnoreCase(str2)) {
                    String strSubstring2 = str3.substring(iM2627A0 + 1);
                    AbstractC2980h.m5135d("substring(...)", strSubstring2);
                    return strSubstring2;
                }
            }
        }
        return null;
    }

    /* renamed from: M */
    public static boolean m1500M(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i4 = rect.right;
            int i8 = rect2.right;
            return (i4 > i8 || rect.left >= i8) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    /* renamed from: N */
    public static boolean m1501N(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0850a.f3767a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d8 = iRed / 255.0d;
        double dPow = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = iGreen / 255.0d;
        double dPow2 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = iBlue / 255.0d;
        double dPow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d11 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d11;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d11 / 100.0d > 0.5d;
    }

    /* renamed from: O */
    public static boolean m1502O(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* renamed from: P */
    public static int m1503P(float f8, int i, int i4) {
        return AbstractC0850a.m2017b(AbstractC0850a.m2019d(i4, Math.round(Color.alpha(i4) * f8)), i);
    }

    /* renamed from: Q */
    public static Drawable m1504Q(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C1538c c1538c = new C1538c(context);
            c1538c.f5861b = theme;
            c1538c.m3216a(theme.getResources().getConfiguration());
            context = c1538c;
        }
        return AbstractC0715d.m1542D(context, i);
    }

    /* renamed from: R */
    public static int m1505R(int i, Rect rect, Rect rect2) {
        int i4;
        int i8;
        if (i == 17) {
            i4 = rect.left;
            i8 = rect2.right;
        } else if (i == 33) {
            i4 = rect.top;
            i8 = rect2.bottom;
        } else if (i == 66) {
            i4 = rect2.left;
            i8 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i8 = rect.bottom;
        }
        return Math.max(0, i4 - i8);
    }

    /* renamed from: S */
    public static int m1506S(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: T */
    public static InterfaceC2227h m1507T(InterfaceC2225f interfaceC2225f, InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        return AbstractC2980h.m5132a(interfaceC2225f.getKey(), interfaceC2226g) ? C2228i.f7747j : interfaceC2225f;
    }

    /* renamed from: W */
    public static InterfaceC2227h m1508W(InterfaceC2225f interfaceC2225f, InterfaceC2227h interfaceC2227h) {
        AbstractC2980h.m5136e("context", interfaceC2227h);
        return interfaceC2227h == C2228i.f7747j ? interfaceC2225f : (InterfaceC2227h) interfaceC2227h.mo2770t(interfaceC2225f, new C1322p(7));
    }

    /* renamed from: X */
    public static int m1509X(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    /* renamed from: Y */
    public static C2258g m1510Y(C2258g c2258g, String[] strArr, Map map) {
        int i = 0;
        if (c2258g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C2258g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C2258g c2258g2 = new C2258g();
                int length = strArr.length;
                while (i < length) {
                    c2258g2.m4047a((C2258g) map.get(strArr[i]));
                    i++;
                }
                return c2258g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c2258g.m4047a((C2258g) map.get(strArr[0]));
                return c2258g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c2258g.m4047a((C2258g) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c2258g;
    }

    /* renamed from: Z */
    public static long m1511Z(long j, long j8) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j8;
        }
        long j9 = ((j ^ j8) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j8 == Long.MIN_VALUE) & (j < 0)))) {
            long j10 = j * j8;
            if (j == 0 || j10 / j == j8) {
                return j10;
            }
        }
        return j9;
    }

    /* renamed from: a0 */
    public static Set m1512a0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C1923r.f7189j;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            AbstractC2980h.m5135d("singleton(...)", setSingleton);
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1924s.m3759T(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* renamed from: b0 */
    public static C0924a m1513b0(C0926c c0926c, int i) {
        AbstractC2980h.m5136e("<this>", c0926c);
        boolean z7 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z7) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i4 = c0926c.f3986j;
        int i8 = c0926c.f3987k;
        if (c0926c.f3988l <= 0) {
            i = -i;
        }
        return new C0924a(i4, i8, i);
    }

    /* renamed from: c0 */
    public static void m1514c0(ViewGroup viewGroup, boolean z7) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0838w.m2006b(viewGroup, z7);
        } else if (f2781j) {
            try {
                AbstractC0838w.m2006b(viewGroup, z7);
            } catch (NoSuchMethodError unused) {
                f2781j = false;
            }
        }
    }

    /* renamed from: d */
    public static void m1515d(StringBuilder sb, Object obj, InterfaceC2851l interfaceC2851l) {
        if (interfaceC2851l != null) {
            sb.append((CharSequence) interfaceC2851l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* renamed from: d0 */
    public static final void m1516d0(Object obj) throws Throwable {
        if (obj instanceof C1688e) {
            throw ((C1688e) obj).f6488j;
        }
    }

    /* renamed from: e0 */
    public static String m1517e0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (c8 >= 'A' && c8 <= 'Z') {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m1518f(String str, int i, int i4) {
        if (i < 0) {
            return AbstractC0715d.m1550S("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return AbstractC0715d.m1550S("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(AbstractC0008a1.m12h(i4, "negative size: "));
    }

    /* renamed from: f0 */
    public static String m1519f0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (c8 >= 'a' && c8 <= 'z') {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1520g(int i, Rect rect, Rect rect2, Rect rect3) {
        int i4;
        int i8;
        boolean zM1522h = m1522h(i, rect, rect2);
        if (m1522h(i, rect, rect3) || !zM1522h) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            int iM1505R = m1505R(i, rect, rect2);
                            if (i == 17) {
                                i4 = rect.left;
                                i8 = rect3.left;
                            } else if (i == 33) {
                                i4 = rect.top;
                                i8 = rect3.top;
                            } else if (i == 66) {
                                i4 = rect3.right;
                                i8 = rect.right;
                            } else {
                                if (i != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i4 = rect3.bottom;
                                i8 = rect.bottom;
                            }
                            if (iM1505R >= Math.max(1, i4 - i8)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    /* renamed from: g0 */
    public static C0926c m1521g0(int i, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new C0926c(i, i4 - 1, 1);
        }
        C0926c c0926c = C0926c.f3993m;
        return C0926c.f3993m;
    }

    /* renamed from: h */
    public static boolean m1522h(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: i */
    public static final void m1523i(View view) {
        AbstractC2980h.m5136e("<this>", view);
        C1062i c1062i = new C1062i();
        C1837p0 c1837p0 = new C1837p0(view, c1062i);
        c1837p0.f6927m = c1062i;
        c1062i.f4490m = c1837p0;
        while (c1062i.hasNext()) {
            View view2 = (View) c1062i.next();
            C2287a c2287a = (C2287a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c2287a == null) {
                c2287a = new C2287a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c2287a);
            }
            ArrayList arrayList = c2287a.f7979a;
            int iM3752s0 = AbstractC1914i.m3752s0(arrayList);
            if (-1 < iM3752s0) {
                throw AbstractC0008a1.m10f(iM3752s0, arrayList);
            }
        }
    }

    /* renamed from: j */
    public static void m1524j(String str, boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: k */
    public static void m1525k(boolean z7, String str, long j) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC0715d.m1550S(str, Long.valueOf(j)));
        }
    }

    /* renamed from: l */
    public static void m1526l(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: m */
    public static void m1527m(int i, int i4) {
        String strM1550S;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                strM1550S = AbstractC0715d.m1550S("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(AbstractC0008a1.m12h(i4, "negative size: "));
                }
                strM1550S = AbstractC0715d.m1550S("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strM1550S);
        }
    }

    /* renamed from: n */
    public static void m1528n(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: o */
    public static void m1529o(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: p */
    public static void m1530p(int i, int i4) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(m1518f("index", i, i4));
        }
    }

    /* renamed from: q */
    public static void m1531q(int i, int i4, int i8) {
        if (i < 0 || i4 < i || i4 > i8) {
            throw new IndexOutOfBoundsException((i < 0 || i > i8) ? m1518f("start index", i, i8) : (i4 < 0 || i4 > i8) ? m1518f("end index", i4, i8) : AbstractC0715d.m1550S("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    /* renamed from: r */
    public static int m1532r(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC0538d.m1265a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: s */
    public static long m1533s(long j, long j8) {
        long j9 = j + j8;
        if (((j ^ j8) < 0) || ((j ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j + ", " + j8 + ")");
    }

    /* renamed from: t */
    public static int m1534t(int i, int i4, int i8) {
        if (i4 <= i8) {
            return i < i4 ? i4 : i > i8 ? i8 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i8 + " is less than minimum " + i4 + '.');
    }

    /* renamed from: u */
    public static long m1535u(long j, long j8, long j9) {
        if (j8 <= j9) {
            return j < j8 ? j8 : j > j9 ? j9 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    /* renamed from: v */
    public static float[] m1536v(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: w */
    public static final void m1537w(int i, int i4) {
        if (i <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i4 + ").");
    }

    /* renamed from: x */
    public static final C1163h m1538x(Context context) {
        final C0073c c0073c = new C0073c(context, 10);
        Context context2 = (Context) c0073c.f324k;
        C2291c c2291c = (C2291c) c0073c.f325l;
        final int i = 0;
        C1690g c1690g = new C1690g(new InterfaceC2840a() { // from class: h3.e
            @Override // p212y6.InterfaceC2840a
            public final Object invoke() {
                int largeMemoryClass;
                C1496i c1496i;
                switch (i) {
                    case 0:
                        Context context3 = (Context) c0073c.f324k;
                        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                        double d8 = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC2980h.m5133b(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d8 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i4 = 0;
                        C0087j c0087j = new C0087j(5, false);
                        if (d8 > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC2536f.f9216a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC2980h.m5133b(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context3.getApplicationInfo().flags & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d9 = d8 * largeMemoryClass;
                            double d10 = 1024;
                            i4 = (int) (d9 * d10 * d10);
                        }
                        return new C2209c(i4 > 0 ? new C0016e(i4, c0087j) : new C1629o(c0087j), c0087j);
                    default:
                        C0073c c0073c2 = c0073c;
                        C2541k c2541k = C2541k.f9231a;
                        Context context4 = (Context) c0073c2.f324k;
                        synchronized (c2541k) {
                            try {
                                c1496i = C2541k.f9232b;
                                if (c1496i == null) {
                                    C2592w c2592w = AbstractC2585p.f9330a;
                                    C2054e c2054e = AbstractC1290e0.f5316a;
                                    ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                                    Bitmap.Config[] configArr3 = AbstractC2536f.f9216a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM4757v = AbstractC2704a.m4757v(cacheDir);
                                    String str = C2558b0.f9272k;
                                    C2558b0 c2558b0M4572e = C2556a0.m4572e(fileM4757v);
                                    long jM1535u = 10485760;
                                    try {
                                        File file = c2558b0M4572e.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jM1535u = AbstractC0714c.m1535u((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    C1496i c1496i2 = new C1496i(jM1535u, executorC2053d, c2592w, c2558b0M4572e);
                                    C2541k.f9232b = c1496i2;
                                    c1496i = c1496i2;
                                }
                            } finally {
                            }
                        }
                        return c1496i;
                }
            }
        });
        final int i4 = 1;
        C1690g c1690g2 = new C1690g(new InterfaceC2840a() { // from class: h3.e
            @Override // p212y6.InterfaceC2840a
            public final Object invoke() {
                int largeMemoryClass;
                C1496i c1496i;
                switch (i4) {
                    case 0:
                        Context context3 = (Context) c0073c.f324k;
                        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                        double d8 = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC2980h.m5133b(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d8 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i42 = 0;
                        C0087j c0087j = new C0087j(5, false);
                        if (d8 > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC2536f.f9216a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC2980h.m5133b(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context3.getApplicationInfo().flags & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d9 = d8 * largeMemoryClass;
                            double d10 = 1024;
                            i42 = (int) (d9 * d10 * d10);
                        }
                        return new C2209c(i42 > 0 ? new C0016e(i42, c0087j) : new C1629o(c0087j), c0087j);
                    default:
                        C0073c c0073c2 = c0073c;
                        C2541k c2541k = C2541k.f9231a;
                        Context context4 = (Context) c0073c2.f324k;
                        synchronized (c2541k) {
                            try {
                                c1496i = C2541k.f9232b;
                                if (c1496i == null) {
                                    C2592w c2592w = AbstractC2585p.f9330a;
                                    C2054e c2054e = AbstractC1290e0.f5316a;
                                    ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                                    Bitmap.Config[] configArr3 = AbstractC2536f.f9216a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM4757v = AbstractC2704a.m4757v(cacheDir);
                                    String str = C2558b0.f9272k;
                                    C2558b0 c2558b0M4572e = C2556a0.m4572e(fileM4757v);
                                    long jM1535u = 10485760;
                                    try {
                                        File file = c2558b0M4572e.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jM1535u = AbstractC0714c.m1535u((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    C1496i c1496i2 = new C1496i(jM1535u, executorC2053d, c2592w, c2558b0M4572e);
                                    C2541k.f9232b = c1496i2;
                                    c1496i = c1496i2;
                                }
                            } finally {
                            }
                        }
                        return c1496i;
                }
            }
        });
        C1690g c1690g3 = new C1690g(new C0661f(i4));
        C1921p c1921p = C1921p.f7187j;
        return new C1163h(context2, c2291c, c1690g, c1690g2, c1690g3, new C1158c(c1921p, c1921p, c1921p, c1921p, c1921p), (C2540j) c0073c.f326m);
    }

    /* renamed from: y */
    public static final C1688e m1539y(Throwable th) {
        AbstractC2980h.m5136e("exception", th);
        return new C1688e(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0853d[] m1540z(String str) {
        int i;
        String strTrim;
        float[] fArrM1536v;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i8 = 0;
        int i9 = 1;
        while (i9 < str.length()) {
            while (i9 < str.length()) {
                char cCharAt = str.charAt(i9);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i9++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i9++;
                } else {
                    strTrim = str.substring(i8, i9).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i4) == 'z' || strTrim.charAt(i4) == 'Z') {
                            fArrM1536v = new float[i4];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i10 = i4;
                                int i11 = 1;
                                while (i11 < length) {
                                    int i12 = i4;
                                    int i13 = i12;
                                    int i14 = i13;
                                    int i15 = i14;
                                    for (int i16 = i11; i16 < strTrim.length(); i16++) {
                                        char cCharAt2 = strTrim.charAt(i16);
                                        if (cCharAt2 == ' ') {
                                            i12 = 0;
                                            i14 = 1;
                                            if (i14 != 0) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i16 != i11 && i12 == 0) {
                                                            i12 = 0;
                                                            i14 = 1;
                                                            i15 = 1;
                                                            break;
                                                        }
                                                        i12 = 0;
                                                        break;
                                                    case '.':
                                                        if (i13 == 0) {
                                                            i12 = 0;
                                                            i13 = 1;
                                                            break;
                                                        } else {
                                                            i12 = 0;
                                                            i14 = 1;
                                                            i15 = 1;
                                                            break;
                                                        }
                                                    default:
                                                        i12 = 0;
                                                        break;
                                                }
                                            } else {
                                                i12 = 1;
                                            }
                                            if (i14 != 0) {
                                            }
                                        }
                                        if (i11 < i16) {
                                            fArr[i10] = Float.parseFloat(strTrim.substring(i11, i16));
                                            i10++;
                                        }
                                        i11 = i15 == 0 ? i16 : i16 + 1;
                                        i4 = 0;
                                    }
                                    if (i11 < i16) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    i4 = 0;
                                }
                                fArrM1536v = m1536v(fArr, i10);
                                i4 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(AbstractC0008a1.m17m("error in parsing \"", strTrim, "\""), e);
                            }
                        }
                        arrayList.add(new C0853d(strTrim.charAt(i4), fArrM1536v));
                    }
                    i8 = i9;
                    i9++;
                    i4 = 0;
                }
            }
            strTrim = str.substring(i8, i9).trim();
            if (!strTrim.isEmpty()) {
            }
            i8 = i9;
            i9++;
            i4 = 0;
        }
        if (i9 - i8 != 1 || i8 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C0853d(str.charAt(i8), new float[0]));
        }
        return (C0853d[]) arrayList.toArray(new C0853d[i]);
    }

    /* renamed from: U */
    public abstract View mo175U(int i);

    /* renamed from: V */
    public abstract boolean mo176V();
}
