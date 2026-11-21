package p104m;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.y0 */
/* loaded from: classes.dex */
public class C1786y0 {
    /* renamed from: a */
    public void mo3475a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1789z0.m3486e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }

    /* renamed from: b */
    public boolean mo3476b(TextView textView) {
        return ((Boolean) C1789z0.m3486e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
