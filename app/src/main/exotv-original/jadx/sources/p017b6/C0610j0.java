package p017b6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p157s0.AbstractC2337b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.j0 */
/* loaded from: classes.dex */
public final class C0610j0 extends AbstractC2337b {
    public static final Parcelable.Creator<C0610j0> CREATOR = new C0608i0(0);

    /* renamed from: l */
    public CharSequence f2413l;

    /* renamed from: m */
    public boolean f2414m;

    public C0610j0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2413l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2414m = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2413l) + "}";
    }

    @Override // p157s0.AbstractC2337b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f2413l, parcel, i);
        parcel.writeInt(this.f2414m ? 1 : 0);
    }
}
