package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.media3.common.C0212j1;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T>> implements ParsingLoadable.Parser<T> {
    private final ParsingLoadable.Parser<? extends T> parser;
    private final List<C0212j1> streamKeys;

    public FilteringManifestParser(ParsingLoadable.Parser<? extends T> parser, List<C0212j1> list) {
        this.parser = parser;
        this.streamKeys = list;
    }

    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public T parse(Uri uri, InputStream inputStream) {
        T t8 = this.parser.parse(uri, inputStream);
        List<C0212j1> list = this.streamKeys;
        return (list == null || list.isEmpty()) ? t8 : (T) t8.copy(this.streamKeys);
    }
}
