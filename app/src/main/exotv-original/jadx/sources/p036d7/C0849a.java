package p036d7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p026c7.AbstractC0707a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d7.a */
/* loaded from: classes.dex */
public final class C0849a extends AbstractC0707a {
    @Override // p026c7.AbstractC0711e
    /* renamed from: c */
    public final long mo1480c() {
        return ThreadLocalRandom.current().nextLong(12000L, 16001L);
    }

    @Override // p026c7.AbstractC0707a
    /* renamed from: d */
    public final Random mo1479d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC2980h.m5135d("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
