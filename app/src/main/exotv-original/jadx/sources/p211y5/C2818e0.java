package p211y5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.exotv.net.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p034d5.AbstractC0847a;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.e0 */
/* loaded from: classes.dex */
public final class C2818e0 {

    /* renamed from: a */
    public int f10453a;

    /* renamed from: b */
    public C1629o f10454b;

    /* renamed from: c */
    public int[][] f10455c;

    /* renamed from: d */
    public C1629o[] f10456d;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4926a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC0847a.f3735D;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    C2816d0 c2816d0 = i == 5 ? new C2816d0(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics())) : i == 6 ? new C2816d0(1, typedValuePeekValue.getFraction(1.0f, 1.0f)) : null;
                    typedArrayObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i4 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i9 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i4] = attributeNameResource;
                            i4 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i4);
                    C1629o c1629o = new C1629o();
                    c1629o.f6229j = c2816d0;
                    int i10 = this.f10453a;
                    if (i10 == 0 || iArrTrimStateSet.length == 0) {
                        this.f10454b = c1629o;
                    }
                    int[][] iArr3 = this.f10455c;
                    if (i10 >= iArr3.length) {
                        int i11 = i10 + 10;
                        int[][] iArr4 = new int[i11][];
                        System.arraycopy(iArr3, 0, iArr4, 0, i10);
                        this.f10455c = iArr4;
                        C1629o[] c1629oArr = new C1629o[i11];
                        System.arraycopy(this.f10456d, 0, c1629oArr, 0, i10);
                        this.f10456d = c1629oArr;
                    }
                    int[][] iArr5 = this.f10455c;
                    int i12 = this.f10453a;
                    iArr5[i12] = iArrTrimStateSet;
                    this.f10456d[i12] = c1629o;
                    this.f10453a = i12 + 1;
                }
            }
        }
    }
}
