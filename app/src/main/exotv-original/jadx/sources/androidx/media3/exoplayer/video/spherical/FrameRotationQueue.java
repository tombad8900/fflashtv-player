package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import p063h1.C1106c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class FrameRotationQueue {
    private boolean recenterMatrixComputed;
    private final float[] recenterMatrix = new float[16];
    private final float[] rotationMatrix = new float[16];
    private final C1106c0 rotations = new C1106c0();

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f8 = fArr2[10];
        float f9 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f9 * f9) + (f8 * f8));
        float f10 = fArr2[10];
        fArr[0] = f10 / fSqrt;
        float f11 = fArr2[8];
        fArr[2] = f11 / fSqrt;
        fArr[8] = (-f11) / fSqrt;
        fArr[10] = f10 / fSqrt;
    }

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
        float f8 = fArr2[0];
        float f9 = -fArr2[1];
        float f10 = -fArr2[2];
        float length = Matrix.length(f8, f9, f10);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f8 / length, f9 / length, f10 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.rotations.m2392f(j);
        if (fArr2 == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.rotationMatrix, fArr2);
        if (!this.recenterMatrixComputed) {
            computeRecenterMatrix(this.recenterMatrix, this.rotationMatrix);
            this.recenterMatrixComputed = true;
        }
        Matrix.multiplyMM(fArr, 0, this.recenterMatrix, 0, this.rotationMatrix, 0);
        return true;
    }

    public void reset() {
        this.rotations.m2388b();
        this.recenterMatrixComputed = false;
    }

    public void setRotation(long j, float[] fArr) {
        this.rotations.m2387a(fArr, j);
    }
}
