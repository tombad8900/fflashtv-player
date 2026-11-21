package androidx.lifecycle;

import com.bumptech.glide.AbstractC0715d;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import okhttp3.C2181z;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p102l6.C1687d;
import p111m6.AbstractC1913h;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2585p;
import p189v7.C2556a0;
import p189v7.C2558b0;
import p189v7.C2564e0;
import p189v7.C2584o0;
import p189v7.C2591v;
import p198w7.AbstractC2706b;
import p198w7.C2708d;
import p198w7.C2710f;
import p198w7.C2711g;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.n0 */
/* loaded from: classes.dex */
public final class C0149n0 extends AbstractC2981i implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f931j;

    /* renamed from: k */
    public final /* synthetic */ Object f932k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0149n0(int i, Object obj) {
        super(0);
        this.f931j = i;
        this.f932k = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028a A[Catch: all -> 0x0228, TRY_LEAVE, TryCatch #4 {all -> 0x0228, blocks: (B:25:0x00df, B:27:0x00ed, B:28:0x00f8, B:38:0x0157, B:40:0x0162, B:88:0x0227, B:84:0x021e, B:91:0x022c, B:120:0x028a, B:126:0x02a9, B:117:0x0284, B:131:0x02b2, B:134:0x02c2, B:135:0x02c9, B:136:0x02ca, B:137:0x02cd, B:138:0x02ce, B:139:0x02e3, B:114:0x027f, B:41:0x016a, B:43:0x0173, B:46:0x0184, B:72:0x0208, B:68:0x0201, B:75:0x020c, B:76:0x0211, B:29:0x0100, B:31:0x010b, B:37:0x0135, B:129:0x02ac, B:130:0x02b1, B:81:0x0219), top: B:159:0x00df, inners: #2, #5, #7, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    @Override // p212y6.InterfaceC2840a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws IOException {
        int i;
        C2564e0 c2564e0;
        Throwable th;
        C1687d c1687d;
        Throwable th2;
        Throwable th3;
        int iM4609c;
        C1687d c1687d2;
        int i4 = this.f931j;
        Object obj = this.f932k;
        switch (i4) {
            case 0:
                return AbstractC0147m0.m567f((InterfaceC0163u0) obj);
            default:
                C2710f c2710f = (C2710f) obj;
                ClassLoader classLoader = c2710f.f9835b;
                AbstractC2585p abstractC2585p = c2710f.f9836c;
                Enumeration<URL> resources = classLoader.getResources(C2181z.FRAGMENT_ENCODE_SET);
                AbstractC2980h.m5135d("getResources(...)", resources);
                ArrayList list = Collections.list(resources);
                AbstractC2980h.m5135d("list(...)", list);
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                boolean z7 = false;
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = list.get(i8);
                    i8++;
                    URL url = (URL) obj2;
                    AbstractC2980h.m5133b(url);
                    if (AbstractC2980h.m5132a(url.getProtocol(), "file")) {
                        String str = C2558b0.f9272k;
                        c1687d2 = new C1687d(abstractC2585p, C2556a0.m4572e(new File(url.toURI())));
                    } else {
                        c1687d2 = null;
                    }
                    if (c1687d2 != null) {
                        arrayList.add(c1687d2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                AbstractC2980h.m5135d("getResources(...)", resources2);
                ArrayList list2 = Collections.list(resources2);
                AbstractC2980h.m5135d("list(...)", list2);
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i9 = 0;
                while (i9 < size2) {
                    int i10 = i9 + 1;
                    URL url2 = (URL) list2.get(i9);
                    AbstractC2980h.m5133b(url2);
                    ?? string = url2.toString();
                    AbstractC2980h.m5135d("toString(...)", string);
                    if (AbstractC1214p.m2667t0(string, "jar:file:", z7)) {
                        ?? M2652x0 = (6 & 2) != 0 ? AbstractC1206h.m2652x0(string) : z7;
                        AbstractC2980h.m5136e("<this>", string);
                        AbstractC2980h.m5136e("string", "!");
                        int iLastIndexOf = string.lastIndexOf("!", M2652x0);
                        if (iLastIndexOf == -1) {
                            i = i10;
                            c1687d = null;
                        } else {
                            String str2 = C2558b0.f9272k;
                            String strSubstring = string.substring(4, iLastIndexOf);
                            AbstractC2980h.m5135d("substring(...)", strSubstring);
                            C2558b0 c2558b0M4572e = C2556a0.m4572e(new File(URI.create(strSubstring)));
                            C2591v c2591vMo3161j = abstractC2585p.mo3161j(c2558b0M4572e);
                            try {
                                long size3 = c2591vMo3161j.size() - 22;
                                long j = 0;
                                if (size3 < 0) {
                                    throw new IOException("not a zip: size=" + c2591vMo3161j.size());
                                }
                                i = i10;
                                long jMax = Math.max(size3 - 65536, 0L);
                                while (true) {
                                    C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(c2591vMo3161j.m4683b(size3));
                                    try {
                                        long j8 = j;
                                        if (c2564e0M4578c.m4609c() == 101010256) {
                                            int iM4615k = c2564e0M4578c.m4615k() & 65535;
                                            int iM4615k2 = c2564e0M4578c.m4615k() & 65535;
                                            long jM4615k = c2564e0M4578c.m4615k() & 65535;
                                            if (jM4615k != (c2564e0M4578c.m4615k() & 65535) || iM4615k != 0 || iM4615k2 != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            c2564e0M4578c.skip(4L);
                                            int iM4615k3 = c2564e0M4578c.m4615k() & 65535;
                                            C2708d c2708d = new C2708d(iM4615k3, jM4615k, c2564e0M4578c.m4609c() & 4294967295L);
                                            c2564e0M4578c.m4618p(iM4615k3);
                                            c2564e0M4578c.close();
                                            long j9 = size3 - 20;
                                            if (j9 > j8) {
                                                C2564e0 c2564e0M4578c2 = AbstractC2557b.m4578c(c2591vMo3161j.m4683b(j9));
                                                try {
                                                    if (c2564e0M4578c2.m4609c() == 117853008) {
                                                        int iM4609c2 = c2564e0M4578c2.m4609c();
                                                        long jM4611g = c2564e0M4578c2.m4611g();
                                                        if (c2564e0M4578c2.m4609c() != 1 || iM4609c2 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        C2564e0 c2564e0M4578c3 = AbstractC2557b.m4578c(c2591vMo3161j.m4683b(jM4611g));
                                                        try {
                                                            iM4609c = c2564e0M4578c3.m4609c();
                                                        } catch (Throwable th4) {
                                                            try {
                                                            } catch (Throwable th5) {
                                                                AbstractC0715d.m1557e(th4, th5);
                                                            }
                                                            th3 = th4;
                                                        }
                                                        if (iM4609c != 101075792) {
                                                            throw new IOException("bad zip: expected " + AbstractC2706b.m4763c(101075792) + " but was " + AbstractC2706b.m4763c(iM4609c));
                                                        }
                                                        c2564e0M4578c3.skip(12L);
                                                        int iM4609c3 = c2564e0M4578c3.m4609c();
                                                        int iM4609c4 = c2564e0M4578c3.m4609c();
                                                        long jM4611g2 = c2564e0M4578c3.m4611g();
                                                        if (jM4611g2 != c2564e0M4578c3.m4611g() || iM4609c3 != 0 || iM4609c4 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        c2564e0M4578c3.skip(8L);
                                                        try {
                                                            th3 = null;
                                                        } catch (Throwable th6) {
                                                            th3 = th6;
                                                        }
                                                        c2708d = new C2708d(iM4615k3, jM4611g2, c2564e0M4578c3.m4611g());
                                                        if (th3 != null) {
                                                            throw th3;
                                                        }
                                                    }
                                                    try {
                                                        th2 = null;
                                                    } catch (Throwable th7) {
                                                        th2 = th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    try {
                                                    } catch (Throwable th9) {
                                                        AbstractC0715d.m1557e(th8, th9);
                                                    }
                                                    th2 = th8;
                                                }
                                                if (th2 != null) {
                                                    throw th2;
                                                }
                                            }
                                            C2708d c2708d2 = c2708d;
                                            ArrayList arrayList3 = new ArrayList();
                                            C2564e0 c2564e0M4578c4 = AbstractC2557b.m4578c(c2591vMo3161j.m4683b(c2708d2.f9830b));
                                            try {
                                                long j10 = c2708d2.f9829a;
                                                long j11 = j8;
                                                while (j11 < j10) {
                                                    C2711g c2711gM4764d = AbstractC2706b.m4764d(c2564e0M4578c4);
                                                    c2564e0 = c2564e0M4578c4;
                                                    long j12 = j10;
                                                    try {
                                                        if (c2711gM4764d.f9845h >= c2708d2.f9830b) {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                            break;
                                                        } else {
                                                            C2558b0 c2558b0 = C2710f.f9834e;
                                                            if (C2556a0.m4570b(c2711gM4764d.f9838a)) {
                                                                arrayList3.add(c2711gM4764d);
                                                            }
                                                            j11++;
                                                            c2564e0M4578c4 = c2564e0;
                                                            j10 = j12;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        Throwable th11 = th;
                                                        try {
                                                            c2564e0.close();
                                                        } catch (Throwable th12) {
                                                            AbstractC0715d.m1557e(th11, th12);
                                                        }
                                                        th = th11;
                                                        if (th == null) {
                                                        }
                                                    }
                                                }
                                                try {
                                                    c2564e0M4578c4.close();
                                                    th = null;
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                c2564e0 = c2564e0M4578c4;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            C2584o0 c2584o0 = new C2584o0(c2558b0M4572e, abstractC2585p, AbstractC2706b.m4762b(arrayList3));
                                            try {
                                                c2591vMo3161j.close();
                                            } catch (Throwable unused) {
                                            }
                                            c1687d = new C1687d(c2584o0, C2710f.f9834e);
                                        } else {
                                            c2564e0M4578c.close();
                                            size3--;
                                            if (size3 < jMax) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                            j = j8;
                                        }
                                    } finally {
                                        c2564e0M4578c.close();
                                    }
                                }
                            } catch (Throwable th15) {
                                if (c2591vMo3161j == null) {
                                    throw th15;
                                }
                                try {
                                    c2591vMo3161j.close();
                                    throw th15;
                                } catch (Throwable th16) {
                                    AbstractC0715d.m1557e(th15, th16);
                                    throw th15;
                                }
                            }
                        }
                    }
                    if (c1687d != null) {
                        arrayList2.add(c1687d);
                    }
                    i9 = i;
                    z7 = false;
                }
                return AbstractC1913h.m3743H0(arrayList, arrayList2);
        }
    }
}
