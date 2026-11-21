package p089k1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.media3.common.C0253x0;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.s */
/* loaded from: classes.dex */
public final class C1575s extends AbstractC1556c {

    /* renamed from: u */
    public static final Set f6034u = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: n */
    public final FileDescriptor f6035n;

    /* renamed from: o */
    public final long f6036o;

    /* renamed from: p */
    public final long f6037p;

    /* renamed from: q */
    public Uri f6038q;

    /* renamed from: r */
    public FileInputStream f6039r;

    /* renamed from: s */
    public long f6040s;

    /* renamed from: t */
    public boolean f6041t;

    public C1575s(FileDescriptor fileDescriptor, long j, long j8) {
        super(false);
        fileDescriptor.getClass();
        this.f6035n = fileDescriptor;
        this.f6036o = j;
        this.f6037p = j8;
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f6038q = null;
        f6034u.remove(this.f6035n);
        try {
            try {
                FileInputStream fileInputStream = this.f6039r;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new C1565i(e, 2000);
            }
        } finally {
            this.f6039r = null;
            if (this.f6041t) {
                this.f6041t = false;
                m3229k();
            }
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f6038q;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws IOException, ErrnoException {
        FileDescriptor fileDescriptor = this.f6035n;
        try {
            try {
                Uri uri = c1568l.f5996a;
                long j = c1568l.f6001f;
                long j8 = c1568l.f6000e;
                this.f6038q = uri;
                m3230l(c1568l);
                try {
                    if (!f6034u.add(fileDescriptor)) {
                        throw new C1565i(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
                    }
                    long j9 = this.f6037p;
                    if (j9 != -1 && j8 > j9) {
                        throw new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                    }
                    try {
                        Os.lseek(fileDescriptor, this.f6036o + j8, OsConstants.SEEK_SET);
                        FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                        this.f6039r = fileInputStream;
                        if (j9 == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f6040s = -1L;
                            } else {
                                long jPosition = size - channel.position();
                                this.f6040s = jPosition;
                                if (jPosition < 0) {
                                    throw new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                                }
                            }
                        } else {
                            long j10 = j9 - j8;
                            this.f6040s = j10;
                            if (j10 < 0) {
                                throw new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                            }
                        }
                        if (j != -1) {
                            long j11 = this.f6040s;
                            this.f6040s = j11 == -1 ? j : Math.min(j11, j);
                        }
                        this.f6041t = true;
                        m3231m(c1568l);
                        return j != -1 ? j : this.f6040s;
                    } catch (ErrnoException e) {
                        throw new C1565i(e, 2000);
                    }
                } catch (IOException e8) {
                    e = e8;
                    throw new C1565i(e, e instanceof FileNotFoundException ? C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (C1565i e10) {
            throw e10;
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        long j = this.f6040s;
        if (j != 0) {
            if (j != -1) {
                i4 = (int) Math.min(j, i4);
            }
            try {
                FileInputStream fileInputStream = this.f6039r;
                int i8 = AbstractC1118i0.f4750a;
                int i9 = fileInputStream.read(bArr, i, i4);
                if (i9 != -1) {
                    long j8 = this.f6040s;
                    if (j8 != -1) {
                        this.f6040s = j8 - i9;
                    }
                    m3228j(i9);
                    return i9;
                }
            } catch (IOException e) {
                throw new C1565i(e, 2000);
            }
        }
        return -1;
    }
}
