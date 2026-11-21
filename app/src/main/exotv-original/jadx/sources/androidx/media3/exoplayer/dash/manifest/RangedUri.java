package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import okhttp3.C2181z;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j8) {
        this.referenceUri = str == null ? C2181z.FRAGMENT_ENCODE_SET : str;
        this.start = j;
        this.length = j8;
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        RangedUri rangedUri2 = null;
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            if (j != -1) {
                long j8 = this.start;
                if (j8 + j == rangedUri.start) {
                    long j9 = rangedUri.length;
                    return new RangedUri(strResolveUriString, j8, j9 != -1 ? j + j9 : -1L);
                }
            }
            long j10 = rangedUri.length;
            if (j10 != -1) {
                long j11 = rangedUri.start;
                if (j11 + j10 == this.start) {
                    rangedUri2 = new RangedUri(strResolveUriString, j11, j != -1 ? j10 + j : -1L);
                }
            }
        }
        return rangedUri2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RangedUri.class == obj.getClass()) {
            RangedUri rangedUri = (RangedUri) obj;
            if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.referenceUri.hashCode() + ((((527 + ((int) this.start)) * 31) + ((int) this.length)) * 31);
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return AbstractC1101a.m2345C(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return AbstractC1101a.m2344B(str, this.referenceUri);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.referenceUri + ", start=" + this.start + ", length=" + this.length + ")";
    }
}
