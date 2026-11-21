package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p054g.AbstractC1026a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: j */
    public final int f608j;

    /* renamed from: k */
    public final int f609k;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4327t);
        this.f609k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f608j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
