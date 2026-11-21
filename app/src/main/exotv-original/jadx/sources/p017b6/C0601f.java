package p017b6;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.f */
/* loaded from: classes.dex */
public final class C0601f extends AbstractC0621u {

    /* renamed from: e */
    public final /* synthetic */ int f2403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0601f(C0620t c0620t, int i) {
        super(c0620t);
        this.f2403e = i;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: q */
    public void mo1346q() {
        switch (this.f2403e) {
            case 0:
                C0620t c0620t = this.f2465b;
                c0620t.f2461x = null;
                CheckableImageButton checkableImageButton = c0620t.f2453p;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0622v.m1401m(checkableImageButton, null);
                break;
        }
    }
}
