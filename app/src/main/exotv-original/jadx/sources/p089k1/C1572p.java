package p089k1;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p052f6.C0996q1;
import p060g6.AbstractC1053b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.p */
/* loaded from: classes.dex */
public final class C1572p extends AbstractC1556c {

    /* renamed from: n */
    public final boolean f6017n;

    /* renamed from: o */
    public final int f6018o;

    /* renamed from: p */
    public final int f6019p;

    /* renamed from: q */
    public final String f6020q;

    /* renamed from: r */
    public final C0016e f6021r;

    /* renamed from: s */
    public final C0016e f6022s;

    /* renamed from: t */
    public C1568l f6023t;

    /* renamed from: u */
    public HttpURLConnection f6024u;

    /* renamed from: v */
    public InputStream f6025v;

    /* renamed from: w */
    public boolean f6026w;

    /* renamed from: x */
    public int f6027x;

    /* renamed from: y */
    public long f6028y;

    /* renamed from: z */
    public long f6029z;

    public C1572p(String str, int i, int i4, boolean z7, C0016e c0016e) {
        super(true);
        this.f6020q = str;
        this.f6018o = i;
        this.f6019p = i4;
        this.f6017n = z7;
        this.f6021r = c0016e;
        this.f6022s = new C0016e(20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089k1.InterfaceC1564h
    public final void close() {
        try {
            InputStream inputStream = this.f6025v;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = AbstractC1118i0.f4750a;
                    throw new C1577u(e, 2000, 3);
                }
            }
        } finally {
            this.f6025v = null;
            m3242n();
            if (this.f6026w) {
                this.f6026w = false;
                m3229k();
            }
            this.f6024u = null;
            this.f6023t = null;
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f6024u;
        return httpURLConnection == null ? C0996q1.f4246p : new C1571o(httpURLConnection.getHeaderFields());
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f6024u;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C1568l c1568l = this.f6023t;
        if (c1568l != null) {
            return c1568l.f5996a;
        }
        return null;
    }

    /* renamed from: n */
    public final void m3242n() {
        HttpURLConnection httpURLConnection = this.f6024u;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC1101a.m2365p("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* renamed from: o */
    public final URL m3243o(URL url, String str) throws C1577u {
        if (str == null) {
            throw new C1577u("Null location redirect", C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C1577u(AbstractC0008a1.m25u("Unsupported protocol redirect: ", protocol), C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
            }
            if (this.f6017n || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C1577u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
        } catch (MalformedURLException e) {
            throw new C1577u(e, C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[Catch: IOException -> 0x012a, TRY_LEAVE, TryCatch #0 {IOException -> 0x012a, blocks: (B:49:0x0117, B:51:0x011f), top: B:99:0x0117 }] */
    @Override // p089k1.InterfaceC1564h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(C1568l c1568l) throws IOException, NumberFormatException {
        boolean z7;
        long j;
        HttpURLConnection httpURLConnection;
        long j8;
        this.f6023t = c1568l;
        this.f6029z = 0L;
        this.f6028y = 0L;
        m3230l(c1568l);
        try {
            HttpURLConnection httpURLConnectionM3245q = m3245q(c1568l);
            long j9 = c1568l.f6000e;
            long j10 = c1568l.f6001f;
            this.f6024u = httpURLConnectionM3245q;
            this.f6027x = httpURLConnectionM3245q.getResponseCode();
            httpURLConnectionM3245q.getResponseMessage();
            int i = this.f6027x;
            long jMax = -1;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM3245q.getHeaderFields();
                if (this.f6027x == 416) {
                    String headerField = httpURLConnectionM3245q.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC1580x.f6045a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z7 = true;
                    } else {
                        Matcher matcher = AbstractC1580x.f6046b.matcher(headerField);
                        z7 = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j9 == j) {
                        this.f6026w = z7;
                        m3231m(c1568l);
                        if (j10 != -1) {
                            return j10;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM3245q.getErrorStream();
                try {
                    if (errorStream != null) {
                        AbstractC1053b.m2244b(errorStream);
                    } else {
                        int i4 = AbstractC1118i0.f4750a;
                    }
                } catch (IOException unused) {
                    int i8 = AbstractC1118i0.f4750a;
                }
                m3242n();
                throw new C1579w(this.f6027x, this.f6027x == 416 ? new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE) : null, headerFields);
            }
            httpURLConnectionM3245q.getContentType();
            if (this.f6027x != 200 || j9 == 0) {
                j9 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM3245q.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                httpURLConnection = httpURLConnectionM3245q;
                this.f6028y = j10;
            } else if (j10 != -1) {
                this.f6028y = j10;
                httpURLConnection = httpURLConnectionM3245q;
            } else {
                String headerField2 = httpURLConnectionM3245q.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM3245q.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC1580x.f6045a;
                if (TextUtils.isEmpty(headerField2)) {
                    j8 = -1;
                    if (TextUtils.isEmpty(headerField3)) {
                    }
                } else {
                    try {
                        j8 = -1;
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC1101a.m2364o("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = AbstractC1580x.f6045a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(2);
                                strGroup2.getClass();
                                long j11 = Long.parseLong(strGroup2);
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                httpURLConnection = httpURLConnectionM3245q;
                                long j12 = (j11 - Long.parseLong(strGroup3)) + 1;
                                if (jMax < 0) {
                                    jMax = j12;
                                } else if (jMax != j12) {
                                    try {
                                        AbstractC1101a.m2348F("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        jMax = Math.max(jMax, j12);
                                    } catch (NumberFormatException unused3) {
                                        AbstractC1101a.m2364o("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.f6028y = jMax == j8 ? jMax - j9 : j8;
                                        this.f6025v = httpURLConnection.getInputStream();
                                        if (zEqualsIgnoreCase) {
                                        }
                                        this.f6026w = true;
                                        m3231m(c1568l);
                                        m3246r(j9);
                                        return this.f6028y;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = httpURLConnectionM3245q;
                            }
                        } else {
                            httpURLConnection = httpURLConnectionM3245q;
                        }
                        this.f6028y = jMax == j8 ? jMax - j9 : j8;
                    }
                }
            }
            try {
                this.f6025v = httpURLConnection.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f6025v = new GZIPInputStream(this.f6025v);
                }
                this.f6026w = true;
                m3231m(c1568l);
                try {
                    m3246r(j9);
                    return this.f6028y;
                } catch (IOException e) {
                    m3242n();
                    if (e instanceof C1577u) {
                        throw ((C1577u) e);
                    }
                    throw new C1577u(e, 2000, 1);
                }
            } catch (IOException e8) {
                m3242n();
                throw new C1577u(e8, 2000, 1);
            }
        } catch (IOException e9) {
            m3242n();
            throw C1577u.m3247a(e9, 1);
        }
    }

    /* renamed from: p */
    public final HttpURLConnection m3244p(URL url, int i, byte[] bArr, long j, long j8, boolean z7, boolean z8, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f6018o);
        httpURLConnection.setReadTimeout(this.f6019p);
        HashMap map2 = new HashMap();
        C0016e c0016e = this.f6021r;
        if (c0016e != null) {
            map2.putAll(c0016e.m36F());
        }
        map2.putAll(this.f6022s.m36F());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC1580x.f6045a;
        if (j == 0 && j8 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j8 != -1) {
                sb.append((j + j8) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f6020q;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z7 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z8);
        httpURLConnection.setDoOutput(bArr != null);
        int i4 = C1568l.f5995i;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* renamed from: q */
    public final HttpURLConnection m3245q(C1568l c1568l) throws IOException {
        HttpURLConnection httpURLConnectionM3244p;
        URL url = new URL(c1568l.f5996a.toString());
        int i = c1568l.f5997b;
        byte[] bArr = c1568l.f5998c;
        long j = c1568l.f6000e;
        long j8 = c1568l.f6001f;
        int i4 = 1;
        int i8 = 0;
        boolean z7 = (c1568l.f6003h & 1) == 1;
        if (!this.f6017n) {
            return m3244p(url, i, bArr, j, j8, z7, true, c1568l.f5999d);
        }
        while (true) {
            int i9 = i8 + 1;
            if (i8 > 20) {
                throw new C1577u(new NoRouteToHostException(AbstractC0008a1.m12h(i9, "Too many redirects: ")), C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
            httpURLConnectionM3244p = m3244p(url, i, bArr, j, j8, z7, false, c1568l.f5999d);
            int responseCode = httpURLConnectionM3244p.getResponseCode();
            String headerField = httpURLConnectionM3244p.getHeaderField("Location");
            if ((i == i4 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM3244p.disconnect();
                url = m3243o(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionM3244p.disconnect();
                url = m3243o(url, headerField);
                bArr = null;
                i = 1;
            }
            i8 = i9;
            i4 = 1;
        }
        return httpURLConnectionM3244p;
    }

    /* renamed from: r */
    public final void m3246r(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED];
        while (j > 0) {
            int iMin = (int) Math.min(j, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
            InputStream inputStream = this.f6025v;
            int i = AbstractC1118i0.f4750a;
            int i4 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C1577u(new InterruptedIOException(), 2000, 1);
            }
            if (i4 == -1) {
                throw new C1577u();
            }
            j -= i4;
            m3228j(i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // androidx.media3.common.InterfaceC0219m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i8;
        if (i4 == 0) {
            return 0;
        }
        try {
            long j = this.f6028y;
            if (j != -1) {
                long j8 = j - this.f6029z;
                if (j8 != 0) {
                    i4 = (int) Math.min(i4, j8);
                    InputStream inputStream = this.f6025v;
                    int i9 = AbstractC1118i0.f4750a;
                    i8 = inputStream.read(bArr, i, i4);
                    if (i8 != -1) {
                        this.f6029z += i8;
                        m3228j(i8);
                        return i8;
                    }
                }
            } else {
                InputStream inputStream2 = this.f6025v;
                int i92 = AbstractC1118i0.f4750a;
                i8 = inputStream2.read(bArr, i, i4);
                if (i8 != -1) {
                }
            }
            return -1;
        } catch (IOException e) {
            int i10 = AbstractC1118i0.f4750a;
            throw C1577u.m3247a(e, 2);
        }
    }
}
