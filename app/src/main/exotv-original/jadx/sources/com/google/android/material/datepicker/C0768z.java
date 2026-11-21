package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import p216z2.C2911r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.z */
/* loaded from: classes.dex */
public final class C0768z extends C2911r {

    /* renamed from: q */
    public final /* synthetic */ int f3331q = 0;

    public /* synthetic */ C0768z(Context context) {
        super(context);
    }

    @Override // p216z2.C2911r
    /* renamed from: b */
    public int mo1874b(View view, int i) {
        switch (this.f3331q) {
            case 1:
                return 0;
            default:
                return super.mo1874b(view, i);
        }
    }

    @Override // p216z2.C2911r
    /* renamed from: c */
    public int mo1875c(View view, int i) {
        switch (this.f3331q) {
            case 1:
                return 0;
            default:
                return super.mo1875c(view, i);
        }
    }

    @Override // p216z2.C2911r
    /* renamed from: d */
    public float mo1876d(DisplayMetrics displayMetrics) {
        switch (this.f3331q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo1876d(displayMetrics);
        }
    }

    @Override // p216z2.C2911r
    /* renamed from: f */
    public PointF mo1877f(int i) {
        switch (this.f3331q) {
            case 1:
                return null;
            default:
                return super.mo1877f(i);
        }
    }

    public C0768z(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
