package p074i5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p017b6.C0608i0;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i5.c */
/* loaded from: classes.dex */
public final class C1271c extends AbstractC2337b {
    public static final Parcelable.Creator<C1271c> CREATOR = new C0608i0(1);

    /* renamed from: l */
    public final int f5284l;

    /* renamed from: m */
    public final int f5285m;

    /* renamed from: n */
    public final boolean f5286n;

    /* renamed from: o */
    public final boolean f5287o;

    /* renamed from: p */
    public final boolean f5288p;

    public C1271c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5284l = parcel.readInt();
        this.f5285m = parcel.readInt();
        this.f5286n = parcel.readInt() == 1;
        this.f5287o = parcel.readInt() == 1;
        this.f5288p = parcel.readInt() == 1;
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5284l);
        parcel.writeInt(this.f5285m);
        parcel.writeInt(this.f5286n ? 1 : 0);
        parcel.writeInt(this.f5287o ? 1 : 0);
        parcel.writeInt(this.f5288p ? 1 : 0);
    }

    public C1271c(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f5284l = bottomSheetBehavior.f3105P;
        this.f5285m = bottomSheetBehavior.f3126f;
        this.f5286n = bottomSheetBehavior.f3118b;
        this.f5287o = bottomSheetBehavior.f3099J;
        this.f5288p = bottomSheetBehavior.f3100K;
    }
}
