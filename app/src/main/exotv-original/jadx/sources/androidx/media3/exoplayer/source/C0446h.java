package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.MediaSourceEventListener;
import p063h1.InterfaceC1111f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0446h implements InterfaceC1111f {

    /* renamed from: j */
    public final /* synthetic */ int f1835j;

    /* renamed from: k */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f1836k;

    /* renamed from: l */
    public final /* synthetic */ LoadEventInfo f1837l;

    /* renamed from: m */
    public final /* synthetic */ MediaLoadData f1838m;

    public /* synthetic */ C0446h(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f1835j = i;
        this.f1836k = eventDispatcher;
        this.f1837l = loadEventInfo;
        this.f1838m = mediaLoadData;
    }

    @Override // p063h1.InterfaceC1111f
    public final void accept(Object obj) {
        switch (this.f1835j) {
            case 0:
                this.f1836k.lambda$loadStarted$0(this.f1837l, this.f1838m, (MediaSourceEventListener) obj);
                break;
            case 1:
                this.f1836k.lambda$loadCompleted$1(this.f1837l, this.f1838m, (MediaSourceEventListener) obj);
                break;
            default:
                this.f1836k.lambda$loadCanceled$2(this.f1837l, this.f1838m, (MediaSourceEventListener) obj);
                break;
        }
    }
}
