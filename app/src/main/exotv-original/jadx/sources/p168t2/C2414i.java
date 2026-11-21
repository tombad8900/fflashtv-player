package p168t2;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.i */
/* loaded from: classes.dex */
public final class C2414i {

    /* renamed from: e */
    public static final byte[] f8574e = {0, 0, 1};

    /* renamed from: a */
    public boolean f8575a;

    /* renamed from: b */
    public int f8576b;

    /* renamed from: c */
    public int f8577c;

    /* renamed from: d */
    public byte[] f8578d;

    /* renamed from: a */
    public final void m4257a(byte[] bArr, int i, int i4) {
        if (this.f8575a) {
            int i8 = i4 - i;
            byte[] bArr2 = this.f8578d;
            int length = bArr2.length;
            int i9 = this.f8576b + i8;
            if (length < i9) {
                this.f8578d = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i, this.f8578d, this.f8576b, i8);
            this.f8576b += i8;
        }
    }
}
