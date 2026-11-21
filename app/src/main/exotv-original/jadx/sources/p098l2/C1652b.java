package p098l2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p056g1.C1029b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l2.b */
/* loaded from: classes.dex */
public final class C1652b {

    /* renamed from: a */
    public final ArrayList f6291a;

    /* renamed from: b */
    public final ArrayList f6292b;

    /* renamed from: c */
    public final StringBuilder f6293c;

    /* renamed from: d */
    public int f6294d;

    /* renamed from: e */
    public int f6295e;

    /* renamed from: f */
    public int f6296f;

    /* renamed from: g */
    public int f6297g;

    /* renamed from: h */
    public int f6298h;

    public C1652b(int i, int i4) {
        ArrayList arrayList = new ArrayList();
        this.f6291a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6292b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f6293c = sb;
        this.f6297g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f6294d = 15;
        this.f6295e = 0;
        this.f6296f = 0;
        this.f6298h = i4;
    }

    /* renamed from: a */
    public final void m3344a(char c8) {
        StringBuilder sb = this.f6293c;
        if (sb.length() < 32) {
            sb.append(c8);
        }
    }

    /* renamed from: b */
    public final void m3345b() {
        StringBuilder sb = this.f6293c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f6291a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1651a c1651a = (C1651a) arrayList.get(size);
                int i = c1651a.f6290c;
                if (i != length) {
                    return;
                }
                c1651a.f6290c = i - 1;
            }
        }
    }

    /* renamed from: c */
    public final C1029b m3346c(int i) {
        float f8;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f6292b;
            if (i4 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i4));
            spannableStringBuilder.append('\n');
            i4++;
        }
        spannableStringBuilder.append((CharSequence) m3347d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i8 = this.f6295e + this.f6296f;
        int length = (32 - i8) - spannableStringBuilder.length();
        int i9 = i8 - length;
        int i10 = i != Integer.MIN_VALUE ? i : (this.f6297g != 2 || (Math.abs(i9) >= 3 && length >= 0)) ? (this.f6297g != 2 || i9 <= 0) ? 0 : 2 : 1;
        if (i10 != 1) {
            if (i10 == 2) {
                i8 = 32 - length;
            }
            f8 = ((i8 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f8 = 0.5f;
        }
        float f9 = f8;
        int i11 = this.f6294d;
        if (i11 > 7) {
            i11 -= 17;
        } else if (this.f6297g == 1) {
            i11 -= this.f6298h - 1;
        }
        return new C1029b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i11, 1, Integer.MIN_VALUE, f9, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* renamed from: d */
    public final SpannableString m3347d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6293c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i4 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.f6291a;
            if (i10 >= arrayList.size()) {
                break;
            }
            C1651a c1651a = (C1651a) arrayList.get(i10);
            boolean z8 = c1651a.f6289b;
            int i12 = c1651a.f6288a;
            if (i12 != 8) {
                boolean z9 = i12 == 7;
                if (i12 != 7) {
                    i9 = C1653c.f6300B[i12];
                }
                z7 = z9;
            }
            int i13 = c1651a.f6290c;
            i10++;
            if (i13 != (i10 < arrayList.size() ? ((C1651a) arrayList.get(i10)).f6290c : length)) {
                if (i != -1 && !z8) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i13, 33);
                    i = -1;
                } else if (i == -1 && z8) {
                    i = i13;
                }
                if (i4 != -1 && !z7) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i4, i13, 33);
                    i4 = -1;
                } else if (i4 == -1 && z7) {
                    i4 = i13;
                }
                if (i9 != i8) {
                    if (i8 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i11, i13, 33);
                    }
                    i8 = i9;
                    i11 = i13;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i4 != -1 && i4 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
        }
        if (i11 != length && i8 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i11, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: e */
    public final boolean m3348e() {
        return this.f6291a.isEmpty() && this.f6292b.isEmpty() && this.f6293c.length() == 0;
    }
}
