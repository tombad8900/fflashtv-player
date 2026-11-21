package p005a4;

import java.util.concurrent.Executor;
import p144q4.C2270f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.s */
/* loaded from: classes.dex */
public final class C0098s {

    /* renamed from: a */
    public final C2270f f456a;

    /* renamed from: b */
    public final Executor f457b;

    public C0098s(C2270f c2270f, Executor executor) {
        this.f456a = c2270f;
        this.f457b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0098s) {
            return this.f456a.equals(((C0098s) obj).f456a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f456a.hashCode();
    }
}
