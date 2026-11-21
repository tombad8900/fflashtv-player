package okhttp3;

import java.util.List;
import okhttp3.C2171p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.q */
/* loaded from: classes.dex */
public interface InterfaceC2172q {
    public static final C2171p Companion = C2171p.$$INSTANCE;
    public static final InterfaceC2172q NO_COOKIES = new C2171p.a();

    List<C2169o> loadForRequest(C2181z c2181z);

    void saveFromResponse(C2181z c2181z, List<C2169o> list);
}
