package p205x5;

import android.graphics.Paint;
import android.graphics.Path;
import p037e0.AbstractC0850a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x5.a */
/* loaded from: classes.dex */
public final class C2782a {

    /* renamed from: i */
    public static final int[] f10331i = new int[3];

    /* renamed from: j */
    public static final float[] f10332j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f10333k = new int[4];

    /* renamed from: l */
    public static final float[] f10334l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f10335a;

    /* renamed from: b */
    public final Paint f10336b;

    /* renamed from: c */
    public final Paint f10337c;

    /* renamed from: d */
    public final int f10338d;

    /* renamed from: e */
    public final int f10339e;

    /* renamed from: f */
    public final int f10340f;

    /* renamed from: g */
    public final Path f10341g = new Path();

    /* renamed from: h */
    public final Paint f10342h;

    public C2782a() {
        Paint paint = new Paint();
        this.f10342h = paint;
        Paint paint2 = new Paint();
        this.f10335a = paint2;
        this.f10338d = AbstractC0850a.m2019d(-16777216, 68);
        this.f10339e = AbstractC0850a.m2019d(-16777216, 20);
        this.f10340f = AbstractC0850a.m2019d(-16777216, 0);
        paint2.setColor(this.f10338d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f10336b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f10337c = new Paint(paint3);
    }
}
