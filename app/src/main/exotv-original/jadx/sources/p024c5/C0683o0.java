package p024c5;

import android.support.v4.media.session.AbstractC0120b;
import java.util.Comparator;
import org.json.JSONObject;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.o0 */
/* loaded from: classes.dex */
public final class C0683o0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 2;
        JSONObject jSONObject = (JSONObject) obj;
        Integer num2 = AbstractC2980h.m5132a(jSONObject.optString("iso_639_1"), "en") ? 0 : jSONObject.isNull("iso_639_1") ? 1 : num;
        JSONObject jSONObject2 = (JSONObject) obj2;
        if (AbstractC2980h.m5132a(jSONObject2.optString("iso_639_1"), "en")) {
            num = 0;
        } else if (jSONObject2.isNull("iso_639_1")) {
            num = 1;
        }
        return AbstractC0120b.m417m(num2, num);
    }
}
