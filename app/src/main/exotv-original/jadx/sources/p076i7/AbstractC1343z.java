package p076i7;

import p086j7.C1534d;
import p112m7.AbstractC1938n;
import p112m7.AbstractC1944t;
import p127o7.C2054e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.z */
/* loaded from: classes.dex */
public abstract class AbstractC1343z {

    /* renamed from: a */
    public static final InterfaceC1281b0 f5392a;

    static {
        String property;
        InterfaceC1281b0 interfaceC1281b0;
        int i = AbstractC1944t.f7234a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C2054e c2054e = AbstractC1290e0.f5316a;
            C1534d c1534d = AbstractC1938n.f7227a;
            C1534d c1534d2 = c1534d.f5856n;
            interfaceC1281b0 = c1534d;
            if (c1534d == null) {
                interfaceC1281b0 = RunnableC1341y.f5386r;
            }
        } else {
            interfaceC1281b0 = RunnableC1341y.f5386r;
        }
        f5392a = interfaceC1281b0;
    }
}
