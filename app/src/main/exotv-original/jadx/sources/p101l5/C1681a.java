package p101l5;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import p040e3.C0864b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l5.a */
/* loaded from: classes.dex */
public final class C1681a {

    /* renamed from: a */
    public C0864b f6458a;

    /* renamed from: b */
    public final /* synthetic */ C1683c f6459b;

    public C1681a(C1683c c1683c) {
        this.f6459b = c1683c;
    }

    /* renamed from: a */
    public final void m3380a(Drawable drawable) {
        C1683c c1683c = this.f6459b;
        ColorStateList colorStateList = c1683c.f6482x;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c1683c.f6466B, colorStateList.getDefaultColor()));
        }
    }
}
