package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.f */
/* loaded from: classes.dex */
public final class C0554f extends AbstractC0558j {
    public static final Parcelable.Creator<C0554f> CREATOR = new C0002c(21);

    /* renamed from: k */
    public final String f2244k;

    /* renamed from: l */
    public final String f2245l;

    /* renamed from: m */
    public final String f2246m;

    /* renamed from: n */
    public final byte[] f2247n;

    public C0554f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f2244k = str;
        this.f2245l = str2;
        this.f2246m = str3;
        this.f2247n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0554f.class == obj.getClass()) {
            C0554f c0554f = (C0554f) obj;
            String str = c0554f.f2244k;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f2244k, str) && Objects.equals(this.f2245l, c0554f.f2245l) && Objects.equals(this.f2246m, c0554f.f2246m) && Arrays.equals(this.f2247n, c0554f.f2247n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2244k;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2245l;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2246m;
        return Arrays.hashCode(this.f2247n) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": mimeType=" + this.f2244k + ", filename=" + this.f2245l + ", description=" + this.f2246m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2244k);
        parcel.writeString(this.f2245l);
        parcel.writeString(this.f2246m);
        parcel.writeByteArray(this.f2247n);
    }

    public C0554f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2244k = string;
        this.f2245l = parcel.readString();
        this.f2246m = parcel.readString();
        this.f2247n = parcel.createByteArray();
    }
}
