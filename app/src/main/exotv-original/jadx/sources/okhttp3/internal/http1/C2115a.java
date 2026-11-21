package okhttp3.internal.http1;

import okhttp3.C2180y;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http1.a */
/* loaded from: classes.dex */
public final class C2115a {
    public static final a Companion = new a(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final InterfaceC2577l source;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private a() {
        }
    }

    public C2115a(InterfaceC2577l interfaceC2577l) {
        AbstractC2980h.m5136e("source", interfaceC2577l);
        this.source = interfaceC2577l;
        this.headerLimit = 262144L;
    }

    public final InterfaceC2577l getSource() {
        return this.source;
    }

    public final C2180y readHeaders() {
        C2180y.a aVar = new C2180y.a();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return aVar.build();
            }
            aVar.addLenient$okhttp(line);
        }
    }

    public final String readLine() {
        String strMo4617n = this.source.mo4617n(this.headerLimit);
        this.headerLimit -= strMo4617n.length();
        return strMo4617n;
    }
}
