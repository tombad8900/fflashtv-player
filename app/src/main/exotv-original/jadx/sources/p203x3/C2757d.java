package p203x3;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import p002a1.C0016e;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x3.d */
/* loaded from: classes.dex */
public final class C2757d {

    /* renamed from: a */
    public int[] f10185a;

    /* renamed from: c */
    public final C0016e f10187c;

    /* renamed from: d */
    public ByteBuffer f10188d;

    /* renamed from: e */
    public byte[] f10189e;

    /* renamed from: f */
    public short[] f10190f;

    /* renamed from: g */
    public byte[] f10191g;

    /* renamed from: h */
    public byte[] f10192h;

    /* renamed from: i */
    public byte[] f10193i;

    /* renamed from: j */
    public final int[] f10194j;

    /* renamed from: k */
    public int f10195k;

    /* renamed from: l */
    public C2755b f10196l;

    /* renamed from: m */
    public Bitmap f10197m;

    /* renamed from: n */
    public final boolean f10198n;

    /* renamed from: o */
    public int f10199o;

    /* renamed from: p */
    public final int f10200p;

    /* renamed from: q */
    public final int f10201q;

    /* renamed from: r */
    public final int f10202r;

    /* renamed from: s */
    public Boolean f10203s;

    /* renamed from: b */
    public final int[] f10186b = new int[256];

    /* renamed from: t */
    public Bitmap.Config f10204t = Bitmap.Config.ARGB_8888;

    public C2757d(C0016e c0016e, C2755b c2755b, ByteBuffer byteBuffer, int i) {
        this.f10187c = c0016e;
        this.f10196l = new C2755b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i4 = 0;
                this.f10199o = 0;
                this.f10196l = c2755b;
                this.f10195k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f10188d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f10188d.order(ByteOrder.LITTLE_ENDIAN);
                this.f10198n = false;
                ArrayList arrayList = c2755b.f10174e;
                int size = arrayList.size();
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    if (((C2754a) obj).f10165g == 3) {
                        this.f10198n = true;
                        break;
                    }
                }
                this.f10200p = iHighestOneBit;
                int i8 = c2755b.f10175f;
                this.f10202r = i8 / iHighestOneBit;
                int i9 = c2755b.f10176g;
                this.f10201q = i9 / iHighestOneBit;
                int i10 = i8 * i9;
                C0572f c0572f = (C0572f) this.f10187c.f63l;
                this.f10193i = c0572f == null ? new byte[i10] : (byte[]) c0572f.m1319c(i10, byte[].class);
                C0016e c0016e2 = this.f10187c;
                int i11 = this.f10202r * this.f10201q;
                C0572f c0572f2 = (C0572f) c0016e2.f63l;
                this.f10194j = c0572f2 == null ? new int[i11] : (int[]) c0572f2.m1319c(i11, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final Bitmap m4843a() {
        Boolean bool = this.f10203s;
        Bitmap bitmapMo1308d = ((InterfaceC0567a) this.f10187c.f62k).mo1308d(this.f10202r, this.f10201q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f10204t);
        bitmapMo1308d.setHasAlpha(true);
        return bitmapMo1308d;
    }

    /* renamed from: b */
    public final synchronized Bitmap m4844b() {
        try {
            if (this.f10196l.f10172c <= 0 || this.f10195k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f10196l.f10172c + ", framePointer=" + this.f10195k);
                }
                this.f10199o = 1;
            }
            int i = this.f10199o;
            if (i != 1 && i != 2) {
                this.f10199o = 0;
                if (this.f10189e == null) {
                    C0572f c0572f = (C0572f) this.f10187c.f63l;
                    this.f10189e = c0572f == null ? new byte[255] : (byte[]) c0572f.m1319c(255, byte[].class);
                }
                C2754a c2754a = (C2754a) this.f10196l.f10174e.get(this.f10195k);
                int i4 = this.f10195k - 1;
                C2754a c2754a2 = i4 >= 0 ? (C2754a) this.f10196l.f10174e.get(i4) : null;
                int[] iArr = c2754a.f10169k;
                if (iArr == null) {
                    iArr = this.f10196l.f10170a;
                }
                this.f10185a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f10195k);
                    }
                    this.f10199o = 1;
                    return null;
                }
                if (c2754a.f10164f) {
                    System.arraycopy(iArr, 0, this.f10186b, 0, iArr.length);
                    int[] iArr2 = this.f10186b;
                    this.f10185a = iArr2;
                    iArr2[c2754a.f10166h] = 0;
                    if (c2754a.f10165g == 2 && this.f10195k == 0) {
                        this.f10203s = Boolean.TRUE;
                    }
                }
                return m4846d(c2754a, c2754a2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f10199o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final void m4845c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f10204t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc A[PHI: r5
      0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m4846d(C2754a c2754a, C2754a c2754a2) {
        int[] iArr;
        byte b7;
        int i;
        int i4;
        int i8;
        int i9;
        int[] iArr2;
        int i10;
        short[] sArr;
        short s8;
        short s9;
        int i11;
        Bitmap bitmap;
        C0016e c0016e = this.f10187c;
        byte b8 = 0;
        int[] iArr3 = this.f10194j;
        if (c2754a2 == null) {
            Bitmap bitmap2 = this.f10197m;
            if (bitmap2 != null) {
                ((InterfaceC0567a) c0016e.f62k).mo1309e(bitmap2);
            }
            this.f10197m = null;
            Arrays.fill(iArr3, 0);
        }
        if (c2754a2 != null && c2754a2.f10165g == 3 && this.f10197m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (c2754a2 != null && (i11 = c2754a2.f10165g) > 0) {
            if (i11 == 2) {
                if (!c2754a.f10164f) {
                    C2755b c2755b = this.f10196l;
                    int i12 = c2755b.f10180k;
                    if (c2754a.f10169k != null && c2755b.f10179j == c2754a.f10166h) {
                        i12 = 0;
                    }
                    int i13 = c2754a2.f10162d;
                    int i14 = this.f10200p;
                    int i15 = i13 / i14;
                    int i16 = c2754a2.f10160b / i14;
                    int i17 = c2754a2.f10161c / i14;
                    int i18 = c2754a2.f10159a / i14;
                    int i19 = this.f10202r;
                    int i20 = (i16 * i19) + i18;
                    int i21 = (i15 * i19) + i20;
                    while (i20 < i21) {
                        int i22 = i20 + i17;
                        for (int i23 = i20; i23 < i22; i23++) {
                            iArr3[i23] = i12;
                        }
                        i20 += this.f10202r;
                    }
                }
            } else if (i11 == 3 && (bitmap = this.f10197m) != null) {
                int i24 = this.f10201q;
                int i25 = this.f10202r;
                bitmap.getPixels(iArr3, 0, i25, 0, 0, i25, i24);
            }
        }
        this.f10188d.position(c2754a.f10168j);
        int i26 = c2754a.f10161c * c2754a.f10162d;
        byte[] bArr = this.f10193i;
        if (bArr == null || bArr.length < i26) {
            C0572f c0572f = (C0572f) c0016e.f63l;
            this.f10193i = c0572f == null ? new byte[i26] : (byte[]) c0572f.m1319c(i26, byte[].class);
        }
        byte[] bArr2 = this.f10193i;
        if (this.f10190f == null) {
            this.f10190f = new short[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED];
        }
        short[] sArr2 = this.f10190f;
        if (this.f10191g == null) {
            this.f10191g = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED];
        }
        byte[] bArr3 = this.f10191g;
        if (this.f10192h == null) {
            this.f10192h = new byte[4097];
        }
        byte[] bArr4 = this.f10192h;
        int i27 = this.f10188d.get() & 255;
        int i28 = 1;
        int i29 = 1 << i27;
        int i30 = i29 + 1;
        int i31 = i29 + 2;
        int i32 = i27 + 1;
        int i33 = (1 << i32) - 1;
        int i34 = 0;
        while (i34 < i29) {
            sArr2[i34] = 0;
            bArr3[i34] = (byte) i34;
            i34++;
            i28 = i28;
        }
        int i35 = i28;
        byte[] bArr5 = this.f10189e;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = i32;
        int i45 = i31;
        int i46 = i33;
        short s10 = -1;
        while (true) {
            if (i36 >= i26) {
                iArr = iArr3;
                b7 = b8;
                break;
            }
            if (i37 == 0) {
                s8 = -1;
                int i47 = this.f10188d.get() & 255;
                if (i47 <= 0) {
                    sArr = sArr2;
                    iArr = iArr3;
                } else {
                    ByteBuffer byteBuffer = this.f10188d;
                    sArr = sArr2;
                    iArr = iArr3;
                    byteBuffer.get(this.f10189e, 0, Math.min(i47, byteBuffer.remaining()));
                }
                if (i47 <= 0) {
                    this.f10199o = 3;
                    b7 = 0;
                    break;
                }
                i37 = i47;
                i38 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                s8 = -1;
            }
            i40 += (bArr5[i38] & 255) << i39;
            i38++;
            i37--;
            int i48 = i39 + 8;
            int i49 = i45;
            int i50 = i44;
            short s11 = s10;
            int i51 = i42;
            while (true) {
                i39 = i48;
                if (i48 < i50) {
                    s10 = s11;
                    i42 = i51;
                    i44 = i50;
                    iArr3 = iArr;
                    b8 = 0;
                    i45 = i49;
                    sArr2 = sArr;
                    break;
                }
                int i52 = i40 & i46;
                i40 >>= i50;
                i39 -= i50;
                if (i52 == i29) {
                    i50 = i32;
                    i49 = i31;
                    i46 = i33;
                    i48 = i39;
                    s11 = s8;
                } else {
                    if (i52 == i30) {
                        i45 = i49;
                        i44 = i50;
                        s10 = s11;
                        i42 = i51;
                        sArr2 = sArr;
                        iArr3 = iArr;
                        b8 = 0;
                        break;
                    }
                    int i53 = i50;
                    if (s11 == s8) {
                        bArr2[i41] = bArr3[i52 == true ? 1 : 0];
                        i41++;
                        i36++;
                        s11 = i52 == true ? 1 : 0;
                        i51 = s11;
                        i48 = i39;
                        i50 = i53;
                    } else {
                        if (i52 >= i49) {
                            bArr4[i43] = (byte) i51;
                            i43++;
                            s9 = s11;
                        } else {
                            s9 = i52 == true ? 1 : 0;
                        }
                        while (s9 >= i29) {
                            bArr4[i43] = bArr3[s9];
                            i43++;
                            s9 = sArr[s9];
                        }
                        i51 = bArr3[s9] & 255;
                        byte b9 = (byte) i51;
                        bArr2[i41] = b9;
                        while (true) {
                            i41++;
                            i36++;
                            if (i43 <= 0) {
                                break;
                            }
                            i43--;
                            bArr2[i41] = bArr4[i43];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = s11;
                            bArr3[i49] = b9;
                            i49++;
                            if ((i49 & i46) != 0 || i49 >= 4096) {
                                i50 = i53;
                            } else {
                                i50 = i53 + 1;
                                i46 += i49;
                            }
                            i48 = i39;
                            s11 = i52 == true ? 1 : 0;
                        }
                    }
                    s8 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i41, i26, b7);
        if (c2754a.f10163e || this.f10200p != i35) {
            int i54 = c2754a.f10162d;
            int i55 = this.f10200p;
            int i56 = i54 / i55;
            int i57 = c2754a.f10160b / i55;
            int i58 = c2754a.f10161c / i55;
            int i59 = c2754a.f10159a / i55;
            boolean z7 = this.f10195k == 0;
            byte[] bArr6 = this.f10193i;
            int[] iArr4 = this.f10185a;
            Boolean bool = this.f10203s;
            int i60 = 8;
            int i61 = 0;
            int i62 = 1;
            int i63 = 0;
            while (i63 < i56) {
                if (c2754a.f10163e) {
                    if (i61 >= i56) {
                        i62++;
                        if (i62 == 2) {
                            i61 = 4;
                        } else if (i62 == 3) {
                            i60 = 4;
                            i61 = 2;
                        } else if (i62 == 4) {
                            i61 = 1;
                            i60 = 2;
                        }
                    }
                    i = i61 + i60;
                } else {
                    i = i61;
                    i61 = i63;
                }
                int i64 = i61 + i57;
                int i65 = i56;
                boolean z8 = i55 == 1;
                if (i64 < this.f10201q) {
                    int i66 = this.f10202r;
                    int i67 = i64 * i66;
                    int i68 = i67 + i59;
                    int i69 = i68 + i58;
                    int i70 = i67 + i66;
                    if (i70 < i69) {
                        i69 = i70;
                    }
                    i4 = i55;
                    int i71 = i63 * i55 * c2754a.f10161c;
                    int[] iArr5 = this.f10194j;
                    if (z8) {
                        int i72 = i68;
                        while (i72 < i69) {
                            int i73 = i72;
                            int i74 = iArr4[bArr6[i71] & 255];
                            if (i74 != 0) {
                                iArr5[i73] = i74;
                            } else if (z7 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i71 += i4;
                            i72 = i73 + 1;
                        }
                    } else {
                        int i75 = ((i69 - i68) * i4) + i71;
                        i8 = i57;
                        int i76 = i68;
                        while (i76 < i69) {
                            int i77 = i69;
                            int i78 = c2754a.f10161c;
                            int i79 = i76;
                            int i80 = i71;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            while (true) {
                                if (i80 >= this.f10200p + i71) {
                                    i9 = i58;
                                    break;
                                }
                                byte[] bArr7 = this.f10193i;
                                i9 = i58;
                                if (i80 >= bArr7.length || i80 >= i75) {
                                    break;
                                }
                                int i86 = this.f10185a[bArr7[i80] & 255];
                                if (i86 != 0) {
                                    i81 += (i86 >> 24) & 255;
                                    i82 += (i86 >> 16) & 255;
                                    i83 += (i86 >> 8) & 255;
                                    i84 += i86 & 255;
                                    i85++;
                                }
                                i80++;
                                i58 = i9;
                            }
                            int i87 = i71 + i78;
                            int i88 = i87;
                            while (i88 < this.f10200p + i87) {
                                byte[] bArr8 = this.f10193i;
                                int i89 = i87;
                                if (i88 >= bArr8.length || i88 >= i75) {
                                    break;
                                }
                                int i90 = this.f10185a[bArr8[i88] & 255];
                                if (i90 != 0) {
                                    i81 += (i90 >> 24) & 255;
                                    i82 += (i90 >> 16) & 255;
                                    i83 += (i90 >> 8) & 255;
                                    i84 += i90 & 255;
                                    i85++;
                                }
                                i88++;
                                i87 = i89;
                            }
                            int i91 = i85 == 0 ? 0 : ((i81 / i85) << 24) | ((i82 / i85) << 16) | ((i83 / i85) << 8) | (i84 / i85);
                            if (i91 != 0) {
                                iArr5[i79] = i91;
                            } else if (z7 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i71 += i4;
                            i76 = i79 + 1;
                            i69 = i77;
                            i58 = i9;
                        }
                        i63++;
                        i61 = i;
                        i56 = i65;
                        i57 = i8;
                        i55 = i4;
                        i58 = i58;
                    }
                } else {
                    i4 = i55;
                }
                i8 = i57;
                i63++;
                i61 = i;
                i56 = i65;
                i57 = i8;
                i55 = i4;
                i58 = i58;
            }
            if (this.f10203s == null) {
                this.f10203s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i92 = c2754a.f10162d;
            int i93 = c2754a.f10160b;
            int i94 = c2754a.f10161c;
            int i95 = c2754a.f10159a;
            byte b10 = this.f10195k == 0 ? (byte) 1 : b7;
            byte[] bArr9 = this.f10193i;
            int[] iArr6 = this.f10185a;
            int i96 = -1;
            for (int i97 = b7; i97 < i92; i97++) {
                int i98 = this.f10202r;
                int i99 = (i97 + i93) * i98;
                int i100 = i99 + i95;
                int i101 = i100 + i94;
                int i102 = i99 + i98;
                if (i102 < i101) {
                    i101 = i102;
                }
                int i103 = c2754a.f10161c * i97;
                while (i100 < i101) {
                    int i104 = bArr9[i103];
                    int i105 = i104 & 255;
                    if (i105 != i96) {
                        int i106 = iArr6[i105];
                        if (i106 != 0) {
                            this.f10194j[i100] = i106;
                        } else {
                            i96 = i104;
                        }
                    }
                    i103++;
                    i100++;
                }
            }
            Boolean bool2 = this.f10203s;
            this.f10203s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f10203s != null || b10 == 0 || i96 == -1));
        }
        if (this.f10198n && ((i10 = c2754a.f10165g) == 0 || i10 == 1)) {
            if (this.f10197m == null) {
                this.f10197m = m4843a();
            }
            Bitmap bitmap3 = this.f10197m;
            int i107 = this.f10201q;
            int i108 = this.f10202r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i108, 0, 0, i108, i107);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapM4843a = m4843a();
        int i109 = this.f10201q;
        int i110 = this.f10202r;
        bitmapM4843a.setPixels(iArr2, 0, i110, 0, 0, i110, i109);
        return bitmapM4843a;
    }
}
