package p166t0;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.google.android.material.chip.Chip;
import p095l.C1629o;
import p110m5.C1903d;
import p114n0.C1952d;
import p114n0.C1953e;
import p114n0.C1954f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t0.a */
/* loaded from: classes.dex */
public final class C2387a extends C1629o {

    /* renamed from: k */
    public final /* synthetic */ AbstractC2388b f8376k;

    public C2387a(AbstractC2388b abstractC2388b) {
        this.f8376k = abstractC2388b;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6229j = new C1954f(this);
        } else {
            this.f6229j = new C1953e(this);
        }
    }

    @Override // p095l.C1629o
    /* renamed from: r */
    public final C1952d mo3327r(int i) {
        return new C1952d(AccessibilityNodeInfo.obtain(this.f8376k.m4220n(i).f7258a));
    }

    @Override // p095l.C1629o
    /* renamed from: s */
    public final C1952d mo3328s(int i) {
        AbstractC2388b abstractC2388b = this.f8376k;
        int i4 = i == 2 ? abstractC2388b.f8387k : abstractC2388b.f8388l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return mo3327r(i4);
    }

    @Override // p095l.C1629o
    /* renamed from: w */
    public final boolean mo3331w(int i, int i4, Bundle bundle) {
        int i8;
        AbstractC2388b abstractC2388b = this.f8376k;
        Chip chip = abstractC2388b.f8385i;
        if (i == -1) {
            return chip.performAccessibilityAction(i4, bundle);
        }
        if (i4 == 1) {
            return abstractC2388b.m4221q(i);
        }
        if (i4 == 2) {
            return abstractC2388b.m4217j(i);
        }
        boolean z7 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = abstractC2388b.f8384h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i8 = abstractC2388b.f8387k) == i) {
                return false;
            }
            if (i8 != Integer.MIN_VALUE) {
                abstractC2388b.f8387k = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC2388b.m4222r(i8, 65536);
            }
            abstractC2388b.f8387k = i;
            chip.invalidate();
            abstractC2388b.m4222r(i, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE);
            return true;
        }
        if (i4 == 128) {
            if (abstractC2388b.f8387k != i) {
                return false;
            }
            abstractC2388b.f8387k = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC2388b.m4222r(i, 65536);
            return true;
        }
        Chip chip2 = ((C1903d) abstractC2388b).f7114q;
        if (i4 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f3214q;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z7 = true;
                }
                if (chip2.f3207B) {
                    chip2.f3206A.m4222r(1, 1);
                }
            }
        }
        return z7;
    }
}
