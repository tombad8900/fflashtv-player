package p199x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.m */
/* loaded from: classes.dex */
public final class C2726m {

    /* renamed from: n */
    public static final SparseIntArray f10068n;

    /* renamed from: a */
    public float f10069a;

    /* renamed from: b */
    public float f10070b;

    /* renamed from: c */
    public float f10071c;

    /* renamed from: d */
    public float f10072d;

    /* renamed from: e */
    public float f10073e;

    /* renamed from: f */
    public float f10074f;

    /* renamed from: g */
    public float f10075g;

    /* renamed from: h */
    public int f10076h;

    /* renamed from: i */
    public float f10077i;

    /* renamed from: j */
    public float f10078j;

    /* renamed from: k */
    public float f10079k;

    /* renamed from: l */
    public boolean f10080l;

    /* renamed from: m */
    public float f10081m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10068n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: a */
    public final void m4795a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2730q.f10096i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f10068n.get(index)) {
                case 1:
                    this.f10069a = typedArrayObtainStyledAttributes.getFloat(index, this.f10069a);
                    break;
                case 2:
                    this.f10070b = typedArrayObtainStyledAttributes.getFloat(index, this.f10070b);
                    break;
                case 3:
                    this.f10071c = typedArrayObtainStyledAttributes.getFloat(index, this.f10071c);
                    break;
                case 4:
                    this.f10072d = typedArrayObtainStyledAttributes.getFloat(index, this.f10072d);
                    break;
                case 5:
                    this.f10073e = typedArrayObtainStyledAttributes.getFloat(index, this.f10073e);
                    break;
                case 6:
                    this.f10074f = typedArrayObtainStyledAttributes.getDimension(index, this.f10074f);
                    break;
                case 7:
                    this.f10075g = typedArrayObtainStyledAttributes.getDimension(index, this.f10075g);
                    break;
                case 8:
                    this.f10077i = typedArrayObtainStyledAttributes.getDimension(index, this.f10077i);
                    break;
                case 9:
                    this.f10078j = typedArrayObtainStyledAttributes.getDimension(index, this.f10078j);
                    break;
                case 10:
                    this.f10079k = typedArrayObtainStyledAttributes.getDimension(index, this.f10079k);
                    break;
                case 11:
                    this.f10080l = true;
                    this.f10081m = typedArrayObtainStyledAttributes.getDimension(index, this.f10081m);
                    break;
                case 12:
                    this.f10076h = C2727n.m4798f(typedArrayObtainStyledAttributes, index, this.f10076h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
