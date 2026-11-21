package androidx.media3.p009ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.C0169a;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0251w1;
import androidx.media3.common.InterfaceC0191d;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.common.InterfaceC0240t;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.p009ui.PlayerView;
import com.exotv.net.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p105m0.AbstractC1857w;
import p193w2.AbstractC2602a0;
import p193w2.C2627o;
import p193w2.C2632t;
import p193w2.C2638z;
import p193w2.InterfaceC2601a;
import p193w2.InterfaceC2613g;
import p193w2.InterfaceC2626n;
import p193w2.InterfaceC2635w;
import p193w2.InterfaceC2636x;
import p193w2.ViewOnClickListenerC2634v;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class PlayerView extends FrameLayout implements InterfaceC0191d {

    /* renamed from: P */
    public static final /* synthetic */ int f1927P = 0;

    /* renamed from: A */
    public final Object f1928A;

    /* renamed from: B */
    public InterfaceC0193d1 f1929B;

    /* renamed from: C */
    public boolean f1930C;

    /* renamed from: D */
    public InterfaceC2626n f1931D;

    /* renamed from: E */
    public int f1932E;

    /* renamed from: F */
    public int f1933F;

    /* renamed from: G */
    public Drawable f1934G;

    /* renamed from: H */
    public int f1935H;

    /* renamed from: I */
    public boolean f1936I;

    /* renamed from: J */
    public CharSequence f1937J;

    /* renamed from: K */
    public int f1938K;

    /* renamed from: L */
    public boolean f1939L;

    /* renamed from: M */
    public boolean f1940M;

    /* renamed from: N */
    public boolean f1941N;

    /* renamed from: O */
    public boolean f1942O;

    /* renamed from: j */
    public final ViewOnClickListenerC2634v f1943j;

    /* renamed from: k */
    public final AspectRatioFrameLayout f1944k;

    /* renamed from: l */
    public final View f1945l;

    /* renamed from: m */
    public final View f1946m;

    /* renamed from: n */
    public final boolean f1947n;

    /* renamed from: o */
    public final C2638z f1948o;

    /* renamed from: p */
    public final ImageView f1949p;

    /* renamed from: q */
    public final ImageView f1950q;

    /* renamed from: r */
    public final SubtitleView f1951r;

    /* renamed from: s */
    public final View f1952s;

    /* renamed from: t */
    public final TextView f1953t;

    /* renamed from: u */
    public final C2627o f1954u;

    /* renamed from: v */
    public final FrameLayout f1955v;

    /* renamed from: w */
    public final FrameLayout f1956w;

    /* renamed from: x */
    public final Handler f1957x;

    /* renamed from: y */
    public final Class f1958y;

    /* renamed from: z */
    public final Method f1959z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        int i;
        int i4;
        boolean z7;
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        ViewOnClickListenerC2634v viewOnClickListenerC2634v = new ViewOnClickListenerC2634v(this);
        this.f1943j = viewOnClickListenerC2634v;
        this.f1957x = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f1944k = null;
            this.f1945l = null;
            this.f1946m = null;
            this.f1947n = false;
            this.f1948o = null;
            this.f1949p = null;
            this.f1950q = null;
            this.f1951r = null;
            this.f1952s = null;
            this.f1953t = null;
            this.f1954u = null;
            this.f1955v = null;
            this.f1956w = null;
            this.f1958y = null;
            this.f1959z = null;
            this.f1928A = null;
            ImageView imageView = new ImageView(context);
            if (AbstractC1118i0.f4750a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2602a0.f9353d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(49, true);
                int i16 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i17 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i18 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i19 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z11 = z15;
                i = typedArrayObtainStyledAttributes.getInt(38, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f1936I = typedArrayObtainStyledAttributes.getBoolean(16, this.f1936I);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i4 = resourceId;
                z8 = z17;
                i10 = i17;
                z12 = zHasValue;
                i8 = integer;
                i13 = color;
                i12 = i18;
                i11 = i19;
                i9 = resourceId2;
                z9 = z18;
                z7 = z16;
                i14 = i16;
                z10 = z14;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 5000;
            i4 = R.layout.exo_player_view;
            z7 = true;
            z8 = true;
            z9 = true;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 1;
            i13 = 0;
            z10 = true;
            z11 = true;
            i14 = 1;
            z12 = false;
        }
        LayoutInflater.from(context).inflate(i4, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f1944k = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i11);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f1945l = viewFindViewById;
        if (viewFindViewById != null && z12) {
            viewFindViewById.setBackgroundColor(i13);
        }
        if (aspectRatioFrameLayout == null || i12 == 0) {
            i15 = 0;
            this.f1946m = null;
            z13 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i12 == 2) {
                this.f1946m = new TextureView(context);
            } else if (i12 == 3) {
                try {
                    int i20 = SphericalGLSurfaceView.f1910j;
                    this.f1946m = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z13 = true;
                    this.f1946m.setLayoutParams(layoutParams);
                    this.f1946m.setOnClickListener(viewOnClickListenerC2634v);
                    i15 = 0;
                    this.f1946m.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f1946m, 0);
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i12 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (AbstractC1118i0.f4750a >= 34) {
                    AbstractC1857w.m3643i(surfaceView);
                }
                this.f1946m = surfaceView;
            } else {
                try {
                    int i21 = VideoDecoderGLSurfaceView.f1888j;
                    this.f1946m = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e8) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e8);
                }
            }
            z13 = false;
            this.f1946m.setLayoutParams(layoutParams);
            this.f1946m.setOnClickListener(viewOnClickListenerC2634v);
            i15 = 0;
            this.f1946m.setClickable(false);
            aspectRatioFrameLayout.addView(this.f1946m, 0);
        }
        this.f1947n = z13;
        this.f1948o = AbstractC1118i0.f4750a == 34 ? new C2638z() : null;
        this.f1955v = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f1956w = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f1949p = (ImageView) findViewById(R.id.exo_image);
        this.f1933F = i10;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.NO_OP;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: w2.u
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i22 = PlayerView.f1927P;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f9597a;
                    playerView.f1957x.post(new RunnableC0320i(playerView, 10, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f1958y = cls;
        this.f1959z = method;
        this.f1928A = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f1950q = imageView2;
        this.f1932E = (!z10 || i14 == 0 || imageView2 == null) ? i15 : i14;
        if (i9 != 0) {
            this.f1934G = getContext().getDrawable(i9);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f1951r = subtitleView;
        if (subtitleView != null) {
            subtitleView.m1056a();
            subtitleView.m1057b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f1952s = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f1935H = i8;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f1953t = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C2627o c2627o = (C2627o) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (c2627o != null) {
            this.f1954u = c2627o;
        } else if (viewFindViewById3 != null) {
            C2627o c2627o2 = new C2627o(context, attributeSet);
            this.f1954u = c2627o2;
            c2627o2.setId(R.id.exo_controller);
            c2627o2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c2627o2, iIndexOfChild);
        } else {
            this.f1954u = null;
        }
        C2627o c2627o3 = this.f1954u;
        this.f1938K = c2627o3 != null ? i : i15;
        this.f1941N = z7;
        this.f1939L = z8;
        this.f1940M = z9;
        this.f1930C = (!z11 || c2627o3 == null) ? i15 : 1;
        if (c2627o3 != null) {
            C2632t c2632t = c2627o3.f9525j;
            int i22 = c2632t.f9596z;
            if (i22 != 3 && i22 != 2) {
                c2632t.m4727f();
                c2632t.m4730i(2);
            }
            C2627o c2627o4 = this.f1954u;
            ViewOnClickListenerC2634v viewOnClickListenerC2634v2 = this.f1943j;
            c2627o4.getClass();
            viewOnClickListenerC2634v2.getClass();
            c2627o4.f9531m.add(viewOnClickListenerC2634v2);
        }
        if (z11) {
            setClickable(true);
        }
        m1051l();
    }

    /* renamed from: a */
    public static void m1040a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        InterfaceC0193d1 interfaceC0193d1 = playerView.f1929B;
        if (interfaceC0193d1 != null && interfaceC0193d1.isCommandAvailable(30) && interfaceC0193d1.getCurrentTracks().m698a(2)) {
            return;
        }
        ImageView imageView = playerView.f1949p;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.m1054o();
        }
        View view = playerView.f1945l;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f1949p;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m1054o();
    }

    private void setImageOutput(InterfaceC0193d1 interfaceC0193d1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f1958y;
        if (cls == null || !cls.isAssignableFrom(interfaceC0193d1.getClass())) {
            return;
        }
        try {
            Method method = this.f1959z;
            method.getClass();
            Object obj = this.f1928A;
            obj.getClass();
            method.invoke(interfaceC0193d1, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final boolean m1041b() {
        InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
        return interfaceC0193d1 != null && this.f1928A != null && interfaceC0193d1.isCommandAvailable(30) && interfaceC0193d1.getCurrentTracks().m698a(4);
    }

    /* renamed from: c */
    public final void m1042c() {
        ImageView imageView = this.f1949p;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* renamed from: d */
    public final boolean m1043d() {
        InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
        return interfaceC0193d1 != null && interfaceC0193d1.isCommandAvailable(16) && this.f1929B.isPlayingAd() && this.f1929B.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C2638z c2638z;
        super.dispatchDraw(canvas);
        if (AbstractC1118i0.f4750a == 34 && (c2638z = this.f1948o) != null && this.f1942O) {
            c2638z.m4733b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
        if (interfaceC0193d1 != null && interfaceC0193d1.isCommandAvailable(16) && this.f1929B.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z7 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C2627o c2627o = this.f1954u;
        if (z7 && m1055p() && !c2627o.m4707g()) {
            m1044e(true);
            return true;
        }
        if ((m1055p() && c2627o.m4703c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m1044e(true);
            return true;
        }
        if (z7 && m1055p()) {
            m1044e(true);
        }
        return false;
    }

    /* renamed from: e */
    public final void m1044e(boolean z7) {
        if (!(m1043d() && this.f1940M) && m1055p()) {
            C2627o c2627o = this.f1954u;
            boolean z8 = c2627o.m4707g() && c2627o.getShowTimeoutMs() <= 0;
            boolean zM1046g = m1046g();
            if (z7 || z8 || zM1046g) {
                m1047h(zM1046g);
            }
        }
    }

    /* renamed from: f */
    public final boolean m1045f(Drawable drawable) {
        ImageView imageView = this.f1950q;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f1932E == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f1944k;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m1046g() {
        InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
        if (interfaceC0193d1 == null) {
            return true;
        }
        int playbackState = interfaceC0193d1.getPlaybackState();
        if (!this.f1939L) {
            return false;
        }
        if (this.f1929B.isCommandAvailable(17) && this.f1929B.getCurrentTimeline().isEmpty()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            InterfaceC0193d1 interfaceC0193d12 = this.f1929B;
            interfaceC0193d12.getClass();
            if (interfaceC0193d12.getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    public List<C0169a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f1956w;
        if (frameLayout != null) {
            arrayList.add(new C0169a(frameLayout));
        }
        C2627o c2627o = this.f1954u;
        if (c2627o != null) {
            arrayList.add(new C0169a(c2627o));
        }
        return AbstractC0983m0.m2165j(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f1955v;
        AbstractC1101a.m2361l("exo_ad_overlay must be present for ad playback", frameLayout);
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f1932E;
    }

    public boolean getControllerAutoShow() {
        return this.f1939L;
    }

    public boolean getControllerHideOnTouch() {
        return this.f1941N;
    }

    public int getControllerShowTimeoutMs() {
        return this.f1938K;
    }

    public Drawable getDefaultArtwork() {
        return this.f1934G;
    }

    public int getImageDisplayMode() {
        return this.f1933F;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f1956w;
    }

    public InterfaceC0193d1 getPlayer() {
        return this.f1929B;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1944k;
        AbstractC1101a.m2360k(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f1951r;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f1932E != 0;
    }

    public boolean getUseController() {
        return this.f1930C;
    }

    public View getVideoSurfaceView() {
        return this.f1946m;
    }

    /* renamed from: h */
    public final void m1047h(boolean z7) {
        if (m1055p()) {
            int i = z7 ? 0 : this.f1938K;
            C2627o c2627o = this.f1954u;
            c2627o.setShowTimeoutMs(i);
            C2632t c2632t = c2627o.f9525j;
            C2627o c2627o2 = c2632t.f9571a;
            if (!c2627o2.m4708h()) {
                c2627o2.setVisibility(0);
                c2627o2.m4709i();
                ImageView imageView = c2627o2.f9553x;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            c2632t.m4731k();
        }
    }

    /* renamed from: i */
    public final void m1048i() {
        if (!m1055p() || this.f1929B == null) {
            return;
        }
        C2627o c2627o = this.f1954u;
        if (!c2627o.m4707g()) {
            m1044e(true);
        } else if (this.f1941N) {
            c2627o.m4706f();
        }
    }

    /* renamed from: j */
    public final void m1049j() {
        InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
        C0194d2 videoSize = interfaceC0193d1 != null ? interfaceC0193d1.getVideoSize() : C0194d2.f1085d;
        int i = videoSize.f1086a;
        int i4 = videoSize.f1087b;
        float f8 = this.f1947n ? 0.0f : (i4 == 0 || i == 0) ? 0.0f : (i * videoSize.f1088c) / i4;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1944k;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1050k() {
        boolean z7;
        View view = this.f1952s;
        if (view != null) {
            InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
            if (interfaceC0193d1 == null || interfaceC0193d1.getPlaybackState() != 2) {
                z7 = false;
            } else {
                int i = this.f1935H;
                z7 = true;
                if (i != 2 && (i != 1 || !this.f1929B.getPlayWhenReady())) {
                }
            }
            view.setVisibility(z7 ? 0 : 8);
        }
    }

    /* renamed from: l */
    public final void m1051l() {
        C2627o c2627o = this.f1954u;
        if (c2627o == null || !this.f1930C) {
            setContentDescription(null);
        } else if (c2627o.m4707g()) {
            setContentDescription(this.f1941N ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* renamed from: m */
    public final void m1052m() {
        TextView textView = this.f1953t;
        if (textView != null) {
            CharSequence charSequence = this.f1937J;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
                if (interfaceC0193d1 != null) {
                    interfaceC0193d1.getPlayerError();
                }
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    public final void m1053n(boolean z7) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC0193d1 interfaceC0193d1 = this.f1929B;
        boolean zM1045f = false;
        boolean z8 = (interfaceC0193d1 == null || !interfaceC0193d1.isCommandAvailable(30) || interfaceC0193d1.getCurrentTracks().f1547a.isEmpty()) ? false : true;
        boolean z9 = this.f1936I;
        ImageView imageView = this.f1950q;
        View view = this.f1945l;
        if (!z9 && (!z8 || z7)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m1042c();
        }
        if (z8) {
            InterfaceC0193d1 interfaceC0193d12 = this.f1929B;
            boolean z10 = interfaceC0193d12 != null && interfaceC0193d12.isCommandAvailable(30) && interfaceC0193d12.getCurrentTracks().m698a(2);
            boolean zM1041b = m1041b();
            if (!z10 && !zM1041b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m1042c();
            }
            ImageView imageView2 = this.f1949p;
            boolean z11 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM1041b && !z10 && z11) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m1054o();
                }
            } else if (z10 && !zM1041b && z11) {
                m1042c();
            }
            if (!z10 && !zM1041b && this.f1932E != 0) {
                AbstractC1101a.m2360k(imageView);
                if (interfaceC0193d1 != null && interfaceC0193d1.isCommandAvailable(18) && (bArr = interfaceC0193d1.getMediaMetadata().f1385k) != null) {
                    zM1045f = m1045f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM1045f || m1045f(this.f1934G)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* renamed from: o */
    public final void m1054o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f1949p;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f1933F == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f1944k) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m1055p() || this.f1929B == null) {
            return false;
        }
        m1044e(true);
        return true;
    }

    /* renamed from: p */
    public final boolean m1055p() {
        if (!this.f1930C) {
            return false;
        }
        AbstractC1101a.m2360k(this.f1954u);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m1048i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        AbstractC1101a.m2359j(i == 0 || this.f1950q != null);
        if (this.f1932E != i) {
            this.f1932E = i;
            m1053n(false);
        }
    }

    public void setAspectRatioListener(InterfaceC2601a interfaceC2601a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1944k;
        AbstractC1101a.m2360k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC2601a);
    }

    public void setControllerAnimationEnabled(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setAnimationEnabled(z7);
    }

    public void setControllerAutoShow(boolean z7) {
        this.f1939L = z7;
    }

    public void setControllerHideDuringAds(boolean z7) {
        this.f1940M = z7;
    }

    public void setControllerHideOnTouch(boolean z7) {
        AbstractC1101a.m2360k(this.f1954u);
        this.f1941N = z7;
        m1051l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC2613g interfaceC2613g) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setOnFullScreenModeChangedListener(interfaceC2613g);
    }

    public void setControllerShowTimeoutMs(int i) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        this.f1938K = i;
        if (c2627o.m4707g()) {
            m1047h(m1046g());
        }
    }

    public void setControllerVisibilityListener(InterfaceC2635w interfaceC2635w) {
        if (interfaceC2635w != null) {
            setControllerVisibilityListener((InterfaceC2626n) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC1101a.m2359j(this.f1953t != null);
        this.f1937J = charSequence;
        m1052m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f1934G != drawable) {
            this.f1934G = drawable;
            m1053n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z7) {
        this.f1942O = z7;
    }

    public void setErrorMessageProvider(InterfaceC0240t interfaceC0240t) {
        if (interfaceC0240t != null) {
            m1052m();
        }
    }

    public void setFullscreenButtonClickListener(InterfaceC2636x interfaceC2636x) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setOnFullScreenModeChangedListener(this.f1943j);
    }

    public void setFullscreenButtonState(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.m4711k(z7);
    }

    public void setImageDisplayMode(int i) {
        AbstractC1101a.m2359j(this.f1949p != null);
        if (this.f1933F != i) {
            this.f1933F = i;
            m1054o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z7) {
        if (this.f1936I != z7) {
            this.f1936I = z7;
            m1053n(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(InterfaceC0193d1 interfaceC0193d1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC1101a.m2359j(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1101a.m2353d(interfaceC0193d1 == null || interfaceC0193d1.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC0193d1 interfaceC0193d12 = this.f1929B;
        if (interfaceC0193d12 == interfaceC0193d1) {
            return;
        }
        View view = this.f1946m;
        ViewOnClickListenerC2634v viewOnClickListenerC2634v = this.f1943j;
        if (interfaceC0193d12 != null) {
            interfaceC0193d12.removeListener(viewOnClickListenerC2634v);
            if (interfaceC0193d12.isCommandAvailable(27)) {
                if (view instanceof TextureView) {
                    interfaceC0193d12.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC0193d12.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            Class cls = this.f1958y;
            if (cls != null && cls.isAssignableFrom(interfaceC0193d12.getClass())) {
                try {
                    Method method = this.f1959z;
                    method.getClass();
                    method.invoke(interfaceC0193d12, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        SubtitleView subtitleView = this.f1951r;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f1929B = interfaceC0193d1;
        boolean zM1055p = m1055p();
        C2627o c2627o = this.f1954u;
        if (zM1055p) {
            c2627o.setPlayer(interfaceC0193d1);
        }
        m1050k();
        m1052m();
        m1053n(true);
        if (interfaceC0193d1 == null) {
            if (c2627o != null) {
                c2627o.m4706f();
                return;
            }
            return;
        }
        if (interfaceC0193d1.isCommandAvailable(27)) {
            if (view instanceof TextureView) {
                interfaceC0193d1.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                interfaceC0193d1.setVideoSurfaceView((SurfaceView) view);
            }
            if (interfaceC0193d1.isCommandAvailable(30)) {
                AbstractC0983m0 abstractC0983m0 = interfaceC0193d1.getCurrentTracks().f1547a;
                boolean z7 = false;
                int i = 0;
                loop0: while (true) {
                    if (i >= abstractC0983m0.size()) {
                        break;
                    }
                    if (((C0251w1) abstractC0983m0.get(i)).f1538b.f1321c == 2) {
                        C0251w1 c0251w1 = (C0251w1) abstractC0983m0.get(i);
                        for (int i4 = 0; i4 < c0251w1.f1540d.length; i4++) {
                            if (c0251w1.m697b(i4)) {
                                z7 = true;
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                if (z7) {
                    m1049j();
                }
            }
        }
        if (subtitleView != null && interfaceC0193d1.isCommandAvailable(28)) {
            subtitleView.setCues(interfaceC0193d1.getCurrentCues().f4388a);
        }
        interfaceC0193d1.addListener(viewOnClickListenerC2634v);
        setImageOutput(interfaceC0193d1);
        m1044e(false);
    }

    public void setRepeatToggleModes(int i) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1944k;
        AbstractC1101a.m2360k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f1935H != i) {
            this.f1935H = i;
            m1050k();
        }
    }

    public void setShowFastForwardButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowFastForwardButton(z7);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowMultiWindowTimeBar(z7);
    }

    public void setShowNextButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowNextButton(z7);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowPlayButtonIfPlaybackIsSuppressed(z7);
    }

    public void setShowPreviousButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowPreviousButton(z7);
    }

    public void setShowRewindButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowRewindButton(z7);
    }

    public void setShowShuffleButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowShuffleButton(z7);
    }

    public void setShowSubtitleButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowSubtitleButton(z7);
    }

    public void setShowVrButton(boolean z7) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        c2627o.setShowVrButton(z7);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f1945l;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z7) {
        setArtworkDisplayMode(!z7 ? 1 : 0);
    }

    public void setUseController(boolean z7) {
        boolean z8 = true;
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2359j((z7 && c2627o == null) ? false : true);
        if (!z7 && !hasOnClickListeners()) {
            z8 = false;
        }
        setClickable(z8);
        if (this.f1930C == z7) {
            return;
        }
        this.f1930C = z7;
        if (m1055p()) {
            c2627o.setPlayer(this.f1929B);
        } else if (c2627o != null) {
            c2627o.m4706f();
            c2627o.setPlayer(null);
        }
        m1051l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f1946m;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(InterfaceC2626n interfaceC2626n) {
        C2627o c2627o = this.f1954u;
        AbstractC1101a.m2360k(c2627o);
        CopyOnWriteArrayList copyOnWriteArrayList = c2627o.f9531m;
        InterfaceC2626n interfaceC2626n2 = this.f1931D;
        if (interfaceC2626n2 == interfaceC2626n) {
            return;
        }
        if (interfaceC2626n2 != null) {
            copyOnWriteArrayList.remove(interfaceC2626n2);
        }
        this.f1931D = interfaceC2626n;
        if (interfaceC2626n != null) {
            copyOnWriteArrayList.add(interfaceC2626n);
            setControllerVisibilityListener((InterfaceC2635w) null);
        }
    }
}
