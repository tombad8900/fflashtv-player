package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002a1.AbstractComponentCallbacksC0050v;
import p002a1.C0035n0;
import p002a1.C0036o;
import p002a1.C0058z;
import p005a4.C0074c0;
import p005a4.C0096q;
import p015b4.C0572f;
import p015b4.C0573g;
import p015b4.InterfaceC0567a;
import p023c4.C0642f;
import p023c4.C0643g;
import p023c4.C0644h;
import p033d4.ExecutorServiceC0846e;
import p033d4.ThreadFactoryC0843b;
import p033d4.ThreadFactoryC0844c;
import p062h.AbstractActivityC1083i;
import p090k2.C1584b;
import p118n4.C2015l;
import p118n4.C2019p;
import p130p.C2186e;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.b */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0713b implements ComponentCallbacks2 {

    /* renamed from: q */
    public static volatile ComponentCallbacks2C0713b f2772q;

    /* renamed from: r */
    public static volatile boolean f2773r;

    /* renamed from: j */
    public final InterfaceC0567a f2774j;

    /* renamed from: k */
    public final C0642f f2775k;

    /* renamed from: l */
    public final C0716e f2776l;

    /* renamed from: m */
    public final C0572f f2777m;

    /* renamed from: n */
    public final C2015l f2778n;

    /* renamed from: o */
    public final C1584b f2779o;

    /* renamed from: p */
    public final ArrayList f2780p = new ArrayList();

    public ComponentCallbacks2C0713b(Context context, C0096q c0096q, C0642f c0642f, InterfaceC0567a interfaceC0567a, C0572f c0572f, C2015l c2015l, C1584b c1584b, C2819f c2819f, C2186e c2186e, List list, ArrayList arrayList, AbstractC0714c abstractC0714c, C0036o c0036o) {
        this.f2774j = interfaceC0567a;
        this.f2777m = c0572f;
        this.f2775k = c0642f;
        this.f2778n = c2015l;
        this.f2779o = c1584b;
        this.f2776l = new C0716e(context, c0572f, new C2019p(this, arrayList, abstractC0714c), new C1584b(18), c2819f, c2186e, list, c0096q, c0036o);
    }

    /* renamed from: a */
    public static ComponentCallbacks2C0713b m1484a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2772q == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            }
            synchronized (ComponentCallbacks2C0713b.class) {
                if (f2772q == null) {
                    if (f2773r) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f2773r = true;
                    try {
                        m1486c(context, generatedAppGlideModule);
                        f2773r = false;
                    } catch (Throwable th) {
                        f2773r = false;
                        throw th;
                    }
                }
            }
        }
        return f2772q;
    }

    /* renamed from: b */
    public static C2015l m1485b(Context context) {
        AbstractC2470e.m4446c("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", context);
        return m1484a(context).f2778n;
    }

    /* renamed from: c */
    public static void m1486c(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ExecutorServiceC0846e executorServiceC0846e;
        C2186e c2186e = new C2186e(0);
        C0074c0 c0074c0 = new C0074c0(1);
        C2819f c2819f = new C2819f(14);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC0715d.m1554a0(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        ThreadFactoryC0843b threadFactoryC0843b = new ThreadFactoryC0843b();
        if (ExecutorServiceC0846e.f3730l == 0) {
            ExecutorServiceC0846e.f3730l = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC0846e.f3730l;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC0846e executorServiceC0846e2 = new ExecutorServiceC0846e(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0844c(threadFactoryC0843b, "source", false)));
        ThreadFactoryC0843b threadFactoryC0843b2 = new ThreadFactoryC0843b();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC0846e executorServiceC0846e3 = new ExecutorServiceC0846e(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0844c(threadFactoryC0843b2, "disk-cache", true)));
        if (ExecutorServiceC0846e.f3730l == 0) {
            ExecutorServiceC0846e.f3730l = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i4 = ExecutorServiceC0846e.f3730l >= 4 ? 2 : 1;
        ThreadFactoryC0843b threadFactoryC0843b3 = new ThreadFactoryC0843b();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC0846e executorServiceC0846e4 = new ExecutorServiceC0846e(new ThreadPoolExecutor(i4, i4, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0844c(threadFactoryC0843b3, "animation", true)));
        C0643g c0643g = new C0643g(applicationContext);
        C0644h c0644h = new C0644h();
        Context context2 = c0643g.f2537a;
        float f8 = c0643g.f2540d;
        ActivityManager activityManager = c0643g.f2538b;
        int i8 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c0644h.f2543c = i8;
        int iRound = Math.round(activityManager.getMemoryClass() * ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c0643g.f2539c.f143k;
        float f9 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f9 * f8);
        int iRound3 = Math.round(f9 * 2.0f);
        int i9 = iRound - i8;
        int i10 = iRound3 + iRound2;
        if (i10 <= i9) {
            c0644h.f2542b = iRound3;
            c0644h.f2541a = iRound2;
        } else {
            float f10 = i9 / (f8 + 2.0f);
            c0644h.f2542b = Math.round(2.0f * f10);
            c0644h.f2541a = Math.round(f10 * f8);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            executorServiceC0846e = executorServiceC0846e4;
            sb.append(Formatter.formatFileSize(context2, c0644h.f2542b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c0644h.f2541a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i8));
            sb.append(", memory class limited? ");
            sb.append(i10 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        } else {
            executorServiceC0846e = executorServiceC0846e4;
        }
        C1584b c1584b = new C1584b(10);
        int i11 = c0644h.f2541a;
        InterfaceC0567a c0573g = i11 > 0 ? new C0573g(i11) : new C2819f(10);
        C0572f c0572f = new C0572f(c0644h.f2543c);
        C0642f c0642f = new C0642f(c0644h.f2542b);
        ComponentCallbacks2C0713b componentCallbacks2C0713b = new ComponentCallbacks2C0713b(applicationContext, new C0096q(c0642f, new C0036o(applicationContext), executorServiceC0846e3, executorServiceC0846e2, new ExecutorServiceC0846e(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC0846e.f3729k, timeUnit, new SynchronousQueue(), new ThreadFactoryC0844c(new ThreadFactoryC0843b(), "source-unlimited", false))), executorServiceC0846e), c0642f, c0573g, c0572f, new C2015l(), c1584b, c2819f, c2186e, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C0036o(c0074c0));
        applicationContext.registerComponentCallbacks(componentCallbacks2C0713b);
        f2772q = componentCallbacks2C0713b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v24, types: [android.view.View] */
    /* renamed from: d */
    public static ComponentCallbacks2C0738m m1487d(ImageView imageView) {
        View view;
        C2015l c2015lM1485b = m1485b(imageView.getContext());
        c2015lM1485b.getClass();
        char[] cArr = AbstractC2478m.f9069a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c2015lM1485b.m3883c(imageView.getContext().getApplicationContext());
        }
        AbstractC2470e.m4446c("Unable to obtain a request manager for a view without a Context", imageView.getContext());
        Activity activityM3881a = C2015l.m3881a(imageView.getContext());
        if (activityM3881a == null) {
            return c2015lM1485b.m3883c(imageView.getContext().getApplicationContext());
        }
        if (!(activityM3881a instanceof AbstractActivityC1083i)) {
            return c2015lM1485b.m3883c(imageView.getContext().getApplicationContext());
        }
        AbstractActivityC1083i abstractActivityC1083i = (AbstractActivityC1083i) activityM3881a;
        C2186e c2186e = c2015lM1485b.f7438k;
        c2186e.clear();
        C2015l.m3882b(((C0058z) abstractActivityC1083i.f4599B.f143k).f280s.f117c.m80k(), c2186e);
        View viewFindViewById = abstractActivityC1083i.findViewById(R.id.content);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = null;
        for (ImageView imageView2 = imageView; !imageView2.equals(viewFindViewById) && (abstractComponentCallbacksC0050v = (AbstractComponentCallbacksC0050v) c2186e.get(imageView2)) == null && (imageView2.getParent() instanceof View); imageView2 = (View) imageView2.getParent()) {
        }
        c2186e.clear();
        if (abstractComponentCallbacksC0050v == null) {
            return c2015lM1485b.m3884d(abstractActivityC1083i);
        }
        AbstractC2470e.m4446c("You cannot start a load on a fragment before it is attached or after it is destroyed", abstractComponentCallbacksC0050v.m227h());
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c2015lM1485b.m3883c(abstractComponentCallbacksC0050v.m227h().getApplicationContext());
        }
        C0058z c0058z = abstractComponentCallbacksC0050v.f210B;
        if ((c0058z == null ? null : c0058z.f277p) != null) {
            c2015lM1485b.f7439l.mo3258e(c0058z != null ? c0058z.f277p : null);
        }
        C0035n0 c0035n0M226g = abstractComponentCallbacksC0050v.m226g();
        Context contextM227h = abstractComponentCallbacksC0050v.m227h();
        return c2015lM1485b.f7440m.m33C(contextM227h, m1484a(contextM227h.getApplicationContext()), abstractComponentCallbacksC0050v.f230V, c0035n0M226g, (!abstractComponentCallbacksC0050v.m233n() || abstractComponentCallbacksC0050v.m234o() || (view = abstractComponentCallbacksC0050v.f222N) == null || view.getWindowToken() == null || abstractComponentCallbacksC0050v.f222N.getVisibility() != 0) ? false : true);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC2478m.m4453a();
        this.f2775k.m4450e(0L);
        this.f2774j.mo1311m();
        C0572f c0572f = this.f2777m;
        synchronized (c0572f) {
            c0572f.m1318b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC2478m.m4453a();
        synchronized (this.f2780p) {
            try {
                ArrayList arrayList = this.f2780p;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((ComponentCallbacks2C0738m) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0642f c0642f = this.f2775k;
        c0642f.getClass();
        if (i >= 40) {
            c0642f.m4450e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c0642f) {
                j = c0642f.f9062b;
            }
            c0642f.m4450e(j / 2);
        }
        this.f2774j.mo1307a(i);
        C0572f c0572f = this.f2777m;
        synchronized (c0572f) {
            if (i >= 40) {
                synchronized (c0572f) {
                    c0572f.m1318b(0);
                }
            } else if (i >= 20 || i == 15) {
                c0572f.m1318b(c0572f.f2287e / 2);
            }
        }
    }
}
