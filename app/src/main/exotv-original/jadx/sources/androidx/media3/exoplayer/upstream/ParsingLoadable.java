package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.C1555b0;
import p089k1.C1566j;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {
    private final C1555b0 dataSource;
    public final C1568l dataSpec;
    public final long loadTaskId;
    private final Parser<? extends T> parser;
    private volatile T result;
    public final int type;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ParsingLoadable(InterfaceC1564h interfaceC1564h, Uri uri, int i, Parser<? extends T> parser) {
        Map map = Collections.EMPTY_MAP;
        AbstractC1101a.m2361l("The uri must be set.", uri);
        this(interfaceC1564h, new C1568l(uri, 1, null, map, 0L, -1L, null, 1), i, parser);
    }

    public static <T> T load(InterfaceC1564h interfaceC1564h, Parser<? extends T> parser, Uri uri, int i) {
        ParsingLoadable parsingLoadable = new ParsingLoadable(interfaceC1564h, uri, i, parser);
        parsingLoadable.load();
        T t8 = (T) parsingLoadable.getResult();
        t8.getClass();
        return t8;
    }

    public long bytesLoaded() {
        return this.dataSource.f5954k;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.f5956m;
    }

    public final T getResult() {
        return this.result;
    }

    public Uri getUri() {
        return this.dataSource.f5955l;
    }

    public static <T> T load(InterfaceC1564h interfaceC1564h, Parser<? extends T> parser, C1568l c1568l, int i) {
        ParsingLoadable parsingLoadable = new ParsingLoadable(interfaceC1564h, c1568l, i, parser);
        parsingLoadable.load();
        T t8 = (T) parsingLoadable.getResult();
        t8.getClass();
        return t8;
    }

    public ParsingLoadable(InterfaceC1564h interfaceC1564h, C1568l c1568l, int i, Parser<? extends T> parser) {
        this.dataSource = new C1555b0(interfaceC1564h);
        this.dataSpec = c1568l;
        this.type = i;
        this.parser = parser;
        this.loadTaskId = LoadEventInfo.getNewId();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        this.dataSource.f5954k = 0L;
        C1566j c1566j = new C1566j(this.dataSource, this.dataSpec);
        try {
            c1566j.m3232b();
            Uri uri = this.dataSource.f5953j.getUri();
            uri.getClass();
            this.result = this.parser.parse(uri, c1566j);
        } finally {
            AbstractC1118i0.m2448g(c1566j);
        }
    }
}
