package p199x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p165t.AbstractC2386a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.k */
/* loaded from: classes.dex */
public final class C2724k {

    /* renamed from: j */
    public static final SparseIntArray f10054j;

    /* renamed from: a */
    public int f10055a;

    /* renamed from: b */
    public int f10056b;

    /* renamed from: c */
    public int f10057c;

    /* renamed from: d */
    public float f10058d;

    /* renamed from: e */
    public float f10059e;

    /* renamed from: f */
    public float f10060f;

    /* renamed from: g */
    public int f10061g;

    /* renamed from: h */
    public String f10062h;

    /* renamed from: i */
    public int f10063i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10054j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: a */
    public final void m4793a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2730q.f10093f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f10054j.get(index)) {
                case 1:
                    this.f10059e = typedArrayObtainStyledAttributes.getFloat(index, this.f10059e);
                    break;
                case 2:
                    this.f10057c = typedArrayObtainStyledAttributes.getInt(index, this.f10057c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC2386a.f8375a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f10055a = C2727n.m4798f(typedArrayObtainStyledAttributes, index, this.f10055a);
                    break;
                case 6:
                    this.f10056b = typedArrayObtainStyledAttributes.getInteger(index, this.f10056b);
                    break;
                case 7:
                    this.f10058d = typedArrayObtainStyledAttributes.getFloat(index, this.f10058d);
                    break;
                case 8:
                    this.f10061g = typedArrayObtainStyledAttributes.getInteger(index, this.f10061g);
                    break;
                case 9:
                    this.f10060f = typedArrayObtainStyledAttributes.getFloat(index, this.f10060f);
                    break;
                case 10:
                    int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i4 == 1) {
                        this.f10063i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i4 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f10062h = string;
                        if (string.indexOf("/") > 0) {
                            this.f10063i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f10063i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
