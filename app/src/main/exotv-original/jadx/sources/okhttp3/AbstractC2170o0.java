package okhttp3;

import p189v7.C2579m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC2170o0 {
    public void onClosed(InterfaceC2168n0 interfaceC2168n0, int i, String str) {
        AbstractC2980h.m5136e("webSocket", interfaceC2168n0);
        AbstractC2980h.m5136e("reason", str);
    }

    public void onClosing(InterfaceC2168n0 interfaceC2168n0, int i, String str) {
        AbstractC2980h.m5136e("webSocket", interfaceC2168n0);
        AbstractC2980h.m5136e("reason", str);
    }

    public void onFailure(InterfaceC2168n0 interfaceC2168n0, Throwable th, C2080i0 c2080i0) {
        AbstractC2980h.m5136e("webSocket", interfaceC2168n0);
        AbstractC2980h.m5136e("t", th);
    }

    public void onMessage(InterfaceC2168n0 interfaceC2168n0, String str) {
        AbstractC2980h.m5136e("webSocket", interfaceC2168n0);
        AbstractC2980h.m5136e("text", str);
    }

    public void onOpen(InterfaceC2168n0 interfaceC2168n0, C2080i0 c2080i0) {
        AbstractC2980h.m5136e("webSocket", interfaceC2168n0);
        AbstractC2980h.m5136e("response", c2080i0);
    }

    public void onMessage(InterfaceC2168n0 interfaceC2168n0, C2579m c2579m) {
        AbstractC2980h.m5136e("webSocket", interfaceC2168n0);
        AbstractC2980h.m5136e("bytes", c2579m);
    }
}
