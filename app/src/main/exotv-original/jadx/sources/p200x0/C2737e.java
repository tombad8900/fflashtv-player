package p200x0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p005a4.C0073c;
import p189v7.C2556a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.e */
/* loaded from: classes.dex */
public final class C2737e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f10109a;

    /* renamed from: b */
    public final C2556a0 f10110b;

    public C2737e(KeyListener keyListener) {
        C2556a0 c2556a0 = new C2556a0(4);
        this.f10109a = keyListener;
        this.f10110b = c2556a0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f10109a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f10109a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z7;
        this.f10110b.getClass();
        if (i != 67 ? i != 112 ? false : C0073c.m267u(editable, keyEvent, true) : C0073c.m267u(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z7 = true;
        } else {
            z7 = false;
        }
        return z7 || this.f10109a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f10109a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f10109a.onKeyUp(view, editable, i, keyEvent);
    }
}
