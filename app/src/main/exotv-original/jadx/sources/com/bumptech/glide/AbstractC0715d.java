package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.media3.common.AbstractC0244u0;
import com.bumptech.glide.load.data.C0731h;
import com.bumptech.glide.load.data.C0736m;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p002a1.C0016e;
import p002a1.C0036o;
import p005a4.C0073c;
import p005a4.C0087j;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;
import p022c3.AbstractC0636a;
import p023c4.C0641e;
import p029d0.C0789e;
import p032d3.AbstractC0840y;
import p041e4.C0879a;
import p041e4.C0880a0;
import p041e4.C0884c0;
import p041e4.C0890g;
import p041e4.C0891h;
import p041e4.C0908y;
import p050f4.C0941b;
import p066h4.C1164a;
import p066h4.C1165a0;
import p066h4.C1166b;
import p066h4.C1169c0;
import p066h4.C1171e;
import p066h4.C1172f;
import p066h4.C1178l;
import p066h4.C1181o;
import p066h4.C1185s;
import p075i6.AbstractC1276c;
import p075i6.C1275b;
import p076i7.AbstractC1327r;
import p079j0.C1482j;
import p083j4.C1498b;
import p083j4.C1499c;
import p083j4.C1501e;
import p085j6.AbstractC1524n;
import p085j6.C1514d;
import p085j6.C1523m;
import p089k1.InterfaceC1564h;
import p090k2.C1584b;
import p100l4.C1673a;
import p100l4.C1674b;
import p100l4.C1680h;
import p104m.C1787y1;
import p105m0.InterfaceC1846s0;
import p109m4.C1898c;
import p109m4.C1899d;
import p111m6.AbstractC1909d;
import p112m7.C1930f;
import p119n6.C2023c;
import p137p6.C2223d;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2224e;
import p137p6.InterfaceC2227h;
import p140q0.AbstractC2242b;
import p140q0.AbstractC2243c;
import p154r6.AbstractC2320c;
import p172t6.AbstractC2437a;
import p180u6.AbstractC2480a;
import p203x3.C2757d;
import p210y3.InterfaceC2806j;
import p211y5.C2819f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.d */
/* loaded from: classes.dex */
public abstract class AbstractC0715d implements InterfaceC1846s0 {

    /* renamed from: a */
    public static long f2787a = 0;

    /* renamed from: b */
    public static Method f2788b = null;

    /* renamed from: c */
    public static boolean f2789c = true;

    /* renamed from: d */
    public static Field f2790d;

    /* renamed from: e */
    public static boolean f2791e;

    /* renamed from: f */
    public static Field f2792f;

    /* renamed from: g */
    public static boolean f2793g;

    /* renamed from: h */
    public static Class f2794h;

    /* renamed from: i */
    public static boolean f2795i;

    /* renamed from: j */
    public static Field f2796j;

    /* renamed from: k */
    public static boolean f2797k;

    /* renamed from: l */
    public static Field f2798l;

    /* renamed from: m */
    public static boolean f2799m;

    public AbstractC0715d() {
        new ConcurrentHashMap();
    }

    /* renamed from: C */
    public static float m1541C(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2243c.m4016b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: D */
    public static Drawable m1542D(Context context, int i) {
        return C1787y1.m3477b().m3481d(context, i);
    }

    /* renamed from: E */
    public static long m1543E(double d8) {
        if (!m1549R(d8)) {
            throw new IllegalArgumentException("not a normal value");
        }
        int exponent = Math.getExponent(d8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d8) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* renamed from: M */
    public static int m1544M(int[] iArr, int i, int i4, int i8) {
        while (i4 < i8) {
            if (iArr[i4] == i) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1545N(String str) {
        if (str == null) {
            return -1;
        }
        String strM687p = AbstractC0244u0.m687p(str);
        strM687p.getClass();
        switch (strM687p) {
        }
        return -1;
    }

    /* renamed from: O */
    public static int m1546O(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* renamed from: P */
    public static InterfaceC2222c m1547P(InterfaceC2222c interfaceC2222c) {
        AbstractC2980h.m5136e("<this>", interfaceC2222c);
        AbstractC2320c abstractC2320c = interfaceC2222c instanceof AbstractC2320c ? (AbstractC2320c) interfaceC2222c : null;
        if (abstractC2320c == null || (interfaceC2222c = abstractC2320c.f8132l) != null) {
            return interfaceC2222c;
        }
        InterfaceC2227h interfaceC2227h = abstractC2320c.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        InterfaceC2224e interfaceC2224e = (InterfaceC2224e) interfaceC2227h.mo2760b(C2223d.f7746j);
        InterfaceC2222c c1930f = interfaceC2224e != null ? new C1930f((AbstractC1327r) interfaceC2224e, abstractC2320c) : abstractC2320c;
        abstractC2320c.f8132l = c1930f;
        return c1930f;
    }

    /* renamed from: Q */
    public static boolean m1548Q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0636a.m1419a();
        }
        try {
            if (f2788b == null) {
                f2787a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2788b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2788b.invoke(null, Long.valueOf(f2787a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: R */
    public static boolean m1549R(double d8) {
        return Math.getExponent(d8) <= 1023;
    }

    /* renamed from: S */
    public static String m1550S(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i4] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i8 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i8)) != -1) {
            sb.append((CharSequence) str, i8, iIndexOf);
            sb.append(objArr[i]);
            i8 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i8, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i9 = i + 1; i9 < objArr.length; i9++) {
                sb.append(", ");
                sb.append(objArr[i9]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: T */
    public static List m1551T(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC2980h.m5135d("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    /* renamed from: U */
    public static void m1552U(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: V */
    public static float m1553V(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2243c.m4017c(edgeEffect, f8, f9);
        }
        AbstractC2242b.m4014a(edgeEffect, f8, f9);
        return f8;
    }

    /* renamed from: a0 */
    public static void m1554a0(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m1567o0(cls, e);
                throw null;
            } catch (InstantiationException e8) {
                m1567o0(cls, e8);
                throw null;
            } catch (NoSuchMethodException e9) {
                m1567o0(cls, e9);
                throw null;
            } catch (InvocationTargetException e10) {
                m1567o0(cls, e10);
                throw null;
            }
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    /* renamed from: d */
    public static final String m1555d(Object[] objArr, int i, int i4, AbstractC1909d abstractC1909d) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i8];
            if (obj == abstractC1909d) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    /* renamed from: d0 */
    public static final void m1556d0(Object[] objArr, int i, int i4) {
        AbstractC2980h.m5136e("<this>", objArr);
        while (i < i4) {
            objArr[i] = null;
            i++;
        }
    }

    /* renamed from: e */
    public static void m1557e(Throwable th, Throwable th2) {
        AbstractC2980h.m5136e("<this>", th);
        AbstractC2980h.m5136e("exception", th2);
        if (th != th2) {
            Integer num = AbstractC2480a.f9075a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC2437a.f8789a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* renamed from: e0 */
    public static int m1558e0(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d8 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d8 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d8);
    }

    /* renamed from: f */
    public static List m1559f(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new C1275b(0, iArr.length, iArr);
    }

    /* renamed from: f0 */
    public static int m1560f0(float f8) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f8);
    }

    /* renamed from: g */
    public static void m1561g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* renamed from: g0 */
    public static int m1562g0(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: h */
    public static C2023c m1563h(C2023c c2023c) {
        c2023c.m3904f();
        c2023c.f7466l = true;
        return c2023c.f7465k > 0 ? c2023c : C2023c.f7463m;
    }

    /* renamed from: k0 */
    public static void m1564k0(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: l */
    public static void m1565l(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* renamed from: m */
    public static int m1566m(long j) {
        int i = (int) j;
        AbstractC0714c.m1525k(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: o0 */
    public static void m1567o0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* renamed from: p */
    public static void m1568p(InterfaceC1564h interfaceC1564h) {
        if (interfaceC1564h != null) {
            try {
                interfaceC1564h.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: p0 */
    public static int[] m1569p0(Collection collection) {
        if (collection instanceof C1275b) {
            C1275b c1275b = (C1275b) collection;
            return Arrays.copyOfRange(c1275b.f5301j, c1275b.f5302k, c1275b.f5303l);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* renamed from: q */
    public static C0719h m1570q(ComponentCallbacks2C0713b componentCallbacks2C0713b, ArrayList arrayList) {
        Class cls;
        InterfaceC2806j c1171e;
        InterfaceC2806j c1164a;
        InterfaceC0567a interfaceC0567a;
        int i;
        ContentResolver contentResolver;
        Class cls2;
        InterfaceC0567a interfaceC0567a2 = componentCallbacks2C0713b.f2774j;
        C0572f c0572f = componentCallbacks2C0713b.f2777m;
        C0716e c0716e = componentCallbacks2C0713b.f2776l;
        Context applicationContext = c0716e.getApplicationContext();
        C0036o c0036o = c0716e.f2808h;
        C0719h c0719h = new C0719h();
        Class<InputStream> cls3 = InputStream.class;
        C1178l c1178l = new C1178l();
        C1898c c1898c = c0719h.f2822g;
        synchronized (c1898c) {
            c1898c.f7107a.add(c1178l);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 27) {
            C1185s c1185s = new C1185s();
            C1898c c1898c2 = c0719h.f2822g;
            synchronized (c1898c2) {
                cls = AssetFileDescriptor.class;
                c1898c2.f7107a.add(c1185s);
            }
        } else {
            cls = AssetFileDescriptor.class;
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM1615e = c0719h.m1615e();
        C1673a c1673a = new C1673a(applicationContext, arrayListM1615e, interfaceC0567a2, c0572f);
        C1169c0 c1169c0 = new C1169c0(interfaceC0567a2, new C2819f(26));
        C1181o c1181o = new C1181o(c0719h.m1615e(), resources.getDisplayMetrics(), interfaceC0567a2, c0572f);
        if (i4 < 28 || !((Map) c0036o.f143k).containsKey(AbstractC0714c.class)) {
            c1171e = new C1171e(0, c1181o);
            c1164a = new C1164a(c1181o, 2, c0572f);
        } else {
            c1164a = new C1172f(1);
            c1171e = new C1172f(0);
        }
        if (i4 >= 28) {
            i = i4;
            interfaceC0567a = interfaceC0567a2;
            c0719h.m1614d("Animation", InputStream.class, Drawable.class, new C1498b(new C1499c(arrayListM1615e, c0572f), 1));
            c0719h.m1614d("Animation", ByteBuffer.class, Drawable.class, new C1498b(new C1499c(arrayListM1615e, c0572f), 0));
        } else {
            interfaceC0567a = interfaceC0567a2;
            i = i4;
        }
        C1501e c1501e = new C1501e(applicationContext);
        C1166b c1166b = new C1166b(c0572f);
        C0087j c0087j = new C0087j(4, false);
        C1899d c1899d = new C1899d(1);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        c0719h.m1612b(ByteBuffer.class, new C0880a0(5));
        c0719h.m1612b(InputStream.class, new C0036o(18, c0572f));
        c0719h.m1614d("Bitmap", ByteBuffer.class, Bitmap.class, c1171e);
        c0719h.m1614d("Bitmap", InputStream.class, Bitmap.class, c1164a);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls2 = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            cls2 = ParcelFileDescriptor.class;
            c0719h.m1614d("Bitmap", cls2, Bitmap.class, new C1171e(1, c1181o));
        }
        InterfaceC0567a interfaceC0567a3 = interfaceC0567a;
        c0719h.m1614d("Bitmap", cls, Bitmap.class, new C1169c0(interfaceC0567a3, new C2819f(23)));
        c0719h.m1614d("Bitmap", cls2, Bitmap.class, c1169c0);
        C0880a0 c0880a0 = C0880a0.f3884k;
        c0719h.m1611a(Bitmap.class, Bitmap.class, c0880a0);
        c0719h.m1614d("Bitmap", Bitmap.class, Bitmap.class, new C1165a0(0));
        c0719h.m1613c(Bitmap.class, c1166b);
        c0719h.m1614d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1164a(resources, c1171e));
        c0719h.m1614d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1164a(resources, c1164a));
        c0719h.m1614d("BitmapDrawable", cls2, BitmapDrawable.class, new C1164a(resources, c1169c0));
        c0719h.m1613c(BitmapDrawable.class, new C0016e(interfaceC0567a3, 14, c1166b));
        c0719h.m1614d("Animation", InputStream.class, C1674b.class, new C1680h(arrayListM1615e, c1673a, c0572f));
        c0719h.m1614d("Animation", ByteBuffer.class, C1674b.class, c1673a);
        c0719h.m1613c(C1674b.class, new C1584b(3));
        c0719h.m1611a(C2757d.class, C2757d.class, c0880a0);
        c0719h.m1614d("Bitmap", C2757d.class, Bitmap.class, new C1171e(2, interfaceC0567a3));
        c0719h.m1614d("legacy_append", Uri.class, Drawable.class, c1501e);
        c0719h.m1614d("legacy_append", Uri.class, Bitmap.class, new C1164a(c1501e, 1, interfaceC0567a3));
        c0719h.m1618h(new C0731h(2));
        c0719h.m1611a(File.class, ByteBuffer.class, new C0880a0(6));
        c0719h.m1611a(File.class, InputStream.class, new C0890g(new C0880a0(9)));
        c0719h.m1614d("legacy_append", File.class, File.class, new C1165a0(2));
        c0719h.m1611a(File.class, cls2, new C0890g(new C0880a0(8)));
        c0719h.m1611a(File.class, File.class, c0880a0);
        c0719h.m1618h(new C0736m(c0572f));
        if (!"robolectric".equals(str)) {
            c0719h.m1618h(new C0731h(1));
        }
        C0641e c0641e = new C0641e(applicationContext, 3);
        C0641e c0641e2 = new C0641e(applicationContext, 1);
        C0641e c0641e3 = new C0641e(applicationContext, 2);
        Class cls4 = Integer.TYPE;
        c0719h.m1611a(cls4, InputStream.class, c0641e);
        c0719h.m1611a(Integer.class, InputStream.class, c0641e);
        Class cls5 = cls;
        c0719h.m1611a(cls4, cls5, c0641e2);
        c0719h.m1611a(Integer.class, cls5, c0641e2);
        c0719h.m1611a(cls4, Drawable.class, c0641e3);
        c0719h.m1611a(Integer.class, Drawable.class, c0641e3);
        c0719h.m1611a(Uri.class, InputStream.class, new C0641e(applicationContext, 6));
        c0719h.m1611a(Uri.class, cls5, new C0641e(applicationContext, 5));
        C0908y c0908y = new C0908y(resources, 2);
        C0908y c0908y2 = new C0908y(resources, 0);
        C0908y c0908y3 = new C0908y(resources, 1);
        c0719h.m1611a(Integer.class, Uri.class, c0908y);
        c0719h.m1611a(cls4, Uri.class, c0908y);
        c0719h.m1611a(Integer.class, cls5, c0908y2);
        c0719h.m1611a(cls4, cls5, c0908y2);
        c0719h.m1611a(Integer.class, InputStream.class, c0908y3);
        c0719h.m1611a(cls4, InputStream.class, c0908y3);
        c0719h.m1611a(String.class, InputStream.class, new C0036o(16));
        c0719h.m1611a(Uri.class, InputStream.class, new C0036o(16));
        c0719h.m1611a(String.class, InputStream.class, new C0880a0(13));
        c0719h.m1611a(String.class, cls2, new C0880a0(12));
        c0719h.m1611a(String.class, cls5, new C0880a0(11));
        c0719h.m1611a(Uri.class, InputStream.class, new C0879a(applicationContext.getAssets(), 1));
        c0719h.m1611a(Uri.class, cls5, new C0879a(applicationContext.getAssets(), 0));
        c0719h.m1611a(Uri.class, InputStream.class, new C0641e(applicationContext, 7));
        c0719h.m1611a(Uri.class, InputStream.class, new C0641e(applicationContext, 8));
        if (i >= 29) {
            c0719h.m1611a(Uri.class, InputStream.class, new C0941b(applicationContext, cls3));
            c0719h.m1611a(Uri.class, cls2, new C0941b(applicationContext, cls2));
        }
        ContentResolver contentResolver3 = contentResolver;
        c0719h.m1611a(Uri.class, InputStream.class, new C0884c0(contentResolver3, 2));
        c0719h.m1611a(Uri.class, cls2, new C0884c0(contentResolver3, 1));
        c0719h.m1611a(Uri.class, cls5, new C0884c0(contentResolver3, 0));
        c0719h.m1611a(Uri.class, InputStream.class, new C0880a0(14));
        c0719h.m1611a(URL.class, InputStream.class, new C2819f(19));
        c0719h.m1611a(Uri.class, File.class, new C0641e(applicationContext, 4));
        c0719h.m1611a(C0891h.class, InputStream.class, new C0036o(21));
        c0719h.m1611a(byte[].class, ByteBuffer.class, new C0880a0(2));
        c0719h.m1611a(byte[].class, InputStream.class, new C0880a0(4));
        c0719h.m1611a(Uri.class, Uri.class, c0880a0);
        c0719h.m1611a(Drawable.class, Drawable.class, c0880a0);
        c0719h.m1614d("legacy_append", Drawable.class, Drawable.class, new C1165a0(1));
        c0719h.m1619i(Bitmap.class, BitmapDrawable.class, new C0908y(resources, 3));
        c0719h.m1619i(Bitmap.class, byte[].class, c0087j);
        c0719h.m1619i(Drawable.class, byte[].class, new C0073c(interfaceC0567a3, c0087j, c1899d, 17));
        c0719h.m1619i(C1674b.class, byte[].class, c1899d);
        C1169c0 c1169c02 = new C1169c0(interfaceC0567a3, new C2819f(24));
        c0719h.m1614d("legacy_append", ByteBuffer.class, Bitmap.class, c1169c02);
        c0719h.m1614d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1164a(resources, c1169c02));
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return c0719h;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer m1571r0(String str) {
        byte b7;
        Integer num;
        Long lValueOf;
        byte b8;
        str.getClass();
        if (str.isEmpty()) {
            lValueOf = 0;
            num = null;
        } else {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i4 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < '\u0080') {
                    b7 = AbstractC1276c.f5304a[cCharAt];
                } else {
                    byte[] bArr = AbstractC1276c.f5304a;
                    b7 = -1;
                }
                if (b7 < 0 || b7 >= 10) {
                    num = null;
                    lValueOf = num;
                } else {
                    long j = -b7;
                    long j8 = 10;
                    long j9 = Long.MIN_VALUE / j8;
                    while (true) {
                        if (i4 < str.length()) {
                            int i8 = i4 + 1;
                            char cCharAt2 = str.charAt(i4);
                            if (cCharAt2 < '\u0080') {
                                b8 = AbstractC1276c.f5304a[cCharAt2];
                            } else {
                                byte[] bArr2 = AbstractC1276c.f5304a;
                                b8 = -1;
                            }
                            if (b8 < 0 || b8 >= 10 || j < j9) {
                                break;
                            }
                            long j10 = j * j8;
                            num = null;
                            long j11 = b8;
                            if (j10 < j11 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j10 - j11;
                            i4 = i8;
                        } else {
                            num = null;
                            if (i != 0) {
                                lValueOf = Long.valueOf(j);
                            } else {
                                if (j == Long.MIN_VALUE) {
                                    break;
                                }
                                lValueOf = Long.valueOf(-j);
                            }
                        }
                    }
                    num = null;
                    lValueOf = num;
                }
            }
        }
        return (lValueOf == 0 || lValueOf.longValue() != ((long) lValueOf.intValue())) ? num : Integer.valueOf(lValueOf.intValue());
    }

    /* renamed from: w */
    public static C2023c m1572w() {
        return new C2023c(10);
    }

    /* renamed from: y */
    public static Object m1573y(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: z */
    public static int m1574z(byte[] bArr) {
        boolean z7 = bArr.length >= 4;
        int length = bArr.length;
        if (!z7) {
            throw new IllegalArgumentException(m1550S("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* renamed from: A */
    public abstract C1514d mo1575A(AbstractC1524n abstractC1524n);

    /* renamed from: B */
    public abstract C1523m mo1576B(AbstractC1524n abstractC1524n);

    /* renamed from: F */
    public abstract int mo1577F(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: G */
    public float mo1578G(View view) {
        if (f2789c) {
            try {
                return AbstractC0840y.m2009a(view);
            } catch (NoSuchMethodError unused) {
                f2789c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: H */
    public abstract int mo1579H();

    /* renamed from: I */
    public int mo1580I(View view) {
        return 0;
    }

    /* renamed from: J */
    public abstract ViewPropertyAnimator mo1581J(View view, int i);

    /* renamed from: K */
    public int mo1582K() {
        return 0;
    }

    /* renamed from: L */
    public abstract void mo1583L(int i);

    /* renamed from: W */
    public void mo1584W(View view, int i) {
    }

    /* renamed from: X */
    public abstract void mo1585X(int i);

    /* renamed from: Y */
    public abstract void mo1586Y(View view, int i, int i4);

    /* renamed from: Z */
    public abstract void mo1587Z(View view, float f8, float f9);

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: a */
    public void mo1588a() {
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: b */
    public void mo1589b() {
    }

    /* renamed from: b0 */
    public abstract void mo1590b0(C1523m c1523m, C1523m c1523m2);

    /* renamed from: c0 */
    public abstract void mo1591c0(C1523m c1523m, Thread thread);

    /* renamed from: h0 */
    public void mo1592h0(boolean z7) {
    }

    /* renamed from: i */
    public abstract boolean mo1593i(AbstractC1524n abstractC1524n, C1514d c1514d, C1514d c1514d2);

    /* renamed from: i0 */
    public abstract void mo1594i0(boolean z7);

    /* renamed from: j */
    public abstract boolean mo1595j(AbstractC1524n abstractC1524n, Object obj, Object obj2);

    /* renamed from: j0 */
    public abstract void mo1596j0();

    /* renamed from: k */
    public abstract boolean mo1597k(AbstractC1524n abstractC1524n, C1523m c1523m, C1523m c1523m2);

    /* renamed from: l0 */
    public void mo1598l0(View view, float f8) {
        if (f2789c) {
            try {
                AbstractC0840y.m2010b(view, f8);
                return;
            } catch (NoSuchMethodError unused) {
                f2789c = false;
            }
        }
        view.setAlpha(f8);
    }

    /* renamed from: m0 */
    public void mo1599m0(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f2791e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2790d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2791e = true;
        }
        Field field = f2790d;
        if (field != null) {
            try {
                f2790d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: n */
    public abstract int mo1600n(View view, int i);

    /* renamed from: n0 */
    public abstract void mo1601n0(int i);

    /* renamed from: o */
    public abstract int mo1602o(View view, int i);

    /* renamed from: q0 */
    public abstract boolean mo1603q0(View view, int i);

    /* renamed from: r */
    public abstract Typeface mo1604r(Context context, C0789e c0789e, Resources resources, int i);

    /* renamed from: s */
    public abstract Typeface mo1605s(Context context, C1482j[] c1482jArr, int i);

    /* renamed from: t */
    public Typeface mo1606t(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* renamed from: u */
    public Typeface mo1607u(Context context, InputStream inputStream) {
        File fileM426v = AbstractC0120b.m426v(context);
        if (fileM426v == null) {
            return null;
        }
        try {
            if (AbstractC0120b.m420p(fileM426v, inputStream)) {
                return Typeface.createFromFile(fileM426v.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM426v.delete();
        }
    }

    /* renamed from: v */
    public Typeface mo1608v(Context context, Resources resources, int i, String str, int i4) {
        File fileM426v = AbstractC0120b.m426v(context);
        if (fileM426v == null) {
            return null;
        }
        try {
            if (AbstractC0120b.m419o(fileM426v, resources, i)) {
                return Typeface.createFromFile(fileM426v.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM426v.delete();
        }
    }

    /* renamed from: x */
    public C1482j mo1609x(C1482j[] c1482jArr, int i) {
        new C2819f(18);
        int i4 = (i & 1) == 0 ? 400 : 700;
        boolean z7 = (i & 2) != 0;
        C1482j c1482j = null;
        int i8 = Integer.MAX_VALUE;
        for (C1482j c1482j2 : c1482jArr) {
            int iAbs = (Math.abs(c1482j2.f5711c - i4) * 2) + (c1482j2.f5712d == z7 ? 0 : 1);
            if (c1482j == null || i8 > iAbs) {
                c1482j = c1482j2;
                i8 = iAbs;
            }
        }
        return c1482j;
    }
}
