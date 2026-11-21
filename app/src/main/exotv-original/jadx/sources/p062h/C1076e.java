package p062h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.exotv.net.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754l;
import java.lang.ref.WeakReference;
import p054g.AbstractC1026a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.e */
/* loaded from: classes.dex */
public final class C1076e {

    /* renamed from: A */
    public final int f4529A;

    /* renamed from: B */
    public final int f4530B;

    /* renamed from: C */
    public final boolean f4531C;

    /* renamed from: D */
    public final HandlerC1072c f4532D;

    /* renamed from: a */
    public final Context f4534a;

    /* renamed from: b */
    public final DialogInterfaceC1080g f4535b;

    /* renamed from: c */
    public final Window f4536c;

    /* renamed from: d */
    public CharSequence f4537d;

    /* renamed from: e */
    public AlertController$RecycleListView f4538e;

    /* renamed from: f */
    public View f4539f;

    /* renamed from: h */
    public Button f4541h;

    /* renamed from: i */
    public CharSequence f4542i;

    /* renamed from: j */
    public Message f4543j;

    /* renamed from: k */
    public Button f4544k;

    /* renamed from: l */
    public CharSequence f4545l;

    /* renamed from: m */
    public Message f4546m;

    /* renamed from: n */
    public Button f4547n;

    /* renamed from: o */
    public CharSequence f4548o;

    /* renamed from: p */
    public Message f4549p;

    /* renamed from: q */
    public NestedScrollView f4550q;

    /* renamed from: r */
    public Drawable f4551r;

    /* renamed from: s */
    public ImageView f4552s;

    /* renamed from: t */
    public TextView f4553t;

    /* renamed from: u */
    public TextView f4554u;

    /* renamed from: v */
    public View f4555v;

    /* renamed from: w */
    public ListAdapter f4556w;

    /* renamed from: y */
    public final int f4558y;

    /* renamed from: z */
    public final int f4559z;

    /* renamed from: g */
    public boolean f4540g = false;

    /* renamed from: x */
    public int f4557x = -1;

    /* renamed from: E */
    public final ViewOnClickListenerC0754l f4533E = new ViewOnClickListenerC0754l(1, this);

    public C1076e(Context context, DialogInterfaceC1080g dialogInterfaceC1080g, Window window) {
        this.f4534a = context;
        this.f4535b = dialogInterfaceC1080g;
        this.f4536c = window;
        HandlerC1072c handlerC1072c = new HandlerC1072c();
        handlerC1072c.f4522a = new WeakReference(dialogInterfaceC1080g);
        this.f4532D = handlerC1072c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1026a.f4312e, R.attr.alertDialogStyle, 0);
        this.f4558y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f4559z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f4529A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f4530B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f4531C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1080g.m2274d().mo2310f(1);
    }

    /* renamed from: a */
    public static boolean m2253a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2253a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ViewGroup m2254b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: c */
    public final void m2255c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f4532D.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f4548o = charSequence;
            this.f4549p = messageObtainMessage;
        } else if (i == -2) {
            this.f4545l = charSequence;
            this.f4546m = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f4542i = charSequence;
            this.f4543j = messageObtainMessage;
        }
    }
}
