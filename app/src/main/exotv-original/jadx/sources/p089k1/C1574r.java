package p089k1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.C0253x0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.r */
/* loaded from: classes.dex */
public final class C1574r extends AbstractC1556c {

    /* renamed from: n */
    public RandomAccessFile f6030n;

    /* renamed from: o */
    public Uri f6031o;

    /* renamed from: p */
    public long f6032p;

    /* renamed from: q */
    public boolean f6033q;

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f6031o = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6030n;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C1573q(e, 2000);
            }
        } finally {
            this.f6030n = null;
            if (this.f6033q) {
                this.f6033q = false;
                m3229k();
            }
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f6031o;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws IOException {
        Uri uri = c1568l.f5996a;
        long j = c1568l.f6000e;
        this.f6031o = uri;
        m3230l(c1568l);
        int i = C0253x0.ERROR_CODE_IO_NO_PERMISSION;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6030n = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c1568l.f6001f;
                if (length == -1) {
                    length = this.f6030n.length() - j;
                }
                this.f6032p = length;
                if (length < 0) {
                    throw new C1573q(null, null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                }
                this.f6033q = true;
                m3231m(c1568l);
                return this.f6032p;
            } catch (IOException e) {
                throw new C1573q(e, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e8.getCause() instanceof ErrnoException) || ((ErrnoException) e8.getCause()).errno != OsConstants.EACCES) {
                    i = C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND;
                }
                throw new C1573q(e8, i);
            }
            throw new C1573q("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e8, 1004);
        } catch (SecurityException e9) {
            throw new C1573q(e9, C0253x0.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e10) {
            throw new C1573q(e10, 2000);
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        long j = this.f6032p;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6030n;
            int i8 = AbstractC1118i0.f4750a;
            int i9 = randomAccessFile.read(bArr, i, (int) Math.min(j, i4));
            if (i9 > 0) {
                this.f6032p -= i9;
                m3228j(i9);
            }
            return i9;
        } catch (IOException e) {
            throw new C1573q(e, 2000);
        }
    }
}
