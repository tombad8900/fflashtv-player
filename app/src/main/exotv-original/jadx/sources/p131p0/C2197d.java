package p131p0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.media3.exoplayer.source.preload.C0456a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p037e0.C0851b;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p0.d */
/* loaded from: classes.dex */
public final class C2197d {

    /* renamed from: a */
    public final C2195b f7668a;

    /* renamed from: b */
    public final ArrayList f7669b = new ArrayList();

    /* renamed from: c */
    public C0851b f7670c;

    /* renamed from: d */
    public C0851b f7671d;

    /* renamed from: e */
    public int f7672e;

    public C2197d(ViewGroup viewGroup) {
        C0851b c0851b = C0851b.f3768e;
        this.f7670c = c0851b;
        this.f7671d = c0851b;
        Drawable background = viewGroup.getBackground();
        this.f7672e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C2195b c2195b = new C2195b(this, viewGroup.getContext(), viewGroup);
        this.f7668a = c2195b;
        c2195b.setWillNotDraw(true);
        C0456a c0456a = new C0456a(11, this);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1804e0.m3538j(c2195b, c0456a);
        AbstractC1828m0.m3610o(c2195b, new C2196c(this));
        viewGroup.addView(c2195b, 0);
    }
}
