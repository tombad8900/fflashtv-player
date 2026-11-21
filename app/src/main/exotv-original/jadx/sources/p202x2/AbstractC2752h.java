package p202x2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p148r.AbstractC2285g;
import p148r.C2286h;
import p189v7.C2556a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x2.h */
/* loaded from: classes.dex */
public abstract class AbstractC2752h {

    /* renamed from: a */
    public static final C2286h f10153a = new C2286h();

    /* renamed from: b */
    public static final Object f10154b = new Object();

    /* renamed from: c */
    public static C2556a0 f10155c = null;

    /* renamed from: a */
    public static long m4834a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2750f.m4831a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C2556a0 m4835b() {
        C2556a0 c2556a0 = new C2556a0(8);
        f10155c = c2556a0;
        C2286h c2286h = f10153a;
        c2286h.getClass();
        if (AbstractC2285g.f7974o.mo434e(c2286h, null, c2556a0)) {
            AbstractC2285g.m4085c(c2286h);
        }
        return f10155c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4836c(Context context, boolean z7) {
        int i;
        boolean z8;
        int i4;
        long length;
        File file;
        C2751g c2751gM4832a;
        C2751g c2751g;
        int i8;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z7 || f10155c == null) {
            synchronized (f10154b) {
                if (z7) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jM4834a = m4834a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (c2751gM4832a == null) {
                                    if (z8) {
                                    }
                                }
                                if (z7) {
                                    i = 2;
                                }
                                if (c2751gM4832a != null) {
                                    i = 3;
                                }
                                c2751g = new C2751g(1, i, jM4834a, length);
                                if (c2751gM4832a != null) {
                                    c2751g.m4833b(file);
                                }
                                m4835b();
                                return;
                            }
                        }
                    }
                    m4835b();
                    return;
                }
                if (f10155c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z8 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z8 = false;
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28 && i4 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z9 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z10 = !file32.exists() && length > 0;
                    try {
                        long jM4834a2 = m4834a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            c2751gM4832a = null;
                        } else {
                            try {
                                c2751gM4832a = C2751g.m4832a(file);
                            } catch (IOException unused2) {
                                m4835b();
                                return;
                            }
                        }
                        if (c2751gM4832a == null && c2751gM4832a.f10151c == jM4834a2 && (i8 = c2751gM4832a.f10150b) != 2) {
                            i = i8;
                        } else if (z8) {
                            i = 327680;
                        } else if (z9) {
                            i = 1;
                        } else if (z10) {
                            i = 2;
                        }
                        if (z7 && z10 && i != 1) {
                            i = 2;
                        }
                        if (c2751gM4832a != null && c2751gM4832a.f10150b == 2 && i == 1 && length22 < c2751gM4832a.f10152d) {
                            i = 3;
                        }
                        c2751g = new C2751g(1, i, jM4834a2, length);
                        if (c2751gM4832a != null || !c2751gM4832a.equals(c2751g)) {
                            try {
                                c2751g.m4833b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m4835b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m4835b();
                        return;
                    }
                }
                m4835b();
                return;
            }
        }
    }
}
