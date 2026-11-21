package p199x;

import p174u.C2439a;
import p174u.C2442d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.a */
/* loaded from: classes.dex */
public final class C2714a extends AbstractC2716c {

    /* renamed from: q */
    public int f9869q;

    /* renamed from: r */
    public int f9870r;

    /* renamed from: s */
    public C2439a f9871s;

    public boolean getAllowsGoneWidget() {
        return this.f9871s.f8791t0;
    }

    public int getMargin() {
        return this.f9871s.f8792u0;
    }

    public int getType() {
        return this.f9869q;
    }

    @Override // p199x.AbstractC2716c
    /* renamed from: h */
    public final void mo494h(C2442d c2442d, boolean z7) {
        int i = this.f9869q;
        this.f9870r = i;
        if (z7) {
            if (i == 5) {
                this.f9870r = 1;
            } else if (i == 6) {
                this.f9870r = 0;
            }
        } else if (i == 5) {
            this.f9870r = 0;
        } else if (i == 6) {
            this.f9870r = 1;
        }
        if (c2442d instanceof C2439a) {
            ((C2439a) c2442d).f8790s0 = this.f9870r;
        }
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.f9871s.f8791t0 = z7;
    }

    public void setDpMargin(int i) {
        this.f9871s.f8792u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f9871s.f8792u0 = i;
    }

    public void setType(int i) {
        this.f9869q = i;
    }
}
