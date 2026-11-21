package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import p000a.C0002c;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.r */
/* loaded from: classes.dex */
public final class C0234r implements Parcelable {
    public static final Parcelable.Creator<C0234r> CREATOR = new C0002c(13);

    /* renamed from: j */
    public int f1324j;

    /* renamed from: k */
    public final UUID f1325k;

    /* renamed from: l */
    public final String f1326l;

    /* renamed from: m */
    public final String f1327m;

    /* renamed from: n */
    public final byte[] f1328n;

    public C0234r(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f1325k = uuid;
        this.f1326l = str;
        str2.getClass();
        this.f1327m = AbstractC0244u0.m687p(str2);
        this.f1328n = bArr;
    }

    /* renamed from: a */
    public final boolean m665a(UUID uuid) {
        UUID uuid2 = AbstractC0213k.f1162a;
        UUID uuid3 = this.f1325k;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0234r)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0234r c0234r = (C0234r) obj;
        String str = c0234r.f1326l;
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(this.f1326l, str) && Objects.equals(this.f1327m, c0234r.f1327m) && Objects.equals(this.f1325k, c0234r.f1325k) && Arrays.equals(this.f1328n, c0234r.f1328n);
    }

    public final int hashCode() {
        if (this.f1324j == 0) {
            int iHashCode = this.f1325k.hashCode() * 31;
            String str = this.f1326l;
            this.f1324j = Arrays.hashCode(this.f1328n) + AbstractC0008a1.m9e(this.f1327m, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f1324j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f1325k;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f1326l);
        parcel.writeString(this.f1327m);
        parcel.writeByteArray(this.f1328n);
    }

    public C0234r(Parcel parcel) {
        this.f1325k = new UUID(parcel.readLong(), parcel.readLong());
        this.f1326l = parcel.readString();
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f1327m = string;
        this.f1328n = parcel.createByteArray();
    }
}
