package p066h4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p002a1.AbstractC0008a1;
import p002a1.C0036o;
import p015b4.C0572f;
import p178u4.AbstractC2470e;
import p210y3.InterfaceC2800d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.l */
/* loaded from: classes.dex */
public final class C1178l implements InterfaceC2800d {

    /* renamed from: a */
    public static final byte[] f5027a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f5028b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: e */
    public static int m2590e(InterfaceC1177k interfaceC1177k, C0572f c0572f) {
        try {
            int iMo164c = interfaceC1177k.mo164c();
            if ((iMo164c & 65496) == 65496 || iMo164c == 19789 || iMo164c == 18761) {
                int iM2592g = m2592g(interfaceC1177k);
                if (iM2592g != -1) {
                    byte[] bArr = (byte[]) c0572f.m1319c(iM2592g, byte[].class);
                    try {
                        return m2593h(interfaceC1177k, bArr, iM2592g);
                    } finally {
                        c0572f.m1323g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo164c);
                return -1;
            }
        } catch (C1176j unused) {
        }
        return -1;
    }

    /* renamed from: f */
    public static ImageHeaderParser$ImageType m2591f(InterfaceC1177k interfaceC1177k) {
        try {
            int iMo164c = interfaceC1177k.mo164c();
            if (iMo164c == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo168h = (iMo164c << 8) | interfaceC1177k.mo168h();
            if (iMo168h == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo168h2 = (iMo168h << 8) | interfaceC1177k.mo168h();
            if (iMo168h2 == -1991225785) {
                interfaceC1177k.skip(21L);
                try {
                    return interfaceC1177k.mo168h() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C1176j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo168h2 == 1380533830) {
                interfaceC1177k.skip(4L);
                if (((interfaceC1177k.mo164c() << 16) | interfaceC1177k.mo164c()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo164c2 = (interfaceC1177k.mo164c() << 16) | interfaceC1177k.mo164c();
                if ((iMo164c2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo164c2 & 255;
                if (i == 88) {
                    interfaceC1177k.skip(4L);
                    short sMo168h = interfaceC1177k.mo168h();
                    return (sMo168h & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo168h & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC1177k.skip(4L);
                return (interfaceC1177k.mo168h() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC1177k.mo164c() << 16) | interfaceC1177k.mo164c()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo164c3 = (interfaceC1177k.mo164c() << 16) | interfaceC1177k.mo164c();
            if (iMo164c3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i4 = 0;
            boolean z7 = iMo164c3 == 1635150182;
            interfaceC1177k.skip(4L);
            int i8 = iMo168h2 - 16;
            if (i8 % 4 == 0) {
                while (i4 < 5 && i8 > 0) {
                    int iMo164c4 = (interfaceC1177k.mo164c() << 16) | interfaceC1177k.mo164c();
                    if (iMo164c4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo164c4 == 1635150182) {
                        z7 = true;
                    }
                    i4++;
                    i8 -= 4;
                }
            }
            return z7 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C1176j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return -1;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2592g(InterfaceC1177k interfaceC1177k) {
        while (true) {
            short sMo168h = interfaceC1177k.mo168h();
            if (sMo168h == 255) {
                short sMo168h2 = interfaceC1177k.mo168h();
                if (sMo168h2 == 218) {
                    break;
                }
                if (sMo168h2 != 217) {
                    int iMo164c = interfaceC1177k.mo164c() - 2;
                    if (sMo168h2 == 225) {
                        return iMo164c;
                    }
                    long j = iMo164c;
                    long jSkip = interfaceC1177k.skip(j);
                    if (jSkip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbM19o = AbstractC0008a1.m19o(sMo168h2, iMo164c, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            sbM19o.append(jSkip);
                            Log.d("DfltImageHeaderParser", sbM19o.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo168h));
                return -1;
            }
        }
    }

    /* renamed from: h */
    public static int m2593h(InterfaceC1177k interfaceC1177k, byte[] bArr, int i) {
        ByteOrder byteOrder;
        short s8;
        int iMo166e = interfaceC1177k.mo166e(bArr, i);
        short s9 = -1;
        if (iMo166e == i) {
            int i4 = 0;
            byte[] bArr2 = f5027a;
            boolean z7 = bArr != null && i > bArr2.length;
            if (z7) {
                int i8 = 0;
                while (true) {
                    if (i8 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i8] != bArr2[i8]) {
                        z7 = false;
                        break;
                    }
                    i8++;
                }
            }
            if (!z7) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s10 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s10 != 18761) {
                if (s10 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s10));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i9 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i10 = i9 + 6;
            short s11 = byteBuffer.remaining() - i10 >= 2 ? byteBuffer.getShort(i10) : (short) -1;
            while (i4 < s11) {
                int i11 = (i4 * 12) + i9 + 8;
                short s12 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : s9;
                if (s12 != 274) {
                    s8 = s9;
                } else {
                    int i12 = i11 + 2;
                    short s13 = byteBuffer.remaining() - i12 >= 2 ? byteBuffer.getShort(i12) : s9;
                    if (s13 < 1 || s13 > 12) {
                        s8 = s9;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s13));
                        }
                    } else {
                        int i13 = i11 + 4;
                        int i14 = byteBuffer.remaining() - i13 >= 4 ? byteBuffer.getInt(i13) : s9;
                        if (i14 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s8 = s9;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                s8 = s9;
                                StringBuilder sbM19o = AbstractC0008a1.m19o(i4, s12, "Got tagIndex=", " tagType=", " formatCode=");
                                sbM19o.append((int) s13);
                                sbM19o.append(" componentCount=");
                                sbM19o.append(i14);
                                Log.d("DfltImageHeaderParser", sbM19o.toString());
                            } else {
                                s8 = s9;
                            }
                            int i15 = i14 + f5028b[s13];
                            if (i15 <= 4) {
                                int i16 = i11 + 8;
                                if (i16 < 0 || i16 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i16 + " tagType=" + ((int) s12));
                                    }
                                } else {
                                    if (i15 >= 0 && i15 + i16 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i16 >= 2 ? byteBuffer.getShort(i16) : s8;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s12));
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s13));
                            }
                        }
                    }
                }
                i4++;
                s9 = s8;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo166e);
            return -1;
        }
        return s9;
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo2594a(ByteBuffer byteBuffer) {
        AbstractC2470e.m4446c("Argument must not be null", byteBuffer);
        return m2591f(new C1175i(byteBuffer, 0));
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: b */
    public final int mo2595b(ByteBuffer byteBuffer, C0572f c0572f) {
        C1175i c1175i = new C1175i(byteBuffer, 0);
        AbstractC2470e.m4446c("Argument must not be null", c0572f);
        return m2590e(c1175i, c0572f);
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: c */
    public final ImageHeaderParser$ImageType mo2596c(InputStream inputStream) {
        return m2591f(new C0036o(26, inputStream));
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: d */
    public final int mo2597d(InputStream inputStream, C0572f c0572f) {
        C0036o c0036o = new C0036o(26, inputStream);
        AbstractC2470e.m4446c("Argument must not be null", c0572f);
        return m2590e(c0036o, c0572f);
    }
}
