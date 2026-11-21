package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;
import p015b4.C0572f;
import p066h4.C1189w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.i */
/* loaded from: classes.dex */
public final class C0732i implements InterfaceC0730g {

    /* renamed from: l */
    public static final C0731h f2856l = new C0731h(0);

    /* renamed from: j */
    public final /* synthetic */ int f2857j;

    /* renamed from: k */
    public final Object f2858k;

    public C0732i() {
        this.f2857j = 0;
        this.f2858k = new HashMap();
    }

    /* renamed from: a */
    private final void m1654a() {
    }

    /* renamed from: c */
    private final void m1655c() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0730g
    /* renamed from: b */
    public void mo1652b() {
        switch (this.f2857j) {
            case 1:
            case 2:
                break;
            default:
                ((C1189w) this.f2858k).m2611c();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0730g
    /* renamed from: d */
    public Object mo1653d() {
        switch (this.f2857j) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2858k).rewind();
            case 2:
                return this.f2858k;
            default:
                C1189w c1189w = (C1189w) this.f2858k;
                c1189w.reset();
                return c1189w;
        }
    }

    /* renamed from: e */
    public ParcelFileDescriptor m1656e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2858k).rewind();
    }

    public C0732i(InputStream inputStream, C0572f c0572f) {
        this.f2857j = 3;
        C1189w c1189w = new C1189w(inputStream, c0572f);
        this.f2858k = c1189w;
        c1189w.mark(5242880);
    }

    public C0732i(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2857j = 1;
        this.f2858k = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public C0732i(Object obj) {
        this.f2857j = 2;
        this.f2858k = obj;
    }
}
