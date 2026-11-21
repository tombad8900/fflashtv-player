package p184v1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import org.xmlpull.v1.XmlPullParserException;
import p021c2.C0631a;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p064h2.C1148m;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v1.a */
/* loaded from: classes.dex */
public final class C2526a implements InterfaceC1987n {

    /* renamed from: b */
    public InterfaceC1989p f9188b;

    /* renamed from: c */
    public int f9189c;

    /* renamed from: d */
    public int f9190d;

    /* renamed from: e */
    public int f9191e;

    /* renamed from: g */
    public C0631a f9193g;

    /* renamed from: h */
    public InterfaceC1988o f9194h;

    /* renamed from: i */
    public C2528c f9195i;

    /* renamed from: j */
    public C1148m f9196j;

    /* renamed from: a */
    public final C1132w f9187a = new C1132w(6);

    /* renamed from: f */
    public long f9192f = -1;

    /* renamed from: a */
    public final void m4542a() {
        InterfaceC1989p interfaceC1989p = this.f9188b;
        interfaceC1989p.getClass();
        interfaceC1989p.endTracks();
        this.f9188b.seekMap(new C1992s(-9223372036854775807L));
        this.f9189c = 6;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f9188b = interfaceC1989p;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        String strM2530p;
        C2528c c2528cM4551a;
        C0981l1 c0981l1;
        int i;
        C0631a c0631a;
        long j;
        int i4 = this.f9189c;
        C1132w c1132w = this.f9187a;
        if (i4 == 0) {
            c1132w.m2510D(2);
            interfaceC1988o.readFully(c1132w.f4799a, 0, 2);
            int iM2507A = c1132w.m2507A();
            this.f9190d = iM2507A;
            if (iM2507A == 65498) {
                if (this.f9192f != -1) {
                    this.f9189c = 4;
                    return 0;
                }
                m4542a();
                return 0;
            }
            if ((iM2507A < 65488 || iM2507A > 65497) && iM2507A != 65281) {
                this.f9189c = 1;
            }
            return 0;
        }
        if (i4 == 1) {
            c1132w.m2510D(2);
            interfaceC1988o.readFully(c1132w.f4799a, 0, 2);
            this.f9191e = c1132w.m2507A() - 2;
            this.f9189c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 4) {
                if (i4 != 5) {
                    if (i4 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f9195i == null || interfaceC1988o != this.f9194h) {
                    this.f9194h = interfaceC1988o;
                    this.f9195i = new C2528c(interfaceC1988o, this.f9192f);
                }
                C1148m c1148m = this.f9196j;
                c1148m.getClass();
                int i8 = c1148m.read(this.f9195i, c1964a0);
                if (i8 == 1) {
                    c1964a0.f7264a += this.f9192f;
                }
                return i8;
            }
            long position = interfaceC1988o.getPosition();
            long j8 = this.f9192f;
            if (position != j8) {
                c1964a0.f7264a = j8;
                return 1;
            }
            if (!interfaceC1988o.mo3855b(c1132w.f4799a, 0, 1, true)) {
                m4542a();
                return 0;
            }
            interfaceC1988o.mo3860g();
            if (this.f9196j == null) {
                this.f9196j = new C1148m(8, InterfaceC1597o.f6077g);
            }
            C2528c c2528c = new C2528c(interfaceC1988o, this.f9192f);
            this.f9195i = c2528c;
            if (!this.f9196j.sniff(c2528c)) {
                m4542a();
                return 0;
            }
            C1148m c1148m2 = this.f9196j;
            long j9 = this.f9192f;
            InterfaceC1989p interfaceC1989p = this.f9188b;
            interfaceC1989p.getClass();
            c1148m2.init(new C2528c(2, j9, interfaceC1989p));
            C0631a c0631a2 = this.f9193g;
            c0631a2.getClass();
            InterfaceC1989p interfaceC1989p2 = this.f9188b;
            interfaceC1989p2.getClass();
            InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p2.track(1024, 4);
            C0246v c0246v = new C0246v();
            c0246v.f1446l = AbstractC0244u0.m687p("image/jpeg");
            c0246v.f1445k = new C0241t0(c0631a2);
            interfaceC1980i0Track.format(new C0249w(c0246v));
            this.f9189c = 5;
            return 0;
        }
        if (this.f9190d == 65505) {
            C1132w c1132w2 = new C1132w(this.f9191e);
            interfaceC1988o.readFully(c1132w2.f4799a, 0, this.f9191e);
            if (this.f9193g == null && "http://ns.adobe.com/xap/1.0/".equals(c1132w2.m2530p()) && (strM2530p = c1132w2.m2530p()) != null) {
                long length = interfaceC1988o.getLength();
                if (length == -1) {
                    c0631a = null;
                    this.f9193g = c0631a;
                    if (c0631a != null) {
                        this.f9192f = c0631a.f2516m;
                    }
                } else {
                    try {
                        c2528cM4551a = AbstractC2530e.m4551a(strM2530p);
                    } catch (C0247v0 | NumberFormatException | XmlPullParserException unused) {
                        AbstractC1101a.m2348F("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c2528cM4551a = null;
                    }
                    if (c2528cM4551a != null && (i = (c0981l1 = (C0981l1) c2528cM4551a.f9202l).f4213m) >= 2) {
                        int i9 = i - 1;
                        long j10 = -1;
                        long j11 = -1;
                        long j12 = -1;
                        long j13 = -1;
                        boolean z7 = false;
                        while (i9 >= 0) {
                            C2527b c2527b = (C2527b) c0981l1.get(i9);
                            boolean zEquals = "video/mp4".equals(c2527b.f9197a) | z7;
                            if (i9 == 0) {
                                length -= c2527b.f9199c;
                                j = 0;
                            } else {
                                j = length - c2527b.f9198b;
                            }
                            long j14 = j;
                            long j15 = length;
                            length = j14;
                            if (zEquals && length != j15) {
                                j13 = j15 - length;
                                j12 = length;
                                zEquals = false;
                            }
                            if (i9 == 0) {
                                j10 = length;
                                j11 = j15;
                            }
                            i9--;
                            z7 = zEquals;
                        }
                        if (j12 != -1 && j13 != -1 && j10 != -1 && j11 != -1) {
                            c0631a = new C0631a(j10, j11, c2528cM4551a.f9201k, j12, j13);
                        }
                        this.f9193g = c0631a;
                        if (c0631a != null) {
                        }
                    }
                }
            }
        } else {
            interfaceC1988o.mo3861h(this.f9191e);
        }
        this.f9189c = 0;
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
        C1148m c1148m = this.f9196j;
        if (c1148m != null) {
            c1148m.getClass();
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        if (j == 0) {
            this.f9189c = 0;
            this.f9196j = null;
        } else if (this.f9189c == 5) {
            C1148m c1148m = this.f9196j;
            c1148m.getClass();
            c1148m.seek(j, j8);
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        C1132w c1132w = this.f9187a;
        c1132w.m2510D(2);
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 2);
        if (c1132w.m2507A() == 65496) {
            c1132w.m2510D(2);
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 2);
            int iM2507A = c1132w.m2507A();
            this.f9190d = iM2507A;
            if (iM2507A == 65504) {
                c1132w.m2510D(2);
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 2);
                interfaceC1988o.mo3857d(c1132w.m2507A() - 2);
                c1132w.m2510D(2);
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 2);
                this.f9190d = c1132w.m2507A();
            }
            if (this.f9190d == 65505) {
                interfaceC1988o.mo3857d(2);
                c1132w.m2510D(6);
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 6);
                if (c1132w.m2537w() == 1165519206 && c1132w.m2507A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
