package p200x0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p183v0.AbstractC2508h;
import p183v0.C2510j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C2735c extends AbstractC2508h {

    /* renamed from: a */
    public final WeakReference f10105a;

    /* renamed from: b */
    public final WeakReference f10106b;

    public C2735c(TextView textView, C2736d c2736d) {
        this.f10105a = new WeakReference(textView);
        this.f10106b = new WeakReference(c2736d);
    }

    @Override // p183v0.AbstractC2508h
    /* renamed from: a */
    public final void mo4521a() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f10105a.get();
        InputFilter inputFilter = (InputFilter) this.f10106b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C2510j c2510jM4522a = C2510j.m4522a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c2510jM4522a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM4526e = c2510jM4522a.m4526e(text, 0, length);
                    if (text == charSequenceM4526e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM4526e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM4526e);
                    textView.setText(charSequenceM4526e);
                    if (charSequenceM4526e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM4526e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
