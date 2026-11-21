package p157s0;

import android.os.Parcel;
import android.os.Parcelable;
import p017b6.C0608i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s0.b */
/* loaded from: classes.dex */
public abstract class AbstractC2337b implements Parcelable {

    /* renamed from: j */
    public final Parcelable f8189j;

    /* renamed from: k */
    public static final C2336a f8188k = new C2336a();
    public static final Parcelable.Creator<AbstractC2337b> CREATOR = new C0608i0(4);

    public AbstractC2337b() {
        this.f8189j = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8189j, i);
    }

    public AbstractC2337b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8189j = parcelable == f8188k ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2337b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f8189j = parcelable == null ? f8188k : parcelable;
    }
}
