package p211y5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.exotv.net.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p034d5.AbstractC0847a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.a0 */
/* loaded from: classes.dex */
public final class C2810a0 {

    /* renamed from: a */
    public int f10428a;

    /* renamed from: b */
    public InterfaceC2815d f10429b;

    /* renamed from: c */
    public int[][] f10430c = new int[10][];

    /* renamed from: d */
    public InterfaceC2815d[] f10431d = new InterfaceC2815d[10];

    /* renamed from: b */
    public static C2810a0 m4910b(InterfaceC2815d interfaceC2815d) {
        C2810a0 c2810a0 = new C2810a0();
        c2810a0.m4911a(StateSet.WILD_CARD, interfaceC2815d);
        return c2810a0;
    }

    /* renamed from: a */
    public final void m4911a(int[] iArr, InterfaceC2815d interfaceC2815d) {
        int i = this.f10428a;
        if (i == 0 || iArr.length == 0) {
            this.f10429b = interfaceC2815d;
        }
        int[][] iArr2 = this.f10430c;
        if (i >= iArr2.length) {
            int i4 = i + 10;
            int[][] iArr3 = new int[i4][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f10430c = iArr3;
            InterfaceC2815d[] interfaceC2815dArr = new InterfaceC2815d[i4];
            System.arraycopy(this.f10431d, 0, interfaceC2815dArr, 0, i);
            this.f10431d = interfaceC2815dArr;
        }
        int[][] iArr4 = this.f10430c;
        int i8 = this.f10428a;
        iArr4[i8] = iArr;
        this.f10431d[i8] = interfaceC2815d;
        this.f10428a = i8 + 1;
    }

    /* renamed from: c */
    public final InterfaceC2815d m4912c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f10430c;
        int i4 = 0;
        int i8 = 0;
        while (true) {
            i = -1;
            if (i8 >= this.f10428a) {
                i8 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                break;
            }
            i8++;
        }
        if (i8 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f10430c;
            while (true) {
                if (i4 >= this.f10428a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i4], iArr3)) {
                    i = i4;
                    break;
                }
                i4++;
            }
            i8 = i;
        }
        return i8 < 0 ? this.f10429b : this.f10431d[i8];
    }

    /* renamed from: d */
    public final void m4913d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC0847a.f3732A;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                InterfaceC2815d interfaceC2815dM4954h = C2828o.m4954h(typedArrayObtainAttributes, 5, new C2809a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i8 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i8;
                    }
                }
                m4911a(StateSet.trimStateSet(iArr2, i), interfaceC2815dM4954h);
            }
        }
    }
}
