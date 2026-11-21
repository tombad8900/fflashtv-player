package androidx.media3.exoplayer.audio;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.RunnableC0348f;
import androidx.media3.exoplayer.upstream.C0481c;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.p009ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.MainActivity;
import com.exotv.net.p027ui.AdActivity;
import com.google.android.material.button.MaterialButton;
import java.io.Serializable;
import java.util.Set;
import p010b.AbstractActivityC0522l;
import p010b.C0516f;
import p010b.C0534x;
import p024c5.C0665g0;
import p024c5.C0689r0;
import p029d0.AbstractC0786b;
import p062h.AbstractActivityC1083i;
import p062h.ExecutorC1087m;
import p063h1.C1129t;
import p102l6.C1689f;
import p195w4.C2658e;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0320i implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1679j;

    /* renamed from: k */
    public final /* synthetic */ Object f1680k;

    /* renamed from: l */
    public final /* synthetic */ Object f1681l;

    public /* synthetic */ RunnableC0320i(Object obj, int i, Object obj2) {
        this.f1679j = i;
        this.f1680k = obj;
        this.f1681l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        View viewM1664C;
        int i = this.f1679j;
        Object obj = this.f1681l;
        Object obj2 = this.f1680k;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$decoderReleased$5((String) obj);
                return;
            case 1:
                ((AudioSink.Listener) obj2).onAudioTrackReleased((AudioSink.AudioTrackConfig) obj);
                return;
            case 2:
                ((SphericalGLSurfaceView) obj2).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) obj);
                return;
            case 3:
                AbstractActivityC1083i abstractActivityC1083i = (AbstractActivityC1083i) obj2;
                int i4 = AbstractActivityC0522l.f2137A;
                abstractActivityC1083i.f2201j.mo568a(new C0516f((C0534x) obj, abstractActivityC1083i));
                return;
            case 4:
                AdActivity adActivity = (AdActivity) obj2;
                String str = (String) obj;
                WebView webView = adActivity.f3037H;
                if (webView != null) {
                    adActivity.m1753v(webView, str);
                    return;
                } else {
                    AbstractC2980h.m5139h("webView");
                    throw null;
                }
            case 5:
                TextView textView = (TextView) obj2;
                TextView textView2 = (TextView) obj;
                Layout layout = textView.getLayout();
                if (layout == null) {
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                if (lineCount < 0) {
                    lineCount = 0;
                }
                int lineTop = layout.getLineTop(lineCount) + textView.getPaddingTop();
                int lineBottom = layout.getLineBottom(lineCount) + textView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    return;
                }
                int height = ((lineTop + lineBottom) - textView2.getHeight()) / 2;
                int i8 = height >= 0 ? height : 0;
                if (layoutParams2.topMargin != i8) {
                    layoutParams2.topMargin = i8;
                    textView2.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            case 6:
                ((AbstractC0786b) obj2).mo1943h((Typeface) obj);
                return;
            case 7:
                ExecutorC1087m executorC1087m = (ExecutorC1087m) obj2;
                Runnable runnable = (Runnable) obj;
                executorC1087m.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC1087m.m2304a();
                }
            case 8:
                ((C0481c) obj).m1016a(((C1129t) obj2).m2480c());
                return;
            case 9:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.f3154a0;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams3 = materialButton.f3169M;
                if (layoutParams3 != null) {
                    materialButton.setLayoutParams(layoutParams3);
                    materialButton.f3169M = null;
                    materialButton.f3166J = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 10:
                PlayerView.m1040a((PlayerView) obj2, (Bitmap) obj);
                return;
            case 11:
                ((C2658e) obj2).invoke(new C1689f((Serializable) obj));
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj2;
                MainActivity mainActivity = (MainActivity) obj;
                Set set = MainActivity.f2882p0;
                C0689r0 c0689r0 = C0689r0.f2694a;
                C0665g0 c0665g0 = recyclerView instanceof C0665g0 ? (C0665g0) recyclerView : null;
                int iM1143K = -1;
                if (c0665g0 == null) {
                    View viewM1461a = C0689r0.m1461a(recyclerView);
                    if (viewM1461a != null) {
                        iM1143K = RecyclerView.m1143K(viewM1461a);
                    }
                } else {
                    AbstractC2923x adapter = c0665g0.getAdapter();
                    int iMo1455a = adapter != null ? adapter.mo1455a() : 0;
                    if (iMo1455a != 0) {
                        int i9 = c0665g0.f2607W0;
                        if (i9 < 0 || i9 >= iMo1455a) {
                            c0665g0.f2607W0 = iMo1455a > 1 ? 1 : 0;
                        }
                        iM1143K = c0665g0.f2607W0;
                    }
                }
                AbstractC2920v0 abstractC2920v0M1159H = recyclerView.m1159H(iM1143K);
                if (abstractC2920v0M1159H == null || (viewM1664C = abstractC2920v0M1159H.f10848a) == null) {
                    viewM1664C = MainActivity.m1664C(recyclerView);
                }
                if (viewM1664C != null) {
                    viewM1664C.setFocusable(true);
                    viewM1664C.setFocusableInTouchMode(true);
                    viewM1664C.requestFocus();
                    recyclerView.post(new RunnableC0348f(iM1143K, recyclerView, mainActivity));
                }
                C0689r0.m1463c(recyclerView);
                return;
        }
    }
}
