package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.exotv.net.R;
import okhttp3.C2181z;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p095l.C1630p;
import p095l.InterfaceC1610a0;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1610a0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: j */
    public C1630p f623j;

    /* renamed from: k */
    public ImageView f624k;

    /* renamed from: l */
    public RadioButton f625l;

    /* renamed from: m */
    public TextView f626m;

    /* renamed from: n */
    public CheckBox f627n;

    /* renamed from: o */
    public TextView f628o;

    /* renamed from: p */
    public ImageView f629p;

    /* renamed from: q */
    public ImageView f630q;

    /* renamed from: r */
    public LinearLayout f631r;

    /* renamed from: s */
    public final Drawable f632s;

    /* renamed from: t */
    public final int f633t;

    /* renamed from: u */
    public final Context f634u;

    /* renamed from: v */
    public boolean f635v;

    /* renamed from: w */
    public final Drawable f636w;

    /* renamed from: x */
    public final boolean f637x;

    /* renamed from: y */
    public LayoutInflater f638y;

    /* renamed from: z */
    public boolean f639z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0073c c0073cM263F = C0073c.m263F(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, AbstractC1026a.f4325r);
        this.f632s = c0073cM263F.m299x(5);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        this.f633t = typedArray.getResourceId(1, -1);
        this.f635v = typedArray.getBoolean(7, false);
        this.f634u = context;
        this.f636w = c0073cM263F.m299x(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f637x = typedArrayObtainStyledAttributes.hasValue(0);
        c0073cM263F.m275I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f638y == null) {
            this.f638y = LayoutInflater.from(getContext());
        }
        return this.f638y;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f629p;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f630q;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f630q.getLayoutParams();
        rect.top = this.f630q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // p095l.InterfaceC1610a0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo437b(C1630p c1630p) {
        boolean z7;
        int i;
        String string;
        boolean z8;
        this.f623j = c1630p;
        boolean zIsVisible = c1630p.isVisible();
        MenuC1627m menuC1627m = c1630p.f6255w;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c1630p.f6246n);
        setCheckable(c1630p.isCheckable());
        if (menuC1627m.mo3297o()) {
            if ((menuC1627m.mo3296n() ? c1630p.f6251s : c1630p.f6249q) != 0) {
                z7 = true;
            }
        } else {
            z7 = false;
        }
        menuC1627m.mo3296n();
        if (z7) {
            C1630p c1630p2 = this.f623j;
            MenuC1627m menuC1627m2 = c1630p2.f6255w;
            if (menuC1627m2.mo3297o()) {
                if ((menuC1627m2.mo3296n() ? c1630p2.f6251s : c1630p2.f6249q) != 0) {
                    z8 = true;
                }
                if (z8) {
                }
            } else {
                z8 = false;
                i = z8 ? 0 : 8;
            }
        }
        if (i == 0) {
            TextView textView = this.f628o;
            C1630p c1630p3 = this.f623j;
            MenuC1627m menuC1627m3 = c1630p3.f6255w;
            Context context = menuC1627m3.f6209j;
            char c8 = menuC1627m3.mo3296n() ? c1630p3.f6251s : c1630p3.f6249q;
            if (c8 == 0) {
                string = C2181z.FRAGMENT_ENCODE_SET;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = menuC1627m3.mo3296n() ? c1630p3.f6252t : c1630p3.f6250r;
                C1630p.m3333c(i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                C1630p.m3333c(i4, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                C1630p.m3333c(i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                C1630p.m3333c(i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                C1630p.m3333c(i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                C1630p.m3333c(i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c8 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c8 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c8 != ' ') {
                    sb.append(c8);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f628o.getVisibility() != i) {
            this.f628o.setVisibility(i);
        }
        setIcon(c1630p.getIcon());
        setEnabled(c1630p.isEnabled());
        setSubMenuArrowVisible(c1630p.hasSubMenu());
        setContentDescription(c1630p.f6258z);
    }

    @Override // p095l.InterfaceC1610a0
    public C1630p getItemData() {
        return this.f623j;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f632s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f626m = textView;
        int i = this.f633t;
        if (i != -1) {
            textView.setTextAppearance(this.f634u, i);
        }
        this.f628o = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f629p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f636w);
        }
        this.f630q = (ImageView) findViewById(R.id.group_divider);
        this.f631r = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        if (this.f624k != null && this.f635v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f624k.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i, i4);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f625l == null && this.f627n == null) {
            return;
        }
        if ((this.f623j.f6236G & 4) != 0) {
            if (this.f625l == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f625l = radioButton;
                LinearLayout linearLayout = this.f631r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f625l;
            view = this.f627n;
        } else {
            if (this.f627n == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f627n = checkBox;
                LinearLayout linearLayout2 = this.f631r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f627n;
            view = this.f625l;
        }
        if (z7) {
            compoundButton.setChecked(this.f623j.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f627n;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f625l;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if ((this.f623j.f6236G & 4) != 0) {
            if (this.f625l == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f625l = radioButton;
                LinearLayout linearLayout = this.f631r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f625l;
        } else {
            if (this.f627n == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f627n = checkBox;
                LinearLayout linearLayout2 = this.f631r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f627n;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f639z = z7;
        this.f635v = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f630q;
        if (imageView != null) {
            imageView.setVisibility((this.f637x || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC1627m menuC1627m = this.f623j.f6255w;
        boolean z7 = this.f639z;
        if (z7 || this.f635v) {
            ImageView imageView = this.f624k;
            if (imageView == null && drawable == null && !this.f635v) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f624k = imageView2;
                LinearLayout linearLayout = this.f631r;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f635v) {
                this.f624k.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f624k;
            if (!z7) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f624k.getVisibility() != 0) {
                this.f624k.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f626m.getVisibility() != 8) {
                this.f626m.setVisibility(8);
            }
        } else {
            this.f626m.setText(charSequence);
            if (this.f626m.getVisibility() != 0) {
                this.f626m.setVisibility(0);
            }
        }
    }
}
