package p071i1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.common.InterfaceC0238s0;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.f */
/* loaded from: classes.dex */
public final class C1227f implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C1227f> CREATOR = new C0634d(14);

    /* renamed from: j */
    public final long f5117j;

    /* renamed from: k */
    public final long f5118k;

    /* renamed from: l */
    public final long f5119l;

    public C1227f(long j, long j8, long j9) {
        this.f5117j = j;
        this.f5118k = j8;
        this.f5119l = j9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227f)) {
            return false;
        }
        C1227f c1227f = (C1227f) obj;
        return this.f5117j == c1227f.f5117j && this.f5118k == c1227f.f5118k && this.f5119l == c1227f.f5119l;
    }

    public final int hashCode() {
        return AbstractC0120b.m428x(this.f5119l) + ((AbstractC0120b.m428x(this.f5118k) + ((AbstractC0120b.m428x(this.f5117j) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f5117j + ", modification time=" + this.f5118k + ", timescale=" + this.f5119l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5117j);
        parcel.writeLong(this.f5118k);
        parcel.writeLong(this.f5119l);
    }

    public C1227f(Parcel parcel) {
        this.f5117j = parcel.readLong();
        this.f5118k = parcel.readLong();
        this.f5119l = parcel.readLong();
    }
}
