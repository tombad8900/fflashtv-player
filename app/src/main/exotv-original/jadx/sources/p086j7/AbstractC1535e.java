package p086j7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.bumptech.glide.AbstractC0714c;
import java.lang.reflect.InvocationTargetException;
import p102l6.C1688e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j7.e */
/* loaded from: classes.dex */
public abstract class AbstractC1535e {
    private static volatile Choreographer choreographer;

    static {
        Object objM1539y;
        try {
            objM1539y = new C1534d(m3215a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objM1539y = AbstractC0714c.m1539y(th);
        }
        if (objM1539y instanceof C1688e) {
            objM1539y = null;
        }
    }

    /* renamed from: a */
    public static final Handler m3215a(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC2980h.m5134c("null cannot be cast to non-null type android.os.Handler", objInvoke);
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
