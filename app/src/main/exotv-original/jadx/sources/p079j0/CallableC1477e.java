package p079j0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class CallableC1477e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f5694a;

    /* renamed from: b */
    public final /* synthetic */ String f5695b;

    /* renamed from: c */
    public final /* synthetic */ Context f5696c;

    /* renamed from: d */
    public final /* synthetic */ int f5697d;

    /* renamed from: e */
    public final /* synthetic */ Object f5698e;

    public /* synthetic */ CallableC1477e(String str, Context context, Object obj, int i, int i4) {
        this.f5694a = i4;
        this.f5695b = str;
        this.f5696c = context;
        this.f5698e = obj;
        this.f5697d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5694a) {
            case 0:
                Object[] objArr = {(C1476d) this.f5698e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return AbstractC1480h.m3144b(this.f5695b, this.f5696c, Collections.unmodifiableList(arrayList), this.f5697d);
            default:
                try {
                    return AbstractC1480h.m3144b(this.f5695b, this.f5696c, (List) this.f5698e, this.f5697d);
                } catch (Throwable unused) {
                    return new C1479g(-3);
                }
        }
    }
}
