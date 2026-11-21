package p195w4;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.exotv.net.SeriesDetailActivity;
import java.util.ArrayList;
import p111m6.AbstractC1913h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.v0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC2694v0 implements View.OnKeyListener {

    /* renamed from: j */
    public final /* synthetic */ int f9787j;

    /* renamed from: k */
    public final /* synthetic */ SeriesDetailActivity f9788k;

    public /* synthetic */ ViewOnKeyListenerC2694v0(int i, SeriesDetailActivity seriesDetailActivity) {
        this.f9787j = i;
        this.f9788k = seriesDetailActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        View view2;
        TextView textView;
        View view3;
        LinearLayout linearLayout;
        int i4 = this.f9787j;
        SeriesDetailActivity seriesDetailActivity = this.f9788k;
        switch (i4) {
            case 0:
                int i8 = SeriesDetailActivity.f3003k0;
                if (i != 20 || keyEvent.getAction() != 0 || (view2 = seriesDetailActivity.f3013Q) == null) {
                    break;
                } else {
                    view2.requestFocus();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = seriesDetailActivity.f3010N;
                int i9 = SeriesDetailActivity.f3003k0;
                if (i == 19 && keyEvent.getAction() == 0 && AbstractC1913h.m3737B0(arrayList) == view) {
                    LinearLayout linearLayout2 = seriesDetailActivity.f3011O;
                    if (linearLayout2 != null) {
                        linearLayout2.requestFocus();
                        break;
                    }
                } else if (i != 20 || keyEvent.getAction() != 0 || AbstractC1913h.m3742G0(arrayList) != view) {
                    if (i == 20 && keyEvent.getAction() == 0 && AbstractC1913h.m3742G0(arrayList) == view && (textView = seriesDetailActivity.f3012P) != null) {
                        textView.requestFocus();
                        break;
                    }
                } else {
                    int size = seriesDetailActivity.f3029g0.size();
                    if ((size <= 0 ? 0 : (size + 19) / 20) <= 1) {
                        View view4 = seriesDetailActivity.f3013Q;
                        if (view4 != null) {
                            view4.requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                int i10 = SeriesDetailActivity.f3003k0;
                if (i != 20 || keyEvent.getAction() != 0 || (view3 = seriesDetailActivity.f3013Q) == null) {
                    break;
                } else {
                    view3.requestFocus();
                    break;
                }
            default:
                int i11 = SeriesDetailActivity.f3003k0;
                if (i != 20 || keyEvent.getAction() != 0 || (linearLayout = seriesDetailActivity.f3011O) == null) {
                    break;
                } else {
                    linearLayout.requestFocus();
                    break;
                }
                break;
        }
        return false;
    }
}
