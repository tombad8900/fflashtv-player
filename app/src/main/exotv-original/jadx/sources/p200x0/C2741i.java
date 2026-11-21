package p200x0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p183v0.C2510j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.i */
/* loaded from: classes.dex */
public final class C2741i implements TextWatcher {

    /* renamed from: j */
    public final EditText f10116j;

    /* renamed from: k */
    public C2740h f10117k;

    /* renamed from: l */
    public boolean f10118l = true;

    public C2741i(EditText editText) {
        this.f10116j = editText;
    }

    /* renamed from: a */
    public static void m4805a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2510j c2510jM4522a = C2510j.m4522a();
            if (editableText == null) {
                length = 0;
            } else {
                c2510jM4522a.getClass();
                length = editableText.length();
            }
            c2510jM4522a.m4526e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i8) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i8) throws Throwable {
        EditText editText = this.f10116j;
        if (editText.isInEditMode() || !this.f10118l || C2510j.f9142k == null || i4 > i8 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM4523b = C2510j.m4522a().m4523b();
        if (iM4523b != 0) {
            if (iM4523b == 1) {
                C2510j.m4522a().m4526e((Spannable) charSequence, i, i8 + i);
                return;
            } else if (iM4523b != 3) {
                return;
            }
        }
        C2510j c2510jM4522a = C2510j.m4522a();
        if (this.f10117k == null) {
            this.f10117k = new C2740h(editText);
        }
        c2510jM4522a.m4527f(this.f10117k);
    }
}
