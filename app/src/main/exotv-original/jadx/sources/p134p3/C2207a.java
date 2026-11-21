package p134p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p021c2.C0634d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p3.a */
/* loaded from: classes.dex */
public final class C2207a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C2207a> CREATOR = new C0634d(17);

    /* renamed from: j */
    public final String f7719j;

    /* renamed from: k */
    public final Map f7720k;

    public C2207a(String str, Map map) {
        this.f7719j = str;
        this.f7720k = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2207a)) {
            return false;
        }
        C2207a c2207a = (C2207a) obj;
        return AbstractC2980h.m5132a(this.f7719j, c2207a.f7719j) && AbstractC2980h.m5132a(this.f7720k, c2207a.f7720k);
    }

    public final int hashCode() {
        return this.f7720k.hashCode() + (this.f7719j.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f7719j + ", extras=" + this.f7720k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7719j);
        Map map = this.f7720k;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
