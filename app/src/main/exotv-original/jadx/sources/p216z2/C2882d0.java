package p216z2;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.d0 */
/* loaded from: classes.dex */
public final class C2882d0 {

    /* renamed from: a */
    public final /* synthetic */ int f10638a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC2888f0 f10639b;

    public /* synthetic */ C2882d0(AbstractC2888f0 abstractC2888f0, int i) {
        this.f10638a = i;
        this.f10639b = abstractC2888f0;
    }

    /* renamed from: a */
    public final int m4977a(View view) {
        int right;
        int i;
        switch (this.f10638a) {
            case 0:
                C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
                right = view.getRight() + ((C2890g0) view.getLayoutParams()).f10690b.right;
                i = ((ViewGroup.MarginLayoutParams) c2890g0).rightMargin;
                break;
            default:
                C2890g0 c2890g02 = (C2890g0) view.getLayoutParams();
                right = view.getBottom() + ((C2890g0) view.getLayoutParams()).f10690b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c2890g02).bottomMargin;
                break;
        }
        return right + i;
    }

    /* renamed from: b */
    public final int m4978b(View view) {
        int left;
        int i;
        switch (this.f10638a) {
            case 0:
                C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
                left = view.getLeft() - ((C2890g0) view.getLayoutParams()).f10690b.left;
                i = ((ViewGroup.MarginLayoutParams) c2890g0).leftMargin;
                break;
            default:
                C2890g0 c2890g02 = (C2890g0) view.getLayoutParams();
                left = view.getTop() - ((C2890g0) view.getLayoutParams()).f10690b.top;
                i = ((ViewGroup.MarginLayoutParams) c2890g02).topMargin;
                break;
        }
        return left - i;
    }

    /* renamed from: c */
    public final int m4979c() {
        int i;
        int iM4995F;
        switch (this.f10638a) {
            case 0:
                AbstractC2888f0 abstractC2888f0 = this.f10639b;
                i = abstractC2888f0.f10682n;
                iM4995F = abstractC2888f0.m4995F();
                break;
            default:
                AbstractC2888f0 abstractC2888f02 = this.f10639b;
                i = abstractC2888f02.f10683o;
                iM4995F = abstractC2888f02.m4993D();
                break;
        }
        return i - iM4995F;
    }

    /* renamed from: d */
    public final int m4980d() {
        switch (this.f10638a) {
            case 0:
                return this.f10639b.m4994E();
            default:
                return this.f10639b.m4996G();
        }
    }
}
