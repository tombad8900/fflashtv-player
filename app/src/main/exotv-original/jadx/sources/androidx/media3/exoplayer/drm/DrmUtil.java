package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.net.Uri;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p060g6.AbstractC1053b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.C1555b0;
import p089k1.C1566j;
import p089k1.C1567k;
import p089k1.C1568l;
import p089k1.C1579w;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;
    private static final int MAX_MANUAL_REDIRECTS = 5;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api23 {
        private Api23() {
        }

        public static boolean isMediaDrmResetException(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static byte[] executePost(InterfaceC1564h interfaceC1564h, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        C1555b0 c1555b0 = new C1555b0(interfaceC1564h);
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        AbstractC1101a.m2361l("The uri must be set.", uri);
        C1568l c1568l = new C1568l(uri, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        C1568l c1568lM3236d = c1568l;
        while (true) {
            try {
                C1566j c1566j = new C1566j(c1555b0, c1568lM3236d);
                try {
                    try {
                        byte[] bArrM2244b = AbstractC1053b.m2244b(c1566j);
                        AbstractC1118i0.m2448g(c1566j);
                        return bArrM2244b;
                    } catch (C1579w e) {
                        String redirectUrl = getRedirectUrl(e, i);
                        if (redirectUrl == null) {
                            throw e;
                        }
                        i++;
                        C1567k c1567kM3237a = c1568lM3236d.m3237a();
                        c1567kM3237a.f5991e = Uri.parse(redirectUrl);
                        c1568lM3236d = c1567kM3237a.m3236d();
                        AbstractC1118i0.m2448g(c1566j);
                    }
                } catch (Throwable th) {
                    AbstractC1118i0.m2448g(c1566j);
                    throw th;
                }
            } catch (Exception e8) {
                Uri uri2 = c1555b0.f5955l;
                uri2.getClass();
                throw new MediaDrmCallbackException(c1568l, uri2, c1555b0.f5953j.getResponseHeaders(), c1555b0.f5954k, e8);
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(Throwable th, int i) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return AbstractC1118i0.m2466y(AbstractC1118i0.m2467z(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (AbstractC1118i0.f4750a >= 23 && Api23.isMediaDrmResetException(th)) {
            return C0253x0.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return C0253x0.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        if (th instanceof DeniedByServerException) {
            return C0253x0.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof UnsupportedDrmException) {
            return C0253x0.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return C0253x0.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (th instanceof KeysExpiredException) {
            return C0253x0.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return C0253x0.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return C0253x0.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 3) {
            return C0253x0.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        throw new IllegalArgumentException();
    }

    private static String getRedirectUrl(C1579w c1579w, int i) {
        Map map;
        List list;
        int i4 = c1579w.f6043m;
        if ((i4 != 307 && i4 != 308) || i >= 5 || (map = c1579w.f6044n) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(Throwable th) {
        return AbstractC1118i0.f4750a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(Throwable th) {
        return AbstractC1118i0.f4750a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
