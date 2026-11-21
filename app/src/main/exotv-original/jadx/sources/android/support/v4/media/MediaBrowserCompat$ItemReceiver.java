package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import p000a.C0004e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0004e {
    @Override // p000a.C0004e
    /* renamed from: a */
    public final void mo0a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = AbstractC0120b.m405P(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
