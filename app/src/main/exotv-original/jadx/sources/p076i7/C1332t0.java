package p076i7;

import java.util.concurrent.CancellationException;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.t0 */
/* loaded from: classes.dex */
public final class C1332t0 extends CancellationException {

    /* renamed from: j */
    public final transient C1279a1 f5370j;

    public C1332t0(String str, Throwable th, C1279a1 c1279a1) {
        super(str);
        this.f5370j = c1279a1;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1332t0)) {
            return false;
        }
        C1332t0 c1332t0 = (C1332t0) obj;
        return AbstractC2980h.m5132a(c1332t0.getMessage(), getMessage()) && AbstractC2980h.m5132a(c1332t0.f5370j, this.f5370j) && AbstractC2980h.m5132a(c1332t0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC2980h.m5133b(message);
        int iHashCode = (this.f5370j.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f5370j;
    }
}
