package p143q3;

import android.graphics.Bitmap;
import android.support.v4.media.session.AbstractC0120b;
import java.io.EOFException;
import okhttp3.C2070d0;
import okhttp3.C2071e;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import p069h7.AbstractC1206h;
import p102l6.EnumC1686c;
import p185v3.AbstractC2536f;
import p189v7.C2562d0;
import p189v7.C2564e0;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q3.b */
/* loaded from: classes.dex */
public final class C2260b {

    /* renamed from: a */
    public final Object f7872a;

    /* renamed from: b */
    public final Object f7873b;

    /* renamed from: c */
    public final long f7874c;

    /* renamed from: d */
    public final long f7875d;

    /* renamed from: e */
    public final boolean f7876e;

    /* renamed from: f */
    public final C2180y f7877f;

    public C2260b(C2564e0 c2564e0) throws NumberFormatException, EOFException {
        EnumC1686c[] enumC1686cArr = EnumC1686c.f6485j;
        final int i = 0;
        this.f7872a = AbstractC0120b.m430z(new InterfaceC2840a(this) { // from class: q3.a

            /* renamed from: k */
            public final /* synthetic */ C2260b f7871k;

            {
                this.f7871k = this;
            }

            @Override // p212y6.InterfaceC2840a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return C2071e.Companion.parse(this.f7871k.f7877f);
                    default:
                        String str = this.f7871k.f7877f.get("Content-Type");
                        if (str != null) {
                            return C2070d0.Companion.parse(str);
                        }
                        return null;
                }
            }
        });
        final char c8 = 1 == true ? 1 : 0;
        this.f7873b = AbstractC0120b.m430z(new InterfaceC2840a(this) { // from class: q3.a

            /* renamed from: k */
            public final /* synthetic */ C2260b f7871k;

            {
                this.f7871k = this;
            }

            @Override // p212y6.InterfaceC2840a
            public final Object invoke() {
                switch (c8) {
                    case 0:
                        return C2071e.Companion.parse(this.f7871k.f7877f);
                    default:
                        String str = this.f7871k.f7877f.get("Content-Type");
                        if (str != null) {
                            return C2070d0.Companion.parse(str);
                        }
                        return null;
                }
            }
        });
        this.f7874c = Long.parseLong(c2564e0.mo4617n(Long.MAX_VALUE));
        this.f7875d = Long.parseLong(c2564e0.mo4617n(Long.MAX_VALUE));
        this.f7876e = Integer.parseInt(c2564e0.mo4617n(Long.MAX_VALUE)) > 0;
        int i4 = Integer.parseInt(c2564e0.mo4617n(Long.MAX_VALUE));
        C2180y.a aVar = new C2180y.a();
        for (int i8 = 0; i8 < i4; i8++) {
            String strMo4617n = c2564e0.mo4617n(Long.MAX_VALUE);
            Bitmap.Config[] configArr = AbstractC2536f.f9216a;
            int iM2627A0 = AbstractC1206h.m2627A0(strMo4617n, ':', 0, 6);
            if (iM2627A0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strMo4617n).toString());
            }
            String strSubstring = strMo4617n.substring(0, iM2627A0);
            AbstractC2980h.m5135d("substring(...)", strSubstring);
            String string = AbstractC1206h.m2645S0(strSubstring).toString();
            String strSubstring2 = strMo4617n.substring(iM2627A0 + 1);
            AbstractC2980h.m5135d("substring(...)", strSubstring2);
            aVar.addUnsafeNonAscii(string, strSubstring2);
        }
        this.f7877f = aVar.build();
    }

    /* renamed from: a */
    public final void m4048a(C2562d0 c2562d0) {
        c2562d0.mo4603z(this.f7874c);
        c2562d0.writeByte(10);
        c2562d0.mo4603z(this.f7875d);
        c2562d0.writeByte(10);
        c2562d0.mo4603z(this.f7876e ? 1L : 0L);
        c2562d0.writeByte(10);
        C2180y c2180y = this.f7877f;
        c2562d0.mo4603z(c2180y.size());
        c2562d0.writeByte(10);
        int size = c2180y.size();
        for (int i = 0; i < size; i++) {
            c2562d0.mo4600o(c2180y.name(i));
            c2562d0.mo4600o(": ");
            c2562d0.mo4600o(c2180y.value(i));
            c2562d0.writeByte(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2260b(C2080i0 c2080i0) {
        EnumC1686c[] enumC1686cArr = EnumC1686c.f6485j;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f7872a = AbstractC0120b.m430z(new InterfaceC2840a(this) { // from class: q3.a

            /* renamed from: k */
            public final /* synthetic */ C2260b f7871k;

            {
                this.f7871k = this;
            }

            @Override // p212y6.InterfaceC2840a
            public final Object invoke() {
                switch (objArr) {
                    case 0:
                        return C2071e.Companion.parse(this.f7871k.f7877f);
                    default:
                        String str = this.f7871k.f7877f.get("Content-Type");
                        if (str != null) {
                            return C2070d0.Companion.parse(str);
                        }
                        return null;
                }
            }
        });
        final int i = 1;
        this.f7873b = AbstractC0120b.m430z(new InterfaceC2840a(this) { // from class: q3.a

            /* renamed from: k */
            public final /* synthetic */ C2260b f7871k;

            {
                this.f7871k = this;
            }

            @Override // p212y6.InterfaceC2840a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return C2071e.Companion.parse(this.f7871k.f7877f);
                    default:
                        String str = this.f7871k.f7877f.get("Content-Type");
                        if (str != null) {
                            return C2070d0.Companion.parse(str);
                        }
                        return null;
                }
            }
        });
        this.f7874c = c2080i0.sentRequestAtMillis();
        this.f7875d = c2080i0.receivedResponseAtMillis();
        this.f7876e = c2080i0.handshake() != null;
        this.f7877f = c2080i0.headers();
    }
}
