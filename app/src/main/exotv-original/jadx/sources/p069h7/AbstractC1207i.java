package p069h7;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C2181z;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.C1921p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.i */
/* loaded from: classes.dex */
public abstract class AbstractC1207i extends AbstractC0714c {
    /* renamed from: h0 */
    public static String m2655h0(String str) {
        List listM1551T;
        AbstractC2980h.m5136e("<this>", str);
        if (AbstractC1206h.m2630D0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C1202d c1202d = new C1202d(str);
        if (c1202d.hasNext()) {
            Object next = c1202d.next();
            if (c1202d.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c1202d.hasNext()) {
                    arrayList.add(c1202d.next());
                }
                listM1551T = arrayList;
            } else {
                listM1551T = AbstractC0715d.m1551T(next);
            }
        } else {
            listM1551T = C1921p.f7187j;
        }
        int length = str.length();
        listM1551T.size();
        int iM3752s0 = AbstractC1914i.m3752s0(listM1551T);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listM1551T) {
            int i4 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC1914i.m3755v0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM3752s0) || !AbstractC1206h.m2630D0(str2)) {
                int length2 = str2.length();
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        i8 = -1;
                        break;
                    }
                    if (!AbstractC0120b.m429y(str2.charAt(i8))) {
                        break;
                    }
                    i8++;
                }
                if (i8 != -1 && AbstractC1214p.m2666s0(str2, "|", i8, false)) {
                    strSubstring = str2.substring(1 + i8);
                    AbstractC2980h.m5135d("substring(...)", strSubstring);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC1913h.m3739D0(arrayList2, sb, "\n", C2181z.FRAGMENT_ENCODE_SET, C2181z.FRAGMENT_ENCODE_SET, "...", null);
        return sb.toString();
    }
}
