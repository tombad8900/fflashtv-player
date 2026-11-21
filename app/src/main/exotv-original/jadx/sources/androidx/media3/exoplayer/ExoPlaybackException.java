package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ExoPlaybackException extends C0253x0 {
    private static final String FIELD_IS_RECOVERABLE;
    private static final String FIELD_RENDERER_FORMAT;
    private static final String FIELD_RENDERER_FORMAT_SUPPORT;
    private static final String FIELD_RENDERER_INDEX;
    private static final String FIELD_RENDERER_NAME;
    private static final String FIELD_TYPE;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final MediaSource.MediaPeriodId mediaPeriodId;
    public final C0249w rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    static {
        int i = AbstractC1118i0.f4750a;
        FIELD_TYPE = Integer.toString(1001, 36);
        FIELD_RENDERER_NAME = Integer.toString(1002, 36);
        FIELD_RENDERER_INDEX = Integer.toString(1003, 36);
        FIELD_RENDERER_FORMAT = Integer.toString(1004, 36);
        FIELD_RENDERER_FORMAT_SUPPORT = Integer.toString(1005, 36);
        FIELD_IS_RECOVERABLE = Integer.toString(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, 36);
    }

    private ExoPlaybackException(int i, Throwable th, int i4) {
        this(i, th, null, i4, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, C0249w c0249w, int i4, boolean z7, int i8) {
        if (c0249w == null) {
            i4 = 4;
        }
        return new ExoPlaybackException(1, th, null, i8, str, i, c0249w, i4, z7);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i, String str, String str2, int i4, C0249w c0249w, int i8) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i4 + ", format=" + c0249w + ", format_supported=" + AbstractC1118i0.m2410A(i8);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public static ExoPlaybackException fromBundle(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public ExoPlaybackException copyWithMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        String message = getMessage();
        int i = AbstractC1118i0.f4750a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean errorInfoEquals(C0253x0 c0253x0) {
        if (this != c0253x0) {
            if (c0253x0 != null && ExoPlaybackException.class == c0253x0.getClass()) {
                Throwable cause = getCause();
                Throwable cause2 = c0253x0.getCause();
                if (cause != null && cause2 != null) {
                    String message = cause.getMessage();
                    String message2 = cause2.getMessage();
                    int i = AbstractC1118i0.f4750a;
                    if (Objects.equals(message, message2) && cause.getClass().equals(cause2.getClass())) {
                    }
                } else if (cause == null && cause2 == null) {
                    if (this.errorCode == c0253x0.errorCode) {
                        String message3 = getMessage();
                        String message4 = c0253x0.getMessage();
                        int i4 = AbstractC1118i0.f4750a;
                        if (Objects.equals(message3, message4) && this.timestampMs == c0253x0.timestampMs) {
                            int i8 = AbstractC1118i0.f4750a;
                            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) c0253x0;
                            if (this.type == exoPlaybackException.type && Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public Exception getRendererException() {
        AbstractC1101a.m2359j(this.type == 1);
        Throwable cause = getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public IOException getSourceException() {
        AbstractC1101a.m2359j(this.type == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }

    public RuntimeException getUnexpectedException() {
        AbstractC1101a.m2359j(this.type == 2);
        Throwable cause = getCause();
        cause.getClass();
        return (RuntimeException) cause;
    }

    @Override // androidx.media3.common.C0253x0
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putString(FIELD_RENDERER_NAME, this.rendererName);
        bundle.putInt(FIELD_RENDERER_INDEX, this.rendererIndex);
        C0249w c0249w = this.rendererFormat;
        if (c0249w != null) {
            bundle.putBundle(FIELD_RENDERER_FORMAT, c0249w.m694d(false));
        }
        bundle.putInt(FIELD_RENDERER_FORMAT_SUPPORT, this.rendererFormatSupport);
        bundle.putBoolean(FIELD_IS_RECOVERABLE, this.isRecoverable);
        return bundle;
    }

    private ExoPlaybackException(int i, Throwable th, String str, int i4, String str2, int i8, C0249w c0249w, int i9, boolean z7) {
        this(deriveMessage(i, str, str2, i8, c0249w, i9), th, i4, i, str2, i8, c0249w, i9, null, SystemClock.elapsedRealtime(), z7);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(FIELD_TYPE, 2);
        this.rendererName = bundle.getString(FIELD_RENDERER_NAME);
        this.rendererIndex = bundle.getInt(FIELD_RENDERER_INDEX, -1);
        Bundle bundle2 = bundle.getBundle(FIELD_RENDERER_FORMAT);
        this.rendererFormat = bundle2 == null ? null : C0249w.m690b(bundle2);
        this.rendererFormatSupport = bundle.getInt(FIELD_RENDERER_FORMAT_SUPPORT, 4);
        this.isRecoverable = bundle.getBoolean(FIELD_IS_RECOVERABLE, false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(String str, Throwable th, int i, int i4, String str2, int i8, C0249w c0249w, int i9, MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z7) {
        super(str, th, i, Bundle.EMPTY, j);
        AbstractC1101a.m2353d(!z7 || i4 == 1);
        AbstractC1101a.m2353d(th != null || i4 == 3);
        this.type = i4;
        this.rendererName = str2;
        this.rendererIndex = i8;
        this.rendererFormat = c0249w;
        this.rendererFormatSupport = i9;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z7;
    }
}
