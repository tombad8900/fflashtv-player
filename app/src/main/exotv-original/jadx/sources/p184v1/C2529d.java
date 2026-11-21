package p184v1;

import p115n1.AbstractC1994u;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.InterfaceC1968c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v1.d */
/* loaded from: classes.dex */
public final class C2529d extends AbstractC1994u {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1968c0 f9203a;

    /* renamed from: b */
    public final /* synthetic */ C2528c f9204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2529d(C2528c c2528c, InterfaceC1968c0 interfaceC1968c0, InterfaceC1968c0 interfaceC1968c02) {
        super(interfaceC1968c0);
        this.f9204b = c2528c;
        this.f9203a = interfaceC1968c02;
    }

    @Override // p115n1.AbstractC1994u, p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        C1966b0 seekPoints = this.f9203a.getSeekPoints(j);
        C1970d0 c1970d0 = seekPoints.f7290a;
        long j8 = c1970d0.f7311a;
        long j9 = c1970d0.f7312b;
        long j10 = this.f9204b.f9201k;
        C1970d0 c1970d02 = new C1970d0(j8, j9 + j10);
        C1970d0 c1970d03 = seekPoints.f7291b;
        return new C1966b0(c1970d02, new C1970d0(c1970d03.f7311a, c1970d03.f7312b + j10));
    }
}
