package p005a4;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC0728e;
import com.bumptech.glide.load.data.InterfaceC0730g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p002a1.C0016e;
import p023c4.InterfaceC0637a;
import p041e4.C0900q;
import p178u4.AbstractC2472g;
import p210y3.InterfaceC2798b;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.k0 */
/* loaded from: classes.dex */
public final class C0090k0 implements InterfaceC0083h, InterfaceC0081g {

    /* renamed from: j */
    public final C0085i f392j;

    /* renamed from: k */
    public final RunnableC0091l f393k;

    /* renamed from: l */
    public volatile int f394l;

    /* renamed from: m */
    public volatile C0077e f395m;

    /* renamed from: n */
    public volatile Object f396n;

    /* renamed from: o */
    public volatile C0900q f397o;

    /* renamed from: p */
    public volatile C0079f f398p;

    public C0090k0(C0085i c0085i, RunnableC0091l runnableC0091l) {
        this.f392j = c0085i;
        this.f393k = runnableC0091l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // p005a4.InterfaceC0083h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo303a() {
        if (this.f396n != null) {
            Object obj = this.f396n;
            this.f396n = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
            if (m329d(obj)) {
                if (this.f395m == null || !this.f395m.mo303a()) {
                    this.f395m = null;
                    this.f397o = null;
                    boolean z7 = false;
                    while (!z7 && this.f394l < this.f392j.m313b().size()) {
                        ArrayList arrayListM313b = this.f392j.m313b();
                        int i = this.f394l;
                        this.f394l = i + 1;
                        this.f397o = (C0900q) arrayListM313b.get(i);
                        if (this.f397o != null && (this.f392j.f381p.m344a(this.f397o.f3932c.mo1647c()) || this.f392j.m314c(this.f397o.f3932c.mo1641a()) != null)) {
                            this.f397o.f3932c.mo1648e(this.f392j.f380o, new C0016e(this, this.f397o, 3, false));
                            z7 = true;
                        }
                    }
                    return z7;
                }
            }
        }
        return true;
    }

    @Override // p005a4.InterfaceC0081g
    /* renamed from: b */
    public final void mo310b(InterfaceC2801e interfaceC2801e, Object obj, InterfaceC0728e interfaceC0728e, int i, InterfaceC2801e interfaceC2801e2) {
        this.f393k.mo310b(interfaceC2801e, obj, interfaceC0728e, this.f397o.f3932c.mo1647c(), interfaceC2801e);
    }

    @Override // p005a4.InterfaceC0081g
    /* renamed from: c */
    public final void mo311c(InterfaceC2801e interfaceC2801e, Exception exc, InterfaceC0728e interfaceC0728e, int i) {
        this.f393k.mo311c(interfaceC2801e, exc, interfaceC0728e, this.f397o.f3932c.mo1647c());
    }

    @Override // p005a4.InterfaceC0083h
    public final void cancel() {
        C0900q c0900q = this.f397o;
        if (c0900q != null) {
            c0900q.f3932c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean m329d(Object obj) throws Throwable {
        int i = AbstractC2472g.f9058b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z7 = false;
        try {
            InterfaceC0730g interfaceC0730gM1617g = this.f392j.f368c.m1610a().m1617g(obj);
            Object objMo1653d = interfaceC0730gM1617g.mo1653d();
            InterfaceC2798b interfaceC2798bM315d = this.f392j.m315d(objMo1653d);
            C0073c c0073c = new C0073c(interfaceC2798bM315d, objMo1653d, this.f392j.f374i, 1);
            InterfaceC2801e interfaceC2801e = this.f397o.f3930a;
            C0085i c0085i = this.f392j;
            C0079f c0079f = new C0079f(interfaceC2801e, c0085i.f379n);
            InterfaceC0637a interfaceC0637aM353a = c0085i.f373h.m353a();
            interfaceC0637aM353a.mo1421h(c0079f, c0073c);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0079f + ", data: " + obj + ", encoder: " + interfaceC2798bM315d + ", duration: " + AbstractC2472g.m4447a(jElapsedRealtimeNanos));
            }
            if (interfaceC0637aM353a.mo1420b(c0079f) != null) {
                this.f398p = c0079f;
                this.f395m = new C0077e(Collections.singletonList(this.f397o.f3930a), this.f392j, this);
                this.f397o.f3932c.mo1646b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f398p + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f393k.mo310b(this.f397o.f3930a, interfaceC0730gM1617g.mo1653d(), this.f397o.f3932c, this.f397o.f3932c.mo1647c(), this.f397o.f3930a);
                return false;
            } catch (Throwable th) {
                th = th;
                z7 = true;
                if (!z7) {
                    this.f397o.f3932c.mo1646b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
