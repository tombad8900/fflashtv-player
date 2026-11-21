package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public abstract class AbstractC0117b {
    /* renamed from: a */
    public static Uri m391a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* renamed from: b */
    public static void m392b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
