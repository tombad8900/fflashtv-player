package p062h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.z */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1100z implements View.OnClickListener {

    /* renamed from: j */
    public final View f4707j;

    /* renamed from: k */
    public final String f4708k;

    /* renamed from: l */
    public Method f4709l;

    /* renamed from: m */
    public Context f4710m;

    public ViewOnClickListenerC1100z(View view, String str) {
        this.f4707j = view;
        this.f4708k = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f4709l == null) {
            View view2 = this.f4707j;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f4708k;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = C2181z.FRAGMENT_ENCODE_SET;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f4709l = method;
                        this.f4710m = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f4709l.invoke(this.f4710m, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e8) {
            throw new IllegalStateException("Could not execute method for android:onClick", e8);
        }
    }
}
