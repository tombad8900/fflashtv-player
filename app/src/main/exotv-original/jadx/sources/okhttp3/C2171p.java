package okhttp3;

import java.util.List;
import p111m6.C1921p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.p */
/* loaded from: classes.dex */
public final class C2171p {
    static final /* synthetic */ C2171p $$INSTANCE = new C2171p();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.p$a */
    public static final class a implements InterfaceC2172q {
        @Override // okhttp3.InterfaceC2172q
        public List<C2169o> loadForRequest(C2181z c2181z) {
            AbstractC2980h.m5136e("url", c2181z);
            return C1921p.f7187j;
        }

        @Override // okhttp3.InterfaceC2172q
        public void saveFromResponse(C2181z c2181z, List<C2169o> list) {
            AbstractC2980h.m5136e("url", c2181z);
            AbstractC2980h.m5136e("cookies", list);
        }
    }

    private C2171p() {
    }
}
