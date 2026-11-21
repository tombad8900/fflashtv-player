package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.InterfaceC2064a0;
import okhttp3.InterfaceC2068c0;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2163l;
import okhttp3.internal.connection.C2093c;
import okhttp3.internal.connection.C2095e;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.i */
/* loaded from: classes.dex */
public final class C2110i implements InterfaceC2064a0 {
    private final C2095e call;
    private int calls;
    private final int connectTimeoutMillis;
    private final C2093c exchange;
    private final int index;
    private final List<InterfaceC2068c0> interceptors;
    private final int readTimeoutMillis;
    private final C2076g0 request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public C2110i(C2095e c2095e, List<? extends InterfaceC2068c0> list, int i, C2093c c2093c, C2076g0 c2076g0, int i4, int i8, int i9) {
        AbstractC2980h.m5136e("call", c2095e);
        AbstractC2980h.m5136e("interceptors", list);
        AbstractC2980h.m5136e("request", c2076g0);
        this.call = c2095e;
        this.interceptors = list;
        this.index = i;
        this.exchange = c2093c;
        this.request = c2076g0;
        this.connectTimeoutMillis = i4;
        this.readTimeoutMillis = i8;
        this.writeTimeoutMillis = i9;
    }

    public static /* synthetic */ C2110i copy$okhttp$default(C2110i c2110i, int i, C2093c c2093c, C2076g0 c2076g0, int i4, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = c2110i.index;
        }
        if ((i10 & 2) != 0) {
            c2093c = c2110i.exchange;
        }
        if ((i10 & 4) != 0) {
            c2076g0 = c2110i.request;
        }
        if ((i10 & 8) != 0) {
            i4 = c2110i.connectTimeoutMillis;
        }
        if ((i10 & 16) != 0) {
            i8 = c2110i.readTimeoutMillis;
        }
        if ((i10 & 32) != 0) {
            i9 = c2110i.writeTimeoutMillis;
        }
        int i11 = i8;
        int i12 = i9;
        return c2110i.copy$okhttp(i, c2093c, c2076g0, i4, i11, i12);
    }

    @Override // okhttp3.InterfaceC2064a0
    public InterfaceC2075g call() {
        return this.call;
    }

    @Override // okhttp3.InterfaceC2064a0
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.InterfaceC2064a0
    public InterfaceC2163l connection() {
        C2093c c2093c = this.exchange;
        if (c2093c != null) {
            return c2093c.getConnection$okhttp();
        }
        return null;
    }

    public final C2110i copy$okhttp(int i, C2093c c2093c, C2076g0 c2076g0, int i4, int i8, int i9) {
        AbstractC2980h.m5136e("request", c2076g0);
        return new C2110i(this.call, this.interceptors, i, c2093c, c2076g0, i4, i8, i9);
    }

    public final C2095e getCall$okhttp() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    public final C2093c getExchange$okhttp() {
        return this.exchange;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    public final C2076g0 getRequest$okhttp() {
        return this.request;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.InterfaceC2064a0
    public C2080i0 proceed(C2076g0 c2076g0) {
        AbstractC2980h.m5136e("request", c2076g0);
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        C2093c c2093c = this.exchange;
        if (c2093c != null) {
            if (!c2093c.getFinder$okhttp().sameHostAndPort(c2076g0.url())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        C2110i c2110iCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, c2076g0, 0, 0, 0, 58, null);
        InterfaceC2068c0 interfaceC2068c0 = this.interceptors.get(this.index);
        C2080i0 c2080i0Intercept = interfaceC2068c0.intercept(c2110iCopy$okhttp$default);
        if (c2080i0Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC2068c0 + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && c2110iCopy$okhttp$default.calls != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC2068c0 + " must call proceed() exactly once").toString());
        }
        if (c2080i0Intercept.body() != null) {
            return c2080i0Intercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC2068c0 + " returned a response with no body").toString());
    }

    @Override // okhttp3.InterfaceC2064a0
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.InterfaceC2064a0
    public C2076g0 request() {
        return this.request;
    }

    @Override // okhttp3.InterfaceC2064a0
    public InterfaceC2064a0 withConnectTimeout(int i, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, AbstractC2278c.checkDuration("connectTimeout", i, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.InterfaceC2064a0
    public InterfaceC2064a0 withReadTimeout(int i, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, AbstractC2278c.checkDuration("readTimeout", i, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.InterfaceC2064a0
    public InterfaceC2064a0 withWriteTimeout(int i, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, AbstractC2278c.checkDuration("writeTimeout", i, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.InterfaceC2064a0
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
