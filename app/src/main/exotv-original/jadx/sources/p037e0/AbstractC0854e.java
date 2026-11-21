package p037e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import com.bumptech.glide.AbstractC0715d;
import com.google.android.material.datepicker.RunnableC0748f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002a1.C0016e;
import p002a1.C0036o;
import p029d0.AbstractC0786b;
import p029d0.C0789e;
import p029d0.C0791g;
import p029d0.InterfaceC0788d;
import p079j0.AbstractC1480h;
import p079j0.C1476d;
import p079j0.C1478f;
import p079j0.C1479g;
import p079j0.CallableC1477e;
import p079j0.ExecutorC1484l;
import p079j0.RunnableC1485m;
import p085j6.RunnableC1527q;
import p130p.C2191j;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0854e {

    /* renamed from: a */
    public static final AbstractC0715d f3776a;

    /* renamed from: b */
    public static final C2191j f3777b;

    static {
        AbstractC0715d.m1561g("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f3776a = new C0859j();
        } else if (i >= 28) {
            f3776a = new C0858i();
        } else if (i >= 26) {
            f3776a = new C0857h();
        } else {
            Method method = C0856g.f3785p;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3776a = new C0856g();
            } else {
                f3776a = new C0855f();
            }
        }
        f3777b = new C2191j(16);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m2027a(Context context, InterfaceC0788d interfaceC0788d, Resources resources, int i, String str, int i4, int i8, AbstractC0786b abstractC0786b, boolean z7) throws InterruptedException {
        Typeface typefaceMo1604r;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i9 = 6;
        int i10 = -3;
        if (interfaceC0788d instanceof C0791g) {
            C0791g c0791g = (C0791g) interfaceC0788d;
            String str2 = c0791g.f3562e;
            Typeface typeface = null;
            boolean z8 = false;
            Object[] objArr = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (abstractC0786b != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0320i(abstractC0786b, i9, typefaceCreate));
                    }
                    return typefaceCreate;
                }
                int i11 = 1;
                Object[] objArr2 = !z7 ? abstractC0786b != null : c0791g.f3561d != 0;
                int i12 = z7 ? c0791g.f3560c : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                C0036o c0036o = new C0036o(15, z8);
                c0036o.f143k = abstractC0786b;
                C1476d c1476d = c0791g.f3559b;
                if (c1476d != null) {
                    Object[] objArr3 = {c0791g.f3558a, c1476d};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i13 = 0; i13 < 2; i13++) {
                        Object obj = objArr3[i13];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                } else {
                    Object[] objArr4 = {c0791g.f3558a};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr4[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                }
                ExecutorC1484l executorC1484l = new ExecutorC1484l(handler);
                C0016e c0016e = new C0016e(c0036o, 18, executorC1484l);
                int i14 = 7;
                if (objArr2 != true) {
                    String strM3143a = AbstractC1480h.m3143a(i8, listUnmodifiableList);
                    Typeface typeface2 = (Typeface) AbstractC1480h.f5703a.m3979g(strM3143a);
                    if (typeface2 != null) {
                        executorC1484l.execute(new RunnableC1527q(c0036o, i14, typeface2));
                        typeface = typeface2;
                    } else {
                        C1478f c1478f = new C1478f(objArr == true ? 1 : 0, c0016e);
                        synchronized (AbstractC1480h.f5705c) {
                            try {
                                C2192k c2192k = AbstractC1480h.f5706d;
                                ArrayList arrayList3 = (ArrayList) c2192k.get(strM3143a);
                                if (arrayList3 != null) {
                                    arrayList3.add(c1478f);
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    arrayList4.add(c1478f);
                                    c2192k.put(strM3143a, arrayList4);
                                    CallableC1477e callableC1477e = new CallableC1477e(strM3143a, context, listUnmodifiableList, i8, 1);
                                    ThreadPoolExecutor threadPoolExecutor = AbstractC1480h.f5704b;
                                    C1478f c1478f2 = new C1478f(i11, strM3143a);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    RunnableC1485m runnableC1485m = new RunnableC1485m();
                                    runnableC1485m.f5716j = callableC1477e;
                                    runnableC1485m.f5717k = c1478f2;
                                    runnableC1485m.f5718l = handler2;
                                    threadPoolExecutor.execute(runnableC1485m);
                                }
                            } finally {
                            }
                        }
                    }
                } else {
                    if (listUnmodifiableList.size() > 1) {
                        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                    }
                    C1476d c1476d2 = (C1476d) listUnmodifiableList.get(0);
                    C2191j c2191j = AbstractC1480h.f5703a;
                    ArrayList arrayList5 = new ArrayList(1);
                    Object obj3 = new Object[]{c1476d2}[0];
                    Objects.requireNonNull(obj3);
                    arrayList5.add(obj3);
                    String strM3143a2 = AbstractC1480h.m3143a(i8, Collections.unmodifiableList(arrayList5));
                    Typeface typeface3 = (Typeface) AbstractC1480h.f5703a.m3979g(strM3143a2);
                    if (typeface3 != null) {
                        executorC1484l.execute(new RunnableC1527q(c0036o, i14, typeface3));
                        typeface = typeface3;
                    } else if (i12 == -1) {
                        Object[] objArr5 = {c1476d2};
                        ArrayList arrayList6 = new ArrayList(1);
                        Object obj4 = objArr5[0];
                        Objects.requireNonNull(obj4);
                        arrayList6.add(obj4);
                        C1479g c1479gM3144b = AbstractC1480h.m3144b(strM3143a2, context, Collections.unmodifiableList(arrayList6), i8);
                        c0016e.m39I(c1479gM3144b);
                        typeface = c1479gM3144b.f5701a;
                    } else {
                        try {
                            try {
                                try {
                                    C1479g c1479g = (C1479g) AbstractC1480h.f5704b.submit(new CallableC1477e(strM3143a2, context, c1476d2, i8, 0)).get(i12, TimeUnit.MILLISECONDS);
                                    c0016e.m39I(c1479g);
                                    typeface = c1479g.f5701a;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (ExecutionException e8) {
                                throw new RuntimeException(e8);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused2) {
                            ((ExecutorC1484l) c0016e.f63l).execute(new RunnableC0748f(i10, i11, (C0036o) c0016e.f62k));
                        }
                    }
                }
                typefaceMo1604r = typeface;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceMo1604r = f3776a.mo1604r(context, (C0789e) interfaceC0788d, resources, i8);
            if (abstractC0786b != null) {
                if (typefaceMo1604r != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0320i(abstractC0786b, i9, typefaceMo1604r));
                } else {
                    abstractC0786b.m1941a(-3);
                }
            }
        }
        if (typefaceMo1604r != null) {
            f3777b.m3983k(m2028b(resources, i, str, i4, i8), typefaceMo1604r);
        }
        return typefaceMo1604r;
    }

    /* renamed from: b */
    public static String m2028b(Resources resources, int i, String str, int i4, int i8) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i4 + '-' + i + '-' + i8;
    }
}
