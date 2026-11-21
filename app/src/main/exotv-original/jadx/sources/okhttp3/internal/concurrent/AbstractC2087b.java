package okhttp3.internal.concurrent;

import androidx.media3.common.C0253x0;
import java.util.Arrays;
import java.util.logging.Level;
import okhttp3.internal.http2.C2122f;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.concurrent.b */
/* loaded from: classes.dex */
public abstract class AbstractC2087b {
    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / C2122f.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / C0253x0.CUSTOM_ERROR_CODE_BASE) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " \u00b5s";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " \u00b5s";
        } else if (j < 999500000) {
            str = ((j + 500000) / C0253x0.CUSTOM_ERROR_CODE_BASE) + " ms";
        } else {
            str = ((j + 500000000) / C2122f.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(AbstractC2086a abstractC2086a, C2088c c2088c, String str) {
        C2090e.Companion.getLogger().fine(c2088c.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC2086a.getName());
    }

    public static final <T> T logElapsed(AbstractC2086a abstractC2086a, C2088c c2088c, InterfaceC2840a interfaceC2840a) {
        long jNanoTime;
        AbstractC2980h.m5136e("task", abstractC2086a);
        AbstractC2980h.m5136e("queue", c2088c);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        boolean zIsLoggable = C2090e.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = c2088c.getTaskRunner$okhttp().getBackend().nanoTime();
            log(abstractC2086a, c2088c, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t8 = (T) interfaceC2840a.invoke();
            if (zIsLoggable) {
                log(abstractC2086a, c2088c, "finished run in " + formatDuration(c2088c.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return t8;
        } catch (Throwable th) {
            if (zIsLoggable) {
                log(abstractC2086a, c2088c, "failed a run in " + formatDuration(c2088c.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            throw th;
        }
    }

    public static final void taskLog(AbstractC2086a abstractC2086a, C2088c c2088c, InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("task", abstractC2086a);
        AbstractC2980h.m5136e("queue", c2088c);
        AbstractC2980h.m5136e("messageBlock", interfaceC2840a);
        if (C2090e.Companion.getLogger().isLoggable(Level.FINE)) {
            log(abstractC2086a, c2088c, (String) interfaceC2840a.invoke());
        }
    }
}
