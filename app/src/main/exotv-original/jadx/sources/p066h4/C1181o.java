package p066h4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0732i;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;
import p171t5.AbstractC2436a;
import p178u4.AbstractC2466a;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2472g;
import p178u4.AbstractC2478m;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.EnumC2797a;
import p210y3.EnumC2805i;
import p210y3.InterfaceC2800d;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.o */
/* loaded from: classes.dex */
public final class C1181o {

    /* renamed from: f */
    public static final C2803g f5037f = C2803g.m4907a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC2797a.f10415l);

    /* renamed from: g */
    public static final C2803g f5038g = new C2803g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2803g.f10419e);

    /* renamed from: h */
    public static final C2803g f5039h;

    /* renamed from: i */
    public static final C2803g f5040i;

    /* renamed from: j */
    public static final C2819f f5041j;

    /* renamed from: k */
    public static final ArrayDeque f5042k;

    /* renamed from: a */
    public final InterfaceC0567a f5043a;

    /* renamed from: b */
    public final DisplayMetrics f5044b;

    /* renamed from: c */
    public final C0572f f5045c;

    /* renamed from: d */
    public final ArrayList f5046d;

    /* renamed from: e */
    public final C1187u f5047e = C1187u.m2606a();

    static {
        C1179m c1179m = C1179m.f5029b;
        Boolean bool = Boolean.FALSE;
        f5039h = C2803g.m4907a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f5040i = C2803g.m4907a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f5041j = new C2819f(22);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC2478m.f9069a;
        f5042k = new ArrayDeque(0);
    }

    public C1181o(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0567a interfaceC0567a, C0572f c0572f) {
        this.f5046d = arrayList;
        AbstractC2470e.m4446c("Argument must not be null", displayMetrics);
        this.f5044b = displayMetrics;
        AbstractC2470e.m4446c("Argument must not be null", interfaceC0567a);
        this.f5043a = interfaceC0567a;
        AbstractC2470e.m4446c("Argument must not be null", c0572f);
        this.f5045c = c0572f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m2600c(C0073c c0073c, BitmapFactory.Options options, InterfaceC1180n interfaceC1180n, InterfaceC0567a interfaceC0567a) {
        if (!options.inJustDecodeBounds) {
            interfaceC1180n.mo52i();
            switch (c0073c.f323j) {
                case 12:
                    C1189w c1189w = (C1189w) ((C0732i) c0073c.f324k).f2858k;
                    synchronized (c1189w) {
                        c1189w.f5062l = c1189w.f5060j.length;
                        break;
                    }
            }
        }
        int i = options.outWidth;
        int i4 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC1191y.f5067b;
        lock.lock();
        try {
            try {
                Bitmap bitmapM297t = c0073c.m297t(options);
                lock.unlock();
                return bitmapM297t;
            } catch (IllegalArgumentException e) {
                StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                sbM19o.append(str);
                sbM19o.append(", inBitmap: ");
                sbM19o.append(m2601d(options.inBitmap));
                IOException iOException = new IOException(sbM19o.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC0567a.mo1309e(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM2600c = m2600c(c0073c, options, interfaceC1180n, interfaceC0567a);
                    AbstractC1191y.f5067b.unlock();
                    return bitmapM2600c;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            AbstractC1191y.f5067b.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static String m2601d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: e */
    public static void m2602e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public final C1168c m2603a(C0073c c0073c, int i, int i4, C2804h c2804h, InterfaceC1180n interfaceC1180n) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f5045c.m1319c(65536, byte[].class);
        synchronized (C1181o.class) {
            arrayDeque = f5042k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m2602e(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC2797a enumC2797a = (EnumC2797a) c2804h.m4908c(f5037f);
        EnumC2805i enumC2805i = (EnumC2805i) c2804h.m4908c(f5038g);
        C1179m c1179m = (C1179m) c2804h.m4908c(C1179m.f5034g);
        boolean zBooleanValue = ((Boolean) c2804h.m4908c(f5039h)).booleanValue();
        C2803g c2803g = f5040i;
        try {
            C1168c c1168cM2585e = C1168c.m2585e(m2604b(c0073c, options, c1179m, enumC2797a, enumC2805i, c2804h.m4908c(c2803g) != null && ((Boolean) c2804h.m4908c(c2803g)).booleanValue(), i, i4, zBooleanValue, interfaceC1180n), this.f5043a);
            m2602e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f5045c.m1323g(bArr);
            return c1168cM2585e;
        } catch (Throwable th) {
            m2602e(options);
            ArrayDeque arrayDeque2 = f5042k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f5045c.m1323g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0460 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m2604b(C0073c c0073c, BitmapFactory.Options options, C1179m c1179m, EnumC2797a enumC2797a, EnumC2805i enumC2805i, boolean z7, int i, int i4, boolean z8, InterfaceC1180n interfaceC1180n) throws Throwable {
        long j;
        String str;
        int iMo2595b;
        int iM4334i;
        int i8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        String str2;
        InterfaceC0567a interfaceC0567a;
        String str3;
        int i12;
        boolean zM2608c;
        boolean z10;
        boolean zHasAlpha;
        boolean z11;
        int iRound;
        int i13;
        InterfaceC0567a interfaceC0567a2;
        Bitmap bitmapM2600c;
        Bitmap bitmapMo1310k;
        ColorSpace colorSpace;
        Bitmap.Config config;
        String str4;
        String str5;
        int i14;
        int i15;
        int iFloor;
        int iFloor2;
        int iRound2;
        int i16;
        C1189w c1189w;
        List list;
        int i17 = AbstractC2472g.f9058b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0567a interfaceC0567a3 = this.f5043a;
        m2600c(c0073c, options, interfaceC1180n, interfaceC0567a3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i18 = iArr[0];
        int i19 = iArr[1];
        String str6 = options.outMimeType;
        boolean z12 = (i18 == -1 || i19 == -1) ? false : z7;
        C1189w c1189w2 = null;
        switch (c0073c.f323j) {
            case 11:
                j = jElapsedRealtimeNanos;
                str = str6;
                List list2 = (List) c0073c.f325l;
                ByteBuffer byteBufferM4441c = AbstractC2466a.m4441c((ByteBuffer) c0073c.f324k);
                C0572f c0572f = (C0572f) c0073c.f326m;
                if (byteBufferM4441c != null) {
                    int size = list2.size();
                    int i20 = 0;
                    while (i20 < size) {
                        List list3 = list2;
                        try {
                            iMo2595b = ((InterfaceC2800d) list2.get(i20)).mo2595b(byteBufferM4441c, c0572f);
                            C0572f c0572f2 = c0572f;
                            if (iMo2595b != -1) {
                                iM4334i = iMo2595b;
                                switch (iM4334i) {
                                    case 3:
                                    case 4:
                                        i8 = 180;
                                        break;
                                    case 5:
                                    case 6:
                                        i8 = 90;
                                        break;
                                    case 7:
                                    case 8:
                                        i8 = 270;
                                        break;
                                    default:
                                        i8 = 0;
                                        break;
                                }
                                switch (iM4334i) {
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z9 = true;
                                        break;
                                    default:
                                        z9 = false;
                                        break;
                                }
                                if (i == Integer.MIN_VALUE) {
                                    if (i8 != 90) {
                                        i9 = 270;
                                        if (i8 != 270) {
                                            i10 = i18;
                                        }
                                    } else {
                                        i9 = 270;
                                    }
                                    i10 = i19;
                                } else {
                                    i9 = 270;
                                    i10 = i;
                                }
                                i11 = i4 == Integer.MIN_VALUE ? (i8 == 90 || i8 == i9) ? i18 : i19 : i4;
                                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM269A = c0073c.m269A();
                                int i21 = iM4334i;
                                boolean z13 = z9;
                                if (i18 <= 0 || i19 <= 0) {
                                    str2 = ", density: ";
                                    interfaceC0567a = interfaceC0567a3;
                                    str3 = ", target density: ";
                                    i12 = i10;
                                    if (Log.isLoggable("Downsampler", 3)) {
                                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM269A + " with target [" + i12 + "x" + i11 + "]");
                                    }
                                } else {
                                    if (i8 == 90 || i8 == 270) {
                                        str4 = ", density: ";
                                        str5 = "]";
                                        i14 = i19;
                                        i15 = i18;
                                    } else {
                                        str4 = ", density: ";
                                        str5 = "]";
                                        i15 = i19;
                                        i14 = i18;
                                    }
                                    i12 = i10;
                                    float fM2599b = c1179m.m2599b(i14, i15, i12, i11);
                                    if (fM2599b <= 0.0f) {
                                        throw new IllegalArgumentException("Cannot scale with factor: " + fM2599b + " from: " + c1179m + ", source: [" + i18 + "x" + i19 + "], target: [" + i12 + "x" + i11 + str5);
                                    }
                                    int iM2598a = c1179m.m2598a(i14, i15, i12, i11);
                                    if (iM2598a == 0) {
                                        throw new IllegalArgumentException("Cannot round with null rounding");
                                    }
                                    int i22 = i8;
                                    float f8 = i14;
                                    int i23 = i14;
                                    float f9 = i15;
                                    int i24 = i15;
                                    int i25 = (int) ((fM2599b * f9) + 0.5d);
                                    int i26 = i23 / ((int) ((fM2599b * f8) + 0.5d));
                                    int i27 = i24 / i25;
                                    int iMax = Math.max(1, Integer.highestOneBit(iM2598a == 1 ? Math.max(i26, i27) : Math.min(i26, i27)));
                                    if (iM2598a == 1 && iMax < 1.0f / fM2599b) {
                                        iMax <<= 1;
                                    }
                                    options.inSampleSize = iMax;
                                    if (imageHeaderParser$ImageTypeM269A == ImageHeaderParser$ImageType.JPEG) {
                                        float fMin = Math.min(iMax, 8);
                                        iFloor = (int) Math.ceil(f8 / fMin);
                                        iFloor2 = (int) Math.ceil(f9 / fMin);
                                        int i28 = iMax / 8;
                                        if (i28 > 0) {
                                            iFloor2 /= i28;
                                            iRound2 = iFloor / i28;
                                        } else {
                                            iRound2 = iFloor;
                                        }
                                        double dM2599b = c1179m.m2599b(iRound2, iFloor2, i12, i11);
                                        int iRound3 = (int) Math.round((dM2599b <= 1.0d ? dM2599b : 1.0d / dM2599b) * 2.147483647E9d);
                                        interfaceC0567a = interfaceC0567a3;
                                        int i29 = (int) ((iRound3 * dM2599b) + 0.5d);
                                        float f10 = i29 / iRound3;
                                        int i30 = iMax;
                                        options.inTargetDensity = (int) (((dM2599b / f10) * i29) + 0.5d);
                                        int iRound4 = (int) Math.round((dM2599b <= 1.0d ? dM2599b : 1.0d / dM2599b) * 2.147483647E9d);
                                        options.inDensity = iRound4;
                                        i16 = options.inTargetDensity;
                                        if (i16 <= 0 || iRound4 <= 0 || i16 == iRound4) {
                                            options.inTargetDensity = 0;
                                            options.inDensity = 0;
                                        } else {
                                            options.inScaled = true;
                                        }
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            str2 = str4;
                                            str3 = ", target density: ";
                                        } else {
                                            StringBuilder sbM19o = AbstractC0008a1.m19o(i18, i19, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                                            sbM19o.append(i22);
                                            sbM19o.append(", target: [");
                                            sbM19o.append(i12);
                                            sbM19o.append("x");
                                            sbM19o.append(i11);
                                            sbM19o.append("], power of two scaled: [");
                                            sbM19o.append(iRound2);
                                            sbM19o.append("x");
                                            sbM19o.append(iFloor2);
                                            sbM19o.append("], exact scale factor: ");
                                            sbM19o.append(fM2599b);
                                            sbM19o.append(", power of 2 sample size: ");
                                            sbM19o.append(i30);
                                            sbM19o.append(", adjusted scale factor: ");
                                            sbM19o.append(dM2599b);
                                            str3 = ", target density: ";
                                            sbM19o.append(str3);
                                            sbM19o.append(options.inTargetDensity);
                                            str2 = str4;
                                            sbM19o.append(str2);
                                            sbM19o.append(options.inDensity);
                                            Log.v("Downsampler", sbM19o.toString());
                                        }
                                    } else {
                                        if (imageHeaderParser$ImageTypeM269A == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM269A == ImageHeaderParser$ImageType.PNG_A) {
                                            float f11 = iMax;
                                            iFloor = (int) Math.floor(f8 / f11);
                                            iFloor2 = (int) Math.floor(f9 / f11);
                                        } else {
                                            if (imageHeaderParser$ImageTypeM269A.isWebp()) {
                                                float f12 = iMax;
                                                iRound2 = Math.round(f8 / f12);
                                                iFloor2 = Math.round(f9 / f12);
                                            } else if (i23 % iMax == 0 && i24 % iMax == 0) {
                                                iRound2 = i23 / iMax;
                                                iFloor2 = i24 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                m2600c(c0073c, options, interfaceC1180n, interfaceC0567a3);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            double dM2599b2 = c1179m.m2599b(iRound2, iFloor2, i12, i11);
                                            int iRound32 = (int) Math.round((dM2599b2 <= 1.0d ? dM2599b2 : 1.0d / dM2599b2) * 2.147483647E9d);
                                            interfaceC0567a = interfaceC0567a3;
                                            int i292 = (int) ((iRound32 * dM2599b2) + 0.5d);
                                            float f102 = i292 / iRound32;
                                            int i302 = iMax;
                                            options.inTargetDensity = (int) (((dM2599b2 / f102) * i292) + 0.5d);
                                            int iRound42 = (int) Math.round((dM2599b2 <= 1.0d ? dM2599b2 : 1.0d / dM2599b2) * 2.147483647E9d);
                                            options.inDensity = iRound42;
                                            i16 = options.inTargetDensity;
                                            if (i16 <= 0) {
                                                options.inTargetDensity = 0;
                                                options.inDensity = 0;
                                                if (Log.isLoggable("Downsampler", 2)) {
                                                }
                                            }
                                        }
                                        iRound2 = iFloor;
                                        double dM2599b22 = c1179m.m2599b(iRound2, iFloor2, i12, i11);
                                        int iRound322 = (int) Math.round((dM2599b22 <= 1.0d ? dM2599b22 : 1.0d / dM2599b22) * 2.147483647E9d);
                                        interfaceC0567a = interfaceC0567a3;
                                        int i2922 = (int) ((iRound322 * dM2599b22) + 0.5d);
                                        float f1022 = i2922 / iRound322;
                                        int i3022 = iMax;
                                        options.inTargetDensity = (int) (((dM2599b22 / f1022) * i2922) + 0.5d);
                                        int iRound422 = (int) Math.round((dM2599b22 <= 1.0d ? dM2599b22 : 1.0d / dM2599b22) * 2.147483647E9d);
                                        options.inDensity = iRound422;
                                        i16 = options.inTargetDensity;
                                        if (i16 <= 0) {
                                        }
                                    }
                                }
                                zM2608c = this.f5047e.m2608c(i12, i11, z12, z13);
                                if (zM2608c) {
                                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                    z10 = false;
                                    options.inMutable = false;
                                } else {
                                    z10 = false;
                                }
                                if (!zM2608c) {
                                    if (enumC2797a != EnumC2797a.f10413j) {
                                        try {
                                            zHasAlpha = c0073c.m269A().hasAlpha();
                                        } catch (IOException e) {
                                            if (Log.isLoggable("Downsampler", 3)) {
                                                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC2797a, e);
                                            }
                                            zHasAlpha = z10;
                                        }
                                        Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        options.inPreferredConfig = config2;
                                        if (config2 == Bitmap.Config.RGB_565) {
                                            z11 = true;
                                            options.inDither = true;
                                        } else {
                                            z11 = true;
                                        }
                                    } else {
                                        z11 = true;
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    }
                                }
                                int i31 = Build.VERSION.SDK_INT;
                                if (i18 < 0 || i19 < 0 || !z8) {
                                    int i32 = options.inTargetDensity;
                                    float f13 = !((i32 > 0 || (i13 = options.inDensity) <= 0 || i32 == i13) ? z10 : z11) ? i32 / options.inDensity : 1.0f;
                                    int i33 = options.inSampleSize;
                                    float f14 = i33;
                                    int iCeil = (int) Math.ceil(i18 / f14);
                                    int iCeil2 = (int) Math.ceil(i19 / f14);
                                    iRound = Math.round(iCeil * f13);
                                    int iRound5 = Math.round(iCeil2 * f13);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        StringBuilder sbM19o2 = AbstractC0008a1.m19o(iRound, iRound5, "Calculated target [", "x", "] for source [");
                                        sbM19o2.append(i18);
                                        sbM19o2.append("x");
                                        sbM19o2.append(i19);
                                        sbM19o2.append("], sampleSize: ");
                                        sbM19o2.append(i33);
                                        sbM19o2.append(", targetDensity: ");
                                        sbM19o2.append(options.inTargetDensity);
                                        sbM19o2.append(str2);
                                        sbM19o2.append(options.inDensity);
                                        sbM19o2.append(", density multiplier: ");
                                        sbM19o2.append(f13);
                                        Log.v("Downsampler", sbM19o2.toString());
                                    }
                                    i11 = iRound5;
                                } else {
                                    iRound = i12;
                                }
                                if (iRound <= 0 || i11 <= 0) {
                                    interfaceC0567a2 = interfaceC0567a;
                                } else {
                                    if (i31 >= 26) {
                                        if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                                            config = options.outConfig;
                                        }
                                        interfaceC0567a2 = interfaceC0567a;
                                    } else {
                                        config = null;
                                    }
                                    if (config == null) {
                                        config = options.inPreferredConfig;
                                    }
                                    interfaceC0567a2 = interfaceC0567a;
                                    options.inBitmap = interfaceC0567a2.mo1308d(iRound, i11, config);
                                }
                                if (enumC2805i != null) {
                                    if (i31 >= 28) {
                                        options.inPreferredColorSpace = ColorSpace.get(enumC2805i == EnumC2805i.f10425j && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                    } else if (i31 >= 26) {
                                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                    }
                                }
                                bitmapM2600c = m2600c(c0073c, options, interfaceC1180n, interfaceC0567a2);
                                interfaceC1180n.mo46c(bitmapM2600c, interfaceC0567a2);
                                if (Log.isLoggable("Downsampler", 2)) {
                                    Log.v("Downsampler", "Decoded " + m2601d(bitmapM2600c) + " from [" + i18 + "x" + i19 + "] " + str + " with inBitmap " + m2601d(options.inBitmap) + " for [" + i + "x" + i4 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC2472g.m4447a(j));
                                }
                                if (bitmapM2600c == null) {
                                    return null;
                                }
                                bitmapM2600c.setDensity(this.f5044b.densityDpi);
                                switch (i21) {
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        Matrix matrix = new Matrix();
                                        switch (i21) {
                                            case 2:
                                                matrix.setScale(-1.0f, 1.0f);
                                                break;
                                            case 3:
                                                matrix.setRotate(180.0f);
                                                break;
                                            case 4:
                                                matrix.setRotate(180.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                break;
                                            case 5:
                                                matrix.setRotate(90.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                break;
                                            case 6:
                                                matrix.setRotate(90.0f);
                                                break;
                                            case 7:
                                                matrix.setRotate(-90.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                break;
                                            case 8:
                                                matrix.setRotate(-90.0f);
                                                break;
                                        }
                                        RectF rectF = new RectF(0.0f, 0.0f, bitmapM2600c.getWidth(), bitmapM2600c.getHeight());
                                        matrix.mapRect(rectF);
                                        bitmapMo1310k = interfaceC0567a2.mo1310k(Math.round(rectF.width()), Math.round(rectF.height()), bitmapM2600c.getConfig() != null ? bitmapM2600c.getConfig() : Bitmap.Config.ARGB_8888);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        bitmapMo1310k.setHasAlpha(bitmapM2600c.hasAlpha());
                                        AbstractC1191y.m2612a(bitmapM2600c, bitmapMo1310k, matrix);
                                        break;
                                    default:
                                        bitmapMo1310k = bitmapM2600c;
                                        break;
                                }
                                if (!bitmapM2600c.equals(bitmapMo1310k)) {
                                    interfaceC0567a2.mo1309e(bitmapM2600c);
                                }
                                return bitmapMo1310k;
                            }
                            i20++;
                            list2 = list3;
                            c0572f = c0572f2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                iM4334i = -1;
                switch (iM4334i) {
                }
                switch (iM4334i) {
                }
                if (i == Integer.MIN_VALUE) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM269A2 = c0073c.m269A();
                int i212 = iM4334i;
                boolean z132 = z9;
                if (i18 <= 0) {
                    str2 = ", density: ";
                    interfaceC0567a = interfaceC0567a3;
                    str3 = ", target density: ";
                    i12 = i10;
                    if (Log.isLoggable("Downsampler", 3)) {
                    }
                }
                zM2608c = this.f5047e.m2608c(i12, i11, z12, z132);
                if (zM2608c) {
                }
                if (!zM2608c) {
                }
                int i312 = Build.VERSION.SDK_INT;
                if (i18 < 0) {
                    int i322 = options.inTargetDensity;
                    if (i322 > 0) {
                        if (!((i322 > 0 || (i13 = options.inDensity) <= 0 || i322 == i13) ? z10 : z11)) {
                        }
                        int i332 = options.inSampleSize;
                        float f142 = i332;
                        int iCeil3 = (int) Math.ceil(i18 / f142);
                        int iCeil22 = (int) Math.ceil(i19 / f142);
                        iRound = Math.round(iCeil3 * f13);
                        int iRound52 = Math.round(iCeil22 * f13);
                        if (Log.isLoggable("Downsampler", 2)) {
                        }
                        i11 = iRound52;
                    }
                }
                if (iRound <= 0) {
                    interfaceC0567a2 = interfaceC0567a;
                }
                if (enumC2805i != null) {
                }
                bitmapM2600c = m2600c(c0073c, options, interfaceC1180n, interfaceC0567a2);
                interfaceC1180n.mo46c(bitmapM2600c, interfaceC0567a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (bitmapM2600c == null) {
                }
                break;
            case 12:
                j = jElapsedRealtimeNanos;
                str = str6;
                List list4 = (List) c0073c.f326m;
                C1189w c1189w3 = (C1189w) ((C0732i) c0073c.f324k).f2858k;
                c1189w3.reset();
                iM4334i = AbstractC2436a.m4334i(list4, c1189w3, (C0572f) c0073c.f325l);
                switch (iM4334i) {
                }
                switch (iM4334i) {
                }
                if (i == Integer.MIN_VALUE) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM269A22 = c0073c.m269A();
                int i2122 = iM4334i;
                boolean z1322 = z9;
                if (i18 <= 0) {
                }
                zM2608c = this.f5047e.m2608c(i12, i11, z12, z1322);
                if (zM2608c) {
                }
                if (!zM2608c) {
                }
                int i3122 = Build.VERSION.SDK_INT;
                if (i18 < 0) {
                }
                if (iRound <= 0) {
                }
                if (enumC2805i != null) {
                }
                bitmapM2600c = m2600c(c0073c, options, interfaceC1180n, interfaceC0567a2);
                interfaceC1180n.mo46c(bitmapM2600c, interfaceC0567a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (bitmapM2600c == null) {
                }
                break;
            default:
                List list5 = (List) c0073c.f325l;
                j = jElapsedRealtimeNanos;
                C0732i c0732i = (C0732i) c0073c.f326m;
                C0572f c0572f3 = (C0572f) c0073c.f324k;
                int size2 = list5.size();
                str = str6;
                int i34 = 0;
                while (i34 < size2) {
                    int i35 = size2;
                    InterfaceC2800d interfaceC2800d = (InterfaceC2800d) list5.get(i34);
                    int i36 = i34;
                    try {
                        list = list5;
                        c1189w = new C1189w(new FileInputStream(c0732i.m1656e().getFileDescriptor()), c0572f3);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        iMo2595b = interfaceC2800d.mo2597d(c1189w, c0572f3);
                        c1189w.m2611c();
                        c0732i.m1656e();
                        if (iMo2595b != -1) {
                            iM4334i = iMo2595b;
                            switch (iM4334i) {
                            }
                            switch (iM4334i) {
                            }
                            if (i == Integer.MIN_VALUE) {
                            }
                            if (i4 == Integer.MIN_VALUE) {
                            }
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM269A222 = c0073c.m269A();
                            int i21222 = iM4334i;
                            boolean z13222 = z9;
                            if (i18 <= 0) {
                            }
                            zM2608c = this.f5047e.m2608c(i12, i11, z12, z13222);
                            if (zM2608c) {
                            }
                            if (!zM2608c) {
                            }
                            int i31222 = Build.VERSION.SDK_INT;
                            if (i18 < 0) {
                            }
                            if (iRound <= 0) {
                            }
                            if (enumC2805i != null) {
                            }
                            bitmapM2600c = m2600c(c0073c, options, interfaceC1180n, interfaceC0567a2);
                            interfaceC1180n.mo46c(bitmapM2600c, interfaceC0567a2);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            if (bitmapM2600c == null) {
                            }
                        } else {
                            i34 = i36 + 1;
                            size2 = i35;
                            list5 = list;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c1189w2 = c1189w;
                        if (c1189w2 != null) {
                            c1189w2.m2611c();
                        }
                        c0732i.m1656e();
                        throw th;
                    }
                }
                iM4334i = -1;
                switch (iM4334i) {
                }
                switch (iM4334i) {
                }
                if (i == Integer.MIN_VALUE) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM269A2222 = c0073c.m269A();
                int i212222 = iM4334i;
                boolean z132222 = z9;
                if (i18 <= 0) {
                }
                zM2608c = this.f5047e.m2608c(i12, i11, z12, z132222);
                if (zM2608c) {
                }
                if (!zM2608c) {
                }
                int i312222 = Build.VERSION.SDK_INT;
                if (i18 < 0) {
                }
                if (iRound <= 0) {
                }
                if (enumC2805i != null) {
                }
                bitmapM2600c = m2600c(c0073c, options, interfaceC1180n, interfaceC0567a2);
                interfaceC1180n.mo46c(bitmapM2600c, interfaceC0567a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (bitmapM2600c == null) {
                }
                break;
        }
    }
}
