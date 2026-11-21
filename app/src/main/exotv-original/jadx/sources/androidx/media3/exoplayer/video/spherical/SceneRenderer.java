package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p063h1.AbstractC1101a;
import p063h1.C1106c0;
import p063h1.C1119j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private static final String TAG = "SceneRenderer";
    private byte[] lastProjectionData;
    private SurfaceTexture surfaceTexture;
    private int textureId;
    private final AtomicBoolean frameAvailable = new AtomicBoolean();
    private final AtomicBoolean resetRotationAtNextFrame = new AtomicBoolean(true);
    private final ProjectionRenderer projectionRenderer = new ProjectionRenderer();
    private final FrameRotationQueue frameRotationQueue = new FrameRotationQueue();
    private final C1106c0 sampleTimestampQueue = new C1106c0();
    private final C1106c0 projectionQueue = new C1106c0();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(SurfaceTexture surfaceTexture) {
        this.frameAvailable.set(true);
    }

    private void setProjection(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.lastProjectionData;
        int i4 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i == -1) {
            i = this.defaultStereoMode;
        }
        this.lastStereoMode = i;
        if (i4 == i && Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        Projection projectionDecode = bArr3 != null ? ProjectionDecoder.decode(bArr3, this.lastStereoMode) : null;
        if (projectionDecode == null || !ProjectionRenderer.isSupported(projectionDecode)) {
            projectionDecode = Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.m2387a(projectionDecode, j);
    }

    public void drawFrame(float[] fArr, boolean z7) {
        Object objM2390d;
        GLES20.glClear(16384);
        try {
            AbstractC1101a.m2354e();
        } catch (C1119j e) {
            AbstractC1101a.m2365p(TAG, "Failed to draw a frame", e);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC1101a.m2354e();
            } catch (C1119j e8) {
                AbstractC1101a.m2365p(TAG, "Failed to draw a frame", e8);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.rotationMatrix, 0);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            C1106c0 c1106c0 = this.sampleTimestampQueue;
            synchronized (c1106c0) {
                objM2390d = c1106c0.m2390d(timestamp, false);
            }
            Long l8 = (Long) objM2390d;
            if (l8 != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, l8.longValue());
            }
            Projection projection = (Projection) this.projectionQueue.m2392f(timestamp);
            if (projection != null) {
                this.projectionRenderer.setProjection(projection);
            }
        }
        Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z7);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC1101a.m2354e();
            this.projectionRenderer.init();
            AbstractC1101a.m2354e();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC1101a.m2354e();
            int i = iArr[0];
            AbstractC1101a.m2351b(36197, i);
            this.textureId = i;
        } catch (C1119j e) {
            AbstractC1101a.m2365p(TAG, "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f1911j.lambda$init$0(surfaceTexture2);
            }
        });
        return this.surfaceTexture;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
        this.frameRotationQueue.setRotation(j, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.m2388b();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j8, C0249w c0249w, MediaFormat mediaFormat) {
        this.sampleTimestampQueue.m2387a(Long.valueOf(j), j8);
        setProjection(c0249w.f1534z, c0249w.f1496A, j8);
    }

    public void setDefaultStereoMode(int i) {
        this.defaultStereoMode = i;
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }
}
