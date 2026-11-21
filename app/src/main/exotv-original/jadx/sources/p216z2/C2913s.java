package p216z2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import p183v0.AbstractC2506f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.s */
/* loaded from: classes.dex */
public final class C2913s extends AbstractC2506f {

    /* renamed from: d */
    public final /* synthetic */ int f10833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2913s(AbstractC2888f0 abstractC2888f0, int i) {
        super(abstractC2888f0);
        this.f10833d = i;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: b */
    public final int mo4507b(View view) {
        int right;
        int i;
        switch (this.f10833d) {
            case 0:
                C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                right = view.getRight() + ((C2890g0) view.getLayoutParams()).f10690b.right;
                i = ((ViewGroup.MarginLayoutParams) c2890g0).rightMargin;
                break;
            default:
                C2890g0 c2890g02 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                right = view.getBottom() + ((C2890g0) view.getLayoutParams()).f10690b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c2890g02).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: c */
    public final int mo4508c(View view) {
        int iM4982A;
        int i;
        switch (this.f10833d) {
            case 0:
                C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                iM4982A = AbstractC2888f0.m4982A(view) + ((ViewGroup.MarginLayoutParams) c2890g0).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2890g0).rightMargin;
                break;
            default:
                C2890g0 c2890g02 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                iM4982A = AbstractC2888f0.m4989z(view) + ((ViewGroup.MarginLayoutParams) c2890g02).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2890g02).bottomMargin;
                break;
        }
        return iM4982A + i;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: d */
    public final int mo4509d(View view) {
        int iM4989z;
        int i;
        switch (this.f10833d) {
            case 0:
                C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                iM4989z = AbstractC2888f0.m4989z(view) + ((ViewGroup.MarginLayoutParams) c2890g0).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2890g0).bottomMargin;
                break;
            default:
                C2890g0 c2890g02 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                iM4989z = AbstractC2888f0.m4982A(view) + ((ViewGroup.MarginLayoutParams) c2890g02).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2890g02).rightMargin;
                break;
        }
        return iM4989z + i;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: e */
    public final int mo4510e(View view) {
        int left;
        int i;
        switch (this.f10833d) {
            case 0:
                C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                left = view.getLeft() - ((C2890g0) view.getLayoutParams()).f10690b.left;
                i = ((ViewGroup.MarginLayoutParams) c2890g0).leftMargin;
                break;
            default:
                C2890g0 c2890g02 = (C2890g0) view.getLayoutParams();
                ((AbstractC2888f0) this.f9139b).getClass();
                left = view.getTop() - ((C2890g0) view.getLayoutParams()).f10690b.top;
                i = ((ViewGroup.MarginLayoutParams) c2890g02).topMargin;
                break;
        }
        return left - i;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: f */
    public final int mo4511f() {
        switch (this.f10833d) {
            case 0:
                return ((AbstractC2888f0) this.f9139b).f10682n;
            default:
                return ((AbstractC2888f0) this.f9139b).f10683o;
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: g */
    public final int mo4512g() {
        int i;
        int iM4995F;
        switch (this.f10833d) {
            case 0:
                AbstractC2888f0 abstractC2888f0 = (AbstractC2888f0) this.f9139b;
                i = abstractC2888f0.f10682n;
                iM4995F = abstractC2888f0.m4995F();
                break;
            default:
                AbstractC2888f0 abstractC2888f02 = (AbstractC2888f0) this.f9139b;
                i = abstractC2888f02.f10683o;
                iM4995F = abstractC2888f02.m4993D();
                break;
        }
        return i - iM4995F;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: h */
    public final int mo4513h() {
        switch (this.f10833d) {
            case 0:
                return ((AbstractC2888f0) this.f9139b).m4995F();
            default:
                return ((AbstractC2888f0) this.f9139b).m4993D();
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: i */
    public final int mo4514i() {
        switch (this.f10833d) {
            case 0:
                return ((AbstractC2888f0) this.f9139b).f10680l;
            default:
                return ((AbstractC2888f0) this.f9139b).f10681m;
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: j */
    public final int mo4515j() {
        switch (this.f10833d) {
            case 0:
                return ((AbstractC2888f0) this.f9139b).f10681m;
            default:
                return ((AbstractC2888f0) this.f9139b).f10680l;
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: k */
    public final int mo4516k() {
        switch (this.f10833d) {
            case 0:
                return ((AbstractC2888f0) this.f9139b).m4994E();
            default:
                return ((AbstractC2888f0) this.f9139b).m4996G();
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: l */
    public final int mo4517l() {
        int iM4994E;
        int iM4995F;
        switch (this.f10833d) {
            case 0:
                AbstractC2888f0 abstractC2888f0 = (AbstractC2888f0) this.f9139b;
                iM4994E = abstractC2888f0.f10682n - abstractC2888f0.m4994E();
                iM4995F = abstractC2888f0.m4995F();
                break;
            default:
                AbstractC2888f0 abstractC2888f02 = (AbstractC2888f0) this.f9139b;
                iM4994E = abstractC2888f02.f10683o - abstractC2888f02.m4996G();
                iM4995F = abstractC2888f02.m4993D();
                break;
        }
        return iM4994E - iM4995F;
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: m */
    public final int mo4518m(View view) {
        switch (this.f10833d) {
            case 0:
                AbstractC2888f0 abstractC2888f0 = (AbstractC2888f0) this.f9139b;
                Rect rect = (Rect) this.f9140c;
                abstractC2888f0.m4997K(view, rect);
                return rect.right;
            default:
                AbstractC2888f0 abstractC2888f02 = (AbstractC2888f0) this.f9139b;
                Rect rect2 = (Rect) this.f9140c;
                abstractC2888f02.m4997K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: n */
    public final int mo4519n(View view) {
        switch (this.f10833d) {
            case 0:
                AbstractC2888f0 abstractC2888f0 = (AbstractC2888f0) this.f9139b;
                Rect rect = (Rect) this.f9140c;
                abstractC2888f0.m4997K(view, rect);
                return rect.left;
            default:
                AbstractC2888f0 abstractC2888f02 = (AbstractC2888f0) this.f9139b;
                Rect rect2 = (Rect) this.f9140c;
                abstractC2888f02.m4997K(view, rect2);
                return rect2.top;
        }
    }

    @Override // p183v0.AbstractC2506f
    /* renamed from: o */
    public final void mo4520o(int i) {
        switch (this.f10833d) {
            case 0:
                ((AbstractC2888f0) this.f9139b).mo1218O(i);
                break;
            default:
                ((AbstractC2888f0) this.f9139b).mo1220P(i);
                break;
        }
    }
}
