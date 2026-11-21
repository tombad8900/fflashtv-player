package okhttp3;

import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.b0 */
/* loaded from: classes.dex */
public final class C2066b0 {
    static final /* synthetic */ C2066b0 $$INSTANCE = new C2066b0();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.b0$a */
    public static final class a implements InterfaceC2068c0 {
        final /* synthetic */ InterfaceC2851l $block;

        public a(InterfaceC2851l interfaceC2851l) {
            this.$block = interfaceC2851l;
        }

        @Override // okhttp3.InterfaceC2068c0
        public final C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) {
            AbstractC2980h.m5136e("it", interfaceC2064a0);
            return (C2080i0) this.$block.invoke(interfaceC2064a0);
        }
    }

    private C2066b0() {
    }

    public final InterfaceC2068c0 invoke(InterfaceC2851l interfaceC2851l) {
        AbstractC2980h.m5136e("block", interfaceC2851l);
        return new a(interfaceC2851l);
    }
}
