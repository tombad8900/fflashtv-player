package p002a1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0123a0;
import androidx.lifecycle.C0168z;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import java.io.PrintWriter;
import p010b.DialogC0523m;
import p120o.C2031c;
import p120o.C2034f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.q */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0040q extends AbstractComponentCallbacksC0050v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: c0 */
    public final DialogInterfaceOnCancelListenerC0032m f155c0;

    /* renamed from: d0 */
    public final DialogInterfaceOnDismissListenerC0034n f156d0;

    /* renamed from: e0 */
    public int f157e0;

    /* renamed from: f0 */
    public int f158f0;

    /* renamed from: g0 */
    public boolean f159g0;

    /* renamed from: h0 */
    public boolean f160h0;

    /* renamed from: i0 */
    public int f161i0;

    /* renamed from: j0 */
    public boolean f162j0;

    /* renamed from: k0 */
    public final C0036o f163k0;

    /* renamed from: l0 */
    public Dialog f164l0;

    /* renamed from: m0 */
    public boolean f165m0;

    /* renamed from: n0 */
    public boolean f166n0;

    /* renamed from: o0 */
    public boolean f167o0;

    public DialogInterfaceOnCancelListenerC0040q() {
        new RunnableC0018f(1, this);
        this.f155c0 = new DialogInterfaceOnCancelListenerC0032m(this);
        this.f156d0 = new DialogInterfaceOnDismissListenerC0034n(this);
        this.f157e0 = 0;
        this.f158f0 = 0;
        this.f159g0 = true;
        this.f160h0 = true;
        this.f161i0 = -1;
        this.f163k0 = new C0036o(0, this);
        this.f167o0 = false;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: A */
    public void mo178A() {
        this.f220L = true;
        Dialog dialog = this.f164l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: B */
    public final void mo179B(Bundle bundle) {
        Bundle bundle2;
        this.f220L = true;
        if (this.f164l0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f164l0.onRestoreInstanceState(bundle2);
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: C */
    public final void mo180C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo180C(layoutInflater, viewGroup, bundle);
        if (this.f222N != null || this.f164l0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f164l0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: H */
    public Dialog mo181H() {
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0523m(m217D(), this.f158f0);
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: d */
    public final AbstractC0714c mo182d() {
        return new C0038p(this, new C0044s(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f165m0) {
            return;
        }
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f166n0) {
            return;
        }
        this.f166n0 = true;
        Dialog dialog = this.f164l0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f164l0.dismiss();
        }
        this.f165m0 = true;
        if (this.f161i0 >= 0) {
            C0035n0 c0035n0M229j = m229j();
            int i = this.f161i0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Bad id: "));
            }
            c0035n0M229j.m157w(new C0033m0(c0035n0M229j, i), true);
            this.f161i0 = -1;
            return;
        }
        C0006a c0006a = new C0006a(m229j());
        c0006a.f25o = true;
        C0035n0 c0035n0 = this.f209A;
        if (c0035n0 != null && c0035n0 != c0006a.f26p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0006a.m2b(new C0051v0(3, this));
        if (c0006a.f27q) {
            throw new IllegalStateException("commit already called");
        }
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Commit: " + c0006a);
            PrintWriter printWriter = new PrintWriter(new C0055x0());
            c0006a.m4d("  ", printWriter, true);
            printWriter.close();
        }
        c0006a.f27q = true;
        boolean z7 = c0006a.f17g;
        C0035n0 c0035n02 = c0006a.f26p;
        if (z7) {
            c0006a.f28r = c0035n02.f123i.getAndIncrement();
        } else {
            c0006a.f28r = -1;
        }
        c0035n02.m157w(c0006a, true);
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: q */
    public final void mo183q() {
        this.f220L = true;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: s */
    public final void mo184s(Context context) {
        Object obj;
        super.mo184s(context);
        C0123a0 c0123a0 = this.f232X;
        c0123a0.getClass();
        C0123a0.m548a("observeForever");
        C0036o c0036o = this.f163k0;
        C0168z c0168z = new C0168z(c0123a0, c0036o);
        C2034f c2034f = c0123a0.f890b;
        C2031c c2031cMo3921a = c2034f.mo3921a(c0036o);
        if (c2031cMo3921a != null) {
            obj = c2031cMo3921a.f7493k;
        } else {
            C2031c c2031c = new C2031c(c0036o, c0168z);
            c2034f.f7502m++;
            C2031c c2031c2 = c2034f.f7500k;
            if (c2031c2 == null) {
                c2034f.f7499j = c2031c;
                c2034f.f7500k = c2031c;
            } else {
                c2031c2.f7494l = c2031c;
                c2031c.f7495m = c2031c2;
                c2034f.f7500k = c2031c;
            }
            obj = null;
        }
        if (((C0168z) obj) == null) {
            c0168z.m591a(true);
        }
        this.f166n0 = false;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: t */
    public void mo185t(Bundle bundle) {
        super.mo185t(bundle);
        new Handler();
        this.f160h0 = this.f214F == 0;
        if (bundle != null) {
            this.f157e0 = bundle.getInt("android:style", 0);
            this.f158f0 = bundle.getInt("android:theme", 0);
            this.f159g0 = bundle.getBoolean("android:cancelable", true);
            this.f160h0 = bundle.getBoolean("android:showsDialog", this.f160h0);
            this.f161i0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: v */
    public final void mo186v() {
        this.f220L = true;
        Dialog dialog = this.f164l0;
        if (dialog != null) {
            this.f165m0 = true;
            dialog.setOnDismissListener(null);
            this.f164l0.dismiss();
            if (!this.f166n0) {
                onDismiss(this.f164l0);
            }
            this.f164l0 = null;
            this.f167o0 = false;
        }
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: w */
    public final void mo187w() {
        this.f220L = true;
        if (!this.f166n0) {
            this.f166n0 = true;
        }
        C0123a0 c0123a0 = this.f232X;
        c0123a0.getClass();
        C0123a0.m548a("removeObserver");
        C0168z c0168z = (C0168z) c0123a0.f890b.mo3922b(this.f163k0);
        if (c0168z == null) {
            return;
        }
        c0168z.m591a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo188x(Bundle bundle) {
        Context contextM227h;
        LayoutInflater layoutInflaterMo188x = super.mo188x(bundle);
        boolean z7 = this.f160h0;
        if (z7 && !this.f162j0) {
            if (z7 && !this.f167o0) {
                try {
                    this.f162j0 = true;
                    Dialog dialogMo181H = mo181H();
                    this.f164l0 = dialogMo181H;
                    if (this.f160h0) {
                        int i = this.f157e0;
                        if (i == 1 || i == 2) {
                            dialogMo181H.requestWindowFeature(1);
                            contextM227h = m227h();
                            if (contextM227h != null) {
                                this.f164l0.setOwnerActivity((Activity) contextM227h);
                            }
                            this.f164l0.setCancelable(this.f159g0);
                            this.f164l0.setOnCancelListener(this.f155c0);
                            this.f164l0.setOnDismissListener(this.f156d0);
                            this.f167o0 = true;
                        } else if (i == 3) {
                            Window window = dialogMo181H.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo181H.requestWindowFeature(1);
                            contextM227h = m227h();
                            if (contextM227h != null) {
                            }
                            this.f164l0.setCancelable(this.f159g0);
                            this.f164l0.setOnCancelListener(this.f155c0);
                            this.f164l0.setOnDismissListener(this.f156d0);
                            this.f167o0 = true;
                        } else {
                            contextM227h = m227h();
                            if (contextM227h != null) {
                            }
                            this.f164l0.setCancelable(this.f159g0);
                            this.f164l0.setOnCancelListener(this.f155c0);
                            this.f164l0.setOnDismissListener(this.f156d0);
                            this.f167o0 = true;
                        }
                    } else {
                        this.f164l0 = null;
                    }
                    this.f162j0 = false;
                } catch (Throwable th) {
                    this.f162j0 = false;
                    throw th;
                }
            }
            if (C0035n0.m106G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f164l0;
            if (dialog != null) {
                return layoutInflaterMo188x.cloneInContext(dialog.getContext());
            }
        } else if (C0035n0.m106G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f160h0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterMo188x;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterMo188x;
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: y */
    public void mo189y(Bundle bundle) {
        Dialog dialog = this.f164l0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f157e0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i4 = this.f158f0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z7 = this.f159g0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f160h0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i8 = this.f161i0;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    @Override // p002a1.AbstractComponentCallbacksC0050v
    /* renamed from: z */
    public void mo190z() {
        this.f220L = true;
        Dialog dialog = this.f164l0;
        if (dialog != null) {
            this.f165m0 = false;
            dialog.show();
            View decorView = this.f164l0.getWindow().getDecorView();
            AbstractC2980h.m5136e("<this>", decorView);
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }
}
