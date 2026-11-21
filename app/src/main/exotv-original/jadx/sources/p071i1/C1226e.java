package p071i1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.InterfaceC0238s0;
import p021c2.C0634d;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.e */
/* loaded from: classes.dex */
public final class C1226e implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C1226e> CREATOR = new C0634d(13);

    /* renamed from: j */
    public final float f5115j;

    /* renamed from: k */
    public final float f5116k;

    public C1226e(float f8, float f9) {
        AbstractC1101a.m2352c("Invalid latitude or longitude", f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f);
        this.f5115j = f8;
        this.f5116k = f9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1226e.class == obj.getClass()) {
            C1226e c1226e = (C1226e) obj;
            if (this.f5115j == c1226e.f5115j && this.f5116k == c1226e.f5116k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f5116k).hashCode() + ((Float.valueOf(this.f5115j).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f5115j + ", longitude=" + this.f5116k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f5115j);
        parcel.writeFloat(this.f5116k);
    }

    public C1226e(Parcel parcel) {
        this.f5115j = parcel.readFloat();
        this.f5116k = parcel.readFloat();
    }
}
