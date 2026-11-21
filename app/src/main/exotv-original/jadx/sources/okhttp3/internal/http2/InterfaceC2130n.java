package okhttp3.internal.http2;

import java.util.List;
import okhttp3.internal.http2.C2129m;
import p189v7.InterfaceC2577l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.n */
/* loaded from: classes.dex */
public interface InterfaceC2130n {
    public static final C2129m Companion = C2129m.$$INSTANCE;
    public static final InterfaceC2130n CANCEL = new C2129m.a();

    boolean onData(int i, InterfaceC2577l interfaceC2577l, int i4, boolean z7);

    boolean onHeaders(int i, List<C2119c> list, boolean z7);

    boolean onRequest(int i, List<C2119c> list);

    void onReset(int i, EnumC2118b enumC2118b);
}
