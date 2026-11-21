package androidx.media3.exoplayer.metadata;

import androidx.media3.common.C0249w;
import p002a1.AbstractC0008a1;
import p003a2.C0060a;
import p013b2.C0557i;
import p031d2.C0801c;
import p192w1.InterfaceC2599a;
import p201x1.C2744b;
import p208y1.C2794b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory() { // from class: androidx.media3.exoplayer.metadata.MetadataDecoderFactory.1
        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public InterfaceC2599a createDecoder(C0249w c0249w) {
            String str = c0249w.f1522n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C2744b();
                    case "application/x-icy":
                        return new C0060a();
                    case "application/id3":
                        return new C0557i(null);
                    case "application/x-emsg":
                        return new C2794b();
                    case "application/x-scte35":
                        return new C0801c();
                }
            }
            throw new IllegalArgumentException(AbstractC0008a1.m25u("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public boolean supportsFormat(C0249w c0249w) {
            String str = c0249w.f1522n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    };

    InterfaceC2599a createDecoder(C0249w c0249w);

    boolean supportsFormat(C0249w c0249w);
}
