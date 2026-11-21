package p104m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import p017b6.AbstractC0622v;
import p071i1.C1240s;
import p105m0.AbstractC1828m0;
import p105m0.C1800d;
import p105m0.C1806f;
import p105m0.C1812h;
import p105m0.InterfaceC1803e;
import p121o0.AbstractC2036b;
import p121o0.C2037c;
import p121o0.C2038d;
import p140q0.C2249i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.v */
/* loaded from: classes.dex */
public class C1776v extends EditText {

    /* renamed from: j */
    public final C1240s f6780j;

    /* renamed from: k */
    public final C1768s0 f6781k;

    /* renamed from: l */
    public final C1701b0 f6782l;

    /* renamed from: m */
    public final C2249i f6783m;

    /* renamed from: n */
    public final C1701b0 f6784n;

    /* renamed from: o */
    public C1773u f6785o;

    /* renamed from: p */
    public C1765r0 f6786p;

    public C1776v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1707c2.m3388a(this, getContext());
        C1240s c1240s = new C1240s(this);
        this.f6780j = c1240s;
        c1240s.m2703m(attributeSet, R.attr.editTextStyle);
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6781k = c1768s0;
        c1768s0.m3445h(attributeSet, R.attr.editTextStyle);
        c1768s0.m3441b();
        C1701b0 c1701b0 = new C1701b0();
        c1701b0.f6510b = this;
        this.f6782l = c1701b0;
        this.f6783m = new C2249i();
        C1701b0 c1701b02 = new C1701b0(this);
        this.f6784n = c1701b02;
        c1701b02.mo3384b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM3383a = c1701b02.m3383a(keyListener);
        if (keyListenerM3383a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM3383a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C1773u getSuperCaller() {
        if (this.f6785o == null) {
            this.f6785o = new C1773u(this);
        }
        return this.f6785o;
    }

    /* renamed from: b */
    public final C1812h m3467b(C1812h c1812h) {
        this.f6783m.getClass();
        return C2249i.m4024a(this, c1812h);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C1768s0 c1768s0 = this.f6781k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0120b.m406Q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().f6726e;
    }

    public C1765r0 getFontVariationSettingsManager() {
        if (this.f6786p == null) {
            this.f6786p = new C1765r0(this, new C1756p(this, 1));
        }
        return this.f6786p;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6781k.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6781k.m3444g();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1701b0 c1701b0;
        if (Build.VERSION.SDK_INT >= 28 || (c1701b0 = this.f6782l) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1701b0.f6511c;
        return textClassifier == null ? AbstractC0622v.m1395g((TextView) c1701b0.f6510b) : textClassifier;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().f6724c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] strArrM3602g;
        InputConnection c2038d;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6781k.getClass();
        C1768s0.m3439j(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0715d.m1552U(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrM3602g = AbstractC1828m0.m3602g(this)) != null) {
            AbstractC2036b.m3927b(editorInfo, strArrM3602g);
            C0456a c0456a = new C0456a(10, this);
            if (i >= 25) {
                c2038d = new C2037c(inputConnectionOnCreateInputConnection, c0456a);
            } else if (AbstractC2036b.m3926a(editorInfo).length != 0) {
                c2038d = new C2038d(inputConnectionOnCreateInputConnection, c0456a);
            }
            inputConnectionOnCreateInputConnection = c2038d;
        }
        return this.f6784n.m3385c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        InterfaceC1803e c1800d;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC1828m0.m3602g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        c1800d = new C1800d(clipData, 3);
                    } else {
                        C1806f c1806f = new C1806f();
                        c1806f.f6870b = clipData;
                        c1806f.f6871c = 3;
                        c1800d = c1806f;
                    }
                    AbstractC1828m0.m3604i(this, c1800d.build());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC1803e c1800d;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || AbstractC1828m0.m3602g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                c1800d = new C1800d(primaryClip, 1);
            } else {
                C1806f c1806f = new C1806f();
                c1806f.f6870b = primaryClip;
                c1806f.f6871c = 1;
                c1800d = c1806f;
            }
            c1800d.mo3523c(i == 16908322 ? 0 : 1);
            AbstractC1828m0.m3604i(this, c1800d.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6781k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6781k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0120b.m407R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f6784n.m3386d(z7);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().m3436a(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6784n.m3383a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6780j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6781k;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6781k;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1768s0 c1768s0 = this.f6781k;
        if (c1768s0 != null) {
            c1768s0.m3446i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1701b0 c1701b0;
        if (Build.VERSION.SDK_INT >= 28 || (c1701b0 = this.f6782l) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1701b0.f6511c = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        C1765r0 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.f6724c = typeface;
        fontVariationSettingsManager.f6725d = typeface;
        fontVariationSettingsManager.f6723b.accept(typeface);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
