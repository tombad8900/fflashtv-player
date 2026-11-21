package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.m */
/* loaded from: classes.dex */
public final class C0561m extends AbstractC0558j {
    public static final Parcelable.Creator<C0561m> CREATOR = new C0002c(23);

    /* renamed from: k */
    public final int f2258k;

    /* renamed from: l */
    public final int f2259l;

    /* renamed from: m */
    public final int f2260m;

    /* renamed from: n */
    public final int[] f2261n;

    /* renamed from: o */
    public final int[] f2262o;

    public C0561m(int i, int i4, int i8, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f2258k = i;
        this.f2259l = i4;
        this.f2260m = i8;
        this.f2261n = iArr;
        this.f2262o = iArr2;
    }

    @Override // p013b2.AbstractC0558j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0561m.class == obj.getClass()) {
            C0561m c0561m = (C0561m) obj;
            if (this.f2258k == c0561m.f2258k && this.f2259l == c0561m.f2259l && this.f2260m == c0561m.f2260m && Arrays.equals(this.f2261n, c0561m.f2261n) && Arrays.equals(this.f2262o, c0561m.f2262o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2262o) + ((Arrays.hashCode(this.f2261n) + ((((((527 + this.f2258k) * 31) + this.f2259l) * 31) + this.f2260m) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2258k);
        parcel.writeInt(this.f2259l);
        parcel.writeInt(this.f2260m);
        parcel.writeIntArray(this.f2261n);
        parcel.writeIntArray(this.f2262o);
    }

    public C0561m(Parcel parcel) {
        super("MLLT");
        this.f2258k = parcel.readInt();
        this.f2259l = parcel.readInt();
        this.f2260m = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = AbstractC1118i0.f4750a;
        this.f2261n = iArrCreateIntArray;
        this.f2262o = parcel.createIntArray();
    }
}
