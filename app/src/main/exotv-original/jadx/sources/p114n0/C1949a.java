package p114n0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n0.a */
/* loaded from: classes.dex */
public final class C1949a extends ClickableSpan {

    /* renamed from: j */
    public final int f7242j;

    /* renamed from: k */
    public final C1952d f7243k;

    /* renamed from: l */
    public final int f7244l;

    public C1949a(int i, C1952d c1952d, int i4) {
        this.f7242j = i;
        this.f7243k = c1952d;
        this.f7244l = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7242j);
        this.f7243k.f7258a.performAction(this.f7244l, bundle);
    }
}
