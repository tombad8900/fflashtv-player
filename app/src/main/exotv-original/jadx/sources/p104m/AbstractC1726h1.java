package p104m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC1726h1 {

    /* renamed from: a */
    public static final Field f6560a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f6560a = declaredField;
    }
}
