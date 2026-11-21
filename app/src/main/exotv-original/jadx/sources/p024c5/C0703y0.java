package p024c5;

import android.text.Editable;
import android.text.TextWatcher;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.y0 */
/* loaded from: classes.dex */
public final class C0703y0 implements TextWatcher {

    /* renamed from: j */
    public final /* synthetic */ C0648a1 f2750j;

    public C0703y0(C0648a1 c0648a1) {
        this.f2750j = c0648a1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = C2181z.FRAGMENT_ENCODE_SET;
        }
        this.f2750j.m1429c(string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i8) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i8) {
    }
}
