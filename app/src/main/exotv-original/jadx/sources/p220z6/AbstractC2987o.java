package p220z6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.o */
/* loaded from: classes.dex */
public abstract class AbstractC2987o {

    /* renamed from: a */
    public static final C2988p f11118a;

    static {
        C2988p c2988p = null;
        try {
            c2988p = (C2988p) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2988p == null) {
            c2988p = new C2988p();
        }
        f11118a = c2988p;
    }

    /* renamed from: a */
    public static C2976d m5142a(Class cls) {
        f11118a.getClass();
        return new C2976d(cls);
    }
}
