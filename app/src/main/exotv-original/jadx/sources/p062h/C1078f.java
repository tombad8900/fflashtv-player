package p062h;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import p095l.DialogInterfaceOnKeyListenerC1628n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.f */
/* loaded from: classes.dex */
public class C1078f {

    /* renamed from: a */
    public final C1070b f4562a;

    /* renamed from: b */
    public final int f4563b;

    public C1078f(Context context) {
        this(context, DialogInterfaceC1080g.m2273g(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC1080g create() {
        C1070b c1070b = this.f4562a;
        DialogInterfaceC1080g dialogInterfaceC1080g = new DialogInterfaceC1080g(c1070b.f4506a, this.f4563b);
        View view = c1070b.f4510e;
        C1076e c1076e = dialogInterfaceC1080g.f4571o;
        if (view != null) {
            c1076e.f4555v = view;
        } else {
            CharSequence charSequence = c1070b.f4509d;
            if (charSequence != null) {
                c1076e.f4537d = charSequence;
                TextView textView = c1076e.f4553t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                c1076e.f4536c.setTitle(charSequence);
            }
            Drawable drawable = c1070b.f4508c;
            if (drawable != null) {
                c1076e.f4551r = drawable;
                ImageView imageView = c1076e.f4552s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1076e.f4552s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c1070b.f4511f;
        if (charSequence2 != null) {
            c1076e.m2255c(-1, charSequence2, c1070b.f4512g);
        }
        CharSequence charSequence3 = c1070b.f4513h;
        if (charSequence3 != null) {
            c1076e.m2255c(-2, charSequence3, c1070b.f4514i);
        }
        if (c1070b.f4516k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1070b.f4507b.inflate(c1076e.f4559z, (ViewGroup) null);
            int i = c1070b.f4519n ? c1076e.f4529A : c1076e.f4530B;
            Object obj = c1070b.f4516k;
            ?? c1074d = obj;
            if (obj == null) {
                c1074d = new C1074d(c1070b.f4506a, i, R.id.text1, null);
            }
            c1076e.f4556w = c1074d;
            c1076e.f4557x = c1070b.f4520o;
            if (c1070b.f4517l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1068a(c1070b, c1076e));
            }
            if (c1070b.f4519n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1076e.f4538e = alertController$RecycleListView;
        }
        View view2 = c1070b.f4518m;
        if (view2 != null) {
            c1076e.f4539f = view2;
            c1076e.f4540g = false;
        }
        dialogInterfaceC1080g.setCancelable(true);
        dialogInterfaceC1080g.setCanceledOnTouchOutside(true);
        dialogInterfaceC1080g.setOnCancelListener(null);
        dialogInterfaceC1080g.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC1628n dialogInterfaceOnKeyListenerC1628n = c1070b.f4515j;
        if (dialogInterfaceOnKeyListenerC1628n != null) {
            dialogInterfaceC1080g.setOnKeyListener(dialogInterfaceOnKeyListenerC1628n);
        }
        return dialogInterfaceC1080g;
    }

    public Context getContext() {
        return this.f4562a.f4506a;
    }

    public C1078f setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1070b c1070b = this.f4562a;
        c1070b.f4513h = c1070b.f4506a.getText(i);
        c1070b.f4514i = onClickListener;
        return this;
    }

    public C1078f setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1070b c1070b = this.f4562a;
        c1070b.f4511f = c1070b.f4506a.getText(i);
        c1070b.f4512g = onClickListener;
        return this;
    }

    public C1078f setTitle(CharSequence charSequence) {
        this.f4562a.f4509d = charSequence;
        return this;
    }

    public C1078f setView(View view) {
        this.f4562a.f4518m = view;
        return this;
    }

    public C1078f(Context context, int i) {
        this.f4562a = new C1070b(new ContextThemeWrapper(context, DialogInterfaceC1080g.m2273g(context, i)));
        this.f4563b = i;
    }
}
