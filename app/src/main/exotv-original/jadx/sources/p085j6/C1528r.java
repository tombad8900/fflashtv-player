package p085j6;

import java.util.logging.Logger;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.r */
/* loaded from: classes.dex */
public final class C1528r {

    /* renamed from: a */
    public final Object f5849a = new Object();

    /* renamed from: b */
    public final String f5850b = AbstractC1524n.class.getName();

    /* renamed from: c */
    public volatile Logger f5851c;

    /* renamed from: a */
    public final Logger m3211a() {
        Logger logger = this.f5851c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f5849a) {
            try {
                Logger logger2 = this.f5851c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f5850b);
                this.f5851c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
