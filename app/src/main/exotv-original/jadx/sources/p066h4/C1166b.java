package p066h4;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.C0726c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p005a4.InterfaceC0080f0;
import p015b4.C0572f;
import p178u4.AbstractC2472g;
import p178u4.AbstractC2478m;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.InterfaceC2807k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.b */
/* loaded from: classes.dex */
public final class C1166b implements InterfaceC2807k {

    /* renamed from: k */
    public static final C2803g f5005k = C2803g.m4907a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: l */
    public static final C2803g f5006l = new C2803g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C2803g.f10419e);

    /* renamed from: j */
    public final C0572f f5007j;

    public C1166b(C0572f c0572f) {
        this.f5007j = c0572f;
    }

    @Override // p210y3.InterfaceC2807k
    /* renamed from: j */
    public final int mo53j(C2804h c2804h) {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // p210y3.InterfaceC2798b
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo54k(Object obj, File file, C2804h c2804h) throws Throwable {
        boolean z7;
        Bitmap bitmap = (Bitmap) ((InterfaceC0080f0) obj).get();
        C2803g c2803g = f5006l;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c2804h.m4908c(c2803g);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC2472g.f9058b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c2804h.m4908c(f5005k)).intValue();
        OutputStream c0726c = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C0572f c0572f = this.f5007j;
                if (c0572f != null) {
                    try {
                        c0726c = new C0726c(fileOutputStream, c0572f);
                    } catch (IOException e) {
                        e = e;
                        c0726c = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c0726c != null) {
                            try {
                                c0726c.close();
                            } catch (IOException unused) {
                            }
                        }
                        z7 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z7;
                    } catch (Throwable th) {
                        th = th;
                        c0726c = fileOutputStream;
                        if (c0726c != null) {
                            try {
                                c0726c.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c0726c = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c0726c);
                c0726c.close();
                try {
                    c0726c.close();
                } catch (IOException unused3) {
                }
                z7 = true;
            } catch (IOException e8) {
                e = e8;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC2478m.m4455c(bitmap) + " in " + AbstractC2472g.m4447a(jElapsedRealtimeNanos) + ", options format: " + c2804h.m4908c(c2803g) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z7;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
