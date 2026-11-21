package p023c4;

import java.util.ArrayDeque;
import p178u4.AbstractC2478m;
import p203x3.C2756c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c4.c */
/* loaded from: classes.dex */
public final class C0639c {

    /* renamed from: a */
    public final ArrayDeque f2527a;

    public C0639c(int i) {
        switch (i) {
            case 1:
                char[] cArr = AbstractC2478m.f9069a;
                this.f2527a = new ArrayDeque(0);
                break;
            default:
                this.f2527a = new ArrayDeque();
                break;
        }
    }

    /* renamed from: a */
    public synchronized void m1422a(C2756c c2756c) {
        c2756c.f10182b = null;
        c2756c.f10183c = null;
        this.f2527a.offer(c2756c);
    }
}
