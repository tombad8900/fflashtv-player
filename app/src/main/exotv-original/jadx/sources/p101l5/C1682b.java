package p101l5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p002a1.AbstractC0008a1;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l5.b */
/* loaded from: classes.dex */
public final class C1682b extends View.BaseSavedState {
    public static final Parcelable.Creator<C1682b> CREATOR = new C0634d(15);

    /* renamed from: j */
    public int f6460j;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f6460j;
        return AbstractC0008a1.m18n(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f6460j));
    }
}
