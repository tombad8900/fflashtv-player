package p079j0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.bumptech.glide.AbstractC0715d;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005a4.ThreadFactoryC0069a;
import p037e0.AbstractC0854e;
import p130p.C2191j;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.h */
/* loaded from: classes.dex */
public abstract class AbstractC1480h {

    /* renamed from: a */
    public static final C2191j f5703a = new C2191j(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f5704b;

    /* renamed from: c */
    public static final Object f5705c;

    /* renamed from: d */
    public static final C2192k f5706d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0069a(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5704b = threadPoolExecutor;
        f5705c = new Object();
        f5706d = new C2192k(0);
    }

    /* renamed from: a */
    public static String m3143a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((C1476d) list.get(i4)).f5693e);
            sb.append("-");
            sb.append(i);
            if (i4 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        throw r8;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1479g m3144b(String str, Context context, List list, int i) {
        int i4;
        Typeface typefaceMo1605s;
        C2191j c2191j = f5703a;
        AbstractC0715d.m1561g("getFontSync");
        try {
            Typeface typeface = (Typeface) c2191j.m3979g(str);
            if (typeface != null) {
                return new C1479g(typeface);
            }
            C1481i c1481iM3140a = AbstractC1475c.m3140a(context, list);
            List list2 = c1481iM3140a.f5708b;
            int i8 = c1481iM3140a.f5707a;
            if (i8 != 0) {
                i4 = i8 != 1 ? -3 : -2;
            } else {
                C1482j[] c1482jArr = (C1482j[]) list2.get(0);
                if (c1482jArr == null || c1482jArr.length == 0) {
                    i4 = 1;
                } else {
                    int length = c1482jArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            i4 = 0;
                            break;
                        }
                        int i10 = c1482jArr[i9].f5713e;
                        if (i10 == 0) {
                            i9++;
                        } else if (i10 >= 0) {
                            i4 = i10;
                        }
                    }
                }
            }
            if (i4 != 0) {
                return new C1479g(i4);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                C1482j[] c1482jArr2 = (C1482j[]) list2.get(0);
                AbstractC0715d abstractC0715d = AbstractC0854e.f3776a;
                AbstractC0715d.m1561g("TypefaceCompat.createFromFontInfo");
                typefaceMo1605s = AbstractC0854e.f3776a.mo1605s(context, c1482jArr2, i);
                Trace.endSection();
            } else {
                AbstractC0715d abstractC0715d2 = AbstractC0854e.f3776a;
                AbstractC0715d.m1561g("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceMo1605s = AbstractC0854e.f3776a.mo1606t(context, list2, i);
                Trace.endSection();
            }
            if (typefaceMo1605s == null) {
                return new C1479g(-3);
            }
            c2191j.m3983k(str, typefaceMo1605s);
            return new C1479g(typefaceMo1605s);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1479g(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}
