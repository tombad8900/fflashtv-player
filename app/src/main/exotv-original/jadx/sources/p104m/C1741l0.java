package p104m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.l0 */
/* loaded from: classes.dex */
public final class C1741l0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C1741l0> CREATOR = new C0634d(16);

    /* renamed from: j */
    public boolean f6616j;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f6616j ? (byte) 1 : (byte) 0);
    }
}
