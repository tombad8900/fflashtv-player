package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p000a.C0002c;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.p */
/* loaded from: classes.dex */
public final class C0564p extends AbstractC0558j {
    public static final Parcelable.Creator<C0564p> CREATOR = new C0002c(26);

    /* renamed from: k */
    public final String f2267k;

    /* renamed from: l */
    public final String f2268l;

    public C0564p(String str, String str2, String str3) {
        super(str);
        this.f2267k = str2;
        this.f2268l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0564p.class == obj.getClass()) {
            C0564p c0564p = (C0564p) obj;
            if (this.f2253j.equals(c0564p.f2253j)) {
                String str = c0564p.f2267k;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(this.f2267k, str) && Objects.equals(this.f2268l, c0564p.f2268l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f2253j, 527, 31);
        String str = this.f2267k;
        int iHashCode = (iM9e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2268l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": url=" + this.f2268l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2253j);
        parcel.writeString(this.f2267k);
        parcel.writeString(this.f2268l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0564p(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        super(string);
        this.f2267k = parcel.readString();
        this.f2268l = parcel.readString();
    }
}
