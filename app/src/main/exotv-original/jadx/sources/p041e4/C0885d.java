package p041e4;

import android.util.Log;
import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p178u4.AbstractC2466a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.d */
/* loaded from: classes.dex */
public final class C0885d implements InterfaceC0728e {

    /* renamed from: j */
    public final /* synthetic */ int f3895j;

    /* renamed from: k */
    public final Object f3896k;

    public /* synthetic */ C0885d(int i, Object obj) {
        this.f3895j = i;
        this.f3896k = obj;
    }

    /* renamed from: d */
    private final void m2051d() {
    }

    /* renamed from: f */
    private final void m2052f() {
    }

    /* renamed from: g */
    private final void m2053g() {
    }

    /* renamed from: h */
    private final void m2054h() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        switch (this.f3895j) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f3896k.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() {
        int i = this.f3895j;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        switch (this.f3895j) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        int i = this.f3895j;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) {
        switch (this.f3895j) {
            case 0:
                try {
                    interfaceC0727d.mo49f(AbstractC2466a.m4439a((File) this.f3896k));
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC0727d.mo47d(e);
                    return;
                }
            default:
                interfaceC0727d.mo49f(this.f3896k);
                break;
        }
    }
}
