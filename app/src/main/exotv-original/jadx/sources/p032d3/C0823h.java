package p032d3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.exotv.net.R;
import java.util.HashMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.h */
/* loaded from: classes.dex */
public final class C0823h extends AbstractC0829n {

    /* renamed from: K */
    public static final String[] f3665K = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: J */
    public final int f3666J;

    public C0823h(int i) {
        this();
        this.f3666J = i;
    }

    /* renamed from: H */
    public static void m1982H(C0837v c0837v) {
        View view = c0837v.f3718b;
        int visibility = view.getVisibility();
        HashMap map = c0837v.f3717a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: J */
    public static float m1983J(C0837v c0837v, float f8) {
        Float f9;
        return (c0837v == null || (f9 = (Float) c0837v.f3717a.get("android:fade:transitionAlpha")) == null) ? f8 : f9.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0822g0 m1984K(C0837v c0837v, C0837v c0837v2) {
        C0822g0 c0822g0 = new C0822g0();
        c0822g0.f3659a = false;
        c0822g0.f3660b = false;
        if (c0837v != null) {
            HashMap map = c0837v.f3717a;
            if (map.containsKey("android:visibility:visibility")) {
                c0822g0.f3661c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c0822g0.f3663e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c0822g0.f3661c = -1;
                c0822g0.f3663e = null;
            }
        }
        if (c0837v2 != null) {
            HashMap map2 = c0837v2.f3717a;
            if (map2.containsKey("android:visibility:visibility")) {
                c0822g0.f3662d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c0822g0.f3664f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c0822g0.f3662d = -1;
                c0822g0.f3664f = null;
            }
        }
        if (c0837v != null && c0837v2 != null) {
            int i = c0822g0.f3661c;
            int i4 = c0822g0.f3662d;
            if (i != i4 || c0822g0.f3663e != c0822g0.f3664f) {
                if (i != i4) {
                    if (i == 0) {
                        c0822g0.f3660b = false;
                        c0822g0.f3659a = true;
                        return c0822g0;
                    }
                    if (i4 == 0) {
                        c0822g0.f3660b = true;
                        c0822g0.f3659a = true;
                        return c0822g0;
                    }
                } else {
                    if (c0822g0.f3664f == null) {
                        c0822g0.f3660b = false;
                        c0822g0.f3659a = true;
                        return c0822g0;
                    }
                    if (c0822g0.f3663e == null) {
                        c0822g0.f3660b = true;
                        c0822g0.f3659a = true;
                        return c0822g0;
                    }
                }
            }
        } else {
            if (c0837v == null && c0822g0.f3662d == 0) {
                c0822g0.f3660b = true;
                c0822g0.f3659a = true;
                return c0822g0;
            }
            if (c0837v2 == null && c0822g0.f3661c == 0) {
                c0822g0.f3660b = false;
                c0822g0.f3659a = true;
            }
        }
        return c0822g0;
    }

    /* renamed from: I */
    public final ObjectAnimator m1985I(View view, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        AbstractC0839x.f3720a.mo1598l0(view, f8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC0839x.f3721b, f9);
        C0821g c0821g = new C0821g(view);
        objectAnimatorOfFloat.addListener(c0821g);
        m1998n().m1992a(c0821g);
        return objectAnimatorOfFloat;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: c */
    public final void mo1956c(C0837v c0837v) {
        m1982H(c0837v);
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: f */
    public final void mo1958f(C0837v c0837v) {
        m1982H(c0837v);
        View view = c0837v.f3718b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC0839x.f3720a.mo1578G(view)) : Float.valueOf(0.0f);
        }
        c0837v.f3717a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (m1984K(m1997m(r3, false), m1999q(r3, false)).f3659a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    @Override // p032d3.AbstractC0829n
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo1978j(ViewGroup viewGroup, C0837v c0837v, C0837v c0837v2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        boolean z7;
        View view;
        int i;
        char c8;
        int i4;
        View view2;
        Animator animator;
        View view3;
        boolean z8;
        ViewGroup viewGroup2;
        int i8;
        Bitmap bitmapCreateBitmap;
        C0822g0 c0822g0M1984K = m1984K(c0837v, c0837v2);
        if (c0822g0M1984K.f3659a && (c0822g0M1984K.f3663e != null || c0822g0M1984K.f3664f != null)) {
            boolean z9 = c0822g0M1984K.f3660b;
            int i9 = this.f3666J;
            int i10 = 1;
            if (!z9) {
                int i11 = c0822g0M1984K.f3662d;
                if ((i9 & 2) == 2 && c0837v != null) {
                    View view4 = c0837v.f3718b;
                    View view5 = c0837v2 != null ? c0837v2.f3718b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i11;
                        c8 = 1;
                        i4 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z7 = false;
                            }
                            view = null;
                            if (!z7) {
                                i = i11;
                                c8 = 1;
                                i4 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i10 = i4;
                                view3 = view2;
                            } else if (view4.getParent() == null) {
                                i = i11;
                                c8 = 1;
                                i10 = 0;
                                i4 = 0;
                                view3 = view;
                                animator = null;
                                view6 = view4;
                            } else {
                                if (view4.getParent() instanceof View) {
                                    View view7 = (View) view4.getParent();
                                    animator = null;
                                    i4 = 0;
                                    if (m1984K(m1999q(view7, true), m1997m(view7, true)).f3659a) {
                                        i = i11;
                                        c8 = 1;
                                        view2 = view;
                                        int id = view7.getId();
                                        if (view7.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z10 = AbstractC0836u.f3716a;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                        C0814c0 c0814c0 = AbstractC0839x.f3720a;
                                        c0814c0.mo1969t0(view4, matrix);
                                        c0814c0.mo1970u0(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound = Math.round(rectF.left);
                                        int iRound2 = Math.round(rectF.top);
                                        c8 = 1;
                                        int iRound3 = Math.round(rectF.right);
                                        int iRound4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view4.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean zIsAttachedToWindow = view4.isAttachedToWindow();
                                        boolean z11 = viewGroup != null && viewGroup.isAttachedToWindow();
                                        if (zIsAttachedToWindow) {
                                            z8 = zIsAttachedToWindow;
                                            viewGroup2 = null;
                                            i8 = 0;
                                        } else if (z11) {
                                            viewGroup2 = (ViewGroup) view4.getParent();
                                            int iIndexOfChild = viewGroup2.indexOfChild(view4);
                                            z8 = zIsAttachedToWindow;
                                            viewGroup.getOverlay().add(view4);
                                            i8 = iIndexOfChild;
                                        } else {
                                            i = i11;
                                            view2 = view;
                                            bitmapCreateBitmap = null;
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                                            view6 = imageView;
                                            i10 = i4;
                                            view3 = view2;
                                        }
                                        view2 = view;
                                        int iRound5 = Math.round(rectF.width());
                                        i = i11;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound5 <= 0 || iRound6 <= 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                            int iRound7 = Math.round(iRound5 * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            if (AbstractC0836u.f3716a) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view4.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = AbstractC0835t.m2004a(picture);
                                            } else {
                                                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                canvas.concat(matrix);
                                                view4.draw(canvas);
                                            }
                                        }
                                        if (!z8) {
                                            viewGroup.getOverlay().remove(view4);
                                            viewGroup2.addView(view4, i8);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                                        view6 = imageView;
                                        i10 = i4;
                                        view3 = view2;
                                    }
                                }
                                view6 = view5;
                                i10 = i4;
                                view3 = view2;
                            }
                        } else if (i11 == 4 || view4 == view5) {
                            z7 = false;
                            view = view5;
                            view5 = null;
                            if (!z7) {
                            }
                        }
                        z7 = true;
                        view5 = null;
                        view = null;
                        if (!z7) {
                        }
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        AbstractC0839x.m2008b(view3, i4);
                        C0814c0 c0814c02 = AbstractC0839x.f3720a;
                        c0814c02.getClass();
                        ObjectAnimator objectAnimatorM1985I = m1985I(view3, m1983J(c0837v, 1.0f), 0.0f);
                        if (objectAnimatorM1985I == null) {
                            c0814c02.mo1598l0(view3, m1983J(c0837v2, 1.0f));
                        }
                        if (objectAnimatorM1985I == null) {
                            AbstractC0839x.m2008b(view3, visibility);
                            return objectAnimatorM1985I;
                        }
                        C0818e0 c0818e0 = new C0818e0(view3, i);
                        objectAnimatorM1985I.addListener(c0818e0);
                        m1998n().m1992a(c0818e0);
                        return objectAnimatorM1985I;
                    }
                    if (i10 == 0) {
                        int[] iArr = (int[]) c0837v.f3717a.get("android:visibility:screenLocation");
                        int i12 = iArr[i4];
                        int i13 = iArr[c8];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i12 - iArr2[i4]) - view6.getLeft());
                        view6.offsetTopAndBottom((i13 - iArr2[c8]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    C0814c0 c0814c03 = AbstractC0839x.f3720a;
                    c0814c03.getClass();
                    ObjectAnimator objectAnimatorM1985I2 = m1985I(view6, m1983J(c0837v, 1.0f), 0.0f);
                    if (objectAnimatorM1985I2 == null) {
                        c0814c03.mo1598l0(view6, m1983J(c0837v2, 1.0f));
                    }
                    if (i10 == 0) {
                        if (objectAnimatorM1985I2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return objectAnimatorM1985I2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        C0820f0 c0820f0 = new C0820f0(this, viewGroup, view6, view4);
                        objectAnimatorM1985I2.addListener(c0820f0);
                        objectAnimatorM1985I2.addPauseListener(c0820f0);
                        m1998n().m1992a(c0820f0);
                    }
                    return objectAnimatorM1985I2;
                }
            } else if ((i9 & 1) == 1 && c0837v2 != null) {
                View view8 = c0837v2.f3718b;
                if (c0837v == null) {
                    View view9 = (View) view8.getParent();
                }
                AbstractC0839x.f3720a.getClass();
                return m1985I(view8, m1983J(c0837v, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: p */
    public final String[] mo1979p() {
        return f3665K;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: r */
    public final boolean mo1986r(C0837v c0837v, C0837v c0837v2) {
        if (c0837v == null && c0837v2 == null) {
            return false;
        }
        if (c0837v != null && c0837v2 != null && c0837v2.f3717a.containsKey("android:visibility:visibility") != c0837v.f3717a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0822g0 c0822g0M1984K = m1984K(c0837v, c0837v2);
        if (c0822g0M1984K.f3659a) {
            return c0822g0M1984K.f3661c == 0 || c0822g0M1984K.f3662d == 0;
        }
        return false;
    }

    public C0823h() {
        this.f3666J = 3;
    }
}
