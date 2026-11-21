package p063h1;

import android.app.Notification;
import android.app.Service;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC1116h0 {
    /* renamed from: a */
    public static void m2407a(Service service, int i, Notification notification) {
        try {
            service.startForeground(i, notification, 1);
        } catch (RuntimeException e) {
            AbstractC1101a.m2364o("Util", "The service must be declared with a foregroundServiceType that includes dataSync");
            throw e;
        }
    }
}
