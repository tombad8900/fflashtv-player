package p029d0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p037e0.AbstractC0854e;
import p130p.C2191j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0795k {

    /* renamed from: a */
    public static final ThreadLocal f3568a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f3569b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f3570c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m1947a(Context context, int i, TypedValue typedValue, int i4, AbstractC0786b abstractC0786b, boolean z7, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM2027a = null;
        if (string.startsWith("res/")) {
            int i8 = typedValue.assetCookie;
            C2191j c2191j = AbstractC0854e.f3777b;
            Typeface typeface = (Typeface) c2191j.m3979g(AbstractC0854e.m2028b(resources, i, string, i8, i4));
            if (typeface != null) {
                if (abstractC0786b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0320i(abstractC0786b, 6, typeface));
                }
                typefaceM2027a = typeface;
            } else if (!z8) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0788d interfaceC0788dM1937i = AbstractC0786b.m1937i(resources.getXml(i), resources);
                        if (interfaceC0788dM1937i == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC0786b != null) {
                                abstractC0786b.m1941a(-3);
                            }
                        } else {
                            typefaceM2027a = AbstractC0854e.m2027a(context, interfaceC0788dM1937i, resources, i, string, typedValue.assetCookie, i4, abstractC0786b, z7);
                        }
                    } else {
                        int i9 = typedValue.assetCookie;
                        Typeface typefaceMo1608v = AbstractC0854e.f3776a.mo1608v(context, resources, i, string, i4);
                        if (typefaceMo1608v != null) {
                            c2191j.m3983k(AbstractC0854e.m2028b(resources, i, string, i9, i4), typefaceMo1608v);
                        }
                        if (abstractC0786b != null) {
                            if (typefaceMo1608v != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0320i(abstractC0786b, 6, typefaceMo1608v));
                            } else {
                                abstractC0786b.m1941a(-3);
                            }
                        }
                        typefaceM2027a = typefaceMo1608v;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC0786b != null) {
                        abstractC0786b.m1941a(-3);
                    }
                    if (typefaceM2027a == null) {
                    }
                    return typefaceM2027a;
                } catch (XmlPullParserException e8) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e8);
                    if (abstractC0786b != null) {
                    }
                    if (typefaceM2027a == null) {
                    }
                    return typefaceM2027a;
                }
            }
        } else if (abstractC0786b != null) {
            abstractC0786b.m1941a(-3);
        }
        if (typefaceM2027a == null || abstractC0786b != null || z8) {
            return typefaceM2027a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
