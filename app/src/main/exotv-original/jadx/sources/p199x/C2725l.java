package p199x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.l */
/* loaded from: classes.dex */
public final class C2725l {

    /* renamed from: a */
    public int f10064a;

    /* renamed from: b */
    public int f10065b;

    /* renamed from: c */
    public float f10066c;

    /* renamed from: d */
    public float f10067d;

    /* renamed from: a */
    public final void m4794a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2730q.f10094g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f10066c = typedArrayObtainStyledAttributes.getFloat(index, this.f10066c);
            } else if (index == 0) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f10064a);
                this.f10064a = i4;
                this.f10064a = C2727n.f10082d[i4];
            } else if (index == 4) {
                this.f10065b = typedArrayObtainStyledAttributes.getInt(index, this.f10065b);
            } else if (index == 3) {
                this.f10067d = typedArrayObtainStyledAttributes.getFloat(index, this.f10067d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
