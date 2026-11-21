package androidx.media3.p009ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0236r1;
import androidx.media3.common.C0251w1;
import com.google.android.material.datepicker.ViewOnClickListenerC0754l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p041e4.C0908y;
import p193w2.C2618i0;
import p193w2.InterfaceC2616h0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: j */
    public final int f1969j;

    /* renamed from: k */
    public final LayoutInflater f1970k;

    /* renamed from: l */
    public final CheckedTextView f1971l;

    /* renamed from: m */
    public final CheckedTextView f1972m;

    /* renamed from: n */
    public final ViewOnClickListenerC0754l f1973n;

    /* renamed from: o */
    public final ArrayList f1974o;

    /* renamed from: p */
    public final HashMap f1975p;

    /* renamed from: q */
    public boolean f1976q;

    /* renamed from: r */
    public boolean f1977r;

    /* renamed from: s */
    public InterfaceC2616h0 f1978s;

    /* renamed from: t */
    public CheckedTextView[][] f1979t;

    /* renamed from: u */
    public boolean f1980u;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f1969j = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f1970k = layoutInflaterFrom;
        ViewOnClickListenerC0754l viewOnClickListenerC0754l = new ViewOnClickListenerC0754l(4, this);
        this.f1973n = viewOnClickListenerC0754l;
        this.f1978s = new C0908y(getResources());
        this.f1974o = new ArrayList();
        this.f1975p = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1971l = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.exotv.net.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC0754l);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.exotv.net.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1972m = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.exotv.net.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC0754l);
        addView(checkedTextView2);
    }

    /* renamed from: a */
    public final void m1059a() {
        this.f1971l.setChecked(this.f1980u);
        boolean z7 = this.f1980u;
        HashMap map = this.f1975p;
        this.f1972m.setChecked(!z7 && map.size() == 0);
        for (int i = 0; i < this.f1979t.length; i++) {
            C0236r1 c0236r1 = (C0236r1) map.get(((C0251w1) this.f1974o.get(i)).f1538b);
            int i4 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f1979t[i];
                if (i4 < checkedTextViewArr.length) {
                    if (c0236r1 != null) {
                        Object tag = checkedTextViewArr[i4].getTag();
                        tag.getClass();
                        this.f1979t[i][i4].setChecked(c0236r1.f1404b.contains(Integer.valueOf(((C2618i0) tag).f9462b)));
                    } else {
                        checkedTextViewArr[i4].setChecked(false);
                    }
                    i4++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1060b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f1974o;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f1972m;
        CheckedTextView checkedTextView2 = this.f1971l;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f1979t = new CheckedTextView[arrayList.size()][];
        boolean z7 = this.f1977r && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            C0251w1 c0251w1 = (C0251w1) arrayList.get(i);
            boolean z8 = this.f1976q && c0251w1.f1539c;
            CheckedTextView[][] checkedTextViewArr = this.f1979t;
            int i4 = c0251w1.f1537a;
            checkedTextViewArr[i] = new CheckedTextView[i4];
            C2618i0[] c2618i0Arr = new C2618i0[i4];
            for (int i8 = 0; i8 < c0251w1.f1537a; i8++) {
                c2618i0Arr[i8] = new C2618i0(c0251w1, i8);
            }
            for (int i9 = 0; i9 < i4; i9++) {
                LayoutInflater layoutInflater = this.f1970k;
                if (i9 == 0) {
                    addView(layoutInflater.inflate(com.exotv.net.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z8 || z7) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f1969j);
                InterfaceC2616h0 interfaceC2616h0 = this.f1978s;
                C2618i0 c2618i0 = c2618i0Arr[i9];
                checkedTextView3.setText(((C0908y) interfaceC2616h0).m2075c(c2618i0.f9461a.m696a(c2618i0.f9462b)));
                checkedTextView3.setTag(c2618i0Arr[i9]);
                if (c0251w1.m697b(i9)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f1973n);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f1979t[i][i9] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        m1059a();
    }

    public boolean getIsDisabled() {
        return this.f1980u;
    }

    public Map<C0233q1, C0236r1> getOverrides() {
        return this.f1975p;
    }

    public void setAllowAdaptiveSelections(boolean z7) {
        if (this.f1976q != z7) {
            this.f1976q = z7;
            m1060b();
        }
    }

    public void setAllowMultipleOverrides(boolean z7) {
        if (this.f1977r != z7) {
            this.f1977r = z7;
            if (!z7) {
                HashMap map = this.f1975p;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f1974o;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        C0236r1 c0236r1 = (C0236r1) map.get(((C0251w1) arrayList.get(i)).f1538b);
                        if (c0236r1 != null && map2.isEmpty()) {
                            map2.put(c0236r1.f1403a, c0236r1);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m1060b();
        }
    }

    public void setShowDisableOption(boolean z7) {
        this.f1971l.setVisibility(z7 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC2616h0 interfaceC2616h0) {
        interfaceC2616h0.getClass();
        this.f1978s = interfaceC2616h0;
        m1060b();
    }
}
