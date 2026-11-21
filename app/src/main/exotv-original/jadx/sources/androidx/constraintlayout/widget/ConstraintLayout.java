package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.internal.http2.C2122f;
import org.xmlpull.v1.XmlPullParserException;
import p005a4.C0073c;
import p051f5.C0945b;
import p156s.C2330c;
import p156s.C2332e;
import p174u.AbstractC2447i;
import p174u.AbstractC2448j;
import p174u.C2439a;
import p174u.C2442d;
import p174u.C2443e;
import p174u.C2445g;
import p174u.C2446h;
import p182v.AbstractC2500o;
import p182v.C2488c;
import p182v.C2490e;
import p182v.C2494i;
import p182v.C2496k;
import p182v.C2498m;
import p199x.AbstractC2716c;
import p199x.AbstractC2717d;
import p199x.AbstractC2728o;
import p199x.AbstractC2730q;
import p199x.C2718e;
import p199x.C2719f;
import p199x.C2720g;
import p199x.C2727n;
import p199x.C2731r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: y */
    public static C2731r f784y;

    /* renamed from: j */
    public final SparseArray f785j;

    /* renamed from: k */
    public final ArrayList f786k;

    /* renamed from: l */
    public final C2443e f787l;

    /* renamed from: m */
    public int f788m;

    /* renamed from: n */
    public int f789n;

    /* renamed from: o */
    public int f790o;

    /* renamed from: p */
    public int f791p;

    /* renamed from: q */
    public boolean f792q;

    /* renamed from: r */
    public int f793r;

    /* renamed from: s */
    public C2727n f794s;

    /* renamed from: t */
    public C2332e f795t;

    /* renamed from: u */
    public int f796u;

    /* renamed from: v */
    public HashMap f797v;

    /* renamed from: w */
    public final SparseArray f798w;

    /* renamed from: x */
    public final C2719f f799x;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f785j = new SparseArray();
        this.f786k = new ArrayList(4);
        this.f787l = new C2443e();
        this.f788m = 0;
        this.f789n = 0;
        this.f790o = Integer.MAX_VALUE;
        this.f791p = Integer.MAX_VALUE;
        this.f792q = true;
        this.f793r = 257;
        this.f794s = null;
        this.f795t = null;
        this.f796u = -1;
        this.f797v = new HashMap();
        this.f798w = new SparseArray();
        this.f799x = new C2719f(this, this);
        m498i(attributeSet, 0);
    }

    /* renamed from: g */
    public static C2718e m496g() {
        C2718e c2718e = new C2718e(-2, -2);
        c2718e.f9913a = -1;
        c2718e.f9915b = -1;
        c2718e.f9917c = -1.0f;
        c2718e.f9919d = true;
        c2718e.f9921e = -1;
        c2718e.f9923f = -1;
        c2718e.f9925g = -1;
        c2718e.f9927h = -1;
        c2718e.f9929i = -1;
        c2718e.f9931j = -1;
        c2718e.f9933k = -1;
        c2718e.f9935l = -1;
        c2718e.f9937m = -1;
        c2718e.f9939n = -1;
        c2718e.f9941o = -1;
        c2718e.f9943p = -1;
        c2718e.f9945q = 0;
        c2718e.f9946r = 0.0f;
        c2718e.f9947s = -1;
        c2718e.f9948t = -1;
        c2718e.f9949u = -1;
        c2718e.f9950v = -1;
        c2718e.f9951w = Integer.MIN_VALUE;
        c2718e.f9952x = Integer.MIN_VALUE;
        c2718e.f9953y = Integer.MIN_VALUE;
        c2718e.f9954z = Integer.MIN_VALUE;
        c2718e.f9887A = Integer.MIN_VALUE;
        c2718e.f9888B = Integer.MIN_VALUE;
        c2718e.f9889C = Integer.MIN_VALUE;
        c2718e.f9890D = 0;
        c2718e.f9891E = 0.5f;
        c2718e.f9892F = 0.5f;
        c2718e.f9893G = null;
        c2718e.f9894H = -1.0f;
        c2718e.f9895I = -1.0f;
        c2718e.f9896J = 0;
        c2718e.f9897K = 0;
        c2718e.f9898L = 0;
        c2718e.f9899M = 0;
        c2718e.f9900N = 0;
        c2718e.f9901O = 0;
        c2718e.f9902P = 0;
        c2718e.f9903Q = 0;
        c2718e.f9904R = 1.0f;
        c2718e.f9905S = 1.0f;
        c2718e.f9906T = -1;
        c2718e.f9907U = -1;
        c2718e.f9908V = -1;
        c2718e.f9909W = false;
        c2718e.f9910X = false;
        c2718e.f9911Y = null;
        c2718e.f9912Z = 0;
        c2718e.f9914a0 = true;
        c2718e.f9916b0 = true;
        c2718e.f9918c0 = false;
        c2718e.f9920d0 = false;
        c2718e.f9922e0 = false;
        c2718e.f9924f0 = -1;
        c2718e.f9926g0 = -1;
        c2718e.f9928h0 = -1;
        c2718e.f9930i0 = -1;
        c2718e.f9932j0 = Integer.MIN_VALUE;
        c2718e.f9934k0 = Integer.MIN_VALUE;
        c2718e.f9936l0 = 0.5f;
        c2718e.f9944p0 = new C2442d();
        return c2718e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C2731r getSharedValues() {
        if (f784y == null) {
            C2731r c2731r = new C2731r();
            new SparseIntArray();
            new HashMap();
            f784y = c2731r;
        }
        return f784y;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2718e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f786k;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC2716c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        int i10 = Integer.parseInt(strArrSplit[2]);
                        int i11 = (int) ((i8 / 1080.0f) * width);
                        int i12 = (int) ((i9 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = i11;
                        float f9 = i12;
                        float f10 = i11 + ((int) ((i10 / 1080.0f) * width));
                        canvas.drawLine(f8, f9, f10, f9, paint);
                        float f11 = i12 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, f11, paint);
                        canvas.drawLine(f10, f11, f8, f11, paint);
                        canvas.drawLine(f8, f11, f8, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f9, f10, f11, paint);
                        canvas.drawLine(f8, f11, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f792q = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m496g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C2718e c2718e = new C2718e(context, attributeSet);
        c2718e.f9913a = -1;
        c2718e.f9915b = -1;
        c2718e.f9917c = -1.0f;
        c2718e.f9919d = true;
        c2718e.f9921e = -1;
        c2718e.f9923f = -1;
        c2718e.f9925g = -1;
        c2718e.f9927h = -1;
        c2718e.f9929i = -1;
        c2718e.f9931j = -1;
        c2718e.f9933k = -1;
        c2718e.f9935l = -1;
        c2718e.f9937m = -1;
        c2718e.f9939n = -1;
        c2718e.f9941o = -1;
        c2718e.f9943p = -1;
        c2718e.f9945q = 0;
        c2718e.f9946r = 0.0f;
        c2718e.f9947s = -1;
        c2718e.f9948t = -1;
        c2718e.f9949u = -1;
        c2718e.f9950v = -1;
        c2718e.f9951w = Integer.MIN_VALUE;
        c2718e.f9952x = Integer.MIN_VALUE;
        c2718e.f9953y = Integer.MIN_VALUE;
        c2718e.f9954z = Integer.MIN_VALUE;
        c2718e.f9887A = Integer.MIN_VALUE;
        c2718e.f9888B = Integer.MIN_VALUE;
        c2718e.f9889C = Integer.MIN_VALUE;
        c2718e.f9890D = 0;
        c2718e.f9891E = 0.5f;
        c2718e.f9892F = 0.5f;
        c2718e.f9893G = null;
        c2718e.f9894H = -1.0f;
        c2718e.f9895I = -1.0f;
        c2718e.f9896J = 0;
        c2718e.f9897K = 0;
        c2718e.f9898L = 0;
        c2718e.f9899M = 0;
        c2718e.f9900N = 0;
        c2718e.f9901O = 0;
        c2718e.f9902P = 0;
        c2718e.f9903Q = 0;
        c2718e.f9904R = 1.0f;
        c2718e.f9905S = 1.0f;
        c2718e.f9906T = -1;
        c2718e.f9907U = -1;
        c2718e.f9908V = -1;
        c2718e.f9909W = false;
        c2718e.f9910X = false;
        c2718e.f9911Y = null;
        c2718e.f9912Z = 0;
        c2718e.f9914a0 = true;
        c2718e.f9916b0 = true;
        c2718e.f9918c0 = false;
        c2718e.f9920d0 = false;
        c2718e.f9922e0 = false;
        c2718e.f9924f0 = -1;
        c2718e.f9926g0 = -1;
        c2718e.f9928h0 = -1;
        c2718e.f9930i0 = -1;
        c2718e.f9932j0 = Integer.MIN_VALUE;
        c2718e.f9934k0 = Integer.MIN_VALUE;
        c2718e.f9936l0 = 0.5f;
        c2718e.f9944p0 = new C2442d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2730q.f10089b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i4 = AbstractC2717d.f9886a.get(index);
            switch (i4) {
                case 1:
                    c2718e.f9908V = typedArrayObtainStyledAttributes.getInt(index, c2718e.f9908V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9943p);
                    c2718e.f9943p = resourceId;
                    if (resourceId == -1) {
                        c2718e.f9943p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c2718e.f9945q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9945q);
                    break;
                case 4:
                    float f8 = typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9946r) % 360.0f;
                    c2718e.f9946r = f8;
                    if (f8 < 0.0f) {
                        c2718e.f9946r = (360.0f - f8) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c2718e.f9913a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2718e.f9913a);
                    break;
                case 6:
                    c2718e.f9915b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2718e.f9915b);
                    break;
                case 7:
                    c2718e.f9917c = typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9917c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9921e);
                    c2718e.f9921e = resourceId2;
                    if (resourceId2 == -1) {
                        c2718e.f9921e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9923f);
                    c2718e.f9923f = resourceId3;
                    if (resourceId3 == -1) {
                        c2718e.f9923f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9925g);
                    c2718e.f9925g = resourceId4;
                    if (resourceId4 == -1) {
                        c2718e.f9925g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9927h);
                    c2718e.f9927h = resourceId5;
                    if (resourceId5 == -1) {
                        c2718e.f9927h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9929i);
                    c2718e.f9929i = resourceId6;
                    if (resourceId6 == -1) {
                        c2718e.f9929i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9931j);
                    c2718e.f9931j = resourceId7;
                    if (resourceId7 == -1) {
                        c2718e.f9931j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9933k);
                    c2718e.f9933k = resourceId8;
                    if (resourceId8 == -1) {
                        c2718e.f9933k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9935l);
                    c2718e.f9935l = resourceId9;
                    if (resourceId9 == -1) {
                        c2718e.f9935l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9937m);
                    c2718e.f9937m = resourceId10;
                    if (resourceId10 == -1) {
                        c2718e.f9937m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9947s);
                    c2718e.f9947s = resourceId11;
                    if (resourceId11 == -1) {
                        c2718e.f9947s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9948t);
                    c2718e.f9948t = resourceId12;
                    if (resourceId12 == -1) {
                        c2718e.f9948t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9949u);
                    c2718e.f9949u = resourceId13;
                    if (resourceId13 == -1) {
                        c2718e.f9949u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9950v);
                    c2718e.f9950v = resourceId14;
                    if (resourceId14 == -1) {
                        c2718e.f9950v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                    c2718e.f9951w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9951w);
                    break;
                case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                    c2718e.f9952x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9952x);
                    break;
                case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                    c2718e.f9953y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9953y);
                    break;
                case 24:
                    c2718e.f9954z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9954z);
                    break;
                case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                    c2718e.f9887A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9887A);
                    break;
                case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                    c2718e.f9888B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9888B);
                    break;
                case AnalyticsListener.EVENT_CUES /* 27 */:
                    c2718e.f9909W = typedArrayObtainStyledAttributes.getBoolean(index, c2718e.f9909W);
                    break;
                case AnalyticsListener.EVENT_METADATA /* 28 */:
                    c2718e.f9910X = typedArrayObtainStyledAttributes.getBoolean(index, c2718e.f9910X);
                    break;
                case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                    c2718e.f9891E = typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9891E);
                    break;
                case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                    c2718e.f9892F = typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9892F);
                    break;
                case 31:
                    int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c2718e.f9898L = i8;
                    if (i8 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c2718e.f9899M = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c2718e.f9900N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9900N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c2718e.f9900N) == -2) {
                            c2718e.f9900N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c2718e.f9902P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9902P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c2718e.f9902P) == -2) {
                            c2718e.f9902P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c2718e.f9904R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9904R));
                    c2718e.f9898L = 2;
                    break;
                case 36:
                    try {
                        c2718e.f9901O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9901O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c2718e.f9901O) == -2) {
                            c2718e.f9901O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c2718e.f9903Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9903Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c2718e.f9903Q) == -2) {
                            c2718e.f9903Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c2718e.f9905S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9905S));
                    c2718e.f9899M = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            C2727n.m4800h(c2718e, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c2718e.f9894H = typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9894H);
                            break;
                        case 46:
                            c2718e.f9895I = typedArrayObtainStyledAttributes.getFloat(index, c2718e.f9895I);
                            break;
                        case 47:
                            c2718e.f9896J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c2718e.f9897K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c2718e.f9906T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2718e.f9906T);
                            break;
                        case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                            c2718e.f9907U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2718e.f9907U);
                            break;
                        case 51:
                            c2718e.f9911Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9939n);
                            c2718e.f9939n = resourceId15;
                            if (resourceId15 == -1) {
                                c2718e.f9939n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c2718e.f9941o);
                            c2718e.f9941o = resourceId16;
                            if (resourceId16 == -1) {
                                c2718e.f9941o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c2718e.f9890D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9890D);
                            break;
                        case 55:
                            c2718e.f9889C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2718e.f9889C);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    C2727n.m4799g(c2718e, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C2727n.m4799g(c2718e, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c2718e.f9912Z = typedArrayObtainStyledAttributes.getInt(index, c2718e.f9912Z);
                                    break;
                                case 67:
                                    c2718e.f9919d = typedArrayObtainStyledAttributes.getBoolean(index, c2718e.f9919d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c2718e.m4784a();
        return c2718e;
    }

    public int getMaxHeight() {
        return this.f791p;
    }

    public int getMaxWidth() {
        return this.f790o;
    }

    public int getMinHeight() {
        return this.f789n;
    }

    public int getMinWidth() {
        return this.f788m;
    }

    public int getOptimizationLevel() {
        return this.f787l.f8891D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C2443e c2443e = this.f787l;
        if (c2443e.f8864j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c2443e.f8864j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c2443e.f8864j = "parent";
            }
        }
        if (c2443e.f8861h0 == null) {
            c2443e.f8861h0 = c2443e.f8864j;
            Log.v("ConstraintLayout", " setDebugName " + c2443e.f8861h0);
        }
        ArrayList arrayList = c2443e.f8900q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C2442d c2442d = (C2442d) obj;
            View view = c2442d.f8857f0;
            if (view != null) {
                if (c2442d.f8864j == null && (id = view.getId()) != -1) {
                    c2442d.f8864j = getContext().getResources().getResourceEntryName(id);
                }
                if (c2442d.f8861h0 == null) {
                    c2442d.f8861h0 = c2442d.f8864j;
                    Log.v("ConstraintLayout", " setDebugName " + c2442d.f8861h0);
                }
            }
        }
        c2443e.mo4395n(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final C2442d m497h(View view) {
        if (view == this) {
            return this.f787l;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C2718e) {
            return ((C2718e) view.getLayoutParams()).f9944p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C2718e) {
            return ((C2718e) view.getLayoutParams()).f9944p0;
        }
        return null;
    }

    /* renamed from: i */
    public final void m498i(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        C2443e c2443e = this.f787l;
        c2443e.f8857f0 = this;
        C2719f c2719f = this.f799x;
        c2443e.f8904u0 = c2719f;
        c2443e.f8902s0.f9095h = c2719f;
        this.f785j.put(getId(), this);
        this.f794s = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2730q.f10089b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f788m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f788m);
                } else if (index == 17) {
                    this.f789n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f789n);
                } else if (index == 14) {
                    this.f790o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f790o);
                } else if (index == 15) {
                    this.f791p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f791p);
                } else if (index == 113) {
                    this.f793r = typedArrayObtainStyledAttributes.getInt(index, this.f793r);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m499j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f795t = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C2727n c2727n = new C2727n();
                        this.f794s = c2727n;
                        c2727n.m4803e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f794s = null;
                    }
                    this.f796u = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c2443e.f8891D0 = this.f793r;
        C2330c.f8151q = c2443e.m4411W(512);
    }

    /* renamed from: j */
    public final void m499j(int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        String str;
        Context context = getContext();
        C2332e c2332e = new C2332e(8, false);
        c2332e.f8170k = new SparseArray();
        c2332e.f8171l = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0945b c0945b = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2332e.m4156v(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                C0945b c0945b2 = new C0945b(context, xml);
                                ((SparseArray) c2332e.f8170k).put(c0945b2.f4152j, c0945b2);
                                c0945b = c0945b2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C2720g c2720g = new C2720g(context, xml);
                                if (c0945b != null) {
                                    ((ArrayList) c0945b.f4154l).add(c2720g);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e8) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e8);
        }
        this.f795t = c2332e;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036e  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m500k(C2443e c2443e, int i, int i4, int i8) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i9;
        char c8;
        boolean z7;
        int i10;
        int i11;
        boolean z8;
        ArrayList arrayList;
        C2719f c2719f;
        int i12;
        boolean zM4409T;
        int i13;
        int i14;
        C2719f c2719f2;
        int i15;
        boolean z9;
        int i16;
        C2719f c2719f3;
        C2496k c2496k;
        C2498m c2498m;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z10;
        int size;
        int i24;
        int size2;
        int i25;
        int mode = View.MeasureSpec.getMode(i4);
        int size3 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size4 = View.MeasureSpec.getSize(i8);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i26 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C2719f c2719f4 = this.f799x;
        c2719f4.f9956b = iMax3;
        c2719f4.f9957c = iMax4;
        c2719f4.f9958d = paddingWidth;
        c2719f4.f9959e = i26;
        c2719f4.f9960f = i4;
        c2719f4.f9961g = i8;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i27 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i28 = size3 - paddingWidth;
        int i29 = size4 - i26;
        int i30 = c2719f4.f9959e;
        int i31 = c2719f4.f9958d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    iMin = 0;
                } else {
                    iMin = Math.min(this.f790o - i31, i28);
                    i27 = 1;
                }
            } else if (childCount == 0) {
                iMax = Math.max(0, this.f788m);
                iMin = iMax;
                i27 = 2;
            } else {
                iMin = 0;
                i27 = 2;
            }
        } else if (childCount == 0) {
            iMax = Math.max(0, this.f788m);
            iMin = iMax;
            i27 = 2;
        } else {
            iMin = i28;
            i27 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f791p - i30, i29);
                i9 = 1;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f789n);
                iMin2 = iMax2;
                i9 = 2;
            } else {
                iMin2 = 0;
                i9 = 2;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.f789n);
            iMin2 = iMax2;
            i9 = 2;
        } else {
            iMin2 = i29;
            i9 = 2;
        }
        int iM4396q = c2443e.m4396q();
        C2490e c2490e = c2443e.f8902s0;
        int[] iArr = c2443e.f8822C;
        int i32 = iMin;
        if (i32 == iM4396q && iMin2 == c2443e.m4392k()) {
            c8 = 1;
        } else {
            c2490e.f9090c = true;
            c8 = 1;
        }
        c2443e.f8844Y = 0;
        c2443e.f8845Z = 0;
        iArr[0] = this.f790o - i31;
        iArr[c8] = this.f791p - i30;
        c2443e.f8849b0 = 0;
        c2443e.f8851c0 = 0;
        c2443e.m4379M(i27);
        c2443e.m4381O(i32);
        c2443e.m4380N(i9);
        c2443e.m4378L(iMin2);
        int i33 = this.f788m - i31;
        if (i33 < 0) {
            c2443e.f8849b0 = 0;
        } else {
            c2443e.f8849b0 = i33;
        }
        int i34 = this.f789n - i30;
        if (i34 < 0) {
            c2443e.f8851c0 = 0;
        } else {
            c2443e.f8851c0 = i34;
        }
        c2443e.f8907x0 = iMax5;
        c2443e.f8908y0 = iMax3;
        C0073c c0073c = c2443e.f8901r0;
        C2443e c2443e2 = (C2443e) c0073c.f326m;
        ArrayList arrayList2 = (ArrayList) c0073c.f324k;
        C2719f c2719f5 = c2443e.f8904u0;
        int size5 = c2443e.f8900q0.size();
        int iM4396q2 = c2443e.m4396q();
        int iM4392k = c2443e.m4392k();
        boolean zM4427c = AbstractC2448j.m4427c(i, 128);
        boolean z11 = zM4427c || AbstractC2448j.m4427c(i, 64);
        if (z11) {
            int i35 = 0;
            while (i35 < size5) {
                boolean z12 = z11;
                C2442d c2442d = (C2442d) c2443e.f8900q0.get(i35);
                int i36 = i35;
                int[] iArr2 = c2442d.f8877p0;
                i10 = size5;
                boolean z13 = (iArr2[0] == 3) && (iArr2[1] == 3) && c2442d.f8842W > 0.0f;
                if ((c2442d.m4403x() && z13) || ((c2442d.m4404y() && z13) || (c2442d instanceof C2445g) || c2442d.m4403x() || c2442d.m4404y())) {
                    i11 = 1073741824;
                    z7 = false;
                    break;
                } else {
                    i35 = i36 + 1;
                    z11 = z12;
                    size5 = i10;
                }
            }
            z7 = z11;
            i10 = size5;
            i11 = 1073741824;
        } else {
            z7 = z11;
            i10 = size5;
            i11 = 1073741824;
        }
        boolean z14 = z7 & ((mode == i11 && mode2 == i11) || zM4427c);
        if (z14) {
            int iMin3 = Math.min(iArr[0], i28);
            int iMin4 = Math.min(iArr[1], i29);
            int i37 = 1073741824;
            if (mode == 1073741824) {
                if (c2443e.m4396q() != iMin3) {
                    c2443e.m4381O(iMin3);
                    c2490e.f9089b = true;
                }
                i37 = 1073741824;
            }
            if (mode2 == i37 && c2443e.m4392k() != iMin4) {
                c2443e.m4378L(iMin4);
                c2490e.f9089b = true;
            }
            if (mode == i37 && mode2 == i37) {
                ArrayList arrayList3 = (ArrayList) c2490e.f9093f;
                C2443e c2443e3 = (C2443e) c2490e.f9091d;
                if (c2490e.f9089b || c2490e.f9090c) {
                    ArrayList arrayList4 = c2443e3.f8900q0;
                    int size6 = arrayList4.size();
                    z8 = z14;
                    int i38 = 0;
                    while (i38 < size6) {
                        Object obj = arrayList4.get(i38);
                        int i39 = i38 + 1;
                        C2442d c2442d2 = (C2442d) obj;
                        c2442d2.m4389h();
                        c2442d2.f8846a = false;
                        c2442d2.f8852d.m4492n();
                        c2442d2.f8854e.m4495m();
                        arrayList4 = arrayList4;
                        i38 = i39;
                    }
                    c2443e3.m4389h();
                    i19 = 0;
                    c2443e3.f8846a = false;
                    c2443e3.f8852d.m4492n();
                    c2443e3.f8854e.m4495m();
                    c2490e.f9090c = false;
                } else {
                    z8 = z14;
                    i19 = 0;
                }
                c2490e.m4471b((C2443e) c2490e.f9092e);
                c2443e3.f8844Y = i19;
                int[] iArr3 = c2443e3.f8877p0;
                c2443e3.f8845Z = i19;
                int iM4391j = c2443e3.m4391j(i19);
                int iM4391j2 = c2443e3.m4391j(1);
                if (c2490e.f9089b) {
                    c2490e.m4472c();
                }
                int iM4397r = c2443e3.m4397r();
                c2719f = c2719f5;
                int iM4398s = c2443e3.m4398s();
                arrayList = arrayList2;
                c2443e3.f8852d.f9129h.mo4479d(iM4397r);
                c2443e3.f8854e.f9129h.mo4479d(iM4398s);
                c2490e.m4476g();
                if (iM4391j == 2 || iM4391j2 == 2) {
                    if (zM4427c) {
                        int size7 = arrayList3.size();
                        i20 = iM4397r;
                        int i40 = 0;
                        while (true) {
                            if (i40 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i40);
                            i40++;
                            if (!((AbstractC2500o) obj2).mo4467k()) {
                                zM4427c = false;
                                break;
                            }
                        }
                    } else {
                        i20 = iM4397r;
                    }
                    if (zM4427c && iM4391j == 2) {
                        c2443e3.m4379M(1);
                        c2443e3.m4381O(c2490e.m4473d(c2443e3, 0));
                        c2443e3.f8852d.f9126e.mo4479d(c2443e3.m4396q());
                    }
                    if (zM4427c && iM4391j2 == 2) {
                        i21 = 1;
                        c2443e3.m4380N(1);
                        c2443e3.m4378L(c2490e.m4473d(c2443e3, 1));
                        c2443e3.f8854e.f9126e.mo4479d(c2443e3.m4392k());
                    }
                    i22 = iArr3[0];
                    if (i22 != i21 || i22 == 4) {
                        int iM4396q3 = c2443e3.m4396q() + i20;
                        c2443e3.f8852d.f9130i.mo4479d(iM4396q3);
                        c2443e3.f8852d.f9126e.mo4479d(iM4396q3 - i20);
                        c2490e.m4476g();
                        i23 = iArr3[1];
                        if (i23 != 1 || i23 == 4) {
                            int iM4392k2 = c2443e3.m4392k() + iM4398s;
                            c2443e3.f8854e.f9130i.mo4479d(iM4392k2);
                            c2443e3.f8854e.f9126e.mo4479d(iM4392k2 - iM4398s);
                        }
                        c2490e.m4476g();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    size = arrayList3.size();
                    i24 = 0;
                    while (i24 < size) {
                        Object obj3 = arrayList3.get(i24);
                        i24++;
                        AbstractC2500o abstractC2500o = (AbstractC2500o) obj3;
                        if (abstractC2500o.f9123b != c2443e3 || abstractC2500o.f9128g) {
                            abstractC2500o.mo4464e();
                        }
                    }
                    size2 = arrayList3.size();
                    i25 = 0;
                    while (i25 < size2) {
                        Object obj4 = arrayList3.get(i25);
                        i25++;
                        AbstractC2500o abstractC2500o2 = (AbstractC2500o) obj4;
                        if (z10 || abstractC2500o2.f9123b != c2443e3) {
                            if (!abstractC2500o2.f9129h.f9106j || ((!abstractC2500o2.f9130i.f9106j && !(abstractC2500o2 instanceof C2494i)) || (!abstractC2500o2.f9126e.f9106j && !(abstractC2500o2 instanceof C2488c) && !(abstractC2500o2 instanceof C2494i)))) {
                                zM4409T = false;
                                break;
                            }
                        }
                    }
                    zM4409T = true;
                    c2443e3.m4379M(iM4391j);
                    c2443e3.m4380N(iM4391j2);
                    i12 = 2;
                    i18 = 1073741824;
                } else {
                    i20 = iM4397r;
                }
                i21 = 1;
                i22 = iArr3[0];
                if (i22 != i21) {
                    int iM4396q32 = c2443e3.m4396q() + i20;
                    c2443e3.f8852d.f9130i.mo4479d(iM4396q32);
                    c2443e3.f8852d.f9126e.mo4479d(iM4396q32 - i20);
                    c2490e.m4476g();
                    i23 = iArr3[1];
                    if (i23 != 1) {
                        int iM4392k22 = c2443e3.m4392k() + iM4398s;
                        c2443e3.f8854e.f9130i.mo4479d(iM4392k22);
                        c2443e3.f8854e.f9126e.mo4479d(iM4392k22 - iM4398s);
                        c2490e.m4476g();
                        z10 = true;
                        size = arrayList3.size();
                        i24 = 0;
                        while (i24 < size) {
                        }
                        size2 = arrayList3.size();
                        i25 = 0;
                        while (i25 < size2) {
                        }
                        zM4409T = true;
                        c2443e3.m4379M(iM4391j);
                        c2443e3.m4380N(iM4391j2);
                        i12 = 2;
                        i18 = 1073741824;
                    }
                }
            } else {
                z8 = z14;
                arrayList = arrayList2;
                c2719f = c2719f5;
                C2443e c2443e4 = (C2443e) c2490e.f9091d;
                if (c2490e.f9089b) {
                    ArrayList arrayList5 = c2443e4.f8900q0;
                    int size8 = arrayList5.size();
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj5 = arrayList5.get(i41);
                        i41++;
                        C2442d c2442d3 = (C2442d) obj5;
                        c2442d3.m4389h();
                        c2442d3.f8846a = false;
                        C2496k c2496k2 = c2442d3.f8852d;
                        ArrayList arrayList6 = arrayList5;
                        c2496k2.f9126e.f9106j = false;
                        c2496k2.f9128g = false;
                        c2496k2.m4492n();
                        C2498m c2498m2 = c2442d3.f8854e;
                        c2498m2.f9126e.f9106j = false;
                        c2498m2.f9128g = false;
                        c2498m2.m4495m();
                        arrayList5 = arrayList6;
                    }
                    i17 = 0;
                    c2443e4.m4389h();
                    c2443e4.f8846a = false;
                    C2496k c2496k3 = c2443e4.f8852d;
                    c2496k3.f9126e.f9106j = false;
                    c2496k3.f9128g = false;
                    c2496k3.m4492n();
                    C2498m c2498m3 = c2443e4.f8854e;
                    c2498m3.f9126e.f9106j = false;
                    c2498m3.f9128g = false;
                    c2498m3.m4495m();
                    c2490e.m4472c();
                } else {
                    i17 = 0;
                }
                c2490e.m4471b((C2443e) c2490e.f9092e);
                c2443e4.f8844Y = i17;
                c2443e4.f8845Z = i17;
                c2443e4.f8852d.f9129h.mo4479d(i17);
                c2443e4.f8854e.f9129h.mo4479d(i17);
                i18 = 1073741824;
                if (mode == 1073741824) {
                    zM4409T = c2443e.m4409T(i17, zM4427c);
                    i12 = 1;
                } else {
                    i12 = 0;
                    zM4409T = true;
                }
                if (mode2 == 1073741824) {
                    zM4409T &= c2443e.m4409T(1, zM4427c);
                    i12++;
                }
            }
            if (zM4409T) {
                c2443e.mo4382P(mode == i18, mode2 == i18);
            }
        } else {
            z8 = z14;
            arrayList = arrayList2;
            c2719f = c2719f5;
            i12 = 0;
            zM4409T = false;
        }
        if (zM4409T && i12 == 2) {
            return;
        }
        int i42 = c2443e.f8891D0;
        if (i10 > 0) {
            int size9 = c2443e.f8900q0.size();
            boolean zM4411W = c2443e.m4411W(64);
            C2719f c2719f6 = c2443e.f8904u0;
            for (int i43 = 0; i43 < size9; i43++) {
                C2442d c2442d4 = (C2442d) c2443e.f8900q0.get(i43);
                if (!(c2442d4 instanceof C2446h) && !(c2442d4 instanceof C2439a) && !c2442d4.f8825F && (!zM4411W || (c2496k = c2442d4.f8852d) == null || (c2498m = c2442d4.f8854e) == null || !c2496k.f9126e.f9106j || !c2498m.f9126e.f9106j)) {
                    int iM4391j3 = c2442d4.m4391j(0);
                    int iM4391j4 = c2442d4.m4391j(1);
                    boolean z15 = iM4391j3 == 3 && c2442d4.f8879r != 1 && iM4391j4 == 3 && c2442d4.f8880s != 1;
                    if (!z15 && c2443e.m4411W(1) && !(c2442d4 instanceof C2445g)) {
                        if (iM4391j3 == 3 && c2442d4.f8879r == 0 && iM4391j4 != 3 && !c2442d4.m4403x()) {
                            z15 = true;
                        }
                        if (iM4391j4 == 3 && c2442d4.f8880s == 0 && iM4391j3 != 3 && !c2442d4.m4403x()) {
                            z15 = true;
                        }
                        if ((iM4391j3 == 3 || iM4391j4 == 3) && c2442d4.f8842W > 0.0f) {
                            z15 = true;
                        }
                    }
                    if (!z15) {
                        c0073c.m272E(0, c2442d4, c2719f6);
                    }
                }
            }
            ConstraintLayout constraintLayout = c2719f6.f9955a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f786k;
            for (int i44 = 0; i44 < childCount2; i44++) {
                constraintLayout.getChildAt(i44);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i45 = 0; i45 < size10; i45++) {
                    ((AbstractC2716c) arrayList7.get(i45)).getClass();
                }
            }
        }
        c0073c.m277M(c2443e);
        int size11 = arrayList.size();
        if (i10 > 0) {
            c0073c.m276J(c2443e, 0, iM4396q2, iM4392k);
        }
        if (size11 > 0) {
            int[] iArr4 = c2443e.f8877p0;
            boolean z16 = iArr4[0] == 2;
            boolean z17 = iArr4[1] == 2;
            int iMax7 = Math.max(c2443e.m4396q(), c2443e2.f8849b0);
            int iMax8 = Math.max(c2443e.m4392k(), c2443e2.f8851c0);
            int i46 = 0;
            boolean zM272E = false;
            while (i46 < size11) {
                ArrayList arrayList8 = arrayList;
                C2442d c2442d5 = (C2442d) arrayList8.get(i46);
                if (c2442d5 instanceof C2445g) {
                    int iM4396q4 = c2442d5.m4396q();
                    int iM4392k3 = c2442d5.m4392k();
                    z9 = z17;
                    i16 = i46;
                    c2719f3 = c2719f;
                    boolean zM272E2 = zM272E | c0073c.m272E(1, c2442d5, c2719f3);
                    int iM4396q5 = c2442d5.m4396q();
                    boolean z18 = zM272E2;
                    int iM4392k4 = c2442d5.m4392k();
                    if (iM4396q5 != iM4396q4) {
                        c2442d5.m4381O(iM4396q5);
                        if (z16 && c2442d5.m4397r() + c2442d5.f8840U > iMax7) {
                            iMax7 = Math.max(iMax7, c2442d5.mo4390i(4).m4359e() + c2442d5.m4397r() + c2442d5.f8840U);
                        }
                        z18 = true;
                    }
                    if (iM4392k4 != iM4392k3) {
                        c2442d5.m4378L(iM4392k4);
                        if (z9 && c2442d5.m4398s() + c2442d5.f8841V > iMax8) {
                            iMax8 = Math.max(iMax8, c2442d5.mo4390i(5).m4359e() + c2442d5.m4398s() + c2442d5.f8841V);
                        }
                        z18 = true;
                    }
                    zM272E = z18 | ((C2445g) c2442d5).f8962y0;
                } else {
                    z9 = z17;
                    i16 = i46;
                    c2719f3 = c2719f;
                }
                i46 = i16 + 1;
                c2719f = c2719f3;
                arrayList = arrayList8;
                z17 = z9;
            }
            boolean z19 = z17;
            ArrayList arrayList9 = arrayList;
            int i47 = 0;
            while (true) {
                C2719f c2719f7 = c2719f;
                if (i47 >= 2) {
                    break;
                }
                int i48 = 0;
                while (i48 < size11) {
                    C2442d c2442d6 = (C2442d) arrayList9.get(i48);
                    if ((!(c2442d6 instanceof AbstractC2447i) || (c2442d6 instanceof C2445g)) && !(c2442d6 instanceof C2446h)) {
                        i13 = size11;
                        if (c2442d6.f8859g0 != 8 && ((!z8 || !c2442d6.f8852d.f9126e.f9106j || !c2442d6.f8854e.f9126e.f9106j) && !(c2442d6 instanceof C2445g))) {
                            int iM4396q6 = c2442d6.m4396q();
                            int iM4392k5 = c2442d6.m4392k();
                            i14 = i48;
                            int i49 = c2442d6.f8847a0;
                            zM272E |= c0073c.m272E(i47 == 1 ? 2 : 1, c2442d6, c2719f7);
                            c2719f2 = c2719f7;
                            int iM4396q7 = c2442d6.m4396q();
                            i15 = i47;
                            int iM4392k6 = c2442d6.m4392k();
                            if (iM4396q7 != iM4396q6) {
                                c2442d6.m4381O(iM4396q7);
                                if (z16 && c2442d6.m4397r() + c2442d6.f8840U > iMax7) {
                                    iMax7 = Math.max(iMax7, c2442d6.mo4390i(4).m4359e() + c2442d6.m4397r() + c2442d6.f8840U);
                                }
                                zM272E = true;
                            }
                            if (iM4392k6 != iM4392k5) {
                                c2442d6.m4378L(iM4392k6);
                                if (z19 && c2442d6.m4398s() + c2442d6.f8841V > iMax8) {
                                    iMax8 = Math.max(iMax8, c2442d6.mo4390i(5).m4359e() + c2442d6.m4398s() + c2442d6.f8841V);
                                }
                                zM272E = true;
                            }
                            if (c2442d6.f8824E && i49 != c2442d6.f8847a0) {
                                zM272E = true;
                            }
                        }
                        i48 = i14 + 1;
                        size11 = i13;
                        c2719f7 = c2719f2;
                        i47 = i15;
                    } else {
                        i13 = size11;
                    }
                    c2719f2 = c2719f7;
                    i15 = i47;
                    i14 = i48;
                    i48 = i14 + 1;
                    size11 = i13;
                    c2719f7 = c2719f2;
                    i47 = i15;
                }
                int i50 = size11;
                c2719f = c2719f7;
                int i51 = i47;
                if (!zM272E) {
                    break;
                }
                int i52 = i51 + 1;
                c0073c.m276J(c2443e, i52, iM4396q2, iM4392k);
                i47 = i52;
                size11 = i50;
                zM272E = false;
            }
        }
        c2443e.f8891D0 = i42;
        C2330c.f8151q = c2443e.m4411W(512);
    }

    /* renamed from: l */
    public final void m501l(C2442d c2442d, C2718e c2718e, SparseArray sparseArray, int i, int i4) {
        View view = (View) this.f785j.get(i);
        C2442d c2442d2 = (C2442d) sparseArray.get(i);
        if (c2442d2 == null || view == null || !(view.getLayoutParams() instanceof C2718e)) {
            return;
        }
        c2718e.f9918c0 = true;
        if (i4 == 6) {
            C2718e c2718e2 = (C2718e) view.getLayoutParams();
            c2718e2.f9918c0 = true;
            c2718e2.f9944p0.f8824E = true;
        }
        c2442d.mo4390i(6).m4356b(c2442d2.mo4390i(i4), c2718e.f9890D, c2718e.f9889C, true);
        c2442d.f8824E = true;
        c2442d.mo4390i(3).m4364j();
        c2442d.mo4390i(5).m4364j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C2718e c2718e = (C2718e) childAt.getLayoutParams();
            C2442d c2442d = c2718e.f9944p0;
            if (childAt.getVisibility() != 8 || c2718e.f9920d0 || c2718e.f9922e0 || zIsInEditMode) {
                int iM4397r = c2442d.m4397r();
                int iM4398s = c2442d.m4398s();
                childAt.layout(iM4397r, iM4398s, c2442d.m4396q() + iM4397r, c2442d.m4392k() + iM4398s);
            }
        }
        ArrayList arrayList = this.f786k;
        int size = arrayList.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC2716c) arrayList.get(i11)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0552  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i4) throws Resources.NotFoundException, NumberFormatException {
        boolean z7;
        int i8;
        boolean z8;
        C2442d c2442d;
        int i9;
        C2442d c2442d2;
        int i10;
        int i11;
        int i12;
        C2442d c2442d3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C2442d c2442d4;
        int i18;
        int i19;
        C2442d c2442d5;
        C2718e c2718e;
        int i20;
        C2442d c2442d6;
        float f8;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        float fAbs;
        int i26;
        char c8;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int iM4781f;
        int i27;
        C2442d c2442d7;
        ConstraintLayout constraintLayout = this;
        boolean z9 = constraintLayout.f792q;
        constraintLayout.f792q = z9;
        int i28 = 1;
        int i29 = 0;
        if (!z9) {
            int childCount = constraintLayout.getChildCount();
            int i30 = 0;
            while (true) {
                if (i30 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i30).isLayoutRequested()) {
                    constraintLayout.f792q = true;
                    break;
                }
                i30++;
            }
        }
        boolean z10 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C2443e c2443e = constraintLayout.f787l;
        c2443e.f8905v0 = z10;
        if (constraintLayout.f792q) {
            constraintLayout.f792q = false;
            int childCount2 = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount2) {
                    z7 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                        z7 = true;
                        break;
                    }
                    i31++;
                }
            }
            if (z7) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i32 = 0; i32 < childCount3; i32++) {
                    C2442d c2442dM497h = constraintLayout.m497h(constraintLayout.getChildAt(i32));
                    if (c2442dM497h != null) {
                        c2442dM497h.mo4371C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f785j;
                if (zIsInEditMode) {
                    int i33 = 0;
                    while (i33 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i33);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i27 = i28;
                                try {
                                    if (constraintLayout.f797v == null) {
                                        constraintLayout.f797v = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.f797v.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i27 = i28;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray3.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c2442d7 = c2443e;
                                    c2442d7.f8861h0 = resourceName;
                                } else {
                                    c2442d7 = viewFindViewById == null ? null : ((C2718e) viewFindViewById.getLayoutParams()).f9944p0;
                                    c2442d7.f8861h0 = resourceName;
                                }
                            } else {
                                c2442d7 = c2443e;
                                c2442d7.f8861h0 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused2) {
                            i27 = i28;
                        }
                        i33++;
                        i28 = i27;
                    }
                }
                int i34 = i28;
                if (constraintLayout.f796u != -1) {
                    for (int i35 = 0; i35 < childCount3; i35++) {
                        constraintLayout.getChildAt(i35).getId();
                    }
                }
                C2727n c2727n = constraintLayout.f794s;
                if (c2727n != null) {
                    c2727n.m4801a(constraintLayout);
                }
                c2443e.f8900q0.clear();
                ArrayList arrayList3 = constraintLayout.f786k;
                int size = arrayList3.size();
                if (size > 0) {
                    int i36 = 0;
                    while (i36 < size) {
                        AbstractC2716c abstractC2716c = (AbstractC2716c) arrayList3.get(i36);
                        HashMap map = abstractC2716c.f9885p;
                        if (abstractC2716c.isInEditMode()) {
                            abstractC2716c.setIds(abstractC2716c.f9883n);
                        }
                        AbstractC2447i abstractC2447i = abstractC2716c.f9882m;
                        if (abstractC2447i == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            abstractC2447i.f8971r0 = i29;
                            Arrays.fill(abstractC2447i.f8970q0, (Object) null);
                            int i37 = i29;
                            while (i37 < abstractC2716c.f9880k) {
                                int i38 = abstractC2716c.f9879j[i37];
                                View view = (View) sparseArray3.get(i38);
                                if (view != null || (iM4781f = abstractC2716c.m4781f(constraintLayout, (str = (String) map.get(Integer.valueOf(i38))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    abstractC2716c.f9879j[i37] = iM4781f;
                                    map.put(Integer.valueOf(iM4781f), str);
                                    view = (View) sparseArray3.get(iM4781f);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    AbstractC2447i abstractC2447i2 = abstractC2716c.f9882m;
                                    C2442d c2442dM497h2 = constraintLayout.m497h(view2);
                                    abstractC2447i2.getClass();
                                    if (c2442dM497h2 == abstractC2447i2 || c2442dM497h2 == null) {
                                        sparseArray2 = sparseArray3;
                                    } else {
                                        int i39 = abstractC2447i2.f8971r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        C2442d[] c2442dArr = abstractC2447i2.f8970q0;
                                        if (i39 > c2442dArr.length) {
                                            abstractC2447i2.f8970q0 = (C2442d[]) Arrays.copyOf(c2442dArr, c2442dArr.length * 2);
                                        }
                                        C2442d[] c2442dArr2 = abstractC2447i2.f8970q0;
                                        int i40 = abstractC2447i2.f8971r0;
                                        c2442dArr2[i40] = c2442dM497h2;
                                        abstractC2447i2.f8971r0 = i40 + 1;
                                    }
                                }
                                i37++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            abstractC2716c.f9882m.mo4418S();
                        }
                        i36++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i29 = 0;
                    }
                }
                int i41 = 2;
                for (int i42 = 0; i42 < childCount3; i42++) {
                    constraintLayout.getChildAt(i42);
                }
                SparseArray sparseArray4 = constraintLayout.f798w;
                sparseArray4.clear();
                sparseArray4.put(0, c2443e);
                sparseArray4.put(constraintLayout.getId(), c2443e);
                for (int i43 = 0; i43 < childCount3; i43++) {
                    View childAt2 = constraintLayout.getChildAt(i43);
                    sparseArray4.put(childAt2.getId(), constraintLayout.m497h(childAt2));
                }
                int i44 = 0;
                while (i44 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i44);
                    C2442d c2442dM497h3 = constraintLayout.m497h(childAt3);
                    if (c2442dM497h3 == null) {
                        i8 = i44;
                        z8 = z7;
                        i23 = i41;
                    } else {
                        C2718e c2718e2 = (C2718e) childAt3.getLayoutParams();
                        c2443e.f8900q0.add(c2442dM497h3);
                        C2442d c2442d8 = c2442dM497h3.f8839T;
                        if (c2442d8 != null) {
                            ((C2443e) c2442d8).f8900q0.remove(c2442dM497h3);
                            c2442dM497h3.mo4371C();
                        }
                        c2442dM497h3.f8839T = c2443e;
                        c2718e2.m4784a();
                        c2442dM497h3.f8859g0 = childAt3.getVisibility();
                        c2442dM497h3.f8857f0 = childAt3;
                        if (childAt3 instanceof AbstractC2716c) {
                            ((AbstractC2716c) childAt3).mo494h(c2442dM497h3, c2443e.f8905v0);
                        }
                        if (c2718e2.f9920d0) {
                            C2446h c2446h = (C2446h) c2442dM497h3;
                            int i45 = c2718e2.f9938m0;
                            int i46 = c2718e2.f9940n0;
                            float f9 = c2718e2.f9942o0;
                            if (f9 != -1.0f) {
                                if (f9 > -1.0f) {
                                    c2446h.f8964q0 = f9;
                                    c8 = '\uffff';
                                    c2446h.f8965r0 = -1;
                                    c2446h.f8966s0 = -1;
                                    i8 = i44;
                                    z8 = z7;
                                    i23 = i41;
                                }
                                i8 = i44;
                                z8 = z7;
                                i23 = i41;
                            } else {
                                c8 = '\uffff';
                                if (i45 != -1) {
                                    if (i45 > -1) {
                                        c2446h.f8964q0 = -1.0f;
                                        c2446h.f8965r0 = i45;
                                        c2446h.f8966s0 = -1;
                                    }
                                } else if (i46 != -1 && i46 > -1) {
                                    c2446h.f8964q0 = -1.0f;
                                    c2446h.f8965r0 = -1;
                                    c2446h.f8966s0 = i46;
                                    i8 = i44;
                                    z8 = z7;
                                    i23 = i41;
                                }
                                i8 = i44;
                                z8 = z7;
                                i23 = i41;
                            }
                        } else {
                            int i47 = c2718e2.f9924f0;
                            int i48 = c2718e2.f9926g0;
                            int i49 = c2718e2.f9928h0;
                            int i50 = c2718e2.f9930i0;
                            int i51 = c2718e2.f9932j0;
                            int i52 = c2718e2.f9934k0;
                            i8 = i44;
                            float f10 = c2718e2.f9936l0;
                            int i53 = c2718e2.f9943p;
                            z8 = z7;
                            if (i53 != -1) {
                                C2442d c2442d9 = (C2442d) sparseArray4.get(i53);
                                if (c2442d9 != null) {
                                    float f11 = c2718e2.f9946r;
                                    c2442dM497h3.m4401v(7, 7, c2718e2.f9945q, 0, c2442d9);
                                    c2442dM497h3.f8823D = f11;
                                }
                                constraintLayout = this;
                                c2442d6 = c2442dM497h3;
                                c2718e = c2718e2;
                                i13 = 4;
                                i12 = 2;
                            } else {
                                if (i47 != -1) {
                                    C2442d c2442d10 = (C2442d) sparseArray4.get(i47);
                                    if (c2442d10 != null) {
                                        c2442d = c2442dM497h3;
                                        i9 = 2;
                                        c2442d.m4401v(2, 2, ((ViewGroup.MarginLayoutParams) c2718e2).leftMargin, i51, c2442d10);
                                    } else {
                                        c2442d = c2442dM497h3;
                                        i9 = 2;
                                    }
                                } else {
                                    c2442d = c2442dM497h3;
                                    i9 = 2;
                                    if (i48 != -1 && (c2442d2 = (C2442d) sparseArray4.get(i48)) != null) {
                                        c2442d.m4401v(2, 4, ((ViewGroup.MarginLayoutParams) c2718e2).leftMargin, i51, c2442d2);
                                        i10 = 2;
                                        i11 = 4;
                                    }
                                    if (i49 == -1) {
                                        C2442d c2442d11 = (C2442d) sparseArray4.get(i49);
                                        if (c2442d11 != null) {
                                            c2442d.m4401v(i11, i10, ((ViewGroup.MarginLayoutParams) c2718e2).rightMargin, i52, c2442d11);
                                        }
                                        i12 = i10;
                                    } else {
                                        i12 = i10;
                                        if (i50 != -1 && (c2442d3 = (C2442d) sparseArray4.get(i50)) != null) {
                                            c2442d.m4401v(i11, i11, ((ViewGroup.MarginLayoutParams) c2718e2).rightMargin, i52, c2442d3);
                                        }
                                    }
                                    i13 = i11;
                                    i14 = c2718e2.f9929i;
                                    if (i14 == -1) {
                                        C2442d c2442d12 = (C2442d) sparseArray4.get(i14);
                                        if (c2442d12 != null) {
                                            i21 = 3;
                                            c2442d.m4401v(3, 3, ((ViewGroup.MarginLayoutParams) c2718e2).topMargin, c2718e2.f9952x, c2442d12);
                                        } else {
                                            i21 = 3;
                                        }
                                        i16 = i21;
                                        i17 = 5;
                                        i15 = -1;
                                    } else {
                                        int i54 = c2718e2.f9931j;
                                        i15 = -1;
                                        if (i54 == -1 || (c2442d4 = (C2442d) sparseArray4.get(i54)) == null) {
                                            i16 = 3;
                                            i17 = 5;
                                        } else {
                                            c2442d.m4401v(3, 5, ((ViewGroup.MarginLayoutParams) c2718e2).topMargin, c2718e2.f9952x, c2442d4);
                                            i16 = 3;
                                            i17 = 5;
                                        }
                                    }
                                    i18 = c2718e2.f9933k;
                                    if (i18 == i15) {
                                        C2442d c2442d13 = (C2442d) sparseArray4.get(i18);
                                        if (c2442d13 != null) {
                                            int i55 = i16;
                                            c2442d.m4401v(i17, i55, ((ViewGroup.MarginLayoutParams) c2718e2).bottomMargin, c2718e2.f9954z, c2442d13);
                                            i19 = i55;
                                        } else {
                                            i19 = i16;
                                        }
                                    } else {
                                        i19 = i16;
                                        int i56 = c2718e2.f9935l;
                                        if (i56 != i15 && (c2442d5 = (C2442d) sparseArray4.get(i56)) != null) {
                                            c2442d.m4401v(i17, i17, ((ViewGroup.MarginLayoutParams) c2718e2).bottomMargin, c2718e2.f9954z, c2442d5);
                                        }
                                    }
                                    c2718e = c2718e2;
                                    i20 = c2718e.f9937m;
                                    if (i20 == -1) {
                                        constraintLayout = this;
                                        c2442d6 = c2442d;
                                        constraintLayout.m501l(c2442d6, c2718e, sparseArray4, i20, 6);
                                    } else {
                                        int i57 = c2718e.f9939n;
                                        if (i57 != -1) {
                                            constraintLayout = this;
                                            c2442d6 = c2442d;
                                            constraintLayout.m501l(c2442d6, c2718e, sparseArray4, i57, i19);
                                        } else {
                                            int i58 = c2718e.f9941o;
                                            constraintLayout = this;
                                            c2442d6 = c2442d;
                                            int i59 = i17;
                                            if (i58 != -1) {
                                                constraintLayout.m501l(c2442d6, c2718e, sparseArray4, i58, i59);
                                            }
                                            if (f10 >= 0.0f) {
                                                c2442d6.f8853d0 = f10;
                                            }
                                            f8 = c2718e.f9892F;
                                            if (f8 >= 0.0f) {
                                                c2442d6.f8855e0 = f8;
                                            }
                                        }
                                    }
                                    if (f10 >= 0.0f) {
                                    }
                                    f8 = c2718e.f9892F;
                                    if (f8 >= 0.0f) {
                                    }
                                }
                                i10 = i9;
                                i11 = 4;
                                if (i49 == -1) {
                                }
                                i13 = i11;
                                i14 = c2718e2.f9929i;
                                if (i14 == -1) {
                                }
                                i18 = c2718e2.f9933k;
                                if (i18 == i15) {
                                }
                                c2718e = c2718e2;
                                i20 = c2718e.f9937m;
                                if (i20 == -1) {
                                }
                                if (f10 >= 0.0f) {
                                }
                                f8 = c2718e.f9892F;
                                if (f8 >= 0.0f) {
                                }
                            }
                            if (zIsInEditMode && ((i26 = c2718e.f9906T) != -1 || c2718e.f9907U != -1)) {
                                int i60 = c2718e.f9907U;
                                c2442d6.f8844Y = i26;
                                c2442d6.f8845Z = i60;
                            }
                            if (c2718e.f9914a0) {
                                c2442d6.m4379M(i34);
                                c2442d6.m4381O(((ViewGroup.MarginLayoutParams) c2718e).width);
                                if (((ViewGroup.MarginLayoutParams) c2718e).width == -2) {
                                    c2442d6.m4379M(i41);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c2718e).width == -1) {
                                if (c2718e.f9909W) {
                                    c2442d6.m4379M(3);
                                } else {
                                    c2442d6.m4379M(4);
                                }
                                c2442d6.mo4390i(i12).f8817g = ((ViewGroup.MarginLayoutParams) c2718e).leftMargin;
                                c2442d6.mo4390i(i13).f8817g = ((ViewGroup.MarginLayoutParams) c2718e).rightMargin;
                            } else {
                                c2442d6.m4379M(3);
                                c2442d6.m4381O(0);
                            }
                            if (c2718e.f9916b0) {
                                i22 = -1;
                                c2442d6.m4380N(1);
                                c2442d6.m4378L(((ViewGroup.MarginLayoutParams) c2718e).height);
                                if (((ViewGroup.MarginLayoutParams) c2718e).height == -2) {
                                    c2442d6.m4380N(2);
                                }
                            } else {
                                i22 = -1;
                                if (((ViewGroup.MarginLayoutParams) c2718e).height == -1) {
                                    if (c2718e.f9910X) {
                                        c2442d6.m4380N(3);
                                    } else {
                                        c2442d6.m4380N(4);
                                    }
                                    c2442d6.mo4390i(3).f8817g = ((ViewGroup.MarginLayoutParams) c2718e).topMargin;
                                    c2442d6.mo4390i(5).f8817g = ((ViewGroup.MarginLayoutParams) c2718e).bottomMargin;
                                } else {
                                    c2442d6.m4380N(3);
                                    c2442d6.m4378L(0);
                                }
                            }
                            String str2 = c2718e.f9893G;
                            if (str2 == null || str2.length() == 0) {
                                c2442d6.f8842W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i24 = i22;
                                    i25 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i24 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i22;
                                    i25 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i25);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c2442d6.f8842W = fAbs;
                                        c2442d6.f8843X = i24;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i25, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f12 = Float.parseFloat(strSubstring3);
                                            float f13 = Float.parseFloat(strSubstring4);
                                            if (f12 > 0.0f && f13 > 0.0f) {
                                                fAbs = i24 == 1 ? Math.abs(f13 / f12) : Math.abs(f12 / f13);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f14 = c2718e.f9894H;
                            float[] fArr = c2442d6.f8867k0;
                            fArr[0] = f14;
                            i34 = 1;
                            fArr[1] = c2718e.f9895I;
                            c2442d6.f8863i0 = c2718e.f9896J;
                            c2442d6.f8865j0 = c2718e.f9897K;
                            int i61 = c2718e.f9912Z;
                            if (i61 >= 0 && i61 <= 3) {
                                c2442d6.f8878q = i61;
                            }
                            int i62 = c2718e.f9898L;
                            int i63 = c2718e.f9900N;
                            int i64 = c2718e.f9902P;
                            float f15 = c2718e.f9904R;
                            c2442d6.f8879r = i62;
                            c2442d6.f8882u = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            c2442d6.f8883v = i64;
                            c2442d6.f8884w = f15;
                            if (f15 > 0.0f && f15 < 1.0f && i62 == 0) {
                                c2442d6.f8879r = 2;
                            }
                            int i65 = c2718e.f9899M;
                            int i66 = c2718e.f9901O;
                            int i67 = c2718e.f9903Q;
                            float f16 = c2718e.f9905S;
                            c2442d6.f8880s = i65;
                            c2442d6.f8885x = i66;
                            if (i67 == Integer.MAX_VALUE) {
                                i67 = 0;
                            }
                            c2442d6.f8886y = i67;
                            c2442d6.f8887z = f16;
                            if (f16 <= 0.0f || f16 >= 1.0f || i65 != 0) {
                                i23 = 2;
                            } else {
                                i23 = 2;
                                c2442d6.f8880s = 2;
                            }
                        }
                    }
                    i44 = i8 + 1;
                    i41 = i23;
                    z7 = z8;
                }
            }
            if (z7) {
                c2443e.f8901r0.m277M(c2443e);
            }
        }
        c2443e.f8906w0.getClass();
        constraintLayout.m500k(c2443e, constraintLayout.f793r, i, i4);
        int iM4396q = c2443e.m4396q();
        int iM4392k = c2443e.m4392k();
        boolean z11 = c2443e.f8892E0;
        boolean z12 = c2443e.f8893F0;
        C2719f c2719f = constraintLayout.f799x;
        int i68 = c2719f.f9959e;
        int iResolveSizeAndState = View.resolveSizeAndState(iM4396q + c2719f.f9958d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM4392k + i68, i4, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f790o, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f791p, iResolveSizeAndState2);
        if (z11) {
            iMin |= C2122f.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z12) {
            iMin2 |= C2122f.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C2442d c2442dM497h = m497h(view);
        if ((view instanceof Guideline) && !(c2442dM497h instanceof C2446h)) {
            C2718e c2718e = (C2718e) view.getLayoutParams();
            C2446h c2446h = new C2446h();
            c2718e.f9944p0 = c2446h;
            c2718e.f9920d0 = true;
            c2446h.m4423S(c2718e.f9908V);
        }
        if (view instanceof AbstractC2716c) {
            AbstractC2716c abstractC2716c = (AbstractC2716c) view;
            abstractC2716c.m4783i();
            ((C2718e) view.getLayoutParams()).f9922e0 = true;
            ArrayList arrayList = this.f786k;
            if (!arrayList.contains(abstractC2716c)) {
                arrayList.add(abstractC2716c);
            }
        }
        this.f785j.put(view.getId(), view);
        this.f792q = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f785j.remove(view.getId());
        C2442d c2442dM497h = m497h(view);
        this.f787l.f8900q0.remove(c2442dM497h);
        c2442dM497h.mo4371C();
        this.f786k.remove(view);
        this.f792q = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f792q = true;
        super.requestLayout();
    }

    public void setConstraintSet(C2727n c2727n) {
        this.f794s = c2727n;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f785j;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f791p) {
            return;
        }
        this.f791p = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f790o) {
            return;
        }
        this.f790o = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f789n) {
            return;
        }
        this.f789n = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f788m) {
            return;
        }
        this.f788m = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2728o abstractC2728o) {
        C2332e c2332e = this.f795t;
        if (c2332e != null) {
            c2332e.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f793r = i;
        C2443e c2443e = this.f787l;
        c2443e.f8891D0 = i;
        C2330c.f8151q = c2443e.m4411W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        super(context, attributeSet, i);
        this.f785j = new SparseArray();
        this.f786k = new ArrayList(4);
        this.f787l = new C2443e();
        this.f788m = 0;
        this.f789n = 0;
        this.f790o = Integer.MAX_VALUE;
        this.f791p = Integer.MAX_VALUE;
        this.f792q = true;
        this.f793r = 257;
        this.f794s = null;
        this.f795t = null;
        this.f796u = -1;
        this.f797v = new HashMap();
        this.f798w = new SparseArray();
        this.f799x = new C2719f(this, this);
        m498i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C2718e c2718e = new C2718e(layoutParams);
        c2718e.f9913a = -1;
        c2718e.f9915b = -1;
        c2718e.f9917c = -1.0f;
        c2718e.f9919d = true;
        c2718e.f9921e = -1;
        c2718e.f9923f = -1;
        c2718e.f9925g = -1;
        c2718e.f9927h = -1;
        c2718e.f9929i = -1;
        c2718e.f9931j = -1;
        c2718e.f9933k = -1;
        c2718e.f9935l = -1;
        c2718e.f9937m = -1;
        c2718e.f9939n = -1;
        c2718e.f9941o = -1;
        c2718e.f9943p = -1;
        c2718e.f9945q = 0;
        c2718e.f9946r = 0.0f;
        c2718e.f9947s = -1;
        c2718e.f9948t = -1;
        c2718e.f9949u = -1;
        c2718e.f9950v = -1;
        c2718e.f9951w = Integer.MIN_VALUE;
        c2718e.f9952x = Integer.MIN_VALUE;
        c2718e.f9953y = Integer.MIN_VALUE;
        c2718e.f9954z = Integer.MIN_VALUE;
        c2718e.f9887A = Integer.MIN_VALUE;
        c2718e.f9888B = Integer.MIN_VALUE;
        c2718e.f9889C = Integer.MIN_VALUE;
        c2718e.f9890D = 0;
        c2718e.f9891E = 0.5f;
        c2718e.f9892F = 0.5f;
        c2718e.f9893G = null;
        c2718e.f9894H = -1.0f;
        c2718e.f9895I = -1.0f;
        c2718e.f9896J = 0;
        c2718e.f9897K = 0;
        c2718e.f9898L = 0;
        c2718e.f9899M = 0;
        c2718e.f9900N = 0;
        c2718e.f9901O = 0;
        c2718e.f9902P = 0;
        c2718e.f9903Q = 0;
        c2718e.f9904R = 1.0f;
        c2718e.f9905S = 1.0f;
        c2718e.f9906T = -1;
        c2718e.f9907U = -1;
        c2718e.f9908V = -1;
        c2718e.f9909W = false;
        c2718e.f9910X = false;
        c2718e.f9911Y = null;
        c2718e.f9912Z = 0;
        c2718e.f9914a0 = true;
        c2718e.f9916b0 = true;
        c2718e.f9918c0 = false;
        c2718e.f9920d0 = false;
        c2718e.f9922e0 = false;
        c2718e.f9924f0 = -1;
        c2718e.f9926g0 = -1;
        c2718e.f9928h0 = -1;
        c2718e.f9930i0 = -1;
        c2718e.f9932j0 = Integer.MIN_VALUE;
        c2718e.f9934k0 = Integer.MIN_VALUE;
        c2718e.f9936l0 = 0.5f;
        c2718e.f9944p0 = new C2442d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2718e).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c2718e).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c2718e).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c2718e).bottomMargin = marginLayoutParams.bottomMargin;
            c2718e.setMarginStart(marginLayoutParams.getMarginStart());
            c2718e.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C2718e)) {
            return c2718e;
        }
        C2718e c2718e2 = (C2718e) layoutParams;
        c2718e.f9913a = c2718e2.f9913a;
        c2718e.f9915b = c2718e2.f9915b;
        c2718e.f9917c = c2718e2.f9917c;
        c2718e.f9919d = c2718e2.f9919d;
        c2718e.f9921e = c2718e2.f9921e;
        c2718e.f9923f = c2718e2.f9923f;
        c2718e.f9925g = c2718e2.f9925g;
        c2718e.f9927h = c2718e2.f9927h;
        c2718e.f9929i = c2718e2.f9929i;
        c2718e.f9931j = c2718e2.f9931j;
        c2718e.f9933k = c2718e2.f9933k;
        c2718e.f9935l = c2718e2.f9935l;
        c2718e.f9937m = c2718e2.f9937m;
        c2718e.f9939n = c2718e2.f9939n;
        c2718e.f9941o = c2718e2.f9941o;
        c2718e.f9943p = c2718e2.f9943p;
        c2718e.f9945q = c2718e2.f9945q;
        c2718e.f9946r = c2718e2.f9946r;
        c2718e.f9947s = c2718e2.f9947s;
        c2718e.f9948t = c2718e2.f9948t;
        c2718e.f9949u = c2718e2.f9949u;
        c2718e.f9950v = c2718e2.f9950v;
        c2718e.f9951w = c2718e2.f9951w;
        c2718e.f9952x = c2718e2.f9952x;
        c2718e.f9953y = c2718e2.f9953y;
        c2718e.f9954z = c2718e2.f9954z;
        c2718e.f9887A = c2718e2.f9887A;
        c2718e.f9888B = c2718e2.f9888B;
        c2718e.f9889C = c2718e2.f9889C;
        c2718e.f9890D = c2718e2.f9890D;
        c2718e.f9891E = c2718e2.f9891E;
        c2718e.f9892F = c2718e2.f9892F;
        c2718e.f9893G = c2718e2.f9893G;
        c2718e.f9894H = c2718e2.f9894H;
        c2718e.f9895I = c2718e2.f9895I;
        c2718e.f9896J = c2718e2.f9896J;
        c2718e.f9897K = c2718e2.f9897K;
        c2718e.f9909W = c2718e2.f9909W;
        c2718e.f9910X = c2718e2.f9910X;
        c2718e.f9898L = c2718e2.f9898L;
        c2718e.f9899M = c2718e2.f9899M;
        c2718e.f9900N = c2718e2.f9900N;
        c2718e.f9902P = c2718e2.f9902P;
        c2718e.f9901O = c2718e2.f9901O;
        c2718e.f9903Q = c2718e2.f9903Q;
        c2718e.f9904R = c2718e2.f9904R;
        c2718e.f9905S = c2718e2.f9905S;
        c2718e.f9906T = c2718e2.f9906T;
        c2718e.f9907U = c2718e2.f9907U;
        c2718e.f9908V = c2718e2.f9908V;
        c2718e.f9914a0 = c2718e2.f9914a0;
        c2718e.f9916b0 = c2718e2.f9916b0;
        c2718e.f9918c0 = c2718e2.f9918c0;
        c2718e.f9920d0 = c2718e2.f9920d0;
        c2718e.f9924f0 = c2718e2.f9924f0;
        c2718e.f9926g0 = c2718e2.f9926g0;
        c2718e.f9928h0 = c2718e2.f9928h0;
        c2718e.f9930i0 = c2718e2.f9930i0;
        c2718e.f9932j0 = c2718e2.f9932j0;
        c2718e.f9934k0 = c2718e2.f9934k0;
        c2718e.f9936l0 = c2718e2.f9936l0;
        c2718e.f9911Y = c2718e2.f9911Y;
        c2718e.f9912Z = c2718e2.f9912Z;
        c2718e.f9944p0 = c2718e2.f9944p0;
        return c2718e;
    }
}
