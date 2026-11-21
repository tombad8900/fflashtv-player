package p117n3;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import p151r3.C2303o;
import p185v3.AbstractC2536f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n3.c */
/* loaded from: classes.dex */
public final class C2003c implements InterfaceC2002b {
    @Override // p117n3.InterfaceC2002b
    /* renamed from: a */
    public final String mo3880a(Object obj, C2303o c2303o) {
        Uri uri = (Uri) obj;
        if (!AbstractC2980h.m5132a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = c2303o.f8055a.getResources().getConfiguration();
        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
