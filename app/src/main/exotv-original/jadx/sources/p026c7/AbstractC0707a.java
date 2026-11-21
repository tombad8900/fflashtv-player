package p026c7;

import java.util.Random;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c7.a */
/* loaded from: classes.dex */
public abstract class AbstractC0707a extends AbstractC0711e {
    @Override // p026c7.AbstractC0711e
    /* renamed from: a */
    public final int mo1477a(int i) {
        return mo1479d().nextInt(i);
    }

    @Override // p026c7.AbstractC0711e
    /* renamed from: b */
    public final long mo1478b() {
        return mo1479d().nextLong();
    }

    /* renamed from: d */
    public abstract Random mo1479d();
}
