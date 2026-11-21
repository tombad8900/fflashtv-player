package p082j3;

import java.io.EOFException;
import java.io.IOException;
import p024c5.C0654c1;
import p189v7.AbstractC2586q;
import p189v7.C2573j;
import p189v7.InterfaceC2572i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.g */
/* loaded from: classes.dex */
public final class C1494g extends AbstractC2586q {

    /* renamed from: j */
    public final C0654c1 f5757j;

    /* renamed from: k */
    public boolean f5758k;

    public C1494g(InterfaceC2572i0 interfaceC2572i0, C0654c1 c0654c1) {
        super(interfaceC2572i0);
        this.f5757j = c0654c1;
    }

    @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f5758k = true;
            this.f5757j.invoke(e);
        }
    }

    @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f5758k = true;
            this.f5757j.invoke(e);
        }
    }

    @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0
    public final void write(C2573j c2573j, long j) throws EOFException {
        if (this.f5758k) {
            c2573j.skip(j);
            return;
        }
        try {
            super.write(c2573j, j);
        } catch (IOException e) {
            this.f5758k = true;
            this.f5757j.invoke(e);
        }
    }
}
