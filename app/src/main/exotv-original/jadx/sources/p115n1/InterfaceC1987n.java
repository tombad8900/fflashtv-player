package p115n1;

import java.util.List;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.n */
/* loaded from: classes.dex */
public interface InterfaceC1987n {
    default List getSniffFailureDetails() {
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    default InterfaceC1987n getUnderlyingImplementation() {
        return this;
    }

    void init(InterfaceC1989p interfaceC1989p);

    int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0);

    void release();

    void seek(long j, long j8);

    boolean sniff(InterfaceC1988o interfaceC1988o);
}
