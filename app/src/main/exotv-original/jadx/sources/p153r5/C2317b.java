package p153r5;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;
import p211y5.C2814c0;
import p211y5.C2828o;
import p211y5.InterfaceC2826m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r5.b */
/* loaded from: classes.dex */
public final class C2317b extends Drawable.ConstantState {

    /* renamed from: a */
    public Drawable.ConstantState f8105a;

    /* renamed from: b */
    public int f8106b;

    /* renamed from: c */
    public boolean f8107c;

    /* renamed from: d */
    public int f8108d;

    /* renamed from: e */
    public boolean f8109e;

    /* renamed from: f */
    public int f8110f;

    /* renamed from: g */
    public int f8111g;

    /* renamed from: h */
    public int f8112h;

    /* renamed from: i */
    public int f8113i;

    /* renamed from: j */
    public float f8114j;

    /* renamed from: k */
    public int f8115k;

    /* renamed from: l */
    public float f8116l;

    /* renamed from: m */
    public int f8117m;

    /* renamed from: n */
    public float f8118n;

    /* renamed from: o */
    public int f8119o;

    /* renamed from: p */
    public float f8120p;

    /* renamed from: q */
    public int f8121q;

    /* renamed from: r */
    public float f8122r;

    /* renamed from: s */
    public int f8123s;

    /* renamed from: t */
    public InterfaceC2826m f8124t;

    /* renamed from: u */
    public int f8125u;

    /* renamed from: v */
    public int f8126v;

    /* renamed from: w */
    public final Rect f8127w;

    /* renamed from: x */
    public int[] f8128x;

    public C2317b(C2317b c2317b) {
        this.f8106b = 0;
        this.f8107c = false;
        this.f8108d = Integer.MIN_VALUE;
        this.f8109e = false;
        this.f8110f = Integer.MIN_VALUE;
        this.f8111g = Integer.MIN_VALUE;
        this.f8112h = Integer.MIN_VALUE;
        this.f8113i = Integer.MIN_VALUE;
        this.f8114j = Float.NaN;
        this.f8115k = Integer.MIN_VALUE;
        this.f8116l = Float.NaN;
        this.f8117m = Integer.MIN_VALUE;
        this.f8118n = Float.NaN;
        this.f8119o = Integer.MIN_VALUE;
        this.f8120p = Float.NaN;
        this.f8121q = Integer.MIN_VALUE;
        this.f8122r = Float.NaN;
        this.f8123s = Integer.MIN_VALUE;
        this.f8124t = null;
        this.f8125u = Integer.MIN_VALUE;
        this.f8126v = Integer.MIN_VALUE;
        this.f8127w = null;
        this.f8128x = FocusRingDrawable.f3340z;
        if (c2317b != null) {
            this.f8105a = c2317b.f8105a;
            this.f8106b = c2317b.f8106b;
            this.f8107c = c2317b.f8107c;
            this.f8108d = c2317b.f8108d;
            this.f8109e = c2317b.f8109e;
            this.f8110f = c2317b.f8110f;
            this.f8111g = c2317b.f8111g;
            this.f8112h = c2317b.f8112h;
            this.f8113i = c2317b.f8113i;
            this.f8114j = c2317b.f8114j;
            this.f8115k = c2317b.f8115k;
            this.f8116l = c2317b.f8116l;
            this.f8117m = c2317b.f8117m;
            this.f8118n = c2317b.f8118n;
            this.f8119o = c2317b.f8119o;
            this.f8120p = c2317b.f8120p;
            this.f8121q = c2317b.f8121q;
            this.f8122r = c2317b.f8122r;
            this.f8123s = c2317b.f8123s;
            this.f8125u = c2317b.f8125u;
            this.f8126v = c2317b.f8126v;
            InterfaceC2826m interfaceC2826m = c2317b.f8124t;
            if (interfaceC2826m instanceof C2828o) {
                this.f8124t = ((C2828o) interfaceC2826m).m4956j().m4951a();
            } else if (interfaceC2826m instanceof C2814c0) {
                this.f8124t = ((C2814c0) interfaceC2826m).m4925i().m4915b();
            } else {
                this.f8124t = interfaceC2826m;
            }
            if (c2317b.f8127w != null) {
                this.f8127w = new Rect(c2317b.f8127w);
            }
            int[] iArr = c2317b.f8128x;
            this.f8128x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f8105a;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f8106b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
