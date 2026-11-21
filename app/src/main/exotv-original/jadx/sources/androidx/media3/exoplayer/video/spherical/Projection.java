package androidx.media3.exoplayer.video.spherical;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i4) {
            this.textureId = i;
            AbstractC1101a.m2353d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i4;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f8, int i, int i4, float f9, float f10, int i8) {
        int i9;
        int i10 = i;
        AbstractC1101a.m2353d(f8 > 0.0f);
        AbstractC1101a.m2353d(i10 >= 1);
        AbstractC1101a.m2353d(i4 >= 1);
        AbstractC1101a.m2353d(f9 > 0.0f && f9 <= 180.0f);
        AbstractC1101a.m2353d(f10 > 0.0f && f10 <= 360.0f);
        float radians = (float) Math.toRadians(f9);
        float radians2 = (float) Math.toRadians(f10);
        float f11 = radians / i10;
        float f12 = radians2 / i4;
        int i11 = i4 + 1;
        int i12 = ((i11 * 2) + 2) * i10;
        float[] fArr = new float[i12 * 3];
        float[] fArr2 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i10) {
            float f13 = radians / 2.0f;
            float f14 = (i13 * f11) - f13;
            int i16 = i13 + 1;
            float f15 = (i16 * f11) - f13;
            int i17 = 0;
            while (i17 < i11) {
                float f16 = radians;
                float f17 = radians2;
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    float f18 = f11;
                    float f19 = i17 * f12;
                    float f20 = f12;
                    float f21 = f14;
                    double d8 = f8;
                    double d9 = (f19 + 3.1415927f) - (f17 / 2.0f);
                    double d10 = i18 == 0 ? f14 : f15;
                    fArr[i14] = -((float) (Math.cos(d10) * Math.sin(d9) * d8));
                    fArr[i14 + 1] = (float) (Math.sin(d10) * d8);
                    int i20 = i14 + 3;
                    fArr[i14 + 2] = (float) (Math.cos(d10) * Math.cos(d9) * d8);
                    fArr2[i15] = f19 / f17;
                    int i21 = i15 + 2;
                    fArr2[i15 + 1] = ((i13 + i18) * f18) / f16;
                    if ((i17 == 0 && i18 == 0) || (i17 == i4 && i18 == 1)) {
                        System.arraycopy(fArr, i14, fArr, i20, 3);
                        i14 += 6;
                        i9 = 2;
                        System.arraycopy(fArr2, i15, fArr2, i21, 2);
                        i15 += 4;
                    } else {
                        i9 = 2;
                        i14 = i20;
                        i15 = i21;
                    }
                    i18++;
                    i19 = i9;
                    f11 = f18;
                    f12 = f20;
                    f14 = f21;
                }
                i17++;
                radians2 = f17;
                radians = f16;
                f11 = f11;
            }
            i10 = i;
            i13 = i16;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i8);
    }
}
