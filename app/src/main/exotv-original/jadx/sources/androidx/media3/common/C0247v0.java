package androidx.media3.common;

import java.io.IOException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.v0 */
/* loaded from: classes.dex */
public class C0247v0 extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public C0247v0(String str, Throwable th, boolean z7, int i) {
        super(str, th);
        this.contentIsMalformed = z7;
        this.dataType = i;
    }

    public static C0247v0 createForMalformedContainer(String str, Throwable th) {
        return new C0247v0(str, th, true, 1);
    }

    public static C0247v0 createForMalformedDataOfUnknownType(String str, Throwable th) {
        return new C0247v0(str, th, true, 0);
    }

    public static C0247v0 createForMalformedManifest(String str, Throwable th) {
        return new C0247v0(str, th, true, 4);
    }

    public static C0247v0 createForManifestWithUnsupportedFeature(String str, Throwable th) {
        return new C0247v0(str, th, false, 4);
    }

    public static C0247v0 createForUnsupportedContainerFeature(String str) {
        return new C0247v0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.contentIsMalformed + ", dataType=" + this.dataType + "}";
    }
}
