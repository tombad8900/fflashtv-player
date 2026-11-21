package p028d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p021c2.C0634d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d.a */
/* loaded from: classes.dex */
public final class C0783a implements Parcelable {
    public static final Parcelable.Creator<C0783a> CREATOR = new C0634d(4);

    /* renamed from: j */
    public final int f3533j;

    /* renamed from: k */
    public final Intent f3534k;

    public C0783a(Intent intent, int i) {
        this.f3533j = i;
        this.f3534k = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f3533j;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f3534k);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC2980h.m5136e("dest", parcel);
        parcel.writeInt(this.f3533j);
        Intent intent = this.f3534k;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
