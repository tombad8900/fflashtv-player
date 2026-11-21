package p089k1;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0253x0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.f */
/* loaded from: classes.dex */
public final class C1562f extends AbstractC1556c {

    /* renamed from: n */
    public C1568l f5976n;

    /* renamed from: o */
    public byte[] f5977o;

    /* renamed from: p */
    public int f5978p;

    /* renamed from: q */
    public int f5979q;

    @Override // p089k1.InterfaceC1564h
    public final void close() {
        if (this.f5977o != null) {
            this.f5977o = null;
            m3229k();
        }
        this.f5976n = null;
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        C1568l c1568l = this.f5976n;
        if (c1568l != null) {
            return c1568l.f5996a;
        }
        return null;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws C1565i, C0247v0 {
        m3230l(c1568l);
        this.f5976n = c1568l;
        Uri uri = c1568l.f5996a;
        long j = c1568l.f6001f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC1101a.m2352c("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = AbstractC1118i0.f4750a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C0247v0.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f5977o = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw C0247v0.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f5977o = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j8 = c1568l.f6000e;
        byte[] bArr = this.f5977o;
        if (j8 > bArr.length) {
            this.f5977o = null;
            throw new C1565i(C0253x0.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE);
        }
        int i4 = (int) j8;
        this.f5978p = i4;
        int length = bArr.length - i4;
        this.f5979q = length;
        if (j != -1) {
            this.f5979q = (int) Math.min(length, j);
        }
        m3231m(c1568l);
        return j != -1 ? j : this.f5979q;
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i8 = this.f5979q;
        if (i8 == 0) {
            return -1;
        }
        int iMin = Math.min(i4, i8);
        byte[] bArr2 = this.f5977o;
        int i9 = AbstractC1118i0.f4750a;
        System.arraycopy(bArr2, this.f5978p, bArr, i, iMin);
        this.f5978p += iMin;
        this.f5979q -= iMin;
        m3228j(iMin);
        return iMin;
    }
}
