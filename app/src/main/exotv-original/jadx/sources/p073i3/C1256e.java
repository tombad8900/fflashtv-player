package p073i3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.lifecycle.C0152p;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.Set;
import p002a1.C0048u;
import p017b6.AbstractC0622v;
import p024c5.C0656d0;
import p076i7.AbstractC1339x;
import p076i7.C1295g;
import p102l6.C1693j;
import p137p6.C2228i;
import p138p7.C2235g;
import p138p7.InterfaceC2232d;
import p146q6.EnumC2273a;
import p151r3.C2303o;
import p154r6.AbstractC2320c;
import p160s3.C2357h;
import p160s3.EnumC2356g;
import p185v3.AbstractC2536f;
import p189v7.AbstractC2557b;
import p189v7.C2564e0;
import p189v7.C2571i;
import p207y0.C2790g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.e */
/* loaded from: classes.dex */
public final class C1256e implements InterfaceC1259h {

    /* renamed from: a */
    public final AbstractC1266o f5247a;

    /* renamed from: b */
    public final C2303o f5248b;

    /* renamed from: c */
    public final InterfaceC2232d f5249c;

    /* renamed from: d */
    public final EnumC1262k f5250d;

    public C1256e(AbstractC1266o abstractC1266o, C2303o c2303o, InterfaceC2232d interfaceC2232d, EnumC1262k enumC1262k) {
        this.f5247a = abstractC1266o;
        this.f5248b = c2303o;
        this.f5249c = interfaceC2232d;
        this.f5250d = enumC1262k;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1258g m2734a(C1256e c1256e) throws Exception {
        C1260i c1260i;
        Context context;
        int i;
        boolean z7;
        int iMin;
        double dMax;
        Bitmap bitmapCreateBitmap;
        ColorSpace colorSpace;
        int i4;
        BitmapFactory.Options options = new BitmapFactory.Options();
        C2303o c2303o = c1256e.f5248b;
        AbstractC1266o abstractC1266o = c1256e.f5247a;
        C1253b c1253b = new C1253b(abstractC1266o.mo2737c());
        C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(c1253b);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new C2571i(c2564e0M4578c.peek(), 1), null, options);
        Exception exc = c1253b.f5239j;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = AbstractC1263l.f5266a;
        String str = options.outMimeType;
        EnumC1262k enumC1262k = c1256e.f5250d;
        Set set = AbstractC1264m.f5267a;
        int iOrdinal = enumC1262k.ordinal();
        if (iOrdinal == 0) {
            c1260i = C1260i.f5258c;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0048u();
                }
            } else if (str == null || !AbstractC1264m.f5267a.contains(str)) {
            }
            C2790g c2790g = new C2790g(new C1261j(new C2571i(c2564e0M4578c.peek(), 1)));
            int iM4879c = c2790g.m4879c();
            boolean z8 = iM4879c == 2 || iM4879c == 7 || iM4879c == 4 || iM4879c == 5;
            switch (c2790g.m4879c()) {
                case 3:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = 270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            c1260i = new C1260i(z8, i4);
        }
        int i8 = c1260i.f5260b;
        boolean z9 = c1260i.f5259a;
        Exception exc2 = c1253b.f5239j;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && (colorSpace = c2303o.f8057c) != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        boolean z10 = c2303o.f8062h;
        Context context2 = c2303o.f8055a;
        C2357h c2357h = c2303o.f8058d;
        options.inPremultiplied = z10;
        Bitmap.Config config = c2303o.f8056b;
        if ((z9 || i8 > 0) && (config == null || AbstractC0622v.m1396h(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (c2303o.f8061g && config == Bitmap.Config.ARGB_8888 && AbstractC2980h.m5132a(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i9 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        AbstractC0714c abstractC0714cMo2736b = abstractC1266o.mo2736b();
        if ((abstractC0714cMo2736b instanceof C1267p) && AbstractC2980h.m5132a(c2357h, C2357h.f8269c)) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((C1267p) abstractC0714cMo2736b).f5274p;
            options.inTargetDensity = context2.getResources().getDisplayMetrics().densityDpi;
            i = 1;
            context = context2;
            z7 = false;
        } else {
            int i10 = options.outWidth;
            if (i10 > 0) {
                int i11 = options.outHeight;
                if (i11 <= 0) {
                    i = 1;
                    context = context2;
                } else {
                    int i12 = (i8 == 90 || i8 == 270) ? i11 : i10;
                    if (i8 != 90 && i8 != 270) {
                        i10 = i11;
                    }
                    EnumC2356g enumC2356g = c2303o.f8059e;
                    C2357h c2357h2 = C2357h.f8269c;
                    int iM4558e = AbstractC2980h.m5132a(c2357h, c2357h2) ? i12 : AbstractC2536f.m4558e(c2357h.f8270a, enumC2356g);
                    int iM4558e2 = AbstractC2980h.m5132a(c2357h, c2357h2) ? i10 : AbstractC2536f.m4558e(c2357h.f8271b, enumC2356g);
                    int iHighestOneBit = Integer.highestOneBit(i12 / iM4558e);
                    int iHighestOneBit2 = Integer.highestOneBit(i10 / iM4558e2);
                    int iOrdinal2 = enumC2356g.ordinal();
                    if (iOrdinal2 == 0) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new C0048u();
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    }
                    if (iMin < 1) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    double d8 = iMin;
                    context = context2;
                    double d9 = iM4558e / (i12 / d8);
                    double d10 = iM4558e2 / (i10 / d8);
                    int iOrdinal3 = enumC2356g.ordinal();
                    if (iOrdinal3 == 0) {
                        dMax = Math.max(d9, d10);
                    } else {
                        if (iOrdinal3 != 1) {
                            throw new C0048u();
                        }
                        dMax = Math.min(d9, d10);
                    }
                    if (c2303o.f8060f && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z11 = dMax == 1.0d;
                    options.inScaled = !z11;
                    if (!z11) {
                        if (dMax > 1.0d) {
                            options.inDensity = AbstractC0715d.m1558e0(Integer.MAX_VALUE / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = AbstractC0715d.m1558e0(Integer.MAX_VALUE * dMax);
                        }
                    }
                    z7 = false;
                    i = 1;
                }
            } else {
                context = context2;
                i = 1;
            }
            options.inSampleSize = i;
            z7 = false;
            options.inScaled = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C2571i(c2564e0M4578c, i), null, options);
            c2564e0M4578c.close();
            Exception exc3 = c1253b.f5239j;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z9 || i8 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z9) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i8 > 0) {
                    matrix.postRotate(i8, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f8 = rectF.left;
                if (f8 != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f8, -rectF.top);
                }
                if (i8 == 90 || i8 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC1263l.f5266a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new C1258g(new BitmapDrawable(context.getResources(), bitmapDecodeStream), (options.inSampleSize > 1 || options.inScaled) ? true : z7);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r5.mo2791i(r2.f7760b);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2735b(AbstractC2320c abstractC2320c) throws Throwable {
        C1255d c1255d;
        int andDecrement;
        C1256e c1256e;
        InterfaceC2232d interfaceC2232d;
        Object obj;
        Throwable th;
        if (abstractC2320c instanceof C1255d) {
            c1255d = (C1255d) abstractC2320c;
            int i = c1255d.f5246q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1255d.f5246q = i - Integer.MIN_VALUE;
            } else {
                c1255d = new C1255d(this, abstractC2320c);
            }
        }
        Object obj2 = c1255d.f5244o;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c1255d.f5246q;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(obj2);
                c1255d.f5242m = this;
                InterfaceC2232d interfaceC2232d2 = this.f5249c;
                c1255d.f5243n = interfaceC2232d2;
                c1255d.f5246q = 1;
                C2235g c2235g = (C2235g) interfaceC2232d2;
                c2235g.getClass();
                int i8 = c2235g.f7759a;
                do {
                    andDecrement = C2235g.f7758g.getAndDecrement(c2235g);
                } while (andDecrement > i8);
                Object obj3 = C1693j.f6497a;
                if (andDecrement <= 0) {
                    C1295g c1295gM2847h = AbstractC1339x.m2847h(AbstractC0715d.m1547P(c1255d));
                    try {
                        if (!c2235g.m4009a(c1295gM2847h)) {
                            while (true) {
                                int andDecrement2 = C2235g.f7758g.getAndDecrement(c2235g);
                                if (andDecrement2 <= i8) {
                                    if (andDecrement2 > 0) {
                                        break;
                                    }
                                    if (c2235g.m4009a(c1295gM2847h)) {
                                        break;
                                    }
                                }
                            }
                        }
                        Object objM2809u = c1295gM2847h.m2809u();
                        if (objM2809u != enumC2273a) {
                            objM2809u = obj3;
                        }
                        if (objM2809u == enumC2273a) {
                            obj3 = objM2809u;
                        }
                    } catch (Throwable th2) {
                        c1295gM2847h.m2797C();
                        throw th2;
                    }
                }
                if (obj3 != enumC2273a) {
                    c1256e = this;
                    interfaceC2232d = interfaceC2232d2;
                }
                return enumC2273a;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = (InterfaceC2232d) c1255d.f5242m;
                try {
                    AbstractC0714c.m1516d0(obj2);
                    C1258g c1258g = (C1258g) obj2;
                    ((C2235g) obj).m4010b();
                    return c1258g;
                } catch (Throwable th3) {
                    th = th3;
                    ((C2235g) obj).m4010b();
                    throw th;
                }
            }
            InterfaceC2232d interfaceC2232d3 = c1255d.f5243n;
            c1256e = (C1256e) c1255d.f5242m;
            AbstractC0714c.m1516d0(obj2);
            interfaceC2232d = interfaceC2232d3;
            C0656d0 c0656d0 = new C0656d0(1, c1256e);
            c1255d.f5242m = interfaceC2232d;
            c1255d.f5243n = null;
            c1255d.f5246q = 2;
            Object objM2857r = AbstractC1339x.m2857r(C2228i.f7747j, new C0152p(c0656d0, null, 1), c1255d);
            if (objM2857r != enumC2273a) {
                obj = interfaceC2232d;
                obj2 = objM2857r;
                C1258g c1258g2 = (C1258g) obj2;
                ((C2235g) obj).m4010b();
                return c1258g2;
            }
            return enumC2273a;
        } catch (Throwable th4) {
            obj = interfaceC2232d;
            th = th4;
            ((C2235g) obj).m4010b();
            throw th;
        }
    }
}
