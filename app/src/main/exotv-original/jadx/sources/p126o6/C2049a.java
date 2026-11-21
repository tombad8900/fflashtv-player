package p126o6;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Comparator;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o6.a */
/* loaded from: classes.dex */
public final class C2049a implements Comparator {

    /* renamed from: k */
    public static final C2049a f7569k = new C2049a(0);

    /* renamed from: l */
    public static final C2049a f7570l = new C2049a(1);

    /* renamed from: j */
    public final /* synthetic */ int f7571j;

    public /* synthetic */ C2049a(int i) {
        this.f7571j = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7571j) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC2980h.m5136e(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, comparable);
                AbstractC2980h.m5136e("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC2980h.m5136e(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, comparable3);
                AbstractC2980h.m5136e("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f7571j) {
            case 0:
                return f7570l;
            default:
                return f7569k;
        }
    }
}
