package p089k1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C0253x0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.a0 */
/* loaded from: classes.dex */
public final class C1553a0 extends AbstractC1556c {

    /* renamed from: n */
    public final Context f5942n;

    /* renamed from: o */
    public C1568l f5943o;

    /* renamed from: p */
    public AssetFileDescriptor f5944p;

    /* renamed from: q */
    public FileInputStream f5945q;

    /* renamed from: r */
    public long f5946r;

    /* renamed from: s */
    public boolean f5947s;

    public C1553a0(Context context) {
        super(false);
        this.f5942n = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        this.f5943o = null;
        try {
            try {
                FileInputStream fileInputStream = this.f5945q;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f5945q = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5944p;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C1582z(null, e, 2000);
                    }
                } finally {
                    this.f5944p = null;
                    if (this.f5947s) {
                        this.f5947s = false;
                        m3229k();
                    }
                }
            } catch (IOException e8) {
                throw new C1582z(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f5945q = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f5944p;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f5944p = null;
                    if (this.f5947s) {
                        this.f5947s = false;
                        m3229k();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new C1582z(null, e9, 2000);
                }
            } finally {
                this.f5944p = null;
                if (this.f5947s) {
                    this.f5947s = false;
                    m3229k();
                }
            }
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        C1568l c1568l = this.f5943o;
        if (c1568l != null) {
            return c1568l.f5996a;
        }
        return null;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws C1565i, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f5943o = c1568l;
        m3230l(c1568l);
        Uri uri = c1568l.f5996a;
        long j = c1568l.f6001f;
        long j8 = c1568l.f6000e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f5942n;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C1582z("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C1582z("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C1582z("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C1582z("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C1582z("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new C1582z("Resource not found.", null, C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C1582z("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f5944p = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f5944p.getFileDescriptor());
            this.f5945q = fileInputStream;
            try {
                if (length != -1 && j8 > length) {
                    throw new C1582z(null, null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                }
                long startOffset = this.f5944p.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j8) - startOffset;
                if (jSkip != j8) {
                    throw new C1582z(null, null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f5946r = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f5946r = size;
                        if (size < 0) {
                            throw new C1582z(null, null, C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                        }
                    }
                } else {
                    long j9 = length - jSkip;
                    this.f5946r = j9;
                    if (j9 < 0) {
                        throw new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
                    }
                }
                if (j != -1) {
                    long j10 = this.f5946r;
                    this.f5946r = j10 == -1 ? j : Math.min(j10, j);
                }
                this.f5947s = true;
                m3231m(c1568l);
                return j != -1 ? j : this.f5946r;
            } catch (C1582z e8) {
                throw e8;
            } catch (IOException e9) {
                throw new C1582z(null, e9, 2000);
            }
        } catch (Resources.NotFoundException e10) {
            throw new C1582z(null, e10, C0253x0.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        long j = this.f5946r;
        if (j != 0) {
            if (j != -1) {
                try {
                    i4 = (int) Math.min(j, i4);
                } catch (IOException e) {
                    throw new C1582z(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f5945q;
            int i8 = AbstractC1118i0.f4750a;
            int i9 = fileInputStream.read(bArr, i, i4);
            if (i9 != -1) {
                long j8 = this.f5946r;
                if (j8 != -1) {
                    this.f5946r = j8 - i9;
                }
                m3228j(i9);
                return i9;
            }
            if (this.f5946r != -1) {
                throw new C1582z("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
