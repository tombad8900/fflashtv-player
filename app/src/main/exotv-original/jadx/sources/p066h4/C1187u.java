package p066h4;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.u */
/* loaded from: classes.dex */
public final class C1187u {

    /* renamed from: e */
    public static final boolean f5052e;

    /* renamed from: f */
    public static final boolean f5053f;

    /* renamed from: g */
    public static final File f5054g;

    /* renamed from: h */
    public static volatile C1187u f5055h;

    /* renamed from: b */
    public int f5057b;

    /* renamed from: c */
    public boolean f5058c = true;

    /* renamed from: d */
    public final AtomicBoolean f5059d = new AtomicBoolean(false);

    /* renamed from: a */
    public final int f5056a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f5052e = i < 29;
        f5053f = i >= 28;
        f5054g = new File("/proc/self/fd");
    }

    /* renamed from: a */
    public static C1187u m2606a() {
        if (f5055h == null) {
            synchronized (C1187u.class) {
                try {
                    if (f5055h == null) {
                        f5055h = new C1187u();
                    }
                } finally {
                }
            }
        }
        return f5055h;
    }

    /* renamed from: b */
    public final int m2607b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f5056a;
    }

    /* renamed from: c */
    public final boolean m2608c(int i, int i4, boolean z7, boolean z8) {
        boolean z9;
        if (z7) {
            if (f5053f) {
                if (!f5052e || this.f5059d.get()) {
                    if (z8) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i4 >= 0) {
                        synchronized (this) {
                            try {
                                int i8 = this.f5057b + 1;
                                this.f5057b = i8;
                                if (i8 >= 50) {
                                    this.f5057b = 0;
                                    int length = f5054g.list().length;
                                    long jM2607b = m2607b();
                                    boolean z10 = ((long) length) < jM2607b;
                                    this.f5058c = z10;
                                    if (!z10 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM2607b);
                                    }
                                }
                                z9 = this.f5058c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z9) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
