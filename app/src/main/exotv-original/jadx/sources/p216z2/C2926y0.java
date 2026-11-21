package p216z2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.y0 */
/* loaded from: classes.dex */
public final class C2926y0 extends AbstractC2894i0 {

    /* renamed from: a */
    public boolean f10875a = false;

    /* renamed from: b */
    public final /* synthetic */ AbstractC2928z0 f10876b;

    public C2926y0(AbstractC2928z0 abstractC2928z0) {
        this.f10876b = abstractC2928z0;
    }

    @Override // p216z2.AbstractC2894i0
    /* renamed from: a */
    public final void mo1432a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f10875a) {
            this.f10875a = false;
            this.f10876b.m5090f();
        }
    }

    @Override // p216z2.AbstractC2894i0
    /* renamed from: b */
    public final void mo1433b(RecyclerView recyclerView, int i, int i4) {
        if (i == 0 && i4 == 0) {
            return;
        }
        this.f10875a = true;
    }
}
