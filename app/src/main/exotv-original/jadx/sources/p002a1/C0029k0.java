package p002a1;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.k0 */
/* loaded from: classes.dex */
public final class C0029k0 implements Parcelable {
    public static final Parcelable.Creator<C0029k0> CREATOR = new C0002c(3);

    /* renamed from: j */
    public String f91j;

    /* renamed from: k */
    public int f92k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f91j);
        parcel.writeInt(this.f92k);
    }
}
