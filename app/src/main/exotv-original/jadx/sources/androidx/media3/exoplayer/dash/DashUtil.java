package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p048f2.C0935d;
import p052f6.C0996q1;
import p063h1.AbstractC1101a;
import p064h2.C1144i;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p090k2.C1584b;
import p090k2.InterfaceC1597o;
import p115n1.C1981j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DashUtil {
    private DashUtil() {
    }

    public static C1568l buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i, Map<String, String> map) {
        Map map2 = Collections.EMPTY_MAP;
        Uri uriResolveUri = rangedUri.resolveUri(str);
        long j = rangedUri.start;
        long j8 = rangedUri.length;
        String strResolveCacheKey = resolveCacheKey(representation, rangedUri);
        AbstractC1101a.m2361l("The uri must be set.", uriResolveUri);
        return new C1568l(uriResolveUri, 1, null, map, j, j8, strResolveCacheKey, i);
    }

    private static Representation getFirstRepresentation(Period period, int i) {
        int adaptationSetIndex = period.getAdaptationSetIndex(i);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List<Representation> list = period.adaptationSets.get(adaptationSetIndex).representations;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static C1981j loadChunkIndex(InterfaceC1564h interfaceC1564h, int i, Representation representation, int i4) {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, interfaceC1564h, representation, i4, true);
            chunkExtractorNewChunkExtractor.release();
            return chunkExtractorNewChunkExtractor.getChunkIndex();
        } catch (Throwable th) {
            chunkExtractorNewChunkExtractor.release();
            throw th;
        }
    }

    public static C0249w loadFormatWithDrmInitData(InterfaceC1564h interfaceC1564h, Period period) {
        int i = 2;
        Representation firstRepresentation = getFirstRepresentation(period, 2);
        if (firstRepresentation == null) {
            i = 1;
            firstRepresentation = getFirstRepresentation(period, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        C0249w c0249w = firstRepresentation.format;
        C0249w c0249wLoadSampleFormat = loadSampleFormat(interfaceC1564h, i, firstRepresentation);
        return c0249wLoadSampleFormat == null ? c0249w : c0249wLoadSampleFormat.m695f(c0249w);
    }

    private static void loadInitializationData(ChunkExtractor chunkExtractor, InterfaceC1564h interfaceC1564h, Representation representation, int i, boolean z7) {
        RangedUri initializationUri = representation.getInitializationUri();
        initializationUri.getClass();
        if (z7) {
            RangedUri indexUri = representation.getIndexUri();
            if (indexUri == null) {
                return;
            }
            RangedUri rangedUriAttemptMerge = initializationUri.attemptMerge(indexUri, ((BaseUrl) representation.baseUrls.get(i)).url);
            if (rangedUriAttemptMerge == null) {
                loadInitializationData(interfaceC1564h, representation, i, chunkExtractor, initializationUri);
                initializationUri = indexUri;
            } else {
                initializationUri = rangedUriAttemptMerge;
            }
        }
        loadInitializationData(interfaceC1564h, representation, i, chunkExtractor, initializationUri);
    }

    public static DashManifest loadManifest(InterfaceC1564h interfaceC1564h, Uri uri) {
        return (DashManifest) ParsingLoadable.load(interfaceC1564h, new DashManifestParser(), uri, 4);
    }

    public static C0249w loadSampleFormat(InterfaceC1564h interfaceC1564h, int i, Representation representation, int i4) {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, interfaceC1564h, representation, i4, false);
            chunkExtractorNewChunkExtractor.release();
            C0249w[] sampleFormats = chunkExtractorNewChunkExtractor.getSampleFormats();
            AbstractC1101a.m2360k(sampleFormats);
            return sampleFormats[0];
        } catch (Throwable th) {
            chunkExtractorNewChunkExtractor.release();
            throw th;
        }
    }

    private static ChunkExtractor newChunkExtractor(int i, C0249w c0249w) {
        String str = c0249w.f1521m;
        C1584b c1584b = InterfaceC1597o.f6077g;
        return new BundledChunkExtractor((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new C1144i(32, c1584b) : new C0935d(2, c1584b), i, c0249w);
    }

    public static String resolveCacheKey(Representation representation, RangedUri rangedUri) {
        String cacheKey = representation.getCacheKey();
        return cacheKey != null ? cacheKey : rangedUri.resolveUri(((BaseUrl) representation.baseUrls.get(0)).url).toString();
    }

    @Deprecated
    public static C1568l buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i) {
        return buildDataSpec(representation, str, rangedUri, i, C0996q1.f4246p);
    }

    public static C1981j loadChunkIndex(InterfaceC1564h interfaceC1564h, int i, Representation representation) {
        return loadChunkIndex(interfaceC1564h, i, representation, 0);
    }

    public static void loadInitializationData(ChunkExtractor chunkExtractor, InterfaceC1564h interfaceC1564h, Representation representation, boolean z7) {
        loadInitializationData(chunkExtractor, interfaceC1564h, representation, 0, z7);
    }

    public static C0249w loadSampleFormat(InterfaceC1564h interfaceC1564h, int i, Representation representation) {
        return loadSampleFormat(interfaceC1564h, i, representation, 0);
    }

    private static void loadInitializationData(InterfaceC1564h interfaceC1564h, Representation representation, int i, ChunkExtractor chunkExtractor, RangedUri rangedUri) {
        new InitializationChunk(interfaceC1564h, buildDataSpec(representation, ((BaseUrl) representation.baseUrls.get(i)).url, rangedUri, 0, C0996q1.f4246p), representation.format, 0, null, chunkExtractor).load();
    }

    @Deprecated
    public static C1568l buildDataSpec(Representation representation, RangedUri rangedUri, int i) {
        return buildDataSpec(representation, ((BaseUrl) representation.baseUrls.get(0)).url, rangedUri, i, C0996q1.f4246p);
    }
}
