package p087k;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.f */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1541f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final Class[] f5873c = {MenuItem.class};

    /* renamed from: a */
    public Object f5874a;

    /* renamed from: b */
    public Method f5875b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f5874a;
        Method method = this.f5875b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
