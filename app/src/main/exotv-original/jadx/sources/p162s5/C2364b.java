package p162s5;

import android.os.Parcel;
import android.os.Parcelable;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s5.b */
/* loaded from: classes.dex */
public final class C2364b extends AbstractC2337b {
    public static final Parcelable.Creator<C2364b> CREATOR = new C0608i0(5);

    /* renamed from: l */
    public boolean f8280l;

    public C2364b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8280l = parcel.readInt() == 1;
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8280l ? 1 : 0);
    }
}
