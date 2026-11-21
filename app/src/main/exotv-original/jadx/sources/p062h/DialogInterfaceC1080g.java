package p062h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754l;
import java.util.WeakHashMap;
import p010b.DialogC0523m;
import p087k.C1545j;
import p104m.C1746m1;
import p105m0.AbstractC1807f0;
import p105m0.AbstractC1828m0;
import p105m0.InterfaceC1821k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.g */
/* loaded from: classes.dex */
public final class DialogInterfaceC1080g extends DialogC0523m implements DialogInterface, InterfaceC1084j {

    /* renamed from: m */
    public LayoutInflaterFactory2C1098x f4569m;

    /* renamed from: n */
    public final C1099y f4570n;

    /* renamed from: o */
    public final C1076e f4571o;

    /* JADX WARN: Type inference failed for: r2v2, types: [h.y] */
    public DialogInterfaceC1080g(ContextThemeWrapper contextThemeWrapper, int i) {
        int i4;
        int iM2273g = m2273g(contextThemeWrapper, i);
        if (iM2273g == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = iM2273g;
        }
        super(contextThemeWrapper, i4);
        this.f4570n = new InterfaceC1821k() { // from class: h.y
            @Override // p105m0.InterfaceC1821k
            /* renamed from: d */
            public final boolean mo1268d(KeyEvent keyEvent) {
                return this.f4706j.m2277i(keyEvent);
            }
        };
        AbstractC1089o abstractC1089oM2274d = m2274d();
        if (iM2273g == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM2273g = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1098x) abstractC1089oM2274d).f4684b0 = iM2273g;
        abstractC1089oM2274d.mo2308c();
        this.f4571o = new C1076e(getContext(), this, getWindow());
    }

    /* renamed from: g */
    public static int m2273g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p010b.DialogC0523m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1250b();
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2274d();
        layoutInflaterFactory2C1098x.m2338v();
        ((ViewGroup) layoutInflaterFactory2C1098x.f4666J.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1098x.f4701v.m2317a(layoutInflaterFactory2C1098x.f4700u.getCallback());
    }

    /* renamed from: d */
    public final AbstractC1089o m2274d() {
        if (this.f4569m == null) {
            ExecutorC1087m executorC1087m = AbstractC1089o.f4612j;
            this.f4569m = new LayoutInflaterFactory2C1098x(getContext(), getWindow(), this, this);
        }
        return this.f4569m;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2274d().mo2309d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0714c.m1491D(this.f4570n, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public final void m2275f(Bundle bundle) {
        m2274d().mo2307a();
        super.onCreate(bundle);
        m2274d().mo2308c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2274d();
        layoutInflaterFactory2C1098x.m2338v();
        return layoutInflaterFactory2C1098x.f4700u.findViewById(i);
    }

    /* renamed from: h */
    public final void m2276h(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2274d().mo2314l(charSequence);
    }

    /* renamed from: i */
    public final boolean m2277i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2274d();
        if (layoutInflaterFactory2C1098x.f4703x != null) {
            layoutInflaterFactory2C1098x.m2342z();
            layoutInflaterFactory2C1098x.f4703x.getClass();
            layoutInflaterFactory2C1098x.m2323A(0);
        }
    }

    @Override // p010b.DialogC0523m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m2275f(bundle);
        C1076e c1076e = this.f4571o;
        c1076e.f4535b.setContentView(c1076e.f4558y);
        Context context = c1076e.f4534a;
        Window window = c1076e.f4536c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c1076e.f4539f;
        if (view == null) {
            view = null;
        }
        boolean z7 = view != null;
        if (!z7 || !C1076e.m2253a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z7) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c1076e.f4540g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c1076e.f4538e != null) {
                ((LinearLayout.LayoutParams) ((C1746m1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM2254b = C1076e.m2254b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM2254b2 = C1076e.m2254b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM2254b3 = C1076e.m2254b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1076e.f4550q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1076e.f4550q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM2254b2.findViewById(android.R.id.message);
        c1076e.f4554u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c1076e.f4550q.removeView(c1076e.f4554u);
            if (c1076e.f4538e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c1076e.f4550q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c1076e.f4550q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c1076e.f4538e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM2254b2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM2254b3.findViewById(android.R.id.button1);
        c1076e.f4541h = button;
        ViewOnClickListenerC0754l viewOnClickListenerC0754l = c1076e.f4533E;
        button.setOnClickListener(viewOnClickListenerC0754l);
        if (TextUtils.isEmpty(c1076e.f4542i)) {
            c1076e.f4541h.setVisibility(8);
            i = 0;
        } else {
            c1076e.f4541h.setText(c1076e.f4542i);
            c1076e.f4541h.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM2254b3.findViewById(android.R.id.button2);
        c1076e.f4544k = button2;
        button2.setOnClickListener(viewOnClickListenerC0754l);
        if (TextUtils.isEmpty(c1076e.f4545l)) {
            c1076e.f4544k.setVisibility(8);
        } else {
            c1076e.f4544k.setText(c1076e.f4545l);
            c1076e.f4544k.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM2254b3.findViewById(android.R.id.button3);
        c1076e.f4547n = button3;
        button3.setOnClickListener(viewOnClickListenerC0754l);
        if (TextUtils.isEmpty(c1076e.f4548o)) {
            c1076e.f4547n.setVisibility(8);
        } else {
            c1076e.f4547n.setText(c1076e.f4548o);
            c1076e.f4547n.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c1076e.f4541h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c1076e.f4544k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c1076e.f4547n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM2254b3.setVisibility(8);
        }
        if (c1076e.f4555v != null) {
            viewGroupM2254b.addView(c1076e.f4555v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1076e.f4552s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1076e.f4537d) || !c1076e.f4531C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1076e.f4552s.setVisibility(8);
                viewGroupM2254b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1076e.f4553t = textView2;
                textView2.setText(c1076e.f4537d);
                Drawable drawable = c1076e.f4551r;
                if (drawable != null) {
                    c1076e.f4552s.setImageDrawable(drawable);
                } else {
                    c1076e.f4553t.setPadding(c1076e.f4552s.getPaddingLeft(), c1076e.f4552s.getPaddingTop(), c1076e.f4552s.getPaddingRight(), c1076e.f4552s.getPaddingBottom());
                    c1076e.f4552s.setVisibility(8);
                }
            }
        }
        boolean z8 = viewGroup.getVisibility() != 8;
        int i4 = (viewGroupM2254b == null || viewGroupM2254b.getVisibility() == 8) ? 0 : 1;
        boolean z9 = viewGroupM2254b3.getVisibility() != 8;
        if (!z9 && (viewFindViewById = viewGroupM2254b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = c1076e.f4550q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c1076e.f4538e != null ? viewGroupM2254b.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM2254b2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1076e.f4538e;
        if (alertController$RecycleListView != null && (!z9 || i4 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f608j, alertController$RecycleListView.getPaddingRight(), z9 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f609k);
        }
        if (!z8) {
            View view2 = c1076e.f4538e;
            if (view2 == null) {
                view2 = c1076e.f4550q;
            }
            if (view2 != null) {
                int i8 = z9 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                AbstractC1807f0.m3544b(view2, i4 | i8, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM2254b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM2254b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1076e.f4538e;
        if (alertController$RecycleListView2 == null || (listAdapter = c1076e.f4556w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i9 = c1076e.f4557x;
        if (i9 > -1) {
            alertController$RecycleListView2.setItemChecked(i9, true);
            alertController$RecycleListView2.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4571o.f4550q;
        if (nestedScrollView == null || !nestedScrollView.m529i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4571o.f4550q;
        if (nestedScrollView == null || !nestedScrollView.m529i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p010b.DialogC0523m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) m2274d();
        layoutInflaterFactory2C1098x.m2342z();
        C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
        if (c1081g0 != null) {
            c1081g0.f4582I = false;
            C1545j c1545j = c1081g0.f4581H;
            if (c1545j != null) {
                c1545j.m3222a();
            }
        }
    }

    @Override // p010b.DialogC0523m, android.app.Dialog
    public final void setContentView(int i) {
        m1250b();
        m2274d().mo2311g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m2274d().mo2314l(getContext().getString(i));
    }

    @Override // p010b.DialogC0523m, android.app.Dialog
    public final void setContentView(View view) {
        m1250b();
        m2274d().mo2312i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m2276h(charSequence);
        C1076e c1076e = this.f4571o;
        c1076e.f4537d = charSequence;
        TextView textView = c1076e.f4553t;
        if (textView != null) {
            textView.setText(charSequence);
        }
        c1076e.f4536c.setTitle(charSequence);
    }

    @Override // p010b.DialogC0523m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1250b();
        m2274d().mo2313j(view, layoutParams);
    }
}
