package com.bumptech.glide.load.data;

import java.io.InputStream;
import p015b4.C0572f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes.dex */
public final class C0736m implements InterfaceC0729f {

    /* renamed from: a */
    public final C0572f f2869a;

    public C0736m(C0572f c0572f) {
        this.f2869a = c0572f;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0729f
    /* renamed from: a */
    public final Class mo1650a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0729f
    /* renamed from: b */
    public final InterfaceC0730g mo1651b(Object obj) {
        return new C0732i((InputStream) obj, this.f2869a);
    }
}
