package p152r4;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r4.f */
/* loaded from: classes.dex */
public final class C2315f {

    /* renamed from: d */
    public static Integer f8101d;

    /* renamed from: a */
    public final View f8102a;

    /* renamed from: b */
    public final ArrayList f8103b = new ArrayList();

    /* renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC2311b f8104c;

    public C2315f(ImageView imageView) {
        this.f8102a = imageView;
    }

    /* renamed from: a */
    public final int m4101a(int i, int i4, int i8) {
        int i9 = i4 - i8;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i - i8;
        if (i10 > 0) {
            return i10;
        }
        View view = this.f8102a;
        if (view.isLayoutRequested() || i4 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f8101d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC2470e.m4446c("Argument must not be null", windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f8101d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f8101d.intValue();
    }
}
