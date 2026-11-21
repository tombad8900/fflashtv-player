package p110m5;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.exotv.net.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import okhttp3.C2181z;
import p114n0.C1951c;
import p114n0.C1952d;
import p166t0.AbstractC2388b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m5.d */
/* loaded from: classes.dex */
public final class C1903d extends AbstractC2388b {

    /* renamed from: q */
    public final /* synthetic */ Chip f7114q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1903d(Chip chip, Chip chip2) {
        super(chip2);
        this.f7114q = chip;
    }

    @Override // p166t0.AbstractC2388b
    /* renamed from: l */
    public final void mo3677l(ArrayList arrayList) {
        C1905f c1905f;
        arrayList.add(0);
        Rect rect = Chip.f3203F;
        Chip chip = this.f7114q;
        if (!chip.m1836c() || (c1905f = chip.f3211n) == null || !c1905f.f7153c0 || chip.f3214q == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p166t0.AbstractC2388b
    /* renamed from: o */
    public final void mo3678o(int i, C1952d c1952d) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
        CharSequence charSequence = C2181z.FRAGMENT_ENCODE_SET;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription(C2181z.FRAGMENT_ENCODE_SET);
            accessibilityNodeInfo.setBoundsInParent(Chip.f3203F);
            return;
        }
        Chip chip = this.f7114q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c1952d.m3812b(C1951c.f7246e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        c1952d.m3818i(Button.class.getName());
    }

    @Override // p166t0.AbstractC2388b
    /* renamed from: p */
    public final void mo3679p(int i, boolean z7) {
        Chip chip = this.f7114q;
        if (i == 1) {
            chip.f3219v = z7;
        }
        C1905f c1905f = chip.f3211n;
        boolean z8 = chip.f3219v;
        boolean zM3701U = false;
        if (c1905f.f7154d0 != null) {
            zM3701U = c1905f.m3701U(z8 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : C1905f.f7115X0);
        }
        if (zM3701U) {
            chip.refreshDrawableState();
        }
    }
}
