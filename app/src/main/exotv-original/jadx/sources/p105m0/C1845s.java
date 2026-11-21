package p105m0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import p090k2.C1584b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.s */
/* loaded from: classes.dex */
public final class C1845s {

    /* renamed from: a */
    public final InterfaceC1842r f6935a;

    public C1845s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f6935a = new C1839q(nestedScrollView);
        } else {
            this.f6935a = new C1584b(5);
        }
    }
}
