package p089k1;

import android.net.Uri;
import androidx.media3.common.AbstractC0229p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.l */
/* loaded from: classes.dex */
public final class C1568l {

    /* renamed from: i */
    public static final /* synthetic */ int f5995i = 0;

    /* renamed from: a */
    public final Uri f5996a;

    /* renamed from: b */
    public final int f5997b;

    /* renamed from: c */
    public final byte[] f5998c;

    /* renamed from: d */
    public final Map f5999d;

    /* renamed from: e */
    public final long f6000e;

    /* renamed from: f */
    public final long f6001f;

    /* renamed from: g */
    public final String f6002g;

    /* renamed from: h */
    public final int f6003h;

    static {
        AbstractC0229p0.m658a("media3.datasource");
    }

    public C1568l(Uri uri) {
        this(uri, 0L, -1L);
    }

    /* renamed from: a */
    public final C1567k m3237a() {
        C1567k c1567k = new C1567k();
        c1567k.f5991e = this.f5996a;
        c1567k.f5987a = this.f5997b;
        c1567k.f5992f = this.f5998c;
        c1567k.f5993g = this.f5999d;
        c1567k.f5988b = this.f6000e;
        c1567k.f5990d = this.f6001f;
        c1567k.f5994h = this.f6002g;
        c1567k.f5989c = this.f6003h;
        return c1567k;
    }

    /* renamed from: b */
    public final C1568l m3238b(long j) {
        long j8 = this.f6001f;
        return m3239c(j, j8 != -1 ? j8 - j : -1L);
    }

    /* renamed from: c */
    public final C1568l m3239c(long j, long j8) {
        if (j == 0 && this.f6001f == j8) {
            return this;
        }
        return new C1568l(this.f5996a, this.f5997b, this.f5998c, this.f5999d, this.f6000e + j, j8, this.f6002g, this.f6003h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f5997b;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f5996a);
        sb.append(", ");
        sb.append(this.f6000e);
        sb.append(", ");
        sb.append(this.f6001f);
        sb.append(", ");
        sb.append(this.f6002g);
        sb.append(", ");
        sb.append(this.f6003h);
        sb.append("]");
        return sb.toString();
    }

    public C1568l(Uri uri, long j, long j8) {
        this(uri, 1, null, Collections.EMPTY_MAP, j, j8, null, 0);
    }

    public C1568l(Uri uri, int i, byte[] bArr, Map map, long j, long j8, String str, int i4) {
        AbstractC1101a.m2353d(j >= 0);
        AbstractC1101a.m2353d(j >= 0);
        AbstractC1101a.m2353d(j8 > 0 || j8 == -1);
        uri.getClass();
        this.f5996a = uri;
        this.f5997b = i;
        this.f5998c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f5999d = Collections.unmodifiableMap(new HashMap(map));
        this.f6000e = j;
        this.f6001f = j8;
        this.f6002g = str;
        this.f6003h = i4;
    }
}
