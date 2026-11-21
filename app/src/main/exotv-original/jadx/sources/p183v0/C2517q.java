package p183v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.RunnableC0127c0;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002a1.AbstractC0008a1;
import p063h1.ThreadFactoryC1112f0;
import p079j0.AbstractC1475c;
import p079j0.C1476d;
import p079j0.C1481i;
import p079j0.C1482j;
import p090k2.C1584b;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.q */
/* loaded from: classes.dex */
public final class C2517q implements InterfaceC2509i {

    /* renamed from: j */
    public final Context f9161j;

    /* renamed from: k */
    public final C1476d f9162k;

    /* renamed from: l */
    public final C1584b f9163l;

    /* renamed from: m */
    public final Object f9164m = new Object();

    /* renamed from: n */
    public Handler f9165n;

    /* renamed from: o */
    public ThreadPoolExecutor f9166o;

    /* renamed from: p */
    public ThreadPoolExecutor f9167p;

    /* renamed from: q */
    public AbstractC2415i0 f9168q;

    public C2517q(Context context, C1476d c1476d) {
        AbstractC0714c.m1529o("Context cannot be null", context);
        this.f9161j = context.getApplicationContext();
        this.f9162k = c1476d;
        this.f9163l = C2518r.f9169d;
    }

    @Override // p183v0.InterfaceC2509i
    /* renamed from: a */
    public final void mo1424a(AbstractC2415i0 abstractC2415i0) {
        synchronized (this.f9164m) {
            this.f9168q = abstractC2415i0;
        }
        synchronized (this.f9164m) {
            try {
                if (this.f9168q == null) {
                    return;
                }
                if (this.f9166o == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1112f0("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f9167p = threadPoolExecutor;
                    this.f9166o = threadPoolExecutor;
                }
                this.f9166o.execute(new RunnableC0127c0(18, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m4531b() {
        synchronized (this.f9164m) {
            try {
                this.f9168q = null;
                Handler handler = this.f9165n;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f9165n = null;
                ThreadPoolExecutor threadPoolExecutor = this.f9167p;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f9166o = null;
                this.f9167p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final C1482j m4532c() {
        try {
            C1584b c1584b = this.f9163l;
            Context context = this.f9161j;
            C1476d c1476d = this.f9162k;
            c1584b.getClass();
            Object[] objArr = {c1476d};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C1481i c1481iM3140a = AbstractC1475c.m3140a(context, Collections.unmodifiableList(arrayList));
            int i = c1481iM3140a.f5707a;
            if (i != 0) {
                throw new RuntimeException(AbstractC0008a1.m14j("fetchFonts failed (", i, ")"));
            }
            C1482j[] c1482jArr = (C1482j[]) c1481iM3140a.f5708b.get(0);
            if (c1482jArr == null || c1482jArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1482jArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
