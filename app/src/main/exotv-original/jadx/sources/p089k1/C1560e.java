package p089k1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C0253x0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.e */
/* loaded from: classes.dex */
public final class C1560e extends AbstractC1556c {

    /* renamed from: n */
    public final ContentResolver f5961n;

    /* renamed from: o */
    public Uri f5962o;

    /* renamed from: p */
    public AssetFileDescriptor f5963p;

    /* renamed from: q */
    public FileInputStream f5964q;

    /* renamed from: r */
    public long f5965r;

    /* renamed from: s */
    public boolean f5966s;

    public C1560e(Context context) {
        super(false);
        this.f5961n = context.getContentResolver();
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f5962o = null;
        try {
            try {
                FileInputStream fileInputStream = this.f5964q;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f5964q = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5963p;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C1558d(e, 2000);
                    }
                } finally {
                    this.f5963p = null;
                    if (this.f5966s) {
                        this.f5966s = false;
                        m3229k();
                    }
                }
            } catch (IOException e8) {
                throw new C1558d(e8, 2000);
            }
        } catch (Throwable th) {
            this.f5964q = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f5963p;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f5963p = null;
                    if (this.f5966s) {
                        this.f5966s = false;
                        m3229k();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new C1558d(e9, 2000);
                }
            } finally {
                this.f5963p = null;
                if (this.f5966s) {
                    this.f5966s = false;
                    m3229k();
                }
            }
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f5962o;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c1568l.f5996a;
                long j = c1568l.f6001f;
                long j8 = c1568l.f6000e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f5962o = uriNormalizeScheme;
                m3230l(c1568l);
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f5961n;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f5963p = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C1558d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND;
                        }
                        throw new C1558d(e, i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f5964q = fileInputStream;
                if (length != -1 && j8 > length) {
                    throw new C1558d(null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j8) - startOffset;
                if (jSkip != j8) {
                    throw new C1558d(null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f5965r = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f5965r = jPosition;
                        if (jPosition < 0) {
                            throw new C1558d(null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                        }
                    }
                } else {
                    long j9 = length - jSkip;
                    this.f5965r = j9;
                    if (j9 < 0) {
                        throw new C1558d(null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                    }
                }
                if (j != -1) {
                    long j10 = this.f5965r;
                    this.f5965r = j10 == -1 ? j : Math.min(j10, j);
                }
                this.f5966s = true;
                m3231m(c1568l);
                return j != -1 ? j : this.f5965r;
            } catch (IOException e8) {
                e = e8;
                i = 2000;
            }
        } catch (C1558d e9) {
            throw e9;
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        long j = this.f5965r;
        if (j != 0) {
            if (j != -1) {
                try {
                    i4 = (int) Math.min(j, i4);
                } catch (IOException e) {
                    throw new C1558d(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f5964q;
            int i8 = AbstractC1118i0.f4750a;
            int i9 = fileInputStream.read(bArr, i, i4);
            if (i9 != -1) {
                long j8 = this.f5965r;
                if (j8 != -1) {
                    this.f5965r = j8 - i9;
                }
                m3228j(i9);
                return i9;
            }
        }
        return -1;
    }
}
