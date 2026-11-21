package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes.dex */
public final class C0734k extends AbstractC0725b {

    /* renamed from: n */
    public final /* synthetic */ int f2863n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0734k(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f2863n = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        switch (this.f2863n) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.AbstractC0725b
    /* renamed from: g */
    public final void mo1642g(Object obj) throws IOException {
        switch (this.f2863n) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.AbstractC0725b
    /* renamed from: h */
    public final Object mo1649h(AssetManager assetManager, String str) {
        switch (this.f2863n) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
