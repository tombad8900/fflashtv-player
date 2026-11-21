package p104m;

import androidx.appcompat.widget.ActionBarContextView;
import p105m0.InterfaceC1846s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.a */
/* loaded from: classes.dex */
public final class C1696a implements InterfaceC1846s0 {

    /* renamed from: a */
    public boolean f6501a = false;

    /* renamed from: b */
    public int f6502b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f6503c;

    public C1696a(ActionBarContextView actionBarContextView) {
        this.f6503c = actionBarContextView;
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: a */
    public final void mo1588a() {
        this.f6501a = true;
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: b */
    public final void mo1589b() {
        super/*android.view.View*/.setVisibility(0);
        this.f6501a = false;
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: c */
    public final void mo2256c() {
        if (this.f6501a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f6503c;
        actionBarContextView.f664o = null;
        super/*android.view.View*/.setVisibility(this.f6502b);
    }
}
