package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0232q0;
import androidx.media3.common.InterfaceC0238s0;
import java.util.Arrays;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a2.c */
/* loaded from: classes.dex */
public final class C0062c implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C0062c> CREATOR = new C0002c(7);

    /* renamed from: j */
    public final byte[] f299j;

    /* renamed from: k */
    public final String f300k;

    /* renamed from: l */
    public final String f301l;

    public C0062c(byte[] bArr, String str, String str2) {
        this.f299j = bArr;
        this.f300k = str;
        this.f301l = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0062c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f299j, ((C0062c) obj).f299j);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f299j);
    }

    @Override // androidx.media3.common.InterfaceC0238s0
    public final void populateMediaMetadata(C0232q0 c0232q0) {
        String str = this.f300k;
        if (str != null) {
            c0232q0.f1291a = str;
        }
    }

    public final String toString() {
        return "ICY: title=\"" + this.f300k + "\", url=\"" + this.f301l + "\", rawMetadata.length=\"" + this.f299j.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f299j);
        parcel.writeString(this.f300k);
        parcel.writeString(this.f301l);
    }

    public C0062c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f299j = bArrCreateByteArray;
        this.f300k = parcel.readString();
        this.f301l = parcel.readString();
    }
}
