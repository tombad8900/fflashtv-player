package p058g4;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p066h4.C1179m;
import p066h4.C1181o;
import p066h4.C1187u;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.EnumC2797a;
import p210y3.EnumC2805i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g4.b */
/* loaded from: classes.dex */
public final class C1047b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final C1187u f4454a = C1187u.m2606a();

    /* renamed from: b */
    public final int f4455b;

    /* renamed from: c */
    public final int f4456c;

    /* renamed from: d */
    public final EnumC2797a f4457d;

    /* renamed from: e */
    public final C1179m f4458e;

    /* renamed from: f */
    public final boolean f4459f;

    /* renamed from: g */
    public final EnumC2805i f4460g;

    public C1047b(int i, int i4, C2804h c2804h) {
        this.f4455b = i;
        this.f4456c = i4;
        this.f4457d = (EnumC2797a) c2804h.m4908c(C1181o.f5037f);
        this.f4458e = (C1179m) c2804h.m4908c(C1179m.f5034g);
        C2803g c2803g = C1181o.f5040i;
        this.f4459f = c2804h.m4908c(c2803g) != null && ((Boolean) c2804h.m4908c(c2803g)).booleanValue();
        this.f4460g = (EnumC2805i) c2804h.m4908c(C1181o.f5038g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f4454a.m2608c(this.f4455b, this.f4456c, this.f4459f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f4457d == EnumC2797a.f10414k) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1046a());
        Size size = imageInfo.getSize();
        int width = this.f4455b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f4456c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM2599b = this.f4458e.m2599b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM2599b);
        int iRound2 = Math.round(size.getHeight() * fM2599b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM2599b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC2805i enumC2805i = this.f4460g;
        if (enumC2805i != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC2805i == EnumC2805i.f10425j && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
