package p063h1;

import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.a0 */
/* loaded from: classes.dex */
public final class C1102a0 {

    /* renamed from: a */
    public Message f4712a;

    /* renamed from: a */
    public final void m2376a() {
        this.f4712a = null;
        ArrayList arrayList = C1104b0.f4714b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m2377b() {
        Message message = this.f4712a;
        message.getClass();
        message.sendToTarget();
        m2376a();
    }
}
