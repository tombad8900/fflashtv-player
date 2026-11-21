package p213z;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z.e */
/* loaded from: classes.dex */
public final class C2867e extends AbstractC2337b {
    public static final Parcelable.Creator<C2867e> CREATOR = new C0608i0(6);

    /* renamed from: l */
    public SparseArray f10587l;

    public C2867e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f10587l = new SparseArray(i);
        for (int i4 = 0; i4 < i; i4++) {
            this.f10587l.append(iArr[i4], parcelableArray[i4]);
        }
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f10587l;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f10587l.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f10587l.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
