package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.j1 */
/* loaded from: classes.dex */
public final class C0212j1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0212j1> CREATOR = new C0002c(15);

    /* renamed from: m */
    public static final String f1156m;

    /* renamed from: n */
    public static final String f1157n;

    /* renamed from: o */
    public static final String f1158o;

    /* renamed from: j */
    public final int f1159j;

    /* renamed from: k */
    public final int f1160k;

    /* renamed from: l */
    public final int f1161l;

    static {
        int i = AbstractC1118i0.f4750a;
        f1156m = Integer.toString(0, 36);
        f1157n = Integer.toString(1, 36);
        f1158o = Integer.toString(2, 36);
    }

    public C0212j1(int i, int i4, int i8) {
        this.f1159j = i;
        this.f1160k = i4;
        this.f1161l = i8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0212j1 c0212j1 = (C0212j1) obj;
        int i = this.f1159j - c0212j1.f1159j;
        if (i != 0) {
            return i;
        }
        int i4 = this.f1160k - c0212j1.f1160k;
        return i4 == 0 ? this.f1161l - c0212j1.f1161l : i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0212j1.class == obj.getClass()) {
            C0212j1 c0212j1 = (C0212j1) obj;
            if (this.f1159j == c0212j1.f1159j && this.f1160k == c0212j1.f1160k && this.f1161l == c0212j1.f1161l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1159j * 31) + this.f1160k) * 31) + this.f1161l;
    }

    public final String toString() {
        return this.f1159j + "." + this.f1160k + "." + this.f1161l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1159j);
        parcel.writeInt(this.f1160k);
        parcel.writeInt(this.f1161l);
    }

    public C0212j1(Parcel parcel) {
        this.f1159j = parcel.readInt();
        this.f1160k = parcel.readInt();
        this.f1161l = parcel.readInt();
    }
}
