package okhttp3.internal.connection;

import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.j */
/* loaded from: classes.dex */
public final class C2100j extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2100j(IOException iOException) {
        super(iOException);
        AbstractC2980h.m5136e("firstConnectException", iOException);
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        AbstractC2980h.m5136e("e", iOException);
        AbstractC0715d.m1557e(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
