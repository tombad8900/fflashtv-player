package p002a1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import p028d.C0783a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.e0 */
/* loaded from: classes.dex */
public final class C0017e0 {

    /* renamed from: a */
    public final /* synthetic */ int f64a;

    /* renamed from: b */
    public final /* synthetic */ C0035n0 f65b;

    public /* synthetic */ C0017e0(C0035n0 c0035n0, int i) {
        this.f64a = i;
        this.f65b = c0035n0;
    }

    /* renamed from: a */
    public final void m70a(Object obj) {
        switch (this.f64a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                C0035n0 c0035n0 = this.f65b;
                C0029k0 c0029k0 = (C0029k0) c0035n0.f104C.pollFirst();
                if (c0029k0 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = c0029k0.f91j;
                    if (c0035n0.f117c.m74e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0783a c0783a = (C0783a) obj;
                C0035n0 c0035n02 = this.f65b;
                C0029k0 c0029k02 = (C0029k0) c0035n02.f104C.pollFirst();
                if (c0029k02 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = c0029k02.f91j;
                    int i4 = c0029k02.f92k;
                    AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM74e = c0035n02.f117c.m74e(str2);
                    if (abstractComponentCallbacksC0050vM74e == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        abstractComponentCallbacksC0050vM74e.m236r(i4, c0783a.f3533j, c0783a.f3534k);
                        break;
                    }
                }
            default:
                C0783a c0783a2 = (C0783a) obj;
                C0035n0 c0035n03 = this.f65b;
                C0029k0 c0029k03 = (C0029k0) c0035n03.f104C.pollFirst();
                if (c0029k03 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = c0029k03.f91j;
                    int i8 = c0029k03.f92k;
                    AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM74e2 = c0035n03.f117c.m74e(str3);
                    if (abstractComponentCallbacksC0050vM74e2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        abstractComponentCallbacksC0050vM74e2.m236r(i8, c0783a2.f3533j, c0783a2.f3534k);
                        break;
                    }
                }
        }
    }
}
