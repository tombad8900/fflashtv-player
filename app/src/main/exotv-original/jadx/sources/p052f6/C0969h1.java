package p052f6;

import java.io.Serializable;
import java.util.ArrayList;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.h1 */
/* loaded from: classes.dex */
public final class C0969h1 implements InterfaceC0921i, Serializable {

    /* renamed from: j */
    public final int f4196j;

    public C0969h1() {
        AbstractC1006u.m2188c(2, "expectedValuesPerKey");
        this.f4196j = 2;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        return new ArrayList(this.f4196j);
    }
}
