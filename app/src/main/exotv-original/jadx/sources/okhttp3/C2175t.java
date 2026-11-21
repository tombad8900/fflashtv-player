package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p111m6.AbstractC1912g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.t */
/* loaded from: classes.dex */
public final class C2175t {
    static final /* synthetic */ C2175t $$INSTANCE = new C2175t();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.t$a */
    public static final class a implements InterfaceC2176u {
        @Override // okhttp3.InterfaceC2176u
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            AbstractC2980h.m5136e("hostname", str);
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                AbstractC2980h.m5135d("getAllByName(hostname)", allByName);
                return AbstractC1912g.m3735s0(allByName);
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    private C2175t() {
    }
}
