package androidx.media3.exoplayer.source;

import android.net.Uri;
import p085j6.InterfaceFutureC1529s;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ExternalLoader {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }

    InterfaceFutureC1529s load(LoadRequest loadRequest);
}
