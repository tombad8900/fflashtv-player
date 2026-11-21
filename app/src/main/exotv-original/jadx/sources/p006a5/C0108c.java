package p006a5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.media.session.AbstractC0120b;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.exotv.net.R;
import p037e0.AbstractC0850a;
import p104m.AbstractC1707c2;
import p104m.C1770t;
import p104m.C1787y1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a5.c */
/* loaded from: classes.dex */
public final class C0108c {

    /* renamed from: a */
    public final Object f550a;

    /* renamed from: b */
    public final Object f551b;

    /* renamed from: c */
    public final Object f552c;

    /* renamed from: d */
    public final Object f553d;

    /* renamed from: e */
    public final Object f554e;

    /* renamed from: f */
    public final Object f555f;

    public C0108c(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.f550a = constraintLayout;
        this.f551b = frameLayout;
        this.f552c = textView;
        this.f555f = imageView;
        this.f553d = textView2;
        this.f554e = textView3;
    }

    /* renamed from: a */
    public static boolean m370a(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m371b(Context context, int i) {
        int iM3390c = AbstractC1707c2.m3390c(context, R.attr.colorControlHighlight);
        int iM3389b = AbstractC1707c2.m3389b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC1707c2.f6519b;
        int[] iArr2 = AbstractC1707c2.f6521d;
        int iM2017b = AbstractC0850a.m2017b(iM3390c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC1707c2.f6520c, AbstractC1707c2.f6523f}, new int[]{iM3389b, iM2017b, AbstractC0850a.m2017b(iM3390c, i), i});
    }

    /* renamed from: c */
    public static LayerDrawable m372c(C1787y1 c1787y1, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM3481d = c1787y1.m3481d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM3481d2 = c1787y1.m3481d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM3481d instanceof BitmapDrawable) && drawableM3481d.getIntrinsicWidth() == dimensionPixelSize && drawableM3481d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM3481d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM3481d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM3481d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM3481d2 instanceof BitmapDrawable) && drawableM3481d2.getIntrinsicWidth() == dimensionPixelSize && drawableM3481d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM3481d2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM3481d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM3481d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: e */
    public static void m373e(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1770t.f6747b;
        }
        drawableMutate.setColorFilter(C1770t.m3454c(i, mode));
    }

    /* renamed from: d */
    public ColorStateList m374d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0120b.m424t(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0120b.m424t(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m371b(context, AbstractC1707c2.m3390c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m371b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m371b(context, AbstractC1707c2.m3390c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0120b.m424t(context, R.color.abc_tint_spinner);
            }
            if (m370a((int[]) this.f551b, i)) {
                return AbstractC1707c2.m3391d(context, R.attr.colorControlNormal);
            }
            if (m370a((int[]) this.f554e, i)) {
                return AbstractC0120b.m424t(context, R.color.abc_tint_default);
            }
            if (m370a((int[]) this.f555f, i)) {
                return AbstractC0120b.m424t(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0120b.m424t(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM3391d = AbstractC1707c2.m3391d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM3391d == null || !colorStateListM3391d.isStateful()) {
            iArr[0] = AbstractC1707c2.f6519b;
            iArr2[0] = AbstractC1707c2.m3389b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1707c2.f6522e;
            iArr2[1] = AbstractC1707c2.m3390c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1707c2.f6523f;
            iArr2[2] = AbstractC1707c2.m3390c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1707c2.f6519b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM3391d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1707c2.f6522e;
            iArr2[1] = AbstractC1707c2.m3390c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1707c2.f6523f;
            iArr2[2] = colorStateListM3391d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public C0108c() {
        this.f550a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f551b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f552c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f553d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f554e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f555f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
