package p041e4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.l */
/* loaded from: classes.dex */
public final class C0895l implements InterfaceC0892i {

    /* renamed from: b */
    public final Map f3920b;

    /* renamed from: c */
    public volatile Map f3921c;

    public C0895l(Map map) {
        this.f3920b = Collections.unmodifiableMap(map);
    }

    @Override // p041e4.InterfaceC0892i
    /* renamed from: a */
    public final Map mo2062a() {
        if (this.f3921c == null) {
            synchronized (this) {
                try {
                    if (this.f3921c == null) {
                        this.f3921c = Collections.unmodifiableMap(m2063b());
                    }
                } finally {
                }
            }
        }
        return this.f3921c;
    }

    /* renamed from: b */
    public final HashMap m2063b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f3920b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C0894k) list.get(i)).f3919a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0895l) {
            return this.f3920b.equals(((C0895l) obj).f3920b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3920b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f3920b + '}';
    }
}
