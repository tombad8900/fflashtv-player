package p193w2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p056g1.C1028a;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.b */
/* loaded from: classes.dex */
public final class C2603b extends View implements InterfaceC2612f0 {

    /* renamed from: j */
    public final ArrayList f9354j;

    /* renamed from: k */
    public List f9355k;

    /* renamed from: l */
    public float f9356l;

    /* renamed from: m */
    public C2605c f9357m;

    /* renamed from: n */
    public float f9358n;

    public C2603b(Context context, int i) {
        super(context, null);
        this.f9354j = new ArrayList();
        this.f9355k = Collections.EMPTY_LIST;
        this.f9356l = 0.0533f;
        this.f9357m = C2605c.f9365g;
        this.f9358n = 0.08f;
    }

    @Override // p193w2.InterfaceC2612f0
    /* renamed from: a */
    public final void mo4685a(List list, C2605c c2605c, float f8, float f9) {
        this.f9355k = list;
        this.f9357m = c2605c;
        this.f9356l = f8;
        this.f9358n = f9;
        while (true) {
            ArrayList arrayList = this.f9354j;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C2610e0(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        List list;
        float f8;
        int i;
        int i4;
        int i8;
        int i9;
        boolean z7;
        float f9;
        int i10;
        float f10;
        TextPaint textPaint;
        int i11;
        int iMax;
        int iMin;
        int iRound;
        int i12;
        C2603b c2603b = this;
        List list2 = c2603b.f9355k;
        if (list2.isEmpty()) {
            return;
        }
        int height = c2603b.getHeight();
        int paddingLeft = c2603b.getPaddingLeft();
        int paddingTop = c2603b.getPaddingTop();
        int width = c2603b.getWidth() - c2603b.getPaddingRight();
        int paddingBottom = height - c2603b.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i13 = paddingBottom - paddingTop;
        float fM4258A = AbstractC2415i0.m4258A(0, height, i13, c2603b.f9356l);
        float f11 = 0.0f;
        if (fM4258A <= 0.0f) {
            return;
        }
        int size = list2.size();
        int i14 = 0;
        while (i14 < size) {
            C1029b c1029bM2225a = (C1029b) list2.get(i14);
            float f12 = f11;
            if (c1029bM2225a.f4385p != Integer.MIN_VALUE) {
                C1028a c1028aM2226a = c1029bM2225a.m2226a();
                float f13 = c1029bM2225a.f4374e;
                list = list2;
                c1028aM2226a.f4341h = -3.4028235E38f;
                c1028aM2226a.f4342i = Integer.MIN_VALUE;
                c1028aM2226a.f4336c = null;
                if (c1029bM2225a.f4375f == 0) {
                    c1028aM2226a.f4338e = 1.0f - f13;
                    i12 = 0;
                    c1028aM2226a.f4339f = 0;
                } else {
                    i12 = 0;
                    c1028aM2226a.f4338e = (-f13) - 1.0f;
                    c1028aM2226a.f4339f = 1;
                }
                int i15 = c1029bM2225a.f4376g;
                if (i15 == 0) {
                    c1028aM2226a.f4340g = 2;
                } else if (i15 == 2) {
                    c1028aM2226a.f4340g = i12;
                }
                c1029bM2225a = c1028aM2226a.m2225a();
            } else {
                list = list2;
            }
            float fM4258A2 = AbstractC2415i0.m4258A(c1029bM2225a.f4383n, height, i13, c1029bM2225a.f4384o);
            C2610e0 c2610e0 = (C2610e0) c2603b.f9354j.get(i14);
            C2605c c2605c = c2603b.f9357m;
            float f14 = c2603b.f9358n;
            TextPaint textPaint2 = c2610e0.f9435f;
            int i16 = height;
            Bitmap bitmap = c1029bM2225a.f4373d;
            int i17 = i13;
            float f15 = c1029bM2225a.f4380k;
            int i18 = size;
            float f16 = c1029bM2225a.f4379j;
            int i19 = i14;
            int i20 = c1029bM2225a.f4378i;
            float f17 = c1029bM2225a.f4377h;
            int i21 = c1029bM2225a.f4376g;
            float f18 = fM4258A;
            int i22 = c1029bM2225a.f4375f;
            float f19 = c1029bM2225a.f4374e;
            Layout.Alignment alignment = c1029bM2225a.f4371b;
            CharSequence charSequence = c1029bM2225a.f4370a;
            boolean z8 = bitmap == null;
            if (z8) {
                if (!TextUtils.isEmpty(charSequence)) {
                    f8 = f17;
                    i = c1029bM2225a.f4381l ? c1029bM2225a.f4382m : c2605c.f9368c;
                }
                i8 = paddingLeft;
                i9 = paddingTop;
                z7 = false;
                i14 = i19 + 1;
                c2603b = this;
                f11 = f12;
                list2 = list;
                height = i16;
                i13 = i17;
                size = i18;
                fM4258A = f18;
                paddingLeft = i8;
                paddingTop = i9;
            } else {
                f8 = f17;
                i = -16777216;
            }
            CharSequence charSequence2 = c2610e0.f9438i;
            if (charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) {
                Layout.Alignment alignment2 = c2610e0.f9439j;
                int i23 = AbstractC1118i0.f4750a;
                if (Objects.equals(alignment2, alignment) && c2610e0.f9440k == bitmap && c2610e0.f9441l == f19 && c2610e0.f9442m == i22) {
                    i4 = i21;
                    if (Integer.valueOf(c2610e0.f9443n).equals(Integer.valueOf(i4)) && c2610e0.f9444o == f8 && Integer.valueOf(c2610e0.f9445p).equals(Integer.valueOf(i20)) && c2610e0.f9446q == f16 && c2610e0.f9447r == f15 && c2610e0.f9448s == c2605c.f9366a && c2610e0.f9449t == c2605c.f9367b && c2610e0.f9450u == i && c2610e0.f9452w == c2605c.f9369d && c2610e0.f9451v == c2605c.f9370e && Objects.equals(textPaint2.getTypeface(), c2605c.f9371f) && c2610e0.f9453x == f18 && c2610e0.f9454y == fM4258A2 && c2610e0.f9455z == f14 && c2610e0.f9420A == paddingLeft && c2610e0.f9421B == paddingTop && c2610e0.f9422C == width && c2610e0.f9423D == paddingBottom) {
                        c2610e0.m4698a(canvas, z8);
                        i8 = paddingLeft;
                        i9 = paddingTop;
                        z7 = false;
                    }
                } else {
                    i4 = i21;
                }
                c2610e0.f9438i = charSequence;
                c2610e0.f9439j = alignment;
                c2610e0.f9440k = bitmap;
                c2610e0.f9441l = f19;
                c2610e0.f9442m = i22;
                c2610e0.f9443n = i4;
                c2610e0.f9444o = f8;
                c2610e0.f9445p = i20;
                c2610e0.f9446q = f16;
                c2610e0.f9447r = f15;
                c2610e0.f9448s = c2605c.f9366a;
                c2610e0.f9449t = c2605c.f9367b;
                c2610e0.f9450u = i;
                c2610e0.f9452w = c2605c.f9369d;
                c2610e0.f9451v = c2605c.f9370e;
                textPaint2.setTypeface(c2605c.f9371f);
                c2610e0.f9453x = f18;
                c2610e0.f9454y = fM4258A2;
                c2610e0.f9455z = f14;
                c2610e0.f9420A = paddingLeft;
                c2610e0.f9421B = paddingTop;
                c2610e0.f9422C = width;
                c2610e0.f9423D = paddingBottom;
                if (z8) {
                    c2610e0.f9438i.getClass();
                    CharSequence charSequence3 = c2610e0.f9438i;
                    SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(c2610e0.f9438i);
                    int i24 = c2610e0.f9422C - c2610e0.f9420A;
                    int i25 = c2610e0.f9423D - c2610e0.f9421B;
                    textPaint2.setTextSize(c2610e0.f9453x);
                    int i26 = (int) ((c2610e0.f9453x * 0.125f) + 0.5f);
                    int i27 = i26 * 2;
                    int i28 = i24 - i27;
                    float f20 = c2610e0.f9446q;
                    if (f20 != -3.4028235E38f) {
                        i28 = (int) (i28 * f20);
                    }
                    int i29 = i28;
                    if (i29 <= 0) {
                        AbstractC1101a.m2348F("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                        f18 = f18;
                        i8 = paddingLeft;
                        i9 = paddingTop;
                    } else {
                        f18 = f18;
                        if (c2610e0.f9454y > f12) {
                            textPaint = textPaint2;
                            i8 = paddingLeft;
                            i11 = 0;
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c2610e0.f9454y), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            textPaint = textPaint2;
                            i8 = paddingLeft;
                            i11 = 0;
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                        if (c2610e0.f9452w == 1) {
                            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i11, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                            int i30 = 0;
                            for (int length = foregroundColorSpanArr.length; i30 < length; length = length) {
                                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i30]);
                                i30++;
                            }
                        }
                        if (Color.alpha(c2610e0.f9449t) > 0) {
                            int i31 = c2610e0.f9452w;
                            if (i31 == 0 || i31 == 2) {
                                i9 = paddingTop;
                                spannableStringBuilder.setSpan(new BackgroundColorSpan(c2610e0.f9449t), 0, spannableStringBuilder.length(), 16711680);
                            } else {
                                i9 = paddingTop;
                                spannableStringBuilder2.setSpan(new BackgroundColorSpan(c2610e0.f9449t), 0, spannableStringBuilder2.length(), 16711680);
                            }
                        } else {
                            i9 = paddingTop;
                        }
                        Layout.Alignment alignment3 = c2610e0.f9439j;
                        if (alignment3 == null) {
                            alignment3 = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment4 = alignment3;
                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i29, alignment4, c2610e0.f9433d, c2610e0.f9434e, true);
                        c2610e0.f9424E = staticLayout;
                        int height2 = staticLayout.getHeight();
                        int lineCount = c2610e0.f9424E.getLineCount();
                        int i32 = 0;
                        int iMax2 = 0;
                        while (i32 < lineCount) {
                            iMax2 = Math.max((int) Math.ceil(c2610e0.f9424E.getLineWidth(i32)), iMax2);
                            i32++;
                            height2 = height2;
                            lineCount = lineCount;
                            spannableStringBuilder2 = spannableStringBuilder2;
                        }
                        SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                        int i33 = height2;
                        int i34 = ((c2610e0.f9446q == -3.4028235E38f || iMax2 >= i29) ? iMax2 : i29) + i27;
                        float f21 = c2610e0.f9444o;
                        if (f21 != -3.4028235E38f) {
                            int iRound2 = Math.round(i24 * f21);
                            int i35 = c2610e0.f9420A;
                            int i36 = iRound2 + i35;
                            int i37 = c2610e0.f9445p;
                            if (i37 == 1) {
                                i36 = ((i36 * 2) - i34) / 2;
                            } else if (i37 == 2) {
                                i36 -= i34;
                            }
                            iMax = Math.max(i36, i35);
                            iMin = Math.min(iMax + i34, c2610e0.f9422C);
                        } else {
                            iMax = c2610e0.f9420A + ((i24 - i34) / 2);
                            iMin = iMax + i34;
                        }
                        int i38 = iMin - iMax;
                        if (i38 <= 0) {
                            AbstractC1101a.m2348F("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                        } else {
                            float f22 = c2610e0.f9441l;
                            if (f22 != -3.4028235E38f) {
                                if (c2610e0.f9442m == 0) {
                                    iRound = Math.round(i25 * f22) + c2610e0.f9421B;
                                    int i39 = c2610e0.f9443n;
                                    if (i39 == 2) {
                                        iRound -= i33;
                                    } else if (i39 == 1) {
                                        iRound = ((iRound * 2) - i33) / 2;
                                    }
                                    z7 = false;
                                } else {
                                    z7 = false;
                                    int lineBottom = c2610e0.f9424E.getLineBottom(0) - c2610e0.f9424E.getLineTop(0);
                                    float f23 = c2610e0.f9441l;
                                    iRound = f23 >= f12 ? Math.round(f23 * lineBottom) + c2610e0.f9421B : (Math.round((f23 + 1.0f) * lineBottom) + c2610e0.f9423D) - i33;
                                }
                                int i40 = iRound + i33;
                                int i41 = c2610e0.f9423D;
                                if (i40 > i41) {
                                    iRound = i41 - i33;
                                } else {
                                    int i42 = c2610e0.f9421B;
                                    if (iRound < i42) {
                                        iRound = i42;
                                    }
                                }
                            } else {
                                z7 = false;
                                iRound = (c2610e0.f9423D - i33) - ((int) (i25 * c2610e0.f9455z));
                            }
                            c2610e0.f9424E = new StaticLayout(spannableStringBuilder3, textPaint, i38, alignment4, c2610e0.f9433d, c2610e0.f9434e, true);
                            c2610e0.f9425F = new StaticLayout(spannableStringBuilder4, textPaint, i38, alignment4, c2610e0.f9433d, c2610e0.f9434e, true);
                            c2610e0.f9426G = iMax;
                            c2610e0.f9427H = iRound;
                            c2610e0.f9428I = i26;
                        }
                    }
                    z7 = false;
                } else {
                    f18 = f18;
                    i8 = paddingLeft;
                    i9 = paddingTop;
                    z7 = false;
                    c2610e0.f9440k.getClass();
                    Bitmap bitmap2 = c2610e0.f9440k;
                    int i43 = c2610e0.f9422C;
                    int i44 = c2610e0.f9420A;
                    int i45 = c2610e0.f9423D;
                    int i46 = c2610e0.f9421B;
                    float f24 = i43 - i44;
                    float f25 = (c2610e0.f9444o * f24) + i44;
                    float f26 = i45 - i46;
                    float f27 = (c2610e0.f9441l * f26) + i46;
                    int iRound3 = Math.round(f24 * c2610e0.f9446q);
                    float f28 = c2610e0.f9447r;
                    int iRound4 = f28 != -3.4028235E38f ? Math.round(f26 * f28) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                    int i47 = c2610e0.f9445p;
                    if (i47 == 2) {
                        f9 = iRound3;
                    } else {
                        if (i47 == 1) {
                            f9 = iRound3 / 2;
                        }
                        int iRound5 = Math.round(f25);
                        i10 = c2610e0.f9443n;
                        if (i10 != 2) {
                            f10 = iRound4;
                        } else {
                            if (i10 == 1) {
                                f10 = iRound4 / 2;
                            }
                            int iRound6 = Math.round(f27);
                            c2610e0.f9429J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                        }
                        f27 -= f10;
                        int iRound62 = Math.round(f27);
                        c2610e0.f9429J = new Rect(iRound5, iRound62, iRound3 + iRound5, iRound4 + iRound62);
                    }
                    f25 -= f9;
                    int iRound52 = Math.round(f25);
                    i10 = c2610e0.f9443n;
                    if (i10 != 2) {
                    }
                    f27 -= f10;
                    int iRound622 = Math.round(f27);
                    c2610e0.f9429J = new Rect(iRound52, iRound622, iRound3 + iRound52, iRound4 + iRound622);
                }
                c2610e0.m4698a(canvas, z8);
            }
            i14 = i19 + 1;
            c2603b = this;
            f11 = f12;
            list2 = list;
            height = i16;
            i13 = i17;
            size = i18;
            fM4258A = f18;
            paddingLeft = i8;
            paddingTop = i9;
        }
    }
}
