package p040e3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.n */
/* loaded from: classes.dex */
public final class C0876n extends Drawable.ConstantState {

    /* renamed from: a */
    public int f3860a;

    /* renamed from: b */
    public C0875m f3861b;

    /* renamed from: c */
    public ColorStateList f3862c;

    /* renamed from: d */
    public PorterDuff.Mode f3863d;

    /* renamed from: e */
    public boolean f3864e;

    /* renamed from: f */
    public Bitmap f3865f;

    /* renamed from: g */
    public ColorStateList f3866g;

    /* renamed from: h */
    public PorterDuff.Mode f3867h;

    /* renamed from: i */
    public int f3868i;

    /* renamed from: j */
    public boolean f3869j;

    /* renamed from: k */
    public boolean f3870k;

    /* renamed from: l */
    public Paint f3871l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3860a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0878p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0878p(this);
    }
}
