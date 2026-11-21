package p189v7;

import java.io.Closeable;
import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.h */
/* loaded from: classes.dex */
public final class C2569h implements Closeable {

    /* renamed from: j */
    public C2573j f9302j;

    /* renamed from: k */
    public boolean f9303k;

    /* renamed from: l */
    public C2566f0 f9304l;

    /* renamed from: n */
    public byte[] f9306n;

    /* renamed from: m */
    public long f9305m = -1;

    /* renamed from: o */
    public int f9307o = -1;

    /* renamed from: p */
    public int f9308p = -1;

    /* renamed from: b */
    public final void m4630b(long j) {
        C2573j c2573j = this.f9302j;
        if (c2573j == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f9303k) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j8 = c2573j.f9314k;
        if (j <= j8) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m15k("newSize < 0: ", j).toString());
            }
            long j9 = j8 - j;
            while (true) {
                if (j9 <= 0) {
                    break;
                }
                C2566f0 c2566f0 = c2573j.f9313j;
                AbstractC2980h.m5133b(c2566f0);
                C2566f0 c2566f02 = c2566f0.f9298g;
                AbstractC2980h.m5133b(c2566f02);
                int i = c2566f02.f9294c;
                long j10 = i - c2566f02.f9293b;
                if (j10 > j9) {
                    c2566f02.f9294c = i - ((int) j9);
                    break;
                } else {
                    c2573j.f9313j = c2566f02.m4624a();
                    AbstractC2568g0.m4628a(c2566f02);
                    j9 -= j10;
                }
            }
            this.f9304l = null;
            this.f9305m = j;
            this.f9306n = null;
            this.f9307o = -1;
            this.f9308p = -1;
        } else if (j > j8) {
            long j11 = j - j8;
            int i4 = 1;
            boolean z7 = true;
            for (long j12 = 0; j11 > j12; j12 = 0) {
                C2566f0 c2566f0M4653I = c2573j.m4653I(i4);
                int iMin = (int) Math.min(j11, 8192 - c2566f0M4653I.f9294c);
                int i8 = c2566f0M4653I.f9294c + iMin;
                c2566f0M4653I.f9294c = i8;
                j11 -= iMin;
                if (z7) {
                    this.f9304l = c2566f0M4653I;
                    this.f9305m = j8;
                    this.f9306n = c2566f0M4653I.f9292a;
                    this.f9307o = i8 - iMin;
                    this.f9308p = i8;
                    z7 = false;
                }
                i4 = 1;
            }
        }
        c2573j.f9314k = j;
    }

    /* renamed from: c */
    public final int m4631c(long j) {
        C2573j c2573j = this.f9302j;
        if (c2573j == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j8 = c2573j.f9314k;
            if (j <= j8) {
                if (j == -1 || j == j8) {
                    this.f9304l = null;
                    this.f9305m = j;
                    this.f9306n = null;
                    this.f9307o = -1;
                    this.f9308p = -1;
                    return -1;
                }
                C2566f0 c2566f0 = c2573j.f9313j;
                C2566f0 c2566f02 = this.f9304l;
                long j9 = 0;
                if (c2566f02 != null) {
                    long j10 = this.f9305m - (this.f9307o - c2566f02.f9293b);
                    if (j10 > j) {
                        c2566f02 = c2566f0;
                        c2566f0 = c2566f02;
                        j8 = j10;
                    } else {
                        j9 = j10;
                    }
                } else {
                    c2566f02 = c2566f0;
                }
                if (j8 - j > j - j9) {
                    while (true) {
                        AbstractC2980h.m5133b(c2566f02);
                        long j11 = (c2566f02.f9294c - c2566f02.f9293b) + j9;
                        if (j < j11) {
                            break;
                        }
                        c2566f02 = c2566f02.f9297f;
                        j9 = j11;
                    }
                } else {
                    while (j8 > j) {
                        AbstractC2980h.m5133b(c2566f0);
                        c2566f0 = c2566f0.f9298g;
                        AbstractC2980h.m5133b(c2566f0);
                        j8 -= c2566f0.f9294c - c2566f0.f9293b;
                    }
                    c2566f02 = c2566f0;
                    j9 = j8;
                }
                if (this.f9303k) {
                    AbstractC2980h.m5133b(c2566f02);
                    if (c2566f02.f9295d) {
                        byte[] bArr = c2566f02.f9292a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        AbstractC2980h.m5135d("copyOf(...)", bArrCopyOf);
                        C2566f0 c2566f03 = new C2566f0(bArrCopyOf, c2566f02.f9293b, c2566f02.f9294c, false, true);
                        if (c2573j.f9313j == c2566f02) {
                            c2573j.f9313j = c2566f03;
                        }
                        c2566f02.m4625b(c2566f03);
                        C2566f0 c2566f04 = c2566f03.f9298g;
                        AbstractC2980h.m5133b(c2566f04);
                        c2566f04.m4624a();
                        c2566f02 = c2566f03;
                    }
                }
                this.f9304l = c2566f02;
                this.f9305m = j;
                AbstractC2980h.m5133b(c2566f02);
                this.f9306n = c2566f02.f9292a;
                int i = c2566f02.f9293b + ((int) (j - j9));
                this.f9307o = i;
                int i4 = c2566f02.f9294c;
                this.f9308p = i4;
                return i4 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c2573j.f9314k);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9302j == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f9302j = null;
        this.f9304l = null;
        this.f9305m = -1L;
        this.f9306n = null;
        this.f9307o = -1;
        this.f9308p = -1;
    }
}
