package p069h7;

import java.util.regex.Matcher;
import okhttp3.C2181z;
import p002a1.C0016e;
import p111m6.AbstractC1908c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.e */
/* loaded from: classes.dex */
public final class C1203e extends AbstractC1908c {

    /* renamed from: j */
    public final /* synthetic */ C0016e f5090j;

    public C1203e(C0016e c0016e) {
        this.f5090j = c0016e;
    }

    @Override // p111m6.AbstractC1908c
    /* renamed from: a */
    public final int mo2621a() {
        return ((Matcher) this.f5090j.f62k).groupCount() + 1;
    }

    @Override // p111m6.AbstractC1908c, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.f5090j.f62k).group(i);
        return strGroup == null ? C2181z.FRAGMENT_ENCODE_SET : strGroup;
    }

    @Override // p111m6.AbstractC1908c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p111m6.AbstractC1908c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
