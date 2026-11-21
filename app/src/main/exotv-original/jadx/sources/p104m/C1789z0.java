package p104m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.z0 */
/* loaded from: classes.dex */
public final class C1789z0 {

    /* renamed from: l */
    public static final RectF f6822l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f6823m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f6824a = 0;

    /* renamed from: b */
    public boolean f6825b = false;

    /* renamed from: c */
    public float f6826c = -1.0f;

    /* renamed from: d */
    public float f6827d = -1.0f;

    /* renamed from: e */
    public float f6828e = -1.0f;

    /* renamed from: f */
    public int[] f6829f = new int[0];

    /* renamed from: g */
    public boolean f6830g = false;

    /* renamed from: h */
    public TextPaint f6831h;

    /* renamed from: i */
    public final TextView f6832i;

    /* renamed from: j */
    public final Context f6833j;

    /* renamed from: k */
    public final C1786y0 f6834k;

    public C1789z0(TextView textView) {
        this.f6832i = textView;
        this.f6833j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6834k = new C1783x0();
        } else {
            this.f6834k = new C1786y0();
        }
    }

    /* renamed from: b */
    public static int[] m3484b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public static Method m3485d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f6823m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: e */
    public static Object m3486e(Object obj, String str, Object obj2) {
        try {
            return m3485d(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m3487a() {
        if (m3489f()) {
            if (this.f6825b) {
                if (this.f6832i.getMeasuredHeight() <= 0 || this.f6832i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f6834k.mo3476b(this.f6832i) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : (this.f6832i.getMeasuredWidth() - this.f6832i.getTotalPaddingLeft()) - this.f6832i.getTotalPaddingRight();
                int height = (this.f6832i.getHeight() - this.f6832i.getCompoundPaddingBottom()) - this.f6832i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f6822l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM3488c = m3488c(rectF);
                        if (fM3488c != this.f6832i.getTextSize()) {
                            m3490g(0, fM3488c);
                        }
                    } finally {
                    }
                }
            }
            this.f6825b = true;
        }
    }

    /* renamed from: c */
    public final int m3488c(RectF rectF) {
        CharSequence transformation;
        int length = this.f6829f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i4 = 1;
        int i8 = 0;
        while (i4 <= i) {
            int i9 = (i4 + i) / 2;
            int i10 = this.f6829f[i9];
            TextView textView = this.f6832i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f6831h;
            if (textPaint == null) {
                this.f6831h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f6831h.set(textView.getPaint());
            this.f6831h.setTextSize(i10);
            Layout.Alignment alignment = (Layout.Alignment) m3486e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            TextPaint textPaint2 = this.f6831h;
            C1786y0 c1786y0 = this.f6834k;
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint2, iRound);
            builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                c1786y0.mo3475a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                int i11 = i9 + 1;
                i8 = i4;
                i4 = i11;
            } else {
                i8 = i9 - 1;
                i = i8;
            }
        }
        return this.f6829f[i8];
    }

    /* renamed from: f */
    public final boolean m3489f() {
        return m3493j() && this.f6824a != 0;
    }

    /* renamed from: g */
    public final void m3490g(int i, float f8) {
        Context context = this.f6833j;
        float fApplyDimension = TypedValue.applyDimension(i, f8, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f6832i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f6825b = false;
                try {
                    Method methodM3485d = m3485d("nullLayouts");
                    if (methodM3485d != null) {
                        methodM3485d.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m3491h() {
        if (m3493j() && this.f6824a == 1) {
            if (!this.f6830g || this.f6829f.length == 0) {
                int iFloor = ((int) Math.floor((this.f6828e - this.f6827d) / this.f6826c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f6826c) + this.f6827d);
                }
                this.f6829f = m3484b(iArr);
            }
            this.f6825b = true;
        } else {
            this.f6825b = false;
        }
        return this.f6825b;
    }

    /* renamed from: i */
    public final boolean m3492i() {
        boolean z7 = this.f6829f.length > 0;
        this.f6830g = z7;
        if (z7) {
            this.f6824a = 1;
            this.f6827d = r0[0];
            this.f6828e = r0[r1 - 1];
            this.f6826c = -1.0f;
        }
        return z7;
    }

    /* renamed from: j */
    public final boolean m3493j() {
        return !(this.f6832i instanceof C1776v);
    }

    /* renamed from: k */
    public final void m3494k(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        }
        if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f6824a = 1;
        this.f6827d = f8;
        this.f6828e = f9;
        this.f6826c = f10;
        this.f6830g = false;
    }
}
