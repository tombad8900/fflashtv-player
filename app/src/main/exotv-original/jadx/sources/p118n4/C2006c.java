package p118n4;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bumptech.glide.C0723l;
import java.util.HashSet;
import p005a4.C0095p;
import p082j3.C1488a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.c */
/* loaded from: classes.dex */
public final class C2006c implements InterfaceC2005b {

    /* renamed from: j */
    public final Context f7426j;

    /* renamed from: k */
    public final C0723l f7427k;

    public C2006c(Context context, C0723l c0723l) {
        this.f7426j = context.getApplicationContext();
        this.f7427k = c0723l;
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: d */
    public final void mo1632d() {
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: f */
    public final void mo1634f() {
        C2019p c2019pM3885b = C2019p.m3885b(this.f7426j);
        C0723l c0723l = this.f7427k;
        synchronized (c2019pM3885b) {
            ((HashSet) c2019pM3885b.f7451m).remove(c0723l);
            if (c2019pM3885b.f7449k && ((HashSet) c2019pM3885b.f7451m).isEmpty()) {
                C1488a c1488a = (C1488a) c2019pM3885b.f7450l;
                ((ConnectivityManager) ((C0095p) c1488a.f5723c).get()).unregisterNetworkCallback((C2018o) c1488a.f5724d);
                c2019pM3885b.f7449k = false;
            }
        }
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: k */
    public final void mo1639k() {
        C2019p c2019pM3885b = C2019p.m3885b(this.f7426j);
        C0723l c0723l = this.f7427k;
        synchronized (c2019pM3885b) {
            ((HashSet) c2019pM3885b.f7451m).add(c0723l);
            c2019pM3885b.m3887c();
        }
    }
}
