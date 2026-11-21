package p095l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.x */
/* loaded from: classes.dex */
public class C1638x {

    /* renamed from: a */
    public final Context f6270a;

    /* renamed from: b */
    public final MenuC1627m f6271b;

    /* renamed from: c */
    public final boolean f6272c;

    /* renamed from: d */
    public final int f6273d;

    /* renamed from: e */
    public final int f6274e;

    /* renamed from: f */
    public View f6275f;

    /* renamed from: h */
    public boolean f6277h;

    /* renamed from: i */
    public InterfaceC1639y f6278i;

    /* renamed from: j */
    public AbstractC1636v f6279j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f6280k;

    /* renamed from: g */
    public int f6276g = 8388611;

    /* renamed from: l */
    public final C1637w f6281l = new C1637w(this);

    public C1638x(int i, int i4, Context context, View view, MenuC1627m menuC1627m, boolean z7) {
        this.f6270a = context;
        this.f6271b = menuC1627m;
        this.f6275f = view;
        this.f6272c = z7;
        this.f6273d = i;
        this.f6274e = i4;
    }

    /* renamed from: a */
    public final AbstractC1636v m3338a() {
        AbstractC1636v viewOnKeyListenerC1618e0;
        if (this.f6279j == null) {
            Context context = this.f6270a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1618e0 = new ViewOnKeyListenerC1621g(this.f6270a, this.f6275f, this.f6273d, this.f6274e, this.f6272c);
            } else {
                View view = this.f6275f;
                viewOnKeyListenerC1618e0 = new ViewOnKeyListenerC1618e0(this.f6273d, this.f6274e, this.f6270a, view, this.f6271b, this.f6272c);
            }
            viewOnKeyListenerC1618e0.mo3282l(this.f6271b);
            viewOnKeyListenerC1618e0.mo3287r(this.f6281l);
            viewOnKeyListenerC1618e0.mo3283n(this.f6275f);
            viewOnKeyListenerC1618e0.mo3280g(this.f6278i);
            viewOnKeyListenerC1618e0.mo3284o(this.f6277h);
            viewOnKeyListenerC1618e0.mo3285p(this.f6276g);
            this.f6279j = viewOnKeyListenerC1618e0;
        }
        return this.f6279j;
    }

    /* renamed from: b */
    public final boolean m3339b() {
        AbstractC1636v abstractC1636v = this.f6279j;
        return abstractC1636v != null && abstractC1636v.mo3274a();
    }

    /* renamed from: c */
    public void mo3340c() {
        this.f6279j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f6280k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m3341d(int i, int i4, boolean z7, boolean z8) {
        AbstractC1636v abstractC1636vM3338a = m3338a();
        abstractC1636vM3338a.mo3288s(z8);
        if (z7) {
            if ((Gravity.getAbsoluteGravity(this.f6276g, this.f6275f.getLayoutDirection()) & 7) == 5) {
                i -= this.f6275f.getWidth();
            }
            abstractC1636vM3338a.mo3286q(i);
            abstractC1636vM3338a.mo3289t(i4);
            int i8 = (int) ((this.f6270a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1636vM3338a.f6268j = new Rect(i - i8, i4 - i8, i + i8, i4 + i8);
        }
        abstractC1636vM3338a.mo3275f();
    }
}
