package okhttp3.internal.http2;

import java.util.List;
import p189v7.C2579m;
import p189v7.InterfaceC2577l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.i */
/* loaded from: classes.dex */
public interface InterfaceC2125i {
    void ackSettings();

    void alternateService(int i, String str, C2579m c2579m, String str2, int i4, long j);

    void data(boolean z7, int i, InterfaceC2577l interfaceC2577l, int i4);

    void goAway(int i, EnumC2118b enumC2118b, C2579m c2579m);

    void headers(boolean z7, int i, int i4, List<C2119c> list);

    void ping(boolean z7, int i, int i4);

    void priority(int i, int i4, int i8, boolean z7);

    void pushPromise(int i, int i4, List<C2119c> list);

    void rstStream(int i, EnumC2118b enumC2118b);

    void settings(boolean z7, C2131o c2131o);

    void windowUpdate(int i, long j);
}
