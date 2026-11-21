package p007a6;

import android.os.Handler;
import android.os.Message;
import p002a1.C0036o;
import p100l4.C1676d;
import p100l4.C1678f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a6.d */
/* loaded from: classes.dex */
public final class C0112d implements Handler.Callback {

    /* renamed from: j */
    public final /* synthetic */ int f566j;

    /* renamed from: k */
    public final /* synthetic */ Object f567k;

    public /* synthetic */ C0112d(int i, Object obj) {
        this.f566j = i;
        this.f567k = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f566j) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                C0036o c0036o = (C0036o) this.f567k;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (c0036o.f143k) {
                    throw null;
                }
            default:
                C1678f c1678f = (C1678f) this.f567k;
                int i = message.what;
                if (i == 1) {
                    c1678f.m3378b((C1676d) message.obj);
                    return true;
                }
                if (i == 2) {
                    c1678f.f6440d.m1659l((C1676d) message.obj);
                }
                return false;
        }
    }
}
