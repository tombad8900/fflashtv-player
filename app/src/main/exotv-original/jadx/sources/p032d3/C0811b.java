package p032d3;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.b */
/* loaded from: classes.dex */
public final class C0811b extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f3626a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0811b(Class cls, String str, int i) {
        super(cls, str);
        this.f3626a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3626a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC0839x.f3720a.mo1578G((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3626a) {
            case 0:
                C0817e c0817e = (C0817e) obj;
                PointF pointF = (PointF) obj2;
                c0817e.getClass();
                c0817e.f3633a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0817e.f3634b = iRound;
                int i = c0817e.f3638f + 1;
                c0817e.f3638f = i;
                if (i == c0817e.f3639g) {
                    AbstractC0839x.m2007a(c0817e.f3637e, c0817e.f3633a, iRound, c0817e.f3635c, c0817e.f3636d);
                    c0817e.f3638f = 0;
                    c0817e.f3639g = 0;
                    break;
                }
                break;
            case 1:
                C0817e c0817e2 = (C0817e) obj;
                PointF pointF2 = (PointF) obj2;
                c0817e2.getClass();
                c0817e2.f3635c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0817e2.f3636d = iRound2;
                int i4 = c0817e2.f3639g + 1;
                c0817e2.f3639g = i4;
                if (c0817e2.f3638f == i4) {
                    AbstractC0839x.m2007a(c0817e2.f3637e, c0817e2.f3633a, c0817e2.f3634b, c0817e2.f3635c, iRound2);
                    c0817e2.f3638f = 0;
                    c0817e2.f3639g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0839x.m2007a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0839x.m2007a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC0839x.m2007a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC0839x.f3720a.mo1598l0((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
