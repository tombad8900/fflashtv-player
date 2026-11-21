package p098l2;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l2.e */
/* loaded from: classes.dex */
public final class C1655e {

    /* renamed from: A */
    public static final boolean[] f6328A;

    /* renamed from: B */
    public static final int[] f6329B;

    /* renamed from: C */
    public static final int[] f6330C;

    /* renamed from: D */
    public static final int[] f6331D;

    /* renamed from: E */
    public static final int[] f6332E;

    /* renamed from: v */
    public static final int f6333v = m3356c(2, 2, 2, 0);

    /* renamed from: w */
    public static final int f6334w;

    /* renamed from: x */
    public static final int[] f6335x;

    /* renamed from: y */
    public static final int[] f6336y;

    /* renamed from: z */
    public static final int[] f6337z;

    /* renamed from: a */
    public final ArrayList f6338a = new ArrayList();

    /* renamed from: b */
    public final SpannableStringBuilder f6339b = new SpannableStringBuilder();

    /* renamed from: c */
    public boolean f6340c;

    /* renamed from: d */
    public boolean f6341d;

    /* renamed from: e */
    public int f6342e;

    /* renamed from: f */
    public boolean f6343f;

    /* renamed from: g */
    public int f6344g;

    /* renamed from: h */
    public int f6345h;

    /* renamed from: i */
    public int f6346i;

    /* renamed from: j */
    public int f6347j;

    /* renamed from: k */
    public int f6348k;

    /* renamed from: l */
    public int f6349l;

    /* renamed from: m */
    public int f6350m;

    /* renamed from: n */
    public int f6351n;

    /* renamed from: o */
    public int f6352o;

    /* renamed from: p */
    public int f6353p;

    /* renamed from: q */
    public int f6354q;

    /* renamed from: r */
    public int f6355r;

    /* renamed from: s */
    public int f6356s;

    /* renamed from: t */
    public int f6357t;

    /* renamed from: u */
    public int f6358u;

    static {
        int iM3356c = m3356c(0, 0, 0, 0);
        f6334w = iM3356c;
        int iM3356c2 = m3356c(0, 0, 0, 3);
        f6335x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f6336y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f6337z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f6328A = new boolean[]{false, false, false, true, true, true, false};
        f6329B = new int[]{iM3356c, iM3356c2, iM3356c, iM3356c, iM3356c2, iM3356c, iM3356c};
        f6330C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f6331D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f6332E = new int[]{iM3356c, iM3356c, iM3356c, iM3356c, iM3356c, iM3356c2, iM3356c2};
    }

    public C1655e() {
        m3359d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m3356c(int i, int i4, int i8, int i9) {
        int i10;
        AbstractC1101a.m2356g(i, 4);
        AbstractC1101a.m2356g(i4, 4);
        AbstractC1101a.m2356g(i8, 4);
        AbstractC1101a.m2356g(i9, 4);
        if (i9 == 0 || i9 == 1) {
            i10 = 255;
        } else if (i9 == 2) {
            i10 = 127;
        } else if (i9 == 3) {
            i10 = 0;
        }
        return Color.argb(i10, i > 1 ? 255 : 0, i4 > 1 ? 255 : 0, i8 <= 1 ? 0 : 255);
    }

    /* renamed from: a */
    public final void m3357a(char c8) {
        SpannableStringBuilder spannableStringBuilder = this.f6339b;
        if (c8 != '\n') {
            spannableStringBuilder.append(c8);
            return;
        }
        SpannableString spannableStringM3358b = m3358b();
        ArrayList arrayList = this.f6338a;
        arrayList.add(spannableStringM3358b);
        spannableStringBuilder.clear();
        if (this.f6352o != -1) {
            this.f6352o = 0;
        }
        if (this.f6353p != -1) {
            this.f6353p = 0;
        }
        if (this.f6354q != -1) {
            this.f6354q = 0;
        }
        if (this.f6356s != -1) {
            this.f6356s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f6347j && arrayList.size() < 15) {
                this.f6358u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* renamed from: b */
    public final SpannableString m3358b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6339b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f6352o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f6352o, length, 33);
            }
            if (this.f6353p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f6353p, length, 33);
            }
            if (this.f6354q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6355r), this.f6354q, length, 33);
            }
            if (this.f6356s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f6357t), this.f6356s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: d */
    public final void m3359d() {
        this.f6338a.clear();
        this.f6339b.clear();
        this.f6352o = -1;
        this.f6353p = -1;
        this.f6354q = -1;
        this.f6356s = -1;
        this.f6358u = 0;
        this.f6340c = false;
        this.f6341d = false;
        this.f6342e = 4;
        this.f6343f = false;
        this.f6344g = 0;
        this.f6345h = 0;
        this.f6346i = 0;
        this.f6347j = 15;
        this.f6348k = 0;
        this.f6349l = 0;
        this.f6350m = 0;
        int i = f6334w;
        this.f6351n = i;
        this.f6355r = f6333v;
        this.f6357t = i;
    }

    /* renamed from: e */
    public final void m3360e(boolean z7, boolean z8) {
        int i = this.f6352o;
        SpannableStringBuilder spannableStringBuilder = this.f6339b;
        if (i != -1) {
            if (!z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f6352o, spannableStringBuilder.length(), 33);
                this.f6352o = -1;
            }
        } else if (z7) {
            this.f6352o = spannableStringBuilder.length();
        }
        if (this.f6353p == -1) {
            if (z8) {
                this.f6353p = spannableStringBuilder.length();
            }
        } else {
            if (z8) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f6353p, spannableStringBuilder.length(), 33);
            this.f6353p = -1;
        }
    }

    /* renamed from: f */
    public final void m3361f(int i, int i4) {
        int i8 = this.f6354q;
        SpannableStringBuilder spannableStringBuilder = this.f6339b;
        if (i8 != -1 && this.f6355r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6355r), this.f6354q, spannableStringBuilder.length(), 33);
        }
        if (i != f6333v) {
            this.f6354q = spannableStringBuilder.length();
            this.f6355r = i;
        }
        if (this.f6356s != -1 && this.f6357t != i4) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f6357t), this.f6356s, spannableStringBuilder.length(), 33);
        }
        if (i4 != f6334w) {
            this.f6356s = spannableStringBuilder.length();
            this.f6357t = i4;
        }
    }
}
