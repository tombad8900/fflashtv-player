package p021c2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import p000a.C0002c;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c2.b */
/* loaded from: classes.dex */
public final class C0632b implements Parcelable {
    public static final Parcelable.Creator<C0632b> CREATOR = new C0002c(29);

    /* renamed from: j */
    public final long f2518j;

    /* renamed from: k */
    public final long f2519k;

    /* renamed from: l */
    public final int f2520l;

    public C0632b(int i, long j, long j8) {
        AbstractC1101a.m2353d(j < j8);
        this.f2518j = j;
        this.f2519k = j8;
        this.f2520l = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0632b.class == obj.getClass()) {
            C0632b c0632b = (C0632b) obj;
            if (this.f2518j == c0632b.f2518j && this.f2519k == c0632b.f2519k && this.f2520l == c0632b.f2520l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2518j), Long.valueOf(this.f2519k), Integer.valueOf(this.f2520l)});
    }

    public final String toString() {
        int i = AbstractC1118i0.f4750a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f2518j + ", endTimeMs=" + this.f2519k + ", speedDivisor=" + this.f2520l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2518j);
        parcel.writeLong(this.f2519k);
        parcel.writeInt(this.f2520l);
    }
}
