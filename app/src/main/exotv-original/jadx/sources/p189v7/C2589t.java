package p189v7;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.t */
/* loaded from: classes.dex */
public final class C2589t implements InterfaceC2576k0 {

    /* renamed from: j */
    public byte f9332j;

    /* renamed from: k */
    public final C2564e0 f9333k;

    /* renamed from: l */
    public final Inflater f9334l;

    /* renamed from: m */
    public final C2590u f9335m;

    /* renamed from: n */
    public final CRC32 f9336n;

    public C2589t(InterfaceC2576k0 interfaceC2576k0) {
        AbstractC2980h.m5136e("source", interfaceC2576k0);
        C2564e0 c2564e0 = new C2564e0(interfaceC2576k0);
        this.f9333k = c2564e0;
        Inflater inflater = new Inflater(true);
        this.f9334l = inflater;
        this.f9335m = new C2590u(c2564e0, inflater);
        this.f9336n = new CRC32();
    }

    /* renamed from: b */
    public static void m4680b(String str, int i, int i4) throws IOException {
        if (i4 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC1206h.m2633G0(AbstractC2557b.m4586k(i4)) + " != expected 0x" + AbstractC1206h.m2633G0(AbstractC2557b.m4586k(i)));
    }

    /* renamed from: c */
    public final void m4681c(C2573j c2573j, long j, long j8) {
        C2566f0 c2566f0 = c2573j.f9313j;
        AbstractC2980h.m5133b(c2566f0);
        while (true) {
            int i = c2566f0.f9294c;
            int i4 = c2566f0.f9293b;
            if (j < i - i4) {
                break;
            }
            j -= i - i4;
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
        }
        while (j8 > 0) {
            int iMin = (int) Math.min(c2566f0.f9294c - r6, j8);
            this.f9336n.update(c2566f0.f9292a, (int) (c2566f0.f9293b + j), iMin);
            j8 -= iMin;
            c2566f0 = c2566f0.f9297f;
            AbstractC2980h.m5133b(c2566f0);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9335m.close();
    }

    @Override // p189v7.InterfaceC2576k0
    public final long read(C2573j c2573j, long j) throws DataFormatException, IOException {
        C2589t c2589t = this;
        AbstractC2980h.m5136e("sink", c2573j);
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b7 = c2589t.f9332j;
        CRC32 crc32 = c2589t.f9336n;
        C2564e0 c2564e0 = c2589t.f9333k;
        if (b7 == 0) {
            c2564e0.mo4623y(10L);
            C2573j c2573j2 = c2564e0.f9290k;
            byte bM4666g = c2573j2.m4666g(3L);
            boolean z7 = ((bM4666g >> 1) & 1) == 1;
            if (z7) {
                c2589t.m4681c(c2573j2, 0L, 10L);
            }
            m4680b("ID1ID2", 8075, c2564e0.readShort());
            c2564e0.skip(8L);
            if (((bM4666g >> 2) & 1) == 1) {
                c2564e0.mo4623y(2L);
                if (z7) {
                    m4681c(c2573j2, 0L, 2L);
                }
                long jM4649E = c2573j2.m4649E() & 65535;
                c2564e0.mo4623y(jM4649E);
                if (z7) {
                    m4681c(c2573j2, 0L, jM4649E);
                }
                c2564e0.skip(jM4649E);
            }
            if (((bM4666g >> 3) & 1) == 1) {
                long jM4608b = c2564e0.m4608b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM4608b == -1) {
                    throw new EOFException();
                }
                if (z7) {
                    m4681c(c2573j2, 0L, jM4608b + 1);
                }
                c2564e0.skip(jM4608b + 1);
            }
            if (((bM4666g >> 4) & 1) == 1) {
                long jM4608b2 = c2564e0.m4608b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM4608b2 == -1) {
                    throw new EOFException();
                }
                if (z7) {
                    c2589t = this;
                    c2589t.m4681c(c2573j2, 0L, jM4608b2 + 1);
                } else {
                    c2589t = this;
                }
                c2564e0.skip(jM4608b2 + 1);
            } else {
                c2589t = this;
            }
            if (z7) {
                m4680b("FHCRC", c2564e0.m4615k(), (short) crc32.getValue());
                crc32.reset();
            }
            c2589t.f9332j = (byte) 1;
        }
        if (c2589t.f9332j == 1) {
            long j8 = c2573j.f9314k;
            long j9 = c2589t.f9335m.read(c2573j, j);
            if (j9 != -1) {
                c2589t.m4681c(c2573j, j8, j9);
                return j9;
            }
            c2589t.f9332j = (byte) 2;
        }
        if (c2589t.f9332j == 2) {
            m4680b("CRC", c2564e0.m4609c(), (int) crc32.getValue());
            m4680b("ISIZE", c2564e0.m4609c(), (int) c2589t.f9334l.getBytesWritten());
            c2589t.f9332j = (byte) 3;
            if (!c2564e0.mo4614j()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p189v7.InterfaceC2576k0
    public final C2582n0 timeout() {
        return this.f9333k.f9289j.timeout();
    }
}
