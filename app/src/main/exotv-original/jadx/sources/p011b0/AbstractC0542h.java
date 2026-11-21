package p011b0;

import android.app.Notification;
import android.content.Context;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b0.h */
/* loaded from: classes.dex */
public abstract class AbstractC0542h {
    /* renamed from: a */
    public static Notification.Builder m1270a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: b */
    public static void m1271b(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    /* renamed from: c */
    public static void m1272c(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    /* renamed from: d */
    public static void m1273d(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    /* renamed from: e */
    public static void m1274e(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    /* renamed from: f */
    public static void m1275f(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
