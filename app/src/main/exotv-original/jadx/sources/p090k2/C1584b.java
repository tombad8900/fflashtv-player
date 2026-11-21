package p090k2;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.common.C0249w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p002a1.C0016e;
import p002a1.C0035n0;
import p005a4.InterfaceC0080f0;
import p052f6.AbstractC0983m0;
import p057g2.C1040d;
import p062h.AbstractActivityC1083i;
import p063h1.AbstractC1101a;
import p069h7.AbstractC1199a;
import p095l.InterfaceC1639y;
import p095l.MenuC1627m;
import p100l4.C1674b;
import p100l4.C1678f;
import p105m0.InterfaceC1842r;
import p111m6.AbstractC1912g;
import p115n1.C1986m;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1975g;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;
import p118n4.InterfaceC2009f;
import p118n4.InterfaceC2010g;
import p118n4.InterfaceC2012i;
import p143q3.InterfaceC2264f;
import p178u4.AbstractC2466a;
import p186v4.InterfaceC2545a;
import p189v7.AbstractC2555a;
import p189v7.AbstractC2557b;
import p189v7.C2579m;
import p198w7.AbstractC2706b;
import p210y3.C2804h;
import p210y3.InterfaceC2807k;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.b */
/* loaded from: classes.dex */
public class C1584b implements InterfaceC1597o, InterfaceC2807k, InterfaceC1639y, InterfaceC1842r, InterfaceC1975g, InterfaceC1989p, InterfaceC2010g, InterfaceC2009f, InterfaceC2264f, InterfaceC2545a {

    /* renamed from: j */
    public final /* synthetic */ int f6052j;

    public /* synthetic */ C1584b(int i) {
        this.f6052j = i;
    }

    /* renamed from: m */
    public static C2579m m3248m(String str) {
        int i;
        char cCharAt;
        AbstractC2980h.m5136e("<this>", str);
        byte[] bArr = AbstractC2555a.f9268a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i4 = (int) ((length * 6) / 8);
        byte[] bArrCopyOf = new byte[i4];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i8 < length) {
                char cCharAt2 = str.charAt(i8);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i8++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i10 = (i10 << 6) | i;
                i9++;
                if (i9 % 4 == 0) {
                    bArrCopyOf[i11] = (byte) (i10 >> 16);
                    int i12 = i11 + 2;
                    bArrCopyOf[i11 + 1] = (byte) (i10 >> 8);
                    i11 += 3;
                    bArrCopyOf[i12] = (byte) i10;
                }
                i8++;
            } else {
                int i13 = i9 % 4;
                if (i13 != 1) {
                    if (i13 == 2) {
                        bArrCopyOf[i11] = (byte) ((i10 << 12) >> 16);
                        i11++;
                    } else if (i13 == 3) {
                        int i14 = i10 << 6;
                        int i15 = i11 + 1;
                        bArrCopyOf[i11] = (byte) (i14 >> 16);
                        i11 += 2;
                        bArrCopyOf[i15] = (byte) (i14 >> 8);
                    }
                    if (i11 != i4) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                        AbstractC2980h.m5135d("copyOf(...)", bArrCopyOf);
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C2579m(bArrCopyOf);
        }
        return null;
    }

    /* renamed from: n */
    public static C2579m m3249n(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (AbstractC2706b.m4761a(str.charAt(i4 + 1)) + (AbstractC2706b.m4761a(str.charAt(i4)) << 4));
        }
        return new C2579m(bArr);
    }

    /* renamed from: o */
    public static byte[] m3250o(AbstractC0983m0 abstractC0983m0, long j) {
        ArrayList<? extends Parcelable> arrayListM2347E = AbstractC1101a.m2347E(abstractC0983m0, new C1040d(13));
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListM2347E);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* renamed from: p */
    public static C2579m m3251p(String str) {
        AbstractC2980h.m5136e("<this>", str);
        byte[] bytes = str.getBytes(AbstractC1199a.f5077a);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        C2579m c2579m = new C2579m(bytes);
        c2579m.f9319l = str;
        return c2579m;
    }

    /* renamed from: q */
    private final void m3252q() {
    }

    /* renamed from: t */
    public static C2579m m3253t(byte[] bArr) {
        C2579m c2579m = C2579m.f9316m;
        int length = bArr.length;
        AbstractC2557b.m4580e(bArr.length, 0, length);
        return new C2579m(AbstractC1912g.m3730n0(bArr, 0, length));
    }

    /* renamed from: u */
    private final void m3254u(Object obj) {
    }

    /* renamed from: v */
    private final void m3255v(InterfaceC1968c0 interfaceC1968c0) {
    }

    @Override // p118n4.InterfaceC2010g
    /* renamed from: a */
    public void mo3256a(InterfaceC2012i interfaceC2012i) {
        interfaceC2012i.mo1639k();
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: b */
    public void mo2315b(MenuC1627m menuC1627m, boolean z7) {
    }

    @Override // p090k2.InterfaceC1597o
    /* renamed from: c */
    public int mo3257c(C0249w c0249w) {
        return 1;
    }

    @Override // p115n1.InterfaceC1975g
    /* renamed from: d */
    public long mo998d(long j) {
        return j;
    }

    @Override // p118n4.InterfaceC2009f
    /* renamed from: e */
    public void mo3258e(AbstractActivityC1083i abstractActivityC1083i) {
    }

    @Override // p115n1.InterfaceC1989p
    public void endTracks() {
        switch (this.f6052j) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // p186v4.InterfaceC2545a
    /* renamed from: f */
    public Object mo167f() {
        return new ArrayList();
    }

    @Override // p090k2.InterfaceC1597o
    /* renamed from: g */
    public InterfaceC1599q mo3259g(C0249w c0249w) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p143q3.InterfaceC2264f
    /* renamed from: h */
    public boolean mo286h() {
        return true;
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: i */
    public boolean mo2316i(MenuC1627m menuC1627m) {
        return false;
    }

    @Override // p210y3.InterfaceC2807k
    /* renamed from: j */
    public int mo53j(C2804h c2804h) {
        return 1;
    }

    @Override // p210y3.InterfaceC2798b
    /* renamed from: k */
    public boolean mo54k(Object obj, File file, C2804h c2804h) throws Throwable {
        try {
            AbstractC2466a.m4442d(((C1678f) ((C1674b) ((InterfaceC0080f0) obj).get()).f6419j.f3812b).f6437a.f10188d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // p118n4.InterfaceC2010g
    /* renamed from: l */
    public void mo3260l(InterfaceC2012i interfaceC2012i) {
    }

    @Override // p105m0.InterfaceC1842r
    public void onScrollLimit(int i, int i4, int i8, boolean z7) {
    }

    @Override // p105m0.InterfaceC1842r
    public void onScrollProgress(int i, int i4, int i8, int i9) {
    }

    /* renamed from: r */
    public Signature[] mo3261r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* renamed from: s */
    public boolean mo3262s(CharSequence charSequence) {
        return false;
    }

    @Override // p115n1.InterfaceC1989p
    public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
        switch (this.f6052j) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // p143q3.InterfaceC2264f
    public void shutdown() {
    }

    @Override // p090k2.InterfaceC1597o
    public boolean supportsFormat(C0249w c0249w) {
        return false;
    }

    @Override // p115n1.InterfaceC1989p
    public InterfaceC1980i0 track(int i, int i4) {
        switch (this.f6052j) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return new C1986m();
        }
    }

    public C1584b(C0016e c0016e, C0035n0 c0035n0) {
        this.f6052j = 13;
    }
}
