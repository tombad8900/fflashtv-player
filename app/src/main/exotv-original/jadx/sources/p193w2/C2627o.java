package p193w2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.AbstractC0229p0;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0183b;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0251w1;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0256y0;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p017b6.ViewOnClickListenerC0591a;
import p024c5.C0692t;
import p029d0.AbstractC0795k;
import p041e4.C0908y;
import p052f6.AbstractC0965g0;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p092k5.ViewOnLayoutChangeListenerC1602a;
import p216z2.AbstractC2923x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.o */
/* loaded from: classes.dex */
public final class C2627o extends FrameLayout {

    /* renamed from: I0 */
    public static final float[] f9484I0;

    /* renamed from: A */
    public final TextView f9485A;

    /* renamed from: A0 */
    public int f9486A0;

    /* renamed from: B */
    public final TextView f9487B;

    /* renamed from: B0 */
    public int f9488B0;

    /* renamed from: C */
    public final ImageView f9489C;

    /* renamed from: C0 */
    public long[] f9490C0;

    /* renamed from: D */
    public final ImageView f9491D;

    /* renamed from: D0 */
    public boolean[] f9492D0;

    /* renamed from: E */
    public final ImageView f9493E;

    /* renamed from: E0 */
    public final long[] f9494E0;

    /* renamed from: F */
    public final ImageView f9495F;

    /* renamed from: F0 */
    public final boolean[] f9496F0;

    /* renamed from: G */
    public final ImageView f9497G;

    /* renamed from: G0 */
    public long f9498G0;

    /* renamed from: H */
    public final ImageView f9499H;

    /* renamed from: H0 */
    public boolean f9500H0;

    /* renamed from: I */
    public final View f9501I;

    /* renamed from: J */
    public final View f9502J;

    /* renamed from: K */
    public final View f9503K;

    /* renamed from: L */
    public final TextView f9504L;

    /* renamed from: M */
    public final TextView f9505M;

    /* renamed from: N */
    public final InterfaceC2614g0 f9506N;

    /* renamed from: O */
    public final StringBuilder f9507O;

    /* renamed from: P */
    public final Formatter f9508P;

    /* renamed from: Q */
    public final C0221m1 f9509Q;

    /* renamed from: R */
    public final C0227o1 f9510R;

    /* renamed from: S */
    public final RunnableC0127c0 f9511S;

    /* renamed from: T */
    public final Drawable f9512T;

    /* renamed from: U */
    public final Drawable f9513U;

    /* renamed from: V */
    public final Drawable f9514V;

    /* renamed from: W */
    public final Drawable f9515W;

    /* renamed from: a0 */
    public final Drawable f9516a0;

    /* renamed from: b0 */
    public final String f9517b0;

    /* renamed from: c0 */
    public final String f9518c0;

    /* renamed from: d0 */
    public final String f9519d0;

    /* renamed from: e0 */
    public final Drawable f9520e0;

    /* renamed from: f0 */
    public final Drawable f9521f0;

    /* renamed from: g0 */
    public final float f9522g0;

    /* renamed from: h0 */
    public final float f9523h0;

    /* renamed from: i0 */
    public final String f9524i0;

    /* renamed from: j */
    public final C2632t f9525j;

    /* renamed from: j0 */
    public final String f9526j0;

    /* renamed from: k */
    public final Resources f9527k;

    /* renamed from: k0 */
    public final Drawable f9528k0;

    /* renamed from: l */
    public final ViewOnClickListenerC2611f f9529l;

    /* renamed from: l0 */
    public final Drawable f9530l0;

    /* renamed from: m */
    public final CopyOnWriteArrayList f9531m;

    /* renamed from: m0 */
    public final String f9532m0;

    /* renamed from: n */
    public final RecyclerView f9533n;

    /* renamed from: n0 */
    public final String f9534n0;

    /* renamed from: o */
    public final C0692t f9535o;

    /* renamed from: o0 */
    public final Drawable f9536o0;

    /* renamed from: p */
    public final C2615h f9537p;

    /* renamed from: p0 */
    public final Drawable f9538p0;

    /* renamed from: q */
    public final C2609e f9539q;

    /* renamed from: q0 */
    public final String f9540q0;

    /* renamed from: r */
    public final C2609e f9541r;

    /* renamed from: r0 */
    public final String f9542r0;

    /* renamed from: s */
    public final C0908y f9543s;

    /* renamed from: s0 */
    public InterfaceC0193d1 f9544s0;

    /* renamed from: t */
    public final PopupWindow f9545t;

    /* renamed from: t0 */
    public boolean f9546t0;

    /* renamed from: u */
    public final int f9547u;

    /* renamed from: u0 */
    public boolean f9548u0;

    /* renamed from: v */
    public final ImageView f9549v;

    /* renamed from: v0 */
    public boolean f9550v0;

    /* renamed from: w */
    public final ImageView f9551w;

    /* renamed from: w0 */
    public boolean f9552w0;

    /* renamed from: x */
    public final ImageView f9553x;

    /* renamed from: x0 */
    public boolean f9554x0;

    /* renamed from: y */
    public final View f9555y;

    /* renamed from: y0 */
    public boolean f9556y0;

    /* renamed from: z */
    public final View f9557z;

    /* renamed from: z0 */
    public int f9558z0;

    static {
        AbstractC0229p0.m658a("media3.ui");
        f9484I0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C2627o(Context context, AttributeSet attributeSet) {
        int i;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        int i4;
        int i8;
        int i9;
        int i10;
        int resourceId6;
        int resourceId7;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        int i16;
        ImageView imageView;
        boolean z16;
        boolean z17;
        boolean z18;
        int i17;
        ImageView imageView2;
        ImageView imageView3;
        boolean z19;
        boolean z20;
        int i18;
        int i19;
        int i20;
        boolean z21;
        int i21;
        int i22;
        ViewOnClickListenerC2611f viewOnClickListenerC2611f;
        Typeface typefaceM1947a;
        super(context, null, 0);
        this.f9552w0 = true;
        this.f9558z0 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        this.f9488B0 = 0;
        this.f9486A0 = 200;
        int i23 = R.layout.exo_player_control_view;
        int resourceId8 = R.drawable.exo_styled_controls_next;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2602a0.f9352c, 0, 0);
            try {
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                resourceId8 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                resourceId7 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                resourceId5 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                resourceId6 = typedArrayObtainStyledAttributes.getResourceId(41, R.drawable.exo_styled_controls_vr);
                this.f9558z0 = typedArrayObtainStyledAttributes.getInt(32, this.f9558z0);
                this.f9488B0 = typedArrayObtainStyledAttributes.getInt(19, this.f9488B0);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                z10 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z11 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z12 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                z7 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f9486A0));
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i4 = resourceId10;
                i8 = resourceId12;
                i9 = resourceId11;
                i10 = resourceId13;
                z13 = z25;
                i = resourceId17;
                i11 = resourceId14;
                i12 = resourceId15;
                z9 = z22;
                i23 = resourceId9;
                z8 = z24;
                i13 = resourceId16;
                z14 = z23;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = R.drawable.exo_styled_controls_repeat_off;
            resourceId = R.drawable.exo_styled_controls_repeat_all;
            resourceId2 = R.drawable.exo_styled_controls_shuffle_on;
            resourceId3 = R.drawable.exo_styled_controls_shuffle_off;
            resourceId4 = R.drawable.exo_styled_controls_subtitle_on;
            resourceId5 = R.drawable.exo_styled_controls_subtitle_off;
            i4 = R.drawable.exo_styled_controls_play;
            i8 = R.drawable.exo_styled_controls_simple_fastforward;
            i9 = R.drawable.exo_styled_controls_pause;
            i10 = R.drawable.exo_styled_controls_previous;
            resourceId6 = R.drawable.exo_styled_controls_vr;
            resourceId7 = R.drawable.exo_styled_controls_repeat_one;
            i11 = R.drawable.exo_styled_controls_simple_rewind;
            i12 = R.drawable.exo_styled_controls_fullscreen_exit;
            z7 = false;
            z8 = false;
            z9 = true;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = R.drawable.exo_styled_controls_fullscreen_enter;
            z14 = false;
        }
        LayoutInflater.from(context).inflate(i23, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC2611f viewOnClickListenerC2611f2 = new ViewOnClickListenerC2611f(this);
        this.f9529l = viewOnClickListenerC2611f2;
        this.f9531m = new CopyOnWriteArrayList();
        this.f9509Q = new C0221m1();
        this.f9510R = new C0227o1();
        StringBuilder sb = new StringBuilder();
        this.f9507O = sb;
        int i24 = i;
        int i25 = i8;
        this.f9508P = new Formatter(sb, Locale.getDefault());
        this.f9490C0 = new long[0];
        this.f9492D0 = new boolean[0];
        this.f9494E0 = new long[0];
        this.f9496F0 = new boolean[0];
        this.f9511S = new RunnableC0127c0(20, this);
        this.f9504L = (TextView) findViewById(R.id.exo_duration);
        this.f9505M = (TextView) findViewById(R.id.exo_position);
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f9495F = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC2611f2);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f9497G = imageView5;
        ViewOnClickListenerC0591a viewOnClickListenerC0591a = new ViewOnClickListenerC0591a(5, this);
        if (imageView5 != null) {
            imageView5.setVisibility(8);
            imageView5.setOnClickListener(viewOnClickListenerC0591a);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f9499H = imageView6;
        ViewOnClickListenerC0591a viewOnClickListenerC0591a2 = new ViewOnClickListenerC0591a(5, this);
        if (imageView6 != null) {
            imageView6.setVisibility(8);
            imageView6.setOnClickListener(viewOnClickListenerC0591a2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f9501I = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC2611f2);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f9502J = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2611f2);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f9503K = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2611f2);
        }
        InterfaceC2614g0 interfaceC2614g0 = (InterfaceC2614g0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC2614g0 != null) {
            this.f9506N = interfaceC2614g0;
        } else if (viewFindViewById4 != null) {
            C2607d c2607d = new C2607d(context, attributeSet);
            c2607d.setId(R.id.exo_progress);
            c2607d.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c2607d, iIndexOfChild);
            this.f9506N = c2607d;
        } else {
            this.f9506N = null;
        }
        InterfaceC2614g0 interfaceC2614g02 = this.f9506N;
        if (interfaceC2614g02 != null) {
            ((C2607d) interfaceC2614g02).f9380G.add(viewOnClickListenerC2611f2);
        }
        Resources resources = context.getResources();
        this.f9527k = resources;
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f9553x = imageView7;
        if (imageView7 != null) {
            imageView7.setOnClickListener(viewOnClickListenerC2611f2);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_prev);
        this.f9549v = imageView8;
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
            imageView8.setOnClickListener(viewOnClickListenerC2611f2);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_next);
        this.f9551w = imageView9;
        if (imageView9 != null) {
            imageView9.setImageDrawable(resources.getDrawable(resourceId8, context.getTheme()));
            imageView9.setOnClickListener(viewOnClickListenerC2611f2);
        }
        ThreadLocal threadLocal = AbstractC0795k.f3568a;
        if (context.isRestricted()) {
            imageView3 = imageView8;
            imageView2 = imageView9;
            z15 = z8;
            i14 = resourceId;
            i15 = resourceId2;
            i16 = resourceId3;
            imageView = imageView4;
            z16 = z10;
            z17 = z11;
            z18 = z12;
            i17 = i25;
            z19 = z7;
            z20 = z9;
            i18 = resourceId7;
            i19 = resourceId4;
            i20 = resourceId5;
            z21 = z14;
            i21 = i13;
            i22 = resourceId6;
            viewOnClickListenerC2611f = viewOnClickListenerC2611f2;
            typefaceM1947a = null;
        } else {
            z15 = z8;
            i14 = resourceId;
            i15 = resourceId2;
            i16 = resourceId3;
            imageView = imageView4;
            z16 = z10;
            z17 = z11;
            z18 = z12;
            i17 = i25;
            imageView2 = imageView9;
            imageView3 = imageView8;
            z19 = z7;
            z20 = z9;
            i18 = resourceId7;
            i19 = resourceId4;
            i20 = resourceId5;
            z21 = z14;
            i21 = i13;
            i22 = resourceId6;
            viewOnClickListenerC2611f = viewOnClickListenerC2611f2;
            typefaceM1947a = AbstractC0795k.m1947a(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView10 != null) {
            imageView10.setImageDrawable(resources.getDrawable(i11, context.getTheme()));
            this.f9557z = imageView10;
            this.f9487B = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM1947a);
            this.f9487B = textView;
            this.f9557z = textView;
        } else {
            this.f9487B = null;
            this.f9557z = null;
        }
        View view = this.f9557z;
        if (view != null) {
            view.setOnClickListener(viewOnClickListenerC2611f);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i17, context.getTheme()));
            this.f9555y = imageView11;
            this.f9485A = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM1947a);
            this.f9485A = textView2;
            this.f9555y = textView2;
        } else {
            this.f9485A = null;
            this.f9555y = null;
        }
        View view2 = this.f9555y;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC2611f);
        }
        ImageView imageView12 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f9489C = imageView12;
        if (imageView12 != null) {
            imageView12.setOnClickListener(viewOnClickListenerC2611f);
        }
        ImageView imageView13 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f9491D = imageView13;
        if (imageView13 != null) {
            imageView13.setOnClickListener(viewOnClickListenerC2611f);
        }
        this.f9522g0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f9523h0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView14 = (ImageView) findViewById(R.id.exo_vr);
        this.f9493E = imageView14;
        if (imageView14 != null) {
            imageView14.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
            m4710j(imageView14, false);
        }
        C2632t c2632t = new C2632t(this);
        this.f9525j = c2632t;
        c2632t.f9570C = z13;
        C0692t c0692t = new C0692t(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f9535o = c0692t;
        this.f9547u = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f9533n = recyclerView;
        recyclerView.setAdapter(c0692t);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f9545t = popupWindow;
        if (AbstractC1118i0.f4750a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC2611f);
        this.f9500H0 = true;
        this.f9543s = new C0908y(getResources());
        this.f9528k0 = resources.getDrawable(i19, context.getTheme());
        this.f9530l0 = resources.getDrawable(i20, context.getTheme());
        this.f9532m0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f9534n0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f9539q = new C2609e(this, 1);
        this.f9541r = new C2609e(this, 0);
        this.f9537p = new C2615h(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f9484I0);
        this.f9512T = resources.getDrawable(i4, context.getTheme());
        this.f9513U = resources.getDrawable(i9, context.getTheme());
        this.f9536o0 = resources.getDrawable(i12, context.getTheme());
        this.f9538p0 = resources.getDrawable(i21, context.getTheme());
        this.f9514V = resources.getDrawable(i24, context.getTheme());
        this.f9515W = resources.getDrawable(i18, context.getTheme());
        this.f9516a0 = resources.getDrawable(i14, context.getTheme());
        this.f9520e0 = resources.getDrawable(i15, context.getTheme());
        this.f9521f0 = resources.getDrawable(i16, context.getTheme());
        this.f9540q0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f9542r0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f9517b0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f9518c0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f9519d0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f9524i0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f9526j0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        c2632t.m4729h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        c2632t.m4729h(this.f9555y, z16);
        c2632t.m4729h(this.f9557z, z20);
        c2632t.m4729h(imageView3, z17);
        c2632t.m4729h(imageView2, z18);
        c2632t.m4729h(imageView13, z19);
        c2632t.m4729h(imageView, z21);
        c2632t.m4729h(imageView14, z15);
        c2632t.m4729h(imageView12, this.f9488B0 != 0);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1602a(1, this));
    }

    /* renamed from: b */
    public static boolean m4702b(InterfaceC0193d1 interfaceC0193d1, C0227o1 c0227o1) {
        AbstractC0230p1 currentTimeline;
        int windowCount;
        if (!interfaceC0193d1.isCommandAvailable(17) || (windowCount = (currentTimeline = interfaceC0193d1.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i = 0; i < windowCount; i++) {
            if (currentTimeline.getWindow(i, c0227o1).f1272m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f8) {
        InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
        if (interfaceC0193d1 == null || !interfaceC0193d1.isCommandAvailable(13)) {
            return;
        }
        InterfaceC0193d1 interfaceC0193d12 = this.f9544s0;
        interfaceC0193d12.setPlaybackParameters(new C0256y0(f8, interfaceC0193d12.getPlaybackParameters().f1550b));
    }

    /* renamed from: c */
    public final boolean m4703c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
        if (interfaceC0193d1 == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC0193d1.getPlaybackState() != 4 && interfaceC0193d1.isCommandAvailable(12)) {
                    interfaceC0193d1.seekForward();
                }
            } else if (keyCode == 89 && interfaceC0193d1.isCommandAvailable(11)) {
                interfaceC0193d1.seekBack();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (AbstractC1118i0.m2441c0(interfaceC0193d1, this.f9552w0)) {
                        AbstractC1118i0.m2419J(interfaceC0193d1);
                    } else if (interfaceC0193d1.isCommandAvailable(1)) {
                        interfaceC0193d1.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            AbstractC1118i0.m2419J(interfaceC0193d1);
                        } else if (keyCode == 127) {
                            int i = AbstractC1118i0.f4750a;
                            if (interfaceC0193d1.isCommandAvailable(1)) {
                                interfaceC0193d1.pause();
                            }
                        }
                    } else if (interfaceC0193d1.isCommandAvailable(7)) {
                        interfaceC0193d1.seekToPrevious();
                    }
                } else if (interfaceC0193d1.isCommandAvailable(9)) {
                    interfaceC0193d1.seekToNext();
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m4704d(AbstractC2923x abstractC2923x, View view) {
        this.f9533n.setAdapter(abstractC2923x);
        m4717q();
        this.f9500H0 = false;
        PopupWindow popupWindow = this.f9545t;
        popupWindow.dismiss();
        this.f9500H0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f9547u;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m4703c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public final C0981l1 m4705e(C0254x1 c0254x1, int i) {
        AbstractC1006u.m2188c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        AbstractC0983m0 abstractC0983m0 = c0254x1.f1547a;
        int i4 = 0;
        for (int i8 = 0; i8 < abstractC0983m0.size(); i8++) {
            C0251w1 c0251w1 = (C0251w1) abstractC0983m0.get(i8);
            if (c0251w1.f1538b.f1321c == i) {
                for (int i9 = 0; i9 < c0251w1.f1537a; i9++) {
                    if (c0251w1.m697b(i9)) {
                        C0249w c0249wM696a = c0251w1.m696a(i9);
                        if ((c0249wM696a.f1513e & 2) == 0) {
                            C2623l c2623l = new C2623l(c0254x1, i8, i9, this.f9543s.m2075c(c0249wM696a));
                            int i10 = i4 + 1;
                            int iM2140e = AbstractC0965g0.m2140e(objArrCopyOf.length, i10);
                            if (iM2140e > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM2140e);
                            }
                            objArrCopyOf[i4] = c2623l;
                            i4 = i10;
                        }
                    }
                }
            }
        }
        return AbstractC0983m0.m2163h(i4, objArrCopyOf);
    }

    /* renamed from: f */
    public final void m4706f() {
        C2632t c2632t = this.f9525j;
        int i = c2632t.f9596z;
        if (i == 3 || i == 2) {
            return;
        }
        c2632t.m4727f();
        if (!c2632t.f9570C) {
            c2632t.m4730i(2);
        } else if (c2632t.f9596z == 1) {
            c2632t.f9583m.start();
        } else {
            c2632t.f9584n.start();
        }
    }

    /* renamed from: g */
    public final boolean m4707g() {
        C2632t c2632t = this.f9525j;
        return c2632t.f9596z == 0 && c2632t.f9571a.m4708h();
    }

    public InterfaceC0193d1 getPlayer() {
        return this.f9544s0;
    }

    public int getRepeatToggleModes() {
        return this.f9488B0;
    }

    public boolean getShowShuffleButton() {
        return this.f9525j.m4725b(this.f9491D);
    }

    public boolean getShowSubtitleButton() {
        return this.f9525j.m4725b(this.f9495F);
    }

    public int getShowTimeoutMs() {
        return this.f9558z0;
    }

    public boolean getShowVrButton() {
        return this.f9525j.m4725b(this.f9493E);
    }

    /* renamed from: h */
    public final boolean m4708h() {
        return getVisibility() == 0;
    }

    /* renamed from: i */
    public final void m4709i() {
        m4713m();
        m4712l();
        m4716p();
        m4718r();
        m4720t();
        m4714n();
        m4719s();
    }

    /* renamed from: j */
    public final void m4710j(View view, boolean z7) {
        if (view == null) {
            return;
        }
        view.setEnabled(z7);
        view.setAlpha(z7 ? this.f9522g0 : this.f9523h0);
    }

    /* renamed from: k */
    public final void m4711k(boolean z7) {
        if (this.f9546t0 == z7) {
            return;
        }
        this.f9546t0 = z7;
        String str = this.f9542r0;
        Drawable drawable = this.f9538p0;
        String str2 = this.f9540q0;
        Drawable drawable2 = this.f9536o0;
        ImageView imageView = this.f9497G;
        if (imageView != null) {
            if (z7) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f9499H;
        if (imageView2 == null) {
            return;
        }
        if (z7) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    /* renamed from: l */
    public final void m4712l() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (m4708h() && this.f9548u0) {
            InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
            if (interfaceC0193d1 != null) {
                zIsCommandAvailable = (this.f9550v0 && m4702b(interfaceC0193d1, this.f9510R)) ? interfaceC0193d1.isCommandAvailable(10) : interfaceC0193d1.isCommandAvailable(5);
                zIsCommandAvailable3 = interfaceC0193d1.isCommandAvailable(7);
                zIsCommandAvailable4 = interfaceC0193d1.isCommandAvailable(11);
                zIsCommandAvailable5 = interfaceC0193d1.isCommandAvailable(12);
                zIsCommandAvailable2 = interfaceC0193d1.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            Resources resources = this.f9527k;
            View view = this.f9557z;
            if (zIsCommandAvailable4) {
                InterfaceC0193d1 interfaceC0193d12 = this.f9544s0;
                int seekBackIncrement = (int) ((interfaceC0193d12 != null ? interfaceC0193d12.getSeekBackIncrement() : DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) / 1000);
                TextView textView = this.f9487B;
                if (textView != null) {
                    textView.setText(String.valueOf(seekBackIncrement));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
                }
            }
            View view2 = this.f9555y;
            if (zIsCommandAvailable5) {
                InterfaceC0193d1 interfaceC0193d13 = this.f9544s0;
                int seekForwardIncrement = (int) ((interfaceC0193d13 != null ? interfaceC0193d13.getSeekForwardIncrement() : 15000L) / 1000);
                TextView textView2 = this.f9485A;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(seekForwardIncrement));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
                }
            }
            m4710j(this.f9549v, zIsCommandAvailable3);
            m4710j(view, zIsCommandAvailable4);
            m4710j(view2, zIsCommandAvailable5);
            m4710j(this.f9551w, zIsCommandAvailable2);
            InterfaceC2614g0 interfaceC2614g0 = this.f9506N;
            if (interfaceC2614g0 != null) {
                ((C2607d) interfaceC2614g0).setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4713m() {
        ImageView imageView;
        boolean z7;
        if (m4708h() && this.f9548u0 && (imageView = this.f9553x) != null) {
            boolean zM2441c0 = AbstractC1118i0.m2441c0(this.f9544s0, this.f9552w0);
            Drawable drawable = zM2441c0 ? this.f9512T : this.f9513U;
            int i = zM2441c0 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f9527k.getString(i));
            InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
            if (interfaceC0193d1 != null) {
                z7 = true;
                if (!interfaceC0193d1.isCommandAvailable(1) || (this.f9544s0.isCommandAvailable(17) && this.f9544s0.getCurrentTimeline().isEmpty())) {
                    z7 = false;
                }
            }
            m4710j(imageView, z7);
        }
    }

    /* renamed from: n */
    public final void m4714n() {
        C2615h c2615h;
        InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
        if (interfaceC0193d1 == null) {
            return;
        }
        float f8 = interfaceC0193d1.getPlaybackParameters().f1549a;
        float f9 = Float.MAX_VALUE;
        int i = 0;
        int i4 = 0;
        while (true) {
            c2615h = this.f9537p;
            float[] fArr = c2615h.f9458e;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f8 - fArr[i]);
            if (fAbs < f9) {
                i4 = i;
                f9 = fAbs;
            }
            i++;
        }
        c2615h.f9459f = i4;
        String str = c2615h.f9457d[i4];
        C0692t c0692t = this.f9535o;
        ((String[]) c0692t.f2702f)[0] = str;
        m4710j(this.f9501I, c0692t.m1469h(1) || c0692t.m1469h(0));
    }

    /* renamed from: o */
    public final void m4715o() {
        long contentPosition;
        long contentBufferedPosition;
        if (m4708h() && this.f9548u0) {
            InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
            if (interfaceC0193d1 == null || !interfaceC0193d1.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = interfaceC0193d1.getContentPosition() + this.f9498G0;
                contentBufferedPosition = interfaceC0193d1.getContentBufferedPosition() + this.f9498G0;
            }
            TextView textView = this.f9505M;
            if (textView != null && !this.f9556y0) {
                textView.setText(AbstractC1118i0.m2416G(this.f9507O, this.f9508P, contentPosition));
            }
            InterfaceC2614g0 interfaceC2614g0 = this.f9506N;
            if (interfaceC2614g0 != null) {
                C2607d c2607d = (C2607d) interfaceC2614g0;
                c2607d.setPosition(contentPosition);
                c2607d.setBufferedPosition(contentBufferedPosition);
            }
            RunnableC0127c0 runnableC0127c0 = this.f9511S;
            removeCallbacks(runnableC0127c0);
            int playbackState = interfaceC0193d1 == null ? 1 : interfaceC0193d1.getPlaybackState();
            if (interfaceC0193d1 != null && interfaceC0193d1.isPlaying()) {
                long jMin = Math.min(interfaceC2614g0 != null ? ((C2607d) interfaceC2614g0).getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f8 = interfaceC0193d1.getPlaybackParameters().f1549a;
                postDelayed(runnableC0127c0, AbstractC1118i0.m2452k(f8 > 0.0f ? (long) (jMin / f8) : 1000L, this.f9486A0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(runnableC0127c0, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2632t c2632t = this.f9525j;
        c2632t.f9571a.addOnLayoutChangeListener(c2632t.f9594x);
        this.f9548u0 = true;
        if (m4707g()) {
            c2632t.m4728g();
        }
        m4709i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2632t c2632t = this.f9525j;
        c2632t.f9571a.removeOnLayoutChangeListener(c2632t.f9594x);
        this.f9548u0 = false;
        removeCallbacks(this.f9511S);
        c2632t.m4727f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        View view = this.f9525j.f9572b;
        if (view != null) {
            view.layout(0, 0, i8 - i, i9 - i4);
        }
    }

    /* renamed from: p */
    public final void m4716p() {
        ImageView imageView;
        if (m4708h() && this.f9548u0 && (imageView = this.f9489C) != null) {
            if (this.f9488B0 == 0) {
                m4710j(imageView, false);
                return;
            }
            InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
            String str = this.f9517b0;
            Drawable drawable = this.f9514V;
            if (interfaceC0193d1 == null || !interfaceC0193d1.isCommandAvailable(15)) {
                m4710j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m4710j(imageView, true);
            int repeatMode = interfaceC0193d1.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.f9515W);
                imageView.setContentDescription(this.f9518c0);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f9516a0);
                imageView.setContentDescription(this.f9519d0);
            }
        }
    }

    /* renamed from: q */
    public final void m4717q() {
        RecyclerView recyclerView = this.f9533n;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f9547u;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f9545t;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    /* renamed from: r */
    public final void m4718r() {
        ImageView imageView;
        if (m4708h() && this.f9548u0 && (imageView = this.f9491D) != null) {
            InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
            if (!this.f9525j.m4725b(imageView)) {
                m4710j(imageView, false);
                return;
            }
            String str = this.f9526j0;
            Drawable drawable = this.f9521f0;
            if (interfaceC0193d1 == null || !interfaceC0193d1.isCommandAvailable(14)) {
                m4710j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m4710j(imageView, true);
            if (interfaceC0193d1.getShuffleModeEnabled()) {
                drawable = this.f9520e0;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC0193d1.getShuffleModeEnabled()) {
                str = this.f9524i0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4719s() {
        boolean z7;
        long jM2428S;
        int i;
        long j;
        int i4;
        AbstractC0230p1 abstractC0230p1;
        boolean z8;
        boolean z9;
        InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
        if (interfaceC0193d1 == null) {
            return;
        }
        boolean z10 = this.f9550v0;
        C0227o1 c0227o1 = this.f9510R;
        boolean z11 = true;
        this.f9554x0 = z10 && m4702b(interfaceC0193d1, c0227o1);
        long j8 = 0;
        this.f9498G0 = 0L;
        AbstractC0230p1 currentTimeline = interfaceC0193d1.isCommandAvailable(17) ? interfaceC0193d1.getCurrentTimeline() : AbstractC0230p1.EMPTY;
        long j9 = -9223372036854775807L;
        if (currentTimeline.isEmpty()) {
            z7 = true;
            if (interfaceC0193d1.isCommandAvailable(16)) {
                long contentDuration = interfaceC0193d1.getContentDuration();
                jM2428S = contentDuration != -9223372036854775807L ? AbstractC1118i0.m2428S(contentDuration) : 0L;
                i = 0;
            }
        } else {
            int currentMediaItemIndex = interfaceC0193d1.getCurrentMediaItemIndex();
            boolean z12 = this.f9554x0;
            int i8 = z12 ? 0 : currentMediaItemIndex;
            int windowCount = z12 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j10 = 0;
            i = 0;
            while (true) {
                if (i8 > windowCount) {
                    break;
                }
                long j11 = j8;
                if (i8 == currentMediaItemIndex) {
                    this.f9498G0 = AbstractC1118i0.m2447f0(j10);
                }
                currentTimeline.getWindow(i8, c0227o1);
                if (c0227o1.f1272m == j9) {
                    AbstractC1101a.m2359j(this.f9554x0 ^ z11);
                    break;
                }
                int i9 = c0227o1.f1273n;
                while (i9 <= c0227o1.f1274o) {
                    C0221m1 c0221m1 = this.f9509Q;
                    currentTimeline.getPeriod(i9, c0221m1);
                    long j12 = j9;
                    C0187c c0187c = c0221m1.f1210g;
                    int i10 = c0187c.f1054e;
                    int i11 = c0187c.f1051b;
                    while (i10 < i11) {
                        long jM639d = c0221m1.m639d(i10);
                        if (jM639d == Long.MIN_VALUE) {
                            long j13 = c0221m1.f1207d;
                            if (j13 != j12) {
                                jM639d = j13;
                                j = jM639d + c0221m1.f1208e;
                                if (j < j11) {
                                    long[] jArr = this.f9490C0;
                                    if (i == jArr.length) {
                                        int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                        this.f9490C0 = Arrays.copyOf(jArr, length);
                                        this.f9492D0 = Arrays.copyOf(this.f9492D0, length);
                                    }
                                    this.f9490C0[i] = AbstractC1118i0.m2447f0(j10 + j);
                                    boolean[] zArr = this.f9492D0;
                                    C0183b c0183bM609a = c0221m1.f1210g.m609a(i10);
                                    int i12 = c0183bM609a.f1022b;
                                    i4 = currentMediaItemIndex;
                                    if (i12 == -1) {
                                        abstractC0230p1 = currentTimeline;
                                        z8 = true;
                                        z9 = true;
                                    } else {
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            int i14 = i13;
                                            int i15 = c0183bM609a.f1026f[i14];
                                            abstractC0230p1 = currentTimeline;
                                            z8 = true;
                                            if (i15 == 0 || i15 == 1) {
                                                z9 = true;
                                                break;
                                            } else {
                                                i13 = i14 + 1;
                                                currentTimeline = abstractC0230p1;
                                            }
                                        }
                                        abstractC0230p1 = currentTimeline;
                                        z8 = true;
                                        z9 = false;
                                    }
                                    zArr[i] = !z9;
                                    i++;
                                }
                            }
                            i4 = currentMediaItemIndex;
                            abstractC0230p1 = currentTimeline;
                            z8 = true;
                        } else {
                            j = jM639d + c0221m1.f1208e;
                            if (j < j11) {
                                i4 = currentMediaItemIndex;
                                abstractC0230p1 = currentTimeline;
                                z8 = true;
                            }
                        }
                        i10++;
                        z11 = z8;
                        currentMediaItemIndex = i4;
                        currentTimeline = abstractC0230p1;
                        j11 = 0;
                    }
                    i9++;
                    j9 = j12;
                    currentTimeline = currentTimeline;
                    j11 = 0;
                }
                j10 += c0227o1.f1272m;
                i8++;
                z11 = z11;
                currentTimeline = currentTimeline;
                j8 = 0;
            }
            z7 = z11;
            jM2428S = j10;
        }
        long jM2447f0 = AbstractC1118i0.m2447f0(jM2428S);
        TextView textView = this.f9504L;
        if (textView != null) {
            textView.setText(AbstractC1118i0.m2416G(this.f9507O, this.f9508P, jM2447f0));
        }
        InterfaceC2614g0 interfaceC2614g0 = this.f9506N;
        if (interfaceC2614g0 != null) {
            C2607d c2607d = (C2607d) interfaceC2614g0;
            c2607d.setDuration(jM2447f0);
            long[] jArr2 = this.f9494E0;
            int length2 = jArr2.length;
            int i16 = i + length2;
            long[] jArr3 = this.f9490C0;
            if (i16 > jArr3.length) {
                this.f9490C0 = Arrays.copyOf(jArr3, i16);
                this.f9492D0 = Arrays.copyOf(this.f9492D0, i16);
            }
            System.arraycopy(jArr2, 0, this.f9490C0, i, length2);
            System.arraycopy(this.f9496F0, 0, this.f9492D0, i, length2);
            long[] jArr4 = this.f9490C0;
            boolean[] zArr2 = this.f9492D0;
            if (i16 != 0 && (jArr4 == null || zArr2 == null)) {
                z7 = false;
            }
            AbstractC1101a.m2353d(z7);
            c2607d.f9395V = i16;
            c2607d.f9396W = jArr4;
            c2607d.f9397a0 = zArr2;
            c2607d.m4690e();
        }
        m4715o();
    }

    public void setAnimationEnabled(boolean z7) {
        this.f9525j.f9570C = z7;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC2613g interfaceC2613g) {
        boolean z7 = interfaceC2613g != null;
        ImageView imageView = this.f9497G;
        if (imageView != null) {
            if (z7) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z8 = interfaceC2613g != null;
        ImageView imageView2 = this.f9499H;
        if (imageView2 == null) {
            return;
        }
        if (z8) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(InterfaceC0193d1 interfaceC0193d1) {
        AbstractC1101a.m2359j(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1101a.m2353d(interfaceC0193d1 == null || interfaceC0193d1.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC0193d1 interfaceC0193d12 = this.f9544s0;
        if (interfaceC0193d12 == interfaceC0193d1) {
            return;
        }
        ViewOnClickListenerC2611f viewOnClickListenerC2611f = this.f9529l;
        if (interfaceC0193d12 != null) {
            interfaceC0193d12.removeListener(viewOnClickListenerC2611f);
        }
        this.f9544s0 = interfaceC0193d1;
        if (interfaceC0193d1 != null) {
            interfaceC0193d1.addListener(viewOnClickListenerC2611f);
        }
        m4709i();
    }

    public void setProgressUpdateListener(InterfaceC2617i interfaceC2617i) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9488B0 = i;
        InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
        if (interfaceC0193d1 != null && interfaceC0193d1.isCommandAvailable(15)) {
            int repeatMode = this.f9544s0.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f9544s0.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.f9544s0.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.f9544s0.setRepeatMode(2);
            }
        }
        this.f9525j.m4729h(this.f9489C, i != 0);
        m4716p();
    }

    public void setShowFastForwardButton(boolean z7) {
        this.f9525j.m4729h(this.f9555y, z7);
        m4712l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z7) {
        this.f9550v0 = z7;
        m4719s();
    }

    public void setShowNextButton(boolean z7) {
        this.f9525j.m4729h(this.f9551w, z7);
        m4712l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z7) {
        this.f9552w0 = z7;
        m4713m();
    }

    public void setShowPreviousButton(boolean z7) {
        this.f9525j.m4729h(this.f9549v, z7);
        m4712l();
    }

    public void setShowRewindButton(boolean z7) {
        this.f9525j.m4729h(this.f9557z, z7);
        m4712l();
    }

    public void setShowShuffleButton(boolean z7) {
        this.f9525j.m4729h(this.f9491D, z7);
        m4718r();
    }

    public void setShowSubtitleButton(boolean z7) {
        this.f9525j.m4729h(this.f9495F, z7);
    }

    public void setShowTimeoutMs(int i) {
        this.f9558z0 = i;
        if (m4707g()) {
            this.f9525j.m4728g();
        }
    }

    public void setShowVrButton(boolean z7) {
        this.f9525j.m4729h(this.f9493E, z7);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9486A0 = AbstractC1118i0.m2451j(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f9493E;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m4710j(imageView, onClickListener != null);
        }
    }

    /* renamed from: t */
    public final void m4720t() {
        C2609e c2609e = this.f9539q;
        c2609e.getClass();
        List list = Collections.EMPTY_LIST;
        c2609e.f9416d = list;
        C2609e c2609e2 = this.f9541r;
        c2609e2.getClass();
        c2609e2.f9416d = list;
        InterfaceC0193d1 interfaceC0193d1 = this.f9544s0;
        ImageView imageView = this.f9495F;
        if (interfaceC0193d1 != null && interfaceC0193d1.isCommandAvailable(30) && this.f9544s0.isCommandAvailable(29)) {
            C0254x1 currentTracks = this.f9544s0.getCurrentTracks();
            C0981l1 c0981l1M4705e = m4705e(currentTracks, 1);
            c2609e2.f9416d = c0981l1M4705e;
            C2627o c2627o = c2609e2.f9419g;
            InterfaceC0193d1 interfaceC0193d12 = c2627o.f9544s0;
            C0692t c0692t = c2627o.f9535o;
            interfaceC0193d12.getClass();
            C0248v1 trackSelectionParameters = interfaceC0193d12.getTrackSelectionParameters();
            if (!c0981l1M4705e.isEmpty()) {
                if (c2609e2.m4694g(trackSelectionParameters)) {
                    int i = 0;
                    while (true) {
                        if (i >= c0981l1M4705e.f4213m) {
                            break;
                        }
                        C2623l c2623l = (C2623l) c0981l1M4705e.get(i);
                        if (c2623l.f9470a.f1541e[c2623l.f9471b]) {
                            ((String[]) c0692t.f2702f)[1] = c2623l.f9472c;
                            break;
                        }
                        i++;
                    }
                } else {
                    ((String[]) c0692t.f2702f)[1] = c2627o.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                ((String[]) c0692t.f2702f)[1] = c2627o.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.f9525j.m4725b(imageView)) {
                c2609e.m4695h(m4705e(currentTracks, 3));
            } else {
                c2609e.m4695h(C0981l1.f4211n);
            }
        }
        m4710j(imageView, c2609e.mo1455a() > 0);
        C0692t c0692t2 = this.f9535o;
        m4710j(this.f9501I, c0692t2.m1469h(1) || c0692t2.m1469h(0));
    }
}
