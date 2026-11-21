package p105m0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC1822k0 {
    /* renamed from: a */
    public static String[] m3580a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C1812h m3581b(View view, C1812h c1812h) {
        ContentInfo contentInfoMo3525e = c1812h.f6875a.mo3525e();
        Objects.requireNonNull(contentInfoMo3525e);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo3525e);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo3525e ? c1812h : new C1812h(new C1800d(contentInfoPerformReceiveContent));
    }
}
