package p208y1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0238s0;
import java.util.Arrays;
import java.util.Objects;
import p021c2.C0634d;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y1.a */
/* loaded from: classes.dex */
public final class C2793a implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C2793a> CREATOR;

    /* renamed from: p */
    public static final C0249w f10402p;

    /* renamed from: q */
    public static final C0249w f10403q;

    /* renamed from: j */
    public final String f10404j;

    /* renamed from: k */
    public final String f10405k;

    /* renamed from: l */
    public final long f10406l;

    /* renamed from: m */
    public final long f10407m;

    /* renamed from: n */
    public final byte[] f10408n;

    /* renamed from: o */
    public int f10409o;

    static {
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("application/id3");
        f10402p = new C0249w(c0246v);
        C0246v c0246v2 = new C0246v();
        c0246v2.f1447m = AbstractC0244u0.m687p("application/x-scte35");
        f10403q = new C0249w(c0246v2);
        CREATOR = new C0634d(20);
    }

    public C2793a(String str, String str2, long j, long j8, byte[] bArr) {
        this.f10404j = str;
        this.f10405k = str2;
        this.f10406l = j;
        this.f10407m = j8;
        this.f10408n = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2793a.class == obj.getClass()) {
            C2793a c2793a = (C2793a) obj;
            if (this.f10406l == c2793a.f10406l && this.f10407m == c2793a.f10407m) {
                String str = c2793a.f10404j;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(this.f10404j, str) && Objects.equals(this.f10405k, c2793a.f10405k) && Arrays.equals(this.f10408n, c2793a.f10408n)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.common.InterfaceC0238s0
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f10408n;
        }
        return null;
    }

    @Override // androidx.media3.common.InterfaceC0238s0
    public final C0249w getWrappedMetadataFormat() {
        String str = this.f10404j;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f10403q;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f10402p;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f10409o == 0) {
            String str = this.f10404j;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10405k;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f10406l;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j8 = this.f10407m;
            this.f10409o = Arrays.hashCode(this.f10408n) + ((i + ((int) (j8 ^ (j8 >>> 32)))) * 31);
        }
        return this.f10409o;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f10404j + ", id=" + this.f10407m + ", durationMs=" + this.f10406l + ", value=" + this.f10405k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10404j);
        parcel.writeString(this.f10405k);
        parcel.writeLong(this.f10406l);
        parcel.writeLong(this.f10407m);
        parcel.writeByteArray(this.f10408n);
    }

    public C2793a(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f10404j = string;
        this.f10405k = parcel.readString();
        this.f10406l = parcel.readLong();
        this.f10407m = parcel.readLong();
        this.f10408n = parcel.createByteArray();
    }
}
