package p099l3;

import android.net.Uri;
import p102l6.C1690g;
import p151r3.C2303o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.j */
/* loaded from: classes.dex */
public final class C1668j implements InterfaceC1665g {

    /* renamed from: a */
    public final C1690g f6390a;

    /* renamed from: b */
    public final C1690g f6391b;

    /* renamed from: c */
    public final boolean f6392c;

    public C1668j(C1690g c1690g, C1690g c1690g2, boolean z7) {
        this.f6390a = c1690g;
        this.f6391b = c1690g2;
        this.f6392c = z7;
    }

    @Override // p099l3.InterfaceC1665g
    /* renamed from: a */
    public final InterfaceC1666h mo3365a(Object obj, C2303o c2303o) {
        Uri uri = (Uri) obj;
        if (!AbstractC2980h.m5132a(uri.getScheme(), "http") && !AbstractC2980h.m5132a(uri.getScheme(), "https")) {
            return null;
        }
        return new C1671m(uri.toString(), c2303o, this.f6390a, this.f6391b, this.f6392c);
    }
}
