package p024c5;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.exotv.net.MainActivity;
import p102l6.C1693j;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.u0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0695u0 implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f2707j;

    /* renamed from: k */
    public final /* synthetic */ C0648a1 f2708k;

    /* renamed from: l */
    public final /* synthetic */ LinearLayout f2709l;

    public /* synthetic */ C0695u0(C0648a1 c0648a1, LinearLayout linearLayout, int i) {
        this.f2707j = i;
        this.f2708k = c0648a1;
        this.f2709l = linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // p212y6.InterfaceC2840a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int iIntValue;
        switch (this.f2707j) {
            case 0:
                C0648a1 c0648a1 = this.f2708k;
                EditText editText = c0648a1.f2557g;
                if (editText == null) {
                    AbstractC2980h.m5139h("input");
                    throw null;
                }
                editText.setFocusable(true);
                C0672j c0672j = C0672j.f2641a;
                MainActivity mainActivity = c0648a1.f2551a;
                EditText editText2 = c0648a1.f2557g;
                if (editText2 == null) {
                    AbstractC2980h.m5139h("input");
                    throw null;
                }
                C0672j.m1447f(c0672j, mainActivity, editText2, 16, null, c0648a1.f2553c, null, 416);
                this.f2709l.setDescendantFocusability(131072);
                return C1693j.f6497a;
            default:
                LinearLayout linearLayout = this.f2709l;
                ViewParent parent = linearLayout.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    if (linearLayout.getWidth() > 0 && viewGroup.getWidth() > 0) {
                        int width = ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / linearLayout.getWidth();
                        if (width < 1) {
                            width = 1;
                        }
                        iIntValue = viewGroup.indexOfChild(linearLayout) % width == 0 ? ((Number) this.f2708k.f2553c.invoke()).intValue() : -1;
                    }
                }
                return Integer.valueOf(iIntValue);
        }
    }
}
