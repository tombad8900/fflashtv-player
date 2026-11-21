package p201x1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.InterfaceC0238s0;
import p002a1.AbstractC0008a1;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x1.a */
/* loaded from: classes.dex */
public final class C2743a implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C2743a> CREATOR = new C0634d(19);

    /* renamed from: j */
    public final int f10120j;

    /* renamed from: k */
    public final String f10121k;

    public C2743a(int i, String str) {
        this.f10120j = i;
        this.f10121k = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f10120j);
        sb.append(",url=");
        return AbstractC0008a1.m18n(sb, this.f10121k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10121k);
        parcel.writeInt(this.f10120j);
    }
}
