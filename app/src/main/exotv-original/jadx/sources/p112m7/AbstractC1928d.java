package p112m7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import p061g7.AbstractC1063j;
import p061g7.C1054a;
import p061g7.C1060g;
import p086j7.C1532b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.d */
/* loaded from: classes.dex */
public abstract class AbstractC1928d {

    /* renamed from: a */
    public static final List f7200a;

    static {
        try {
            Iterator it = Arrays.asList(new C1532b()).iterator();
            AbstractC2980h.m5136e("<this>", it);
            f7200a = AbstractC1063j.m2250S(new C1054a(new C1060g(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
