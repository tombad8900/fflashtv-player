package p017b6;

import android.content.res.TypedArray;
import android.util.SparseArray;
import p005a4.C0073c;
import p064h2.C1153r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.s */
/* loaded from: classes.dex */
public final class C0619s {

    /* renamed from: a */
    public int f2438a;

    /* renamed from: b */
    public int f2439b;

    /* renamed from: c */
    public final Cloneable f2440c;

    /* renamed from: d */
    public Object f2441d;

    public C0619s(C0620t c0620t, C0073c c0073c) {
        this.f2440c = new SparseArray();
        this.f2441d = c0620t;
        TypedArray typedArray = (TypedArray) c0073c.f325l;
        this.f2438a = typedArray.getResourceId(28, 0);
        this.f2439b = typedArray.getResourceId(53, 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h2.r[], java.lang.Cloneable] */
    public C0619s(int i) {
        this.f2440c = new C1153r[i];
        this.f2439b = 0;
    }
}
