package p063h1;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.g */
/* loaded from: classes.dex */
public final class C1113g implements Iterable {

    /* renamed from: j */
    public final Object f4734j = new Object();

    /* renamed from: k */
    public final HashMap f4735k = new HashMap();

    /* renamed from: l */
    public Set f4736l = Collections.EMPTY_SET;

    /* renamed from: m */
    public List f4737m = Collections.EMPTY_LIST;

    /* renamed from: a */
    public final int m2406a(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int iIntValue;
        synchronized (this.f4734j) {
            try {
                iIntValue = this.f4735k.containsKey(eventDispatcher) ? ((Integer) this.f4735k.get(eventDispatcher)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f4734j) {
            it = this.f4737m.iterator();
        }
        return it;
    }
}
