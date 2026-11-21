package p017b6;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.b0 */
/* loaded from: classes.dex */
public final class C0594b0 extends AbstractC0621u {

    /* renamed from: e */
    public final int f2373e;

    /* renamed from: f */
    public EditText f2374f;

    /* renamed from: g */
    public final ViewOnClickListenerC0591a f2375g;

    public C0594b0(C0620t c0620t, int i) {
        super(c0620t);
        this.f2373e = R.drawable.design_password_eye;
        this.f2375g = new ViewOnClickListenerC0591a(2, this);
        if (i != 0) {
            this.f2373e = i;
        }
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: b */
    public final void mo1339b() {
        m1388p();
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: c */
    public final int mo1340c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: d */
    public final int mo1341d() {
        return this.f2373e;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: f */
    public final View.OnClickListener mo1342f() {
        return this.f2375g;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: j */
    public final boolean mo1343j() {
        return true;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: k */
    public final boolean mo1344k() {
        EditText editText = this.f2374f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: l */
    public final void mo1345l(EditText editText) {
        this.f2374f = editText;
        m1388p();
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: q */
    public final void mo1346q() {
        EditText editText = this.f2374f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f2374f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: r */
    public final void mo1347r() {
        EditText editText = this.f2374f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
