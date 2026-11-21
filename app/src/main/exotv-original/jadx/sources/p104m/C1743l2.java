package p104m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.l2 */
/* loaded from: classes.dex */
public final class C1743l2 implements InterfaceC1710d1 {

    /* renamed from: a */
    public Toolbar f6626a;

    /* renamed from: b */
    public int f6627b;

    /* renamed from: c */
    public View f6628c;

    /* renamed from: d */
    public Drawable f6629d;

    /* renamed from: e */
    public Drawable f6630e;

    /* renamed from: f */
    public Drawable f6631f;

    /* renamed from: g */
    public boolean f6632g;

    /* renamed from: h */
    public CharSequence f6633h;

    /* renamed from: i */
    public CharSequence f6634i;

    /* renamed from: j */
    public CharSequence f6635j;

    /* renamed from: k */
    public Window.Callback f6636k;

    /* renamed from: l */
    public boolean f6637l;

    /* renamed from: m */
    public C1736k f6638m;

    /* renamed from: n */
    public int f6639n;

    /* renamed from: o */
    public Drawable f6640o;

    /* renamed from: a */
    public final void m3420a(int i) {
        View view;
        Toolbar toolbar = this.f6626a;
        int i4 = this.f6627b ^ i;
        this.f6627b = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    m3421b();
                }
                if ((this.f6627b & 4) != 0) {
                    Drawable drawable = this.f6631f;
                    if (drawable == null) {
                        drawable = this.f6640o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                m3422c();
            }
            if ((i4 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f6633h);
                    toolbar.setSubtitle(this.f6634i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f6628c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m3421b() {
        Toolbar toolbar = this.f6626a;
        if ((this.f6627b & 4) != 0) {
            if (TextUtils.isEmpty(this.f6635j)) {
                toolbar.setNavigationContentDescription(this.f6639n);
            } else {
                toolbar.setNavigationContentDescription(this.f6635j);
            }
        }
    }

    /* renamed from: c */
    public final void m3422c() {
        Drawable drawable;
        int i = this.f6627b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f6630e) == null) {
            drawable = this.f6629d;
        }
        this.f6626a.setLogo(drawable);
    }
}
