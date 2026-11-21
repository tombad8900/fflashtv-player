package p016b5;

import android.support.v4.media.session.AbstractC0120b;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.h */
/* loaded from: classes.dex */
public final class C0585h {

    /* renamed from: a */
    public static volatile C0586i f2325a;

    /* renamed from: a */
    public static final C0586i m1334a(JSONObject jSONObject) {
        String strM408a = AbstractC0120b.m408a(jSONObject, "version");
        boolean zOptBoolean = jSONObject.optBoolean("forceUpdate");
        String strM408a2 = AbstractC0120b.m408a(jSONObject, "message");
        String strM408a3 = AbstractC0120b.m408a(jSONObject, "apkUrl");
        String strM408a4 = AbstractC0120b.m408a(jSONObject, "updateUrl");
        String strM408a5 = AbstractC0120b.m408a(jSONObject, "smartLinkURL");
        double dOptDouble = jSONObject.optDouble("adsRefreshHours", 0.0d);
        Double dValueOf = dOptDouble > 0.0d ? Double.valueOf(dOptDouble) : null;
        String strM408a6 = AbstractC0120b.m408a(jSONObject, "channelsURL");
        String strM408a7 = AbstractC0120b.m408a(jSONObject, "ytapi");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ytapihd");
        Map mapM409b = AbstractC0120b.m409b(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("headers") : null);
        String strM408a8 = AbstractC0120b.m408a(jSONObject, "ostapi");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ostapihd");
        Map mapM409b2 = AbstractC0120b.m409b(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject("headers") : null);
        String strM408a9 = AbstractC0120b.m408a(jSONObject, "ytvbase");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("ytvhd");
        Map mapM409b3 = AbstractC0120b.m409b(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optJSONObject("headers") : null);
        String strM408a10 = AbstractC0120b.m408a(jSONObject, "genapi");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("genapihd");
        Map mapM409b4 = AbstractC0120b.m409b(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONObject("api_headers") : null);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("genapihd");
        return new C0586i(strM408a, zOptBoolean, strM408a2, strM408a3, strM408a4, strM408a5, dValueOf, strM408a6, strM408a7, mapM409b, strM408a8, mapM409b2, strM408a9, mapM409b3, strM408a10, mapM409b4, AbstractC0120b.m409b(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optJSONObject("stream_headers") : null), AbstractC0120b.m408a(jSONObject, "tmdbApiKey"), AbstractC0120b.m408a(jSONObject, "gateBase"), AbstractC0120b.m408a(jSONObject, "gateInfoBase"), AbstractC0120b.m408a(jSONObject, "wasmOrigin"), AbstractC0120b.m408a(jSONObject, "opensubtitlesBase"), AbstractC0120b.m408a(jSONObject, "ipLookupUrl"), AbstractC0120b.m408a(jSONObject, "vidcoreBase"));
    }
}
