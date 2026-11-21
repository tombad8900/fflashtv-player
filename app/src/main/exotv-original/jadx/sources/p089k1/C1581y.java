package p089k1;

import android.media.MediaDataSource;
import android.net.Uri;
import androidx.media3.common.C0253x0;
import java.io.IOException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.y */
/* loaded from: classes.dex */
public final class C1581y extends AbstractC1556c {

    /* renamed from: n */
    public final MediaDataSource f6047n;

    /* renamed from: o */
    public Uri f6048o;

    /* renamed from: p */
    public long f6049p;

    /* renamed from: q */
    public long f6050q;

    /* renamed from: r */
    public boolean f6051r;

    public C1581y(MediaDataSource mediaDataSource) {
        super(false);
        this.f6047n = mediaDataSource;
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f6048o = null;
        if (this.f6051r) {
            this.f6051r = false;
            m3229k();
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f6048o;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws C1565i {
        Uri uri = c1568l.f5996a;
        long j = c1568l.f6001f;
        this.f6048o = uri;
        this.f6049p = c1568l.f6000e;
        m3230l(c1568l);
        MediaDataSource mediaDataSource = this.f6047n;
        if (mediaDataSource.getSize() != -1 && this.f6049p > mediaDataSource.getSize()) {
            throw new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
        }
        if (mediaDataSource.getSize() == -1) {
            this.f6050q = -1L;
        } else {
            this.f6050q = mediaDataSource.getSize() - this.f6049p;
        }
        if (j != -1) {
            long j8 = this.f6050q;
            this.f6050q = j8 == -1 ? j : Math.min(j8, j);
        }
        this.f6051r = true;
        m3231m(c1568l);
        return j != -1 ? j : this.f6050q;
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        long j = this.f6050q;
        if (j != 0) {
            if (j != -1) {
                i4 = (int) Math.min(j, i4);
            }
            try {
                int at = this.f6047n.readAt(this.f6049p, bArr, i, i4);
                if (at != -1) {
                    long j8 = at;
                    this.f6049p += j8;
                    long j9 = this.f6050q;
                    if (j9 != -1) {
                        this.f6050q = j9 - j8;
                    }
                    m3228j(at);
                    return at;
                }
            } catch (IOException e) {
                throw new C1565i(e, 2000);
            }
        }
        return -1;
    }
}
