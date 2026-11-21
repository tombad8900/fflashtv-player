package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0232q0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Objects;
import p000a.C0002c;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0983m0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.o */
/* loaded from: classes.dex */
public final class C0563o extends AbstractC0558j {
    public static final Parcelable.Creator<C0563o> CREATOR = new C0002c(25);

    /* renamed from: k */
    public final String f2265k;

    /* renamed from: l */
    public final AbstractC0983m0 f2266l;

    public C0563o(String str, String str2, C0981l1 c0981l1) {
        super(str);
        AbstractC1101a.m2353d(!c0981l1.isEmpty());
        this.f2265k = str2;
        AbstractC0983m0 abstractC0983m0M2165j = AbstractC0983m0.m2165j(c0981l1);
        this.f2266l = abstractC0983m0M2165j;
    }

    /* renamed from: a */
    public static ArrayList m1303a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0563o.class == obj.getClass()) {
            C0563o c0563o = (C0563o) obj;
            String str = c0563o.f2253j;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f2253j, str) && Objects.equals(this.f2265k, c0563o.f2265k) && this.f2266l.equals(c0563o.f2266l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f2253j, 527, 31);
        String str = this.f2265k;
        return this.f2266l.hashCode() + ((iM9e + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // androidx.media3.common.InterfaceC0238s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void populateMediaMetadata(C0232q0 c0232q0) throws NumberFormatException {
        char c8;
        String str = this.f2253j;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (!str.equals("TAL")) {
                    c8 = '\uffff';
                    break;
                } else {
                    c8 = 0;
                    break;
                }
            case 82878:
                if (str.equals("TCM")) {
                    c8 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c8 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c8 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c8 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c8 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c8 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c8 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c8 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c8 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c8 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c8 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c8 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c8 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c8 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c8 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c8 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c8 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c8 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c8 = 22;
                    break;
                }
                break;
        }
        AbstractC0983m0 abstractC0983m0 = this.f2266l;
        try {
            switch (c8) {
                case 0:
                case '\n':
                    c0232q0.f1293c = (CharSequence) abstractC0983m0.get(0);
                    break;
                case 1:
                case 11:
                    c0232q0.f1316z = (CharSequence) abstractC0983m0.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) abstractC0983m0.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i4 = Integer.parseInt(str2.substring(0, 2));
                    c0232q0.f1310t = Integer.valueOf(i);
                    c0232q0.f1311u = Integer.valueOf(i4);
                    break;
                case 3:
                case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                    c0232q0.f1292b = (CharSequence) abstractC0983m0.get(0);
                    break;
                case 4:
                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                    c0232q0.f1294d = (CharSequence) abstractC0983m0.get(0);
                    break;
                case 5:
                case 20:
                    c0232q0.f1282A = (CharSequence) abstractC0983m0.get(0);
                    break;
                case 6:
                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                    String str3 = (String) abstractC0983m0.get(0);
                    int i8 = AbstractC1118i0.f4750a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i9 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c0232q0.f1304n = Integer.valueOf(i9);
                    c0232q0.f1305o = numValueOf;
                    break;
                case 7:
                case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                    c0232q0.f1291a = (CharSequence) abstractC0983m0.get(0);
                    break;
                case '\b':
                case 16:
                    c0232q0.f1315y = (CharSequence) abstractC0983m0.get(0);
                    break;
                case '\t':
                case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                    c0232q0.f1309s = Integer.valueOf(Integer.parseInt((String) abstractC0983m0.get(0)));
                    break;
                case '\f':
                    Integer numM1571r0 = AbstractC0715d.m1571r0((String) abstractC0983m0.get(0));
                    if (numM1571r0 != null) {
                        String strM1302a = AbstractC0559k.m1302a(numM1571r0.intValue());
                        if (strM1302a != null) {
                            c0232q0.f1285D = strM1302a;
                            break;
                        }
                    } else {
                        c0232q0.f1285D = (CharSequence) abstractC0983m0.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList arrayListM1303a = m1303a((String) abstractC0983m0.get(0));
                    int size = arrayListM1303a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c0232q0.f1311u = (Integer) arrayListM1303a.get(2);
                            }
                        }
                        c0232q0.f1310t = (Integer) arrayListM1303a.get(1);
                    }
                    c0232q0.f1309s = (Integer) arrayListM1303a.get(0);
                    break;
                case 15:
                    ArrayList arrayListM1303a2 = m1303a((String) abstractC0983m0.get(0));
                    int size2 = arrayListM1303a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c0232q0.f1314x = (Integer) arrayListM1303a2.get(2);
                            }
                        }
                        c0232q0.f1313w = (Integer) arrayListM1303a2.get(1);
                    }
                    c0232q0.f1312v = (Integer) arrayListM1303a2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": description=" + this.f2265k + ": values=" + this.f2266l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2253j);
        parcel.writeString(this.f2265k);
        parcel.writeStringArray((String[]) this.f2266l.toArray(new String[0]));
    }
}
