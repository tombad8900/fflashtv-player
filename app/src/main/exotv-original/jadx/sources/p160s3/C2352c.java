package p160s3;

import android.content.Context;
import android.util.DisplayMetrics;
import p065h3.C1161f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.c */
/* loaded from: classes.dex */
public final class C2352c implements InterfaceC2358i {

    /* renamed from: a */
    public final Context f8262a;

    public C2352c(Context context) {
        this.f8262a = context;
    }

    @Override // p160s3.InterfaceC2358i
    /* renamed from: a */
    public final Object mo4189a(C1161f c1161f) {
        DisplayMetrics displayMetrics = this.f8262a.getResources().getDisplayMetrics();
        C2350a c2350a = new C2350a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C2357h(c2350a, c2350a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2352c) {
            return AbstractC2980h.m5132a(this.f8262a, ((C2352c) obj).f8262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8262a.hashCode();
    }
}
