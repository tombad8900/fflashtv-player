package p010b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import p062h.AbstractActivityC1083i;
import p102l6.C1693j;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.k */
/* loaded from: classes.dex */
public final class C0521k extends AbstractC2981i implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f2135j;

    /* renamed from: k */
    public final /* synthetic */ AbstractActivityC1083i f2136k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0521k(AbstractActivityC1083i abstractActivityC1083i, int i) {
        super(0);
        this.f2135j = i;
        this.f2136k = abstractActivityC1083i;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        switch (this.f2135j) {
            case 0:
                this.f2136k.reportFullyDrawn();
                return C1693j.f6497a;
            case 1:
                AbstractActivityC1083i abstractActivityC1083i = this.f2136k;
                return new C0524n(abstractActivityC1083i.f2142o, new C0521k(abstractActivityC1083i, 0));
            default:
                AbstractActivityC1083i abstractActivityC1083i2 = this.f2136k;
                C0534x c0534x = new C0534x(new RunnableC0514d(abstractActivityC1083i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC2980h.m5132a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC1083i2.f2201j.mo568a(new C0516f(c0534x, abstractActivityC1083i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0320i(abstractActivityC1083i2, 3, c0534x));
                    }
                }
                return c0534x;
        }
    }
}
