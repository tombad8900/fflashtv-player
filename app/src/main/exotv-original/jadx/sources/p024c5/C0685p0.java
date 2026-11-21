package p024c5;

import android.support.v4.media.session.AbstractC0120b;
import java.util.Comparator;
import org.json.JSONObject;
import p102l6.C1687d;
import p204x4.C2774q;
import p204x4.C2777t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.p0 */
/* loaded from: classes.dex */
public final class C0685p0 implements Comparator {

    /* renamed from: j */
    public final /* synthetic */ int f2682j;

    /* renamed from: k */
    public final /* synthetic */ Comparator f2683k;

    public /* synthetic */ C0685p0(Comparator comparator, int i) {
        this.f2682j = i;
        this.f2683k = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2682j) {
            case 0:
                int iCompare = ((C0683o0) this.f2683k).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC0120b.m417m(Double.valueOf(((JSONObject) obj2).optDouble("vote_average")), Double.valueOf(((JSONObject) obj).optDouble("vote_average")));
            case 1:
                int iCompare2 = ((C0685p0) this.f2683k).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC0120b.m417m(Integer.valueOf(((JSONObject) obj2).optInt("width")), Integer.valueOf(((JSONObject) obj).optInt("width")));
            default:
                int iCompare3 = ((C2774q) this.f2683k).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC0120b.m417m(Integer.valueOf(((C2777t) ((C1687d) obj2).f6486j).f10303g), Integer.valueOf(((C2777t) ((C1687d) obj).f6486j).f10303g));
        }
    }
}
