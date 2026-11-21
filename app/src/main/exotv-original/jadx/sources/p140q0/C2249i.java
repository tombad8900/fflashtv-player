package p140q0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import p104m.C1776v;
import p105m0.C1812h;
import p105m0.InterfaceC1809g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q0.i */
/* loaded from: classes.dex */
public final class C2249i {
    /* renamed from: a */
    public static C1812h m4024a(C1776v c1776v, C1812h c1812h) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1812h);
        }
        InterfaceC1809g interfaceC1809g = c1812h.f6875a;
        if (interfaceC1809g.mo3526f() == 2) {
            return c1812h;
        }
        ClipData clipDataMo3521a = interfaceC1809g.mo3521a();
        int iMo3524d = interfaceC1809g.mo3524d();
        Editable editable = (Editable) c1776v.getText();
        Context context = c1776v.getContext();
        boolean z7 = false;
        for (int i = 0; i < clipDataMo3521a.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataMo3521a.getItemAt(i);
            if ((iMo3524d & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z7) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z7 = true;
                }
            }
        }
        return null;
    }
}
