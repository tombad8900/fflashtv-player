package p017b6;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.u */
/* loaded from: classes.dex */
public abstract class AbstractC0621u {

    /* renamed from: a */
    public final TextInputLayout f2464a;

    /* renamed from: b */
    public final C0620t f2465b;

    /* renamed from: c */
    public final Context f2466c;

    /* renamed from: d */
    public final CheckableImageButton f2467d;

    public AbstractC0621u(C0620t c0620t) {
        this.f2464a = c0620t.f2447j;
        this.f2465b = c0620t;
        this.f2466c = c0620t.getContext();
        this.f2467d = c0620t.f2453p;
    }

    /* renamed from: a */
    public void mo1354a() {
    }

    /* renamed from: b */
    public void mo1339b() {
    }

    /* renamed from: c */
    public int mo1340c() {
        return 0;
    }

    /* renamed from: d */
    public int mo1341d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo1355e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo1342f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo1356g() {
        return null;
    }

    /* renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo1366h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo1367i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo1343j() {
        return this instanceof C0615o;
    }

    /* renamed from: k */
    public boolean mo1344k() {
        return false;
    }

    /* renamed from: l */
    public void mo1345l(EditText editText) {
    }

    /* renamed from: m */
    public void mo1368m(C1952d c1952d) {
    }

    /* renamed from: n */
    public void mo1369n(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: o */
    public void mo1357o(boolean z7) {
    }

    /* renamed from: p */
    public final void m1388p() {
        this.f2465b.m1378f(false);
    }

    /* renamed from: q */
    public void mo1346q() {
    }

    /* renamed from: r */
    public void mo1347r() {
    }
}
