package p203x3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x3.c */
/* loaded from: classes.dex */
public final class C2756c {

    /* renamed from: b */
    public ByteBuffer f10182b;

    /* renamed from: c */
    public C2755b f10183c;

    /* renamed from: a */
    public final byte[] f10181a = new byte[256];

    /* renamed from: d */
    public int f10184d = 0;

    /* renamed from: a */
    public final boolean m4837a() {
        return this.f10183c.f10171b != 0;
    }

    /* renamed from: b */
    public final C2755b m4838b() {
        byte[] bArr;
        if (this.f10182b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m4837a()) {
            return this.f10183c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m4839c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f10183c.f10175f = this.f10182b.getShort();
            this.f10183c.f10176g = this.f10182b.getShort();
            int iM4839c = m4839c();
            C2755b c2755b = this.f10183c;
            c2755b.f10177h = (iM4839c & 128) != 0;
            c2755b.f10178i = (int) Math.pow(2.0d, (iM4839c & 7) + 1);
            this.f10183c.f10179j = m4839c();
            C2755b c2755b2 = this.f10183c;
            m4839c();
            c2755b2.getClass();
            if (this.f10183c.f10177h && !m4837a()) {
                C2755b c2755b3 = this.f10183c;
                c2755b3.f10170a = m4841e(c2755b3.f10178i);
                C2755b c2755b4 = this.f10183c;
                c2755b4.f10180k = c2755b4.f10170a[c2755b4.f10179j];
            }
        } else {
            this.f10183c.f10171b = 1;
        }
        if (!m4837a()) {
            boolean z7 = false;
            while (!z7 && !m4837a() && this.f10183c.f10172c <= Integer.MAX_VALUE) {
                int iM4839c2 = m4839c();
                if (iM4839c2 == 33) {
                    int iM4839c3 = m4839c();
                    if (iM4839c3 == 1) {
                        m4842f();
                    } else if (iM4839c3 == 249) {
                        this.f10183c.f10173d = new C2754a();
                        m4839c();
                        int iM4839c4 = m4839c();
                        C2754a c2754a = this.f10183c.f10173d;
                        int i4 = (iM4839c4 & 28) >> 2;
                        c2754a.f10165g = i4;
                        if (i4 == 0) {
                            c2754a.f10165g = 1;
                        }
                        c2754a.f10164f = (iM4839c4 & 1) != 0;
                        short s8 = this.f10182b.getShort();
                        if (s8 < 2) {
                            s8 = 10;
                        }
                        C2754a c2754a2 = this.f10183c.f10173d;
                        c2754a2.f10167i = s8 * 10;
                        c2754a2.f10166h = m4839c();
                        m4839c();
                    } else if (iM4839c3 == 254) {
                        m4842f();
                    } else if (iM4839c3 != 255) {
                        m4842f();
                    } else {
                        m4840d();
                        StringBuilder sb2 = new StringBuilder();
                        int i8 = 0;
                        while (true) {
                            bArr = this.f10181a;
                            if (i8 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i8]);
                            i8++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m4840d();
                                if (bArr[0] == 1) {
                                    byte b7 = bArr[1];
                                    byte b8 = bArr[2];
                                    this.f10183c.getClass();
                                }
                                if (this.f10184d > 0) {
                                }
                            } while (!m4837a());
                        } else {
                            m4842f();
                        }
                    }
                } else if (iM4839c2 == 44) {
                    C2755b c2755b5 = this.f10183c;
                    if (c2755b5.f10173d == null) {
                        c2755b5.f10173d = new C2754a();
                    }
                    c2755b5.f10173d.f10159a = this.f10182b.getShort();
                    this.f10183c.f10173d.f10160b = this.f10182b.getShort();
                    this.f10183c.f10173d.f10161c = this.f10182b.getShort();
                    this.f10183c.f10173d.f10162d = this.f10182b.getShort();
                    int iM4839c5 = m4839c();
                    boolean z8 = (iM4839c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM4839c5 & 7) + 1);
                    C2754a c2754a3 = this.f10183c.f10173d;
                    c2754a3.f10163e = (iM4839c5 & 64) != 0;
                    if (z8) {
                        c2754a3.f10169k = m4841e(iPow);
                    } else {
                        c2754a3.f10169k = null;
                    }
                    this.f10183c.f10173d.f10168j = this.f10182b.position();
                    m4839c();
                    m4842f();
                    if (!m4837a()) {
                        C2755b c2755b6 = this.f10183c;
                        c2755b6.f10172c++;
                        c2755b6.f10174e.add(c2755b6.f10173d);
                    }
                } else if (iM4839c2 != 59) {
                    this.f10183c.f10171b = 1;
                } else {
                    z7 = true;
                }
            }
            C2755b c2755b7 = this.f10183c;
            if (c2755b7.f10172c < 0) {
                c2755b7.f10171b = 1;
            }
        }
        return this.f10183c;
    }

    /* renamed from: c */
    public final int m4839c() {
        try {
            return this.f10182b.get() & 255;
        } catch (Exception unused) {
            this.f10183c.f10171b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void m4840d() {
        int iM4839c = m4839c();
        this.f10184d = iM4839c;
        if (iM4839c <= 0) {
            return;
        }
        int i = 0;
        int i4 = 0;
        while (true) {
            try {
                i4 = this.f10184d;
                if (i >= i4) {
                    return;
                }
                i4 -= i;
                this.f10182b.get(this.f10181a, i, i4);
                i += i4;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbM19o.append(this.f10184d);
                    Log.d("GifHeaderParser", sbM19o.toString(), e);
                }
                this.f10183c.f10171b = 1;
                return;
            }
        }
    }

    /* renamed from: e */
    public final int[] m4841e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f10182b.get(bArr);
            iArr = new int[256];
            int i4 = 0;
            int i8 = 0;
            while (i4 < i) {
                int i9 = bArr[i8] & 255;
                int i10 = i8 + 2;
                int i11 = bArr[i8 + 1] & 255;
                i8 += 3;
                int i12 = i4 + 1;
                iArr[i4] = (i11 << 8) | (i9 << 16) | (-16777216) | (bArr[i10] & 255);
                i4 = i12;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f10183c.f10171b = 1;
            return iArr;
        }
    }

    /* renamed from: f */
    public final void m4842f() {
        int iM4839c;
        do {
            iM4839c = m4839c();
            this.f10182b.position(Math.min(this.f10182b.position() + iM4839c, this.f10182b.limit()));
        } while (iM4839c > 0);
    }
}
