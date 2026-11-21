package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p066h4.C1175i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes.dex */
public final class C0731h implements InterfaceC0729f {

    /* renamed from: a */
    public final /* synthetic */ int f2855a;

    public /* synthetic */ C0731h(int i) {
        this.f2855a = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0729f
    /* renamed from: a */
    public final Class mo1650a() {
        switch (this.f2855a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0729f
    /* renamed from: b */
    public final InterfaceC0730g mo1651b(Object obj) {
        switch (this.f2855a) {
            case 0:
                return new C0732i(obj);
            case 1:
                return new C0732i((ParcelFileDescriptor) obj);
            default:
                return new C1175i((ByteBuffer) obj, 3);
        }
    }
}
