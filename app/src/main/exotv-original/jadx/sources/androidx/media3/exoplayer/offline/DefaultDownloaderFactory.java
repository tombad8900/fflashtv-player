package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0235r0;
import androidx.media3.exoplayer.dash.offline.DashDownloader;
import androidx.media3.exoplayer.dash.offline.ExecutorC0339a;
import androidx.media3.exoplayer.hls.offline.HlsDownloader;
import androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p097l1.C1646b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private static final SparseArray<Constructor<? extends Downloader>> CONSTRUCTORS = createDownloaderConstructors();
    private final C1646b cacheDataSourceFactory;
    private final Executor executor;

    @Deprecated
    public DefaultDownloaderFactory(C1646b c1646b) {
        this(c1646b, new ExecutorC0339a());
    }

    private static SparseArray<Constructor<? extends Downloader>> createDownloaderConstructors() {
        SparseArray<Constructor<? extends Downloader>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, getDownloaderConstructor(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, getDownloaderConstructor(HlsDownloader.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, getDownloaderConstructor(SsDownloader.class));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends Downloader> getDownloaderConstructor(Class<?> cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(C0226o0.class, C1646b.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        C0211j0 c0211j0;
        int iM2420K = AbstractC1118i0.m2420K(downloadRequest.uri, downloadRequest.mimeType);
        if (iM2420K != 0) {
            boolean z7 = true;
            if (iM2420K != 1 && iM2420K != 2) {
                if (iM2420K != 4) {
                    throw new IllegalArgumentException(AbstractC0008a1.m12h(iM2420K, "Unsupported type: "));
                }
                C0188c0 c0188c0 = new C0188c0();
                C0199f0 c0199f0 = new C0199f0();
                List list = Collections.EMPTY_LIST;
                C0981l1 c0981l1 = C0981l1.f4211n;
                C0205h0 c0205h0 = new C0205h0();
                C0214k0 c0214k0 = C0214k0.f1167d;
                Uri uri = downloadRequest.uri;
                String str = downloadRequest.customCacheKey;
                if (c0199f0.f1091b != null && c0199f0.f1090a == null) {
                    z7 = false;
                }
                AbstractC1101a.m2359j(z7);
                if (uri != null) {
                    c0211j0 = new C0211j0(uri, null, c0199f0.f1090a != null ? new C0202g0(c0199f0) : null, null, list, str, c0981l1, null, -9223372036854775807L);
                } else {
                    c0211j0 = null;
                }
                return new ProgressiveDownloader(new C0226o0(C2181z.FRAGMENT_ENCODE_SET, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0), this.cacheDataSourceFactory, this.executor);
            }
        }
        return createDownloader(downloadRequest, iM2420K);
    }

    public DefaultDownloaderFactory(C1646b c1646b, Executor executor) {
        c1646b.getClass();
        this.cacheDataSourceFactory = c1646b;
        executor.getClass();
        this.executor = executor;
    }

    private Downloader createDownloader(DownloadRequest downloadRequest, int i) {
        List listUnmodifiableList;
        C0211j0 c0211j0;
        Constructor<? extends Downloader> constructor = CONSTRUCTORS.get(i);
        if (constructor != null) {
            C0188c0 c0188c0 = new C0188c0();
            C0199f0 c0199f0 = new C0199f0();
            List list = Collections.EMPTY_LIST;
            C0981l1 c0981l1 = C0981l1.f4211n;
            C0205h0 c0205h0 = new C0205h0();
            C0214k0 c0214k0 = C0214k0.f1167d;
            Uri uri = downloadRequest.uri;
            List<C0212j1> list2 = downloadRequest.streamKeys;
            if (list2 != null && !list2.isEmpty()) {
                listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            List list3 = listUnmodifiableList;
            String str = downloadRequest.customCacheKey;
            AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
            if (uri != null) {
                c0211j0 = new C0211j0(uri, null, c0199f0.f1090a != null ? new C0202g0(c0199f0) : null, null, list3, str, c0981l1, null, -9223372036854775807L);
            } else {
                c0211j0 = null;
            }
            try {
                return constructor.newInstance(new C0226o0(C2181z.FRAGMENT_ENCODE_SET, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0), this.cacheDataSourceFactory, this.executor);
            } catch (Exception e) {
                throw new IllegalStateException(AbstractC0008a1.m12h(i, "Failed to instantiate downloader for content type "), e);
            }
        }
        throw new IllegalStateException(AbstractC0008a1.m12h(i, "Module missing for content type "));
    }
}
