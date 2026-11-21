package p090k2;

import androidx.media3.common.C0249w;
import java.util.List;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p002a1.C0022h;
import p107m2.C1885h;
import p115n1.C1997x;
import p123o2.C2043b;
import p133p2.C2206a;
import p142q2.C2256e;
import p150r2.C2288a;
import p156s.C2332e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.e */
/* loaded from: classes.dex */
public final class C1587e implements InterfaceC1597o {
    @Override // p090k2.InterfaceC1597o
    /* renamed from: c */
    public final int mo3257c(C0249w c0249w) {
        String str = c0249w.f1522n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(AbstractC0008a1.m25u("Unsupported MIME type: ", str));
    }

    @Override // p090k2.InterfaceC1597o
    /* renamed from: g */
    public final InterfaceC1599q mo3259g(C0249w c0249w) {
        String str = c0249w.f1522n;
        List list = c0249w.f1525q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C1885h(list);
                case "application/pgs":
                    return new C0022h(5);
                case "application/x-mp4-vtt":
                    return new C1997x(1);
                case "text/vtt":
                    return new C2332e(1);
                case "application/x-quicktime-tx3g":
                    return new C2288a(list);
                case "text/x-ssa":
                    return new C2043b(list);
                case "application/x-subrip":
                    return new C2206a();
                case "application/ttml+xml":
                    return new C2256e();
            }
        }
        throw new IllegalArgumentException(AbstractC0008a1.m25u("Unsupported MIME type: ", str));
    }

    @Override // p090k2.InterfaceC1597o
    public final boolean supportsFormat(C0249w c0249w) {
        String str = c0249w.f1522n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
