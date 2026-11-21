package p041e4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p178u4.AbstractC2466a;
import p210y3.C2804h;
import p210y3.InterfaceC2798b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.a0 */
/* loaded from: classes.dex */
public final class C0880a0 implements InterfaceC0902s, InterfaceC2798b {

    /* renamed from: k */
    public static final C0880a0 f3884k = new C0880a0(0);

    /* renamed from: j */
    public final /* synthetic */ int f3885j;

    public /* synthetic */ C0880a0(int i) {
        this.f3885j = i;
    }

    /* renamed from: a */
    public static ByteArrayInputStream m2047a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* renamed from: b */
    public Class m2048b() {
        switch (this.f3885j) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        switch (this.f3885j) {
            case 0:
                return C0882b0.f3889b;
            case 2:
                return new C0883c(0, new C0880a0(1));
            case 4:
                return new C0883c(0, new C0880a0(3));
            case 6:
                return new C0882b0(1);
            case 11:
                return new C0909z(c0907x.m2070a(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new C0909z(c0907x.m2070a(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new C0909z(c0907x.m2070a(Uri.class, InputStream.class), 0);
            default:
                return new C0888e0(c0907x.m2070a(C0891h.class, InputStream.class));
        }
    }

    @Override // p210y3.InterfaceC2798b
    /* renamed from: k */
    public boolean mo54k(Object obj, File file, C2804h c2804h) throws Throwable {
        try {
            AbstractC2466a.m4442d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
