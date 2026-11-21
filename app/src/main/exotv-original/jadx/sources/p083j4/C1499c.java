package p083j4;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.ArrayList;
import p015b4.C0572f;
import p058g4.C1047b;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j4.c */
/* loaded from: classes.dex */
public final class C1499c {

    /* renamed from: a */
    public final ArrayList f5765a;

    /* renamed from: b */
    public final C0572f f5766b;

    public C1499c(ArrayList arrayList, C0572f c0572f) {
        this.f5765a = arrayList;
        this.f5766b = c0572f;
    }

    /* renamed from: a */
    public static C1497a m3177a(ImageDecoder.Source source, int i, int i4, C2804h c2804h) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C1047b(i, i4, c2804h));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C1497a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
