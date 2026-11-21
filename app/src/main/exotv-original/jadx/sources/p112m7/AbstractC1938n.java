package p112m7;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import p061g7.AbstractC1063j;
import p061g7.C1054a;
import p061g7.C1060g;
import p086j7.AbstractC1535e;
import p086j7.C1531a;
import p086j7.C1534d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.n */
/* loaded from: classes.dex */
public abstract class AbstractC1938n {

    /* renamed from: a */
    public static final C1534d f7227a;

    static {
        String property;
        int i = AbstractC1944t.f7234a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new C1531a()).iterator();
            AbstractC2980h.m5136e("<this>", it);
            Iterator it2 = AbstractC1063j.m2250S(new C1054a(new C1060g(1, it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((C1531a) next).getClass();
                    do {
                        ((C1531a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C1531a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f7227a = new C1534d(AbstractC1535e.m3215a(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
