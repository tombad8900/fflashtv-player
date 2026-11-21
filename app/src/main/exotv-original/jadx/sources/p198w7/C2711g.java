package p198w7;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.ArrayList;
import okhttp3.C2181z;
import p189v7.C2558b0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.g */
/* loaded from: classes.dex */
public final class C2711g {

    /* renamed from: a */
    public final C2558b0 f9838a;

    /* renamed from: b */
    public final boolean f9839b;

    /* renamed from: c */
    public final String f9840c;

    /* renamed from: d */
    public final long f9841d;

    /* renamed from: e */
    public final long f9842e;

    /* renamed from: f */
    public final long f9843f;

    /* renamed from: g */
    public final int f9844g;

    /* renamed from: h */
    public final long f9845h;

    /* renamed from: i */
    public final int f9846i;

    /* renamed from: j */
    public final int f9847j;

    /* renamed from: k */
    public final Long f9848k;

    /* renamed from: l */
    public final Long f9849l;

    /* renamed from: m */
    public final Long f9850m;

    /* renamed from: n */
    public final Integer f9851n;

    /* renamed from: o */
    public final Integer f9852o;

    /* renamed from: p */
    public final Integer f9853p;

    /* renamed from: q */
    public final ArrayList f9854q;

    public C2711g(C2558b0 c2558b0, boolean z7, String str, long j, long j8, long j9, int i, long j10, int i4, int i8, Long l8, Long l9, Long l10, Integer num, Integer num2, Integer num3) {
        AbstractC2980h.m5136e("canonicalPath", c2558b0);
        AbstractC2980h.m5136e("comment", str);
        this.f9838a = c2558b0;
        this.f9839b = z7;
        this.f9840c = str;
        this.f9841d = j;
        this.f9842e = j8;
        this.f9843f = j9;
        this.f9844g = i;
        this.f9845h = j10;
        this.f9846i = i4;
        this.f9847j = i8;
        this.f9848k = l8;
        this.f9849l = l9;
        this.f9850m = l10;
        this.f9851n = num;
        this.f9852o = num2;
        this.f9853p = num3;
        this.f9854q = new ArrayList();
    }

    public /* synthetic */ C2711g(C2558b0 c2558b0, boolean z7, String str, long j, long j8, long j9, int i, long j10, int i4, int i8, Long l8, Long l9, Long l10, int i9) {
        this(c2558b0, z7, (i9 & 4) != 0 ? C2181z.FRAGMENT_ENCODE_SET : str, (i9 & 8) != 0 ? -1L : j, (i9 & 16) != 0 ? -1L : j8, (i9 & 32) != 0 ? -1L : j9, (i9 & 64) != 0 ? -1 : i, (i9 & 128) != 0 ? -1L : j10, (i9 & 256) != 0 ? -1 : i4, (i9 & 512) != 0 ? -1 : i8, (i9 & 1024) != 0 ? null : l8, (i9 & 2048) != 0 ? null : l9, (i9 & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED) != 0 ? null : l10, null, null, null);
    }
}
