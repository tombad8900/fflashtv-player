package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0119a(3);

    /* renamed from: j */
    public int f587j;

    /* renamed from: k */
    public int f588k;

    /* renamed from: l */
    public int f589l;

    /* renamed from: m */
    public int f590m;

    /* renamed from: n */
    public int f591n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f587j);
        parcel.writeInt(this.f589l);
        parcel.writeInt(this.f590m);
        parcel.writeInt(this.f591n);
        parcel.writeInt(this.f588k);
    }
}
