package p017b6;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import okhttp3.C2181z;
import p104m.C1780w0;
import p105m0.C1794b;
import p114n0.C1952d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.g0 */
/* loaded from: classes.dex */
public final class C0604g0 extends C1794b {

    /* renamed from: d */
    public final TextInputLayout f2407d;

    public C0604g0(TextInputLayout textInputLayout) {
        this.f2407d = textInputLayout;
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
        this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f2407d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z7 = textInputLayout.f3416E0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z8 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : C2181z.FRAGMENT_ENCODE_SET;
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            C0624x c0624x = textInputLayout.f3471t;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (c0624x.f2489o == 2 && c0624x.f2499y != null && !TextUtils.isEmpty(c0624x.f2497w)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        C0596c0 c0596c0 = textInputLayout.f3453k;
        C1780w0 c1780w0 = c0596c0.f2379k;
        if (c1780w0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1780w0);
            accessibilityNodeInfo.setTraversalAfter(c1780w0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c0596c0.f2381m);
        }
        if (!zIsEmpty) {
            c1952d.m3824o(text);
        } else if (!TextUtils.isEmpty(string)) {
            c1952d.m3824o(string);
            if (!z7 && placeholderText != null) {
                c1952d.m3824o(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c1952d.m3824o(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c1952d.m3820k(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c1952d.m3824o(string);
            }
            c1952d.m3823n(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z8) {
            accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.f3455l.m1374b().mo1368m(c1952d);
    }

    @Override // p105m0.C1794b
    /* renamed from: e */
    public final void mo1363e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1363e(view, accessibilityEvent);
        this.f2407d.f3455l.m1374b().mo1369n(accessibilityEvent);
    }
}
