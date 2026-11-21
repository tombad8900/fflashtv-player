package p193w2;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p056g1.C1029b;
import p056g1.C1032e;
import p056g1.C1034g;
import p056g1.C1035h;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p112m7.C1943s;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.l0 */
/* loaded from: classes.dex */
public final class C2624l0 extends FrameLayout implements InterfaceC2612f0 {

    /* renamed from: j */
    public final C2603b f9473j;

    /* renamed from: k */
    public final C2620j0 f9474k;

    /* renamed from: l */
    public List f9475l;

    /* renamed from: m */
    public C2605c f9476m;

    /* renamed from: n */
    public float f9477n;

    /* renamed from: o */
    public float f9478o;

    public C2624l0(Context context) {
        super(context, null);
        this.f9475l = Collections.EMPTY_LIST;
        this.f9476m = C2605c.f9365g;
        this.f9477n = 0.0533f;
        this.f9478o = 0.08f;
        C2603b c2603b = new C2603b(context, 0);
        this.f9473j = c2603b;
        C2620j0 c2620j0 = new C2620j0(context, null);
        this.f9474k = c2620j0;
        c2620j0.setBackgroundColor(0);
        addView(c2603b);
        addView(c2620j0);
    }

    @Override // p193w2.InterfaceC2612f0
    /* renamed from: a */
    public final void mo4685a(List list, C2605c c2605c, float f8, float f9) {
        this.f9476m = c2605c;
        this.f9477n = f8;
        this.f9478o = f9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1029b c1029b = (C1029b) list.get(i);
            if (c1029b.f4373d != null) {
                arrayList.add(c1029b);
            } else {
                arrayList2.add(c1029b);
            }
        }
        if (!this.f9475l.isEmpty() || !arrayList2.isEmpty()) {
            this.f9475l = arrayList2;
            m4700c();
        }
        this.f9473j.mo4685a(arrayList, c2605c, f8, f9);
        invalidate();
    }

    /* renamed from: b */
    public final String m4699b(int i, float f8) {
        float fM4258A = AbstractC2415i0.m4258A(i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f8);
        if (fM4258A == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM4258A / getContext().getResources().getDisplayMetrics().density)};
        int i4 = AbstractC1118i0.f4750a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4700c() {
        String strConcat;
        String str;
        String str2;
        int i;
        Layout.Alignment alignment;
        int i4;
        String str3;
        int i8;
        String str4;
        Object obj;
        String str5;
        CharSequence charSequence;
        String str6;
        String str7;
        float f8;
        String str8;
        String str9;
        String str10;
        C1943s c1943s;
        boolean z7;
        Object[] objArr;
        int i9;
        int i10;
        String str11;
        int i11;
        String strM17m;
        String str12;
        float f9;
        String str13;
        Layout.Alignment alignment2;
        String str14;
        StringBuilder sb = new StringBuilder();
        String strM4314s = AbstractC2429w.m4314s(this.f9476m.f9366a);
        int i12 = 0;
        String strM4699b = m4699b(0, this.f9477n);
        float f10 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        C2605c c2605c = this.f9476m;
        int i13 = c2605c.f9369d;
        int i14 = c2605c.f9370e;
        int i15 = 2;
        int i16 = 1;
        if (i13 == 1) {
            Object[] objArr2 = {AbstractC2429w.m4314s(i14)};
            int i17 = AbstractC1118i0.f4750a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i13 == 2) {
            String strM4314s2 = AbstractC2429w.m4314s(i14);
            int i18 = AbstractC1118i0.f4750a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM4314s2);
        } else if (i13 == 3) {
            String strM4314s3 = AbstractC2429w.m4314s(i14);
            int i19 = AbstractC1118i0.f4750a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM4314s3);
        } else if (i13 != 4) {
            strConcat = "unset";
        } else {
            String strM4314s4 = AbstractC2429w.m4314s(i14);
            int i20 = AbstractC1118i0.f4750a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM4314s4);
        }
        Object[] objArr3 = {strM4314s, strM4699b, fValueOf, strConcat};
        int i21 = AbstractC1118i0.f4750a;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map = new HashMap();
        String strM4314s5 = AbstractC2429w.m4314s(this.f9476m.f9367b);
        String str15 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(strM4314s5);
        String str16 = ";";
        sb2.append(";");
        map.put(".default_bg,.default_bg *", sb2.toString());
        int i22 = 0;
        while (i22 < this.f9475l.size()) {
            C1029b c1029b = (C1029b) this.f9475l.get(i22);
            float f11 = c1029b.f4377h;
            int i23 = c1029b.f4376g;
            int i24 = c1029b.f4385p;
            float f12 = f11 != -3.4028235E38f ? f11 * 100.0f : 50.0f;
            float f13 = f10;
            int i25 = c1029b.f4378i;
            int i26 = -100;
            int i27 = i25 != i16 ? i25 != i15 ? i12 : -100 : -50;
            float f14 = c1029b.f4374e;
            if (f14 == -3.4028235E38f) {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f9478o) * 100.0f));
            } else if (c1029b.f4375f != i16) {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf(f14 * 100.0f));
                i26 = i24 == i16 ? -(i23 != i16 ? i23 != 2 ? 0 : -100 : -50) : i23 != i16 ? i23 != 2 ? 0 : -100 : -50;
            } else {
                if (f14 >= 0.0f) {
                    str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f14 * f13));
                    i = 0;
                } else {
                    str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f14) - 1.0f) * f13));
                    i = i16;
                }
                i26 = 0;
                float f15 = c1029b.f4379j;
                String str17 = f15 == -3.4028235E38f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f15 * 100.0f)) : "fit-content";
                alignment = c1029b.f4371b;
                String str18 = "end";
                if (alignment != null) {
                    i8 = i16;
                    str3 = "center";
                    i4 = 2;
                } else {
                    int i28 = AbstractC2622k0.f9469a[alignment.ordinal()];
                    if (i28 != i16) {
                        i4 = 2;
                        str3 = i28 != 2 ? "center" : "end";
                    } else {
                        i4 = 2;
                        str3 = "start";
                    }
                    i8 = 1;
                }
                String str19 = i24 == i8 ? i24 != i4 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
                String strM4699b2 = m4699b(c1029b.f4383n, c1029b.f4384o);
                String strM4314s6 = AbstractC2429w.m4314s(!c1029b.f4381l ? c1029b.f4382m : this.f9476m.f9368c);
                String str20 = "right";
                int i29 = i;
                if (i24 != 1) {
                    if (i29 != 0) {
                    }
                    str4 = str20;
                    obj = "top";
                } else if (i24 != 2) {
                    str4 = i29 != 0 ? "bottom" : "top";
                    obj = "left";
                } else {
                    if (i29 == 0) {
                        str20 = "left";
                    }
                    str4 = str20;
                    obj = "top";
                }
                if (i24 != 2 || i24 == 1) {
                    str5 = "height";
                    int i30 = i26;
                    i26 = i27;
                    i27 = i30;
                } else {
                    str5 = "width";
                }
                String str21 = str5;
                charSequence = c1029b.f4370a;
                float f16 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = AbstractC2608d0.f9415a;
                int i31 = i27;
                int i32 = i22;
                if (charSequence != null) {
                    c1943s = new C1943s(C2181z.FRAGMENT_ENCODE_SET, 3);
                    str8 = str16;
                    str6 = C2181z.FRAGMENT_ENCODE_SET;
                } else {
                    str6 = C2181z.FRAGMENT_ENCODE_SET;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        HashSet hashSet = new HashSet();
                        str7 = "start";
                        f8 = f12;
                        BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        int length = backgroundColorSpanArr.length;
                        int i33 = 0;
                        while (i33 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i33].getBackgroundColor()));
                            i33++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        HashMap map2 = new HashMap();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM12h = AbstractC0008a1.m12h(iIntValue, "bg_");
                            Iterator it2 = it;
                            String str22 = "." + strM12h + ",." + strM12h + " *";
                            String strM4314s7 = AbstractC2429w.m4314s(iIntValue);
                            int i34 = AbstractC1118i0.f4750a;
                            Locale locale4 = Locale.US;
                            map2.put(str22, str15 + strM4314s7 + str16);
                            it = it2;
                        }
                        SparseArray sparseArray = new SparseArray();
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        int length2 = spans.length;
                        int i35 = 0;
                        while (i35 < length2) {
                            String str23 = str16;
                            Object obj2 = spans[i35];
                            String str24 = str15;
                            boolean z8 = obj2 instanceof StrikethroughSpan;
                            String str25 = null;
                            if (z8) {
                                z7 = z8;
                                strM17m = "<span style='text-decoration:line-through;'>";
                                objArr = spans;
                            } else {
                                z7 = z8;
                                if (obj2 instanceof ForegroundColorSpan) {
                                    String strM4314s8 = AbstractC2429w.m4314s(((ForegroundColorSpan) obj2).getForegroundColor());
                                    int i36 = AbstractC1118i0.f4750a;
                                    Locale locale5 = Locale.US;
                                    objArr = spans;
                                    strM17m = AbstractC0008a1.m17m("<span style='color:", strM4314s8, ";'>");
                                } else {
                                    objArr = spans;
                                    if (obj2 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj2).getBackgroundColor();
                                        int i37 = AbstractC1118i0.f4750a;
                                        Locale locale6 = Locale.US;
                                        i9 = length2;
                                        strM17m = AbstractC0008a1.m14j("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        i9 = length2;
                                        if (obj2 instanceof C1032e) {
                                            strM17m = "<span style='text-combine-upright:all;'>";
                                        } else if (obj2 instanceof AbsoluteSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj2).getDip() ? r7.getSize() : r7.getSize() / f16)};
                                            int i38 = AbstractC1118i0.f4750a;
                                            strM17m = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj2 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj2).getSizeChange() * 100.0f)};
                                            int i39 = AbstractC1118i0.f4750a;
                                            strM17m = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else {
                                            if (obj2 instanceof TypefaceSpan) {
                                                String family = ((TypefaceSpan) obj2).getFamily();
                                                if (family != null) {
                                                    int i40 = AbstractC1118i0.f4750a;
                                                    Locale locale7 = Locale.US;
                                                    strM17m = AbstractC0008a1.m17m("<span style='font-family:\"", family, "\";'>");
                                                }
                                                i10 = i35;
                                                str11 = str18;
                                                strM17m = null;
                                            } else if (obj2 instanceof StyleSpan) {
                                                int style = ((StyleSpan) obj2).getStyle();
                                                if (style == 1) {
                                                    strM17m = "<b>";
                                                } else if (style != 2) {
                                                    if (style == 3) {
                                                        strM17m = "<b><i>";
                                                    }
                                                    i10 = i35;
                                                    str11 = str18;
                                                    strM17m = null;
                                                } else {
                                                    strM17m = "<i>";
                                                }
                                            } else if (obj2 instanceof C1034g) {
                                                int i41 = ((C1034g) obj2).f4397b;
                                                if (i41 == -1) {
                                                    strM17m = "<ruby style='ruby-position:unset;'>";
                                                } else if (i41 != 1) {
                                                    if (i41 == 2) {
                                                        strM17m = "<ruby style='ruby-position:under;'>";
                                                    }
                                                    i10 = i35;
                                                    str11 = str18;
                                                    strM17m = null;
                                                } else {
                                                    strM17m = "<ruby style='ruby-position:over;'>";
                                                }
                                            } else if (obj2 instanceof UnderlineSpan) {
                                                strM17m = "<u>";
                                            } else if (obj2 instanceof C1035h) {
                                                C1035h c1035h = (C1035h) obj2;
                                                int i42 = c1035h.f4401a;
                                                int i43 = c1035h.f4402b;
                                                i10 = i35;
                                                StringBuilder sb3 = new StringBuilder();
                                                str11 = str18;
                                                if (i43 != 1) {
                                                    i11 = 2;
                                                    if (i43 == 2) {
                                                        sb3.append("open ");
                                                    }
                                                } else {
                                                    i11 = 2;
                                                    sb3.append("filled ");
                                                }
                                                if (i42 == 0) {
                                                    sb3.append("none");
                                                } else if (i42 == 1) {
                                                    sb3.append("circle");
                                                } else if (i42 == i11) {
                                                    sb3.append("dot");
                                                } else if (i42 != 3) {
                                                    sb3.append("unset");
                                                } else {
                                                    sb3.append("sesame");
                                                }
                                                Object[] objArr6 = {sb3.toString(), c1035h.f4403c != 2 ? "over right" : "under left"};
                                                int i44 = AbstractC1118i0.f4750a;
                                                strM17m = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                            } else {
                                                i10 = i35;
                                                str11 = str18;
                                                strM17m = null;
                                            }
                                            if (z7 || (obj2 instanceof ForegroundColorSpan) || (obj2 instanceof BackgroundColorSpan) || (obj2 instanceof C1032e) || (obj2 instanceof AbsoluteSizeSpan) || (obj2 instanceof RelativeSizeSpan) || (obj2 instanceof C1035h)) {
                                                str12 = "</span>";
                                            } else {
                                                if (obj2 instanceof TypefaceSpan) {
                                                    if (((TypefaceSpan) obj2).getFamily() != null) {
                                                    }
                                                } else if (obj2 instanceof StyleSpan) {
                                                    int style2 = ((StyleSpan) obj2).getStyle();
                                                    if (style2 == 1) {
                                                        str25 = "</b>";
                                                    } else if (style2 == 2) {
                                                        str25 = "</i>";
                                                    } else if (style2 == 3) {
                                                        str25 = "</i></b>";
                                                    }
                                                } else if (obj2 instanceof C1034g) {
                                                    str25 = "<rt>" + AbstractC2608d0.m4692a(((C1034g) obj2).f4396a) + "</rt></ruby>";
                                                } else if (obj2 instanceof UnderlineSpan) {
                                                    str25 = "</u>";
                                                }
                                                str12 = str25;
                                            }
                                            int spanStart = spanned.getSpanStart(obj2);
                                            int spanEnd = spanned.getSpanEnd(obj2);
                                            if (strM17m != null) {
                                                str12.getClass();
                                                C2604b0 c2604b0 = new C2604b0(spanStart, spanEnd, strM17m, str12);
                                                C2606c0 c2606c0 = (C2606c0) sparseArray.get(spanStart);
                                                if (c2606c0 == null) {
                                                    c2606c0 = new C2606c0();
                                                    sparseArray.put(spanStart, c2606c0);
                                                }
                                                c2606c0.f9372a.add(c2604b0);
                                                C2606c0 c2606c02 = (C2606c0) sparseArray.get(spanEnd);
                                                if (c2606c02 == null) {
                                                    c2606c02 = new C2606c0();
                                                    sparseArray.put(spanEnd, c2606c02);
                                                }
                                                c2606c02.f9373b.add(c2604b0);
                                            }
                                            i35 = i10 + 1;
                                            str16 = str23;
                                            str15 = str24;
                                            spans = objArr;
                                            length2 = i9;
                                            str18 = str11;
                                        }
                                    }
                                    i10 = i35;
                                    str11 = str18;
                                    if (z7) {
                                        str12 = "</span>";
                                    }
                                    int spanStart2 = spanned.getSpanStart(obj2);
                                    int spanEnd2 = spanned.getSpanEnd(obj2);
                                    if (strM17m != null) {
                                    }
                                    i35 = i10 + 1;
                                    str16 = str23;
                                    str15 = str24;
                                    spans = objArr;
                                    length2 = i9;
                                    str18 = str11;
                                }
                            }
                            i9 = length2;
                            i10 = i35;
                            str11 = str18;
                            if (z7) {
                            }
                            int spanStart22 = spanned.getSpanStart(obj2);
                            int spanEnd22 = spanned.getSpanEnd(obj2);
                            if (strM17m != null) {
                            }
                            i35 = i10 + 1;
                            str16 = str23;
                            str15 = str24;
                            spans = objArr;
                            length2 = i9;
                            str18 = str11;
                        }
                        str8 = str16;
                        str9 = str15;
                        str10 = str18;
                        StringBuilder sb4 = new StringBuilder(spanned.length());
                        int i45 = 0;
                        int i46 = 0;
                        while (i46 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i46);
                            sb4.append(AbstractC2608d0.m4692a(spanned.subSequence(i45, iKeyAt)));
                            C2606c0 c2606c03 = (C2606c0) sparseArray.get(iKeyAt);
                            ArrayList arrayList = c2606c03.f9373b;
                            ArrayList arrayList2 = c2606c03.f9372a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, C2604b0.f9360f);
                            ArrayList arrayList3 = c2606c03.f9373b;
                            int size = arrayList3.size();
                            int i47 = 0;
                            while (i47 < size) {
                                Object obj3 = arrayList3.get(i47);
                                i47++;
                                sb4.append(((C2604b0) obj3).f9364d);
                                arrayList3 = arrayList3;
                            }
                            Collections.sort(arrayList2, C2604b0.f9359e);
                            int size2 = arrayList2.size();
                            int i48 = 0;
                            while (i48 < size2) {
                                Object obj4 = arrayList2.get(i48);
                                i48++;
                                sb4.append(((C2604b0) obj4).f9363c);
                            }
                            i46++;
                            i45 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb4.append(AbstractC2608d0.m4692a(spanned.subSequence(i45, spanned.length())));
                        c1943s = new C1943s(sb4.toString(), 3);
                        for (String str26 : map.keySet()) {
                            String str27 = (String) map.put(str26, (String) map.get(str26));
                            AbstractC1101a.m2359j(str27 == null || str27.equals(map.get(str26)));
                        }
                        Integer numValueOf = Integer.valueOf(i32);
                        Float fValueOf2 = Float.valueOf(f8);
                        Integer numValueOf2 = Integer.valueOf(i31);
                        Integer numValueOf3 = Integer.valueOf(i26);
                        f9 = c1029b.f4386q;
                        if (f9 != 0.0f) {
                            Object[] objArr7 = {(i24 == 2 || i24 == 1) ? "skewY" : "skewX", Float.valueOf(f9)};
                            int i49 = AbstractC1118i0.f4750a;
                            str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                        } else {
                            str13 = str6;
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj, fValueOf2, str4, str2, str21, str17, str3, str19, strM4699b2, strM4314s6, numValueOf2, numValueOf3, str13));
                        sb.append("<span class='default_bg'>");
                        alignment2 = c1029b.f4372c;
                        String str28 = c1943s.f7233k;
                        if (alignment2 != null) {
                            int i50 = AbstractC2622k0.f9469a[alignment2.ordinal()];
                            if (i50 != 1) {
                                i15 = 2;
                                str14 = i50 != 2 ? "center" : str10;
                            } else {
                                i15 = 2;
                                str14 = str7;
                            }
                            sb.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                            sb.append(str28);
                            sb.append("</span>");
                        } else {
                            i15 = 2;
                            sb.append(str28);
                        }
                        sb.append("</span></div>");
                        i22 = i32 + 1;
                        f10 = f13;
                        str16 = str8;
                        str15 = str9;
                        i12 = 0;
                        i16 = 1;
                    } else {
                        str8 = str16;
                        c1943s = new C1943s(AbstractC2608d0.m4692a(charSequence), 3);
                    }
                }
                str9 = str15;
                str7 = "start";
                f8 = f12;
                str10 = "end";
                while (r3.hasNext()) {
                }
                Integer numValueOf4 = Integer.valueOf(i32);
                Float fValueOf22 = Float.valueOf(f8);
                Integer numValueOf22 = Integer.valueOf(i31);
                Integer numValueOf32 = Integer.valueOf(i26);
                f9 = c1029b.f4386q;
                if (f9 != 0.0f) {
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj, fValueOf22, str4, str2, str21, str17, str3, str19, strM4699b2, strM4314s6, numValueOf22, numValueOf32, str13));
                sb.append("<span class='default_bg'>");
                alignment2 = c1029b.f4372c;
                String str282 = c1943s.f7233k;
                if (alignment2 != null) {
                }
                sb.append("</span></div>");
                i22 = i32 + 1;
                f10 = f13;
                str16 = str8;
                str15 = str9;
                i12 = 0;
                i16 = 1;
            }
            str2 = str;
            i = 0;
            float f152 = c1029b.f4379j;
            String str172 = f152 == -3.4028235E38f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f152 * 100.0f)) : "fit-content";
            alignment = c1029b.f4371b;
            String str182 = "end";
            if (alignment != null) {
            }
            String str192 = i24 == i8 ? i24 != i4 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String strM4699b22 = m4699b(c1029b.f4383n, c1029b.f4384o);
            String strM4314s62 = AbstractC2429w.m4314s(!c1029b.f4381l ? c1029b.f4382m : this.f9476m.f9368c);
            String str202 = "right";
            int i292 = i;
            if (i24 != 1) {
            }
            if (i24 != 2) {
                str5 = "height";
                int i302 = i26;
                i26 = i27;
                i27 = i302;
            }
            String str212 = str5;
            charSequence = c1029b.f4370a;
            float f162 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC2608d0.f9415a;
            int i312 = i27;
            int i322 = i22;
            if (charSequence != null) {
            }
            str9 = str15;
            str7 = "start";
            f8 = f12;
            str10 = "end";
            while (r3.hasNext()) {
            }
            Integer numValueOf42 = Integer.valueOf(i322);
            Float fValueOf222 = Float.valueOf(f8);
            Integer numValueOf222 = Integer.valueOf(i312);
            Integer numValueOf322 = Integer.valueOf(i26);
            f9 = c1029b.f4386q;
            if (f9 != 0.0f) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf42, obj, fValueOf222, str4, str2, str212, str172, str3, str192, strM4699b22, strM4314s62, numValueOf222, numValueOf322, str13));
            sb.append("<span class='default_bg'>");
            alignment2 = c1029b.f4372c;
            String str2822 = c1943s.f7233k;
            if (alignment2 != null) {
            }
            sb.append("</span></div>");
            i22 = i322 + 1;
            f10 = f13;
            str16 = str8;
            str15 = str9;
            i12 = 0;
            i16 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str29 : map.keySet()) {
            sb5.append(str29);
            sb5.append("{");
            sb5.append((String) map.get(str29));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, sb5.toString());
        this.f9474k.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        if (!z7 || this.f9475l.isEmpty()) {
            return;
        }
        m4700c();
    }
}
