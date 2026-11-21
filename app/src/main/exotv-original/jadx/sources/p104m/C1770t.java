package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import p006a5.C0108c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.t */
/* loaded from: classes.dex */
public final class C1770t {

    /* renamed from: b */
    public static final PorterDuff.Mode f6747b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1770t f6748c;

    /* renamed from: a */
    public C1787y1 f6749a;

    /* renamed from: a */
    public static synchronized C1770t m3453a() {
        try {
            if (f6748c == null) {
                m3455d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6748c;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m3454c(int i, PorterDuff.Mode mode) {
        return C1787y1.m3478e(i, mode);
    }

    /* renamed from: d */
    public static synchronized void m3455d() {
        if (f6748c == null) {
            C1770t c1770t = new C1770t();
            f6748c = c1770t;
            c1770t.f6749a = C1787y1.m3477b();
            C1787y1 c1787y1 = f6748c.f6749a;
            C0108c c0108c = new C0108c();
            synchronized (c1787y1) {
                c1787y1.f6817e = c0108c;
            }
        }
    }

    /* renamed from: e */
    public static void m3456e(Drawable drawable, C1711d2 c1711d2, int[] iArr) {
        PorterDuff.Mode mode = C1787y1.f6810f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z7 = c1711d2.f6529d;
        if (!z7 && !c1711d2.f6528c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM3478e = null;
        ColorStateList colorStateList = z7 ? c1711d2.f6526a : null;
        PorterDuff.Mode mode2 = c1711d2.f6528c ? c1711d2.f6527b : C1787y1.f6810f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM3478e = C1787y1.m3478e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM3478e);
    }

    /* renamed from: b */
    public final synchronized Drawable m3457b(Context context, int i) {
        return this.f6749a.m3481d(context, i);
    }
}
