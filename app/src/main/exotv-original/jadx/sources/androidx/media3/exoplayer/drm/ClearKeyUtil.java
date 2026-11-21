package androidx.media3.exoplayer.drm;

import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ClearKeyUtil {
    private static final String TAG = "ClearKeyUtil";

    private ClearKeyUtil() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return AbstractC1118i0.f4750a >= 27 ? bArr : base64ToBase64Url(AbstractC1118i0.m2459r(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (AbstractC1118i0.f4750a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(AbstractC1118i0.m2459r(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return sb.toString().getBytes(StandardCharsets.UTF_8);
        } catch (JSONException e) {
            AbstractC1101a.m2365p(TAG, "Failed to adjust response data: ".concat(AbstractC1118i0.m2459r(bArr)), e);
            return bArr;
        }
    }

    private static String base64ToBase64Url(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String base64UrlToBase64(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
