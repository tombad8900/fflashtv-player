package p168t2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0120b;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.AbstractC0715d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002a1.C0022h;
import p017b6.AbstractC0622v;
import p056g1.C1028a;
import p063h1.C1132w;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1214p;
import p077j$.util.Base64;
import p111m6.AbstractC1913h;
import p111m6.C1921p;
import p111m6.C1922q;
import p160s3.C2357h;
import p160s3.EnumC2356g;
import p183v0.AbstractC2506f;
import p185v3.AbstractC2536f;
import p211y5.InterfaceC2839z;
import p216z2.AbstractC2888f0;
import p216z2.C2912r0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC2415i0 {
    /* renamed from: A */
    public static float m4258A(int i, int i4, int i8, float f8) {
        float f9;
        if (f8 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f9 = i8;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f8;
            }
            f9 = i4;
        }
        return f8 * f9;
    }

    /* renamed from: F */
    public static final List m4259F(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(AbstractC1913h.m3736A0(arrayList)) : C1921p.f7187j;
    }

    /* renamed from: G */
    public static final Map m4260G(Map map) {
        int size = map.size();
        if (size == 0) {
            return C1922q.f7188j;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC1913h.m3751z0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* renamed from: I */
    public static byte[] m4261I(byte[] bArr) {
        byte[] bytes = "Fwph96bT8hY8OQyZKUfxHA".getBytes(AbstractC1199a.f5077a);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bytes[i % bytes.length]);
        }
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m4262a(String str) {
        AbstractC2980h.m5136e("encoded", str);
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                if (cCharAt == '-') {
                    sb.append('+');
                } else if (cCharAt != '_') {
                    sb.append(cCharAt);
                } else {
                    sb.append('/');
                }
            }
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        int length2 = string.length() % 4;
        if (length2 == 1) {
            throw new IllegalArgumentException("bad base64 length");
        }
        if (length2 != 0) {
            string = string.concat(AbstractC1214p.m2663p0(4 - length2));
        }
        byte[] bArrDecode = Base64.getDecoder().decode(string);
        AbstractC2980h.m5135d("decode(...)", bArrDecode);
        return bArrDecode;
    }

    /* renamed from: d */
    public static int m4263d(C2912r0 c2912r0, AbstractC2506f abstractC2506f, View view, View view2, AbstractC2888f0 abstractC2888f0, boolean z7) {
        if (abstractC2888f0.m5010v() == 0 || c2912r0.m5052b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return Math.abs(AbstractC2888f0.m4983H(view) - AbstractC2888f0.m4983H(view2)) + 1;
        }
        return Math.min(abstractC2506f.mo4517l(), abstractC2506f.mo4507b(view2) - abstractC2506f.mo4510e(view));
    }

    /* renamed from: e */
    public static int m4264e(C2912r0 c2912r0, AbstractC2506f abstractC2506f, View view, View view2, AbstractC2888f0 abstractC2888f0, boolean z7, boolean z8) {
        if (abstractC2888f0.m5010v() == 0 || c2912r0.m5052b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z8 ? Math.max(0, (c2912r0.m5052b() - Math.max(AbstractC2888f0.m4983H(view), AbstractC2888f0.m4983H(view2))) - 1) : Math.max(0, Math.min(AbstractC2888f0.m4983H(view), AbstractC2888f0.m4983H(view2)));
        if (z7) {
            return Math.round((iMax * (Math.abs(abstractC2506f.mo4507b(view2) - abstractC2506f.mo4510e(view)) / (Math.abs(AbstractC2888f0.m4983H(view) - AbstractC2888f0.m4983H(view2)) + 1))) + (abstractC2506f.mo4516k() - abstractC2506f.mo4510e(view)));
        }
        return iMax;
    }

    /* renamed from: f */
    public static int m4265f(C2912r0 c2912r0, AbstractC2506f abstractC2506f, View view, View view2, AbstractC2888f0 abstractC2888f0, boolean z7) {
        if (abstractC2888f0.m5010v() == 0 || c2912r0.m5052b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return c2912r0.m5052b();
        }
        return (int) (((abstractC2506f.mo4507b(view2) - abstractC2506f.mo4510e(view)) / (Math.abs(AbstractC2888f0.m4983H(view) - AbstractC2888f0.m4983H(view2)) + 1)) * c2912r0.m5052b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (android.support.v4.media.session.AbstractC0120b.m418n(r9, r1, p220z6.AbstractC2980h.m5132a(r7, r2) ? r0.getWidth() : p185v3.AbstractC2536f.m4558e(r7.f8270a, r8), p220z6.AbstractC2980h.m5132a(r7, r2) ? r0.getHeight() : p185v3.AbstractC2536f.m4558e(r7.f8271b, r8), r8) == 1.0d) goto L24;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m4266g(Drawable drawable, Bitmap.Config config, C2357h c2357h, EnumC2356g enumC2356g, boolean z7) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || AbstractC0622v.m1396h(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z7) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    C2357h c2357h2 = C2357h.f8269c;
                }
                return bitmap3;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
        boolean z8 = drawableMutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z8 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z8 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
        int i = intrinsicHeight > 0 ? intrinsicHeight : 512;
        C2357h c2357h3 = C2357h.f8269c;
        double dM418n = AbstractC0120b.m418n(intrinsicWidth, i, AbstractC2980h.m5132a(c2357h, c2357h3) ? intrinsicWidth : AbstractC2536f.m4558e(c2357h.f8270a, enumC2356g), AbstractC2980h.m5132a(c2357h, c2357h3) ? i : AbstractC2536f.m4558e(c2357h.f8271b, enumC2356g), enumC2356g);
        int iM1558e0 = AbstractC0715d.m1558e0(intrinsicWidth * dM418n);
        int iM1558e02 = AbstractC0715d.m1558e0(dM418n * i);
        if (config == null || AbstractC0622v.m1396h(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM1558e0, iM1558e02, config);
        Rect bounds = drawableMutate.getBounds();
        int i4 = bounds.left;
        int i8 = bounds.top;
        int i9 = bounds.right;
        int i10 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM1558e0, iM1558e02);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i4, i8, i9, i10);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static long[] m4267h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* renamed from: y */
    public static long m4268y(C1132w c1132w, int i, int i4) {
        c1132w.m2513G(i);
        if (c1132w.m2515a() < 5) {
            return -9223372036854775807L;
        }
        int iM2521g = c1132w.m2521g();
        if ((8388608 & iM2521g) != 0 || ((2096896 & iM2521g) >> 8) != i4 || (iM2521g & 32) == 0 || c1132w.m2535u() < 7 || c1132w.m2515a() < 7 || (c1132w.m2535u() & 16) != 16) {
            return -9223372036854775807L;
        }
        c1132w.m2519e(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    /* renamed from: z */
    public static void m4269z(C1028a c1028a) {
        c1028a.f4344k = -3.4028235E38f;
        c1028a.f4343j = Integer.MIN_VALUE;
        CharSequence charSequence = c1028a.f4334a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c1028a.f4334a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c1028a.f4334a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* renamed from: B */
    public abstract void mo4270B(boolean z7);

    /* renamed from: C */
    public abstract void mo4271C(boolean z7);

    /* renamed from: D */
    public abstract void mo3180D(InterfaceC2839z interfaceC2839z, float f8);

    /* renamed from: E */
    public abstract boolean mo4272E(View view, float f8);

    /* renamed from: H */
    public abstract void mo4273H(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4);

    /* renamed from: b */
    public abstract int mo4274b(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: c */
    public abstract float mo4275c(int i);

    /* renamed from: i */
    public abstract int mo4276i();

    /* renamed from: j */
    public abstract InputFilter[] mo4277j(InputFilter[] inputFilterArr);

    /* renamed from: k */
    public abstract int mo4278k();

    /* renamed from: l */
    public abstract int mo4279l();

    /* renamed from: m */
    public abstract int mo4280m();

    /* renamed from: n */
    public abstract int mo4281n(View view);

    /* renamed from: o */
    public abstract int mo4282o(CoordinatorLayout coordinatorLayout);

    /* renamed from: p */
    public abstract int mo4283p();

    /* renamed from: q */
    public abstract float mo3181q(InterfaceC2839z interfaceC2839z);

    /* renamed from: r */
    public abstract boolean mo4284r(float f8);

    /* renamed from: s */
    public abstract boolean mo4285s(View view);

    /* renamed from: t */
    public abstract boolean mo4286t(float f8, float f9);

    /* renamed from: u */
    public abstract void mo4287u(Throwable th);

    /* renamed from: v */
    public abstract void mo3675v(int i);

    /* renamed from: w */
    public abstract void mo3676w(Typeface typeface, boolean z7);

    /* renamed from: x */
    public abstract void mo4288x(C0022h c0022h);
}
