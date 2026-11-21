package p023c4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import androidx.media3.exoplayer.audio.RunnableC0317f;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p041e4.C0881b;
import p041e4.C0897n;
import p041e4.C0907x;
import p041e4.InterfaceC0901r;
import p041e4.InterfaceC0902s;
import p063h1.ThreadFactoryC1112f0;
import p168t2.AbstractC2415i0;
import p178u4.InterfaceC2471f;
import p183v0.InterfaceC2509i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c4.e */
/* loaded from: classes.dex */
public final class C0641e implements InterfaceC0902s, InterfaceC2471f, InterfaceC2509i {

    /* renamed from: j */
    public final /* synthetic */ int f2533j;

    /* renamed from: k */
    public final Context f2534k;

    public /* synthetic */ C0641e(Context context, int i) {
        this.f2533j = i;
        this.f2534k = context;
    }

    @Override // p183v0.InterfaceC2509i
    /* renamed from: a */
    public void mo1424a(AbstractC2415i0 abstractC2415i0) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1112f0("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0317f(this, abstractC2415i0, threadPoolExecutor, 3));
    }

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        switch (this.f2533j) {
            case 1:
                return new C0881b(this.f2534k, this);
            case 2:
                return new C0881b(this.f2534k, this);
            case 3:
                return new C0881b(this.f2534k, this);
            case 4:
                return new C0897n(this.f2534k, 0);
            case 5:
                return new C0881b(this.f2534k, c0907x.m2070a(Integer.class, AssetFileDescriptor.class));
            case 6:
                return new C0881b(this.f2534k, c0907x.m2070a(Integer.class, InputStream.class));
            case 7:
                return new C0897n(this.f2534k, 1);
            default:
                return new C0897n(this.f2534k, 2);
        }
    }

    @Override // p178u4.InterfaceC2471f
    public Object get() {
        return (ConnectivityManager) this.f2534k.getSystemService("connectivity");
    }

    public C0641e(Context context) {
        this.f2533j = 10;
        this.f2534k = context.getApplicationContext();
    }
}
