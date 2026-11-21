package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0232q0;
import androidx.media3.common.InterfaceC0238s0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0002c;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class C0061b implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C0061b> CREATOR = new C0002c(6);

    /* renamed from: j */
    public final int f293j;

    /* renamed from: k */
    public final String f294k;

    /* renamed from: l */
    public final String f295l;

    /* renamed from: m */
    public final String f296m;

    /* renamed from: n */
    public final boolean f297n;

    /* renamed from: o */
    public final int f298o;

    public C0061b(int i, String str, String str2, String str3, boolean z7, int i4) {
        AbstractC1101a.m2353d(i4 == -1 || i4 > 0);
        this.f293j = i;
        this.f294k = str;
        this.f295l = str2;
        this.f296m = str3;
        this.f297n = z7;
        this.f298o = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0061b m248a(Map map) throws NumberFormatException {
        boolean z7;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i4;
        List list6 = (List) map.get("icy-br");
        boolean z8 = true;
        int i8 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i4 = Integer.parseInt(str4) * 1000;
                if (i4 > 0) {
                    z7 = true;
                } else {
                    try {
                        AbstractC1101a.m2348F("IcyHeaders", "Invalid bitrate: " + str4);
                        z7 = false;
                        i4 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC0008a1.m24t("Invalid bitrate header: ", str4, "IcyHeaders");
                        z7 = false;
                        i = i4;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i9 = i8;
                        if (z7) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i4 = -1;
            }
            i = i4;
        } else {
            z7 = false;
            i = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z7 = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z7 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z7 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            zEquals = ((String) list4.get(0)).equals("1");
            z7 = true;
        } else {
            zEquals = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int i10 = Integer.parseInt(str5);
                if (i10 > 0) {
                    i8 = i10;
                } else {
                    try {
                        AbstractC1101a.m2348F("IcyHeaders", "Invalid metadata interval: " + str5);
                        z8 = z7;
                    } catch (NumberFormatException unused3) {
                        i8 = i10;
                        AbstractC0008a1.m24t("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i92 = i8;
                        if (z7) {
                        }
                    }
                }
                z7 = z8;
            } catch (NumberFormatException unused4) {
            }
        }
        int i922 = i8;
        if (z7) {
            return new C0061b(i, str, str2, str3, zEquals, i922);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0061b.class == obj.getClass()) {
            C0061b c0061b = (C0061b) obj;
            if (this.f293j == c0061b.f293j) {
                String str = c0061b.f294k;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(this.f294k, str) && Objects.equals(this.f295l, c0061b.f295l) && Objects.equals(this.f296m, c0061b.f296m) && this.f297n == c0061b.f297n && this.f298o == c0061b.f298o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f293j) * 31;
        String str = this.f294k;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f295l;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f296m;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f297n ? 1 : 0)) * 31) + this.f298o;
    }

    @Override // androidx.media3.common.InterfaceC0238s0
    public final void populateMediaMetadata(C0232q0 c0232q0) {
        String str = this.f295l;
        if (str != null) {
            c0232q0.f1287F = str;
        }
        String str2 = this.f294k;
        if (str2 != null) {
            c0232q0.f1285D = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f295l + "\", genre=\"" + this.f294k + "\", bitrate=" + this.f293j + ", metadataInterval=" + this.f298o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f293j);
        parcel.writeString(this.f294k);
        parcel.writeString(this.f295l);
        parcel.writeString(this.f296m);
        int i4 = AbstractC1118i0.f4750a;
        parcel.writeInt(this.f297n ? 1 : 0);
        parcel.writeInt(this.f298o);
    }

    public C0061b(Parcel parcel) {
        this.f293j = parcel.readInt();
        this.f294k = parcel.readString();
        this.f295l = parcel.readString();
        this.f296m = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f297n = parcel.readInt() != 0;
        this.f298o = parcel.readInt();
    }
}
