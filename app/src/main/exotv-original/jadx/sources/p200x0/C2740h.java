package p200x0;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import p183v0.AbstractC2508h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.h */
/* loaded from: classes.dex */
public final class C2740h extends AbstractC2508h {

    /* renamed from: a */
    public final WeakReference f10115a;

    public C2740h(EditText editText) {
        this.f10115a = new WeakReference(editText);
    }

    @Override // p183v0.AbstractC2508h
    /* renamed from: a */
    public final void mo4521a() {
        C2741i.m4805a((EditText) this.f10115a.get(), 1);
    }
}
