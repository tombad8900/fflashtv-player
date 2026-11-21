package androidx.media3.exoplayer.drm;

import java.util.UUID;
import p063h1.AbstractC1118i0;
import p106m1.InterfaceC1867b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class FrameworkCryptoConfig implements InterfaceC1867b {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    @Deprecated
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final UUID uuid;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        boolean z7;
        if ("Amazon".equals(AbstractC1118i0.f4752c)) {
            String str = AbstractC1118i0.f4753d;
            z7 = "AFTM".equals(str) || "AFTB".equals(str);
        }
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z7;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public FrameworkCryptoConfig(UUID uuid, byte[] bArr, boolean z7) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z7;
    }
}
