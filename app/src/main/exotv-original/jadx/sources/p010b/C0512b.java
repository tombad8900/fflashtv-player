package p010b;

import android.window.BackEvent;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.b */
/* loaded from: classes.dex */
public final class C0512b {

    /* renamed from: a */
    public final float f2112a;

    /* renamed from: b */
    public final float f2113b;

    /* renamed from: c */
    public final float f2114c;

    /* renamed from: d */
    public final int f2115d;

    public C0512b(BackEvent backEvent) {
        C0511a c0511a = C0511a.f2111a;
        float fM1239d = c0511a.m1239d(backEvent);
        float fM1240e = c0511a.m1240e(backEvent);
        float fM1237b = c0511a.m1237b(backEvent);
        int iM1238c = c0511a.m1238c(backEvent);
        this.f2112a = fM1239d;
        this.f2113b = fM1240e;
        this.f2114c = fM1237b;
        this.f2115d = iM1238c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2112a + ", touchY=" + this.f2113b + ", progress=" + this.f2114c + ", swipeEdge=" + this.f2115d + '}';
    }
}
