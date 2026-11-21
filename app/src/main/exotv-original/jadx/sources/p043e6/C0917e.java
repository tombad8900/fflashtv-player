package p043e6;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e6.e */
/* loaded from: classes.dex */
public final class C0917e {

    /* renamed from: a */
    public final String f3969a;

    public C0917e(String str) {
        str.getClass();
        this.f3969a = str;
    }

    /* renamed from: a */
    public final void m2084a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f3969a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final String m2085b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        m2084a(sb, it);
        return sb.toString();
    }
}
