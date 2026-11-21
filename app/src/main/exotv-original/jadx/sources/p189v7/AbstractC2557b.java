package p189v7;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p198w7.AbstractC2706b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.b */
/* loaded from: classes.dex */
public abstract class AbstractC2557b {

    /* renamed from: a */
    public static final C2569h f9271a = new C2569h();

    /* renamed from: a */
    public static final boolean m4576a(int i, int i4, int i8, byte[] bArr, byte[] bArr2) {
        AbstractC2980h.m5136e(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, bArr);
        AbstractC2980h.m5136e("b", bArr2);
        for (int i9 = 0; i9 < i8; i9++) {
            if (bArr[i9 + i] != bArr2[i9 + i4]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final C2562d0 m4577b(InterfaceC2572i0 interfaceC2572i0) {
        AbstractC2980h.m5136e("<this>", interfaceC2572i0);
        return new C2562d0(interfaceC2572i0);
    }

    /* renamed from: c */
    public static final C2564e0 m4578c(InterfaceC2576k0 interfaceC2576k0) {
        AbstractC2980h.m5136e("<this>", interfaceC2576k0);
        return new C2564e0(interfaceC2576k0);
    }

    /* renamed from: d */
    public static void m4579d(long j, C2573j c2573j, int i, ArrayList arrayList, int i4, int i8, ArrayList arrayList2) {
        int i9;
        int i10;
        ArrayList arrayList3;
        long j8;
        int i11;
        int i12 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i4 >= i8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i13 = i4; i13 < i8; i13++) {
            if (((C2579m) arrayList4.get(i13)).mo4634d() < i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C2579m c2579m = (C2579m) arrayList.get(i4);
        C2579m c2579m2 = (C2579m) arrayList4.get(i8 - 1);
        if (i12 == c2579m.mo4634d()) {
            int iIntValue = ((Number) arrayList5.get(i4)).intValue();
            int i14 = i4 + 1;
            C2579m c2579m3 = (C2579m) arrayList4.get(i14);
            i9 = i14;
            i10 = iIntValue;
            c2579m = c2579m3;
        } else {
            i9 = i4;
            i10 = -1;
        }
        if (c2579m.mo4638i(i12) == c2579m2.mo4638i(i12)) {
            int iMin = Math.min(c2579m.mo4634d(), c2579m2.mo4634d());
            int i15 = 0;
            for (int i16 = i12; i16 < iMin && c2579m.mo4638i(i16) == c2579m2.mo4638i(i16); i16++) {
                i15++;
            }
            long j9 = 4;
            long j10 = (c2573j.f9314k / j9) + j + 2 + i15 + 1;
            c2573j.m4658N(-i15);
            c2573j.m4658N(i10);
            int i17 = i12 + i15;
            while (i12 < i17) {
                c2573j.m4658N(c2579m.mo4638i(i12) & 255);
                i12++;
            }
            if (i9 + 1 == i8) {
                if (i17 != ((C2579m) arrayList4.get(i9)).mo4634d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c2573j.m4658N(((Number) arrayList5.get(i9)).intValue());
                return;
            } else {
                C2573j c2573j2 = new C2573j();
                c2573j.m4658N(((int) ((c2573j2.f9314k / j9) + j10)) * (-1));
                m4579d(j10, c2573j2, i17, arrayList4, i9, i8, arrayList5);
                c2573j.mo4598f(c2573j2);
                return;
            }
        }
        int i18 = 1;
        for (int i19 = i9 + 1; i19 < i8; i19++) {
            if (((C2579m) arrayList4.get(i19 - 1)).mo4638i(i12) != ((C2579m) arrayList4.get(i19)).mo4638i(i12)) {
                i18++;
            }
        }
        long j11 = 4;
        long j12 = (c2573j.f9314k / j11) + j + 2 + (i18 * 2);
        c2573j.m4658N(i18);
        c2573j.m4658N(i10);
        for (int i20 = i9; i20 < i8; i20++) {
            int iMo4638i = ((C2579m) arrayList4.get(i20)).mo4638i(i12);
            if (i20 == i9 || iMo4638i != ((C2579m) arrayList4.get(i20 - 1)).mo4638i(i12)) {
                c2573j.m4658N(iMo4638i & 255);
            }
        }
        C2573j c2573j3 = new C2573j();
        int i21 = i9;
        while (i21 < i8) {
            byte bMo4638i = ((C2579m) arrayList4.get(i21)).mo4638i(i12);
            int i22 = i21 + 1;
            int i23 = i22;
            while (true) {
                if (i23 >= i8) {
                    i23 = i8;
                    break;
                } else if (bMo4638i != ((C2579m) arrayList4.get(i23)).mo4638i(i12)) {
                    break;
                } else {
                    i23++;
                }
            }
            if (i22 == i23 && i12 + 1 == ((C2579m) arrayList4.get(i21)).mo4634d()) {
                c2573j.m4658N(((Number) arrayList5.get(i21)).intValue());
                arrayList3 = arrayList5;
                j8 = j12;
                i11 = i23;
            } else {
                c2573j.m4658N(((int) ((c2573j3.f9314k / j11) + j12)) * (-1));
                arrayList3 = arrayList5;
                j8 = j12;
                i11 = i23;
                m4579d(j8, c2573j3, i12 + 1, arrayList, i21, i11, arrayList3);
                arrayList4 = arrayList;
            }
            j12 = j8;
            i21 = i11;
            arrayList5 = arrayList3;
        }
        c2573j.mo4598f(c2573j3);
    }

    /* renamed from: e */
    public static final void m4580e(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    /* renamed from: f */
    public static final boolean m4581f(AssertionError assertionError) {
        Logger logger = AbstractC2594y.f9345a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1206h.m2649u0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final InterfaceC2572i0 m4582g(Socket socket) throws IOException {
        Logger logger = AbstractC2594y.f9345a;
        AbstractC2980h.m5136e("<this>", socket);
        C2574j0 c2574j0 = new C2574j0(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC2980h.m5135d("getOutputStream(...)", outputStream);
        return c2574j0.sink(new C2561d(outputStream, 1, c2574j0));
    }

    /* renamed from: h */
    public static final C2563e m4583h(File file) {
        Logger logger = AbstractC2594y.f9345a;
        AbstractC2980h.m5136e("<this>", file);
        return new C2563e(new FileInputStream(file), C2582n0.NONE);
    }

    /* renamed from: i */
    public static final C2563e m4584i(InputStream inputStream) {
        Logger logger = AbstractC2594y.f9345a;
        AbstractC2980h.m5136e("<this>", inputStream);
        return new C2563e(inputStream, new C2582n0());
    }

    /* renamed from: j */
    public static final InterfaceC2576k0 m4585j(Socket socket) throws IOException {
        Logger logger = AbstractC2594y.f9345a;
        AbstractC2980h.m5136e("<this>", socket);
        C2574j0 c2574j0 = new C2574j0(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC2980h.m5135d("getInputStream(...)", inputStream);
        return c2574j0.source(new C2563e(inputStream, c2574j0));
    }

    /* renamed from: k */
    public static final String m4586k(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC2706b.f9823a;
        int i4 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i4 < 8 && cArr2[i4] == '0') {
            i4++;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m14j("startIndex: ", i4, ", endIndex: 8, size: 8"));
        }
        if (i4 <= 8) {
            return new String(cArr2, i4, 8 - i4);
        }
        throw new IllegalArgumentException(AbstractC0008a1.m14j("startIndex: ", i4, " > endIndex: 8"));
    }
}
