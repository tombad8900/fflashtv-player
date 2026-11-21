package p038e1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C0860a {

    /* renamed from: a */
    public final C0861b f3794a = new C0861b();

    /* renamed from: b */
    public final LinkedHashMap f3795b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashSet f3796c = new LinkedHashSet();

    /* renamed from: d */
    public volatile boolean f3797d;

    /* renamed from: a */
    public static void m2041a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC0008a1.m21q(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
