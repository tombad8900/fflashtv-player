package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.e */
/* loaded from: classes.dex */
public final class C0553e extends AbstractC0558j {
    public static final Parcelable.Creator<C0553e> CREATOR = new C0002c(20);

    /* renamed from: k */
    public final String f2241k;

    /* renamed from: l */
    public final String f2242l;

    /* renamed from: m */
    public final String f2243m;

    public C0553e(String str, String str2, String str3) {
        super("COMM");
        this.f2241k = str;
        this.f2242l = str2;
        this.f2243m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0553e.class == obj.getClass()) {
            C0553e c0553e = (C0553e) obj;
            String str = c0553e.f2242l;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f2242l, str) && Objects.equals(this.f2241k, c0553e.f2241k) && Objects.equals(this.f2243m, c0553e.f2243m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2241k;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2242l;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2243m;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": language=" + this.f2241k + ", description=" + this.f2242l + ", text=" + this.f2243m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2253j);
        parcel.writeString(this.f2241k);
        parcel.writeString(this.f2243m);
    }

    public C0553e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2241k = string;
        this.f2242l = parcel.readString();
        this.f2243m = parcel.readString();
    }
}
