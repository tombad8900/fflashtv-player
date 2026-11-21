package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.RunnableC0127c0;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.List;
import p002a1.AbstractC0008a1;
import p131p0.C2194a;
import p131p0.C2197d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* renamed from: l */
    public static final Object f848l = new Object();

    /* renamed from: j */
    public final ArrayList f849j;

    /* renamed from: k */
    public C2194a f850k;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f849j = new ArrayList();
    }

    private C2197d getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C2197d) {
            return (C2197d) tag;
        }
        C2197d c2197d = new C2197d(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, c2197d);
        return c2197d;
    }

    /* renamed from: a */
    public final void m524a() {
        ArrayList arrayList = this.f849j;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f850k = new C2194a(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.f850k.f7660a.size() <= 0) {
            return;
        }
        if (this.f850k.f7660a.get(0) != null) {
            throw new ClassCastException();
        }
        getContext();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f848l) {
            C2194a c2194a = this.f850k;
            int childCount = getChildCount() - (c2194a != null ? c2194a.f7660a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void m525b() {
        if (this.f850k != null) {
            removeViews(getChildCount() - this.f850k.f7660a.size(), this.f850k.f7660a.size());
            if (this.f850k.f7660a.size() > 0) {
                throw AbstractC0008a1.m10f(0, this.f850k.f7660a);
            }
            C2194a c2194a = this.f850k;
            ArrayList arrayList = c2194a.f7660a;
            if (!c2194a.f7663d) {
                c2194a.f7663d = true;
                c2194a.f7661b.f7669b.remove(c2194a);
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    throw AbstractC0008a1.m10f(size, arrayList);
                }
                arrayList.clear();
            }
            this.f850k = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f850k != null) {
            m525b();
        }
        m524a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m525b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C2197d) {
            C2197d c2197d = (C2197d) tag;
            if (c2197d.f7669b.isEmpty()) {
                c2197d.f7668a.post(new RunnableC0127c0(16, c2197d));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<Object> list) {
        ArrayList arrayList = this.f849j;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            m525b();
            m524a();
            requestApplyInsets();
        }
    }
}
