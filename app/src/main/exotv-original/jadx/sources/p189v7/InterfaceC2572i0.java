package p189v7;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.i0 */
/* loaded from: classes.dex */
public interface InterfaceC2572i0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C2582n0 timeout();

    void write(C2573j c2573j, long j);
}
