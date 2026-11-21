package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0232q0;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.a */
/* loaded from: classes.dex */
public final class C0549a extends AbstractC0558j {
    public static final Parcelable.Creator<C0549a> CREATOR = new C0002c(16);

    /* renamed from: k */
    public final String f2225k;

    /* renamed from: l */
    public final String f2226l;

    /* renamed from: m */
    public final int f2227m;

    /* renamed from: n */
    public final byte[] f2228n;

    public C0549a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f2225k = str;
        this.f2226l = str2;
        this.f2227m = i;
        this.f2228n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0549a.class == obj.getClass()) {
            C0549a c0549a = (C0549a) obj;
            if (this.f2227m == c0549a.f2227m) {
                String str = c0549a.f2225k;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(this.f2225k, str) && Objects.equals(this.f2226l, c0549a.f2226l) && Arrays.equals(this.f2228n, c0549a.f2228n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f2227m) * 31;
        String str = this.f2225k;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2226l;
        return Arrays.hashCode(this.f2228n) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.common.InterfaceC0238s0
    public final void populateMediaMetadata(C0232q0 c0232q0) {
        c0232q0.m660a(this.f2228n, this.f2227m);
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": mimeType=" + this.f2225k + ", description=" + this.f2226l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2225k);
        parcel.writeString(this.f2226l);
        parcel.writeInt(this.f2227m);
        parcel.writeByteArray(this.f2228n);
    }

    public C0549a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2225k = string;
        this.f2226l = parcel.readString();
        this.f2227m = parcel.readInt();
        this.f2228n = parcel.createByteArray();
    }
}
