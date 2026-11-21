package androidx.media3.exoplayer;

import androidx.media3.common.C0241t0;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import p043e6.InterfaceC0916d;
import p056g1.C1030c;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1122m;
import p115n1.InterfaceC1987n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0413q implements InterfaceC1122m, TextOutput, MetadataOutput, InterfaceC0916d {

    /* renamed from: j */
    public final /* synthetic */ int f1798j;

    public /* synthetic */ C0413q(int i) {
        this.f1798j = i;
    }

    @Override // p043e6.InterfaceC0916d
    public Object apply(Object obj) {
        switch (this.f1798j) {
            case 4:
                return new DefaultAnalyticsCollector((InterfaceC1103b) obj);
            default:
                return MediaExtractorCompat.lambda$selectExtractor$0((InterfaceC1987n) obj);
        }
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        InterfaceC0185b1 interfaceC0185b1 = (InterfaceC0185b1) obj;
        switch (this.f1798j) {
            case 0:
                ExoPlayerImpl.lambda$release$5(interfaceC0185b1);
                break;
            default:
                interfaceC0185b1.onRenderedFirstFrame();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public void onCues(C1030c c1030c) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(c1030c);
    }

    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public void onMetadata(C0241t0 c0241t0) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(c0241t0);
    }
}
