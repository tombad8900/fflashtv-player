package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.exotv.net.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import okhttp3.C2181z;
import p105m0.RunnableC1848t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: j */
    public final Chip f3485j;

    /* renamed from: k */
    public final EditText f3486k;

    /* renamed from: l */
    public final TextView f3487l;

    /* renamed from: m */
    public String f3488m;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3488m = C2181z.FRAGMENT_ENCODE_SET;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f3485j = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3486k = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C0771b(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.f3487l = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        new C0770a(this, 0);
    }

    /* renamed from: a */
    public static String m1922a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3485j.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3486k.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z7) {
        Chip chip = this.f3485j;
        chip.setChecked(z7);
        if (z7) {
            chip.setText(C2181z.FRAGMENT_ENCODE_SET);
            chip.setImportantForAccessibility(2);
        } else {
            chip.setText(this.f3488m);
            chip.setImportantForAccessibility(1);
        }
        int i = z7 ? 0 : 4;
        EditText editText = this.f3486k;
        editText.setVisibility(i);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new RunnableC1848t(editText, 1));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3485j.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f3485j.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f3485j.toggle();
    }
}
