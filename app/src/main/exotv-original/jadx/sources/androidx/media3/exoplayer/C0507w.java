package androidx.media3.exoplayer;

import java.util.concurrent.atomic.AtomicBoolean;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C0507w implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1913j;

    /* renamed from: k */
    public final /* synthetic */ Object f1914k;

    public /* synthetic */ C0507w(int i, Object obj) {
        this.f1913j = i;
        this.f1914k = obj;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1913j) {
            case 0:
                return ((ExoPlayerImplInternal) this.f1914k).lambda$release$0();
            default:
                return Boolean.valueOf(((AtomicBoolean) this.f1914k).get());
        }
    }
}
