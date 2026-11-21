package p050f4;

import androidx.media3.exoplayer.DefaultLoadControl;
import com.bumptech.glide.load.data.C0735l;
import java.util.ArrayDeque;
import p002a1.C0036o;
import p041e4.C0891h;
import p041e4.C0898o;
import p041e4.C0899p;
import p041e4.C0900q;
import p041e4.InterfaceC0901r;
import p210y3.C2803g;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f4.a */
/* loaded from: classes.dex */
public final class C0940a implements InterfaceC0901r {

    /* renamed from: b */
    public static final C2803g f4134b = C2803g.m4907a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));

    /* renamed from: a */
    public final C0036o f4135a;

    public C0940a(C0036o c0036o) {
        this.f4135a = c0036o;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2049a(Object obj) {
        return true;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        C0891h c0891h = (C0891h) obj;
        C0036o c0036o = this.f4135a;
        if (c0036o != null) {
            C0898o c0898o = (C0898o) c0036o.f143k;
            C0899p c0899pM2068a = C0899p.m2068a(c0891h);
            Object objM4448a = c0898o.m4448a(c0899pM2068a);
            ArrayDeque arrayDeque = C0899p.f3928b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c0899pM2068a);
            }
            C0891h c0891h2 = (C0891h) objM4448a;
            if (c0891h2 == null) {
                c0898o.m4449d(C0899p.m2068a(c0891h), c0891h);
            } else {
                c0891h = c0891h2;
            }
        }
        return new C0900q(c0891h, new C0735l(c0891h, ((Integer) c2804h.m4908c(f4134b)).intValue()));
    }
}
