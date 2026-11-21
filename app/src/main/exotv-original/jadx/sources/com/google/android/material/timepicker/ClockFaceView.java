package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.C2181z;
import p034d5.AbstractC0847a;
import p105m0.AbstractC1828m0;
import p168t2.AbstractC2429w;
import p199x.C2722i;
import p199x.C2723j;
import p199x.C2727n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0777h implements InterfaceC0775f {

    /* renamed from: C */
    public final ClockHandView f3489C;

    /* renamed from: D */
    public final Rect f3490D;

    /* renamed from: E */
    public final RectF f3491E;

    /* renamed from: F */
    public final Rect f3492F;

    /* renamed from: G */
    public final SparseArray f3493G;

    /* renamed from: H */
    public final C0770a f3494H;

    /* renamed from: I */
    public final int[] f3495I;

    /* renamed from: J */
    public final float[] f3496J;

    /* renamed from: K */
    public final int f3497K;

    /* renamed from: L */
    public final int f3498L;

    /* renamed from: M */
    public final int f3499M;

    /* renamed from: N */
    public final int f3500N;

    /* renamed from: O */
    public final String[] f3501O;

    /* renamed from: P */
    public float f3502P;

    /* renamed from: Q */
    public final ColorStateList f3503Q;

    /* renamed from: R */
    public C0779j f3504R;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3490D = new Rect();
        this.f3491E = new RectF();
        this.f3492F = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3493G = sparseArray;
        this.f3496J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3742d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i = 1;
        ColorStateList colorStateListM4301f = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 1);
        this.f3503Q = colorStateListM4301f;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3489C = clockHandView;
        this.f3497K = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM4301f.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM4301f.getDefaultColor());
        this.f3495I = new int[]{colorForState, colorForState, colorStateListM4301f.getDefaultColor()};
        clockHandView.f3508l.add(this);
        int defaultColor = AbstractC0120b.m424t(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM4301f2 = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM4301f2 != null ? colorStateListM4301f2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new C0772c());
        setFocusable(true);
        setClipToOutline(true);
        this.f3494H = new C0770a(this, i);
        String[] strArr = new String[12];
        Arrays.fill(strArr, C2181z.FRAGMENT_ENCODE_SET);
        this.f3501O = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z7 = false;
        for (int i4 = 0; i4 < Math.max(this.f3501O.length, size); i4++) {
            TextView textView = (TextView) sparseArray.get(i4);
            if (i4 >= this.f3501O.length) {
                removeView(textView);
                sparseArray.remove(i4);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i4, textView);
                    addView(textView);
                }
                textView.setText(this.f3501O[i4]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i4));
                int i8 = (i4 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i8));
                z7 = i8 > 1 ? true : z7;
                AbstractC1828m0.m3608m(textView, this.f3494H);
                textView.setTextColor(this.f3503Q);
            }
        }
        ClockHandView clockHandView2 = this.f3489C;
        if (clockHandView2.f3507k && !z7) {
            clockHandView2.f3518v = 1;
        }
        clockHandView2.f3507k = z7;
        clockHandView2.invalidate();
        this.f3498L = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3499M = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3500N = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0777h
    /* renamed from: m */
    public final void mo1923m() {
        C2727n c2727n = new C2727n();
        c2727n.m4802b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!map.containsKey(i4)) {
                    map.put(i4, new ArrayList());
                }
                ((List) map.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3526A * 0.66f) : this.f3526A;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c2727n.f10087c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C2722i());
                }
                C2723j c2723j = ((C2722i) map2.get(Integer.valueOf(id))).f9983d;
                c2723j.f10053z = R.id.circle_center;
                c2723j.f9987A = iRound;
                c2723j.f9988B = size;
                size += 360.0f / list.size();
            }
        }
        c2727n.m4801a(this);
        setConstraintSet(null);
        requestLayout();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f3493G;
            if (i8 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i8)).setVisibility(0);
            i8++;
        }
    }

    /* renamed from: n */
    public final void m1924n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f3489C.f3512p;
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f3493G;
            int size = sparseArray.size();
            rect = this.f3490D;
            rectF = this.f3491E;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f8) {
                    textView = textView2;
                    f8 = fHeight;
                }
            }
            i++;
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3492F);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3495I, this.f3496J, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3501O.length, false, 1));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f3493G;
            if (i4 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i4);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i4++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            switch (i) {
                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                    length = (iIntValue + 1) % this.f3501O.length;
                    break;
                case 20:
                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                    String[] strArr = this.f3501O;
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i, keyEvent);
            }
            int i8 = (length / 12) + 1;
            ClockHandView clockHandView = this.f3489C;
            if (i8 != clockHandView.f3518v) {
                clockHandView.f3518v = i8;
                clockHandView.invalidate();
            }
            clockHandView.m1926b((length % 12) * 30.0f);
            m1924n();
            return true;
        }
        C0779j c0779j = this.f3504R;
        if (c0779j != null) {
            c0779j.f3529a.f3520z.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        m1924n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i4) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f3500N / Math.max(Math.max(this.f3498L / displayMetrics.heightPixels, this.f3499M / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i4) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i4));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.f3489C;
        int i8 = ((iMax / 2) - clockHandView.f3509m) - this.f3497K;
        int i9 = this.f3526A;
        if (i8 != i9 && i8 != i9) {
            this.f3526A = i8;
            mo1923m();
            clockHandView.f3517u = this.f3526A;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
