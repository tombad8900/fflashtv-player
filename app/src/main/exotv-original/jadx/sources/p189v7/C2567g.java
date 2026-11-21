package p189v7;

import java.io.EOFException;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.g */
/* loaded from: classes.dex */
public final class C2567g implements InterfaceC2572i0 {
    @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p189v7.InterfaceC2572i0, java.io.Flushable
    public final void flush() {
    }

    @Override // p189v7.InterfaceC2572i0
    public final C2582n0 timeout() {
        return C2582n0.NONE;
    }

    @Override // p189v7.InterfaceC2572i0
    public final void write(C2573j c2573j, long j) throws EOFException {
        AbstractC2980h.m5136e("source", c2573j);
        c2573j.skip(j);
    }
}
