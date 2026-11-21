package p063h1;

import android.opengl.GLES20;
import java.util.HashMap;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.i */
/* loaded from: classes.dex */
public final class C1117i {

    /* renamed from: a */
    public final int f4745a;

    /* renamed from: b */
    public final C2819f[] f4746b;

    /* renamed from: c */
    public final C2819f[] f4747c;

    /* renamed from: d */
    public final HashMap f4748d;

    /* renamed from: e */
    public final HashMap f4749e;

    public C1117i(String str, String str2) throws C1119j {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f4745a = iGlCreateProgram;
        AbstractC1101a.m2354e();
        m2408a(str, iGlCreateProgram, 35633);
        m2408a(str2, iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        AbstractC1101a.m2355f("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f4748d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f4746b = new C2819f[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i4 = this.f4745a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i8 = iArr3[0];
            byte[] bArr = new byte[i8];
            GLES20.glGetActiveAttrib(i4, i, i8, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    break;
                }
                if (bArr[i9] == 0) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            String str3 = new String(bArr, 0, i8);
            GLES20.glGetAttribLocation(i4, str3);
            C2819f c2819f = new C2819f(20);
            this.f4746b[i] = c2819f;
            this.f4748d.put(str3, c2819f);
        }
        this.f4749e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f4745a, 35718, iArr4, 0);
        this.f4747c = new C2819f[iArr4[0]];
        for (int i10 = 0; i10 < iArr4[0]; i10++) {
            int i11 = this.f4745a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i11, 35719, iArr5, 0);
            int i12 = iArr5[0];
            byte[] bArr2 = new byte[i12];
            GLES20.glGetActiveUniform(i11, i10, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (bArr2[i13] == 0) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
            String str4 = new String(bArr2, 0, i12);
            GLES20.glGetUniformLocation(i11, str4);
            C2819f c2819f2 = new C2819f(21);
            this.f4747c[i10] = c2819f2;
            this.f4749e.put(str4, c2819f2);
        }
        AbstractC1101a.m2354e();
    }

    /* renamed from: a */
    public static void m2408a(String str, int i, int i4) throws C1119j {
        int iGlCreateShader = GLES20.glCreateShader(i4);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC1101a.m2355f(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC1101a.m2354e();
    }

    /* renamed from: b */
    public final int m2409b(String str) throws C1119j {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f4745a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC1101a.m2354e();
        return iGlGetAttribLocation;
    }
}
