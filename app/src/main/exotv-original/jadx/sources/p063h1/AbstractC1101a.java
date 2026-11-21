package p063h1;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.C0216l;
import com.bumptech.glide.AbstractC0714c;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import okhttp3.C2181z;
import org.xmlpull.v1.XmlPullParser;
import p002a1.AbstractC0008a1;
import p043e6.InterfaceC0916d;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0981l1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1101a {

    /* renamed from: a */
    public static final Object f4711a = new Object();

    /* renamed from: A */
    public static String m2343A(StringBuilder sb, int i, int i4) {
        int i8;
        int iLastIndexOf;
        if (i >= i4) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i9 = i;
        int i10 = i9;
        while (i9 <= i4) {
            if (i9 == i4) {
                i8 = i9;
            } else if (sb.charAt(i9) == '/') {
                i8 = i9 + 1;
            } else {
                i9++;
            }
            int i11 = i10 + 1;
            if (i9 == i11 && sb.charAt(i10) == '.') {
                sb.delete(i10, i8);
                i4 -= i8 - i10;
            } else {
                if (i9 == i10 + 2 && sb.charAt(i10) == '.' && sb.charAt(i11) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i10 - 2) + 1;
                    int i12 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i12, i8);
                    i4 -= i8 - i12;
                } else {
                    iLastIndexOf = i9 + 1;
                }
                i10 = iLastIndexOf;
            }
            i9 = i10;
        }
        return sb.toString();
    }

    /* renamed from: B */
    public static String m2344B(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = C2181z.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = C2181z.FRAGMENT_ENCODE_SET;
        }
        int[] iArrM2370u = m2370u(str2);
        if (iArrM2370u[0] != -1) {
            sb.append(str2);
            m2343A(sb, iArrM2370u[1], iArrM2370u[2]);
            return sb.toString();
        }
        int[] iArrM2370u2 = m2370u(str);
        if (iArrM2370u[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM2370u2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM2370u[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM2370u2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrM2370u[1];
        if (i != 0) {
            int i4 = iArrM2370u2[0] + 1;
            sb.append((CharSequence) str, 0, i4);
            sb.append(str2);
            return m2343A(sb, iArrM2370u[1] + i4, i4 + iArrM2370u[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrM2370u2[1]);
            sb.append(str2);
            int i8 = iArrM2370u2[1];
            return m2343A(sb, i8, iArrM2370u[2] + i8);
        }
        int i9 = iArrM2370u2[0] + 2;
        int i10 = iArrM2370u2[1];
        if (i9 >= i10 || i10 != iArrM2370u2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM2370u2[2] - 1);
            int i11 = iLastIndexOf == -1 ? iArrM2370u2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return m2343A(sb, iArrM2370u2[1], i11 + iArrM2370u[2]);
        }
        sb.append((CharSequence) str, 0, i10);
        sb.append('/');
        sb.append(str2);
        int i12 = iArrM2370u2[1];
        return m2343A(sb, i12, iArrM2370u[2] + i12 + 1);
    }

    /* renamed from: C */
    public static Uri m2345C(String str, String str2) {
        return Uri.parse(m2344B(str, str2));
    }

    /* renamed from: D */
    public static void m2346D(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC0008a1.m12h(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: E */
    public static ArrayList m2347E(Collection collection, InterfaceC0916d interfaceC0916d) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) interfaceC0916d.apply(it.next()));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static void m2348F(String str, String str2) {
        synchronized (f4711a) {
            Log.w(str, m2350a(str2, null));
        }
    }

    /* renamed from: G */
    public static void m2349G(String str, String str2, Throwable th) {
        synchronized (f4711a) {
            Log.w(str, m2350a(str2, th));
        }
    }

    /* renamed from: a */
    public static String m2350a(String str, Throwable th) {
        String strM2369t = m2369t(th);
        if (TextUtils.isEmpty(strM2369t)) {
            return str;
        }
        return str + "\n  " + strM2369t.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m2351b(int i, int i4) throws C1119j {
        GLES20.glBindTexture(i, i4);
        m2354e();
        GLES20.glTexParameteri(i, 10240, 9729);
        m2354e();
        GLES20.glTexParameteri(i, 10241, 9729);
        m2354e();
        GLES20.glTexParameteri(i, 10242, 33071);
        m2354e();
        GLES20.glTexParameteri(i, 10243, 33071);
        m2354e();
    }

    /* renamed from: c */
    public static void m2352c(String str, boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: d */
    public static void m2353d(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m2354e() throws C1119j {
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new C1119j(sb.toString());
        }
    }

    /* renamed from: f */
    public static void m2355f(String str, boolean z7) throws C1119j {
        if (!z7) {
            throw new C1119j(str);
        }
    }

    /* renamed from: g */
    public static void m2356g(int i, int i4) {
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: h */
    public static void m2357h(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: i */
    public static void m2358i(String str, boolean z7) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* renamed from: j */
    public static void m2359j(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public static void m2360k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: l */
    public static void m2361l(String str, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: m */
    public static FloatBuffer m2362m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: n */
    public static void m2363n(String str, String str2) {
        synchronized (f4711a) {
            Log.d(str, m2350a(str2, null));
        }
    }

    /* renamed from: o */
    public static void m2364o(String str, String str2) {
        synchronized (f4711a) {
            Log.e(str, m2350a(str2, null));
        }
    }

    /* renamed from: p */
    public static void m2365p(String str, String str2, Throwable th) {
        synchronized (f4711a) {
            Log.e(str, m2350a(str2, th));
        }
    }

    /* renamed from: q */
    public static C0981l1 m2366q(InterfaceC0916d interfaceC0916d, List list) {
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            c0974j0M2164i.m2141a(interfaceC0916d.apply(bundle));
        }
        return c0974j0M2164i.m2159f();
    }

    /* renamed from: r */
    public static String m2367r(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: s */
    public static String m2368s(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !AbstractC0714c.m1493F(scheme, scheme2)) : scheme2 == null) {
            String authority = uri.getAuthority();
            String authority2 = uri2.getAuthority();
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(authority, authority2)) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                int i4 = 0;
                for (int i8 = 0; i8 < iMin && pathSegments.get(i8).equals(pathSegments2.get(i8)); i8++) {
                    i4++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i9 = i4; i9 < pathSegments.size(); i9++) {
                    sb.append("../");
                }
                while (i4 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i4));
                    if (i4 < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i4++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    /* renamed from: t */
    public static String m2369t(Throwable th) {
        boolean z7;
        if (th == null) {
            return null;
        }
        synchronized (f4711a) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z7 = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z7 = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z7) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    /* renamed from: u */
    public static int[] m2370u(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: v */
    public static void m2371v(String str, String str2) {
        synchronized (f4711a) {
            Log.i(str, m2350a(str2, null));
        }
    }

    /* renamed from: w */
    public static boolean m2372w(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* renamed from: x */
    public static boolean m2373x(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* renamed from: y */
    public static void m2374y(MediaFormat mediaFormat, C0216l c0216l) {
        if (c0216l != null) {
            m2375z(mediaFormat, "color-transfer", c0216l.f1187c);
            m2375z(mediaFormat, "color-standard", c0216l.f1185a);
            m2375z(mediaFormat, "color-range", c0216l.f1186b);
            byte[] bArr = c0216l.f1188d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    /* renamed from: z */
    public static void m2375z(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
