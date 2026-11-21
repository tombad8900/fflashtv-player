package androidx.media3.exoplayer.dash.manifest;

import android.support.v4.media.session.AbstractC0120b;
import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class BaseUrl {
    public static final int DEFAULT_DVB_PRIORITY = 1;
    public static final int DEFAULT_WEIGHT = 1;
    public static final int PRIORITY_UNSET = Integer.MIN_VALUE;
    public final int priority;
    public final String serviceLocation;
    public final String url;
    public final int weight;

    public BaseUrl(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUrl)) {
            return false;
        }
        BaseUrl baseUrl = (BaseUrl) obj;
        return this.priority == baseUrl.priority && this.weight == baseUrl.weight && AbstractC0120b.m422r(this.url, baseUrl.url) && AbstractC0120b.m422r(this.serviceLocation, baseUrl.serviceLocation);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.url, this.serviceLocation, Integer.valueOf(this.priority), Integer.valueOf(this.weight)});
    }

    public BaseUrl(String str, String str2, int i, int i4) {
        this.url = str;
        this.serviceLocation = str2;
        this.priority = i;
        this.weight = i4;
    }
}
