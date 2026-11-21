package p145q5;

import android.content.Context;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q5.a */
/* loaded from: classes.dex */
public final class C2272a {

    /* renamed from: f */
    public static final int f7947f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f7948a;

    /* renamed from: b */
    public final int f7949b;

    /* renamed from: c */
    public final int f7950c;

    /* renamed from: d */
    public final int f7951d;

    /* renamed from: e */
    public final float f7952e;

    public C2272a(Context context) {
        boolean zM4341p = AbstractC2436a.m4341p(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int iM1496I = AbstractC0714c.m1496I(context, R.attr.elevationOverlayColor, 0);
        int iM1496I2 = AbstractC0714c.m1496I(context, R.attr.elevationOverlayAccentColor, 0);
        int iM1496I3 = AbstractC0714c.m1496I(context, R.attr.colorSurface, 0);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f7948a = zM4341p;
        this.f7949b = iM1496I;
        this.f7950c = iM1496I2;
        this.f7951d = iM1496I3;
        this.f7952e = f8;
    }
}
