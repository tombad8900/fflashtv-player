package p178u4;

import p062h.ExecutorC1088n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.e */
/* loaded from: classes.dex */
public abstract class AbstractC2470e {

    /* renamed from: a */
    public static final ExecutorC1088n f9055a = new ExecutorC1088n(1);

    /* renamed from: b */
    public static final ExecutorC1088n f9056b = new ExecutorC1088n(2);

    /* renamed from: a */
    public static void m4444a(String str, boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m4445b(Object obj) {
        m4446c("Argument must not be null", obj);
    }

    /* renamed from: c */
    public static void m4446c(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
