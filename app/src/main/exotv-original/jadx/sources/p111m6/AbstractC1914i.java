package p111m6;

import com.bumptech.glide.AbstractC0715d;
import java.util.List;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.i */
/* loaded from: classes.dex */
public abstract class AbstractC1914i extends AbstractC0715d {
    /* renamed from: s0 */
    public static int m3752s0(List list) {
        AbstractC2980h.m5136e("<this>", list);
        return list.size() - 1;
    }

    /* renamed from: t0 */
    public static List m3753t0(Object... objArr) {
        AbstractC2980h.m5136e("elements", objArr);
        return objArr.length > 0 ? AbstractC1912g.m3724h0(objArr) : C1921p.f7187j;
    }

    /* renamed from: u0 */
    public static final List m3754u0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC0715d.m1551T(list.get(0)) : C1921p.f7187j;
    }

    /* renamed from: v0 */
    public static void m3755v0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
