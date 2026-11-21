package p062h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bumptech.glide.AbstractC0715d;
import java.util.WeakHashMap;
import p002a1.C0016e;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.r */
/* loaded from: classes.dex */
public final class C1092r extends AbstractC0715d {

    /* renamed from: n */
    public final /* synthetic */ int f4625n;

    /* renamed from: o */
    public final /* synthetic */ Object f4626o;

    public /* synthetic */ C1092r(int i, Object obj) {
        this.f4625n = i;
        this.f4626o = obj;
    }

    @Override // com.bumptech.glide.AbstractC0715d, p105m0.InterfaceC1846s0
    /* renamed from: b */
    public void mo1589b() {
        int i = this.f4625n;
        Object obj = this.f4626o;
        switch (i) {
            case 0:
                ((RunnableC1090p) obj).f4622k.f4661E.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) obj;
                layoutInflaterFactory2C1098x.f4661E.setVisibility(0);
                if (layoutInflaterFactory2C1098x.f4661E.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1098x.f4661E.getParent();
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    AbstractC1798c0.m3516c(view);
                    break;
                }
                break;
        }
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: c */
    public final void mo2256c() {
        int i = this.f4625n;
        Object obj = this.f4626o;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = ((RunnableC1090p) obj).f4622k;
                layoutInflaterFactory2C1098x.f4661E.setAlpha(1.0f);
                layoutInflaterFactory2C1098x.f4664H.m3618d(null);
                layoutInflaterFactory2C1098x.f4664H = null;
                break;
            case 1:
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x2 = (LayoutInflaterFactory2C1098x) obj;
                layoutInflaterFactory2C1098x2.f4661E.setAlpha(1.0f);
                layoutInflaterFactory2C1098x2.f4664H.m3618d(null);
                layoutInflaterFactory2C1098x2.f4664H = null;
                break;
            default:
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x3 = (LayoutInflaterFactory2C1098x) ((C0016e) obj).f63l;
                layoutInflaterFactory2C1098x3.f4661E.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C1098x3.f4662F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1098x3.f4661E.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1098x3.f4661E.getParent();
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    AbstractC1798c0.m3516c(view);
                }
                layoutInflaterFactory2C1098x3.f4661E.m449e();
                layoutInflaterFactory2C1098x3.f4664H.m3618d(null);
                layoutInflaterFactory2C1098x3.f4664H = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1098x3.f4666J;
                WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                AbstractC1798c0.m3516c(viewGroup);
                break;
        }
    }
}
