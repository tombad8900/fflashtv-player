package p115n1;

import androidx.media3.common.C0247v0;
import java.util.ArrayList;
import p063h1.AbstractC1105c;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p071i1.C1236o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.d */
/* loaded from: classes.dex */
public final class C1969d {

    /* renamed from: a */
    public final ArrayList f7298a;

    /* renamed from: b */
    public final int f7299b;

    /* renamed from: c */
    public final int f7300c;

    /* renamed from: d */
    public final int f7301d;

    /* renamed from: e */
    public final int f7302e;

    /* renamed from: f */
    public final int f7303f;

    /* renamed from: g */
    public final int f7304g;

    /* renamed from: h */
    public final int f7305h;

    /* renamed from: i */
    public final int f7306i;

    /* renamed from: j */
    public final int f7307j;

    /* renamed from: k */
    public final float f7308k;

    /* renamed from: l */
    public final String f7309l;

    public C1969d(ArrayList arrayList, int i, int i4, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8, String str) {
        this.f7298a = arrayList;
        this.f7299b = i;
        this.f7300c = i4;
        this.f7301d = i8;
        this.f7302e = i9;
        this.f7303f = i10;
        this.f7304g = i11;
        this.f7305h = i12;
        this.f7306i = i13;
        this.f7307j = i14;
        this.f7308k = f8;
        this.f7309l = str;
    }

    /* renamed from: a */
    public static C1969d m3849a(C1132w c1132w) throws C0247v0 {
        String str;
        int i;
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        try {
            c1132w.m2514H(4);
            int iM2535u = (c1132w.m2535u() & 3) + 1;
            if (iM2535u == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2535u2 = c1132w.m2535u() & 31;
            for (int i14 = 0; i14 < iM2535u2; i14++) {
                int iM2507A = c1132w.m2507A();
                int i15 = c1132w.f4800b;
                c1132w.m2514H(iM2507A);
                byte[] bArr = c1132w.f4799a;
                byte[] bArr2 = new byte[iM2507A + 4];
                System.arraycopy(AbstractC1105c.f4716a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i15, bArr2, 4, iM2507A);
                arrayList.add(bArr2);
            }
            int iM2535u3 = c1132w.m2535u();
            for (int i16 = 0; i16 < iM2535u3; i16++) {
                int iM2507A2 = c1132w.m2507A();
                int i17 = c1132w.f4800b;
                c1132w.m2514H(iM2507A2);
                byte[] bArr3 = c1132w.f4799a;
                byte[] bArr4 = new byte[iM2507A2 + 4];
                System.arraycopy(AbstractC1105c.f4716a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i17, bArr4, 4, iM2507A2);
                arrayList.add(bArr4);
            }
            if (iM2535u2 > 0) {
                C1236o c1236oM2688i = AbstractC1237p.m2688i((byte[]) arrayList.get(0), iM2535u, ((byte[]) arrayList.get(0)).length);
                int i18 = c1236oM2688i.f5155e;
                int i19 = c1236oM2688i.f5156f;
                int i20 = c1236oM2688i.f5158h + 8;
                int i21 = c1236oM2688i.f5159i + 8;
                int i22 = c1236oM2688i.f5166p;
                int i23 = c1236oM2688i.f5167q;
                int i24 = c1236oM2688i.f5168r;
                int i25 = c1236oM2688i.f5169s;
                float f9 = c1236oM2688i.f5157g;
                int i26 = c1236oM2688i.f5151a;
                int i27 = c1236oM2688i.f5152b;
                int i28 = c1236oM2688i.f5153c;
                byte[] bArr5 = AbstractC1105c.f4716a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i28));
                i9 = i23;
                i10 = i24;
                i11 = i25;
                f8 = f9;
                i4 = i19;
                i8 = i20;
                i12 = i21;
                i13 = i22;
                i = i18;
            } else {
                str = null;
                i = -1;
                i4 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = 16;
                f8 = 1.0f;
                i12 = -1;
                i13 = -1;
            }
            return new C1969d(arrayList, iM2535u, i, i4, i8, i12, i13, i9, i10, i11, f8, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C0247v0.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
