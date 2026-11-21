package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p052f6.C0996q1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.C1568l;
import p089k1.InterfaceC1563g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private final InterfaceC1563g dataSourceFactory;
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(String str, InterfaceC1563g interfaceC1563g) {
        this(str, false, interfaceC1563g);
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        str.getClass();
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            AbstractC1101a.m2361l("The uri must be set.", uri);
            throw new MediaDrmCallbackException(new C1568l(uri, 1, null, map, 0L, -1L, null, 0), uri, C0996q1.f4246p, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = AbstractC0213k.f1166e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC0213k.f1164c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            map2.putAll(this.keyRequestProperties);
        }
        return DrmUtil.executePost(this.dataSourceFactory.mo55l(), licenseServerUrl, keyRequest.getData(), map2);
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) {
        return DrmUtil.executePost(this.dataSourceFactory.mo55l(), provisionRequest.getDefaultUrl() + "&signedRequest=" + AbstractC1118i0.m2459r(provisionRequest.getData()), null, Collections.EMPTY_MAP);
    }

    public void setKeyRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public HttpMediaDrmCallback(String str, boolean z7, InterfaceC1563g interfaceC1563g) {
        AbstractC1101a.m2353d((z7 && TextUtils.isEmpty(str)) ? false : true);
        this.dataSourceFactory = interfaceC1563g;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z7;
        this.keyRequestProperties = new HashMap();
    }
}
