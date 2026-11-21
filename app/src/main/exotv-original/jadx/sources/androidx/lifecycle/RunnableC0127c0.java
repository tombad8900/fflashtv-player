package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.AbstractC0120b;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.p009ui.PlayerView;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.SeriesDetailActivity;
import com.exotv.net.p027ui.AdActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;
import p002a1.C0022h;
import p010b.DialogC0523m;
import p010b.ViewTreeObserverOnDrawListenerC0519i;
import p011b0.AbstractC0536b;
import p011b0.C0535a;
import p017b6.C0599e;
import p017b6.C0615o;
import p037e0.AbstractC0854e;
import p070i0.AbstractC1221f;
import p074i5.C1272d;
import p079j0.C1482j;
import p085j6.RunnableC1527q;
import p090k2.C1584b;
import p092k5.C1606e;
import p130p.C2192k;
import p131p0.C2195b;
import p131p0.C2197d;
import p166t0.C2392f;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;
import p175u0.C2452d;
import p175u0.C2454f;
import p175u0.C2455g;
import p175u0.ChoreographerFrameCallbackC2451c;
import p183v0.C2517q;
import p193w2.C2607d;
import p193w2.C2627o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0127c0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f903j;

    /* renamed from: k */
    public final /* synthetic */ Object f904k;

    public /* synthetic */ RunnableC0127c0(int i, Object obj) {
        this.f903j = i;
        this.f904k = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z7;
        Object obj;
        long j;
        boolean z8;
        int i = 2;
        switch (this.f903j) {
            case 0:
                C0133f0 c0133f0 = (C0133f0) this.f904k;
                C0166x c0166x = c0133f0.f915o;
                if (c0133f0.f911k == 0) {
                    z7 = true;
                    c0133f0.f912l = true;
                    c0166x.m585l(EnumC0146m.ON_PAUSE);
                } else {
                    z7 = true;
                }
                if (c0133f0.f910j == 0 && c0133f0.f912l) {
                    c0166x.m585l(EnumC0146m.ON_STOP);
                    c0133f0.f913m = z7;
                    return;
                }
                return;
            case 1:
                ((DefaultAnalyticsCollector) this.f904k).releaseInternal();
                return;
            case 2:
                ((SsMediaSource) this.f904k).startLoadingManifest();
                return;
            case 3:
                ((DefaultPreloadManager) this.f904k).lambda$releaseInternal$1();
                return;
            case 4:
                ((PlaybackVideoGraphWrapper) this.f904k).lambda$flush$1();
                return;
            case 5:
                ViewTreeObserverOnDrawListenerC0519i viewTreeObserverOnDrawListenerC0519i = (ViewTreeObserverOnDrawListenerC0519i) this.f904k;
                AbstractC2980h.m5136e("this$0", viewTreeObserverOnDrawListenerC0519i);
                Runnable runnable = viewTreeObserverOnDrawListenerC0519i.f2125k;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0519i.f2125k = null;
                    return;
                }
                return;
            case 6:
                DialogC0523m.m1249a((DialogC0523m) this.f904k);
                return;
            case 7:
                Activity activity = (Activity) this.f904k;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC0536b.f2199g;
                Method method = AbstractC0536b.f2198f;
                ?? r52 = Build.VERSION.SDK_INT;
                if (r52 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r62 = 27;
                if (((r52 != 26 && r52 != 27) || method != null) && (AbstractC0536b.f2197e != null || AbstractC0536b.f2196d != null)) {
                    try {
                        Object obj2 = AbstractC0536b.f2195c.get(activity);
                        if (obj2 != null && (obj = AbstractC0536b.f2194b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0535a c0535a = new C0535a(activity);
                            application.registerActivityLifecycleCallbacks(c0535a);
                            handler.post(new RunnableC1527q(c0535a, i, obj2));
                            int i4 = 3;
                            try {
                                if (r52 == 26 || r52 == 27) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r52 = application;
                                        r62 = c0535a;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        C0535a c0535a2 = c0535a;
                                        handler.post(new RunnableC1527q(application2, i4, c0535a2));
                                        throw th;
                                    }
                                } else {
                                    r52 = application;
                                    r62 = c0535a;
                                    activity.recreate();
                                }
                                handler.post(new RunnableC1527q((Object) r52, i4, (Object) r62));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 8:
                ((C0599e) this.f904k).m1358s(true);
                return;
            case 9:
                C0615o c0615o = (C0615o) this.f904k;
                boolean zIsPopupShowing = c0615o.f2423h.isPopupShowing();
                c0615o.m1370s(zIsPopupShowing);
                c0615o.f2428m = zIsPopupShowing;
                return;
            case 10:
                ((TextInputLayout) this.f904k).f3459n.requestLayout();
                return;
            case 11:
                ((WebView) this.f904k).destroy();
                return;
            case 12:
                Button button = ((AdActivity) this.f904k).f3038I;
                if (button != null) {
                    button.requestFocusFromTouch();
                    return;
                } else {
                    AbstractC2980h.m5139h("close");
                    throw null;
                }
            case 13:
                ((LinearLayout) this.f904k).requestFocus();
                return;
            case 14:
                MaterialButton.m1800b((MaterialButton) this.f904k);
                return;
            case 15:
                ((CarouselLayoutManager) this.f904k).m5004n0();
                return;
            case 16:
                C2195b c2195b = ((C2197d) this.f904k).f7668a;
                ViewParent parent = c2195b.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c2195b);
                    return;
                }
                return;
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                C2452d c2452d = (C2452d) ((C2452d) this.f904k).f8981c.f6229j;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = c2452d.f8980b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    C2454f c2454f = (C2454f) arrayList.get(i8);
                    if (c2454f != null) {
                        C2192k c2192k = c2452d.f8979a;
                        Long l8 = (Long) c2192k.get(c2454f);
                        if (l8 == null) {
                            j = c2454f.f8999f;
                            if (j != 0) {
                            }
                        } else if (l8.longValue() < jUptimeMillis2) {
                            c2192k.remove(c2454f);
                            j = c2454f.f8999f;
                            if (j != 0) {
                                c2454f.f8999f = jUptimeMillis;
                                c2454f.m4432c(c2454f.f8995b);
                            } else {
                                long j8 = jUptimeMillis - j;
                                c2454f.f8999f = jUptimeMillis;
                                float f8 = C2454f.m4430b().f8985g;
                                long j9 = f8 == 0.0f ? 2147483647L : (long) (j8 / f8);
                                if (c2454f.f9005l) {
                                    float f9 = c2454f.f9004k;
                                    if (f9 != Float.MAX_VALUE) {
                                        c2454f.f9003j.f9014i = f9;
                                        c2454f.f9004k = Float.MAX_VALUE;
                                    }
                                    c2454f.f8995b = (float) c2454f.f9003j.f9014i;
                                    c2454f.f8994a = 0.0f;
                                    c2454f.f9005l = false;
                                } else {
                                    if (c2454f.f9004k != Float.MAX_VALUE) {
                                        long j10 = j9 / 2;
                                        C1606e c1606eM4434a = c2454f.f9003j.m4434a(c2454f.f8995b, c2454f.f8994a, j10);
                                        C2455g c2455g = c2454f.f9003j;
                                        c2455g.f9014i = c2454f.f9004k;
                                        c2454f.f9004k = Float.MAX_VALUE;
                                        C1606e c1606eM4434a2 = c2455g.m4434a(c1606eM4434a.f6106a, c1606eM4434a.f6107b, j10);
                                        c2454f.f8995b = c1606eM4434a2.f6106a;
                                        c2454f.f8994a = c1606eM4434a2.f6107b;
                                    } else {
                                        C1606e c1606eM4434a3 = c2454f.f9003j.m4434a(c2454f.f8995b, c2454f.f8994a, j9);
                                        c2454f.f8995b = c1606eM4434a3.f6106a;
                                        c2454f.f8994a = c1606eM4434a3.f6107b;
                                    }
                                    float fMax = Math.max(c2454f.f8995b, -3.4028235E38f);
                                    c2454f.f8995b = fMax;
                                    c2454f.f8995b = Math.min(fMax, Float.MAX_VALUE);
                                    float f10 = c2454f.f8994a;
                                    C2455g c2455g2 = c2454f.f9003j;
                                    c2455g2.getClass();
                                    if (Math.abs(f10) >= c2455g2.f9010e || Math.abs(r3 - ((float) c2455g2.f9014i)) >= c2455g2.f9009d) {
                                        z8 = false;
                                        float fMin = Math.min(c2454f.f8995b, Float.MAX_VALUE);
                                        c2454f.f8995b = fMin;
                                        float fMax2 = Math.max(fMin, -3.4028235E38f);
                                        c2454f.f8995b = fMax2;
                                        c2454f.m4432c(fMax2);
                                        if (z8) {
                                            continue;
                                        } else {
                                            ArrayList arrayList2 = c2454f.f9001h;
                                            c2454f.f8998e = false;
                                            C2452d c2452dM4430b = C2454f.m4430b();
                                            c2452dM4430b.f8979a.remove(c2454f);
                                            ArrayList arrayList3 = c2452dM4430b.f8980b;
                                            int iIndexOf = arrayList3.indexOf(c2454f);
                                            if (iIndexOf >= 0) {
                                                arrayList3.set(iIndexOf, null);
                                                c2452dM4430b.f8984f = true;
                                            }
                                            c2454f.f8999f = 0L;
                                            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                                if (arrayList2.get(i9) != null) {
                                                    throw AbstractC0008a1.m10f(i9, arrayList2);
                                                }
                                            }
                                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                                if (arrayList2.get(size) == null) {
                                                    arrayList2.remove(size);
                                                }
                                            }
                                        }
                                    } else {
                                        c2454f.f8995b = (float) c2454f.f9003j.f9014i;
                                        c2454f.f8994a = 0.0f;
                                    }
                                }
                                z8 = true;
                                float fMin2 = Math.min(c2454f.f8995b, Float.MAX_VALUE);
                                c2454f.f8995b = fMin2;
                                float fMax22 = Math.max(fMin2, -3.4028235E38f);
                                c2454f.f8995b = fMax22;
                                c2454f.m4432c(fMax22);
                                if (z8) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (c2452d.f8984f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        c2452d.f8986h.m4428a();
                    }
                    c2452d.f8984f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) c2452d.f8983e.f8170k).postFrameCallback(new ChoreographerFrameCallbackC2451c(c2452d.f8982d));
                    return;
                }
                return;
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                C2517q c2517q = (C2517q) this.f904k;
                synchronized (c2517q.f9164m) {
                    try {
                        if (c2517q.f9168q == null) {
                            return;
                        }
                        try {
                            C1482j c1482jM4532c = c2517q.m4532c();
                            int i10 = c1482jM4532c.f5713e;
                            if (i10 == 2) {
                                synchronized (c2517q.f9164m) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = AbstractC1221f.f5104a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C1584b c1584b = c2517q.f9163l;
                                Context context = c2517q.f9161j;
                                c1584b.getClass();
                                C1482j[] c1482jArr = {c1482jM4532c};
                                AbstractC0715d abstractC0715d = AbstractC0854e.f3776a;
                                AbstractC0715d.m1561g("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceMo1605s = AbstractC0854e.f3776a.mo1605s(context, c1482jArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM394B = AbstractC0120b.m394B(c2517q.f9161j, c1482jM4532c.f5709a);
                                    if (mappedByteBufferM394B == null || typefaceMo1605s == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C0022h c0022h = new C0022h(typefaceMo1605s, AbstractC2429w.m4308m(mappedByteBufferM394B));
                                        Trace.endSection();
                                        synchronized (c2517q.f9164m) {
                                            try {
                                                AbstractC2415i0 abstractC2415i0 = c2517q.f9168q;
                                                if (abstractC2415i0 != null) {
                                                    abstractC2415i0.mo4288x(c0022h);
                                                }
                                            } finally {
                                            }
                                        }
                                        c2517q.m4531b();
                                        return;
                                    } finally {
                                        int i12 = AbstractC1221f.f5104a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (c2517q.f9164m) {
                                try {
                                    AbstractC2415i0 abstractC2415i02 = c2517q.f9168q;
                                    if (abstractC2415i02 != null) {
                                        abstractC2415i02.mo4287u(th3);
                                    }
                                    c2517q.m4531b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                ((C2607d) this.f904k).m4689d(false);
                return;
            case 20:
                ((C2627o) this.f904k).m4715o();
                return;
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                ((PlayerView) this.f904k).invalidate();
                return;
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) this.f904k;
                LinearLayout linearLayout = seriesDetailActivity.f3011O;
                if (linearLayout != null) {
                    linearLayout.requestFocus();
                }
                ScrollView scrollView = seriesDetailActivity.f3006J;
                if (scrollView != null) {
                    scrollView.smoothScrollTo(0, 0);
                    return;
                } else {
                    AbstractC2980h.m5139h("pageScroll");
                    throw null;
                }
            default:
                C1272d c1272d = (C1272d) this.f904k;
                c1272d.f5291c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c1272d.f5293e;
                C2392f c2392f = sideSheetBehavior.f3385i;
                if (c2392f != null && c2392f.m4228f()) {
                    c1272d.m2738a(c1272d.f5290b);
                    return;
                } else {
                    if (sideSheetBehavior.f3384h == 2) {
                        sideSheetBehavior.m1886r(c1272d.f5290b);
                        return;
                    }
                    return;
                }
        }
    }
}
