package p071i1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.InterfaceC0238s0;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p021c2.C0634d;
import p043e6.C0917e;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class C1222a implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C1222a> CREATOR = new C0634d(12);

    /* renamed from: j */
    public final String f5105j;

    /* renamed from: k */
    public final byte[] f5106k;

    /* renamed from: l */
    public final int f5107l;

    /* renamed from: m */
    public final int f5108m;

    public C1222a(String str, byte[] bArr, int i, int i4) {
        m2670b(bArr, str, i4);
        this.f5105j = str;
        this.f5106k = bArr;
        this.f5107l = i;
        this.f5108m = i4;
    }

    /* renamed from: b */
    public static void m2670b(byte[] bArr, String str, int i) {
        boolean z7;
        byte b7;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z7 = true;
                }
                AbstractC1101a.m2353d(z7);
                break;
            case "editable.tracks.samples.location":
                if (i == 75 && bArr.length == 1 && ((b7 = bArr[0]) == 0 || b7 == 1)) {
                    z7 = true;
                }
                AbstractC1101a.m2353d(z7);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z7 = true;
                }
                AbstractC1101a.m2353d(z7);
                break;
            case "editable.tracks.map":
                AbstractC1101a.m2353d(i == 0);
                break;
        }
    }

    /* renamed from: a */
    public final ArrayList m2671a() {
        AbstractC1101a.m2358i("Metadata is not an editable tracks map", this.f5105j.equals("editable.tracks.map"));
        byte[] bArr = this.f5106k;
        byte b7 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b7; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1222a.class == obj.getClass()) {
            C1222a c1222a = (C1222a) obj;
            if (this.f5105j.equals(c1222a.f5105j) && Arrays.equals(this.f5106k, c1222a.f5106k) && this.f5107l == c1222a.f5107l && this.f5108m == c1222a.f5108m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f5106k) + AbstractC0008a1.m9e(this.f5105j, 527, 31)) * 31) + this.f5107l) * 31) + this.f5108m;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String string;
        String str = this.f5105j;
        byte[] bArr = this.f5106k;
        int i = this.f5108m;
        if (i != 0) {
            if (i == 1) {
                string = AbstractC1118i0.m2459r(bArr);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(AbstractC0715d.m1574z(bArr)));
            } else if (i == 67) {
                string = String.valueOf(AbstractC0715d.m1574z(bArr));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                int i4 = AbstractC1118i0.f4750a;
                StringBuilder sb = new StringBuilder(bArr.length * 2);
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    sb.append(Character.forDigit((bArr[i8] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i8] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new C1132w(bArr).m2540z());
            }
        } else if (str.equals("editable.tracks.map")) {
            ArrayList arrayListM2671a = m2671a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            new C0917e(String.valueOf(',')).m2084a(sb2, arrayListM2671a.iterator());
            string = sb2.toString();
        }
        return "mdta: key=" + str + ", value=" + string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5105j);
        parcel.writeByteArray(this.f5106k);
        parcel.writeInt(this.f5107l);
        parcel.writeInt(this.f5108m);
    }

    public C1222a(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f5105j = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f5106k = bArrCreateByteArray;
        this.f5107l = parcel.readInt();
        int i4 = parcel.readInt();
        this.f5108m = i4;
        m2670b(bArrCreateByteArray, string, i4);
    }
}
