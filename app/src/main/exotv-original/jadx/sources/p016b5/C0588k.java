package p016b5;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPInputStream;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1295g;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p111m6.AbstractC1912g;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1915j;
import p119n6.C2023c;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p138p7.C2229a;
import p138p7.C2230b;
import p138p7.C2235g;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p171t5.AbstractC2436a;
import p204x4.C2765h;
import p204x4.C2768k;
import p204x4.C2777t;
import p204x4.C2779v;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.k */
/* loaded from: classes.dex */
public final class C0588k extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f2352n = 0;

    /* renamed from: o */
    public int f2353o;

    /* renamed from: p */
    public Object f2354p;

    public /* synthetic */ C0588k(int i, InterfaceC2222c interfaceC2222c) {
        super(i, interfaceC2222c);
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f2352n) {
        }
        return ((C0588k) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f2352n) {
            case 0:
                return new C0588k(2, interfaceC2222c);
            default:
                return new C0588k((C2777t) this.f2354p, interfaceC2222c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136 A[LOOP:2: B:74:0x0134->B:75:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167 A[LOOP:3: B:77:0x0161->B:79:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        Object obj2;
        C2230b c2230b;
        Charset charsetForName;
        Charset charset;
        String str;
        int i4;
        int size;
        int i8;
        Iterator it;
        Iterator it2;
        Charset charsetForName2;
        Object next = null;
        switch (this.f2352n) {
            case 0:
                Object obj3 = EnumC2273a.f7953j;
                int i9 = this.f2353o;
                if (i9 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2230b c2230b2 = C0589l.f2356b;
                    this.f2354p = c2230b2;
                    this.f2353o = 1;
                    c2230b2.getClass();
                    int i10 = c2230b2.f7759a;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2230b.f7750h;
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = C2235g.f7758g;
                        int i11 = atomicIntegerFieldUpdater2.get(c2230b2);
                        if (i11 > i10) {
                            do {
                                atomicIntegerFieldUpdater = C2235g.f7758g;
                                i = atomicIntegerFieldUpdater.get(c2230b2);
                                if (i > i10) {
                                }
                            } while (!atomicIntegerFieldUpdater.compareAndSet(c2230b2, i, i10));
                        } else {
                            obj2 = C1693j.f6497a;
                            if (i11 <= 0) {
                                C1295g c1295gM2847h = AbstractC1339x.m2847h(AbstractC0715d.m1547P(this));
                                try {
                                    C2229a c2229a = new C2229a(c2230b2, c1295gM2847h);
                                    while (true) {
                                        int andDecrement = C2235g.f7758g.getAndDecrement(c2230b2);
                                        if (andDecrement <= i10) {
                                            if (andDecrement > 0) {
                                                c2229a.mo2791i(c2230b2.f7760b);
                                            } else if (c2230b2.m4009a(c2229a)) {
                                            }
                                        }
                                    }
                                    Object objM2809u = c1295gM2847h.m2809u();
                                    Object obj4 = EnumC2273a.f7953j;
                                    Object obj5 = objM2809u;
                                    if (objM2809u != obj4) {
                                        obj5 = obj2;
                                    }
                                    if (obj5 == obj4) {
                                        obj2 = obj5;
                                    }
                                } catch (Throwable th) {
                                    c1295gM2847h.m2797C();
                                    throw th;
                                }
                            } else if (atomicIntegerFieldUpdater2.compareAndSet(c2230b2, i11, i11 - 1)) {
                                atomicReferenceFieldUpdater.set(c2230b2, null);
                            }
                        }
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    c2230b = c2230b2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2230b = (C2230b) this.f2354p;
                    AbstractC0714c.m1516d0(obj);
                }
                try {
                    AtomicReference atomicReference = C0589l.f2355a;
                    String strM1335a = (String) atomicReference.get();
                    if (strM1335a == null) {
                        strM1335a = C0589l.m1335a();
                        if (strM1335a != null) {
                            atomicReference.set(strM1335a);
                        } else {
                            strM1335a = null;
                        }
                        if (strM1335a == null) {
                            strM1335a = "https://smarthomeapi.space";
                        }
                    }
                    c2230b.m4008c(null);
                    return strM1335a;
                } finally {
                    c2230b.m4008c(null);
                }
            default:
                C2777t c2777t = (C2777t) this.f2354p;
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i12 = this.f2353o;
                if (i12 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2768k c2768k = C2768k.f10237a;
                    String str2 = c2777t.f10306j;
                    this.f2353o = 1;
                    C2054e c2054e = AbstractC1290e0.f5316a;
                    obj = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2765h(str2, null, 0), this);
                    if (obj == enumC2273a) {
                        return enumC2273a;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                }
                byte[] bArrM3730n0 = (byte[]) obj;
                if (bArrM3730n0.length > 2 && bArrM3730n0[0] == 31 && bArrM3730n0[1] == -117) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrM3730n0));
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED, gZIPInputStream.available()));
                        byte[] bArr = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED];
                        for (int i13 = gZIPInputStream.read(bArr); i13 >= 0; i13 = gZIPInputStream.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, i13);
                        }
                        bArrM3730n0 = byteArrayOutputStream.toByteArray();
                        AbstractC2980h.m5135d("toByteArray(...)", bArrM3730n0);
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC2436a.m4330b(gZIPInputStream, th2);
                            throw th3;
                        }
                    }
                }
                C2779v c2779v = C2779v.f10315a;
                String str3 = c2777t.f10302f;
                if (bArrM3730n0.length >= 3 && bArrM3730n0[0] == -17 && bArrM3730n0[1] == -69 && bArrM3730n0[2] == -65) {
                    bArrM3730n0 = AbstractC1912g.m3730n0(bArrM3730n0, 3, bArrM3730n0.length);
                }
                byte[] bArr2 = bArrM3730n0;
                if (AbstractC1206h.m2630D0(str3)) {
                    charsetForName = null;
                    charset = AbstractC1199a.f5077a;
                    if (!AbstractC2980h.m5132a(charsetForName, charset) || charsetForName == null) {
                        str = new String(bArr2, charset);
                        i4 = 0;
                        while (true) {
                            if (i4 < str.length()) {
                                if (str.charAt(i4) == '\ufffd') {
                                    str = null;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        if (str != null) {
                            return str;
                        }
                    }
                    C2023c c2023cM1572w = AbstractC0715d.m1572w();
                    if (charsetForName != null) {
                        c2023cM1572w.add(charsetForName);
                    }
                    c2023cM1572w.add(AbstractC1199a.f5077a);
                    List<String> listM3753t0 = AbstractC1914i.m3753t0("windows-1256", "ISO-8859-6", "windows-1252", "ISO-8859-1");
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : listM3753t0) {
                        C2779v c2779v2 = C2779v.f10315a;
                        if (AbstractC1206h.m2630D0(str4)) {
                            charsetForName2 = null;
                            if (charsetForName2 == null) {
                                arrayList.add(charsetForName2);
                            }
                        } else {
                            charsetForName2 = Charset.forName(str4);
                            AbstractC2980h.m5135d("forName(...)", charsetForName2);
                            if (charsetForName2 == null) {
                            }
                        }
                    }
                    size = arrayList.size();
                    i8 = 0;
                    while (i8 < size) {
                        Object obj6 = arrayList.get(i8);
                        i8++;
                        c2023cM1572w.add((Charset) obj6);
                    }
                    C2023c c2023cM1563h = AbstractC0715d.m1563h(c2023cM1572w);
                    AbstractC2980h.m5136e("<this>", c2023cM1563h);
                    List listM3747L0 = AbstractC1913h.m3747L0(new LinkedHashSet(c2023cM1563h));
                    ArrayList arrayList2 = new ArrayList(AbstractC1915j.m3756w0(listM3747L0));
                    it = listM3747L0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new String(bArr2, (Charset) it.next()));
                    }
                    it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            String str5 = (String) next;
                            int i14 = 0;
                            for (int i15 = 0; i15 < str5.length(); i15++) {
                                if (str5.charAt(i15) == '\ufffd') {
                                    i14++;
                                }
                            }
                            do {
                                Object next2 = it2.next();
                                String str6 = (String) next2;
                                int i16 = 0;
                                for (int i17 = 0; i17 < str6.length(); i17++) {
                                    if (str6.charAt(i17) == '\ufffd') {
                                        i16++;
                                    }
                                }
                                if (i14 > i16) {
                                    next = next2;
                                    i14 = i16;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    String str7 = (String) next;
                    return str7 != null ? new String(bArr2, AbstractC1199a.f5077a) : str7;
                }
                charsetForName = Charset.forName(str3);
                AbstractC2980h.m5135d("forName(...)", charsetForName);
                charset = AbstractC1199a.f5077a;
                if (!AbstractC2980h.m5132a(charsetForName, charset)) {
                    str = new String(bArr2, charset);
                    i4 = 0;
                    while (true) {
                        if (i4 < str.length()) {
                        }
                        i4++;
                    }
                    if (str != null) {
                    }
                }
                C2023c c2023cM1572w2 = AbstractC0715d.m1572w();
                if (charsetForName != null) {
                }
                c2023cM1572w2.add(AbstractC1199a.f5077a);
                List<String> listM3753t02 = AbstractC1914i.m3753t0("windows-1256", "ISO-8859-6", "windows-1252", "ISO-8859-1");
                ArrayList arrayList3 = new ArrayList();
                while (r11.hasNext()) {
                }
                size = arrayList3.size();
                i8 = 0;
                while (i8 < size) {
                }
                C2023c c2023cM1563h2 = AbstractC0715d.m1563h(c2023cM1572w2);
                AbstractC2980h.m5136e("<this>", c2023cM1563h2);
                List listM3747L02 = AbstractC1913h.m3747L0(new LinkedHashSet(c2023cM1563h2));
                ArrayList arrayList22 = new ArrayList(AbstractC1915j.m3756w0(listM3747L02));
                it = listM3747L02.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList22.iterator();
                if (it2.hasNext()) {
                }
                String str72 = (String) next;
                if (str72 != null) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0588k(C2777t c2777t, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2354p = c2777t;
    }
}
