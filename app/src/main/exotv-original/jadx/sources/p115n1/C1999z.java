package p115n1;

import androidx.media3.exoplayer.RendererCapabilities;
import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.z */
/* loaded from: classes.dex */
public final class C1999z {

    /* renamed from: a */
    public int f7409a;

    /* renamed from: b */
    public int f7410b;

    /* renamed from: c */
    public int f7411c;

    /* renamed from: d */
    public int f7412d;

    /* renamed from: e */
    public int f7413e;

    /* renamed from: f */
    public int f7414f;

    /* renamed from: g */
    public Serializable f7415g;

    /* renamed from: a */
    public boolean m3879a(int i) {
        int i4;
        int i8;
        int i9;
        int i10;
        if ((i & (-2097152)) != -2097152 || (i4 = (i >>> 19) & 3) == 1 || (i8 = (i >>> 17) & 3) == 0 || (i9 = (i >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f7409a = i4;
        this.f7415g = AbstractC1965b.f7283s[3 - i8];
        int i11 = AbstractC1965b.f7284t[i10];
        this.f7411c = i11;
        if (i4 == 2) {
            this.f7411c = i11 / 2;
        } else if (i4 == 0) {
            this.f7411c = i11 / 4;
        }
        int i12 = (i >>> 9) & 1;
        int i13 = 1152;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    throw new IllegalArgumentException();
                }
                i13 = RendererCapabilities.DECODER_SUPPORT_MASK;
            }
        } else if (i4 != 3) {
            i13 = 576;
        }
        this.f7414f = i13;
        if (i8 == 3) {
            int i14 = i4 == 3 ? AbstractC1965b.f7285u[i9 - 1] : AbstractC1965b.f7286v[i9 - 1];
            this.f7413e = i14;
            this.f7410b = (((i14 * 12) / this.f7411c) + i12) * 4;
        } else {
            if (i4 == 3) {
                int i15 = i8 == 2 ? AbstractC1965b.f7287w[i9 - 1] : AbstractC1965b.f7288x[i9 - 1];
                this.f7413e = i15;
                this.f7410b = ((i15 * 144) / this.f7411c) + i12;
            } else {
                int i16 = AbstractC1965b.f7289y[i9 - 1];
                this.f7413e = i16;
                this.f7410b = (((i8 == 1 ? 72 : 144) * i16) / this.f7411c) + i12;
            }
        }
        this.f7412d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
