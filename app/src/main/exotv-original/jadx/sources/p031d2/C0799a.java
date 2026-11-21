package p031d2;

import android.os.Parcel;
import android.os.Parcelable;
import p021c2.C0634d;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.a */
/* loaded from: classes.dex */
public final class C0799a extends AbstractC0800b {
    public static final Parcelable.Creator<C0799a> CREATOR = new C0634d(5);

    /* renamed from: j */
    public final long f3583j;

    /* renamed from: k */
    public final long f3584k;

    /* renamed from: l */
    public final byte[] f3585l;

    public C0799a(long j, byte[] bArr, long j8) {
        this.f3583j = j8;
        this.f3584k = j;
        this.f3585l = bArr;
    }

    @Override // p031d2.AbstractC0800b
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f3583j + ", identifier= " + this.f3584k + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3583j);
        parcel.writeLong(this.f3584k);
        parcel.writeByteArray(this.f3585l);
    }

    public C0799a(Parcel parcel) {
        this.f3583j = parcel.readLong();
        this.f3584k = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = AbstractC1118i0.f4750a;
        this.f3585l = bArrCreateByteArray;
    }
}
