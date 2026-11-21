package p029d0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d0.h */
/* loaded from: classes.dex */
public final class C0792h {

    /* renamed from: a */
    public final ColorStateList f3563a;

    /* renamed from: b */
    public final Configuration f3564b;

    /* renamed from: c */
    public final int f3565c;

    public C0792h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3563a = colorStateList;
        this.f3564b = configuration;
        this.f3565c = theme == null ? 0 : theme.hashCode();
    }
}
