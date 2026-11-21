package p216z2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.c1 */
/* loaded from: classes.dex */
public final class C2880c1 implements Parcelable {
    public static final Parcelable.Creator<C2880c1> CREATOR = new C0634d(24);

    /* renamed from: j */
    public int f10628j;

    /* renamed from: k */
    public int f10629k;

    /* renamed from: l */
    public int[] f10630l;

    /* renamed from: m */
    public boolean f10631m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f10628j + ", mGapDir=" + this.f10629k + ", mHasUnwantedGapAfter=" + this.f10631m + ", mGapPerSpan=" + Arrays.toString(this.f10630l) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10628j);
        parcel.writeInt(this.f10629k);
        parcel.writeInt(this.f10631m ? 1 : 0);
        int[] iArr = this.f10630l;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f10630l);
        }
    }
}
