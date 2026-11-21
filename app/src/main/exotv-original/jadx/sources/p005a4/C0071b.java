package p005a4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p178u4.AbstractC2470e;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.b */
/* loaded from: classes.dex */
public final class C0071b extends WeakReference {

    /* renamed from: a */
    public final InterfaceC2801e f319a;

    /* renamed from: b */
    public final boolean f320b;

    /* renamed from: c */
    public InterfaceC0080f0 f321c;

    public C0071b(InterfaceC2801e interfaceC2801e, C0104y c0104y, ReferenceQueue referenceQueue) {
        super(c0104y, referenceQueue);
        AbstractC2470e.m4446c("Argument must not be null", interfaceC2801e);
        this.f319a = interfaceC2801e;
        boolean z7 = c0104y.f491j;
        this.f321c = null;
        this.f320b = z7;
    }
}
