package okhttp3.internal.http2;

import java.util.List;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.m */
/* loaded from: classes.dex */
public final class C2129m {
    static final /* synthetic */ C2129m $$INSTANCE = new C2129m();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.m$a */
    public static final class a implements InterfaceC2130n {
        @Override // okhttp3.internal.http2.InterfaceC2130n
        public boolean onData(int i, InterfaceC2577l interfaceC2577l, int i4, boolean z7) {
            AbstractC2980h.m5136e("source", interfaceC2577l);
            interfaceC2577l.skip(i4);
            return true;
        }

        @Override // okhttp3.internal.http2.InterfaceC2130n
        public boolean onHeaders(int i, List<C2119c> list, boolean z7) {
            AbstractC2980h.m5136e("responseHeaders", list);
            return true;
        }

        @Override // okhttp3.internal.http2.InterfaceC2130n
        public boolean onRequest(int i, List<C2119c> list) {
            AbstractC2980h.m5136e("requestHeaders", list);
            return true;
        }

        @Override // okhttp3.internal.http2.InterfaceC2130n
        public void onReset(int i, EnumC2118b enumC2118b) {
            AbstractC2980h.m5136e("errorCode", enumC2118b);
        }
    }

    private C2129m() {
    }
}
