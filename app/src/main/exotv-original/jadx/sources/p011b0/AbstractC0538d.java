package p011b0;

import android.app.Notification;
import android.content.Context;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0538d {
    /* renamed from: a */
    public static String m1265a(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: b */
    public static void m1266b(Notification.Builder builder, boolean z7) {
        builder.setAllowSystemGeneratedContextualActions(z7);
    }

    /* renamed from: c */
    public static void m1267c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }
}
