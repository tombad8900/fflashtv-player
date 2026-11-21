package androidx.media3.common;

import android.view.View;
import p216z2.AbstractC2920v0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.p */
/* loaded from: classes.dex */
public final class C0228p {

    /* renamed from: a */
    public int f1276a;

    /* renamed from: b */
    public int f1277b;

    public /* synthetic */ C0228p(int i, int i4) {
        this.f1276a = i;
        this.f1277b = i4;
    }

    /* renamed from: a */
    public int m656a() {
        int i = this.f1277b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public void m657b(AbstractC2920v0 abstractC2920v0) {
        View view = abstractC2920v0.f10848a;
        this.f1276a = view.getLeft();
        this.f1277b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
