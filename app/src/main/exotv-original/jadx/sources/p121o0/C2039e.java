package p121o0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o0.e */
/* loaded from: classes.dex */
public final class C2039e implements InterfaceC2040f {

    /* renamed from: j */
    public final InputContentInfo f7506j;

    public C2039e(Object obj) {
        this.f7506j = (InputContentInfo) obj;
    }

    @Override // p121o0.InterfaceC2040f
    public final ClipDescription getDescription() {
        return this.f7506j.getDescription();
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: i */
    public final Uri mo287i() {
        return this.f7506j.getContentUri();
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: j */
    public final void mo288j() {
        this.f7506j.requestPermission();
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: k */
    public final Uri mo289k() {
        return this.f7506j.getLinkUri();
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: o */
    public final Object mo293o() {
        return this.f7506j;
    }

    public C2039e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f7506j = new InputContentInfo(uri, clipDescription, uri2);
    }
}
