package p200x0;

import android.text.InputFilter;
import android.widget.TextView;
import p168t2.AbstractC2415i0;
import p183v0.C2510j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.g */
/* loaded from: classes.dex */
public final class C2739g extends AbstractC2415i0 {

    /* renamed from: a */
    public final C2738f f10114a;

    public C2739g(TextView textView) {
        this.f10114a = new C2738f(textView);
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: B */
    public final void mo4270B(boolean z7) {
        if (C2510j.f9142k != null) {
            this.f10114a.mo4270B(z7);
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: C */
    public final void mo4271C(boolean z7) {
        C2738f c2738f = this.f10114a;
        if (C2510j.f9142k != null) {
            c2738f.mo4271C(z7);
        } else {
            c2738f.f10113c = z7;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: j */
    public final InputFilter[] mo4277j(InputFilter[] inputFilterArr) {
        return !(C2510j.f9142k != null) ? inputFilterArr : this.f10114a.mo4277j(inputFilterArr);
    }
}
