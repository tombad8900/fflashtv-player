package p010b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.InterfaceC0164v;
import androidx.lifecycle.RunnableC0127c0;
import com.exotv.net.R;
import p004a3.C0067e;
import p004a3.InterfaceC0068f;
import p118n4.C2019p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.m */
/* loaded from: classes.dex */
public class DialogC0523m extends Dialog implements InterfaceC0164v, InterfaceC0068f {

    /* renamed from: j */
    public C0166x f2154j;

    /* renamed from: k */
    public final C2019p f2155k;

    /* renamed from: l */
    public final C0534x f2156l;

    public DialogC0523m(Context context, int i) {
        super(context, i);
        this.f2155k = new C2019p(this);
        this.f2156l = new C0534x(new RunnableC0127c0(6, this));
    }

    /* renamed from: a */
    public static void m1249a(DialogC0523m dialogC0523m) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC2980h.m5136e("view", view);
        m1250b();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final void m1250b() {
        Window window = getWindow();
        AbstractC2980h.m5133b(window);
        View decorView = window.getDecorView();
        AbstractC2980h.m5135d("window!!.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        AbstractC2980h.m5133b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC2980h.m5135d("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC2980h.m5133b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC2980h.m5135d("window!!.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // p004a3.InterfaceC0068f
    /* renamed from: c */
    public final C0067e mo223c() {
        return (C0067e) this.f2155k.f7451m;
    }

    @Override // androidx.lifecycle.InterfaceC0164v
    /* renamed from: e */
    public final AbstractC0150o mo224e() {
        C0166x c0166x = this.f2154j;
        if (c0166x != null) {
            return c0166x;
        }
        C0166x c0166x2 = new C0166x(this);
        this.f2154j = c0166x2;
        return c0166x2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f2156l.m1257c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC2980h.m5135d("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C0534x c0534x = this.f2156l;
            c0534x.getClass();
            c0534x.f2184e = onBackInvokedDispatcher;
            c0534x.m1258d(c0534x.f2186g);
        }
        this.f2155k.m3889e(bundle);
        C0166x c0166x = this.f2154j;
        if (c0166x == null) {
            c0166x = new C0166x(this);
            this.f2154j = c0166x;
        }
        c0166x.m585l(EnumC0146m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC2980h.m5135d("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f2155k.m3890f(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0166x c0166x = this.f2154j;
        if (c0166x == null) {
            c0166x = new C0166x(this);
            this.f2154j = c0166x;
        }
        c0166x.m585l(EnumC0146m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0166x c0166x = this.f2154j;
        if (c0166x == null) {
            c0166x = new C0166x(this);
            this.f2154j = c0166x;
        }
        c0166x.m585l(EnumC0146m.ON_DESTROY);
        this.f2154j = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m1250b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC2980h.m5136e("view", view);
        m1250b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC2980h.m5136e("view", view);
        m1250b();
        super.setContentView(view, layoutParams);
    }
}
