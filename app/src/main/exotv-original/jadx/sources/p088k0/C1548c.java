package p088k0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C1548c {

    /* renamed from: a */
    public final TextPaint f5933a;

    /* renamed from: b */
    public final TextDirectionHeuristic f5934b;

    /* renamed from: c */
    public final int f5935c;

    /* renamed from: d */
    public final int f5936d;

    public C1548c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i4).setTextDirection(textDirectionHeuristic).build();
        }
        this.f5933a = textPaint;
        this.f5934b = textDirectionHeuristic;
        this.f5935c = i;
        this.f5936d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1548c)) {
            return false;
        }
        C1548c c1548c = (C1548c) obj;
        if (this.f5935c != c1548c.f5935c || this.f5936d != c1548c.f5936d) {
            return false;
        }
        TextPaint textPaint = this.f5933a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c1548c.f5933a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f5934b == c1548c.f5934b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f5933a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f5934b, Integer.valueOf(this.f5935c), Integer.valueOf(this.f5936d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f5933a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f5934b);
        sb.append(", breakStrategy=" + this.f5935c);
        sb.append(", hyphenationFrequency=" + this.f5936d);
        sb.append("}");
        return sb.toString();
    }

    public C1548c(PrecomputedText.Params params) {
        this.f5933a = params.getTextPaint();
        this.f5934b = params.getTextDirection();
        this.f5935c = params.getBreakStrategy();
        this.f5936d = params.getHyphenationFrequency();
    }
}
