package p017b6;

import android.text.Editable;
import p162s5.AbstractC2373k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.q */
/* loaded from: classes.dex */
public final class C0617q extends AbstractC2373k {

    /* renamed from: j */
    public final /* synthetic */ C0620t f2436j;

    public C0617q(C0620t c0620t) {
        this.f2436j = c0620t;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2436j.m1374b().mo1354a();
    }

    @Override // p162s5.AbstractC2373k, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i8) {
        this.f2436j.m1374b().mo1339b();
    }
}
