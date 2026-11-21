package p193w2;

import android.text.Html;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC2608d0 {

    /* renamed from: a */
    public static final Pattern f9415a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: a */
    public static String m4692a(CharSequence charSequence) {
        return f9415a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
