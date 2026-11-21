package p090k2;

import androidx.media3.exoplayer.source.preload.C0456a;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p063h1.InterfaceC1111f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.q */
/* loaded from: classes.dex */
public interface InterfaceC1599q {
    /* renamed from: d */
    default InterfaceC1590h mo3264d(byte[] bArr, int i, int i4) {
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        mo75f(bArr, 0, i4, C1598p.f6078c, new C0456a(8, c0974j0M2164i));
        return new C1586d(c0974j0M2164i.m2159f());
    }

    /* renamed from: f */
    void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f);

    /* renamed from: h */
    int mo77h();

    default void reset() {
    }
}
