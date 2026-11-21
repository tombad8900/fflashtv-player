package androidx.media3.exoplayer.text;

import androidx.media3.common.C0249w;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p090k2.C1587e;
import p090k2.InterfaceC1591i;
import p090k2.InterfaceC1599q;
import p098l2.C1653c;
import p098l2.C1656f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        private final C1587e delegate = new C1587e();

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public InterfaceC1591i createDecoder(C0249w c0249w) {
            String str = c0249w.f1522n;
            int i = c0249w.f1503H;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C1653c(str, i);
                    case "application/cea-708":
                        return new C1656f(i, c0249w.f1525q);
                }
            }
            if (!this.delegate.supportsFormat(c0249w)) {
                throw new IllegalArgumentException(AbstractC0008a1.m25u("Attempted to create decoder for unsupported MIME type: ", str));
            }
            InterfaceC1599q interfaceC1599qMo3259g = this.delegate.mo3259g(c0249w);
            return new DelegatingSubtitleDecoder(interfaceC1599qMo3259g.getClass().getSimpleName().concat("Decoder"), interfaceC1599qMo3259g);
        }

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(C0249w c0249w) {
            String str = c0249w.f1522n;
            return this.delegate.supportsFormat(c0249w) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    };

    InterfaceC1591i createDecoder(C0249w c0249w);

    boolean supportsFormat(C0249w c0249w);
}
