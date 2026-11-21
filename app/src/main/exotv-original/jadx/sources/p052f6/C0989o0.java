package p052f6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.o0 */
/* loaded from: classes.dex */
public final class C0989o0 {

    /* renamed from: a */
    public final Object f4226a;

    /* renamed from: b */
    public final Object f4227b;

    /* renamed from: c */
    public final Object f4228c;

    public C0989o0(Object obj, Object obj2, Object obj3) {
        this.f4226a = obj;
        this.f4227b = obj2;
        this.f4228c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m2178a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f4226a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f4227b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f4228c);
        return new IllegalArgumentException(sb.toString());
    }
}
