package p156s;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p216z2.C2897k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.d */
/* loaded from: classes.dex */
public final class C2331d implements Comparator {

    /* renamed from: j */
    public final /* synthetic */ int f8168j;

    public /* synthetic */ C2331d(int i) {
        this.f8168j = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8168j) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                float fM3534f = AbstractC1804e0.m3534f((View) obj);
                float fM3534f2 = AbstractC1804e0.m3534f((View) obj2);
                if (fM3534f <= fM3534f2) {
                    if (fM3534f >= fM3534f2) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                C2897k c2897k = (C2897k) obj;
                C2897k c2897k2 = (C2897k) obj2;
                RecyclerView recyclerView = c2897k.f10745d;
                if ((recyclerView == null) == (c2897k2.f10745d == null)) {
                    boolean z7 = c2897k.f10742a;
                    if (z7 == c2897k2.f10742a) {
                        int i = c2897k2.f10743b - c2897k.f10743b;
                        if (i == 0) {
                            int i4 = c2897k.f10744c - c2897k2.f10744c;
                            if (i4 == 0) {
                                break;
                            }
                        }
                    } else if (!z7) {
                    }
                } else if (recyclerView == null) {
                }
                break;
        }
        return 0;
    }
}
