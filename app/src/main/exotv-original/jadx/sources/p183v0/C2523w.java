package p183v0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import com.bumptech.glide.AbstractC0714c;
import java.nio.ByteBuffer;
import p002a1.C0022h;
import p191w0.C2597a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.w */
/* loaded from: classes.dex */
public final class C2523w extends ReplacementSpan {

    /* renamed from: k */
    public final C2522v f9181k;

    /* renamed from: n */
    public TextPaint f9184n;

    /* renamed from: j */
    public final Paint.FontMetricsInt f9180j = new Paint.FontMetricsInt();

    /* renamed from: l */
    public short f9182l = -1;

    /* renamed from: m */
    public float f9183m = 1.0f;

    public C2523w(C2522v c2522v) {
        AbstractC0714c.m1529o("rasterizer cannot be null", c2522v);
        this.f9181k = c2522v;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i4, float f8, int i8, int i9, int i10, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f9184n;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f9184n = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f8, i8, f8 + this.f9182l, i10, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C2510j.m4522a().getClass();
        float f9 = i9;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C2522v c2522v = this.f9181k;
        C0022h c0022h = c2522v.f9178b;
        Typeface typeface = (Typeface) c0022h.f81m;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0022h.f79k, c2522v.f9177a * 2, 2, f8, f9, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f9180j;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C2522v c2522v = this.f9181k;
        this.f9183m = fAbs / (c2522v.m4540b().m3506a(14) != 0 ? ((ByteBuffer) r8.f6855m).getShort(r1 + r8.f6852j) : (short) 0);
        C2597a c2597aM4540b = c2522v.m4540b();
        int iM3506a = c2597aM4540b.m3506a(14);
        if (iM3506a != 0) {
            ((ByteBuffer) c2597aM4540b.f6855m).getShort(iM3506a + c2597aM4540b.f6852j);
        }
        short s8 = (short) ((c2522v.m4540b().m3506a(12) != 0 ? ((ByteBuffer) r5.f6855m).getShort(r7 + r5.f6852j) : (short) 0) * this.f9183m);
        this.f9182l = s8;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s8;
    }
}
