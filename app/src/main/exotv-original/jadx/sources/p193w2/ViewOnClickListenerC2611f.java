package p193w2;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.common.C0171a1;
import androidx.media3.common.C0243u;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.common.InterfaceC0193d1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.f */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2611f implements InterfaceC0185b1, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: j */
    public final /* synthetic */ C2627o f9456j;

    public ViewOnClickListenerC2611f(C2627o c2627o) {
        this.f9456j = c2627o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2627o c2627o = this.f9456j;
        ImageView imageView = c2627o.f9495F;
        View view2 = c2627o.f9503K;
        View view3 = c2627o.f9502J;
        View view4 = c2627o.f9501I;
        C2632t c2632t = c2627o.f9525j;
        InterfaceC0193d1 interfaceC0193d1 = c2627o.f9544s0;
        if (interfaceC0193d1 == null) {
            return;
        }
        c2632t.m4728g();
        if (c2627o.f9551w == view) {
            if (interfaceC0193d1.isCommandAvailable(9)) {
                interfaceC0193d1.seekToNext();
                return;
            }
            return;
        }
        if (c2627o.f9549v == view) {
            if (interfaceC0193d1.isCommandAvailable(7)) {
                interfaceC0193d1.seekToPrevious();
                return;
            }
            return;
        }
        if (c2627o.f9555y == view) {
            if (interfaceC0193d1.getPlaybackState() == 4 || !interfaceC0193d1.isCommandAvailable(12)) {
                return;
            }
            interfaceC0193d1.seekForward();
            return;
        }
        if (c2627o.f9557z == view) {
            if (interfaceC0193d1.isCommandAvailable(11)) {
                interfaceC0193d1.seekBack();
                return;
            }
            return;
        }
        if (c2627o.f9553x == view) {
            if (AbstractC1118i0.m2441c0(interfaceC0193d1, c2627o.f9552w0)) {
                AbstractC1118i0.m2419J(interfaceC0193d1);
                return;
            } else {
                if (interfaceC0193d1.isCommandAvailable(1)) {
                    interfaceC0193d1.pause();
                    return;
                }
                return;
            }
        }
        if (c2627o.f9489C == view) {
            if (interfaceC0193d1.isCommandAvailable(15)) {
                int repeatMode = interfaceC0193d1.getRepeatMode();
                int i = c2627o.f9488B0;
                for (int i4 = 1; i4 <= 2; i4++) {
                    int i8 = (repeatMode + i4) % 3;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2 || (i & 2) == 0) {
                            }
                        } else if ((i & 1) == 0) {
                        }
                    }
                    repeatMode = i8;
                }
                interfaceC0193d1.setRepeatMode(repeatMode);
                return;
            }
            return;
        }
        if (c2627o.f9491D == view) {
            if (interfaceC0193d1.isCommandAvailable(14)) {
                interfaceC0193d1.setShuffleModeEnabled(!interfaceC0193d1.getShuffleModeEnabled());
                return;
            }
            return;
        }
        if (view4 == view) {
            c2632t.m4727f();
            c2627o.m4704d(c2627o.f9535o, view4);
            return;
        }
        if (view3 == view) {
            c2632t.m4727f();
            c2627o.m4704d(c2627o.f9537p, view3);
        } else if (view2 == view) {
            c2632t.m4727f();
            c2627o.m4704d(c2627o.f9541r, view2);
        } else if (imageView == view) {
            c2632t.m4727f();
            c2627o.m4704d(c2627o.f9539q, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C2627o c2627o = this.f9456j;
        if (c2627o.f9500H0) {
            c2627o.f9525j.m4728g();
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onEvents(InterfaceC0193d1 interfaceC0193d1, C0171a1 c0171a1) {
        C0243u c0243u = c0171a1.f975a;
        boolean zM670a = c0243u.m670a(4, 5, 13);
        C2627o c2627o = this.f9456j;
        if (zM670a) {
            c2627o.m4713m();
        }
        if (c0243u.m670a(4, 5, 7, 13)) {
            c2627o.m4715o();
        }
        if (c0243u.m670a(8, 13)) {
            c2627o.m4716p();
        }
        if (c0243u.m670a(9, 13)) {
            c2627o.m4718r();
        }
        if (c0243u.m670a(8, 9, 11, 0, 16, 17, 13)) {
            c2627o.m4712l();
        }
        if (c0243u.m670a(11, 0, 13)) {
            c2627o.m4719s();
        }
        if (c0243u.m670a(12, 13)) {
            c2627o.m4714n();
        }
        if (c0243u.m670a(2, 13)) {
            c2627o.m4720t();
        }
    }
}
