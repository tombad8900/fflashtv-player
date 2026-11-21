package p183v0;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.t */
/* loaded from: classes.dex */
public final class C2520t implements TextWatcher, SpanWatcher {

    /* renamed from: j */
    public final Object f9172j;

    /* renamed from: k */
    public final AtomicInteger f9173k = new AtomicInteger(0);

    public C2520t(Object obj) {
        this.f9172j = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f9172j).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i8) {
        ((TextWatcher) this.f9172j).beforeTextChanged(charSequence, i, i4, i8);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i4) {
        if (this.f9173k.get() <= 0 || !(obj instanceof C2523w)) {
            ((SpanWatcher) this.f9172j).onSpanAdded(spannable, obj, i, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i4, int i8, int i9) {
        int i10;
        int i11;
        if (this.f9173k.get() <= 0 || !(obj instanceof C2523w)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i10 = i;
                i11 = i8;
            } else {
                if (i > i4) {
                    i = 0;
                }
                if (i8 > i9) {
                    i10 = i;
                    i11 = 0;
                }
            }
            ((SpanWatcher) this.f9172j).onSpanChanged(spannable, obj, i10, i4, i11, i9);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i4) {
        if (this.f9173k.get() <= 0 || !(obj instanceof C2523w)) {
            ((SpanWatcher) this.f9172j).onSpanRemoved(spannable, obj, i, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i8) {
        ((TextWatcher) this.f9172j).onTextChanged(charSequence, i, i4, i8);
    }
}
