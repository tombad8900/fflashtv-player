package p171t5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0247v0;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p002a1.AbstractC0008a1;
import p015b4.C0572f;
import p037e0.C0853d;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p066h4.C1189w;
import p069h7.AbstractC1206h;
import p115n1.InterfaceC1988o;
import p176u2.C2459d;
import p178u4.AbstractC2466a;
import p189v7.AbstractC2585p;
import p189v7.C2558b0;
import p192w1.C2600b;
import p192w1.InterfaceC2599a;
import p210y3.InterfaceC2800d;
import p211y5.C2838y;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2436a implements InterfaceC2599a {
    /* renamed from: a */
    public static boolean m4329a(InterfaceC1988o interfaceC1988o) {
        C1132w c1132w = new C1132w(8);
        int i = C2459d.m4436a(interfaceC1988o, c1132w).f9037a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
        c1132w.m2513G(0);
        int iM2521g = c1132w.m2521g();
        if (iM2521g == 1463899717) {
            return true;
        }
        AbstractC1101a.m2364o("WavHeaderReader", "Unsupported form type: " + iM2521g);
        return false;
    }

    /* renamed from: b */
    public static final void m4330b(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0715d.m1557e(th, th2);
            }
        }
    }

    /* renamed from: e */
    public static final void m4331e(AbstractC2585p abstractC2585p, C2558b0 c2558b0) throws IOException {
        try {
            IOException iOException = null;
            for (C2558b0 c2558b02 : abstractC2585p.mo3159g(c2558b0)) {
                try {
                    if (abstractC2585p.m4679h(c2558b02).f9090c) {
                        m4331e(abstractC2585p, c2558b02);
                    }
                    abstractC2585p.mo3158d(c2558b02);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: g */
    public static Set m4332g() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* renamed from: h */
    public static float m4333h(String[] strArr, int i) throws NumberFormatException {
        float f8 = Float.parseFloat(strArr[i]);
        if (f8 >= 0.0f && f8 <= 1.0f) {
            return f8;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f8);
    }

    /* renamed from: i */
    public static int m4334i(List list, InputStream inputStream, C0572f c0572f) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1189w(inputStream, c0572f);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo2597d = ((InterfaceC2800d) list.get(i)).mo2597d(inputStream, c0572f);
                if (iMo2597d != -1) {
                    return iMo2597d;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static ImageHeaderParser$ImageType m4335j(List list, InputStream inputStream, C0572f c0572f) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1189w(inputStream, c0572f);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2596c = ((InterfaceC2800d) list.get(i)).mo2596c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo2596c != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2596c;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: k */
    public static ImageHeaderParser$ImageType m4336k(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2594a = ((InterfaceC2800d) list.get(i)).mo2594a(byteBuffer);
                AtomicReference atomicReference = AbstractC2466a.f9048a;
                if (imageHeaderParser$ImageTypeMo2594a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2594a;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC2466a.f9048a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: l */
    public static String m4337l(String str, String str2) {
        AbstractC2980h.m5136e("size", str2);
        if (str != null) {
            if (AbstractC1206h.m2630D0(str) || str.equals("null")) {
                str = null;
            }
            if (str != null) {
                return AbstractC0008a1.m17m("https://image.tmdb.org/t/p/", str2, str);
            }
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m4338m(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: n */
    public static boolean m4339n(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: o */
    public static TypedValue m4340o(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m4341p(Resources.Theme theme, int i, boolean z7) {
        TypedValue typedValueM4340o = m4340o(theme, i);
        return (typedValueM4340o == null || typedValueM4340o.type != 18) ? z7 : typedValueM4340o.data != 0;
    }

    /* renamed from: q */
    public static int m4342q(Context context, int i, int i4) {
        TypedValue typedValueM4340o = m4340o(context.getTheme(), i);
        return (typedValueM4340o == null || typedValueM4340o.type != 16) ? i4 : typedValueM4340o.data;
    }

    /* renamed from: r */
    public static TimeInterpolator m4343r(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m4338m(strValueOf, "cubic-bezier") && !m4338m(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m4338m(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(m4333h(strArrSplit, 0), m4333h(strArrSplit, 1), m4333h(strArrSplit, 2), m4333h(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m4338m(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            C0853d.m2026b(AbstractC0714c.m1540z(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e);
        }
    }

    /* renamed from: s */
    public static TypedValue m4344s(Context context, int i, String str) {
        TypedValue typedValueM4340o = m4340o(context.getTheme(), i);
        if (typedValueM4340o != null) {
            return typedValueM4340o;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: t */
    public static TypedValue m4345t(View view, int i) {
        return m4344s(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: u */
    public static C2459d m4346u(int i, InterfaceC1988o interfaceC1988o, C1132w c1132w) throws C0247v0 {
        C2459d c2459dM4436a = C2459d.m4436a(interfaceC1988o, c1132w);
        while (true) {
            int i4 = c2459dM4436a.f9037a;
            if (i4 == i) {
                return c2459dM4436a;
            }
            AbstractC0008a1.m23s("Ignoring unknown WAV chunk: ", i4, "WavHeaderReader");
            long j = c2459dM4436a.f9038b;
            long j8 = 8 + j;
            if (j % 2 != 0) {
                j8 = 9 + j;
            }
            if (j8 > 2147483647L) {
                throw C0247v0.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + i4);
            }
            interfaceC1988o.mo3861h((int) j8);
            c2459dM4436a = C2459d.m4436a(interfaceC1988o, c1132w);
        }
    }

    /* renamed from: c */
    public C0241t0 m4347c(C2600b c2600b) {
        ByteBuffer byteBuffer = c2600b.data;
        byteBuffer.getClass();
        AbstractC1101a.m2353d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo247d(c2600b, byteBuffer);
    }

    /* renamed from: d */
    public abstract C0241t0 mo247d(C2600b c2600b, ByteBuffer byteBuffer);

    /* renamed from: f */
    public abstract void mo4348f(C2838y c2838y, float f8, float f9);
}
