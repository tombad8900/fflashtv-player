package okhttp3.internal.http2;

import java.io.IOException;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.p */
/* loaded from: classes.dex */
public final class C2132p extends IOException {
    public final EnumC2118b errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132p(EnumC2118b enumC2118b) {
        super("stream was reset: " + enumC2118b);
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        this.errorCode = enumC2118b;
    }
}
