package p213z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p206y.AbstractC2783a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z.d */
/* loaded from: classes.dex */
public final class C2866d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC2863a f10572a;

    /* renamed from: b */
    public boolean f10573b;

    /* renamed from: c */
    public final int f10574c;

    /* renamed from: d */
    public final int f10575d;

    /* renamed from: e */
    public final int f10576e;

    /* renamed from: f */
    public final int f10577f;

    /* renamed from: g */
    public final int f10578g;

    /* renamed from: h */
    public int f10579h;

    /* renamed from: i */
    public int f10580i;

    /* renamed from: j */
    public int f10581j;

    /* renamed from: k */
    public View f10582k;

    /* renamed from: l */
    public View f10583l;

    /* renamed from: m */
    public boolean f10584m;

    /* renamed from: n */
    public boolean f10585n;

    /* renamed from: o */
    public final Rect f10586o;

    public C2866d() {
        super(-2, -2);
        this.f10573b = false;
        this.f10574c = 0;
        this.f10575d = 0;
        this.f10576e = -1;
        this.f10577f = -1;
        this.f10578g = 0;
        this.f10579h = 0;
        this.f10586o = new Rect();
    }

    /* renamed from: a */
    public final boolean m4967a(int i) {
        if (i == 0) {
            return this.f10584m;
        }
        if (i != 1) {
            return false;
        }
        return this.f10585n;
    }

    public C2866d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC2863a abstractC2863a;
        super(context, attributeSet);
        this.f10573b = false;
        this.f10574c = 0;
        this.f10575d = 0;
        this.f10576e = -1;
        this.f10577f = -1;
        this.f10578g = 0;
        this.f10579h = 0;
        this.f10586o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2783a.f10344b);
        this.f10574c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f10577f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f10575d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f10576e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f10578g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f10579h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f10573b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f801C;
            if (TextUtils.isEmpty(string)) {
                abstractC2863a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f801C;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f803E;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f802D);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC2863a = (AbstractC2863a) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC0008a1.m25u("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f10572a = abstractC2863a;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC2863a abstractC2863a2 = this.f10572a;
        if (abstractC2863a2 != null) {
            abstractC2863a2.mo1790c(this);
        }
    }

    public C2866d(C2866d c2866d) {
        super((ViewGroup.MarginLayoutParams) c2866d);
        this.f10573b = false;
        this.f10574c = 0;
        this.f10575d = 0;
        this.f10576e = -1;
        this.f10577f = -1;
        this.f10578g = 0;
        this.f10579h = 0;
        this.f10586o = new Rect();
    }

    public C2866d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10573b = false;
        this.f10574c = 0;
        this.f10575d = 0;
        this.f10576e = -1;
        this.f10577f = -1;
        this.f10578g = 0;
        this.f10579h = 0;
        this.f10586o = new Rect();
    }

    public C2866d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10573b = false;
        this.f10574c = 0;
        this.f10575d = 0;
        this.f10576e = -1;
        this.f10577f = -1;
        this.f10578g = 0;
        this.f10579h = 0;
        this.f10586o = new Rect();
    }
}
