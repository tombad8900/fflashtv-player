package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0002c(11);

    /* renamed from: j */
    public final int f580j;

    /* renamed from: k */
    public final float f581k;

    public RatingCompat(int i, float f8) {
        this.f580j = i;
        this.f581k = f8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f580j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f580j);
        sb.append(" rating=");
        float f8 = this.f581k;
        sb.append(f8 < 0.0f ? "unrated" : String.valueOf(f8));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f580j);
        parcel.writeFloat(this.f581k);
    }
}
