package p035d6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p087k.C1538c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d6.a */
/* loaded from: classes.dex */
public abstract class AbstractC0848a {

    /* renamed from: a */
    public static final int[] f3765a = {R.attr.theme, com.exotv.net.R.attr.theme};

    /* renamed from: b */
    public static final int[] f3766b = {com.exotv.net.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m2014a(int i, int i4, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3766b, i, i4);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i8 = iArr2[0];
        boolean z7 = (context instanceof C1538c) && ((C1538c) context).f5860a == i8;
        if (i8 == 0 || z7) {
            return context;
        }
        C1538c c1538c = new C1538c(context, i8);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i4);
            for (int i9 = 0; i9 < iArr.length; i9++) {
                iArr3[i9] = typedArrayObtainStyledAttributes2.getResourceId(i9, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr3[i10];
            if (i11 != 0) {
                c1538c.getTheme().applyStyle(i11, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3765a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            c1538c.getTheme().applyStyle(resourceId, true);
        }
        return c1538c;
    }

    /* renamed from: b */
    public static Context m2015b(Context context, AttributeSet attributeSet, int i, int i4) {
        return m2014a(i, i4, context, attributeSet, new int[0]);
    }
}
