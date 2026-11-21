package p183v0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p090k2.C1584b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.y */
/* loaded from: classes.dex */
public final class C2525y implements Spannable {

    /* renamed from: j */
    public boolean f9185j = false;

    /* renamed from: k */
    public Spannable f9186k;

    public C2525y(Spannable spannable) {
        this.f9186k = spannable;
    }

    /* renamed from: a */
    public final void m4541a() {
        Spannable spannable = this.f9186k;
        if (!this.f9185j) {
            if ((Build.VERSION.SDK_INT < 28 ? new C1584b(25) : new C2524x(25)).mo3262s(spannable)) {
                this.f9186k = new SpannableString(spannable);
            }
        }
        this.f9185j = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f9186k.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f9186k.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f9186k.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f9186k.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f9186k.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f9186k.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        return this.f9186k.getSpans(i, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9186k.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        return this.f9186k.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m4541a();
        this.f9186k.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i8) {
        m4541a();
        this.f9186k.setSpan(obj, i, i4, i8);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return this.f9186k.subSequence(i, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f9186k.toString();
    }
}
