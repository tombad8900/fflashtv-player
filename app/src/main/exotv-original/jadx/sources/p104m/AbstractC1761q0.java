package p104m;

import android.graphics.Paint;
import android.widget.TextView;
import java.util.Objects;
import okhttp3.C2181z;
import p130p.C2191j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC1761q0 {

    /* renamed from: a */
    public static final C2191j f6712a = new C2191j(30);

    /* renamed from: b */
    public static Paint f6713b;

    /* renamed from: a */
    public static int m3431a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static String m3432b(TextView textView) {
        return textView.getFontVariationSettings();
    }

    /* renamed from: c */
    public static void m3433c(TextView textView, int i, int i4, int i8) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i8, 0);
    }

    /* renamed from: d */
    public static void m3434d(TextView textView, int[] iArr) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
    }

    /* renamed from: e */
    public static void m3435e(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings(C2181z.FRAGMENT_ENCODE_SET);
        }
        textView.setFontVariationSettings(str);
    }
}
