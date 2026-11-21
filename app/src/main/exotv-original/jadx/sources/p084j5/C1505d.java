package p084j5;

import android.os.Parcel;
import android.os.Parcelable;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j5.d */
/* loaded from: classes.dex */
public final class C1505d extends AbstractC2337b {
    public static final Parcelable.Creator<C1505d> CREATOR = new C0608i0(2);

    /* renamed from: l */
    public boolean f5774l;

    public C1505d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1505d.class.getClassLoader();
        }
        this.f5774l = parcel.readInt() == 1;
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5774l ? 1 : 0);
    }
}
