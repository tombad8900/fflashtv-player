package p017b6;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.h */
/* loaded from: classes.dex */
public final class C0605h extends AbstractC0607i {
    @Override // p211y5.C2823j
    /* renamed from: f */
    public final void mo1364f(Canvas canvas) {
        if (this.f2409P.f2406q.isEmpty()) {
            super.mo1364f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f2409P.f2406q);
        } else {
            canvas.clipRect(this.f2409P.f2406q, Region.Op.DIFFERENCE);
        }
        super.mo1364f(canvas);
        canvas.restore();
    }
}
