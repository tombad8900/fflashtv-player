package p105m0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.l0 */
/* loaded from: classes.dex */
public final class C1825l0 {

    /* renamed from: d */
    public static final ArrayList f6904d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f6905a;

    /* renamed from: b */
    public SparseArray f6906b;

    /* renamed from: c */
    public WeakReference f6907c;

    /* renamed from: a */
    public final View m3592a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f6905a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM3592a = m3592a(viewGroup.getChildAt(childCount));
                if (viewM3592a != null) {
                    return viewM3592a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        throw AbstractC0008a1.m10f(size, arrayList);
    }
}
