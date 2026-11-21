package p104m;

import android.os.Parcel;
import android.os.Parcelable;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.j2 */
/* loaded from: classes.dex */
public final class C1735j2 extends AbstractC2337b {
    public static final Parcelable.Creator<C1735j2> CREATOR = new C0608i0(3);

    /* renamed from: l */
    public int f6582l;

    /* renamed from: m */
    public boolean f6583m;

    public C1735j2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6582l = parcel.readInt();
        this.f6583m = parcel.readInt() != 0;
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6582l);
        parcel.writeInt(this.f6583m ? 1 : 0);
    }
}
