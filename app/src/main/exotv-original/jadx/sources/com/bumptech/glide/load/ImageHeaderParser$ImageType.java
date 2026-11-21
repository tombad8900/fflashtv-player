package com.bumptech.glide.load;

import p210y3.AbstractC2799c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: j */
    public final boolean f2844j;

    ImageHeaderParser$ImageType(boolean z7) {
        this.f2844j = z7;
    }

    public boolean hasAlpha() {
        return this.f2844j;
    }

    public boolean isWebp() {
        int i = AbstractC2799c.f10417a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
