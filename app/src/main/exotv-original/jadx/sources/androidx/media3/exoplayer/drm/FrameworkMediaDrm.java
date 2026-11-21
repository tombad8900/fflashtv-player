package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.common.C0234r;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import okhttp3.C2181z;
import p005a4.C0094o;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p064h2.AbstractC1151p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final ExoMediaDrm.Provider DEFAULT_PROVIDER = new C0343a(5);
    private static final String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final String MOCK_LA_URL_VALUE = "https://x";
    private static final String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final MediaDrm mediaDrm;
    private int referenceCount;
    private final UUID uuid;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Api31 {
        private Api31() {
        }

        public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str, int i) {
            return mediaDrm.requiresSecureDecoder(str, i);
        }

        public static void setLogSessionIdOnMediaDrmSession(MediaDrm mediaDrm, byte[] bArr, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionId);
        }
    }

    private FrameworkMediaDrm(UUID uuid) {
        uuid.getClass();
        AbstractC1101a.m2352c("Use C.CLEARKEY_UUID instead", !AbstractC0213k.f1163b.equals(uuid));
        this.uuid = uuid;
        MediaDrm mediaDrm = new MediaDrm(adjustUuid(uuid));
        this.mediaDrm = mediaDrm;
        this.referenceCount = 1;
        if (AbstractC0213k.f1165d.equals(uuid) && needsForceWidevineL3Workaround()) {
            forceWidevineL3(mediaDrm);
        }
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        C1132w c1132w = new C1132w(bArr);
        int iM2523i = c1132w.m2523i();
        short sM2525k = c1132w.m2525k();
        short sM2525k2 = c1132w.m2525k();
        if (sM2525k != 1 || sM2525k2 != 1) {
            AbstractC1101a.m2371v(TAG, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sM2525k3 = c1132w.m2525k();
        Charset charset = StandardCharsets.UTF_16LE;
        String strM2533s = c1132w.m2533s(sM2525k3, charset);
        if (strM2533s.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strM2533s.indexOf("</DATA>");
        if (iIndexOf == -1) {
            AbstractC1101a.m2348F(TAG, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strM2533s.substring(0, iIndexOf) + MOCK_LA_URL + strM2533s.substring(iIndexOf);
        int i = iM2523i + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sM2525k);
        byteBufferAllocate.putShort(sM2525k2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String adjustLicenseServerUrl(String str) {
        if (MOCK_LA_URL.equals(str)) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC1118i0.f4750a >= 33 && "https://default.url".equals(str)) {
            String propertyString = getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                return C2181z.FRAGMENT_ENCODE_SET;
            }
        }
        return str;
    }

    private static byte[] adjustRequestData(UUID uuid, byte[] bArr) {
        return AbstractC0213k.f1164c.equals(uuid) ? ClearKeyUtil.adjustRequestData(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] adjustRequestInitData(UUID uuid, byte[] bArr) {
        UUID uuid2 = AbstractC0213k.f1166e;
        if (uuid2.equals(uuid)) {
            byte[] bArrM2572j = AbstractC1151p.m2572j(uuid, bArr);
            if (bArrM2572j != null) {
                bArr = bArrM2572j;
            }
            bArr = AbstractC1151p.m2563a(uuid2, null, addLaUrlAttributeIfMissing(bArr));
        }
        if (AbstractC1118i0.f4750a >= 23 || !AbstractC0213k.f1165d.equals(uuid)) {
            if (uuid2.equals(uuid) && "Amazon".equals(AbstractC1118i0.f4752c)) {
                String str = AbstractC1118i0.f4753d;
                if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                    byte[] bArrM2572j2 = AbstractC1151p.m2572j(uuid, bArr);
                    if (bArrM2572j2 != null) {
                        return bArrM2572j2;
                    }
                }
            }
        }
        return bArr;
    }

    private static String adjustRequestMimeType(UUID uuid, String str) {
        return (AbstractC1118i0.f4750a < 26 && AbstractC0213k.f1164c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? CENC_SCHEME_MIME_TYPE : str;
    }

    private static UUID adjustUuid(UUID uuid) {
        return (AbstractC1118i0.f4750a >= 27 || !AbstractC0213k.f1164c.equals(uuid)) ? uuid : AbstractC0213k.f1163b;
    }

    private static void forceWidevineL3(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static C0234r getSchemeData(UUID uuid, List<C0234r> list) {
        if (!AbstractC0213k.f1165d.equals(uuid)) {
            return list.get(0);
        }
        if (AbstractC1118i0.f4750a >= 28 && list.size() > 1) {
            C0234r c0234r = list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                C0234r c0234r2 = list.get(i);
                byte[] bArr = c0234r2.f1328n;
                bArr.getClass();
                if (Objects.equals(c0234r2.f1327m, c0234r.f1327m) && Objects.equals(c0234r2.f1326l, c0234r.f1326l) && AbstractC1151p.m2571i(bArr) != null) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i4 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                byte[] bArr3 = list.get(i8).f1328n;
                bArr3.getClass();
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i4, length2);
                i4 += length2;
            }
            return new C0234r(c0234r.f1325k, c0234r.f1326l, c0234r.f1327m, bArr2);
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            C0234r c0234r3 = list.get(i9);
            byte[] bArr4 = c0234r3.f1328n;
            bArr4.getClass();
            C0094o c0094oM2571i = AbstractC1151p.m2571i(bArr4);
            int i10 = c0094oM2571i == null ? -1 : c0094oM2571i.f440j;
            int i11 = AbstractC1118i0.f4750a;
            if ((i11 < 23 && i10 == 0) || (i11 >= 23 && i10 == 1)) {
                return c0234r3;
            }
        }
        return list.get(0);
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
    }

    private boolean isMediaDrmRequiresSecureDecoderImplemented() {
        if (!this.uuid.equals(AbstractC0213k.f1165d)) {
            return this.uuid.equals(AbstractC0213k.f1164c);
        }
        String propertyString = getPropertyString("version");
        return (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnEventListener$1(ExoMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i, int i4, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i4, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnExpirationUpdateListener$3(ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, MediaDrm mediaDrm, byte[] bArr, long j) {
        onExpirationUpdateListener.onExpirationUpdate(this, bArr, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnKeyStatusChangeListener$2(ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, arrayList, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExoMediaDrm lambda$static$0(UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (UnsupportedDrmException unused) {
            AbstractC1101a.m2364o(TAG, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new DummyExoMediaDrm();
        }
    }

    private static boolean needsForceWidevineL3Workaround() {
        return "ASUS_Z00AD".equals(AbstractC1118i0.f4753d);
    }

    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e8) {
            throw new UnsupportedDrmException(2, e8);
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void acquire() {
        AbstractC1101a.m2359j(this.referenceCount > 0);
        this.referenceCount++;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @SuppressLint({"WrongConstant"})
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, List<C0234r> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        C0234r schemeData;
        byte[] bArrAdjustRequestInitData;
        String strAdjustRequestMimeType;
        if (list != null) {
            schemeData = getSchemeData(this.uuid, list);
            UUID uuid = this.uuid;
            byte[] bArr2 = schemeData.f1328n;
            bArr2.getClass();
            bArrAdjustRequestInitData = adjustRequestInitData(uuid, bArr2);
            strAdjustRequestMimeType = adjustRequestMimeType(this.uuid, schemeData.f1327m);
        } else {
            schemeData = null;
            bArrAdjustRequestInitData = null;
            strAdjustRequestMimeType = null;
        }
        MediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(bArr, bArrAdjustRequestInitData, strAdjustRequestMimeType, i, map);
        byte[] bArrAdjustRequestData = adjustRequestData(this.uuid, keyRequest.getData());
        String strAdjustLicenseServerUrl = adjustLicenseServerUrl(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strAdjustLicenseServerUrl) && schemeData != null) {
            String str = schemeData.f1326l;
            if (!TextUtils.isEmpty(str)) {
                strAdjustLicenseServerUrl = str;
            }
        }
        return new ExoMediaDrm.KeyRequest(bArrAdjustRequestData, strAdjustLicenseServerUrl, AbstractC1118i0.f4750a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public PersistableBundle getMetrics() {
        if (AbstractC1118i0.f4750a < 28) {
            return null;
        }
        return this.mediaDrm.getMetrics();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public List<byte[]> getOfflineLicenseKeySetIds() {
        if (AbstractC1118i0.f4750a >= 29) {
            return this.mediaDrm.getOfflineLicenseKeySetIds();
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() {
        return this.mediaDrm.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (AbstractC0213k.f1164c.equals(this.uuid)) {
            bArr2 = ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void release() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            this.mediaDrm.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void removeOfflineLicense(byte[] bArr) {
        if (AbstractC1118i0.f4750a < 29) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.removeOfflineLicense(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, String str) throws Throwable {
        if (AbstractC1118i0.f4750a >= 31 && isMediaDrmRequiresSecureDecoderImplemented()) {
            MediaDrm mediaDrm = this.mediaDrm;
            return Api31.requiresSecureDecoder(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            MediaCrypto mediaCrypto2 = new MediaCrypto(this.uuid, bArr);
            try {
                boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                mediaCrypto2.release();
                return zRequiresSecureDecoderComponent;
            } catch (MediaCryptoException unused) {
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto == null) {
                    return true;
                }
                mediaCrypto.release();
                return true;
            } catch (Throwable th) {
                th = th;
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                throw th;
            }
        } catch (MediaCryptoException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(final ExoMediaDrm.OnEventListener onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.h
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i4, byte[] bArr2) {
                this.f1734a.lambda$setOnEventListener$1(onEventListener, mediaDrm, bArr, i, i4, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(final ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        if (AbstractC1118i0.f4750a < 23) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: androidx.media3.exoplayer.drm.g
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                this.f1732a.lambda$setOnExpirationUpdateListener$3(onExpirationUpdateListener, mediaDrm, bArr, j);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(final ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        if (AbstractC1118i0.f4750a < 23) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: androidx.media3.exoplayer.drm.i
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z7) {
                this.f1736a.lambda$setOnKeyStatusChangeListener$2(onKeyStatusChangeListener, mediaDrm, bArr, list, z7);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPlayerIdForSession(byte[] bArr, PlayerId playerId) {
        if (AbstractC1118i0.f4750a >= 31) {
            try {
                Api31.setLogSessionIdOnMediaDrmSession(this.mediaDrm, bArr, playerId);
            } catch (UnsupportedOperationException unused) {
                AbstractC1101a.m2348F(TAG, "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public FrameworkCryptoConfig createCryptoConfig(byte[] bArr) {
        return new FrameworkCryptoConfig(adjustUuid(this.uuid), bArr);
    }
}
