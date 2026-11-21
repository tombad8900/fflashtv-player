package p098l2;

import androidx.media3.exoplayer.source.preload.C0456a;
import java.util.ArrayDeque;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p090k2.AbstractC1596n;
import p090k2.C1588f;
import p090k2.C1595m;
import p090k2.InterfaceC1591i;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l2.h */
/* loaded from: classes.dex */
public abstract class AbstractC1658h implements InterfaceC1591i {

    /* renamed from: a */
    public final ArrayDeque f6370a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f6371b;

    /* renamed from: c */
    public final ArrayDeque f6372c;

    /* renamed from: d */
    public C1657g f6373d;

    /* renamed from: e */
    public long f6374e;

    /* renamed from: f */
    public long f6375f;

    /* renamed from: g */
    public long f6376g;

    public AbstractC1658h() {
        for (int i = 0; i < 10; i++) {
            this.f6370a.add(new C1657g(1));
        }
        this.f6371b = new ArrayDeque();
        for (int i4 = 0; i4 < 2; i4++) {
            ArrayDeque arrayDeque = this.f6371b;
            C0456a c0456a = new C0456a(9, this);
            C1588f c1588f = new C1588f();
            c1588f.f6061m = c0456a;
            arrayDeque.add(c1588f);
        }
        this.f6372c = new ArrayDeque();
        this.f6376g = -9223372036854775807L;
    }

    /* renamed from: a */
    public abstract C1629o mo3349a();

    /* renamed from: b */
    public abstract void mo3350b(C1657g c1657g);

    @Override // p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1596n dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f6371b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f6372c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C1657g c1657g = (C1657g) arrayDeque2.peek();
            int i = AbstractC1118i0.f4750a;
            if (c1657g.timeUs > this.f6374e) {
                return null;
            }
            C1657g c1657g2 = (C1657g) arrayDeque2.poll();
            boolean zIsEndOfStream = c1657g2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.f6370a;
            if (zIsEndOfStream) {
                AbstractC1596n abstractC1596n = (AbstractC1596n) arrayDeque.pollFirst();
                abstractC1596n.addFlag(4);
                c1657g2.clear();
                arrayDeque3.add(c1657g2);
                return abstractC1596n;
            }
            mo3350b(c1657g2);
            if (mo3352d()) {
                C1629o c1629oMo3349a = mo3349a();
                AbstractC1596n abstractC1596n2 = (AbstractC1596n) arrayDeque.pollFirst();
                long j = c1657g2.timeUs;
                abstractC1596n2.timeUs = j;
                abstractC1596n2.f6075j = c1629oMo3349a;
                abstractC1596n2.f6076k = j;
                c1657g2.clear();
                arrayDeque3.add(c1657g2);
                return abstractC1596n2;
            }
            c1657g2.clear();
            arrayDeque3.add(c1657g2);
        }
    }

    /* renamed from: d */
    public abstract boolean mo3352d();

    @Override // p106m1.InterfaceC1869d
    public final Object dequeueInputBuffer() {
        AbstractC1101a.m2359j(this.f6373d == null);
        ArrayDeque arrayDeque = this.f6370a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C1657g c1657g = (C1657g) arrayDeque.pollFirst();
        this.f6373d = c1657g;
        return c1657g;
    }

    @Override // p106m1.InterfaceC1869d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f6375f = 0L;
        this.f6374e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f6372c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f6370a;
            if (zIsEmpty) {
                break;
            }
            C1657g c1657g = (C1657g) arrayDeque2.poll();
            int i = AbstractC1118i0.f4750a;
            c1657g.clear();
            arrayDeque.add(c1657g);
        }
        C1657g c1657g2 = this.f6373d;
        if (c1657g2 != null) {
            c1657g2.clear();
            arrayDeque.add(c1657g2);
            this.f6373d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // p106m1.InterfaceC1869d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void queueInputBuffer(Object obj) {
        C1595m c1595m = (C1595m) obj;
        AbstractC1101a.m2353d(c1595m == this.f6373d);
        C1657g c1657g = (C1657g) c1595m;
        long j = c1657g.timeUs;
        if (j != Long.MIN_VALUE) {
            long j8 = this.f6376g;
            if (j8 == -9223372036854775807L || j >= j8) {
                long j9 = this.f6375f;
                this.f6375f = 1 + j9;
                c1657g.f6369k = j9;
                this.f6372c.add(c1657g);
            } else {
                c1657g.clear();
                this.f6370a.add(c1657g);
            }
        }
        this.f6373d = null;
    }

    @Override // p106m1.InterfaceC1869d
    public void release() {
    }

    @Override // p106m1.InterfaceC1869d
    public final void setOutputStartTimeUs(long j) {
        this.f6376g = j;
    }

    @Override // p090k2.InterfaceC1591i
    public final void setPositionUs(long j) {
        this.f6374e = j;
    }
}
