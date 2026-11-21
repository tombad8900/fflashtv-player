package p063h1;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.s */
/* loaded from: classes.dex */
public abstract class AbstractC1128s {
    /* renamed from: a */
    public static void m2477a(Context context, C1129t c1129t) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C1127r c1127r = new C1127r(c1129t);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c1127r);
            telephonyManager.unregisterTelephonyCallback(c1127r);
        } catch (RuntimeException unused) {
            C1129t.m2478a(5, c1129t);
        }
    }
}
