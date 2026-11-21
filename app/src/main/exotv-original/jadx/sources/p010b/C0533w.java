package p010b;

import com.exotv.net.MainActivity;
import java.util.Set;
import p077j$.time.LocalDate;
import p102l6.C1693j;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2979g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C0533w extends AbstractC2979g implements InterfaceC2840a {

    /* renamed from: r */
    public final /* synthetic */ int f2179r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0533w(int i, Object obj, Class cls, String str, String str2, int i4, int i8, int i9) {
        super(i, obj, cls, str, str2, i4, i8);
        this.f2179r = i9;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        int i = this.f2179r;
        C1693j c1693j = C1693j.f6497a;
        Object obj = this.f11101k;
        switch (i) {
            case 0:
                ((C0534x) obj).m1259e();
                return c1693j;
            case 1:
                ((C0534x) obj).m1259e();
                return c1693j;
            default:
                Set set = MainActivity.f2882p0;
                ((MainActivity) obj).getClass();
                LocalDate localDateNow = LocalDate.now();
                return "with_watch_providers=8%7C9&watch_region=US&with_watch_monetization_types=flatrate&first_air_date.gte=" + localDateNow.minusDays(90L) + "&first_air_date.lte=" + localDateNow + "&sort_by=popularity.desc";
        }
    }
}
