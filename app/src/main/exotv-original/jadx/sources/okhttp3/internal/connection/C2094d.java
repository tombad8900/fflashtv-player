package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.AbstractC2177v;
import okhttp3.C2063a;
import okhttp3.C2072e0;
import okhttp3.C2162k0;
import okhttp3.C2181z;
import okhttp3.internal.connection.C2101k;
import okhttp3.internal.http.C2110i;
import okhttp3.internal.http.InterfaceC2107f;
import okhttp3.internal.http2.C2117a;
import okhttp3.internal.http2.C2132p;
import okhttp3.internal.http2.EnumC2118b;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.d */
/* loaded from: classes.dex */
public final class C2094d {
    private final C2063a address;
    private final C2095e call;
    private final C2098h connectionPool;
    private int connectionShutdownCount;
    private final AbstractC2177v eventListener;
    private C2162k0 nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private C2101k.b routeSelection;
    private C2101k routeSelector;

    public C2094d(C2098h c2098h, C2063a c2063a, C2095e c2095e, AbstractC2177v abstractC2177v) {
        AbstractC2980h.m5136e("connectionPool", c2098h);
        AbstractC2980h.m5136e("address", c2063a);
        AbstractC2980h.m5136e("call", c2095e);
        AbstractC2980h.m5136e("eventListener", abstractC2177v);
        this.connectionPool = c2098h;
        this.address = c2063a;
        this.call = c2095e;
        this.eventListener = abstractC2177v;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C2096f findConnection(int i, int i4, int i8, int i9, boolean z7) throws IOException {
        List<C2162k0> routes;
        Socket socketReleaseConnectionNoEvents$okhttp;
        if (this.call.isCanceled()) {
            throw new IOException("Canceled");
        }
        C2096f connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                try {
                    socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.route().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
                } finally {
                }
            }
            if (this.call.getConnection() != null) {
                if (socketReleaseConnectionNoEvents$okhttp == null) {
                    return connection;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                AbstractC2278c.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            C2096f connection2 = this.call.getConnection();
            AbstractC2980h.m5133b(connection2);
            this.eventListener.connectionAcquired(this.call, connection2);
            return connection2;
        }
        C2162k0 next = this.nextRouteToTry;
        try {
            if (next == null) {
                C2101k.b bVar = this.routeSelection;
                if (bVar != null) {
                    AbstractC2980h.m5133b(bVar);
                    if (bVar.hasNext()) {
                        C2101k.b bVar2 = this.routeSelection;
                        AbstractC2980h.m5133b(bVar2);
                        next = bVar2.next();
                    }
                }
                C2101k c2101k = this.routeSelector;
                if (c2101k == null) {
                    c2101k = new C2101k(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = c2101k;
                }
                C2101k.b next2 = c2101k.next();
                this.routeSelection = next2;
                routes = next2.getRoutes();
                if (this.call.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                    C2096f connection3 = this.call.getConnection();
                    AbstractC2980h.m5133b(connection3);
                    this.eventListener.connectionAcquired(this.call, connection3);
                    return connection3;
                }
                next = next2.next();
                C2096f c2096f = new C2096f(this.connectionPool, next);
                this.call.setConnectionToCancel(c2096f);
                c2096f.connect(i, i4, i8, i9, z7, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(c2096f.route());
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    synchronized (c2096f) {
                        this.connectionPool.put(c2096f);
                        this.call.acquireConnectionNoEvents(c2096f);
                    }
                    this.eventListener.connectionAcquired(this.call, c2096f);
                    return c2096f;
                }
                C2096f connection4 = this.call.getConnection();
                AbstractC2980h.m5133b(connection4);
                this.nextRouteToTry = next;
                AbstractC2278c.closeQuietly(c2096f.socket());
                this.eventListener.connectionAcquired(this.call, connection4);
                return connection4;
            }
            AbstractC2980h.m5133b(next);
            this.nextRouteToTry = null;
            c2096f.connect(i, i4, i8, i9, z7, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(c2096f.route());
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
            }
        } catch (Throwable th) {
            this.call.setConnectionToCancel(null);
            throw th;
        }
        routes = null;
        C2096f c2096f2 = new C2096f(this.connectionPool, next);
        this.call.setConnectionToCancel(c2096f2);
    }

    private final C2096f findHealthyConnection(int i, int i4, int i8, int i9, boolean z7, boolean z8) throws IOException {
        while (true) {
            C2096f c2096fFindConnection = findConnection(i, i4, i8, i9, z7);
            boolean z9 = z7;
            int i10 = i9;
            int i11 = i8;
            int i12 = i4;
            int i13 = i;
            if (c2096fFindConnection.isHealthy(z8)) {
                return c2096fFindConnection;
            }
            c2096fFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                C2101k.b bVar = this.routeSelection;
                if (bVar != null ? bVar.hasNext() : true) {
                    continue;
                } else {
                    C2101k c2101k = this.routeSelector;
                    if (!(c2101k != null ? c2101k.hasNext() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i = i13;
            i4 = i12;
            i8 = i11;
            i9 = i10;
            z7 = z9;
        }
    }

    private final C2162k0 retryRoute() {
        C2096f connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (AbstractC2278c.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final InterfaceC2107f find(C2072e0 c2072e0, C2110i c2110i) {
        AbstractC2980h.m5136e("client", c2072e0);
        AbstractC2980h.m5136e("chain", c2110i);
        try {
            try {
                return findHealthyConnection(c2110i.getConnectTimeoutMillis$okhttp(), c2110i.getReadTimeoutMillis$okhttp(), c2110i.getWriteTimeoutMillis$okhttp(), c2072e0.pingIntervalMillis(), c2072e0.retryOnConnectionFailure(), !AbstractC2980h.m5132a(c2110i.getRequest$okhttp().method(), "GET")).newCodec$okhttp(c2072e0, c2110i);
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                trackFailure(iOException);
                throw new C2100j(iOException);
            } catch (C2100j e8) {
                e = e8;
                C2100j c2100j = e;
                trackFailure(c2100j.getLastConnectException());
                throw c2100j;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (C2100j e10) {
            e = e10;
        }
    }

    public final C2063a getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        C2101k c2101k;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        C2162k0 c2162k0RetryRoute = retryRoute();
        if (c2162k0RetryRoute != null) {
            this.nextRouteToTry = c2162k0RetryRoute;
            return true;
        }
        C2101k.b bVar = this.routeSelection;
        if ((bVar == null || !bVar.hasNext()) && (c2101k = this.routeSelector) != null) {
            return c2101k.hasNext();
        }
        return true;
    }

    public final boolean sameHostAndPort(C2181z c2181z) {
        AbstractC2980h.m5136e("url", c2181z);
        C2181z c2181zUrl = this.address.url();
        return c2181z.port() == c2181zUrl.port() && AbstractC2980h.m5132a(c2181z.host(), c2181zUrl.host());
    }

    public final void trackFailure(IOException iOException) {
        AbstractC2980h.m5136e("e", iOException);
        this.nextRouteToTry = null;
        if ((iOException instanceof C2132p) && ((C2132p) iOException).errorCode == EnumC2118b.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof C2117a) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
