package p005a4;

import p144q4.C2270f;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.r */
/* loaded from: classes.dex */
public final class RunnableC0097r implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f453j;

    /* renamed from: k */
    public final C2270f f454k;

    /* renamed from: l */
    public final /* synthetic */ C0100u f455l;

    public /* synthetic */ RunnableC0097r(C0100u c0100u, C2270f c2270f, int i) {
        this.f453j = i;
        this.f455l = c0100u;
        this.f454k = c2270f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0075d c0075d;
        switch (this.f453j) {
            case 0:
                C2270f c2270f = this.f454k;
                c2270f.f7915b.m4562a();
                synchronized (c2270f.f7916c) {
                    synchronized (this.f455l) {
                        try {
                            if (this.f455l.f465j.f458j.contains(new C0098s(this.f454k, AbstractC2470e.f9056b))) {
                                C0100u c0100u = this.f455l;
                                C2270f c2270f2 = this.f454k;
                                c0100u.getClass();
                                try {
                                    c2270f2.m4079e(c0100u.f481z, 5);
                                } finally {
                                }
                            }
                            this.f455l.m363d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                C2270f c2270f3 = this.f454k;
                c2270f3.f7915b.m4562a();
                synchronized (c2270f3.f7916c) {
                    synchronized (this.f455l) {
                        try {
                            if (this.f455l.f465j.f458j.contains(new C0098s(this.f454k, AbstractC2470e.f9056b))) {
                                this.f455l.f461B.m368a();
                                C0100u c0100u2 = this.f455l;
                                C2270f c2270f4 = this.f454k;
                                c0100u2.getClass();
                                try {
                                    c2270f4.m4080j(c0100u2.f461B, c0100u2.f479x, c0100u2.f464E);
                                    this.f455l.m367h(this.f454k);
                                } finally {
                                }
                            }
                            this.f455l.m363d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
