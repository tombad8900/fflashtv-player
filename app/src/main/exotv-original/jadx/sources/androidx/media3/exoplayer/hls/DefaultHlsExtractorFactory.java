package androidx.media3.exoplayer.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.bumptech.glide.AbstractC0715d;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.C2181z;
import p052f6.C0981l1;
import p057g2.C1041e;
import p063h1.C1108d0;
import p064h2.C1144i;
import p079j0.C1481i;
import p090k2.C1587e;
import p090k2.InterfaceC1597o;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p168t2.C2398a;
import p168t2.C2402c;
import p168t2.C2404d;
import p168t2.C2407e0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};
    private final boolean exposeCea608WhenMissingDeclarations;
    private boolean parseSubtitlesDuringExtraction;
    private final int payloadReaderFactoryFlags;
    private InterfaceC1597o subtitleParserFactory;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    private static void addFileTypeIfValidAndNotPresent(int i, List<Integer> list) {
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        if (AbstractC0715d.m1544M(iArr, i, 0, iArr.length) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    @SuppressLint({"SwitchIntDef"})
    private InterfaceC1987n createExtractorByFileType(int i, C0249w c0249w, List<C0249w> list, C1108d0 c1108d0) {
        if (i == 0) {
            return new C2398a();
        }
        if (i == 1) {
            return new C2402c();
        }
        if (i == 2) {
            return new C2404d(0);
        }
        if (i == 7) {
            return new C1041e(0L);
        }
        if (i == 8) {
            return createFragmentedMp4Extractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction, c1108d0, c0249w, list);
        }
        if (i == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, c0249w, list, c1108d0, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        }
        if (i != 13) {
            return null;
        }
        return new WebvttExtractor(c0249w.f1512d, c1108d0, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    private static C1144i createFragmentedMp4Extractor(InterfaceC1597o interfaceC1597o, boolean z7, C1108d0 c1108d0, C0249w c0249w, List<C0249w> list) {
        int i = isFmp4Variant(c0249w) ? 4 : 0;
        if (!z7) {
            i |= 32;
            interfaceC1597o = InterfaceC1597o.f6077g;
        }
        InterfaceC1597o interfaceC1597o2 = interfaceC1597o;
        int i4 = i;
        if (list == null) {
            list = C0981l1.f4211n;
        }
        return new C1144i(interfaceC1597o2, i4, c1108d0, null, list, null);
    }

    private static C2407e0 createTsExtractor(int i, boolean z7, C0249w c0249w, List<C0249w> list, C1108d0 c1108d0, InterfaceC1597o interfaceC1597o, boolean z8) {
        int i4;
        int i8 = i | 16;
        if (list != null) {
            i8 = i | 48;
        } else if (z7) {
            C0246v c0246v = new C0246v();
            c0246v.f1447m = AbstractC0244u0.m687p("application/cea-608");
            list = Collections.singletonList(new C0249w(c0246v));
        } else {
            list = Collections.EMPTY_LIST;
        }
        String str = c0249w.f1519k;
        if (!TextUtils.isEmpty(str)) {
            if (AbstractC0244u0.m674c(str, "audio/mp4a-latm") == null) {
                i8 |= 2;
            }
            if (AbstractC0244u0.m674c(str, "video/avc") == null) {
                i8 |= 4;
            }
        }
        if (z8) {
            i4 = 0;
        } else {
            interfaceC1597o = InterfaceC1597o.f6077g;
            i4 = 1;
        }
        return new C2407e0(2, i4, interfaceC1597o, c1108d0, new C1481i(i8, list));
    }

    private static boolean isFmp4Variant(C0249w c0249w) {
        C0241t0 c0241t0 = c0249w.f1520l;
        if (c0241t0 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
            if (i >= interfaceC0238s0Arr.length) {
                return false;
            }
            if (interfaceC0238s0Arr[i] instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).variantInfos.isEmpty();
            }
            i++;
        }
    }

    private static boolean sniffQuietly(InterfaceC1987n interfaceC1987n, InterfaceC1988o interfaceC1988o) {
        try {
            boolean zSniff = interfaceC1987n.sniff(interfaceC1988o);
            interfaceC1988o.mo3860g();
            return zSniff;
        } catch (EOFException unused) {
            interfaceC1988o.mo3860g();
            return false;
        } catch (Throwable th) {
            interfaceC1988o.mo3860g();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ HlsMediaChunkExtractor createExtractor(Uri uri, C0249w c0249w, List list, C1108d0 c1108d0, Map map, InterfaceC1988o interfaceC1988o, PlayerId playerId) {
        return createExtractor(uri, c0249w, (List<C0249w>) list, c1108d0, (Map<String, List<String>>) map, interfaceC1988o, playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public C0249w getOutputTextFormat(C0249w c0249w) {
        if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(c0249w)) {
            return c0249w;
        }
        C0246v c0246vM692a = c0249w.m692a();
        String str = c0249w.f1519k;
        c0246vM692a.f1447m = AbstractC0244u0.m687p("application/x-media3-cues");
        c0246vM692a.f1431H = this.subtitleParserFactory.mo3257c(c0249w);
        StringBuilder sb = new StringBuilder();
        sb.append(c0249w.f1522n);
        sb.append(str != null ? " ".concat(str) : C2181z.FRAGMENT_ENCODE_SET);
        c0246vM692a.f1444j = sb.toString();
        c0246vM692a.f1452r = Long.MAX_VALUE;
        return new C0249w(c0246vM692a);
    }

    public DefaultHlsExtractorFactory(int i, boolean z7) {
        this.payloadReaderFactoryFlags = i;
        this.exposeCea608WhenMissingDeclarations = z7;
        this.subtitleParserFactory = new C1587e();
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public BundledHlsMediaChunkExtractor createExtractor(Uri uri, C0249w c0249w, List<C0249w> list, C1108d0 c1108d0, Map<String, List<String>> map, InterfaceC1988o interfaceC1988o, PlayerId playerId) {
        C0249w c0249w2 = c0249w;
        int iM1545N = AbstractC0715d.m1545N(c0249w2.f1522n);
        List<String> list2 = map.get("Content-Type");
        InterfaceC1987n interfaceC1987n = null;
        int i = 0;
        int iM1545N2 = AbstractC0715d.m1545N((list2 == null || list2.isEmpty()) ? null : list2.get(0));
        int iM1546O = AbstractC0715d.m1546O(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(iM1545N, arrayList);
        addFileTypeIfValidAndNotPresent(iM1545N2, arrayList);
        addFileTypeIfValidAndNotPresent(iM1546O, arrayList);
        for (int i4 : iArr) {
            addFileTypeIfValidAndNotPresent(i4, arrayList);
        }
        interfaceC1988o.mo3860g();
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int i8 = iM1545N2;
            InterfaceC1987n interfaceC1987n2 = interfaceC1987n;
            InterfaceC1987n interfaceC1987nCreateExtractorByFileType = createExtractorByFileType(iIntValue, c0249w, list, c1108d0);
            interfaceC1987nCreateExtractorByFileType.getClass();
            if (sniffQuietly(interfaceC1987nCreateExtractorByFileType, interfaceC1988o)) {
                return new BundledHlsMediaChunkExtractor(interfaceC1987nCreateExtractorByFileType, c0249w2, c1108d0, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
            }
            interfaceC1987n = (interfaceC1987n2 == null && (iIntValue == iM1545N || iIntValue == i8 || iIntValue == iM1546O || iIntValue == 11)) ? interfaceC1987nCreateExtractorByFileType : interfaceC1987n2;
            i++;
            c0249w2 = c0249w;
            iM1545N2 = i8;
        }
        InterfaceC1987n interfaceC1987n3 = interfaceC1987n;
        interfaceC1987n3.getClass();
        return new BundledHlsMediaChunkExtractor(interfaceC1987n3, c0249w, c1108d0, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public DefaultHlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z7) {
        this.parseSubtitlesDuringExtraction = z7;
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public DefaultHlsExtractorFactory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
        this.subtitleParserFactory = interfaceC1597o;
        return this;
    }
}
