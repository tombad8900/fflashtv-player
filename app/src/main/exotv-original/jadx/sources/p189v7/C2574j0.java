package p189v7;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.j0 */
/* loaded from: classes.dex */
public final class C2574j0 extends C2565f {

    /* renamed from: a */
    public final Socket f9315a;

    public C2574j0(Socket socket) {
        AbstractC2980h.m5136e("socket", socket);
        this.f9315a = socket;
    }

    @Override // p189v7.C2565f
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p189v7.C2565f
    public final void timedOut() throws IOException {
        Socket socket = this.f9315a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC2557b.m4581f(e)) {
                throw e;
            }
            AbstractC2594y.f9345a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e8) {
            AbstractC2594y.f9345a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        }
    }
}
