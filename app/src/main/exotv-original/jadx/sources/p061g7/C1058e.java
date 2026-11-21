package p061g7;

import java.util.Iterator;
import p069h7.C1200b;
import p102l6.InterfaceC1684a;
import p212y6.InterfaceC2851l;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.e */
/* loaded from: classes.dex */
public final class C1058e implements InterfaceC1061h {

    /* renamed from: a */
    public final /* synthetic */ int f4479a;

    /* renamed from: b */
    public final Object f4480b;

    /* renamed from: c */
    public final InterfaceC1684a f4481c;

    public /* synthetic */ C1058e(InterfaceC1061h interfaceC1061h, InterfaceC2851l interfaceC2851l, int i) {
        this.f4479a = i;
        this.f4480b = interfaceC1061h;
        this.f4481c = interfaceC2851l;
    }

    @Override // p061g7.InterfaceC1061h
    public final Iterator iterator() {
        switch (this.f4479a) {
            case 0:
                return new C1057d(this);
            case 1:
                return new C1067n(this);
            default:
                return new C1200b(this);
        }
    }

    public C1058e(CharSequence charSequence, InterfaceC2855p interfaceC2855p) {
        this.f4479a = 2;
        AbstractC2980h.m5136e("input", charSequence);
        this.f4480b = charSequence;
        this.f4481c = interfaceC2855p;
    }
}
