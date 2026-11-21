package p037e0;

import android.graphics.Insets;
import androidx.media3.common.AbstractC0195e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.b */
/* loaded from: classes.dex */
public final class C0851b {

    /* renamed from: e */
    public static final C0851b f3768e = new C0851b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3769a;

    /* renamed from: b */
    public final int f3770b;

    /* renamed from: c */
    public final int f3771c;

    /* renamed from: d */
    public final int f3772d;

    public C0851b(int i, int i4, int i8, int i9) {
        this.f3769a = i;
        this.f3770b = i4;
        this.f3771c = i8;
        this.f3772d = i9;
    }

    /* renamed from: a */
    public static C0851b m2020a(C0851b c0851b, C0851b c0851b2) {
        return m2022c(Math.max(c0851b.f3769a, c0851b2.f3769a), Math.max(c0851b.f3770b, c0851b2.f3770b), Math.max(c0851b.f3771c, c0851b2.f3771c), Math.max(c0851b.f3772d, c0851b2.f3772d));
    }

    /* renamed from: b */
    public static C0851b m2021b(C0851b c0851b, C0851b c0851b2) {
        return m2022c(Math.min(c0851b.f3769a, c0851b2.f3769a), Math.min(c0851b.f3770b, c0851b2.f3770b), Math.min(c0851b.f3771c, c0851b2.f3771c), Math.min(c0851b.f3772d, c0851b2.f3772d));
    }

    /* renamed from: c */
    public static C0851b m2022c(int i, int i4, int i8, int i9) {
        return (i == 0 && i4 == 0 && i8 == 0 && i9 == 0) ? f3768e : new C0851b(i, i4, i8, i9);
    }

    /* renamed from: d */
    public static C0851b m2023d(Insets insets) {
        return m2022c(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public final Insets m2024e() {
        return AbstractC0195e.m613c(this.f3769a, this.f3770b, this.f3771c, this.f3772d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0851b.class != obj.getClass()) {
            return false;
        }
        C0851b c0851b = (C0851b) obj;
        return this.f3772d == c0851b.f3772d && this.f3769a == c0851b.f3769a && this.f3771c == c0851b.f3771c && this.f3770b == c0851b.f3770b;
    }

    public final int hashCode() {
        return (((((this.f3769a * 31) + this.f3770b) * 31) + this.f3771c) * 31) + this.f3772d;
    }

    public final String toString() {
        return "Insets{left=" + this.f3769a + ", top=" + this.f3770b + ", right=" + this.f3771c + ", bottom=" + this.f3772d + '}';
    }
}
