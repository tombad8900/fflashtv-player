package p089k1;

import androidx.media3.common.C0253x0;
import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.u */
/* loaded from: classes.dex */
public class C1577u extends C1565i {

    /* renamed from: l */
    public final int f6042l;

    public C1577u() {
        super(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
        this.f6042l = 1;
    }

    /* renamed from: a */
    public static C1577u m3247a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i4 = iOException instanceof SocketTimeoutException ? C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC0714c.m1517e0(message).matches("cleartext.*not permitted.*")) ? C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : 2007;
        return i4 == 2007 ? new C1576t(C0253x0.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new C1577u(iOException, i4, i);
    }

    public C1577u(String str, int i) {
        super(str, i == 2000 ? C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i);
        this.f6042l = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1577u(IOException iOException, int i, int i4) {
        if (i == 2000 && i4 == 1) {
            i = C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED;
        }
        super(iOException, i);
        this.f6042l = i4;
    }

    public C1577u(int i, IOException iOException, String str) {
        super(str, iOException, i == 2000 ? C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i);
        this.f6042l = 1;
    }
}
