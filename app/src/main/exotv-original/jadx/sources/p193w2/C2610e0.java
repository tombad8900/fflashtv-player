package p193w2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.e0 */
/* loaded from: classes.dex */
public final class C2610e0 {

    /* renamed from: A */
    public int f9420A;

    /* renamed from: B */
    public int f9421B;

    /* renamed from: C */
    public int f9422C;

    /* renamed from: D */
    public int f9423D;

    /* renamed from: E */
    public StaticLayout f9424E;

    /* renamed from: F */
    public StaticLayout f9425F;

    /* renamed from: G */
    public int f9426G;

    /* renamed from: H */
    public int f9427H;

    /* renamed from: I */
    public int f9428I;

    /* renamed from: J */
    public Rect f9429J;

    /* renamed from: a */
    public final float f9430a;

    /* renamed from: b */
    public final float f9431b;

    /* renamed from: c */
    public final float f9432c;

    /* renamed from: d */
    public final float f9433d;

    /* renamed from: e */
    public final float f9434e;

    /* renamed from: f */
    public final TextPaint f9435f;

    /* renamed from: g */
    public final Paint f9436g;

    /* renamed from: h */
    public final Paint f9437h;

    /* renamed from: i */
    public CharSequence f9438i;

    /* renamed from: j */
    public Layout.Alignment f9439j;

    /* renamed from: k */
    public Bitmap f9440k;

    /* renamed from: l */
    public float f9441l;

    /* renamed from: m */
    public int f9442m;

    /* renamed from: n */
    public int f9443n;

    /* renamed from: o */
    public float f9444o;

    /* renamed from: p */
    public int f9445p;

    /* renamed from: q */
    public float f9446q;

    /* renamed from: r */
    public float f9447r;

    /* renamed from: s */
    public int f9448s;

    /* renamed from: t */
    public int f9449t;

    /* renamed from: u */
    public int f9450u;

    /* renamed from: v */
    public int f9451v;

    /* renamed from: w */
    public int f9452w;

    /* renamed from: x */
    public float f9453x;

    /* renamed from: y */
    public float f9454y;

    /* renamed from: z */
    public float f9455z;

    public C2610e0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f9434e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f9433d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f9430a = fRound;
        this.f9431b = fRound;
        this.f9432c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f9435f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f9436g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f9437h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public final void m4698a(Canvas canvas, boolean z7) {
        Canvas canvas2;
        if (!z7) {
            this.f9429J.getClass();
            this.f9440k.getClass();
            canvas.drawBitmap(this.f9440k, (Rect) null, this.f9429J, this.f9437h);
            return;
        }
        StaticLayout staticLayout = this.f9424E;
        StaticLayout staticLayout2 = this.f9425F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f9426G, this.f9427H);
        if (Color.alpha(this.f9450u) > 0) {
            int i = this.f9450u;
            Paint paint = this.f9436g;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(-this.f9428I, 0.0f, staticLayout.getWidth() + this.f9428I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i4 = this.f9452w;
        TextPaint textPaint = this.f9435f;
        if (i4 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f9430a);
            textPaint.setColor(this.f9451v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f8 = this.f9431b;
            if (i4 == 2) {
                float f9 = this.f9432c;
                textPaint.setShadowLayer(f8, f9, f9, this.f9451v);
            } else if (i4 == 3 || i4 == 4) {
                boolean z8 = i4 == 3;
                int i8 = z8 ? -1 : this.f9451v;
                int i9 = z8 ? this.f9451v : -1;
                float f10 = f8 / 2.0f;
                textPaint.setColor(this.f9448s);
                textPaint.setStyle(Paint.Style.FILL);
                float f11 = -f10;
                textPaint.setShadowLayer(f8, f11, f11, i8);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f8, f10, f10, i9);
            }
        }
        textPaint.setColor(this.f9448s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
