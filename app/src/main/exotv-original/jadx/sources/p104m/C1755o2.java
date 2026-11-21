package p104m;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.exotv.net.R;
import p002a1.C0036o;
import p005a4.C0096q;
import p033d4.ExecutorServiceC0846e;
import p186v4.AbstractC2547c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.o2 */
/* loaded from: classes.dex */
public final class C1755o2 {

    /* renamed from: a */
    public final Object f6694a;

    /* renamed from: b */
    public final Object f6695b;

    /* renamed from: c */
    public final Object f6696c;

    /* renamed from: d */
    public final Object f6697d;

    /* renamed from: e */
    public final Object f6698e;

    /* renamed from: f */
    public final Object f6699f;

    /* renamed from: g */
    public final Object f6700g;

    public C1755o2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f6697d = layoutParams;
        this.f6698e = new Rect();
        this.f6699f = new int[2];
        this.f6700g = new int[2];
        this.f6694a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f6695b = viewInflate;
        this.f6696c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C1755o2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public C1755o2(ExecutorServiceC0846e executorServiceC0846e, ExecutorServiceC0846e executorServiceC0846e2, ExecutorServiceC0846e executorServiceC0846e3, ExecutorServiceC0846e executorServiceC0846e4, C0096q c0096q, C0096q c0096q2) {
        this.f6700g = AbstractC2547c.m4561a(150, new C0036o(4, this));
        this.f6694a = executorServiceC0846e;
        this.f6695b = executorServiceC0846e2;
        this.f6696c = executorServiceC0846e3;
        this.f6697d = executorServiceC0846e4;
        this.f6698e = c0096q;
        this.f6699f = c0096q2;
    }
}
