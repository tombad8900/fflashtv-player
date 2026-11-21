package okhttp3;

import p189v7.C2582n0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.g */
/* loaded from: classes.dex */
public interface InterfaceC2075g extends Cloneable {
    void cancel();

    InterfaceC2075g clone();

    void enqueue(InterfaceC2077h interfaceC2077h);

    C2080i0 execute();

    boolean isCanceled();

    boolean isExecuted();

    C2076g0 request();

    C2582n0 timeout();
}
