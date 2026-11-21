package p198w7;

import java.io.IOException;
import p102l6.C1693j;
import p189v7.C2564e0;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2981i;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.h */
/* loaded from: classes.dex */
public final class C2712h extends AbstractC2981i implements InterfaceC2855p {

    /* renamed from: j */
    public final /* synthetic */ int f9855j = 1;

    /* renamed from: k */
    public final /* synthetic */ C2564e0 f9856k;

    /* renamed from: l */
    public final /* synthetic */ C2986n f9857l;

    /* renamed from: m */
    public final /* synthetic */ C2986n f9858m;

    /* renamed from: n */
    public final /* synthetic */ C2986n f9859n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2712h(C2564e0 c2564e0, C2986n c2986n, C2986n c2986n2, C2986n c2986n3) {
        super(2);
        this.f9856k = c2564e0;
        this.f9857l = c2986n;
        this.f9858m = c2986n2;
        this.f9859n = c2986n3;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) throws IOException {
        switch (this.f9855j) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue == 1) {
                    C2986n c2986n = this.f9857l;
                    if (c2986n.f11117j != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C2564e0 c2564e0 = this.f9856k;
                    c2986n.f11117j = Long.valueOf(c2564e0.m4611g());
                    this.f9858m.f11117j = Long.valueOf(c2564e0.m4611g());
                    this.f9859n.f11117j = Long.valueOf(c2564e0.m4611g());
                }
                return C1693j.f6497a;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                long jLongValue2 = ((Number) obj2).longValue();
                if (iIntValue2 == 21589) {
                    if (jLongValue2 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C2564e0 c2564e02 = this.f9856k;
                    byte b7 = c2564e02.readByte();
                    boolean z7 = (b7 & 1) == 1;
                    boolean z8 = (b7 & 2) == 2;
                    boolean z9 = (b7 & 4) == 4;
                    long j = z7 ? 5L : 1L;
                    if (z8) {
                        j += 4;
                    }
                    if (z9) {
                        j += 4;
                    }
                    if (jLongValue2 < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z7) {
                        this.f9857l.f11117j = Integer.valueOf(c2564e02.m4609c());
                    }
                    if (z8) {
                        this.f9858m.f11117j = Integer.valueOf(c2564e02.m4609c());
                    }
                    if (z9) {
                        this.f9859n.f11117j = Integer.valueOf(c2564e02.m4609c());
                    }
                }
                return C1693j.f6497a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2712h(C2986n c2986n, C2564e0 c2564e0, C2986n c2986n2, C2986n c2986n3) {
        super(2);
        this.f9857l = c2986n;
        this.f9856k = c2564e0;
        this.f9858m = c2986n2;
        this.f9859n = c2986n3;
    }
}
