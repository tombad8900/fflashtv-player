package com.bumptech.glide;

import p161s4.C2361a;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.a */
/* loaded from: classes.dex */
public final class C0712a implements Cloneable {

    /* renamed from: j */
    public C2361a f2771j;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0712a clone() {
        try {
            return (C0712a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final boolean m1482b(Object obj) {
        if (obj instanceof C0712a) {
            return AbstractC2478m.m4454b(this.f2771j, ((C0712a) obj).f2771j);
        }
        return false;
    }

    /* renamed from: c */
    public final int m1483c() {
        C2361a c2361a = this.f2771j;
        if (c2361a != null) {
            return c2361a.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0712a) && m1482b(obj);
    }

    public final int hashCode() {
        return m1483c();
    }
}
