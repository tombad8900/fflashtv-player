package p092k5;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p037e0.AbstractC0850a;
import p216z2.AbstractC2879c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k5.b */
/* loaded from: classes.dex */
public final class C1603b extends AbstractC2879c0 {

    /* renamed from: a */
    public final Paint f6102a;

    /* renamed from: b */
    public final List f6103b;

    public C1603b() {
        Paint paint = new Paint();
        this.f6102a = paint;
        this.f6103b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p216z2.AbstractC2879c0
    /* renamed from: c */
    public final void mo3269c(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f6102a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f6103b.iterator();
        while (it.hasNext()) {
            ((AbstractC1605d) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0850a.f3767a;
            float f8 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f8)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f8)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f8)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f8))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m1828D0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3201q.mo2679f(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3201q.mo2675b(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f3201q.mo2676c(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3201q.mo2677d(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
