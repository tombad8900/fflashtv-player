package androidx.media3.exoplayer.analytics;

import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.z */
/* loaded from: classes.dex */
public final /* synthetic */ class C0304z implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1651j;

    public /* synthetic */ C0304z(int i) {
        this.f1651j = i;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1651j) {
            case 0:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            default:
                throw new IllegalStateException();
        }
    }
}
