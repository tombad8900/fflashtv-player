package p105m0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.d */
/* loaded from: classes.dex */
public final class C1800d implements InterfaceC1803e, InterfaceC1809g {

    /* renamed from: a */
    public final /* synthetic */ int f6863a = 0;

    /* renamed from: b */
    public final Object f6864b;

    public C1800d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f6864b = contentInfo;
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: a */
    public ClipData mo3521a() {
        return ((ContentInfo) this.f6864b).getClip();
    }

    @Override // p105m0.InterfaceC1803e
    /* renamed from: b */
    public void mo3522b(Uri uri) {
        ((ContentInfo.Builder) this.f6864b).setLinkUri(uri);
    }

    @Override // p105m0.InterfaceC1803e
    public C1812h build() {
        return new C1812h(new C1800d(((ContentInfo.Builder) this.f6864b).build()));
    }

    @Override // p105m0.InterfaceC1803e
    /* renamed from: c */
    public void mo3523c(int i) {
        ((ContentInfo.Builder) this.f6864b).setFlags(i);
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: d */
    public int mo3524d() {
        return ((ContentInfo) this.f6864b).getFlags();
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: e */
    public ContentInfo mo3525e() {
        return (ContentInfo) this.f6864b;
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: f */
    public int mo3526f() {
        return ((ContentInfo) this.f6864b).getSource();
    }

    @Override // p105m0.InterfaceC1803e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f6864b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f6863a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f6864b) + "}";
            default:
                return super.toString();
        }
    }

    public C1800d(ClipData clipData, int i) {
        this.f6864b = AbstractC1797c.m3513a(clipData, i);
    }
}
