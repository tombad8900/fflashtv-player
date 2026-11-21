package p104m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.x0 */
/* loaded from: classes.dex */
public final class C1783x0 extends C1786y0 {
    @Override // p104m.C1786y0
    /* renamed from: a */
    public void mo3475a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p104m.C1786y0
    /* renamed from: b */
    public boolean mo3476b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
