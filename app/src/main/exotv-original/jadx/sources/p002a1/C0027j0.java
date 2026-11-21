package p002a1;

import android.content.Intent;
import android.support.v4.media.session.AbstractC0120b;
import java.util.ArrayList;
import java.util.Iterator;
import p028d.C0783a;
import p102l6.C1687d;
import p111m6.AbstractC1912g;
import p111m6.AbstractC1915j;
import p111m6.AbstractC1924s;
import p111m6.C1922q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.j0 */
/* loaded from: classes.dex */
public final class C0027j0 extends AbstractC0120b {

    /* renamed from: a */
    public final /* synthetic */ int f90a;

    public /* synthetic */ C0027j0(int i) {
        this.f90a = i;
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: D */
    public final Object mo98D(Intent intent, int i) {
        switch (this.f90a) {
            case 0:
                return new C0783a(intent, i);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i4 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i4 == 0));
                        }
                        ArrayList arrayListM3733q0 = AbstractC1912g.m3733q0(stringArrayExtra);
                        Iterator it = arrayListM3733q0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1915j.m3756w0(arrayListM3733q0), AbstractC1915j.m3756w0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C1687d(it.next(), it2.next()));
                        }
                        return AbstractC1924s.m3762W(arrayList2);
                    }
                }
                return C1922q.f7188j;
            default:
                return new C0783a(intent, i);
        }
    }
}
