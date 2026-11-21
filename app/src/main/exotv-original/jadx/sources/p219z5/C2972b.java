package p219z5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z5.b */
/* loaded from: classes.dex */
public final class C2972b extends AbstractC2337b {
    public static final Parcelable.Creator<C2972b> CREATOR = new C0608i0(8);

    /* renamed from: l */
    public final int f11098l;

    public C2972b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11098l = parcel.readInt();
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f11098l);
    }

    public C2972b(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f11098l = sideSheetBehavior.f3384h;
    }
}
