package p168t2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.EnumC0148n;
import androidx.lifecycle.InterfaceC0162u;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import p005a4.C0073c;
import p053f7.InterfaceC1025b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p076i7.C1295g;
import p079j0.C1476d;
import p090k2.C1584b;
import p102l6.C1693j;
import p145q5.C2272a;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p171t5.AbstractC2436a;
import p183v0.C2502b;
import p183v0.C2517q;
import p183v0.C2518r;
import p185v3.C2532b;
import p185v3.C2533c;
import p191w0.C2598b;
import p211y5.C2817e;
import p211y5.C2821h;
import p211y5.C2823j;
import p211y5.C2825l;
import p220z6.AbstractC2980h;
import p220z6.C2976d;
import p220z6.C2986n;
import p220z6.InterfaceC2975c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.w */
/* loaded from: classes.dex */
public abstract class AbstractC2429w {
    /* renamed from: a */
    public static final String m4296a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        AbstractC2980h.m5133b(strOptString);
        if (AbstractC1206h.m2630D0(strOptString)) {
            return null;
        }
        return strOptString;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4297b(AbstractC0150o abstractC0150o, AbstractC2320c abstractC2320c) throws Throwable {
        C2532b c2532b;
        AbstractC0150o abstractC0150o2;
        C2986n c2986n;
        Throwable th;
        InterfaceC0162u interfaceC0162u;
        InterfaceC0162u interfaceC0162u2;
        if (abstractC2320c instanceof C2532b) {
            c2532b = (C2532b) abstractC2320c;
            int i = c2532b.f9212p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2532b.f9212p = i - Integer.MIN_VALUE;
            } else {
                c2532b = new C2532b(abstractC2320c);
            }
        }
        Object obj = c2532b.f9211o;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2532b.f9212p;
        C1693j c1693j = C1693j.f6497a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2986n = c2532b.f9210n;
            abstractC0150o2 = c2532b.f9209m;
            try {
                AbstractC0714c.m1516d0(obj);
                interfaceC0162u2 = (InterfaceC0162u) c2986n.f11117j;
                if (interfaceC0162u2 != null) {
                    abstractC0150o2.mo575i(interfaceC0162u2);
                }
                return c1693j;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0162u = (InterfaceC0162u) c2986n.f11117j;
                if (interfaceC0162u != null) {
                }
                throw th;
            }
        }
        AbstractC0714c.m1516d0(obj);
        if (abstractC0150o.mo569b().compareTo(EnumC0148n.f928m) >= 0) {
            return c1693j;
        }
        C2986n c2986n2 = new C2986n();
        try {
            c2532b.f9209m = abstractC0150o;
            c2532b.f9210n = c2986n2;
            c2532b.f9212p = 1;
            C1295g c1295g = new C1295g(1, AbstractC0715d.m1547P(c2532b));
            c1295g.m2810v();
            C2533c c2533c = new C2533c(c1295g);
            c2986n2.f11117j = c2533c;
            abstractC0150o.mo568a(c2533c);
            if (c1295g.m2809u() == enumC2273a) {
                return enumC2273a;
            }
            abstractC0150o2 = abstractC0150o;
            c2986n = c2986n2;
            interfaceC0162u2 = (InterfaceC0162u) c2986n.f11117j;
            if (interfaceC0162u2 != null) {
            }
            return c1693j;
        } catch (Throwable th3) {
            abstractC0150o2 = abstractC0150o;
            c2986n = c2986n2;
            th = th3;
            interfaceC0162u = (InterfaceC0162u) c2986n.f11117j;
            if (interfaceC0162u != null) {
                abstractC0150o2.mo575i(interfaceC0162u);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static C2518r m4298c(Context context) {
        ProviderInfo providerInfo;
        C1476d c1476d;
        ApplicationInfo applicationInfo;
        C1584b c2502b = Build.VERSION.SDK_INT >= 28 ? new C2502b(22) : new C1584b(22);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0714c.m1529o("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c1476d = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo3261r = c2502b.mo3261r(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo3261r) {
                    arrayList.add(signature.toByteArray());
                }
                c1476d = new C1476d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
        }
        if (c1476d == null) {
            return null;
        }
        return new C2518r(new C2517q(context, c1476d));
    }

    /* renamed from: d */
    public static AbstractC2436a m4299d(int i) {
        return i != 0 ? i != 1 ? new C2825l() : new C2817e() : new C2825l();
    }

    /* renamed from: e */
    public static ColorStateList m4300e(Context context, C0073c c0073c, int i) {
        int resourceId;
        ColorStateList colorStateListM424t;
        TypedArray typedArray = (TypedArray) c0073c.f325l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM424t = AbstractC0120b.m424t(context, resourceId)) == null) ? c0073c.m298w(i) : colorStateListM424t;
    }

    /* renamed from: f */
    public static ColorStateList m4301f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM424t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM424t = AbstractC0120b.m424t(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM424t;
    }

    /* renamed from: g */
    public static Drawable m4302g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM1542D;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM1542D = AbstractC0715d.m1542D(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM1542D;
    }

    /* renamed from: h */
    public static final Class m4303h(C2976d c2976d) {
        Class clsMo5130a = c2976d.mo5130a();
        AbstractC2980h.m5134c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsMo5130a);
        return clsMo5130a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: i */
    public static final Class m4304i(InterfaceC1025b interfaceC1025b) {
        AbstractC2980h.m5136e("<this>", interfaceC1025b);
        Class clsMo5130a = ((InterfaceC2975c) interfaceC1025b).mo5130a();
        if (clsMo5130a.isPrimitive()) {
            String name = clsMo5130a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo5130a;
    }

    /* renamed from: j */
    public static final int m4305j(int i, int i4, int i8) {
        if (i8 > 0) {
            if (i < i4) {
                int i9 = i4 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i4 - i11;
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i4) {
                int i12 = -i8;
                int i13 = i % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i4 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i15 + i4;
            }
        }
        return i4;
    }

    /* renamed from: k */
    public static String m4306k(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb.append("0123456789abcdef".charAt((b7 & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b7 & 15));
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    /* renamed from: l */
    public static boolean m4307l(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: m */
    public static C2598b m4308m(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                j = -1;
                break;
            }
            int i8 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i8) {
                break;
            }
            i4++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j8 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i9 = 0; i9 < j8; i9++) {
                int i10 = byteBufferDuplicate.getInt();
                long j9 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i10 || 1701669481 == i10) {
                    byteBufferDuplicate.position((int) (j9 + j));
                    C2598b c2598b = new C2598b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c2598b.f6855m = byteBufferDuplicate;
                    c2598b.f6852j = iPosition;
                    int i11 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2598b.f6853k = i11;
                    c2598b.f6854l = ((ByteBuffer) c2598b.f6855m).getShort(i11);
                    return c2598b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: n */
    public static int m4309n(C1131v c1131v, int i, int i4, int i8) {
        AbstractC1101a.m2353d(Math.max(Math.max(i, i4), i8) <= 31);
        int i9 = (1 << i) - 1;
        int i10 = (1 << i4) - 1;
        AbstractC0120b.m414j(AbstractC0120b.m414j(i9, i10), 1 << i8);
        if (c1131v.m2486c() < i) {
            return -1;
        }
        int iM2494k = c1131v.m2494k(i);
        if (iM2494k == i9) {
            if (c1131v.m2486c() < i4) {
                return -1;
            }
            int iM2494k2 = c1131v.m2494k(i4);
            iM2494k += iM2494k2;
            if (iM2494k2 == i10) {
                if (c1131v.m2486c() < i8) {
                    return -1;
                }
                return c1131v.m2494k(i8) + iM2494k;
            }
        }
        return iM2494k;
    }

    /* renamed from: o */
    public static void m4310o(View view, C2823j c2823j) {
        C2272a c2272a = c2823j.f10492k.f10460b;
        if (c2272a == null || !c2272a.f7948a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C2821h c2821h = c2823j.f10492k;
        if (c2821h.f10470l != elevation) {
            c2821h.f10470l = elevation;
            c2823j.m4950v();
        }
    }

    /* renamed from: p */
    public static String m4311p(String str) throws NoSuchAlgorithmException {
        AbstractC2980h.m5136e("input", str);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = str.getBytes(AbstractC1199a.f5077a);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC2980h.m5135d("digest(...)", bArrDigest);
        return m4306k(bArrDigest);
    }

    /* renamed from: q */
    public static void m4312q(C1131v c1131v) {
        c1131v.m2505v(3);
        c1131v.m2505v(8);
        boolean zM2493j = c1131v.m2493j();
        boolean zM2493j2 = c1131v.m2493j();
        if (zM2493j) {
            c1131v.m2505v(5);
        }
        if (zM2493j2) {
            c1131v.m2505v(6);
        }
    }

    /* renamed from: r */
    public static void m4313r(C1131v c1131v) {
        int iM2494k;
        int iM2494k2 = c1131v.m2494k(2);
        if (iM2494k2 == 0) {
            c1131v.m2505v(6);
            return;
        }
        int iM4309n = m4309n(c1131v, 5, 8, 16) + 1;
        if (iM2494k2 == 1) {
            c1131v.m2505v(iM4309n * 7);
            return;
        }
        if (iM2494k2 == 2) {
            boolean zM2493j = c1131v.m2493j();
            int i = zM2493j ? 1 : 5;
            int i4 = zM2493j ? 7 : 5;
            int i8 = zM2493j ? 8 : 6;
            int i9 = 0;
            while (i9 < iM4309n) {
                if (c1131v.m2493j()) {
                    c1131v.m2505v(7);
                    iM2494k = 0;
                } else {
                    if (c1131v.m2494k(2) == 3 && c1131v.m2494k(i4) * i != 0) {
                        c1131v.m2504u();
                    }
                    iM2494k = c1131v.m2494k(i8) * i;
                    if (iM2494k != 0 && iM2494k != 180) {
                        c1131v.m2504u();
                    }
                    c1131v.m2504u();
                }
                if (iM2494k != 0 && iM2494k != 180 && c1131v.m2493j()) {
                    i9++;
                }
                i9++;
            }
        }
    }

    /* renamed from: s */
    public static String m4314s(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i4 = AbstractC1118i0.f4750a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* renamed from: t */
    public static byte[] m4315t(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("hex length must be even");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            int iDigit = Character.digit(str.charAt(i4), 16);
            int iDigit2 = Character.digit(str.charAt(i4 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw new IllegalArgumentException("bad hex");
            }
            bArr[i] = (byte) (iDigit2 | (iDigit << 4));
        }
        return bArr;
    }
}
