package p115n1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.e */
/* loaded from: classes.dex */
public final class C1971e implements InterfaceC1968c0 {

    /* renamed from: a */
    public final InterfaceC1975g f7313a;

    /* renamed from: b */
    public final long f7314b;

    /* renamed from: c */
    public final long f7315c;

    /* renamed from: d */
    public final long f7316d;

    /* renamed from: e */
    public final long f7317e;

    /* renamed from: f */
    public final long f7318f;

    public C1971e(InterfaceC1975g interfaceC1975g, long j, long j8, long j9, long j10, long j11) {
        this.f7313a = interfaceC1975g;
        this.f7314b = j;
        this.f7315c = j8;
        this.f7316d = j9;
        this.f7317e = j10;
        this.f7318f = j11;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f7314b;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        C1970d0 c1970d0 = new C1970d0(j, C1973f.m3850a(this.f7313a.mo998d(j), 0L, this.f7315c, this.f7316d, this.f7317e, this.f7318f));
        return new C1966b0(c1970d0, c1970d0);
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }
}
