package p115n1;

import android.net.Uri;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002a1.C0016e;
import p048f2.C0935d;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p057g2.C1041e;
import p063h1.C1108d0;
import p064h2.C1144i;
import p064h2.C1148m;
import p072i2.C1244d;
import p079j0.C1481i;
import p081j2.C1487a;
import p090k2.C1587e;
import p090k2.InterfaceC1597o;
import p114n0.C1950b;
import p122o1.C2041a;
import p132p1.C2199b;
import p141q1.C2251a;
import p158s1.C2340c;
import p167t1.C2394b;
import p168t2.C2398a;
import p168t2.C2401b0;
import p168t2.C2402c;
import p168t2.C2404d;
import p168t2.C2407e0;
import p176u2.C2458c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.l */
/* loaded from: classes.dex */
public final class C1985l implements InterfaceC1990q {

    /* renamed from: g */
    public static final int[] f7363g = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: h */
    public static final C0016e f7364h = new C0016e(new C1950b(7));

    /* renamed from: i */
    public static final C0016e f7365i = new C0016e(new C1950b(8));

    /* renamed from: b */
    public int f7366b;

    /* renamed from: c */
    public C0981l1 f7367c;

    /* renamed from: f */
    public int f7370f;

    /* renamed from: e */
    public InterfaceC1597o f7369e = new C1587e();

    /* renamed from: d */
    public boolean f7368d = true;

    @Override // p115n1.InterfaceC1990q
    /* renamed from: a */
    public final synchronized InterfaceC1987n[] mo967a() {
        return mo3870c(Uri.EMPTY, new HashMap());
    }

    @Override // p115n1.InterfaceC1990q
    /* renamed from: b */
    public final void mo3869b(boolean z7) {
        synchronized (this) {
            this.f7368d = z7;
        }
    }

    @Override // p115n1.InterfaceC1990q
    /* renamed from: c */
    public final synchronized InterfaceC1987n[] mo3870c(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f7363g;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iM1545N = AbstractC0715d.m1545N((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iM1545N != -1) {
                m3871d(iM1545N, arrayList);
            }
            int iM1546O = AbstractC0715d.m1546O(uri);
            if (iM1546O != -1 && iM1546O != iM1545N) {
                m3871d(iM1546O, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i4 = iArr[i];
                if (i4 != iM1545N && i4 != iM1546O) {
                    m3871d(i4, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1987n[]) arrayList.toArray(new InterfaceC1987n[arrayList.size()]);
    }

    /* renamed from: d */
    public final void m3871d(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C2398a());
                break;
            case 1:
                arrayList.add(new C2402c());
                break;
            case 2:
                arrayList.add(new C2404d(0));
                break;
            case 3:
                arrayList.add(new C2041a());
                break;
            case 4:
                InterfaceC1987n interfaceC1987nM69z = f7364h.m69z(0);
                if (interfaceC1987nM69z == null) {
                    arrayList.add(new C2340c());
                    break;
                } else {
                    arrayList.add(interfaceC1987nM69z);
                    break;
                }
            case 5:
                arrayList.add(new C2394b());
                break;
            case 6:
                arrayList.add(new C0935d(this.f7368d ? 0 : 2, this.f7369e));
                break;
            case 7:
                arrayList.add(new C1041e(0));
                break;
            case 8:
                arrayList.add(new C1144i(this.f7368d ? 0 : 32, this.f7369e));
                arrayList.add(new C1148m(this.f7366b | (this.f7368d ? 0 : 16), this.f7369e));
                break;
            case 9:
                arrayList.add(new C1244d());
                break;
            case 10:
                arrayList.add(new C2401b0());
                break;
            case 11:
                if (this.f7367c == null) {
                    C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                    this.f7367c = C0981l1.f4211n;
                }
                arrayList.add(new C2407e0(1, !this.f7368d ? 1 : 0, this.f7369e, new C1108d0(0L), new C1481i(0, this.f7367c)));
                break;
            case 12:
                arrayList.add(new C2458c());
                break;
            case 14:
                arrayList.add(new C1487a(this.f7370f));
                break;
            case 15:
                InterfaceC1987n interfaceC1987nM69z2 = f7365i.m69z(new Object[0]);
                if (interfaceC1987nM69z2 != null) {
                    arrayList.add(interfaceC1987nM69z2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C2199b(1 ^ (this.f7368d ? 1 : 0), this.f7369e));
                break;
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                arrayList.add(new C1487a((byte) 0, 0));
                break;
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                arrayList.add(new C2251a(2));
                break;
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                arrayList.add(new C1487a((byte) 0, 1));
                break;
            case 20:
                int i4 = this.f7366b;
                if ((i4 & 2) == 0 && (i4 & 4) == 0) {
                    arrayList.add(new C2251a(1));
                    break;
                }
                break;
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                arrayList.add(new C2251a(0));
                break;
        }
    }

    @Override // p115n1.InterfaceC1990q
    public final void setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
        synchronized (this) {
            this.f7369e = interfaceC1597o;
        }
    }
}
