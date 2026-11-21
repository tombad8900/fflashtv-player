package p089k1;

import android.net.Uri;
import androidx.media3.common.InterfaceC0219m;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.h */
/* loaded from: classes.dex */
public interface InterfaceC1564h extends InterfaceC0219m {
    void addTransferListener(InterfaceC1557c0 interfaceC1557c0);

    void close();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(C1568l c1568l);
}
