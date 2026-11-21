package p189v7;

import java.io.FileNotFoundException;
import java.util.List;
import p182v.C2490e;
import p198w7.C2710f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.p */
/* loaded from: classes.dex */
public abstract class AbstractC2585p {

    /* renamed from: a */
    public static final C2592w f9330a;

    static {
        C2592w c2592w;
        try {
            Class.forName("java.nio.file.Files");
            c2592w = new C2593x();
        } catch (ClassNotFoundException unused) {
            c2592w = new C2592w();
        }
        f9330a = c2592w;
        String str = C2558b0.f9272k;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC2980h.m5135d("getProperty(...)", property);
        C2556a0.m4571c(property);
        ClassLoader classLoader = C2710f.class.getClassLoader();
        AbstractC2980h.m5135d("getClassLoader(...)", classLoader);
        new C2710f(classLoader);
    }

    /* renamed from: a */
    public abstract InterfaceC2572i0 mo3155a(C2558b0 c2558b0);

    /* renamed from: b */
    public abstract void mo3156b(C2558b0 c2558b0, C2558b0 c2558b02);

    /* renamed from: c */
    public abstract void mo3157c(C2558b0 c2558b0);

    /* renamed from: d */
    public abstract void mo3158d(C2558b0 c2558b0);

    /* renamed from: e */
    public final void m4677e(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("path", c2558b0);
        mo3158d(c2558b0);
    }

    /* renamed from: f */
    public final boolean m4678f(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("path", c2558b0);
        return mo3160i(c2558b0) != null;
    }

    /* renamed from: g */
    public abstract List mo3159g(C2558b0 c2558b0);

    /* renamed from: h */
    public final C2490e m4679h(C2558b0 c2558b0) throws FileNotFoundException {
        AbstractC2980h.m5136e("path", c2558b0);
        C2490e c2490eMo3160i = mo3160i(c2558b0);
        if (c2490eMo3160i != null) {
            return c2490eMo3160i;
        }
        throw new FileNotFoundException("no such file: " + c2558b0);
    }

    /* renamed from: i */
    public abstract C2490e mo3160i(C2558b0 c2558b0);

    /* renamed from: j */
    public abstract C2591v mo3161j(C2558b0 c2558b0);

    /* renamed from: k */
    public abstract InterfaceC2572i0 mo3162k(C2558b0 c2558b0);

    /* renamed from: l */
    public abstract InterfaceC2576k0 mo3163l(C2558b0 c2558b0);
}
