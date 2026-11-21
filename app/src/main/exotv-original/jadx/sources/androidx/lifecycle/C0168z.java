package androidx.lifecycle;

import p002a1.C0036o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C0168z {

    /* renamed from: a */
    public final C0036o f960a;

    /* renamed from: b */
    public boolean f961b;

    /* renamed from: c */
    public int f962c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0123a0 f963d;

    public C0168z(C0123a0 c0123a0, C0036o c0036o) {
        this.f963d = c0123a0;
        this.f960a = c0036o;
    }

    /* renamed from: a */
    public final void m591a(boolean z7) {
        if (z7 == this.f961b) {
            return;
        }
        this.f961b = z7;
        int i = z7 ? 1 : -1;
        C0123a0 c0123a0 = this.f963d;
        int i4 = c0123a0.f891c;
        c0123a0.f891c = i + i4;
        if (!c0123a0.f892d) {
            c0123a0.f892d = true;
            while (true) {
                try {
                    int i8 = c0123a0.f891c;
                    if (i4 == i8) {
                        break;
                    } else {
                        i4 = i8;
                    }
                } finally {
                    c0123a0.f892d = false;
                }
            }
        }
        if (this.f961b) {
            c0123a0.m550c(this);
        }
    }
}
