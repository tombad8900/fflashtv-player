package p185v3;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.C2180y;
import okhttp3.C2181z;
import p002a1.C0048u;
import p069h7.AbstractC1206h;
import p111m6.AbstractC1913h;
import p151r3.ViewOnAttachStateChangeListenerC2309u;
import p160s3.C2350a;
import p160s3.EnumC2356g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v3.f */
/* loaded from: classes.dex */
public abstract class AbstractC2536f {

    /* renamed from: a */
    public static final Bitmap.Config[] f9216a;

    /* renamed from: b */
    public static final Bitmap.Config f9217b;

    /* renamed from: c */
    public static final C2180y f9218c;

    static {
        int i = Build.VERSION.SDK_INT;
        f9216a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f9217b = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f9218c = new C2180y.a().build();
    }

    /* renamed from: a */
    public static final void m4554a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final String m4555b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC1206h.m2630D0(str)) {
            return null;
        }
        String strM2643Q0 = AbstractC1206h.m2643Q0(AbstractC1206h.m2643Q0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC1206h.m2641O0(AbstractC1206h.m2641O0(strM2643Q0, '/', strM2643Q0), '.', C2181z.FRAGMENT_ENCODE_SET));
    }

    /* renamed from: c */
    public static final ViewOnAttachStateChangeListenerC2309u m4556c(View view) {
        ViewOnAttachStateChangeListenerC2309u viewOnAttachStateChangeListenerC2309u;
        Object tag = view.getTag(R.id.coil_request_manager);
        ViewOnAttachStateChangeListenerC2309u viewOnAttachStateChangeListenerC2309u2 = tag instanceof ViewOnAttachStateChangeListenerC2309u ? (ViewOnAttachStateChangeListenerC2309u) tag : null;
        if (viewOnAttachStateChangeListenerC2309u2 != null) {
            return viewOnAttachStateChangeListenerC2309u2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                viewOnAttachStateChangeListenerC2309u = tag2 instanceof ViewOnAttachStateChangeListenerC2309u ? (ViewOnAttachStateChangeListenerC2309u) tag2 : null;
                if (viewOnAttachStateChangeListenerC2309u == null) {
                    viewOnAttachStateChangeListenerC2309u = new ViewOnAttachStateChangeListenerC2309u(view);
                    view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2309u);
                    view.setTag(R.id.coil_request_manager, viewOnAttachStateChangeListenerC2309u);
                }
            } finally {
            }
        }
        return viewOnAttachStateChangeListenerC2309u;
    }

    /* renamed from: d */
    public static final boolean m4557d(Uri uri) {
        return AbstractC2980h.m5132a(uri.getScheme(), "file") && AbstractC2980h.m5132a((String) AbstractC1913h.m3737B0(uri.getPathSegments()), "android_asset");
    }

    /* renamed from: e */
    public static final int m4558e(AbstractC0715d abstractC0715d, EnumC2356g enumC2356g) {
        if (abstractC0715d instanceof C2350a) {
            return ((C2350a) abstractC0715d).f8260n;
        }
        int iOrdinal = enumC2356g.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new C0048u();
    }
}
