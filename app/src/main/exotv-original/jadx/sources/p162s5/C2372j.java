package p162s5;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p110m5.C1901b;
import p110m5.C1905f;
import p187v5.C2552d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s5.j */
/* loaded from: classes.dex */
public final class C2372j {

    /* renamed from: c */
    public float f8367c;

    /* renamed from: e */
    public final WeakReference f8369e;

    /* renamed from: f */
    public C2552d f8370f;

    /* renamed from: a */
    public final TextPaint f8365a = new TextPaint(1);

    /* renamed from: b */
    public final C1901b f8366b = new C1901b(1, this);

    /* renamed from: d */
    public boolean f8368d = true;

    public C2372j(C1905f c1905f) {
        this.f8369e = new WeakReference(null);
        this.f8369e = new WeakReference(c1905f);
    }

    /* renamed from: a */
    public final float m4210a(String str) {
        if (!this.f8368d) {
            return this.f8367c;
        }
        TextPaint textPaint = this.f8365a;
        this.f8367c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f8368d = false;
        return this.f8367c;
    }
}
