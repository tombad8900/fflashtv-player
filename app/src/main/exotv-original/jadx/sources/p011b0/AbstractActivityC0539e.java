package p011b0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0135g0;
import androidx.lifecycle.C0166x;
import androidx.lifecycle.FragmentC0139i0;
import androidx.lifecycle.InterfaceC0164v;
import com.bumptech.glide.AbstractC0714c;
import p105m0.InterfaceC1821k;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b0.e */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0539e extends Activity implements InterfaceC0164v, InterfaceC1821k {

    /* renamed from: j */
    public final C0166x f2201j = new C0166x(this);

    @Override // p105m0.InterfaceC1821k
    /* renamed from: d */
    public final boolean mo1268d(KeyEvent keyEvent) {
        AbstractC2980h.m5136e("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC2980h.m5136e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView);
        if (AbstractC0714c.m1490C(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0714c.m1491D(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC2980h.m5136e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView);
        if (AbstractC0714c.m1490C(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0139i0.f918k;
        AbstractC0135g0.m558b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC2980h.m5136e("outState", bundle);
        this.f2201j.m587n();
        super.onSaveInstanceState(bundle);
    }
}
