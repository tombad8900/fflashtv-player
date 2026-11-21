package p215z1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0232q0;
import androidx.media3.common.InterfaceC0238s0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p021c2.C0634d;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z1.a */
/* loaded from: classes.dex */
public final class C2870a implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C2870a> CREATOR = new C0634d(21);

    /* renamed from: j */
    public final int f10592j;

    /* renamed from: k */
    public final String f10593k;

    /* renamed from: l */
    public final String f10594l;

    /* renamed from: m */
    public final int f10595m;

    /* renamed from: n */
    public final int f10596n;

    /* renamed from: o */
    public final int f10597o;

    /* renamed from: p */
    public final int f10598p;

    /* renamed from: q */
    public final byte[] f10599q;

    public C2870a(int i, String str, String str2, int i4, int i8, int i9, int i10, byte[] bArr) {
        this.f10592j = i;
        this.f10593k = str;
        this.f10594l = str2;
        this.f10595m = i4;
        this.f10596n = i8;
        this.f10597o = i9;
        this.f10598p = i10;
        this.f10599q = bArr;
    }

    /* renamed from: a */
    public static C2870a m4969a(C1132w c1132w) {
        int iM2521g = c1132w.m2521g();
        String strM687p = AbstractC0244u0.m687p(c1132w.m2533s(c1132w.m2521g(), StandardCharsets.US_ASCII));
        String strM2533s = c1132w.m2533s(c1132w.m2521g(), StandardCharsets.UTF_8);
        int iM2521g2 = c1132w.m2521g();
        int iM2521g3 = c1132w.m2521g();
        int iM2521g4 = c1132w.m2521g();
        int iM2521g5 = c1132w.m2521g();
        int iM2521g6 = c1132w.m2521g();
        byte[] bArr = new byte[iM2521g6];
        c1132w.m2519e(bArr, 0, iM2521g6);
        return new C2870a(iM2521g, strM687p, strM2533s, iM2521g2, iM2521g3, iM2521g4, iM2521g5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2870a.class == obj.getClass()) {
            C2870a c2870a = (C2870a) obj;
            if (this.f10592j == c2870a.f10592j && this.f10593k.equals(c2870a.f10593k) && this.f10594l.equals(c2870a.f10594l) && this.f10595m == c2870a.f10595m && this.f10596n == c2870a.f10596n && this.f10597o == c2870a.f10597o && this.f10598p == c2870a.f10598p && Arrays.equals(this.f10599q, c2870a.f10599q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10599q) + ((((((((AbstractC0008a1.m9e(this.f10594l, AbstractC0008a1.m9e(this.f10593k, (527 + this.f10592j) * 31, 31), 31) + this.f10595m) * 31) + this.f10596n) * 31) + this.f10597o) * 31) + this.f10598p) * 31);
    }

    @Override // androidx.media3.common.InterfaceC0238s0
    public final void populateMediaMetadata(C0232q0 c0232q0) {
        c0232q0.m660a(this.f10599q, this.f10592j);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f10593k + ", description=" + this.f10594l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10592j);
        parcel.writeString(this.f10593k);
        parcel.writeString(this.f10594l);
        parcel.writeInt(this.f10595m);
        parcel.writeInt(this.f10596n);
        parcel.writeInt(this.f10597o);
        parcel.writeInt(this.f10598p);
        parcel.writeByteArray(this.f10599q);
    }

    public C2870a(Parcel parcel) {
        this.f10592j = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f10593k = string;
        this.f10594l = parcel.readString();
        this.f10595m = parcel.readInt();
        this.f10596n = parcel.readInt();
        this.f10597o = parcel.readInt();
        this.f10598p = parcel.readInt();
        this.f10599q = parcel.createByteArray();
    }
}
