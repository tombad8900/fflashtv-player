package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.C2072e0;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.http2.C2121e;
import p069h7.AbstractC1206h;
import p111m6.AbstractC1924s;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.c */
/* loaded from: classes.dex */
public final class C2137c {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final C2137c INSTANCE = new C2137c();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C2072e0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C2072e0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C2121e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C2090e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = AbstractC1924s.m3763X(linkedHashMap);
    }

    private C2137c() {
    }

    private final void enableLogging(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C2138d.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        return str2 == null ? AbstractC1206h.m2644R0(23, str) : str2;
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
        int iMin;
        AbstractC2980h.m5136e("loggerName", str);
        AbstractC2980h.m5136e("message", str2);
        String strLoggerTag = loggerTag(str);
        if (Log.isLoggable(strLoggerTag, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i4 = 0;
            while (i4 < length) {
                int iM2627A0 = AbstractC1206h.m2627A0(str2, '\n', i4, 4);
                if (iM2627A0 == -1) {
                    iM2627A0 = length;
                }
                while (true) {
                    iMin = Math.min(iM2627A0, i4 + MAX_LOG_LENGTH);
                    String strSubstring = str2.substring(i4, iMin);
                    AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
                    Log.println(i, strLoggerTag, strSubstring);
                    if (iMin >= iM2627A0) {
                        break;
                    } else {
                        i4 = iMin;
                    }
                }
                i4 = iMin + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
