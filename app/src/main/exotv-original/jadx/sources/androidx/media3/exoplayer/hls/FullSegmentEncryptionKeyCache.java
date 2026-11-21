package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap<Uri, byte[]> backingMap;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.backingMap = new LinkedHashMap<Uri, byte[]>(i + 1, 1.0f, false) { // from class: androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    public boolean containsUri(Uri uri) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.backingMap;
        uri.getClass();
        return linkedHashMap.containsKey(uri);
    }

    public byte[] get(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.backingMap.get(uri);
    }

    public byte[] put(Uri uri, byte[] bArr) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.backingMap;
        uri.getClass();
        bArr.getClass();
        return linkedHashMap.put(uri, bArr);
    }

    public byte[] remove(Uri uri) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.backingMap;
        uri.getClass();
        return linkedHashMap.remove(uri);
    }
}
