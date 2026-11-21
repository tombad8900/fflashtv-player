package p211y5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.exotv.net.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p034d5.AbstractC0847a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.c0 */
/* loaded from: classes.dex */
public final class C2814c0 implements InterfaceC2826m {

    /* renamed from: a */
    public final int f10443a;

    /* renamed from: b */
    public final C2828o f10444b;

    /* renamed from: c */
    public final int[][] f10445c;

    /* renamed from: d */
    public final C2828o[] f10446d;

    /* renamed from: e */
    public final C2810a0 f10447e;

    /* renamed from: f */
    public final C2810a0 f10448f;

    /* renamed from: g */
    public final C2810a0 f10449g;

    /* renamed from: h */
    public final C2810a0 f10450h;

    public C2814c0(C2812b0 c2812b0) {
        this.f10443a = c2812b0.f10434a;
        this.f10444b = c2812b0.f10435b;
        this.f10445c = c2812b0.f10436c;
        this.f10446d = c2812b0.f10437d;
        this.f10447e = c2812b0.f10438e;
        this.f10448f = c2812b0.f10439f;
        this.f10449g = c2812b0.f10440g;
        this.f10450h = c2812b0.f10441h;
    }

    /* renamed from: f */
    public static void m4917f(C2812b0 c2812b0, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC0847a.f3758t;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                C2809a c2809a = new C2809a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                C2828o c2828oM4951a = C2828o.m4953g(contextThemeWrapper.obtainStyledAttributes(AbstractC0847a.f3732A), c2809a).m4951a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i8 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i8;
                    }
                }
                c2812b0.m4914a(StateSet.trimStateSet(iArr2, i), c2828oM4951a);
            }
        }
    }

    /* renamed from: g */
    public static C2814c0 m4918g(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        C2812b0 c2812b0 = new C2812b0();
        c2812b0.m4916c();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            c2812b0.m4916c();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                m4917f(c2812b0, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return c2812b0.m4915b();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: a */
    public final C2828o mo4919a(float f8) {
        return m4924h().mo4919a(f8);
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: b */
    public final C2828o mo4920b(int[] iArr) {
        int i;
        int i4;
        int[][] iArr2;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = -1;
            i4 = this.f10443a;
            iArr2 = this.f10445c;
            if (i9 >= i4) {
                i9 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i9], iArr)) {
                break;
            }
            i9++;
        }
        if (i9 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i8 >= i4) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i8], iArr3)) {
                    i = i8;
                    break;
                }
                i8++;
            }
            i9 = i;
        }
        C2828o[] c2828oArr = this.f10446d;
        C2810a0 c2810a0 = this.f10450h;
        C2810a0 c2810a02 = this.f10449g;
        C2810a0 c2810a03 = this.f10448f;
        C2810a0 c2810a04 = this.f10447e;
        if (c2810a04 == null && c2810a03 == null && c2810a02 == null && c2810a0 == null) {
            return c2828oArr[i9];
        }
        C2827n c2827nM4956j = c2828oArr[i9].m4956j();
        if (c2810a04 != null) {
            c2827nM4956j.f10513e = c2810a04.m4912c(iArr);
        }
        if (c2810a03 != null) {
            c2827nM4956j.f10514f = c2810a03.m4912c(iArr);
        }
        if (c2810a02 != null) {
            c2827nM4956j.f10516h = c2810a02.m4912c(iArr);
        }
        if (c2810a0 != null) {
            c2827nM4956j.f10515g = c2810a0.m4912c(iArr);
        }
        return c2827nM4956j.m4951a();
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: c */
    public final C2828o mo4921c(C2824k c2824k) {
        return m4924h().mo4921c(c2824k);
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: d */
    public final C2828o mo4922d() {
        return m4924h();
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: e */
    public final boolean mo4923e() {
        C2810a0 c2810a0;
        C2810a0 c2810a02;
        C2810a0 c2810a03;
        C2810a0 c2810a04;
        return this.f10443a > 1 || ((c2810a0 = this.f10447e) != null && c2810a0.f10428a > 1) || (((c2810a02 = this.f10448f) != null && c2810a02.f10428a > 1) || (((c2810a03 = this.f10449g) != null && c2810a03.f10428a > 1) || ((c2810a04 = this.f10450h) != null && c2810a04.f10428a > 1)));
    }

    /* renamed from: h */
    public final C2828o m4924h() {
        C2828o c2828o = this.f10444b;
        C2810a0 c2810a0 = this.f10450h;
        C2810a0 c2810a02 = this.f10449g;
        C2810a0 c2810a03 = this.f10448f;
        C2810a0 c2810a04 = this.f10447e;
        if (c2810a04 == null && c2810a03 == null && c2810a02 == null && c2810a0 == null) {
            return c2828o;
        }
        C2827n c2827nM4956j = c2828o.m4956j();
        if (c2810a04 != null) {
            c2827nM4956j.f10513e = c2810a04.f10429b;
        }
        if (c2810a03 != null) {
            c2827nM4956j.f10514f = c2810a03.f10429b;
        }
        if (c2810a02 != null) {
            c2827nM4956j.f10516h = c2810a02.f10429b;
        }
        if (c2810a0 != null) {
            c2827nM4956j.f10515g = c2810a0.f10429b;
        }
        return c2827nM4956j.m4951a();
    }

    /* renamed from: i */
    public final C2812b0 m4925i() {
        C2812b0 c2812b0 = new C2812b0();
        int i = this.f10443a;
        c2812b0.f10434a = i;
        c2812b0.f10435b = this.f10444b;
        int[][] iArr = this.f10445c;
        int[][] iArr2 = new int[iArr.length][];
        c2812b0.f10436c = iArr2;
        C2828o[] c2828oArr = this.f10446d;
        c2812b0.f10437d = new C2828o[c2828oArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(c2828oArr, 0, c2812b0.f10437d, 0, c2812b0.f10434a);
        c2812b0.f10438e = this.f10447e;
        c2812b0.f10439f = this.f10448f;
        c2812b0.f10440g = this.f10449g;
        c2812b0.f10441h = this.f10450h;
        return c2812b0;
    }
}
