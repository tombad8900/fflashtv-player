package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.net.Uri;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.offline.FilterableManifest;
import com.bumptech.glide.AbstractC0714c;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p064h2.C1153r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class SsManifest implements FilterableManifest<SsManifest> {
    public static final int UNSET_LOOKAHEAD = -1;
    public final long durationUs;
    public final long dvrWindowLengthUs;
    public final boolean isLive;
    public final int lookAheadCount;
    public final int majorVersion;
    public final int minorVersion;
    public final ProtectionElement protectionElement;
    public final StreamElement[] streamElements;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class ProtectionElement {
        public final byte[] data;
        public final C1153r[] trackEncryptionBoxes;
        public final UUID uuid;

        public ProtectionElement(UUID uuid, byte[] bArr, C1153r[] c1153rArr) {
            this.uuid = uuid;
            this.data = bArr;
            this.trackEncryptionBoxes = c1153rArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SsManifest(int i, int i4, long j, long j8, long j9, int i8, boolean z7, ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        long jM2437a0;
        long jM2437a02 = -9223372036854775807L;
        if (j8 == 0) {
            jM2437a0 = -9223372036854775807L;
        } else {
            int i9 = AbstractC1118i0.f4750a;
            jM2437a0 = AbstractC1118i0.m2437a0(j8, 1000000L, j, RoundingMode.DOWN);
        }
        if (j9 != 0) {
            int i10 = AbstractC1118i0.f4750a;
            jM2437a02 = AbstractC1118i0.m2437a0(j9, 1000000L, j, RoundingMode.DOWN);
        }
        this(i, i4, jM2437a0, jM2437a02, i8, z7, protectionElement, streamElementArr);
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ SsManifest copy(List list) {
        return copy((List<C0212j1>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public final SsManifest copy(List<C0212j1> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StreamElement streamElement = null;
        int i = 0;
        while (i < arrayList.size()) {
            C0212j1 c0212j1 = (C0212j1) arrayList.get(i);
            StreamElement streamElement2 = this.streamElements[c0212j1.f1160k];
            if (streamElement2 != streamElement && streamElement != null) {
                arrayList2.add(streamElement.copy((C0249w[]) arrayList3.toArray(new C0249w[0])));
                arrayList3.clear();
            }
            arrayList3.add(streamElement2.formats[c0212j1.f1161l]);
            i++;
            streamElement = streamElement2;
        }
        if (streamElement != null) {
            arrayList2.add(streamElement.copy((C0249w[]) arrayList3.toArray(new C0249w[0])));
        }
        return new SsManifest(this.majorVersion, this.minorVersion, this.durationUs, this.dvrWindowLengthUs, this.lookAheadCount, this.isLive, this.protectionElement, (StreamElement[]) arrayList2.toArray(new StreamElement[0]));
    }

    private SsManifest(int i, int i4, long j, long j8, int i8, boolean z7, ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this.majorVersion = i;
        this.minorVersion = i4;
        this.durationUs = j;
        this.dvrWindowLengthUs = j8;
        this.lookAheadCount = i8;
        this.isLive = z7;
        this.protectionElement = protectionElement;
        this.streamElements = streamElementArr;
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class StreamElement {
        private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
        private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
        private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
        private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
        private final String baseUri;
        public final int chunkCount;
        private final List<Long> chunkStartTimes;
        private final long[] chunkStartTimesUs;
        private final String chunkTemplate;
        public final int displayHeight;
        public final int displayWidth;
        public final C0249w[] formats;
        public final String language;
        private final long lastChunkDurationUs;
        public final int maxHeight;
        public final int maxWidth;
        public final String name;
        public final String subType;
        public final long timescale;
        public final int type;

        /* JADX WARN: Illegal instructions before constructor call */
        public StreamElement(String str, String str2, int i, String str3, long j, String str4, int i4, int i8, int i9, int i10, String str5, C0249w[] c0249wArr, List<Long> list, long j8) {
            long j9 = j;
            int i11 = AbstractC1118i0.f4750a;
            RoundingMode roundingMode = RoundingMode.DOWN;
            int size = list.size();
            long[] jArr = new long[size];
            int i12 = 0;
            if (j9 >= 1000000 && j9 % 1000000 == 0) {
                long jM1492E = AbstractC0714c.m1492E(j9, 1000000L, RoundingMode.UNNECESSARY);
                while (i12 < size) {
                    jArr[i12] = AbstractC0714c.m1492E(list.get(i12).longValue(), jM1492E, roundingMode);
                    i12++;
                }
            } else if (j9 >= 1000000 || 1000000 % j9 != 0) {
                int i13 = 0;
                while (i13 < size) {
                    long jLongValue = list.get(i13).longValue();
                    if (jLongValue != 0) {
                        if (j9 >= jLongValue && j9 % jLongValue == 0) {
                            jArr[i13] = AbstractC0714c.m1492E(1000000L, AbstractC0714c.m1492E(j9, jLongValue, RoundingMode.UNNECESSARY), roundingMode);
                        } else if (j9 >= jLongValue || jLongValue % j9 != 0) {
                            jArr[i13] = AbstractC1118i0.m2439b0(jLongValue, 1000000L, j9, roundingMode);
                        } else {
                            jArr[i13] = AbstractC0714c.m1511Z(1000000L, AbstractC0714c.m1492E(jLongValue, j9, RoundingMode.UNNECESSARY));
                        }
                    }
                    i13++;
                    j9 = j;
                }
            } else {
                long jM1492E2 = AbstractC0714c.m1492E(1000000L, j9, RoundingMode.UNNECESSARY);
                while (i12 < size) {
                    jArr[i12] = AbstractC0714c.m1511Z(list.get(i12).longValue(), jM1492E2);
                    i12++;
                }
            }
            this(str, str2, i, str3, j, str4, i4, i8, i9, i10, str5, c0249wArr, list, jArr, AbstractC1118i0.m2437a0(j8, 1000000L, j, RoundingMode.DOWN));
        }

        public Uri buildRequestUri(int i, int i4) {
            AbstractC1101a.m2359j(this.formats != null);
            AbstractC1101a.m2359j(this.chunkStartTimes != null);
            AbstractC1101a.m2359j(i4 < this.chunkStartTimes.size());
            String string = Integer.toString(this.formats[i].f1518j);
            String string2 = this.chunkStartTimes.get(i4).toString();
            return AbstractC1101a.m2345C(this.baseUri, this.chunkTemplate.replace(URL_PLACEHOLDER_BITRATE_1, string).replace(URL_PLACEHOLDER_BITRATE_2, string).replace(URL_PLACEHOLDER_START_TIME_1, string2).replace(URL_PLACEHOLDER_START_TIME_2, string2));
        }

        public StreamElement copy(C0249w[] c0249wArr) {
            return new StreamElement(this.baseUri, this.chunkTemplate, this.type, this.subType, this.timescale, this.name, this.maxWidth, this.maxHeight, this.displayWidth, this.displayHeight, this.language, c0249wArr, this.chunkStartTimes, this.chunkStartTimesUs, this.lastChunkDurationUs);
        }

        public long getChunkDurationUs(int i) {
            if (i == this.chunkCount - 1) {
                return this.lastChunkDurationUs;
            }
            long[] jArr = this.chunkStartTimesUs;
            return jArr[i + 1] - jArr[i];
        }

        public int getChunkIndex(long j) {
            return AbstractC1118i0.m2444e(this.chunkStartTimesUs, j, true);
        }

        public long getStartTimeUs(int i) {
            return this.chunkStartTimesUs[i];
        }

        private StreamElement(String str, String str2, int i, String str3, long j, String str4, int i4, int i8, int i9, int i10, String str5, C0249w[] c0249wArr, List<Long> list, long[] jArr, long j8) {
            this.baseUri = str;
            this.chunkTemplate = str2;
            this.type = i;
            this.subType = str3;
            this.timescale = j;
            this.name = str4;
            this.maxWidth = i4;
            this.maxHeight = i8;
            this.displayWidth = i9;
            this.displayHeight = i10;
            this.language = str5;
            this.formats = c0249wArr;
            this.chunkStartTimes = list;
            this.chunkStartTimesUs = jArr;
            this.lastChunkDurationUs = j8;
            this.chunkCount = list.size();
        }
    }
}
