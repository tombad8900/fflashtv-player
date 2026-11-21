package p115n1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.u */
/* loaded from: classes.dex */
public abstract class AbstractC1994u implements InterfaceC1968c0 {
    private final InterfaceC1968c0 seekMap;

    public AbstractC1994u(InterfaceC1968c0 interfaceC1968c0) {
        this.seekMap = interfaceC1968c0;
    }

    @Override // p115n1.InterfaceC1968c0
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // p115n1.InterfaceC1968c0
    public C1966b0 getSeekPoints(long j) {
        return this.seekMap.getSeekPoints(j);
    }

    @Override // p115n1.InterfaceC1968c0
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
