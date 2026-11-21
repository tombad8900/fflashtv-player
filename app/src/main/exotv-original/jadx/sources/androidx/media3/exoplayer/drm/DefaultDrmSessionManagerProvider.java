package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.bumptech.glide.AbstractC0715d;
import java.util.Arrays;
import java.util.Map;
import p052f6.AbstractC1023z1;
import p063h1.AbstractC1118i0;
import p072i2.C1245e;
import p089k1.InterfaceC1563g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {
    private C0202g0 drmConfiguration;
    private InterfaceC1563g drmHttpDataSourceFactory;
    private LoadErrorHandlingPolicy drmLoadErrorHandlingPolicy;
    private final Object lock = new Object();
    private DrmSessionManager manager;
    private String userAgent;

    private DrmSessionManager createManager(C0202g0 c0202g0) {
        InterfaceC1563g interfaceC1563g = this.drmHttpDataSourceFactory;
        InterfaceC1563g interfaceC1563g2 = interfaceC1563g;
        if (interfaceC1563g == null) {
            C1245e c1245e = new C1245e(1);
            c1245e.f5204n = this.userAgent;
            interfaceC1563g2 = c1245e;
        }
        Uri uri = c0202g0.f1109b;
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(uri == null ? null : uri.toString(), c0202g0.f1113f, interfaceC1563g2);
        AbstractC1023z1 it = c0202g0.f1110c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpMediaDrmCallback.setKeyRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        DefaultDrmSessionManager.Builder useDrmSessionsForClearContent = new DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(c0202g0.f1108a, FrameworkMediaDrm.DEFAULT_PROVIDER).setMultiSession(c0202g0.f1111d).setPlayClearSamplesWithoutKeys(c0202g0.f1112e).setUseDrmSessionsForClearContent(AbstractC0715d.m1569p0(c0202g0.f1114g));
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.drmLoadErrorHandlingPolicy;
        if (loadErrorHandlingPolicy != null) {
            useDrmSessionsForClearContent.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerBuild = useDrmSessionsForClearContent.build(httpMediaDrmCallback);
        byte[] bArr = c0202g0.f1115h;
        defaultDrmSessionManagerBuild.setMode(0, bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        return defaultDrmSessionManagerBuild;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public DrmSessionManager get(C0226o0 c0226o0) {
        DrmSessionManager drmSessionManager;
        c0226o0.f1239b.getClass();
        C0202g0 c0202g0 = c0226o0.f1239b.f1149c;
        if (c0202g0 == null) {
            return DrmSessionManager.DRM_UNSUPPORTED;
        }
        synchronized (this.lock) {
            try {
                C0202g0 c0202g02 = this.drmConfiguration;
                int i = AbstractC1118i0.f4750a;
                if (!c0202g0.equals(c0202g02)) {
                    this.drmConfiguration = c0202g0;
                    this.manager = createManager(c0202g0);
                }
                drmSessionManager = this.manager;
                drmSessionManager.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return drmSessionManager;
    }

    public void setDrmHttpDataSourceFactory(InterfaceC1563g interfaceC1563g) {
        this.drmHttpDataSourceFactory = interfaceC1563g;
    }

    public void setDrmLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.drmLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
    }

    @Deprecated
    public void setDrmUserAgent(String str) {
        this.userAgent = str;
    }
}
