package p211y5;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p145q5.C2272a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.h */
/* loaded from: classes.dex */
public class C2821h extends Drawable.ConstantState {

    /* renamed from: a */
    public InterfaceC2826m f10459a;

    /* renamed from: b */
    public C2272a f10460b;

    /* renamed from: c */
    public ColorStateList f10461c;

    /* renamed from: d */
    public ColorStateList f10462d;

    /* renamed from: e */
    public ColorStateList f10463e;

    /* renamed from: f */
    public PorterDuff.Mode f10464f;

    /* renamed from: g */
    public Rect f10465g;

    /* renamed from: h */
    public final float f10466h;

    /* renamed from: i */
    public float f10467i;

    /* renamed from: j */
    public float f10468j;

    /* renamed from: k */
    public int f10469k;

    /* renamed from: l */
    public float f10470l;

    /* renamed from: m */
    public float f10471m;

    /* renamed from: n */
    public int f10472n;

    /* renamed from: o */
    public int f10473o;

    /* renamed from: p */
    public final Paint.Style f10474p;

    public C2821h(InterfaceC2826m interfaceC2826m) {
        this.f10461c = null;
        this.f10462d = null;
        this.f10463e = null;
        this.f10464f = PorterDuff.Mode.SRC_IN;
        this.f10465g = null;
        this.f10466h = 1.0f;
        this.f10467i = 1.0f;
        this.f10469k = 255;
        this.f10470l = 0.0f;
        this.f10471m = 0.0f;
        this.f10472n = 0;
        this.f10473o = 0;
        this.f10474p = Paint.Style.FILL_AND_STROKE;
        this.f10459a = interfaceC2826m;
        this.f10460b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C2823j c2823j = new C2823j(this);
        c2823j.f10496o = true;
        c2823j.f10497p = true;
        return c2823j;
    }

    public C2821h(C2821h c2821h) {
        this.f10461c = null;
        this.f10462d = null;
        this.f10463e = null;
        this.f10464f = PorterDuff.Mode.SRC_IN;
        this.f10465g = null;
        this.f10466h = 1.0f;
        this.f10467i = 1.0f;
        this.f10469k = 255;
        this.f10470l = 0.0f;
        this.f10471m = 0.0f;
        this.f10472n = 0;
        this.f10473o = 0;
        this.f10474p = Paint.Style.FILL_AND_STROKE;
        this.f10459a = c2821h.f10459a;
        this.f10460b = c2821h.f10460b;
        this.f10468j = c2821h.f10468j;
        this.f10461c = c2821h.f10461c;
        this.f10462d = c2821h.f10462d;
        this.f10464f = c2821h.f10464f;
        this.f10463e = c2821h.f10463e;
        this.f10469k = c2821h.f10469k;
        this.f10466h = c2821h.f10466h;
        this.f10473o = c2821h.f10473o;
        this.f10467i = c2821h.f10467i;
        this.f10470l = c2821h.f10470l;
        this.f10471m = c2821h.f10471m;
        this.f10472n = c2821h.f10472n;
        this.f10474p = c2821h.f10474p;
        if (c2821h.f10465g != null) {
            this.f10465g = new Rect(c2821h.f10465g);
        }
    }
}
