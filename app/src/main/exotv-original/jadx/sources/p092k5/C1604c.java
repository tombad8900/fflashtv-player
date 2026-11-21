package p092k5;

import com.google.android.material.carousel.CarouselLayoutManager;
import p071i1.AbstractC1225d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k5.c */
/* loaded from: classes.dex */
public final class C1604c extends AbstractC1225d {

    /* renamed from: c */
    public final /* synthetic */ int f6104c;

    /* renamed from: d */
    public final /* synthetic */ CarouselLayoutManager f6105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604c(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 1);
        this.f6104c = i;
        switch (i) {
            case 1:
                this.f6105d = carouselLayoutManager;
                super(0, 1);
                break;
            default:
                this.f6105d = carouselLayoutManager;
                break;
        }
    }

    @Override // p071i1.AbstractC1225d
    /* renamed from: b */
    public final int mo2675b() {
        switch (this.f6104c) {
            case 0:
                return this.f6105d.f10683o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f6105d;
                return carouselLayoutManager.f10683o - carouselLayoutManager.m4993D();
        }
    }

    @Override // p071i1.AbstractC1225d
    /* renamed from: c */
    public final int mo2676c() {
        switch (this.f6104c) {
            case 0:
                return this.f6105d.m4994E();
            default:
                return 0;
        }
    }

    @Override // p071i1.AbstractC1225d
    /* renamed from: d */
    public final int mo2677d() {
        switch (this.f6104c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f6105d;
                return carouselLayoutManager.f10682n - carouselLayoutManager.m4995F();
            default:
                return this.f6105d.f10682n;
        }
    }

    @Override // p071i1.AbstractC1225d
    /* renamed from: e */
    public final int mo2678e() {
        switch (this.f6104c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f6105d;
                if (carouselLayoutManager.m1829E0()) {
                    return carouselLayoutManager.f10682n;
                }
                return 0;
        }
    }

    @Override // p071i1.AbstractC1225d
    /* renamed from: f */
    public final int mo2679f() {
        switch (this.f6104c) {
            case 0:
                return 0;
            default:
                return this.f6105d.m4996G();
        }
    }
}
