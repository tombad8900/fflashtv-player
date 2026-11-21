package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import p189v7.AbstractC2586q;
import p189v7.C2573j;
import p189v7.InterfaceC2572i0;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.cache.e */
/* loaded from: classes.dex */
public class C2085e extends AbstractC2586q {
    private boolean hasErrors;
    private final InterfaceC2851l onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2085e(InterfaceC2572i0 interfaceC2572i0, InterfaceC2851l interfaceC2851l) {
        super(interfaceC2572i0);
        AbstractC2980h.m5136e("delegate", interfaceC2572i0);
        AbstractC2980h.m5136e("onException", interfaceC2851l);
        this.onException = interfaceC2851l;
    }

    @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final InterfaceC2851l getOnException() {
        return this.onException;
    }

    @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0
    public void write(C2573j c2573j, long j) throws EOFException {
        AbstractC2980h.m5136e("source", c2573j);
        if (this.hasErrors) {
            c2573j.skip(j);
            return;
        }
        try {
            super.write(c2573j, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
