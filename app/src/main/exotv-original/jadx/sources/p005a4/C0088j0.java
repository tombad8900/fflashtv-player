package p005a4;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.media3.common.C0243u;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p063h1.AbstractC1101a;
import p088k0.AbstractC1551f;
import p088k0.C1550e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.j0 */
/* loaded from: classes.dex */
public final class C0088j0 {

    /* renamed from: a */
    public boolean f387a;

    /* renamed from: b */
    public final Object f388b;

    public C0088j0(int i) {
        switch (i) {
            case 1:
                this.f388b = new SparseBooleanArray();
                break;
            default:
                this.f388b = new Handler(Looper.getMainLooper(), new C0086i0(0));
                break;
        }
    }

    /* renamed from: a */
    public void m323a(int i) {
        AbstractC1101a.m2359j(!this.f387a);
        ((SparseBooleanArray) this.f388b).append(i, true);
    }

    /* renamed from: b */
    public C0243u m324b() {
        AbstractC1101a.m2359j(!this.f387a);
        this.f387a = true;
        return new C0243u((SparseBooleanArray) this.f388b);
    }

    /* renamed from: c */
    public boolean m325c() {
        return this.f387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m326d(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C1550e c1550e = (C1550e) this.f388b;
        if (c1550e == null) {
            return m325c();
        }
        c1550e.getClass();
        char c8 = 2;
        for (int i4 = 0; i4 < i && c8 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            C0088j0 c0088j0 = AbstractC1551f.f5938a;
            if (directionality == 0) {
                c8 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        break;
                    default:
                        c8 = 2;
                        break;
                }
            } else {
                c8 = 0;
            }
        }
        if (c8 == 0) {
            return true;
        }
        if (c8 != 1) {
            return m325c();
        }
        return false;
    }

    /* renamed from: e */
    public synchronized void m327e(InterfaceC0080f0 interfaceC0080f0, boolean z7) {
        try {
            if (this.f387a || z7) {
                ((Handler) this.f388b).obtainMessage(1, interfaceC0080f0).sendToTarget();
            } else {
                this.f387a = true;
                interfaceC0080f0.mo305b();
                this.f387a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0088j0(C1550e c1550e, boolean z7) {
        this.f388b = c1550e;
        this.f387a = z7;
    }

    public C0088j0(BottomSheetBehavior bottomSheetBehavior, boolean z7) {
        this.f388b = bottomSheetBehavior;
        this.f387a = z7;
    }
}
