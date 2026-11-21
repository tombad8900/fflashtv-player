package p024c5;

import android.os.CountDownTimer;
import android.widget.Button;
import androidx.lifecycle.RunnableC0127c0;
import com.exotv.net.R;
import com.exotv.net.p027ui.AdActivity;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.e */
/* loaded from: classes.dex */
public final class CountDownTimerC0658e extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ AdActivity f2589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC0658e(long j, AdActivity adActivity) {
        super(1L, 1L);
        this.f2589a = adActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        AdActivity adActivity = this.f2589a;
        Button button = adActivity.f3038I;
        if (button == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        button.setText(adActivity.getString(R.string.ad_close));
        Button button2 = adActivity.f3038I;
        if (button2 == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        button2.setEnabled(true);
        if (adActivity.getResources().getBoolean(R.bool.is_tv_layout)) {
            Button button3 = adActivity.f3038I;
            if (button3 != null) {
                button3.post(new RunnableC0127c0(12, adActivity));
            } else {
                AbstractC2980h.m5139h("close");
                throw null;
            }
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        AdActivity adActivity = this.f2589a;
        Button button = adActivity.f3038I;
        if (button != null) {
            button.setText(adActivity.getString(R.string.ad_close_countdown, Integer.valueOf((int) ((j + 999) / 1000))));
        } else {
            AbstractC2980h.m5139h("close");
            throw null;
        }
    }
}
