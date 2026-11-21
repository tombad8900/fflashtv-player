package p140q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q0.g */
/* loaded from: classes.dex */
public final class C2247g extends View.BaseSavedState {
    public static final Parcelable.Creator<C2247g> CREATOR = new C0634d(18);

    /* renamed from: j */
    public int f7798j;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f7798j + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f7798j);
    }
}
