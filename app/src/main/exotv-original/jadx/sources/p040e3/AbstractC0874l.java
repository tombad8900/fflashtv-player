package p040e3;

import com.bumptech.glide.AbstractC0714c;
import p037e0.C0853d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.l */
/* loaded from: classes.dex */
public abstract class AbstractC0874l extends AbstractC0873k {

    /* renamed from: a */
    public C0853d[] f3841a;

    /* renamed from: b */
    public String f3842b;

    /* renamed from: c */
    public int f3843c;

    public AbstractC0874l() {
        this.f3841a = null;
        this.f3843c = 0;
    }

    public C0853d[] getPathData() {
        return this.f3841a;
    }

    public String getPathName() {
        return this.f3842b;
    }

    public void setPathData(C0853d[] c0853dArr) {
        C0853d[] c0853dArr2 = this.f3841a;
        boolean z7 = false;
        if (c0853dArr2 != null && c0853dArr != null && c0853dArr2.length == c0853dArr.length) {
            int i = 0;
            while (true) {
                if (i >= c0853dArr2.length) {
                    z7 = true;
                    break;
                }
                C0853d c0853d = c0853dArr2[i];
                char c8 = c0853d.f3774a;
                C0853d c0853d2 = c0853dArr[i];
                if (c8 != c0853d2.f3774a || c0853d.f3775b.length != c0853d2.f3775b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z7) {
            this.f3841a = AbstractC0714c.m1489B(c0853dArr);
            return;
        }
        C0853d[] c0853dArr3 = this.f3841a;
        for (int i4 = 0; i4 < c0853dArr.length; i4++) {
            c0853dArr3[i4].f3774a = c0853dArr[i4].f3774a;
            int i8 = 0;
            while (true) {
                float[] fArr = c0853dArr[i4].f3775b;
                if (i8 < fArr.length) {
                    c0853dArr3[i4].f3775b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    public AbstractC0874l(AbstractC0874l abstractC0874l) {
        this.f3841a = null;
        this.f3843c = 0;
        this.f3842b = abstractC0874l.f3842b;
        this.f3841a = AbstractC0714c.m1489B(abstractC0874l.f3841a);
    }
}
