package p089k1;

import android.net.Uri;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import com.google.android.material.datepicker.C0758p;
import java.math.RoundingMode;
import java.util.Map;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p176u2.C2460e;
import p176u2.InterfaceC2457b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.k */
/* loaded from: classes.dex */
public final class C1567k implements InterfaceC2457b {

    /* renamed from: a */
    public int f5987a;

    /* renamed from: b */
    public long f5988b;

    /* renamed from: c */
    public int f5989c;

    /* renamed from: d */
    public long f5990d;

    /* renamed from: e */
    public Object f5991e;

    /* renamed from: f */
    public Object f5992f;

    /* renamed from: g */
    public Object f5993g;

    /* renamed from: h */
    public Object f5994h;

    public C1567k(InterfaceC1989p interfaceC1989p, InterfaceC1980i0 interfaceC1980i0, C0758p c0758p, String str, int i) throws C0247v0 {
        this.f5991e = interfaceC1989p;
        this.f5992f = interfaceC1980i0;
        this.f5993g = c0758p;
        int i4 = c0758p.f3275j;
        int i8 = c0758p.f3276k;
        int i9 = (c0758p.f3278m * i4) / 8;
        int i10 = c0758p.f3277l;
        if (i10 != i9) {
            throw C0247v0.createForMalformedContainer("Expected block size: " + i9 + "; got: " + i10, null);
        }
        int i11 = i8 * i9;
        int i12 = i11 * 8;
        int iMax = Math.max(i9, i11 / 10);
        this.f5987a = iMax;
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p(str);
        c0246v.f1442h = i12;
        c0246v.f1443i = i12;
        c0246v.f1448n = iMax;
        c0246v.f1425B = i4;
        c0246v.f1426C = i8;
        c0246v.f1427D = i;
        this.f5994h = new C0249w(c0246v);
    }

    @Override // p176u2.InterfaceC2457b
    /* renamed from: a */
    public void mo3233a(long j) {
        this.f5988b = j;
        this.f5989c = 0;
        this.f5990d = 0L;
    }

    @Override // p176u2.InterfaceC2457b
    /* renamed from: b */
    public boolean mo3234b(InterfaceC1988o interfaceC1988o, long j) {
        int i;
        int i4;
        long j8 = j;
        while (j8 > 0 && (i = this.f5989c) < (i4 = this.f5987a)) {
            int iSampleData = ((InterfaceC1980i0) this.f5992f).sampleData((InterfaceC0219m) interfaceC1988o, (int) Math.min(i4 - i, j8), true);
            if (iSampleData == -1) {
                j8 = 0;
            } else {
                this.f5989c += iSampleData;
                j8 -= iSampleData;
            }
        }
        C0758p c0758p = (C0758p) this.f5993g;
        int i8 = c0758p.f3277l;
        int i9 = this.f5989c / i8;
        if (i9 > 0) {
            long j9 = this.f5988b;
            long j10 = this.f5990d;
            long j11 = c0758p.f3276k;
            int i10 = AbstractC1118i0.f4750a;
            long jM2437a0 = j9 + AbstractC1118i0.m2437a0(j10, 1000000L, j11, RoundingMode.DOWN);
            int i11 = i9 * i8;
            int i12 = this.f5989c - i11;
            ((InterfaceC1980i0) this.f5992f).sampleMetadata(jM2437a0, 1, i11, i12, null);
            this.f5990d += i9;
            this.f5989c = i12;
        }
        return j8 <= 0;
    }

    @Override // p176u2.InterfaceC2457b
    /* renamed from: c */
    public void mo3235c(int i, long j) {
        ((InterfaceC1989p) this.f5991e).seekMap(new C2460e((C0758p) this.f5993g, 1, i, j));
        ((InterfaceC1980i0) this.f5992f).format((C0249w) this.f5994h);
    }

    /* renamed from: d */
    public C1568l m3236d() {
        AbstractC1101a.m2361l("The uri must be set.", (Uri) this.f5991e);
        return new C1568l((Uri) this.f5991e, this.f5987a, (byte[]) this.f5992f, (Map) this.f5993g, this.f5988b, this.f5990d, (String) this.f5994h, this.f5989c);
    }
}
