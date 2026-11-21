package p017b6;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.d0 */
/* loaded from: classes.dex */
public final class C0598d0 implements TextWatcher {

    /* renamed from: j */
    public int f2390j;

    /* renamed from: k */
    public final /* synthetic */ EditText f2391k;

    /* renamed from: l */
    public final /* synthetic */ TextInputLayout f2392l;

    public C0598d0(TextInputLayout textInputLayout, EditText editText) {
        this.f2392l = textInputLayout;
        this.f2391k = editText;
        this.f2390j = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f2392l;
        textInputLayout.m1913w(!textInputLayout.f3428K0, false);
        if (textInputLayout.f3473u) {
            textInputLayout.m1906p(editable);
        }
        if (textInputLayout.f3411C) {
            textInputLayout.m1914x(editable);
        }
        EditText editText = this.f2391k;
        int lineCount = editText.getLineCount();
        int i = this.f2390j;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f3414D0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f2390j = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i8) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i8) {
    }
}
