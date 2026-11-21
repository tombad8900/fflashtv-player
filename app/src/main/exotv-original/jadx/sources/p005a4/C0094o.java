package p005a4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParserException;
import p001a0.AbstractC0005a;
import p002a1.C0036o;
import p002a1.C0048u;
import p029d0.AbstractC0786b;
import p029d0.AbstractC0787c;
import p043e6.C0915c;
import p043e6.C0920h;
import p054g.AbstractC1026a;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1132w;
import p091k3.C1601a;
import p104m.AbstractC1714e1;
import p104m.C1711d2;
import p104m.C1770t;
import p105m0.AbstractC1828m0;
import p115n1.C1977h;
import p115n1.InterfaceC1979i;
import p115n1.InterfaceC1988o;
import p151r3.AbstractC2300l;
import p151r3.C2294f;
import p151r3.C2306r;
import p168t2.AbstractC2415i0;
import p169t3.C2433a;
import p177u3.InterfaceC2465e;
import p186v4.AbstractC2547c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.o */
/* loaded from: classes.dex */
public final class C0094o implements InterfaceC1979i, InterfaceC2465e {

    /* renamed from: j */
    public int f440j;

    /* renamed from: k */
    public final Object f441k;

    /* renamed from: l */
    public Object f442l;

    public C0094o(C2433a c2433a, AbstractC2300l abstractC2300l, int i) {
        this.f441k = c2433a;
        this.f442l = abstractC2300l;
        this.f440j = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r16 = (int[]) r0.f62k;
        r17 = (float[]) r0.f63l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f62k, (float[]) r0.f63l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0237, code lost:
    
        r20 = (int[]) r0.f62k;
        r21 = (float[]) r0.f63l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0268, code lost:
    
        return new p005a4.C0094o(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new p002a1.C0016e(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new p002a1.C0016e(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new p002a1.C0016e(r6, r12);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0094o m345d(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        float f8;
        int color;
        float f9;
        int i4;
        float f10;
        XmlResourceParser xml = resources.getXml(i);
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
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM1945b = AbstractC0787c.m1945b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0094o((Shader) null, colorStateListM1945b, colorStateListM1945b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM1936f = AbstractC0786b.m1936f(resources, theme, attributeSetAsAttributeSet, AbstractC0005a.f9d);
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM1936f.getFloat(8, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM1936f.getFloat(9, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM1936f.getFloat(10, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM1936f.getFloat(11, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM1936f.getFloat(3, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM1936f.getFloat(4, 0.0f) : 0.0f;
        int i8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM1936f.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM1936f.getColor(0, 0) : 0;
        boolean z7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM1936f.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f8 = f11;
            color = typedArrayM1936f.getColor(1, 0);
        } else {
            f8 = f11;
            color = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f9 = f12;
            i4 = typedArrayM1936f.getInt(6, 0);
        } else {
            f9 = f12;
            i4 = 0;
        }
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM1936f.getFloat(5, 0.0f) : 0.0f;
        typedArrayM1936f.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f18 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f19 = f13;
            if (next2 == 1) {
                f10 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f10 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM1936f2 = AbstractC0786b.m1936f(resources, theme, attributeSetAsAttributeSet, AbstractC0005a.f10e);
                boolean zHasValue = typedArrayM1936f2.hasValue(0);
                boolean zHasValue2 = typedArrayM1936f2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayM1936f2.getColor(0, 0);
                float f20 = typedArrayM1936f2.getFloat(1, 0.0f);
                typedArrayM1936f2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f20));
            }
            f13 = f19;
            f14 = f10;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    @Override // p177u3.InterfaceC2465e
    /* renamed from: a */
    public void mo346a() {
        C2433a c2433a = (C2433a) this.f441k;
        Drawable drawable = c2433a.f8786k.getDrawable();
        AbstractC2300l abstractC2300l = (AbstractC2300l) this.f442l;
        boolean z7 = abstractC2300l instanceof C2306r;
        C1601a c1601a = new C1601a(drawable, abstractC2300l.mo4094a(), abstractC2300l.mo4095b().f8050x, this.f440j, (z7 && ((C2306r) abstractC2300l).f8078g) ? false : true);
        if (z7) {
            c2433a.m4328d(c1601a);
        } else {
            if (!(abstractC2300l instanceof C2294f)) {
                throw new C0048u();
            }
            c2433a.m4328d(c1601a);
        }
    }

    /* renamed from: b */
    public void m347b() {
        C1711d2 c1711d2;
        ImageView imageView = (ImageView) this.f441k;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1714e1.m3392a(drawable);
        }
        if (drawable == null || (c1711d2 = (C1711d2) this.f442l) == null) {
            return;
        }
        C1770t.m3456e(drawable, c1711d2, imageView.getDrawableState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new p115n1.C1977h(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return p115n1.C1977h.f7334d;
     */
    @Override // p115n1.InterfaceC1979i
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1977h mo348c(InterfaceC1988o interfaceC1988o, long j) {
        long j8;
        long position = interfaceC1988o.getPosition();
        int iMin = (int) Math.min(112800, interfaceC1988o.getLength() - position);
        C1132w c1132w = (C1132w) this.f442l;
        c1132w.m2510D(iMin);
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, iMin);
        int i = c1132w.f4801c;
        long j9 = -1;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        while (true) {
            if (c1132w.m2515a() < 188) {
                j8 = -9223372036854775807L;
                break;
            }
            byte[] bArr = c1132w.f4799a;
            int i4 = c1132w.f4800b;
            while (true) {
                if (i4 >= i) {
                    j8 = -9223372036854775807L;
                    break;
                }
                j8 = -9223372036854775807L;
                if (bArr[i4] == 71) {
                    break;
                }
                i4++;
            }
            int i8 = i4 + 188;
            if (i8 > i) {
                break;
            }
            long jM4268y = AbstractC2415i0.m4268y(c1132w, i4, this.f440j);
            if (jM4268y != j8) {
                long jM2397b = ((C1108d0) this.f441k).m2397b(jM4268y);
                if (jM2397b > j) {
                    return j11 == j8 ? new C1977h(-1, jM2397b, position) : new C1977h(0, -9223372036854775807L, position + j10);
                }
                if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jM2397b > j) {
                    return new C1977h(0, -9223372036854775807L, position + i4);
                }
                j11 = jM2397b;
                j10 = i4;
            }
            c1132w.m2513G(i8);
            j9 = i8;
        }
    }

    /* renamed from: e */
    public boolean m349e() {
        ColorStateList colorStateList;
        return ((Shader) this.f441k) == null && (colorStateList = (ColorStateList) this.f442l) != null && colorStateList.isStateful();
    }

    /* renamed from: f */
    public void m350f(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f441k;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1026a.f4313f;
        C0073c c0073cM263F = C0073c.m263F(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        AbstractC1828m0.m3607l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0073cM263F.f325l, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0715d.m1542D(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1714e1.m3392a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0073cM263F.m298w(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1714e1.m3393b(typedArray.getInt(3, -1), null));
            }
            c0073cM263F.m275I();
        } catch (Throwable th) {
            c0073cM263F.m275I();
            throw th;
        }
    }

    /* renamed from: g */
    public List m351g(CharSequence charSequence) {
        charSequence.getClass();
        C0036o c0036o = (C0036o) this.f442l;
        c0036o.getClass();
        C0920h c0920h = new C0920h(c0036o, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c0920h.hasNext()) {
            arrayList.add((String) c0920h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p115n1.InterfaceC1979i
    /* renamed from: i */
    public void mo352i() {
        C1132w c1132w = (C1132w) this.f442l;
        byte[] bArr = AbstractC1118i0.f4755f;
        c1132w.getClass();
        c1132w.m2511E(bArr, bArr.length);
    }

    public C0094o(ImageView imageView) {
        this.f440j = 0;
        this.f441k = imageView;
    }

    public C0094o(Shader shader, ColorStateList colorStateList, int i) {
        this.f441k = shader;
        this.f442l = colorStateList;
        this.f440j = i;
    }

    public C0094o(int i, C1108d0 c1108d0) {
        this.f440j = i;
        this.f441k = c1108d0;
        this.f442l = new C1132w();
    }

    public C0094o(C0036o c0036o) {
        this.f442l = c0036o;
        this.f441k = C0915c.f3968j;
        this.f440j = Integer.MAX_VALUE;
    }

    public C0094o(UUID uuid, int i, byte[] bArr) {
        this.f441k = uuid;
        this.f440j = i;
        this.f442l = bArr;
    }

    public C0094o(C0095p c0095p) {
        this.f442l = AbstractC2547c.m4561a(150, new C0036o(3, this));
        this.f441k = c0095p;
    }
}
