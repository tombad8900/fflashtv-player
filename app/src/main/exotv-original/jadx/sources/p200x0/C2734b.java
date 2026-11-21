package p200x0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import p183v0.C2505e;
import p183v0.C2510j;
import p189v7.C2556a0;
import p191w0.C2598b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C2734b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f10103a;

    /* renamed from: b */
    public final C2556a0 f10104b;

    public C2734b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C2556a0 c2556a0 = new C2556a0(3);
        super(inputConnection, false);
        this.f10103a = editText;
        this.f10104b = c2556a0;
        if (C2510j.f9142k != null) {
            C2510j c2510jM4522a = C2510j.m4522a();
            if (c2510jM4522a.m4523b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2505e c2505e = c2510jM4522a.f9147e;
            c2505e.getClass();
            Bundle bundle = editorInfo.extras;
            C2598b c2598b = (C2598b) c2505e.f9137c.f78j;
            int iM3506a = c2598b.m3506a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3506a != 0 ? ((ByteBuffer) c2598b.f6855m).getInt(iM3506a + c2598b.f6852j) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        Editable editableText = this.f10103a.getEditableText();
        this.f10104b.getClass();
        return C2556a0.m4573f(this, editableText, i, i4, false) || super.deleteSurroundingText(i, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i4) {
        Editable editableText = this.f10103a.getEditableText();
        this.f10104b.getClass();
        return C2556a0.m4573f(this, editableText, i, i4, true) || super.deleteSurroundingTextInCodePoints(i, i4);
    }
}
