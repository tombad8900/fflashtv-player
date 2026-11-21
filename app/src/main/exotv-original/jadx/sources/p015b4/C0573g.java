package p015b4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p178u4.AbstractC2478m;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b4.g */
/* loaded from: classes.dex */
public final class C0573g implements InterfaceC0567a {

    /* renamed from: s */
    public static final Bitmap.Config f2289s = Bitmap.Config.ARGB_8888;

    /* renamed from: j */
    public final C0577k f2290j;

    /* renamed from: k */
    public final Set f2291k;

    /* renamed from: l */
    public final C2819f f2292l;

    /* renamed from: m */
    public final long f2293m;

    /* renamed from: n */
    public long f2294n;

    /* renamed from: o */
    public int f2295o;

    /* renamed from: p */
    public int f2296p;

    /* renamed from: q */
    public int f2297q;

    /* renamed from: r */
    public int f2298r;

    public C0573g(long j) {
        C0577k c0577k = new C0577k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f2293m = j;
        this.f2290j = c0577k;
        this.f2291k = setUnmodifiableSet;
        this.f2292l = new C2819f(11);
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: a */
    public final void mo1307a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo1311m();
        } else if (i >= 20 || i == 15) {
            m1326f(this.f2293m / 2);
        }
    }

    /* renamed from: b */
    public final void m1324b() {
        Log.v("LruBitmapPool", "Hits=" + this.f2295o + ", misses=" + this.f2296p + ", puts=" + this.f2297q + ", evictions=" + this.f2298r + ", currentSize=" + this.f2294n + ", maxSize=" + this.f2293m + "\nStrategy=" + this.f2290j);
    }

    /* renamed from: c */
    public final synchronized Bitmap m1325c(int i, int i4, Bitmap.Config config) {
        Bitmap bitmapM1329b;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM1329b = this.f2290j.m1329b(i, i4, config != null ? config : f2289s);
            if (bitmapM1329b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f2290j.getClass();
                    sb.append(C0577k.m1327c(AbstractC2478m.m4456d(config) * i * i4, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f2296p++;
            } else {
                this.f2295o++;
                long j = this.f2294n;
                this.f2290j.getClass();
                this.f2294n = j - AbstractC2478m.m4455c(bitmapM1329b);
                this.f2292l.getClass();
                bitmapM1329b.setHasAlpha(true);
                bitmapM1329b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f2290j.getClass();
                sb2.append(C0577k.m1327c(AbstractC2478m.m4456d(config) * i * i4, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m1324b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM1329b;
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: d */
    public final Bitmap mo1308d(int i, int i4, Bitmap.Config config) {
        Bitmap bitmapM1325c = m1325c(i, i4, config);
        if (bitmapM1325c != null) {
            return bitmapM1325c;
        }
        if (config == null) {
            config = f2289s;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: e */
    public final synchronized void mo1309e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f2290j.getClass();
                if (AbstractC2478m.m4455c(bitmap) <= this.f2293m && this.f2291k.contains(bitmap.getConfig())) {
                    this.f2290j.getClass();
                    int iM4455c = AbstractC2478m.m4455c(bitmap);
                    this.f2290j.m1331e(bitmap);
                    this.f2292l.getClass();
                    this.f2297q++;
                    this.f2294n += iM4455c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f2290j.getClass();
                        sb.append(C0577k.m1327c(AbstractC2478m.m4455c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m1324b();
                    }
                    m1326f(this.f2293m);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f2290j.getClass();
                sb2.append(C0577k.m1327c(AbstractC2478m.m4455c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f2291k.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final synchronized void m1326f(long j) {
        while (this.f2294n > j) {
            try {
                C0577k c0577k = this.f2290j;
                Bitmap bitmap = (Bitmap) c0577k.f2309b.m42L();
                if (bitmap != null) {
                    c0577k.m1328a(Integer.valueOf(AbstractC2478m.m4455c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m1324b();
                    }
                    this.f2294n = 0L;
                    return;
                }
                this.f2292l.getClass();
                long j8 = this.f2294n;
                this.f2290j.getClass();
                this.f2294n = j8 - AbstractC2478m.m4455c(bitmap);
                this.f2298r++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f2290j.getClass();
                    sb.append(C0577k.m1327c(AbstractC2478m.m4455c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m1324b();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: k */
    public final Bitmap mo1310k(int i, int i4, Bitmap.Config config) {
        Bitmap bitmapM1325c = m1325c(i, i4, config);
        if (bitmapM1325c != null) {
            bitmapM1325c.eraseColor(0);
            return bitmapM1325c;
        }
        if (config == null) {
            config = f2289s;
        }
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: m */
    public final void mo1311m() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m1326f(0L);
    }
}
