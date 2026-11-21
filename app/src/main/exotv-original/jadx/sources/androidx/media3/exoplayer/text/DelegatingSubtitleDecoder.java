package androidx.media3.exoplayer.text;

import p090k2.AbstractC1589g;
import p090k2.InterfaceC1590h;
import p090k2.InterfaceC1599q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class DelegatingSubtitleDecoder extends AbstractC1589g {
    private final InterfaceC1599q subtitleParser;

    public DelegatingSubtitleDecoder(String str, InterfaceC1599q interfaceC1599q) {
        super(str);
        this.subtitleParser = interfaceC1599q;
    }

    @Override // p090k2.AbstractC1589g
    public InterfaceC1590h decode(byte[] bArr, int i, boolean z7) {
        if (z7) {
            this.subtitleParser.reset();
        }
        return this.subtitleParser.mo3264d(bArr, 0, i);
    }
}
