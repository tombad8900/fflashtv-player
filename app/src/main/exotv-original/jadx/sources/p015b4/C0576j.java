package p015b4;

import android.graphics.Bitmap;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b4.j */
/* loaded from: classes.dex */
public final class C0576j implements InterfaceC0574h {

    /* renamed from: a */
    public final C0571e f2300a;

    /* renamed from: b */
    public int f2301b;

    /* renamed from: c */
    public Bitmap.Config f2302c;

    public C0576j(C0571e c0571e) {
        this.f2300a = c0571e;
    }

    @Override // p015b4.InterfaceC0574h
    /* renamed from: a */
    public final void mo1315a() {
        this.f2300a.m570c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0576j) {
            C0576j c0576j = (C0576j) obj;
            if (this.f2301b == c0576j.f2301b && AbstractC2478m.m4454b(this.f2302c, c0576j.f2302c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2301b * 31;
        Bitmap.Config config = this.f2302c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C0577k.m1327c(this.f2301b, this.f2302c);
    }
}
