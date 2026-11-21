package p048f2;

import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f2.e */
/* loaded from: classes.dex */
public final class C0936e {

    /* renamed from: d */
    public static final long[] f4119d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f4120a = new byte[8];

    /* renamed from: b */
    public int f4121b;

    /* renamed from: c */
    public int f4122c;

    /* renamed from: a */
    public static long m2109a(byte[] bArr, int i, boolean z7) {
        long j = bArr[0] & 255;
        if (z7) {
            j &= ~f4119d[i - 1];
        }
        for (int i4 = 1; i4 < i; i4++) {
            j = (j << 8) | (bArr[i4] & 255);
        }
        return j;
    }

    /* renamed from: b */
    public final long m2110b(InterfaceC1988o interfaceC1988o, boolean z7, boolean z8, int i) {
        int i4;
        int i8 = this.f4121b;
        byte[] bArr = this.f4120a;
        if (i8 == 0) {
            if (!interfaceC1988o.mo3854a(bArr, 0, 1, z7)) {
                return -1L;
            }
            int i9 = bArr[0] & 255;
            int i10 = 0;
            while (true) {
                if (i10 >= 8) {
                    i4 = -1;
                    break;
                }
                if ((f4119d[i10] & i9) != 0) {
                    i4 = i10 + 1;
                    break;
                }
                i10++;
            }
            this.f4122c = i4;
            if (i4 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f4121b = 1;
        }
        int i11 = this.f4122c;
        if (i11 > i) {
            this.f4121b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC1988o.readFully(bArr, 1, i11 - 1);
        }
        this.f4121b = 0;
        return m2109a(bArr, this.f4122c, z8);
    }
}
