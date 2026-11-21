package androidx.media3.exoplayer.hls;

import android.text.TextUtils;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p005a4.C0073c;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1132w;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p159s2.AbstractC2348h;
import p159s2.AbstractC2349i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class WebvttExtractor implements InterfaceC1987n {
    private static final int HEADER_MAX_LENGTH = 9;
    private static final int HEADER_MIN_LENGTH = 6;
    private static final Pattern LOCAL_TIMESTAMP = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern MEDIA_TIMESTAMP = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String language;
    private InterfaceC1989p output;
    private final boolean parseSubtitlesDuringExtraction;
    private byte[] sampleData;
    private final C1132w sampleDataWrapper;
    private int sampleSize;
    private final InterfaceC1597o subtitleParserFactory;
    private final C1108d0 timestampAdjuster;

    @Deprecated
    public WebvttExtractor(String str, C1108d0 c1108d0) {
        this(str, c1108d0, InterfaceC1597o.f6077g, false);
    }

    @RequiresNonNull({"output"})
    private InterfaceC1980i0 buildTrackOutput(long j) {
        InterfaceC1980i0 interfaceC1980i0Track = this.output.track(0, 3);
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("text/vtt");
        c0246v.f1438d = this.language;
        c0246v.f1452r = j;
        interfaceC1980i0Track.format(new C0249w(c0246v));
        this.output.endTracks();
        return interfaceC1980i0Track;
    }

    @RequiresNonNull({"output"})
    private void processSample() throws NumberFormatException, C0247v0 {
        String strM2522h;
        C1132w c1132w = new C1132w(this.sampleData);
        AbstractC2349i.m4188d(c1132w);
        String strM2522h2 = c1132w.m2522h(StandardCharsets.UTF_8);
        long jM2437a0 = 0;
        long jM4187c = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strM2522h2)) {
                while (true) {
                    String strM2522h3 = c1132w.m2522h(StandardCharsets.UTF_8);
                    if (strM2522h3 == null) {
                        break;
                    }
                    if (AbstractC2349i.f8259a.matcher(strM2522h3).matches()) {
                        do {
                            strM2522h = c1132w.m2522h(StandardCharsets.UTF_8);
                            if (strM2522h != null) {
                            }
                        } while (!strM2522h.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC2348h.f8255a.matcher(strM2522h3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    buildTrackOutput(0L);
                    return;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jM4187c2 = AbstractC2349i.m4187c(strGroup);
                C1108d0 c1108d0 = this.timestampAdjuster;
                int i = AbstractC1118i0.f4750a;
                long jM2397b = c1108d0.m2397b(AbstractC1118i0.m2437a0((jM2437a0 + jM4187c2) - jM4187c, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                InterfaceC1980i0 interfaceC1980i0BuildTrackOutput = buildTrackOutput(jM2397b - jM4187c2);
                this.sampleDataWrapper.m2511E(this.sampleData, this.sampleSize);
                interfaceC1980i0BuildTrackOutput.sampleData(this.sampleDataWrapper, this.sampleSize);
                interfaceC1980i0BuildTrackOutput.sampleMetadata(jM2397b, 1, this.sampleSize, 0, null);
                return;
            }
            if (strM2522h2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = LOCAL_TIMESTAMP.matcher(strM2522h2);
                if (!matcher3.find()) {
                    throw C0247v0.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM2522h2), null);
                }
                Matcher matcher4 = MEDIA_TIMESTAMP.matcher(strM2522h2);
                if (!matcher4.find()) {
                    throw C0247v0.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM2522h2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jM4187c = AbstractC2349i.m4187c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j = Long.parseLong(strGroup3);
                int i4 = AbstractC1118i0.f4750a;
                jM2437a0 = AbstractC1118i0.m2437a0(j, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strM2522h2 = c1132w.m2522h(StandardCharsets.UTF_8);
        }
    }

    @Override // p115n1.InterfaceC1987n
    public List getSniffFailureDetails() {
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    @Override // p115n1.InterfaceC1987n
    @SideEffectFree
    public InterfaceC1987n getUnderlyingImplementation() {
        return this;
    }

    @Override // p115n1.InterfaceC1987n
    public void init(InterfaceC1989p interfaceC1989p) {
        if (this.parseSubtitlesDuringExtraction) {
            interfaceC1989p = new C0073c(interfaceC1989p, this.subtitleParserFactory);
        }
        this.output = interfaceC1989p;
        interfaceC1989p.seekMap(new C1992s(-9223372036854775807L));
    }

    @Override // p115n1.InterfaceC1987n
    public int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws NumberFormatException, C0247v0 {
        this.output.getClass();
        int length = (int) interfaceC1988o.getLength();
        int i = this.sampleSize;
        byte[] bArr = this.sampleData;
        if (i == bArr.length) {
            this.sampleData = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.sampleData;
        int i4 = this.sampleSize;
        int i8 = interfaceC1988o.read(bArr2, i4, bArr2.length - i4);
        if (i8 != -1) {
            int i9 = this.sampleSize + i8;
            this.sampleSize = i9;
            if (length == -1 || i9 != length) {
                return 0;
            }
        }
        processSample();
        return -1;
    }

    @Override // p115n1.InterfaceC1987n
    public void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public void seek(long j, long j8) {
        throw new IllegalStateException();
    }

    @Override // p115n1.InterfaceC1987n
    public boolean sniff(InterfaceC1988o interfaceC1988o) {
        interfaceC1988o.mo3855b(this.sampleData, 0, 6, false);
        this.sampleDataWrapper.m2511E(this.sampleData, 6);
        if (AbstractC2349i.m4185a(this.sampleDataWrapper)) {
            return true;
        }
        interfaceC1988o.mo3855b(this.sampleData, 6, 3, false);
        this.sampleDataWrapper.m2511E(this.sampleData, 9);
        return AbstractC2349i.m4185a(this.sampleDataWrapper);
    }

    public WebvttExtractor(String str, C1108d0 c1108d0, InterfaceC1597o interfaceC1597o, boolean z7) {
        this.language = str;
        this.timestampAdjuster = c1108d0;
        this.sampleDataWrapper = new C1132w();
        this.sampleData = new byte[1024];
        this.subtitleParserFactory = interfaceC1597o;
        this.parseSubtitlesDuringExtraction = z7;
    }
}
