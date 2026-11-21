package p152r4;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r4.c */
/* loaded from: classes.dex */
public final class C2312c {

    /* renamed from: d */
    public static Integer f8097d;

    /* renamed from: a */
    public final View f8098a;

    /* renamed from: b */
    public final ArrayList f8099b = new ArrayList();

    /* renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC2311b f8100c;

    public C2312c(View view) {
        this.f8098a = view;
    }

    /* renamed from: a */
    public final int m4100a(int i, int i4, int i8) {
        int i9 = i4 - i8;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i - i8;
        if (i10 > 0) {
            return i10;
        }
        View view = this.f8098a;
        if (view.isLayoutRequested() || i4 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f8097d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC2470e.m4446c("Argument must not be null", windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f8097d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f8097d.intValue();
    }
}
