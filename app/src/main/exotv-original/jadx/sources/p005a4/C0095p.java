package p005a4;

import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import p002a1.C0036o;
import p023c4.C0640d;
import p023c4.C0641e;
import p023c4.InterfaceC0637a;
import p178u4.AbstractC2470e;
import p178u4.InterfaceC2471f;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.p */
/* loaded from: classes.dex */
public final class C0095p implements InterfaceC2471f {

    /* renamed from: j */
    public final Object f443j;

    /* renamed from: k */
    public volatile Object f444k;

    public /* synthetic */ C0095p(Object obj) {
        this.f443j = obj;
    }

    /* renamed from: a */
    public InterfaceC0637a m353a() {
        if (((InterfaceC0637a) this.f444k) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0637a) this.f444k) == null) {
                        File cacheDir = ((C0641e) ((C0036o) this.f443j).f143k).f2534k.getCacheDir();
                        C0640d c0640d = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c0640d = new C0640d(file);
                        }
                        this.f444k = c0640d;
                    }
                    if (((InterfaceC0637a) this.f444k) == null) {
                        this.f444k = new C2819f(12);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC0637a) this.f444k;
    }

    @Override // p178u4.InterfaceC2471f
    public Object get() {
        if (this.f444k == null) {
            synchronized (this) {
                try {
                    if (this.f444k == null) {
                        Object obj = ((InterfaceC2471f) this.f443j).get();
                        AbstractC2470e.m4446c("Argument must not be null", obj);
                        this.f444k = obj;
                    }
                } finally {
                }
            }
        }
        return this.f444k;
    }

    public C0095p() {
        this.f443j = new CopyOnWriteArraySet();
    }
}
