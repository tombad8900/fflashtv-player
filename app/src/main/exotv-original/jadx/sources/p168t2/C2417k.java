package p168t2;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.k */
/* loaded from: classes.dex */
public final class C2417k {

    /* renamed from: f */
    public static final byte[] f8596f = {0, 0, 1};

    /* renamed from: a */
    public boolean f8597a;

    /* renamed from: b */
    public int f8598b;

    /* renamed from: c */
    public int f8599c;

    /* renamed from: d */
    public int f8600d;

    /* renamed from: e */
    public byte[] f8601e;

    /* renamed from: a */
    public final void m4289a(byte[] bArr, int i, int i4) {
        if (this.f8597a) {
            int i8 = i4 - i;
            byte[] bArr2 = this.f8601e;
            int length = bArr2.length;
            int i9 = this.f8599c + i8;
            if (length < i9) {
                this.f8601e = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i, this.f8601e, this.f8599c, i8);
            this.f8599c += i8;
        }
    }
}
