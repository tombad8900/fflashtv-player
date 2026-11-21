package androidx.media3.exoplayer.video.spherical;

import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    public static Projection decode(byte[] bArr, int i) {
        ArrayList<Projection.Mesh> proj;
        C1132w c1132w = new C1132w(bArr);
        try {
            proj = isProj(c1132w) ? parseProj(c1132w) : parseMshp(c1132w);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i);
    }

    private static int decodeZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean isProj(C1132w c1132w) {
        c1132w.m2514H(4);
        int iM2521g = c1132w.m2521g();
        c1132w.m2513G(0);
        return iM2521g == TYPE_PROJ;
    }

    private static Projection.Mesh parseMesh(C1132w c1132w) {
        int iM2521g = c1132w.m2521g();
        Projection.Mesh mesh = null;
        if (iM2521g > 10000) {
            return null;
        }
        float[] fArr = new float[iM2521g];
        for (int i = 0; i < iM2521g; i++) {
            fArr[i] = Float.intBitsToFloat(c1132w.m2521g());
        }
        int iM2521g2 = c1132w.m2521g();
        if (iM2521g2 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d8 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(iM2521g * 2.0d) / dLog);
        byte[] bArr = c1132w.f4799a;
        C1131v c1131v = new C1131v(bArr, bArr.length);
        int i4 = 8;
        c1131v.m2502s(c1132w.f4800b * 8);
        float[] fArr2 = new float[iM2521g2 * 5];
        int[] iArr = new int[5];
        int i8 = 0;
        int i9 = 0;
        while (i8 < iM2521g2) {
            Projection.Mesh mesh2 = mesh;
            int i10 = 0;
            while (i10 < 5) {
                int iDecodeZigZag = iArr[i10] + decodeZigZag(c1131v.m2494k(iCeil));
                if (iDecodeZigZag >= iM2521g || iDecodeZigZag < 0) {
                    return mesh2;
                }
                fArr2[i9] = fArr[iDecodeZigZag];
                iArr[i10] = iDecodeZigZag;
                i10++;
                i9++;
            }
            i8++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        c1131v.m2502s((c1131v.m2492i() + 7) & (-8));
        int i11 = 32;
        int iM2494k = c1131v.m2494k(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[iM2494k];
        int i12 = 0;
        while (i12 < iM2494k) {
            int iM2494k2 = c1131v.m2494k(i4);
            int iM2494k3 = c1131v.m2494k(i4);
            int iM2494k4 = c1131v.m2494k(i11);
            if (iM2494k4 > MAX_TRIANGLE_INDICES) {
                return mesh3;
            }
            int i13 = iM2494k;
            int iCeil2 = (int) Math.ceil(Math.log(iM2521g2 * d8) / dLog);
            float[] fArr3 = new float[iM2494k4 * 3];
            float[] fArr4 = new float[iM2494k4 * 2];
            int i14 = 0;
            int i15 = 0;
            while (i14 < iM2494k4) {
                int iDecodeZigZag2 = i15 + decodeZigZag(c1131v.m2494k(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= iM2521g2) {
                    return mesh3;
                }
                int i16 = i14 * 3;
                int i17 = iDecodeZigZag2 * 5;
                fArr3[i16] = fArr2[i17];
                fArr3[i16 + 1] = fArr2[i17 + 1];
                fArr3[i16 + 2] = fArr2[i17 + 2];
                int i18 = i14 * 2;
                fArr4[i18] = fArr2[i17 + 3];
                fArr4[i18 + 1] = fArr2[i17 + 4];
                i14++;
                i15 = iDecodeZigZag2;
            }
            subMeshArr[i12] = new Projection.SubMesh(iM2494k2, fArr3, fArr4, iM2494k3);
            i12++;
            iM2494k = i13;
            i11 = 32;
            d8 = 2.0d;
            i4 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    private static ArrayList<Projection.Mesh> parseMshp(C1132w c1132w) {
        if (c1132w.m2535u() != 0) {
            return null;
        }
        c1132w.m2514H(7);
        int iM2521g = c1132w.m2521g();
        if (iM2521g == TYPE_DFL8) {
            C1132w c1132w2 = new C1132w();
            Inflater inflater = new Inflater(true);
            try {
                if (!AbstractC1118i0.m2421L(c1132w, c1132w2, inflater)) {
                    return null;
                }
                inflater.end();
                c1132w = c1132w2;
            } finally {
                inflater.end();
            }
        } else if (iM2521g != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(c1132w);
    }

    private static ArrayList<Projection.Mesh> parseProj(C1132w c1132w) {
        int iM2521g;
        c1132w.m2514H(8);
        int i = c1132w.f4800b;
        int i4 = c1132w.f4801c;
        while (i < i4 && (iM2521g = c1132w.m2521g() + i) > i && iM2521g <= i4) {
            int iM2521g2 = c1132w.m2521g();
            if (iM2521g2 == TYPE_YTMP || iM2521g2 == TYPE_MSHP) {
                c1132w.m2512F(iM2521g);
                return parseMshp(c1132w);
            }
            c1132w.m2513G(iM2521g);
            i = iM2521g;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(C1132w c1132w) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int i = c1132w.f4800b;
        int i4 = c1132w.f4801c;
        while (i < i4) {
            int iM2521g = c1132w.m2521g() + i;
            if (iM2521g <= i || iM2521g > i4) {
                return null;
            }
            if (c1132w.m2521g() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(c1132w);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            c1132w.m2513G(iM2521g);
            i = iM2521g;
        }
        return arrayList;
    }
}
