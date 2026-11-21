package p017b6;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.r */
/* loaded from: classes.dex */
public final class C0618r {

    /* renamed from: a */
    public final /* synthetic */ C0620t f2437a;

    public C0618r(C0620t c0620t) {
        this.f2437a = c0620t;
    }

    /* renamed from: a */
    public final void m1372a(TextInputLayout textInputLayout) {
        C0620t c0620t = this.f2437a;
        C0617q c0617q = c0620t.f2446E;
        if (c0620t.f2443B == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0620t.f2443B;
        if (editText != null) {
            editText.removeTextChangedListener(c0617q);
            if (c0620t.f2443B.getOnFocusChangeListener() == c0620t.m1374b().mo1355e()) {
                c0620t.f2443B.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0620t.f2443B = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0617q);
        }
        c0620t.m1374b().mo1345l(c0620t.f2443B);
        c0620t.m1383k(c0620t.m1374b());
    }
}
