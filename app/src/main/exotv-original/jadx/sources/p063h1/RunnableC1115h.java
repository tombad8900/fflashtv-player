package p063h1;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.h */
/* loaded from: classes.dex */
public final class RunnableC1115h implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: p */
    public static final int[] f4738p = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: j */
    public final Handler f4739j;

    /* renamed from: k */
    public final int[] f4740k = new int[1];

    /* renamed from: l */
    public EGLDisplay f4741l;

    /* renamed from: m */
    public EGLContext f4742m;

    /* renamed from: n */
    public EGLSurface f4743n;

    /* renamed from: o */
    public SurfaceTexture f4744o;

    public RunnableC1115h(Handler handler) {
        this.f4739j = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4739j.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f4744o;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
