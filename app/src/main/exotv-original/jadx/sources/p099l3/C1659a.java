package p099l3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import p151r3.C2303o;
import p185v3.AbstractC2536f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.a */
/* loaded from: classes.dex */
public final class C1659a implements InterfaceC1665g {

    /* renamed from: a */
    public final /* synthetic */ int f6377a;

    public /* synthetic */ C1659a(int i) {
        this.f6377a = i;
    }

    @Override // p099l3.InterfaceC1665g
    /* renamed from: a */
    public final InterfaceC1666h mo3365a(Object obj, C2303o c2303o) {
        switch (this.f6377a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC2536f.m4557d(uri)) {
                    return new C1660b(uri, c2303o, 0);
                }
                return null;
            case 1:
                return new C1661c((Bitmap) obj, c2303o, 0);
            case 2:
                return new C1661c((ByteBuffer) obj, c2303o, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC2980h.m5132a(uri2.getScheme(), "content")) {
                    return new C1662d(uri2, c2303o);
                }
                return null;
            case 4:
                return new C1661c((Drawable) obj, c2303o, 2);
            case 5:
                return new C1667i((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC2980h.m5132a(uri3.getScheme(), "android.resource")) {
                    return new C1660b(uri3, c2303o, 1);
                }
                return null;
        }
    }
}
