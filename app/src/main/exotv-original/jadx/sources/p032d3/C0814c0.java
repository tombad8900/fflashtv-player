package p032d3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import com.bumptech.glide.AbstractC0715d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.c0 */
/* loaded from: classes.dex */
public class C0814c0 extends AbstractC0715d {

    /* renamed from: n */
    public static boolean f3627n = true;

    /* renamed from: o */
    public static boolean f3628o = true;

    /* renamed from: p */
    public static boolean f3629p = true;

    /* renamed from: q */
    public static boolean f3630q = true;

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: m0 */
    public void mo1599m0(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1599m0(view, i);
        } else if (f3630q) {
            try {
                AbstractC0812b0.m1967a(view, i);
            } catch (NoSuchMethodError unused) {
                f3630q = false;
            }
        }
    }

    /* renamed from: s0 */
    public void mo1968s0(View view, int i, int i4, int i8, int i9) {
        if (f3629p) {
            try {
                AbstractC0810a0.m1966a(view, i, i4, i8, i9);
            } catch (NoSuchMethodError unused) {
                f3629p = false;
            }
        }
    }

    /* renamed from: t0 */
    public void mo1969t0(View view, Matrix matrix) {
        if (f3627n) {
            try {
                AbstractC0841z.m2012b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3627n = false;
            }
        }
    }

    /* renamed from: u0 */
    public void mo1970u0(View view, Matrix matrix) {
        if (f3628o) {
            try {
                AbstractC0841z.m2013c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3628o = false;
            }
        }
    }
}
