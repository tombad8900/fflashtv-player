package androidx.media3.exoplayer.dash.manifest;

import java.util.Objects;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class Descriptor {

    /* renamed from: id */
    public final String f1716id;
    public final String schemeIdUri;
    public final String value;

    public Descriptor(String str, String str2, String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.f1716id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Descriptor.class == obj.getClass()) {
            Descriptor descriptor = (Descriptor) obj;
            String str = this.schemeIdUri;
            String str2 = descriptor.schemeIdUri;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(str, str2) && Objects.equals(this.value, descriptor.value) && Objects.equals(this.f1716id, descriptor.f1716id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.schemeIdUri.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1716id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
