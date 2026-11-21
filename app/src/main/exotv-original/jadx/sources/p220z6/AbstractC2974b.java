package p220z6;

import java.io.Serializable;
import p053f7.InterfaceC1024a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.b */
/* loaded from: classes.dex */
public abstract class AbstractC2974b implements InterfaceC1024a, Serializable {

    /* renamed from: j */
    public transient InterfaceC1024a f11100j;

    /* renamed from: k */
    public final Object f11101k;

    /* renamed from: l */
    public final Class f11102l;

    /* renamed from: m */
    public final String f11103m;

    /* renamed from: n */
    public final String f11104n;

    /* renamed from: o */
    public final boolean f11105o;

    public AbstractC2974b(Object obj, Class cls, String str, String str2, boolean z7) {
        this.f11101k = obj;
        this.f11102l = cls;
        this.f11103m = str;
        this.f11104n = str2;
        this.f11105o = z7;
    }

    /* renamed from: a */
    public final InterfaceC2975c m5129a() {
        boolean z7 = this.f11105o;
        Class cls = this.f11102l;
        if (!z7) {
            return AbstractC2987o.m5142a(cls);
        }
        AbstractC2987o.f11118a.getClass();
        return new C2982j(cls);
    }
}
