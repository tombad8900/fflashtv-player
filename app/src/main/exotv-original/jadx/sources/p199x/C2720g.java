package p199x;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.g */
/* loaded from: classes.dex */
public final class C2720g {

    /* renamed from: a */
    public final float f9963a;

    /* renamed from: b */
    public final float f9964b;

    /* renamed from: c */
    public final float f9965c;

    /* renamed from: d */
    public final float f9966d;

    /* renamed from: e */
    public final int f9967e;

    public C2720g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f9963a = Float.NaN;
        this.f9964b = Float.NaN;
        this.f9965c = Float.NaN;
        this.f9966d = Float.NaN;
        this.f9967e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2730q.f10097j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f9967e);
                this.f9967e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C2727n().m4802b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9966d = typedArrayObtainStyledAttributes.getDimension(index, this.f9966d);
            } else if (index == 2) {
                this.f9964b = typedArrayObtainStyledAttributes.getDimension(index, this.f9964b);
            } else if (index == 3) {
                this.f9965c = typedArrayObtainStyledAttributes.getDimension(index, this.f9965c);
            } else if (index == 4) {
                this.f9963a = typedArrayObtainStyledAttributes.getDimension(index, this.f9963a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
