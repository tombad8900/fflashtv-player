package p100l4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;
import p023c4.C0639c;
import p040e3.C0867e;
import p083j4.C1500d;
import p090k2.C1584b;
import p171t5.AbstractC2436a;
import p178u4.AbstractC2472g;
import p203x3.C2755b;
import p203x3.C2756c;
import p203x3.C2757d;
import p210y3.C2804h;
import p210y3.EnumC2797a;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C1673a implements InterfaceC2806j {

    /* renamed from: f */
    public static final C1584b f6412f = new C1584b(2);

    /* renamed from: g */
    public static final C0639c f6413g = new C0639c(1);

    /* renamed from: a */
    public final Context f6414a;

    /* renamed from: b */
    public final ArrayList f6415b;

    /* renamed from: e */
    public final C0016e f6418e;

    /* renamed from: d */
    public final C1584b f6417d = f6412f;

    /* renamed from: c */
    public final C0639c f6416c = f6413g;

    public C1673a(Context context, ArrayList arrayList, InterfaceC0567a interfaceC0567a, C0572f c0572f) {
        this.f6414a = context.getApplicationContext();
        this.f6415b = arrayList;
        this.f6418e = new C0016e(interfaceC0567a, 21, c0572f);
    }

    /* renamed from: d */
    public static int m3374d(C2755b c2755b, int i, int i4) {
        int iMin = Math.min(c2755b.f10176g / i4, c2755b.f10175f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM19o = AbstractC0008a1.m19o(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbM19o.append(i4);
            sbM19o.append("], actual dimens: [");
            sbM19o.append(c2755b.f10175f);
            sbM19o.append("x");
            sbM19o.append(c2755b.f10176g);
            sbM19o.append("]");
            Log.v("BufferGifDecoder", sbM19o.toString());
        }
        return iMax;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) {
        return !((Boolean) c2804h.m4908c(AbstractC1679g.f6454b)).booleanValue() && AbstractC2436a.m4336k(this.f6415b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final p005a4.InterfaceC0080f0 mo2584b(java.lang.Object r8, int r9, int r10, p210y3.C2804h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            c4.c r8 = r7.f6416c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f2527a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            x3.c r0 = (p203x3.C2756c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            x3.c r0 = new x3.c     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f10182b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f10181a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            x3.b r0 = new x3.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f10183c = r0     // Catch: java.lang.Throwable -> L54
            r5.f10184d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f10182b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f10182b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            j4.d r8 = r1.m3375c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            c4.c r9 = r1.f6416c
            r9.m1422a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            c4.c r9 = r1.f6416c
            r9.m1422a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: p100l4.C1673a.mo2584b(java.lang.Object, int, int, y3.h):a4.f0");
    }

    /* renamed from: c */
    public final C1500d m3375c(ByteBuffer byteBuffer, int i, int i4, C2756c c2756c, C2804h c2804h) {
        StringBuilder sb;
        int i8 = AbstractC2472g.f9058b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C2755b c2755bM4838b = c2756c.m4838b();
            C1500d c1500d = null;
            if (c2755bM4838b.f10172c > 0 && c2755bM4838b.f10171b == 0) {
                Bitmap.Config config = c2804h.m4908c(AbstractC1679g.f6453a) == EnumC2797a.f10414k ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM3374d = m3374d(c2755bM4838b, i, i4);
                C1584b c1584b = this.f6417d;
                C0016e c0016e = this.f6418e;
                c1584b.getClass();
                C2757d c2757d = new C2757d(c0016e, c2755bM4838b, byteBuffer, iM3374d);
                c2757d.m4845c(config);
                c2757d.f10195k = (c2757d.f10195k + 1) % c2757d.f10196l.f10172c;
                Bitmap bitmapM4844b = c2757d.m4844b();
                if (bitmapM4844b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                c1500d = new C1500d(new C1674b(new C0867e(1, new C1678f(ComponentCallbacks2C0713b.m1484a(this.f6414a), c2757d, i, i4, bitmapM4844b))), 1);
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return c1500d;
                }
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC2472g.m4447a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return c1500d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC2472g.m4447a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return c1500d;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC2472g.m4447a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
