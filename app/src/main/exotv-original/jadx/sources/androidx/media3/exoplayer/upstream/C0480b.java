package androidx.media3.exoplayer.upstream;

import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.util.concurrent.ExecutorService;
import p063h1.InterfaceC1111f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.upstream.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0480b implements CmcdConfiguration.Factory, InterfaceC1111f {
    @Override // p063h1.InterfaceC1111f
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
    public CmcdConfiguration createCmcdConfiguration(C0226o0 c0226o0) {
        return CmcdConfiguration.Factory.lambda$static$0(c0226o0);
    }
}
