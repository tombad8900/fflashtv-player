package com.google.android.material.datepicker;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0036o;
import p029d0.AbstractC0786b;
import p183v0.AbstractC2508h;
import p216z2.AbstractC2888f0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class RunnableC0748f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f3246j;

    /* renamed from: k */
    public final int f3247k;

    /* renamed from: l */
    public final Object f3248l;

    public /* synthetic */ RunnableC0748f(int i, int i4, Object obj) {
        this.f3246j = i4;
        this.f3248l = obj;
        this.f3247k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3246j) {
            case 0:
                RecyclerView recyclerView = ((C0755m) this.f3248l).f3264j0;
                if (!recyclerView.f2026G) {
                    AbstractC2888f0 abstractC2888f0 = recyclerView.f2080w;
                    if (abstractC2888f0 != null) {
                        abstractC2888f0.mo1141z0(recyclerView, this.f3247k);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
            case 1:
                AbstractC0786b abstractC0786b = (AbstractC0786b) ((C0036o) this.f3248l).f143k;
                if (abstractC0786b != null) {
                    abstractC0786b.mo1942g(this.f3247k);
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f3248l;
                int size = arrayList.size();
                int i = 0;
                if (this.f3247k == 1) {
                    while (i < size) {
                        ((AbstractC2508h) arrayList.get(i)).mo4521a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((AbstractC2508h) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
        }
    }

    public RunnableC0748f(List list, int i, Throwable th) {
        this.f3246j = 2;
        AbstractC0714c.m1529o("initCallbacks cannot be null", list);
        this.f3248l = new ArrayList(list);
        this.f3247k = i;
    }
}
