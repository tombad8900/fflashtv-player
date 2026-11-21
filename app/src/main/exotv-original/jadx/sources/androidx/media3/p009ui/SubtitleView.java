package androidx.media3.p009ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p056g1.C1028a;
import p056g1.C1029b;
import p056g1.InterfaceC1033f;
import p168t2.AbstractC2415i0;
import p193w2.C2603b;
import p193w2.C2605c;
import p193w2.C2624l0;
import p193w2.InterfaceC2612f0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: j */
    public List f1960j;

    /* renamed from: k */
    public C2605c f1961k;

    /* renamed from: l */
    public float f1962l;

    /* renamed from: m */
    public float f1963m;

    /* renamed from: n */
    public boolean f1964n;

    /* renamed from: o */
    public boolean f1965o;

    /* renamed from: p */
    public int f1966p;

    /* renamed from: q */
    public InterfaceC2612f0 f1967q;

    /* renamed from: r */
    public View f1968r;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1960j = Collections.EMPTY_LIST;
        this.f1961k = C2605c.f9365g;
        this.f1962l = 0.0533f;
        this.f1963m = 0.08f;
        this.f1964n = true;
        this.f1965o = true;
        C2603b c2603b = new C2603b(context, 0);
        this.f1967q = c2603b;
        this.f1968r = c2603b;
        addView(c2603b);
        this.f1966p = 1;
    }

    private List<C1029b> getCuesWithStylingPreferencesApplied() {
        if (this.f1964n && this.f1965o) {
            return this.f1960j;
        }
        ArrayList arrayList = new ArrayList(this.f1960j.size());
        for (int i = 0; i < this.f1960j.size(); i++) {
            C1028a c1028aM2226a = ((C1029b) this.f1960j.get(i)).m2226a();
            if (!this.f1964n) {
                c1028aM2226a.f4347n = false;
                CharSequence charSequence = c1028aM2226a.f4334a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c1028aM2226a.f4334a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c1028aM2226a.f4334a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC1033f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC2415i0.m4269z(c1028aM2226a);
            } else if (!this.f1965o) {
                AbstractC2415i0.m4269z(c1028aM2226a);
            }
            arrayList.add(c1028aM2226a.m2225a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C2605c getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        C2605c c2605c = C2605c.f9365g;
        if (zIsInEditMode) {
            return c2605c;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            c2605c = new C2605c(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return c2605c;
    }

    private <T extends View & InterfaceC2612f0> void setView(T t8) {
        removeView(this.f1968r);
        View view = this.f1968r;
        if (view instanceof C2624l0) {
            ((C2624l0) view).f9474k.destroy();
        }
        this.f1968r = t8;
        this.f1967q = t8;
        addView(t8);
    }

    /* renamed from: a */
    public final void m1056a() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: b */
    public final void m1057b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: c */
    public final void m1058c() {
        this.f1967q.mo4685a(getCuesWithStylingPreferencesApplied(), this.f1961k, this.f1962l, this.f1963m);
    }

    public void setApplyEmbeddedFontSizes(boolean z7) {
        this.f1965o = z7;
        m1058c();
    }

    public void setApplyEmbeddedStyles(boolean z7) {
        this.f1964n = z7;
        m1058c();
    }

    public void setBottomPaddingFraction(float f8) {
        this.f1963m = f8;
        m1058c();
    }

    public void setCues(List<C1029b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f1960j = list;
        m1058c();
    }

    public void setFractionalTextSize(float f8) {
        this.f1962l = f8;
        m1058c();
    }

    public void setStyle(C2605c c2605c) {
        this.f1961k = c2605c;
        m1058c();
    }

    public void setViewType(int i) {
        if (this.f1966p == i) {
            return;
        }
        if (i == 1) {
            setView(new C2603b(getContext(), 0));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C2624l0(getContext()));
        }
        this.f1966p = i;
    }
}
