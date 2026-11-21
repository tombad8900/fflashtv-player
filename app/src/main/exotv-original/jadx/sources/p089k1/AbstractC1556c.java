package p089k1;

import java.util.ArrayList;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1556c implements InterfaceC1564h {

    /* renamed from: j */
    public final boolean f5957j;

    /* renamed from: k */
    public final ArrayList f5958k = new ArrayList(1);

    /* renamed from: l */
    public int f5959l;

    /* renamed from: m */
    public C1568l f5960m;

    public AbstractC1556c(boolean z7) {
        this.f5957j = z7;
    }

    @Override // p089k1.InterfaceC1564h
    public final void addTransferListener(InterfaceC1557c0 interfaceC1557c0) {
        interfaceC1557c0.getClass();
        ArrayList arrayList = this.f5958k;
        if (arrayList.contains(interfaceC1557c0)) {
            return;
        }
        arrayList.add(interfaceC1557c0);
        this.f5959l++;
    }

    /* renamed from: j */
    public final void m3228j(int i) {
        C1568l c1568l = this.f5960m;
        int i4 = AbstractC1118i0.f4750a;
        for (int i8 = 0; i8 < this.f5959l; i8++) {
            ((InterfaceC1557c0) this.f5958k.get(i8)).onBytesTransferred(this, c1568l, this.f5957j, i);
        }
    }

    /* renamed from: k */
    public final void m3229k() {
        C1568l c1568l = this.f5960m;
        int i = AbstractC1118i0.f4750a;
        for (int i4 = 0; i4 < this.f5959l; i4++) {
            ((InterfaceC1557c0) this.f5958k.get(i4)).onTransferEnd(this, c1568l, this.f5957j);
        }
        this.f5960m = null;
    }

    /* renamed from: l */
    public final void m3230l(C1568l c1568l) {
        for (int i = 0; i < this.f5959l; i++) {
            ((InterfaceC1557c0) this.f5958k.get(i)).onTransferInitializing(this, c1568l, this.f5957j);
        }
    }

    /* renamed from: m */
    public final void m3231m(C1568l c1568l) {
        this.f5960m = c1568l;
        for (int i = 0; i < this.f5959l; i++) {
            ((InterfaceC1557c0) this.f5958k.get(i)).onTransferStart(this, c1568l, this.f5957j);
        }
    }
}
