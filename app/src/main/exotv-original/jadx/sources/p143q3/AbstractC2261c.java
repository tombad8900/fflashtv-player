package p143q3;

import okhttp3.C2180y;
import p069h7.AbstractC1214p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q3.c */
/* loaded from: classes.dex */
public abstract class AbstractC2261c {
    /* renamed from: a */
    public static C2180y m4049a(C2180y c2180y, C2180y c2180y2) {
        C2180y.a aVar = new C2180y.a();
        int size = c2180y.size();
        for (int i = 0; i < size; i++) {
            String strName = c2180y.name(i);
            String strValue = c2180y.value(i);
            if ((!"Warning".equalsIgnoreCase(strName) || !AbstractC1214p.m2667t0(strValue, "1", false)) && ("Content-Length".equalsIgnoreCase(strName) || "Content-Encoding".equalsIgnoreCase(strName) || "Content-Type".equalsIgnoreCase(strName) || !m4050b(strName) || c2180y2.get(strName) == null)) {
                aVar.addUnsafeNonAscii(strName, strValue);
            }
        }
        int size2 = c2180y2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            String strName2 = c2180y2.name(i4);
            if (!"Content-Length".equalsIgnoreCase(strName2) && !"Content-Encoding".equalsIgnoreCase(strName2) && !"Content-Type".equalsIgnoreCase(strName2) && m4050b(strName2)) {
                aVar.addUnsafeNonAscii(strName2, c2180y2.value(i4));
            }
        }
        return aVar.build();
    }

    /* renamed from: b */
    public static boolean m4050b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
