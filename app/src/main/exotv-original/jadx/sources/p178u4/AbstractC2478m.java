package p178u4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.m */
/* loaded from: classes.dex */
public abstract class AbstractC2478m {

    /* renamed from: a */
    public static final char[] f9069a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f9070b = new char[64];

    /* renamed from: c */
    public static volatile Handler f9071c;

    /* renamed from: a */
    public static void m4453a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m4454b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static int m4455c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: d */
    public static int m4456d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC2477l.f9068a[config.ordinal()];
        int i4 = 1;
        if (i != 1) {
            i4 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i4;
    }

    /* renamed from: e */
    public static ArrayList m4457e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Handler m4458f() {
        if (f9071c == null) {
            synchronized (AbstractC2478m.class) {
                try {
                    if (f9071c == null) {
                        f9071c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f9071c;
    }

    /* renamed from: g */
    public static int m4459g(int i, int i4) {
        return (i4 * 31) + i;
    }

    /* renamed from: h */
    public static int m4460h(int i, Object obj) {
        return m4459g(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: i */
    public static boolean m4461i(int i, int i4) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i4 > 0 || i4 == Integer.MIN_VALUE;
        }
        return false;
    }
}
