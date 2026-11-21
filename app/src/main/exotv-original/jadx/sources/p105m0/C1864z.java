package p105m0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.z */
/* loaded from: classes.dex */
public final class C1864z extends AbstractC1795b0 {

    /* renamed from: n */
    public final /* synthetic */ int f6966n;

    public C1864z(int i, Class cls, int i4, int i8, int i9) {
        this.f6966n = i9;
        this.f6852j = i;
        this.f6855m = cls;
        this.f6854l = i4;
        this.f6853k = i8;
    }

    @Override // p105m0.AbstractC1795b0
    /* renamed from: c */
    public final Object mo3508c(View view) {
        switch (this.f6966n) {
            case 0:
                return Boolean.valueOf(AbstractC1813h0.m3550c(view));
            case 1:
                return AbstractC1813h0.m3548a(view);
            default:
                return Boolean.valueOf(AbstractC1813h0.m3549b(view));
        }
    }

    @Override // p105m0.AbstractC1795b0
    /* renamed from: d */
    public final void mo3509d(View view, Object obj) {
        switch (this.f6966n) {
            case 0:
                AbstractC1813h0.m3553f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC1813h0.m3552e(view, (CharSequence) obj);
                break;
            default:
                AbstractC1813h0.m3551d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p105m0.AbstractC1795b0
    /* renamed from: g */
    public final boolean mo3512g(Object obj, Object obj2) {
        switch (this.f6966n) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
