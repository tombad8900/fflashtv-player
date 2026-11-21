package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import p106m1.AbstractC1873h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class ImageOutputBuffer extends AbstractC1873h {
    public Bitmap bitmap;

    @Override // p106m1.AbstractC1873h, p106m1.AbstractC1866a
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}
