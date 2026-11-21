package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p006a5.C0108c;
import p040e3.C0878p;
import p130p.AbstractC2190i;
import p130p.C2189h;
import p130p.C2193l;
import p139q.AbstractC2239a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.y1 */
/* loaded from: classes.dex */
public final class C1787y1 {

    /* renamed from: g */
    public static C1787y1 f6811g;

    /* renamed from: a */
    public WeakHashMap f6813a;

    /* renamed from: b */
    public final WeakHashMap f6814b = new WeakHashMap(0);

    /* renamed from: c */
    public TypedValue f6815c;

    /* renamed from: d */
    public boolean f6816d;

    /* renamed from: e */
    public C0108c f6817e;

    /* renamed from: f */
    public static final PorterDuff.Mode f6810f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static final C1784x1 f6812h = new C1784x1(6);

    /* renamed from: b */
    public static synchronized C1787y1 m3477b() {
        try {
            if (f6811g == null) {
                f6811g = new C1787y1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6811g;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m3478e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1784x1 c1784x1 = f6812h;
        c1784x1.getClass();
        int i4 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1784x1.m3979g(Integer.valueOf(mode.hashCode() + i4));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final Drawable m3479a(Context context, int i) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f6815c == null) {
            this.f6815c = new TypedValue();
        }
        TypedValue typedValue = this.f6815c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C2189h c2189h = (C2189h) this.f6814b.get(context);
            drawableNewDrawable = null;
            if (c2189h != null && (weakReference = (WeakReference) c2189h.m3966b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM4012b = AbstractC2239a.m4012b(c2189h.f7642k, c2189h.f7644m, j);
                    if (iM4012b >= 0) {
                        Object[] objArr = c2189h.f7643l;
                        Object obj = objArr[iM4012b];
                        Object obj2 = AbstractC2190i.f7645a;
                        if (obj != obj2) {
                            objArr[iM4012b] = obj2;
                            c2189h.f7641j = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM372c = null;
        if (this.f6817e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM372c = new LayerDrawable(new Drawable[]{m3481d(context, R.drawable.abc_cab_background_internal_bg), m3481d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM372c = C0108c.m372c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM372c = C0108c.m372c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM372c = C0108c.m372c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM372c == null) {
            return layerDrawableM372c;
        }
        layerDrawableM372c.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM372c.getConstantState();
                if (constantState2 != null) {
                    C2189h c2189h2 = (C2189h) this.f6814b.get(context);
                    if (c2189h2 == null) {
                        c2189h2 = new C2189h();
                        this.f6814b.put(context, c2189h2);
                    }
                    c2189h2.m3968d(new WeakReference(constantState2), j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM372c;
    }

    /* renamed from: c */
    public final synchronized Drawable m3480c(int i, Context context, boolean z7) {
        Drawable drawableM3479a;
        try {
            if (!this.f6816d) {
                this.f6816d = true;
                Drawable drawableM3481d = m3481d(context, R.drawable.abc_vector_test);
                if (drawableM3481d == null || (!(drawableM3481d instanceof C0878p) && !"android.graphics.drawable.VectorDrawable".equals(drawableM3481d.getClass().getName()))) {
                    this.f6816d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM3479a = m3479a(context, i);
            if (drawableM3479a == null) {
                drawableM3479a = context.getDrawable(i);
            }
            if (drawableM3479a != null) {
                drawableM3479a = m3483g(context, i, z7, drawableM3479a);
            }
            if (drawableM3479a != null) {
                AbstractC1714e1.m3392a(drawableM3479a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM3479a;
    }

    /* renamed from: d */
    public final synchronized Drawable m3481d(Context context, int i) {
        return m3480c(i, context, false);
    }

    /* renamed from: f */
    public final synchronized ColorStateList m3482f(Context context, int i) {
        ColorStateList colorStateList;
        C2193l c2193l;
        WeakHashMap weakHashMap = this.f6813a;
        ColorStateList colorStateListM374d = null;
        colorStateList = (weakHashMap == null || (c2193l = (C2193l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2193l.m3998b(i);
        if (colorStateList == null) {
            C0108c c0108c = this.f6817e;
            if (c0108c != null) {
                colorStateListM374d = c0108c.m374d(context, i);
            }
            if (colorStateListM374d != null) {
                if (this.f6813a == null) {
                    this.f6813a = new WeakHashMap();
                }
                C2193l c2193l2 = (C2193l) this.f6813a.get(context);
                if (c2193l2 == null) {
                    c2193l2 = new C2193l();
                    this.f6813a.put(context, c2193l2);
                }
                c2193l2.m3997a(i, colorStateListM374d);
            }
            colorStateList = colorStateListM374d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m3483g(Context context, int i, boolean z7, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListM3482f = m3482f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM3482f != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM3482f);
            if (this.f6817e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        C0108c c0108c = this.f6817e;
        int i4 = R.attr.colorControlNormal;
        if (c0108c != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM3390c = AbstractC1707c2.m3390c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1770t.f6747b;
                C0108c.m373e(drawableFindDrawableByLayerId, iM3390c, mode2);
                C0108c.m373e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1707c2.m3390c(context, R.attr.colorControlNormal), mode2);
                C0108c.m373e(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1707c2.m3390c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM3389b = AbstractC1707c2.m3389b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1770t.f6747b;
                C0108c.m373e(drawableFindDrawableByLayerId2, iM3389b, mode3);
                C0108c.m373e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1707c2.m3390c(context, R.attr.colorControlActivated), mode3);
                C0108c.m373e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1707c2.m3390c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (c0108c != null) {
            PorterDuff.Mode mode4 = C1770t.f6747b;
            boolean z8 = true;
            if (C0108c.m370a((int[]) c0108c.f550a, i)) {
                iRound = -1;
                if (z8) {
                }
            } else {
                if (C0108c.m370a((int[]) c0108c.f552c, i)) {
                    i4 = R.attr.colorControlActivated;
                } else {
                    boolean zM370a = C0108c.m370a((int[]) c0108c.f553d, i);
                    i4 = android.R.attr.colorBackground;
                    if (zM370a) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i4 = android.R.attr.colorForeground;
                        if (z8) {
                            Drawable drawableMutate2 = drawable.mutate();
                            drawableMutate2.setColorFilter(C1770t.m3454c(AbstractC1707c2.m3390c(context, i4), mode4));
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                                return drawable;
                            }
                        } else if (z7) {
                            return null;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i4 = 0;
                        z8 = false;
                    }
                }
                iRound = -1;
                if (z8) {
                }
            }
        }
        return drawable;
    }
}
