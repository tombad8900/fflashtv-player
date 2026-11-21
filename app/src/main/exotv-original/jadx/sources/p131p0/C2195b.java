package p131p0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p0.b */
/* loaded from: classes.dex */
public final class C2195b extends View {

    /* renamed from: j */
    public final /* synthetic */ ViewGroup f7664j;

    /* renamed from: k */
    public final /* synthetic */ C2197d f7665k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2195b(C2197d c2197d, Context context, ViewGroup viewGroup) {
        super(context);
        this.f7665k = c2197d;
        this.f7664j = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C2197d c2197d = this.f7665k;
        ArrayList arrayList = c2197d.f7669b;
        Drawable background = this.f7664j.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (c2197d.f7672e != color) {
            c2197d.f7672e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((C2194a) arrayList.get(size)).f7660a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw AbstractC0008a1.m10f(size2, arrayList2);
                }
            }
        }
    }
}
