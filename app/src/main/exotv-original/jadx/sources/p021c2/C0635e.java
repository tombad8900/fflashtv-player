package p021c2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.InterfaceC0238s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c2.e */
/* loaded from: classes.dex */
public final class C0635e implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C0635e> CREATOR = new C0634d(0);

    /* renamed from: j */
    public final float f2523j;

    /* renamed from: k */
    public final int f2524k;

    public C0635e(int i, float f8) {
        this.f2523j = f8;
        this.f2524k = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0635e.class == obj.getClass()) {
            C0635e c0635e = (C0635e) obj;
            if (this.f2523j == c0635e.f2523j && this.f2524k == c0635e.f2524k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f2523j).hashCode() + 527) * 31) + this.f2524k;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f2523j + ", svcTemporalLayerCount=" + this.f2524k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f2523j);
        parcel.writeInt(this.f2524k);
    }

    public C0635e(Parcel parcel) {
        this.f2523j = parcel.readFloat();
        this.f2524k = parcel.readInt();
    }
}
