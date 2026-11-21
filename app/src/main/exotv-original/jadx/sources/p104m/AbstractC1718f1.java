package p104m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.f1 */
/* loaded from: classes.dex */
public abstract class AbstractC1718f1 {

    /* renamed from: a */
    public static final Method f6541a;

    /* renamed from: b */
    public static final Method f6542b;

    /* renamed from: c */
    public static final Method f6543c;

    /* renamed from: d */
    public static final boolean f6544d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f6541a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f6542b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f6543c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f6544d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
