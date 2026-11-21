package p002a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.c */
/* loaded from: classes.dex */
public final class C0012c implements Parcelable {
    public static final Parcelable.Creator<C0012c> CREATOR = new C0002c(2);

    /* renamed from: j */
    public final ArrayList f50j;

    /* renamed from: k */
    public final ArrayList f51k;

    public C0012c(Parcel parcel) {
        this.f50j = parcel.createStringArrayList();
        this.f51k = parcel.createTypedArrayList(C0009b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f50j);
        parcel.writeTypedList(this.f51k);
    }
}
