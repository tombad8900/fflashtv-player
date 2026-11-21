package p052f6;

import android.support.v4.media.session.AbstractC0120b;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.x */
/* loaded from: classes.dex */
public final class C1015x extends AbstractC0988o {

    /* renamed from: j */
    public final Object f4282j;

    /* renamed from: k */
    public int f4283k;

    /* renamed from: l */
    public final /* synthetic */ C1021z f4284l;

    public C1015x(C1021z c1021z, int i) {
        this.f4284l = c1021z;
        Object obj = C1021z.f4296s;
        this.f4282j = c1021z.m2220i()[i];
        this.f4283k = i;
    }

    /* renamed from: a */
    public final void m2211a() {
        int i = this.f4283k;
        Object obj = this.f4282j;
        C1021z c1021z = this.f4284l;
        if (i != -1 && i < c1021z.size()) {
            if (AbstractC0120b.m422r(obj, c1021z.m2220i()[this.f4283k])) {
                return;
            }
        }
        Object obj2 = C1021z.f4296s;
        this.f4283k = c1021z.m2215d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4282j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1021z c1021z = this.f4284l;
        Map mapM2213b = c1021z.m2213b();
        if (mapM2213b != null) {
            return mapM2213b.get(this.f4282j);
        }
        m2211a();
        int i = this.f4283k;
        if (i == -1) {
            return null;
        }
        return c1021z.m2221j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1021z c1021z = this.f4284l;
        Map mapM2213b = c1021z.m2213b();
        Object obj2 = this.f4282j;
        if (mapM2213b != null) {
            return mapM2213b.put(obj2, obj);
        }
        m2211a();
        int i = this.f4283k;
        if (i == -1) {
            c1021z.put(obj2, obj);
            return null;
        }
        Object obj3 = c1021z.m2221j()[i];
        c1021z.m2221j()[this.f4283k] = obj;
        return obj3;
    }
}
