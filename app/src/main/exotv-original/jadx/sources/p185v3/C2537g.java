package p185v3;

import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import okhttp3.C2080i0;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2077h;
import p076i7.C1295g;
import p102l6.C1693j;
import p212y6.InterfaceC2851l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v3.g */
/* loaded from: classes.dex */
public final class C2537g implements InterfaceC2077h, InterfaceC2851l {

    /* renamed from: j */
    public final InterfaceC2075g f9219j;

    /* renamed from: k */
    public final C1295g f9220k;

    public C2537g(InterfaceC2075g interfaceC2075g, C1295g c1295g) {
        this.f9219j = interfaceC2075g;
        this.f9220k = c1295g;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        try {
            this.f9219j.cancel();
        } catch (Throwable unused) {
        }
        return C1693j.f6497a;
    }

    @Override // okhttp3.InterfaceC2077h
    public final void onFailure(InterfaceC2075g interfaceC2075g, IOException iOException) {
        if (interfaceC2075g.isCanceled()) {
            return;
        }
        this.f9220k.mo2248d(AbstractC0714c.m1539y(iOException));
    }

    @Override // okhttp3.InterfaceC2077h
    public final void onResponse(InterfaceC2075g interfaceC2075g, C2080i0 c2080i0) {
        this.f9220k.mo2248d(c2080i0);
    }
}
