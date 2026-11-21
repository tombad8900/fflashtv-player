package p084j5;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j5.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1502a implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f5771j;

    /* renamed from: k */
    public final /* synthetic */ MaterialButton f5772k;

    /* renamed from: l */
    public final /* synthetic */ Drawable f5773l;

    public /* synthetic */ RunnableC1502a(MaterialButton materialButton, Drawable drawable, int i) {
        this.f5771j = i;
        this.f5772k = materialButton;
        this.f5773l = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5771j;
        Drawable drawable = this.f5773l;
        MaterialButton materialButton = this.f5772k;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.f3154a0;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.f3154a0;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
