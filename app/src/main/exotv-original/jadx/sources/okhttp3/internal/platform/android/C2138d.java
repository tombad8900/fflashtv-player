package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.d */
/* loaded from: classes.dex */
public final class C2138d extends Handler {
    public static final C2138d INSTANCE = new C2138d();

    private C2138d() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        AbstractC2980h.m5136e("record", logRecord);
        C2137c c2137c = C2137c.INSTANCE;
        String loggerName = logRecord.getLoggerName();
        AbstractC2980h.m5135d("record.loggerName", loggerName);
        int androidLevel = AbstractC2139e.getAndroidLevel(logRecord);
        String message = logRecord.getMessage();
        AbstractC2980h.m5135d("record.message", message);
        c2137c.androidLog$okhttp(loggerName, androidLevel, message, logRecord.getThrown());
    }
}
