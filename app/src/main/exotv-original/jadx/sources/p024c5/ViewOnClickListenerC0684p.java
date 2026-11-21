package p024c5;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.exotv.net.MainActivity;
import com.exotv.net.MovieDetailActivity;
import com.exotv.net.PlayerActivity;
import com.exotv.net.SeriesDetailActivity;
import com.exotv.net.model.Channel;
import p006a5.C0107b;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p111m6.C1921p;
import p195w4.C2658e;
import p195w4.C2676m0;
import p195w4.C2699y;
import p204x4.C2769l;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.p */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0684p implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f2679j;

    /* renamed from: k */
    public final /* synthetic */ Object f2680k;

    /* renamed from: l */
    public final /* synthetic */ Object f2681l;

    public /* synthetic */ ViewOnClickListenerC0684p(Object obj, int i, Object obj2) {
        this.f2679j = i;
        this.f2680k = obj;
        this.f2681l = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2679j;
        Object obj = this.f2681l;
        Object obj2 = this.f2680k;
        switch (i) {
            case 0:
                ((C2658e) ((C0692t) obj2).f2701e).invoke((Channel) obj);
                return;
            case 1:
                ((C0702y) obj2).f2736a.invoke((EnumC0698w) obj);
                return;
            case 2:
                ((InterfaceC2851l) obj2).invoke((C2769l) obj);
                return;
            case 3:
                ((C0675k0) obj2).f2658j.invoke((C2769l) obj);
                return;
            case 4:
                C0648a1 c0648a1 = (C0648a1) obj2;
                EnumC0699w0 enumC0699w0 = (EnumC0699w0) obj;
                if (c0648a1.f2556f != enumC0699w0) {
                    c0648a1.f2556f = enumC0699w0;
                    c0648a1.m1431e();
                    EditText editText = c0648a1.f2557g;
                    if (editText != null) {
                        c0648a1.m1429c(editText.getText().toString());
                        return;
                    } else {
                        AbstractC2980h.m5139h("input");
                        throw null;
                    }
                }
                return;
            case 5:
                C0648a1 c0648a12 = (C0648a1) obj2;
                C2769l c2769l = (C2769l) obj;
                String str = c2769l.f10242b;
                long j = c2769l.f10241a;
                MainActivity mainActivity = c0648a12.f2551a;
                if (c0648a12.f2556f == EnumC0699w0.f2724m) {
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SeriesDetailActivity.class).putExtra("series_id", j).putExtra("series_title", str));
                    return;
                } else {
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MovieDetailActivity.class).putExtra("movie_id", j).putExtra("movie_title", str));
                    return;
                }
            case 6:
                MovieDetailActivity movieDetailActivity = (MovieDetailActivity) obj2;
                C2699y c2699y = (C2699y) obj;
                if (movieDetailActivity.f2931T || movieDetailActivity.f2930S) {
                    return;
                }
                movieDetailActivity.m1703v(true);
                c2699y.invoke();
                return;
            default:
                PlayerActivity playerActivity = (PlayerActivity) obj;
                int i4 = PlayerActivity.f2936z0;
                String str2 = ((C2676m0) obj2).f9722a;
                if (str2 != null) {
                    playerActivity.m1721O(str2);
                    return;
                }
                C1278a0 c1278a0 = playerActivity.f2957b0;
                if (c1278a0 != null) {
                    AbstractC1339x.m2841b(c1278a0);
                }
                playerActivity.f2954Y = null;
                playerActivity.f2955Z = null;
                playerActivity.f2956a0 = 0;
                playerActivity.getSharedPreferences("exotv_subtitles", 0).edit().putString("language", "off").apply();
                playerActivity.m1733x();
                playerActivity.f2969n0 = C1921p.f7187j;
                playerActivity.f2939J.removeCallbacks(playerActivity.f2978w0);
                playerActivity.m1715I();
                playerActivity.m1718L();
                boolean zIsEmpty = playerActivity.f2969n0.isEmpty();
                C0107b c0107b = playerActivity.f2937H;
                if (c0107b != null) {
                    c0107b.f531h.setColorFilter(!zIsEmpty ? -2354116 : -1);
                    return;
                } else {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
        }
    }
}
