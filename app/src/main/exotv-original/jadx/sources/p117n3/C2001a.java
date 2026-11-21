package p117n3;

import java.io.File;
import p151r3.C2303o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n3.a */
/* loaded from: classes.dex */
public final class C2001a implements InterfaceC2002b {

    /* renamed from: a */
    public final boolean f7425a;

    public C2001a(boolean z7) {
        this.f7425a = z7;
    }

    @Override // p117n3.InterfaceC2002b
    /* renamed from: a */
    public final String mo3880a(Object obj, C2303o c2303o) {
        File file = (File) obj;
        if (!this.f7425a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
