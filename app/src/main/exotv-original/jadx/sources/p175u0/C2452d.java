package p175u0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import androidx.lifecycle.RunnableC0127c0;
import java.util.ArrayList;
import p095l.C1629o;
import p130p.C2192k;
import p156s.C2332e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u0.d */
/* loaded from: classes.dex */
public final class C2452d {

    /* renamed from: i */
    public static final ThreadLocal f8978i = new ThreadLocal();

    /* renamed from: e */
    public final C2332e f8983e;

    /* renamed from: h */
    public C2450b f8986h;

    /* renamed from: a */
    public final C2192k f8979a = new C2192k(0);

    /* renamed from: b */
    public final ArrayList f8980b = new ArrayList();

    /* renamed from: c */
    public final C1629o f8981c = new C1629o(this);

    /* renamed from: d */
    public final RunnableC0127c0 f8982d = new RunnableC0127c0(17, this);

    /* renamed from: f */
    public boolean f8984f = false;

    /* renamed from: g */
    public float f8985g = 1.0f;

    public C2452d(C2332e c2332e) {
        this.f8983e = c2332e;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, u0.a] */
    /* renamed from: a */
    public final void m4429a(C2454f c2454f) {
        ArrayList arrayList = this.f8980b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f8983e.f8170k).postFrameCallback(new ChoreographerFrameCallbackC2451c(this.f8982d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f8985g = ValueAnimator.getDurationScale();
                if (this.f8986h == null) {
                    this.f8986h = new C2450b(this);
                }
                final C2450b c2450b = this.f8986h;
                if (c2450b.f8974a == null) {
                    ?? r22 = new ValueAnimator.DurationScaleChangeListener() { // from class: u0.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f8) {
                            c2450b.f8975b.f8985g = f8;
                        }
                    };
                    c2450b.f8974a = r22;
                    ValueAnimator.registerDurationScaleChangeListener(r22);
                }
            }
        }
        if (arrayList.contains(c2454f)) {
            return;
        }
        arrayList.add(c2454f);
    }
}
