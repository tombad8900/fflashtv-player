package p200x0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p183v0.C2510j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.d */
/* loaded from: classes.dex */
public final class C2736d implements InputFilter {

    /* renamed from: a */
    public final TextView f10107a;

    /* renamed from: b */
    public C2735c f10108b;

    public C2736d(TextView textView) {
        this.f10107a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i4, Spanned spanned, int i8, int i9) {
        TextView textView = this.f10107a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM4523b = C2510j.m4522a().m4523b();
        if (iM4523b != 0) {
            if (iM4523b == 1) {
                if ((i9 == 0 && i8 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i4);
                }
                return C2510j.m4522a().m4526e(charSequence, 0, charSequence.length());
            }
            if (iM4523b != 3) {
                return charSequence;
            }
        }
        C2510j c2510jM4522a = C2510j.m4522a();
        if (this.f10108b == null) {
            this.f10108b = new C2735c(textView, this);
        }
        c2510jM4522a.m4527f(this.f10108b);
        return charSequence;
    }
}
