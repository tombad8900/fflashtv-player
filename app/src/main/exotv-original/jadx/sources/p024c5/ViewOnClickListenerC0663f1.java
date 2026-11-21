package p024c5;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.exotv.net.R;
import com.exotv.net.SeriesDetailActivity;
import p212y6.InterfaceC2840a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.f1 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0663f1 implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f2598j;

    /* renamed from: k */
    public final /* synthetic */ KeyEvent.Callback f2599k;

    /* renamed from: l */
    public final /* synthetic */ Object f2600l;

    /* renamed from: m */
    public final /* synthetic */ Object f2601m;

    public /* synthetic */ ViewOnClickListenerC0663f1(KeyEvent.Callback callback, Object obj, Object obj2, int i) {
        this.f2598j = i;
        this.f2599k = callback;
        this.f2600l = obj;
        this.f2601m = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2598j) {
            case 0:
                TextView textView = (TextView) this.f2599k;
                TextView textView2 = (TextView) this.f2600l;
                Context context = (Context) this.f2601m;
                if (textView.getMaxLines() != Integer.MAX_VALUE) {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    textView.setEllipsize(null);
                    textView2.setText(context.getString(R.string.see_less));
                    break;
                } else {
                    textView.setMaxLines(3);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(context.getString(R.string.see_more));
                    break;
                }
            default:
                SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) this.f2599k;
                String str = (String) this.f2600l;
                InterfaceC2840a interfaceC2840a = (InterfaceC2840a) this.f2601m;
                seriesDetailActivity.f3015S = str;
                interfaceC2840a.invoke();
                break;
        }
    }
}
