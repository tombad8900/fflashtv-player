package p023c4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import p002a1.C0036o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c4.g */
/* loaded from: classes.dex */
public final class C0643g {

    /* renamed from: e */
    public static final int f2536e;

    /* renamed from: a */
    public final Context f2537a;

    /* renamed from: b */
    public final ActivityManager f2538b;

    /* renamed from: c */
    public final C0036o f2539c;

    /* renamed from: d */
    public final float f2540d;

    static {
        f2536e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C0643g(Context context) {
        this.f2540d = f2536e;
        this.f2537a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f2538b = activityManager;
        this.f2539c = new C0036o(12, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f2540d = 0.0f;
    }
}
