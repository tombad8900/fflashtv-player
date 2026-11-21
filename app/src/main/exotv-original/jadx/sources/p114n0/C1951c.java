package p114n0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import p105m0.AbstractC1857w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n0.c */
/* loaded from: classes.dex */
public final class C1951c {

    /* renamed from: e */
    public static final C1951c f7246e;

    /* renamed from: f */
    public static final C1951c f7247f;

    /* renamed from: g */
    public static final C1951c f7248g;

    /* renamed from: h */
    public static final C1951c f7249h;

    /* renamed from: i */
    public static final C1951c f7250i;

    /* renamed from: j */
    public static final C1951c f7251j;

    /* renamed from: k */
    public static final C1951c f7252k;

    /* renamed from: a */
    public final Object f7253a;

    /* renamed from: b */
    public final int f7254b;

    /* renamed from: c */
    public final Class f7255c;

    /* renamed from: d */
    public final InterfaceC1962n f7256d;

    static {
        new C1951c(1, (String) null);
        new C1951c(2, (String) null);
        new C1951c(4, (String) null);
        new C1951c(8, (String) null);
        f7246e = new C1951c(16, (String) null);
        new C1951c(32, (String) null);
        new C1951c(64, (String) null);
        new C1951c(128, (String) null);
        new C1951c(256, AbstractC1955g.class);
        new C1951c(512, AbstractC1955g.class);
        new C1951c(1024, AbstractC1956h.class);
        new C1951c(2048, AbstractC1956h.class);
        f7247f = new C1951c(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED, (String) null);
        f7248g = new C1951c(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED, (String) null);
        new C1951c(16384, (String) null);
        new C1951c(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE, (String) null);
        new C1951c(65536, (String) null);
        new C1951c(131072, AbstractC1960l.class);
        f7249h = new C1951c(262144, (String) null);
        new C1951c(524288, (String) null);
        f7250i = new C1951c(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, (String) null);
        new C1951c(2097152, AbstractC1961m.class);
        int i = Build.VERSION.SDK_INT;
        new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1958j.class);
        f7251j = new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f7252k = new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C1951c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C1951c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C1951c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C1951c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C1951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC1959k.class);
        new C1951c(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC1957i.class);
        new C1951c(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C1951c(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C1951c(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C1951c(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C1951c(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C1951c(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C1951c(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C1951c(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C1951c(i >= 34 ? AbstractC1857w.m3635a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C1951c(int i, String str) {
        this(null, i, str, null, null);
    }

    /* renamed from: a */
    public final int m3809a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f7253a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1951c)) {
            return false;
        }
        Object obj2 = ((C1951c) obj).f7253a;
        Object obj3 = this.f7253a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f7253a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM3810d = C1952d.m3810d(this.f7254b);
        if (strM3810d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f7253a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM3810d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM3810d);
        return sb.toString();
    }

    public C1951c(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C1951c(Object obj, int i, CharSequence charSequence, InterfaceC1962n interfaceC1962n, Class cls) {
        this.f7254b = i;
        this.f7256d = interfaceC1962n;
        if (obj == null) {
            this.f7253a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f7253a = obj;
        }
        this.f7255c = cls;
    }
}
