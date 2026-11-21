package p216z2;

import android.os.Parcel;
import android.os.Parcelable;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.q */
/* loaded from: classes.dex */
public final class C2909q implements Parcelable {
    public static final Parcelable.Creator<C2909q> CREATOR = new C0634d(23);

    /* renamed from: j */
    public int f10800j;

    /* renamed from: k */
    public int f10801k;

    /* renamed from: l */
    public boolean f10802l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10800j);
        parcel.writeInt(this.f10801k);
        parcel.writeInt(this.f10802l ? 1 : 0);
    }
}
