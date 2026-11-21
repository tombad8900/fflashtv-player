package p079j0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C1476d {

    /* renamed from: a */
    public final String f5689a;

    /* renamed from: b */
    public final String f5690b;

    /* renamed from: c */
    public final String f5691c;

    /* renamed from: d */
    public final List f5692d;

    /* renamed from: e */
    public final String f5693e;

    public C1476d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f5689a = str;
        str2.getClass();
        this.f5690b = str2;
        this.f5691c = str3;
        list.getClass();
        this.f5692d = list;
        this.f5693e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5689a + ", mProviderPackage: " + this.f5690b + ", mQuery: " + this.f5691c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f5692d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i4 = 0; i4 < list2.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
