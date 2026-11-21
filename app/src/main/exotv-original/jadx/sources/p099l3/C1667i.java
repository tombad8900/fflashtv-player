package p099l3;

import android.webkit.MimeTypeMap;
import java.io.File;
import okhttp3.C2181z;
import p069h7.AbstractC1206h;
import p073i3.C1265n;
import p073i3.EnumC1257f;
import p137p6.InterfaceC2222c;
import p189v7.AbstractC2585p;
import p189v7.C2556a0;
import p189v7.C2558b0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.i */
/* loaded from: classes.dex */
public final class C1667i implements InterfaceC1666h {

    /* renamed from: a */
    public final File f6389a;

    public C1667i(File file) {
        this.f6389a = file;
    }

    @Override // p099l3.InterfaceC1666h
    /* renamed from: a */
    public final Object mo3366a(InterfaceC2222c interfaceC2222c) {
        String str = C2558b0.f9272k;
        File file = this.f6389a;
        C1265n c1265n = new C1265n(C2556a0.m4572e(file), AbstractC2585p.f9330a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        AbstractC2980h.m5135d("getName(...)", name);
        return new C1672n(c1265n, singleton.getMimeTypeFromExtension(AbstractC1206h.m2641O0(name, '.', C2181z.FRAGMENT_ENCODE_SET)), EnumC1257f.f5253l);
    }
}
