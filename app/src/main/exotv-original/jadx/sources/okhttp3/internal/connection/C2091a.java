package okhttp3.internal.connection;

import okhttp3.C2080i0;
import okhttp3.InterfaceC2064a0;
import okhttp3.InterfaceC2068c0;
import okhttp3.internal.http.C2110i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.a */
/* loaded from: classes.dex */
public final class C2091a implements InterfaceC2068c0 {
    public static final C2091a INSTANCE = new C2091a();

    private C2091a() {
    }

    @Override // okhttp3.InterfaceC2068c0
    public C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) {
        AbstractC2980h.m5136e("chain", interfaceC2064a0);
        C2110i c2110i = (C2110i) interfaceC2064a0;
        return C2110i.copy$okhttp$default(c2110i, 0, c2110i.getCall$okhttp().initExchange$okhttp(c2110i), null, 0, 0, 0, 61, null).proceed(c2110i.getRequest$okhttp());
    }
}
