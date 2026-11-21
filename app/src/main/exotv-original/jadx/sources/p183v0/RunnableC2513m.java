package p183v0;

import android.os.Trace;
import p070i0.AbstractC1221f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.m */
/* loaded from: classes.dex */
public final class RunnableC2513m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC1221f.f5104a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C2510j.f9142k != null) {
                C2510j.m4522a().m4524c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i4 = AbstractC1221f.f5104a;
            Trace.endSection();
            throw th;
        }
    }
}
