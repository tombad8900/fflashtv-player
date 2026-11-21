package p021c2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.C0741b;
import com.google.android.material.datepicker.C0743c;
import com.google.android.material.datepicker.C0761s;
import java.util.LinkedHashMap;
import p028d.C0783a;
import p031d2.C0799a;
import p031d2.C0803e;
import p031d2.C0804f;
import p031d2.C0807i;
import p031d2.C0808j;
import p039e2.C0862a;
import p071i1.C1222a;
import p071i1.C1226e;
import p071i1.C1227f;
import p101l5.C1682b;
import p104m.C1741l0;
import p134p3.C2207a;
import p140q0.C2247g;
import p201x1.C2743a;
import p208y1.C2793a;
import p215z1.C2870a;
import p215z1.C2871b;
import p216z2.C2880c1;
import p216z2.C2883d1;
import p216z2.C2909q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c2.d */
/* loaded from: classes.dex */
public final class C0634d implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f2522a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2522a) {
            case 0:
                return new C0635e(parcel);
            case 1:
                return new C0741b((C0761s) parcel.readParcelable(C0761s.class.getClassLoader()), (C0761s) parcel.readParcelable(C0761s.class.getClassLoader()), (C0743c) parcel.readParcelable(C0743c.class.getClassLoader()), (C0761s) parcel.readParcelable(C0761s.class.getClassLoader()), parcel.readInt());
            case 2:
                return new C0743c(parcel.readLong());
            case 3:
                return C0761s.m1862a(parcel.readInt(), parcel.readInt());
            case 4:
                AbstractC2980h.m5136e("parcel", parcel);
                return new C0783a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 5:
                return new C0799a(parcel);
            case 6:
                return new C0803e(parcel);
            case 7:
                return new C0804f();
            case 8:
                return new C0807i(parcel);
            case 9:
                return new C0808j(parcel.readLong(), parcel.readLong());
            case 10:
                return new C0862a(parcel);
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                return new C1222a(parcel);
            case 13:
                return new C1226e(parcel);
            case 14:
                return new C1227f(parcel);
            case 15:
                C1682b c1682b = new C1682b(parcel);
                c1682b.f6460j = ((Integer) parcel.readValue(C1682b.class.getClassLoader())).intValue();
                return c1682b;
            case 16:
                C1741l0 c1741l0 = new C1741l0(parcel);
                c1741l0.f6616j = parcel.readByte() != 0;
                return c1741l0;
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                String string = parcel.readString();
                AbstractC2980h.m5133b(string);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i4 = 0; i4 < i; i4++) {
                    String string2 = parcel.readString();
                    AbstractC2980h.m5133b(string2);
                    String string3 = parcel.readString();
                    AbstractC2980h.m5133b(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new C2207a(string, linkedHashMap);
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                C2247g c2247g = new C2247g(parcel);
                c2247g.f7798j = parcel.readInt();
                return c2247g;
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                String string4 = parcel.readString();
                string4.getClass();
                return new C2743a(parcel.readInt(), string4);
            case 20:
                return new C2793a(parcel);
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                return new C2870a(parcel);
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                return new C2871b(parcel);
            case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                C2909q c2909q = new C2909q();
                c2909q.f10800j = parcel.readInt();
                c2909q.f10801k = parcel.readInt();
                c2909q.f10802l = parcel.readInt() == 1;
                return c2909q;
            case 24:
                C2880c1 c2880c1 = new C2880c1();
                c2880c1.f10628j = parcel.readInt();
                c2880c1.f10629k = parcel.readInt();
                c2880c1.f10631m = parcel.readInt() == 1;
                int i8 = parcel.readInt();
                if (i8 > 0) {
                    int[] iArr = new int[i8];
                    c2880c1.f10630l = iArr;
                    parcel.readIntArray(iArr);
                }
                return c2880c1;
            default:
                C2883d1 c2883d1 = new C2883d1();
                c2883d1.f10640j = parcel.readInt();
                c2883d1.f10641k = parcel.readInt();
                int i9 = parcel.readInt();
                c2883d1.f10642l = i9;
                if (i9 > 0) {
                    int[] iArr2 = new int[i9];
                    c2883d1.f10643m = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i10 = parcel.readInt();
                c2883d1.f10644n = i10;
                if (i10 > 0) {
                    int[] iArr3 = new int[i10];
                    c2883d1.f10645o = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c2883d1.f10647q = parcel.readInt() == 1;
                c2883d1.f10648r = parcel.readInt() == 1;
                c2883d1.f10649s = parcel.readInt() == 1;
                c2883d1.f10646p = parcel.readArrayList(C2880c1.class.getClassLoader());
                return c2883d1;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2522a) {
            case 0:
                return new C0635e[i];
            case 1:
                return new C0741b[i];
            case 2:
                return new C0743c[i];
            case 3:
                return new C0761s[i];
            case 4:
                return new C0783a[i];
            case 5:
                return new C0799a[i];
            case 6:
                return new C0803e[i];
            case 7:
                return new C0804f[i];
            case 8:
                return new C0807i[i];
            case 9:
                return new C0808j[i];
            case 10:
                return new C0862a[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new C1222a[i];
            case 13:
                return new C1226e[i];
            case 14:
                return new C1227f[i];
            case 15:
                return new C1682b[i];
            case 16:
                return new C1741l0[i];
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                return new C2207a[i];
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                return new C2247g[i];
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                return new C2743a[i];
            case 20:
                return new C2793a[i];
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                return new C2870a[i];
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                return new C2871b[i];
            case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                return new C2909q[i];
            case 24:
                return new C2880c1[i];
            default:
                return new C2883d1[i];
        }
    }
}
