package p090k2;

import androidx.media3.exoplayer.source.preload.C0456a;
import p098l2.AbstractC1658h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.f */
/* loaded from: classes.dex */
public final class C1588f extends AbstractC1596n {

    /* renamed from: l */
    public final /* synthetic */ int f6060l = 1;

    /* renamed from: m */
    public Object f6061m;

    public /* synthetic */ C1588f() {
    }

    @Override // p106m1.AbstractC1873h
    public final void release() {
        switch (this.f6060l) {
            case 0:
                ((AbstractC1589g) this.f6061m).releaseOutputBuffer(this);
                break;
            default:
                AbstractC1658h abstractC1658h = (AbstractC1658h) ((C0456a) this.f6061m).f1850k;
                abstractC1658h.getClass();
                clear();
                abstractC1658h.f6371b.add(this);
                break;
        }
    }

    public C1588f(AbstractC1589g abstractC1589g) {
        this.f6061m = abstractC1589g;
    }
}
