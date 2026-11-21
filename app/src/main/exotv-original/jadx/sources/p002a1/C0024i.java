package p002a1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.session.AbstractC0120b;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.i */
/* loaded from: classes.dex */
public final class C0024i extends AbstractC0026j {

    /* renamed from: l */
    public boolean f84l;

    /* renamed from: m */
    public boolean f85m;

    /* renamed from: n */
    public C0016e f86n;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0016e m88k(Context context) throws Resources.NotFoundException {
        int iM403N;
        Animation animationLoadAnimation;
        C0016e c0016e;
        if (this.f85m) {
            return this.f86n;
        }
        C0059z0 c0059z0 = (C0059z0) this.f88j;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0059z0.f284c;
        boolean z7 = c0059z0.f282a == 2;
        boolean z8 = this.f84l;
        C0046t c0046t = abstractComponentCallbacksC0050v.f225Q;
        int i = c0046t == null ? 0 : c0046t.f195f;
        if (z8) {
            if (z7) {
                iM403N = c0046t == null ? 0 : c0046t.f193d;
            } else if (c0046t != null) {
                iM403N = c0046t.f194e;
            }
        } else if (z7) {
            if (c0046t != null) {
                iM403N = c0046t.f191b;
            }
        } else if (c0046t != null) {
            iM403N = c0046t.f192c;
        }
        abstractComponentCallbacksC0050v.m219F(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0050v.f221M;
        C0016e c0016e2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0050v.f221M.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0050v.f221M;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (iM403N == 0 && i != 0) {
                iM403N = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z7 ? AbstractC0120b.m403N(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0120b.m403N(context, android.R.attr.activityOpenExitAnimation) : z7 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z7 ? AbstractC0120b.m403N(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0120b.m403N(context, android.R.attr.activityCloseExitAnimation) : z7 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z7 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            }
            if (iM403N != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM403N));
                if (zEquals) {
                    try {
                        animationLoadAnimation = AnimationUtils.loadAnimation(context, iM403N);
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                    if (animationLoadAnimation != null) {
                        c0016e = new C0016e(animationLoadAnimation);
                        c0016e2 = c0016e;
                    }
                } else {
                    try {
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM403N);
                        if (animatorLoadAnimator != null) {
                            c0016e = new C0016e(animatorLoadAnimator);
                            c0016e2 = c0016e;
                        }
                    } catch (RuntimeException e8) {
                        if (zEquals) {
                            throw e8;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM403N);
                        if (animationLoadAnimation2 != null) {
                            c0016e2 = new C0016e(animationLoadAnimation2);
                        }
                    }
                }
            }
        }
        this.f86n = c0016e2;
        this.f85m = true;
        return c0016e2;
    }
}
