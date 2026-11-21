package p123o2;

import android.text.TextUtils;
import com.bumptech.glide.AbstractC0714c;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o2.a */
/* loaded from: classes.dex */
public final class C2042a {

    /* renamed from: a */
    public int f7527a;

    /* renamed from: b */
    public int f7528b;

    /* renamed from: c */
    public int f7529c;

    /* renamed from: d */
    public int f7530d;

    /* renamed from: e */
    public int f7531e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2042a m3931b(String str) {
        AbstractC1101a.m2353d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i4 = -1;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strM1517e0 = AbstractC0714c.m1517e0(strArrSplit[i10].trim());
            strM1517e0.getClass();
            switch (strM1517e0) {
                case "end":
                    i4 = i10;
                    break;
                case "text":
                    i8 = i10;
                    break;
                case "start":
                    i = i10;
                    break;
                case "style":
                    i9 = i10;
                    break;
            }
        }
        if (i == -1 || i4 == -1 || i8 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        C2042a c2042a = new C2042a();
        c2042a.f7527a = i;
        c2042a.f7528b = i4;
        c2042a.f7529c = i9;
        c2042a.f7530d = i8;
        c2042a.f7531e = length;
        return c2042a;
    }

    /* renamed from: a */
    public boolean m3932a() {
        int i = this.f7527a;
        int i4 = 2;
        if ((i & 7) != 0) {
            int i8 = this.f7530d;
            int i9 = this.f7528b;
            if (((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i10 = this.f7530d;
            int i11 = this.f7529c;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i12 = this.f7531e;
            int i13 = this.f7528b;
            if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i14 = this.f7531e;
            int i15 = this.f7529c;
            if (i14 > i15) {
                i4 = 1;
            } else if (i14 != i15) {
                i4 = 4;
            }
            if ((i & (i4 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
