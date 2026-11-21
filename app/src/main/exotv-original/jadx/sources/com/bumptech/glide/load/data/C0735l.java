package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC0717f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p041e4.C0891h;
import p066h4.C1188v;
import p178u4.AbstractC2472g;
import p178u4.C2468c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes.dex */
public final class C0735l implements InterfaceC0728e {

    /* renamed from: j */
    public final C0891h f2864j;

    /* renamed from: k */
    public final int f2865k;

    /* renamed from: l */
    public HttpURLConnection f2866l;

    /* renamed from: m */
    public InputStream f2867m;

    /* renamed from: n */
    public volatile boolean f2868n;

    public C0735l(C0891h c0891h, int i) {
        this.f2864j = c0891h;
        this.f2865k = i;
    }

    /* renamed from: d */
    public static int m1657d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() throws IOException {
        InputStream inputStream = this.f2867m;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2866l;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2866l = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        this.f2868n = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) {
        C0891h c0891h = this.f2864j;
        int i = AbstractC2472g.f9058b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC0727d.mo49f(m1658f(c0891h.m2061d(), 0, null, c0891h.f3910b.mo2062a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2472g.m4447a(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC0727d.mo47d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2472g.m4447a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2472g.m4447a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final InputStream m1658f(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new C1188v(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C1188v(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i4 = this.f2865k;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f2866l = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2867m = this.f2866l.getInputStream();
                if (this.f2868n) {
                    return null;
                }
                int iM1657d = m1657d(this.f2866l);
                int i8 = iM1657d / 100;
                if (i8 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2866l;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2867m = new C2468c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f2867m = httpURLConnection2.getInputStream();
                        }
                        return this.f2867m;
                    } catch (IOException e) {
                        throw new C1188v(m1657d(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i8 != 3) {
                    if (iM1657d == -1) {
                        throw new C1188v(iM1657d, null, "Http request failed");
                    }
                    try {
                        throw new C1188v(iM1657d, null, this.f2866l.getResponseMessage());
                    } catch (IOException e8) {
                        throw new C1188v(iM1657d, e8, "Failed to get a response message");
                    }
                }
                String headerField = this.f2866l.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C1188v(iM1657d, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1646b();
                    return m1658f(url3, i + 1, url, map);
                } catch (MalformedURLException e9) {
                    throw new C1188v(iM1657d, e9, AbstractC0008a1.m25u("Bad redirect url: ", headerField));
                }
            } catch (IOException e10) {
                throw new C1188v(m1657d(this.f2866l), e10, "Failed to connect or obtain data");
            }
        } catch (IOException e11) {
            throw new C1188v(0, e11, "URL.openConnection threw");
        }
    }
}
