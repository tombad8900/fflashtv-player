package okhttp3.internal.http;

import okhttp3.AbstractC2160j0;
import okhttp3.C2070d0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.j */
/* loaded from: classes.dex */
public final class C2111j extends AbstractC2160j0 {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC2577l source;

    public C2111j(String str, long j, InterfaceC2577l interfaceC2577l) {
        AbstractC2980h.m5136e("source", interfaceC2577l);
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = interfaceC2577l;
    }

    @Override // okhttp3.AbstractC2160j0
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.AbstractC2160j0
    public C2070d0 contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return C2070d0.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.AbstractC2160j0
    public InterfaceC2577l source() {
        return this.source;
    }
}
