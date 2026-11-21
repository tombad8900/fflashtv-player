package p106m1;

import android.media.MediaCodec;
import p002a1.C0016e;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m1.c */
/* loaded from: classes.dex */
public final class C1868c {

    /* renamed from: a */
    public byte[] f6968a;

    /* renamed from: b */
    public byte[] f6969b;

    /* renamed from: c */
    public int f6970c;

    /* renamed from: d */
    public int[] f6971d;

    /* renamed from: e */
    public int[] f6972e;

    /* renamed from: f */
    public int f6973f;

    /* renamed from: g */
    public int f6974g;

    /* renamed from: h */
    public int f6975h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f6976i;

    /* renamed from: j */
    public final C0016e f6977j;

    public C1868c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f6976i = cryptoInfo;
        this.f6977j = AbstractC1118i0.f4750a >= 24 ? new C0016e(cryptoInfo) : null;
    }
}
