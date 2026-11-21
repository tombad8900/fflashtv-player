package p216z2;

import android.os.Parcel;
import android.os.Parcelable;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.o0 */
/* loaded from: classes.dex */
public final class C2906o0 extends AbstractC2337b {
    public static final Parcelable.Creator<C2906o0> CREATOR = new C0608i0(7);

    /* renamed from: l */
    public Parcelable f10780l;

    public C2906o0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10780l = parcel.readParcelable(classLoader == null ? AbstractC2888f0.class.getClassLoader() : classLoader);
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f10780l, 0);
    }
}
