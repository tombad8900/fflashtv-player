package p063h1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import androidx.media3.exoplayer.upstream.C0481c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p062h.C1095u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.t */
/* loaded from: classes.dex */
public final class C1129t {

    /* renamed from: e */
    public static C1129t f4786e;

    /* renamed from: a */
    public int f4787a;

    /* renamed from: b */
    public final Object f4788b;

    /* renamed from: c */
    public final List f4789c;

    /* renamed from: d */
    public final Object f4790d;

    public C1129t(Context context) {
        this.f4788b = new Handler(Looper.getMainLooper());
        this.f4789c = new CopyOnWriteArrayList();
        this.f4790d = new Object();
        this.f4787a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C1095u(1, this), intentFilter);
    }

    /* renamed from: a */
    public static void m2478a(int i, C1129t c1129t) {
        synchronized (c1129t.f4790d) {
            try {
                if (c1129t.f4787a == i) {
                    return;
                }
                c1129t.f4787a = i;
                Iterator it = ((CopyOnWriteArrayList) c1129t.f4789c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0481c c0481c = (C0481c) weakReference.get();
                    if (c0481c != null) {
                        c0481c.m1016a(i);
                    } else {
                        ((CopyOnWriteArrayList) c1129t.f4789c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C1129t m2479b(Context context) {
        try {
            if (f4786e == null) {
                f4786e = new C1129t(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4786e;
    }

    /* renamed from: c */
    public int m2480c() {
        int i;
        synchronized (this.f4790d) {
            i = this.f4787a;
        }
        return i;
    }

    /* renamed from: d */
    public int m2481d() {
        int i = this.f4787a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* renamed from: e */
    public void m2482e(C0481c c0481c) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f4789c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c0481c));
        ((Handler) this.f4788b).post(new RunnableC0320i(this, 8, c0481c));
    }

    public C1129t(int i, String str, int i4, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f4788b = str;
        this.f4787a = i4;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f4789c = listUnmodifiableList;
        this.f4790d = bArr;
    }
}
