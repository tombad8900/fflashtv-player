package p089k1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.C0253x0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.b */
/* loaded from: classes.dex */
public final class C1554b extends AbstractC1556c {

    /* renamed from: n */
    public final AssetManager f5948n;

    /* renamed from: o */
    public Uri f5949o;

    /* renamed from: p */
    public InputStream f5950p;

    /* renamed from: q */
    public long f5951q;

    /* renamed from: r */
    public boolean f5952r;

    public C1554b(Context context) {
        super(false);
        this.f5948n = context.getAssets();
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f5949o = null;
        try {
            try {
                InputStream inputStream = this.f5950p;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C1552a(e, 2000);
            }
        } finally {
            this.f5950p = null;
            if (this.f5952r) {
                this.f5952r = false;
                m3229k();
            }
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f5949o;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws IOException {
        try {
            Uri uri = c1568l.f5996a;
            long j = c1568l.f6000e;
            this.f5949o = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m3230l(c1568l);
            InputStream inputStreamOpen = this.f5948n.open(path, 1);
            this.f5950p = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C1552a(null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
            }
            long j8 = c1568l.f6001f;
            if (j8 != -1) {
                this.f5951q = j8;
            } else {
                long jAvailable = this.f5950p.available();
                this.f5951q = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f5951q = -1L;
                }
            }
            this.f5952r = true;
            m3231m(c1568l);
            return this.f5951q;
        } catch (C1552a e) {
            throw e;
        } catch (IOException e8) {
            throw new C1552a(e8, e8 instanceof FileNotFoundException ? C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        long j = this.f5951q;
        if (j != 0) {
            if (j != -1) {
                try {
                    i4 = (int) Math.min(j, i4);
                } catch (IOException e) {
                    throw new C1552a(e, 2000);
                }
            }
            InputStream inputStream = this.f5950p;
            int i8 = AbstractC1118i0.f4750a;
            int i9 = inputStream.read(bArr, i, i4);
            if (i9 != -1) {
                long j8 = this.f5951q;
                if (j8 != -1) {
                    this.f5951q = j8 - i9;
                }
                m3228j(i9);
                return i9;
            }
        }
        return -1;
    }
}
