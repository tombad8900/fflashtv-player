package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0236r1;
import androidx.media3.common.C0251w1;
import androidx.media3.p009ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;
import p052f6.AbstractC0983m0;
import p062h.C1076e;
import p087k.AbstractC1536a;
import p095l.C1630p;
import p104m.C1723g2;
import p193w2.C2618i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0754l implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f3256j;

    /* renamed from: k */
    public final /* synthetic */ Object f3257k;

    public /* synthetic */ ViewOnClickListenerC0754l(int i, Object obj) {
        this.f3256j = i;
        this.f3257k = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f3256j) {
            case 0:
                C0755m c0755m = (C0755m) this.f3257k;
                int i = c0755m.f3261g0;
                if (i == 2) {
                    c0755m.m1852K(1);
                } else if (i == 1) {
                    c0755m.m1852K(2);
                }
                c0755m.m1853L(c0755m.f222N);
                break;
            case 1:
                C1076e c1076e = (C1076e) this.f3257k;
                Message messageObtain = (view != c1076e.f4541h || (message3 = c1076e.f4543j) == null) ? (view != c1076e.f4544k || (message2 = c1076e.f4546m) == null) ? (view != c1076e.f4547n || (message = c1076e.f4549p) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c1076e.f4532D.obtainMessage(1, c1076e.f4535b).sendToTarget();
                break;
            case 2:
                ((AbstractC1536a) this.f3257k).mo2257a();
                break;
            case 3:
                C1723g2 c1723g2 = ((Toolbar) this.f3257k).f756U;
                C1630p c1630p = c1723g2 == null ? null : c1723g2.f6553k;
                if (c1630p != null) {
                    c1630p.collapseActionView();
                    break;
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f3257k;
                HashMap map = trackSelectionView.f1975p;
                boolean z7 = true;
                if (view == trackSelectionView.f1971l) {
                    trackSelectionView.f1980u = true;
                    map.clear();
                } else if (view == trackSelectionView.f1972m) {
                    trackSelectionView.f1980u = false;
                    map.clear();
                } else {
                    trackSelectionView.f1980u = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C2618i0 c2618i0 = (C2618i0) tag;
                    C0251w1 c0251w1 = c2618i0.f9461a;
                    C0233q1 c0233q1 = c0251w1.f1538b;
                    int i4 = c2618i0.f9462b;
                    C0236r1 c0236r1 = (C0236r1) map.get(c0233q1);
                    if (c0236r1 == null) {
                        if (!trackSelectionView.f1977r && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c0233q1, new C0236r1(c0233q1, AbstractC0983m0.m2168n(Integer.valueOf(i4))));
                    } else {
                        ArrayList arrayList = new ArrayList(c0236r1.f1404b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z8 = trackSelectionView.f1976q && c0251w1.f1539c;
                        if (!z8 && (!trackSelectionView.f1977r || trackSelectionView.f1974o.size() <= 1)) {
                            z7 = false;
                        }
                        if (zIsChecked && z7) {
                            arrayList.remove(Integer.valueOf(i4));
                            if (arrayList.isEmpty()) {
                                map.remove(c0233q1);
                            } else {
                                map.put(c0233q1, new C0236r1(c0233q1, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z8) {
                                arrayList.add(Integer.valueOf(i4));
                                map.put(c0233q1, new C0236r1(c0233q1, arrayList));
                            } else {
                                map.put(c0233q1, new C0236r1(c0233q1, AbstractC0983m0.m2168n(Integer.valueOf(i4))));
                            }
                        }
                    }
                }
                trackSelectionView.m1059a();
                break;
        }
    }
}
