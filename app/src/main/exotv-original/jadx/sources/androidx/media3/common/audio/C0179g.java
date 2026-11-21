package androidx.media3.common.audio;

import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.g */
/* loaded from: classes.dex */
public final class C0179g {

    /* renamed from: a */
    public final int f986a;

    /* renamed from: b */
    public final int f987b;

    /* renamed from: c */
    public final float[] f988c;

    public C0179g(int i, int i4, float[] fArr) {
        AbstractC1101a.m2352c("Input channel count must be positive.", i > 0);
        AbstractC1101a.m2352c("Output channel count must be positive.", i4 > 0);
        AbstractC1101a.m2352c("Coefficient array length is invalid.", fArr.length == i * i4);
        this.f986a = i;
        this.f987b = i4;
        for (int i8 = 0; i8 < fArr.length; i8++) {
            if (fArr[i8] < 0.0f) {
                throw new IllegalArgumentException(AbstractC0008a1.m14j("Coefficient at index ", i8, " is negative."));
            }
        }
        this.f988c = fArr;
        for (int i9 = 0; i9 < i; i9++) {
            for (int i10 = 0; i10 < i4; i10++) {
                float f8 = this.f988c[(this.f987b * i9) + i10];
                if (i9 == i10) {
                }
                int i11 = (f8 > 1.0f ? 1 : (f8 == 1.0f ? 0 : -1));
            }
        }
    }
}
