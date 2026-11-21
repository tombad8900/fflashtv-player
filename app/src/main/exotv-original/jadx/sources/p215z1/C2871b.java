package p215z1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0232q0;
import androidx.media3.common.InterfaceC0238s0;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import p002a1.AbstractC0008a1;
import p021c2.C0634d;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z1.b */
/* loaded from: classes.dex */
public class C2871b implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C2871b> CREATOR = new C0634d(22);

    /* renamed from: j */
    public final String f10600j;

    /* renamed from: k */
    public final String f10601k;

    public C2871b(String str, String str2) {
        this.f10600j = AbstractC0714c.m1519f0(str);
        this.f10601k = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2871b c2871b = (C2871b) obj;
            if (this.f10600j.equals(c2871b.f10600j) && this.f10601k.equals(c2871b.f10601k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10601k.hashCode() + AbstractC0008a1.m9e(this.f10600j, 527, 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.InterfaceC0238s0
    public final void populateMediaMetadata(C0232q0 c0232q0) {
        String str = this.f10600j;
        str.getClass();
        char c8 = '\uffff';
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c8 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c8 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c8 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c8 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c8 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c8 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c8 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c8 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c8 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f10601k;
        switch (c8) {
            case 0:
                Integer numM1571r0 = AbstractC0715d.m1571r0(str2);
                if (numM1571r0 != null) {
                    c0232q0.f1305o = numM1571r0;
                    break;
                }
                break;
            case 1:
                Integer numM1571r02 = AbstractC0715d.m1571r0(str2);
                if (numM1571r02 != null) {
                    c0232q0.f1284C = numM1571r02;
                    break;
                }
                break;
            case 2:
                Integer numM1571r03 = AbstractC0715d.m1571r0(str2);
                if (numM1571r03 != null) {
                    c0232q0.f1304n = numM1571r03;
                    break;
                }
                break;
            case 3:
                c0232q0.f1293c = str2;
                break;
            case 4:
                c0232q0.f1285D = str2;
                break;
            case 5:
                c0232q0.f1291a = str2;
                break;
            case 6:
                c0232q0.f1297g = str2;
                break;
            case 7:
                Integer numM1571r04 = AbstractC0715d.m1571r0(str2);
                if (numM1571r04 != null) {
                    c0232q0.f1283B = numM1571r04;
                    break;
                }
                break;
            case '\b':
                c0232q0.f1294d = str2;
                break;
            case '\t':
                c0232q0.f1292b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f10600j + "=" + this.f10601k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10600j);
        parcel.writeString(this.f10601k);
    }

    public C2871b(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f10600j = string;
        this.f10601k = parcel.readString();
    }
}
