package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C0247v0;
import java.util.List;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p115n1.InterfaceC1976g0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class UnrecognizedInputFormatException extends C0247v0 {
    public final AbstractC0983m0 sniffFailures;
    public final Uri uri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, C0981l1.f4211n);
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
    }

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends InterfaceC1976g0> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = AbstractC0983m0.m2165j(list);
    }
}
