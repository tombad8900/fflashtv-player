package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.util.Locale;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1119j;
import p063h1.RunnableC1115h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final PlaceholderSurfaceThread thread;
    private boolean threadReleased;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private RunnableC1115h eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private PlaceholderSurface surface;

        public PlaceholderSurfaceThread() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void initInternal(int i) throws C1119j {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.eglSurfaceTexture.getClass();
            RunnableC1115h runnableC1115h = this.eglSurfaceTexture;
            int[] iArr = runnableC1115h.f4740k;
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            AbstractC1101a.m2355f("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr2 = new int[2];
            AbstractC1101a.m2355f("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
            runnableC1115h.f4741l = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC1115h.f4738p, 0, eGLConfigArr, 0, 1, iArr3, 0);
            boolean z7 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
            int i4 = AbstractC1118i0.f4750a;
            AbstractC1101a.m2355f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z7);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC1115h.f4741l, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            AbstractC1101a.m2355f("eglCreateContext failed", eGLContextEglCreateContext != null);
            runnableC1115h.f4742m = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = runnableC1115h.f4741l;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                AbstractC1101a.m2355f("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            AbstractC1101a.m2355f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            runnableC1115h.f4743n = eGLSurfaceEglCreatePbufferSurface;
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC1101a.m2354e();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            runnableC1115h.f4744o = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(runnableC1115h);
            SurfaceTexture surfaceTexture2 = this.eglSurfaceTexture.f4744o;
            surfaceTexture2.getClass();
            this.surface = new PlaceholderSurface(this, surfaceTexture2, i != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void releaseInternal() {
            this.eglSurfaceTexture.getClass();
            RunnableC1115h runnableC1115h = this.eglSurfaceTexture;
            runnableC1115h.f4739j.removeCallbacks(runnableC1115h);
            try {
                SurfaceTexture surfaceTexture = runnableC1115h.f4744o;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, runnableC1115h.f4740k, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = runnableC1115h.f4741l;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = runnableC1115h.f4741l;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = runnableC1115h.f4743n;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(runnableC1115h.f4741l, runnableC1115h.f4743n);
                }
                EGLContext eGLContext = runnableC1115h.f4742m;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(runnableC1115h.f4741l, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = runnableC1115h.f4741l;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(runnableC1115h.f4741l);
                }
                runnableC1115h.f4741l = null;
                runnableC1115h.f4742m = null;
                runnableC1115h.f4743n = null;
                runnableC1115h.f4744o = null;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    try {
                        initInternal(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (C1119j e) {
                        AbstractC1101a.m2365p(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e);
                        this.initException = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e8) {
                    AbstractC1101a.m2365p(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e8);
                    this.initError = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    AbstractC1101a.m2365p(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e9);
                    this.initException = e9;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public PlaceholderSurface init(int i) {
            boolean z7;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.handler = handler;
            this.eglSurfaceTexture = new RunnableC1115h(handler);
            synchronized (this) {
                z7 = false;
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.initError;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = this.surface;
            placeholderSurface.getClass();
            return placeholderSurface;
        }

        public void release() {
            this.handler.getClass();
            this.handler.sendEmptyMessage(2);
        }
    }

    private static int getSecureMode(Context context) {
        String strEglQueryString;
        int i = AbstractC1118i0.f4750a;
        if (i < 24 || ((i < 26 && ("samsung".equals(AbstractC1118i0.f4752c) || "XT1650".equals(AbstractC1118i0.f4753d))) || ((i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return (strEglQueryString2 == null || !strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 2 : 1;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = getSecureMode(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return secureMode != 0;
    }

    public static PlaceholderSurface newInstance(Context context, boolean z7) {
        AbstractC1101a.m2359j(!z7 || isSecureSupported(context));
        return new PlaceholderSurfaceThread().init(z7 ? secureMode : 0);
    }

    @Deprecated
    public static PlaceholderSurface newInstanceV17(Context context, boolean z7) {
        return newInstance(context, z7);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.release();
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z7) {
        super(surfaceTexture);
        this.thread = placeholderSurfaceThread;
        this.secure = z7;
    }
}
