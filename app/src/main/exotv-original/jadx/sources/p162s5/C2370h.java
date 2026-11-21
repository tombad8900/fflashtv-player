package p162s5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.google.android.material.textfield.TextInputLayout;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s5.h */
/* loaded from: classes.dex */
public final class C2370h {

    /* renamed from: a */
    public CharSequence f8352a;

    /* renamed from: b */
    public final TextPaint f8353b;

    /* renamed from: c */
    public final int f8354c;

    /* renamed from: d */
    public int f8355d;

    /* renamed from: k */
    public boolean f8362k;

    /* renamed from: m */
    public C0456a f8364m;

    /* renamed from: e */
    public Layout.Alignment f8356e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f8357f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f8358g = 0.0f;

    /* renamed from: h */
    public float f8359h = 1.0f;

    /* renamed from: i */
    public int f8360i = 1;

    /* renamed from: j */
    public boolean f8361j = true;

    /* renamed from: l */
    public TextUtils.TruncateAt f8363l = null;

    public C2370h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f8352a = charSequence;
        this.f8353b = textPaint;
        this.f8354c = i;
        this.f8355d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m4209a() {
        if (this.f8352a == null) {
            this.f8352a = C2181z.FRAGMENT_ENCODE_SET;
        }
        int iMax = Math.max(0, this.f8354c);
        CharSequence charSequenceEllipsize = this.f8352a;
        int i = this.f8357f;
        TextPaint textPaint = this.f8353b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f8363l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f8355d);
        this.f8355d = iMin;
        if (this.f8362k && this.f8357f == 1) {
            this.f8356e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f8356e);
        builderObtain.setIncludePad(this.f8361j);
        builderObtain.setTextDirection(this.f8362k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8363l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f8357f);
        float f8 = this.f8358g;
        if (f8 != 0.0f || this.f8359h != 1.0f) {
            builderObtain.setLineSpacing(f8, this.f8359h);
        }
        if (this.f8357f > 1) {
            builderObtain.setHyphenationFrequency(this.f8360i);
        }
        C0456a c0456a = this.f8364m;
        if (c0456a != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) c0456a.f1850k).f3413D.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
