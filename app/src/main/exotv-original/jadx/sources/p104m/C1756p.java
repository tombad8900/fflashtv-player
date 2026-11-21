package p104m;

import android.graphics.Typeface;
import android.widget.TextView;
import p096l0.InterfaceC1641a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C1756p implements InterfaceC1641a {

    /* renamed from: a */
    public final /* synthetic */ int f6701a;

    /* renamed from: b */
    public final /* synthetic */ TextView f6702b;

    public /* synthetic */ C1756p(TextView textView, int i) {
        this.f6701a = i;
        this.f6702b = textView;
    }

    @Override // p096l0.InterfaceC1641a
    public final void accept(Object obj) {
        switch (this.f6701a) {
            case 0:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 1:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
        }
    }
}
