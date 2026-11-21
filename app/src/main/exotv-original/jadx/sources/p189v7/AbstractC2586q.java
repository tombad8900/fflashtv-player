package p189v7;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.q */
/* loaded from: classes.dex */
public abstract class AbstractC2586q implements InterfaceC2572i0 {
    private final InterfaceC2572i0 delegate;

    public AbstractC2586q(InterfaceC2572i0 interfaceC2572i0) {
        AbstractC2980h.m5136e("delegate", interfaceC2572i0);
        this.delegate = interfaceC2572i0;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC2572i0 m5290deprecated_delegate() {
        return this.delegate;
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC2572i0 delegate() {
        return this.delegate;
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p189v7.InterfaceC2572i0
    public C2582n0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p189v7.InterfaceC2572i0
    public void write(C2573j c2573j, long j) {
        AbstractC2980h.m5136e("source", c2573j);
        this.delegate.write(c2573j, j);
    }
}
