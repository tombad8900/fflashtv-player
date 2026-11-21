package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.l */
/* loaded from: classes.dex */
public final class C0560l extends AbstractC0558j {
    public static final Parcelable.Creator<C0560l> CREATOR = new C0002c(22);

    /* renamed from: k */
    public final String f2255k;

    /* renamed from: l */
    public final String f2256l;

    /* renamed from: m */
    public final String f2257m;

    public C0560l(String str, String str2, String str3) {
        super("----");
        this.f2255k = str;
        this.f2256l = str2;
        this.f2257m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0560l.class == obj.getClass()) {
            C0560l c0560l = (C0560l) obj;
            String str = c0560l.f2256l;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f2256l, str) && Objects.equals(this.f2255k, c0560l.f2255k) && Objects.equals(this.f2257m, c0560l.f2257m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2255k;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2256l;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2257m;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": domain=" + this.f2255k + ", description=" + this.f2256l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2253j);
        parcel.writeString(this.f2255k);
        parcel.writeString(this.f2257m);
    }

    public C0560l(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2255k = string;
        this.f2256l = parcel.readString();
        this.f2257m = parcel.readString();
    }
}
