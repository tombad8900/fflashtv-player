package p112m7;

import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.e */
/* loaded from: classes.dex */
public final class C1929e extends RuntimeException {

    /* renamed from: j */
    public final transient InterfaceC2227h f7201j;

    public C1929e(InterfaceC2227h interfaceC2227h) {
        this.f7201j = interfaceC2227h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f7201j.toString();
    }
}
