package p216z2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC2920v0 {

    /* renamed from: t */
    public static final List f10847t = Collections.EMPTY_LIST;

    /* renamed from: a */
    public final View f10848a;

    /* renamed from: b */
    public WeakReference f10849b;

    /* renamed from: j */
    public int f10857j;

    /* renamed from: r */
    public RecyclerView f10865r;

    /* renamed from: s */
    public AbstractC2923x f10866s;

    /* renamed from: c */
    public int f10850c = -1;

    /* renamed from: d */
    public int f10851d = -1;

    /* renamed from: e */
    public long f10852e = -1;

    /* renamed from: f */
    public int f10853f = -1;

    /* renamed from: g */
    public int f10854g = -1;

    /* renamed from: h */
    public AbstractC2920v0 f10855h = null;

    /* renamed from: i */
    public AbstractC2920v0 f10856i = null;

    /* renamed from: k */
    public ArrayList f10858k = null;

    /* renamed from: l */
    public List f10859l = null;

    /* renamed from: m */
    public int f10860m = 0;

    /* renamed from: n */
    public C2900l0 f10861n = null;

    /* renamed from: o */
    public boolean f10862o = false;

    /* renamed from: p */
    public int f10863p = 0;

    /* renamed from: q */
    public int f10864q = -1;

    public AbstractC2920v0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f10848a = view;
    }

    /* renamed from: a */
    public final void m5061a(int i) {
        this.f10857j = i | this.f10857j;
    }

    /* renamed from: b */
    public final int m5062b() {
        int i = this.f10854g;
        return i == -1 ? this.f10850c : i;
    }

    /* renamed from: c */
    public final List m5063c() {
        ArrayList arrayList;
        return ((this.f10857j & 1024) != 0 || (arrayList = this.f10858k) == null || arrayList.size() == 0) ? f10847t : this.f10859l;
    }

    /* renamed from: d */
    public final boolean m5064d() {
        View view = this.f10848a;
        return (view.getParent() == null || view.getParent() == this.f10865r) ? false : true;
    }

    /* renamed from: e */
    public final boolean m5065e() {
        return (this.f10857j & 1) != 0;
    }

    /* renamed from: f */
    public final boolean m5066f() {
        return (this.f10857j & 4) != 0;
    }

    /* renamed from: g */
    public final boolean m5067g() {
        if ((this.f10857j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        return !this.f10848a.hasTransientState();
    }

    /* renamed from: h */
    public final boolean m5068h() {
        return (this.f10857j & 8) != 0;
    }

    /* renamed from: i */
    public final boolean m5069i() {
        return this.f10861n != null;
    }

    /* renamed from: j */
    public final boolean m5070j() {
        return (this.f10857j & 256) != 0;
    }

    /* renamed from: k */
    public final boolean m5071k() {
        return (this.f10857j & 2) != 0;
    }

    /* renamed from: l */
    public final void m5072l(int i, boolean z7) {
        if (this.f10851d == -1) {
            this.f10851d = this.f10850c;
        }
        if (this.f10854g == -1) {
            this.f10854g = this.f10850c;
        }
        if (z7) {
            this.f10854g += i;
        }
        this.f10850c += i;
        View view = this.f10848a;
        if (view.getLayoutParams() != null) {
            ((C2890g0) view.getLayoutParams()).f10691c = true;
        }
    }

    /* renamed from: m */
    public final void m5073m() {
        if (RecyclerView.f2004I0 && m5070j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f10857j = 0;
        this.f10850c = -1;
        this.f10851d = -1;
        this.f10852e = -1L;
        this.f10854g = -1;
        this.f10860m = 0;
        this.f10855h = null;
        this.f10856i = null;
        ArrayList arrayList = this.f10858k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f10857j &= -1025;
        this.f10863p = 0;
        this.f10864q = -1;
        RecyclerView.m1151l(this);
    }

    /* renamed from: n */
    public final void m5074n(boolean z7) {
        int i = this.f10860m;
        int i4 = z7 ? i - 1 : i + 1;
        this.f10860m = i4;
        if (i4 < 0) {
            this.f10860m = 0;
            if (RecyclerView.f2004I0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z7 && i4 == 1) {
            this.f10857j |= 16;
        } else if (z7 && i4 == 0) {
            this.f10857j &= -17;
        }
        if (RecyclerView.f2005J0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z7 + ":" + this);
        }
    }

    /* renamed from: o */
    public final boolean m5075o() {
        return (this.f10857j & 128) != 0;
    }

    /* renamed from: p */
    public final boolean m5076p() {
        return (this.f10857j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f10850c + " id=" + this.f10852e + ", oldPos=" + this.f10851d + ", pLpos:" + this.f10854g);
        if (m5069i()) {
            sb.append(" scrap ");
            sb.append(this.f10862o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m5066f()) {
            sb.append(" invalid");
        }
        if (!m5065e()) {
            sb.append(" unbound");
        }
        if ((this.f10857j & 2) != 0) {
            sb.append(" update");
        }
        if (m5068h()) {
            sb.append(" removed");
        }
        if (m5075o()) {
            sb.append(" ignored");
        }
        if (m5070j()) {
            sb.append(" tmpDetached");
        }
        if (!m5067g()) {
            sb.append(" not recyclable(" + this.f10860m + ")");
        }
        if ((this.f10857j & 512) != 0 || m5066f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f10848a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
