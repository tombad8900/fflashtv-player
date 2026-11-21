package p189v7;

import java.io.IOException;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.r */
/* loaded from: classes.dex */
public abstract class AbstractC2587r implements InterfaceC2576k0 {
    private final InterfaceC2576k0 delegate;

    public AbstractC2587r(InterfaceC2576k0 interfaceC2576k0) {
        AbstractC2980h.m5136e("delegate", interfaceC2576k0);
        this.delegate = interfaceC2576k0;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC2576k0 m5291deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC2576k0 delegate() {
        return this.delegate;
    }

    @Override // p189v7.InterfaceC2576k0
    public long read(C2573j c2573j, long j) {
        AbstractC2980h.m5136e("sink", c2573j);
        return this.delegate.read(c2573j, j);
    }

    @Override // p189v7.InterfaceC2576k0
    public C2582n0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
