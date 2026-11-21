package p010b;

import android.window.BackEvent;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C0511a {

    /* renamed from: a */
    public static final C0511a f2111a = new C0511a();

    /* renamed from: a */
    public final BackEvent m1236a(float f8, float f9, float f10, int i) {
        return new BackEvent(f8, f9, f10, i);
    }

    /* renamed from: b */
    public final float m1237b(BackEvent backEvent) {
        AbstractC2980h.m5136e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m1238c(BackEvent backEvent) {
        AbstractC2980h.m5136e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m1239d(BackEvent backEvent) {
        AbstractC2980h.m5136e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m1240e(BackEvent backEvent) {
        AbstractC2980h.m5136e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
