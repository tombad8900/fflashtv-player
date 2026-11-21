package p002a1;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p063h1.AbstractC1101a;
import p156s.AbstractC2334g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.a1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0008a1 {
    /* renamed from: a */
    public static final void m5a(View view, int i) {
        int iM4162a = AbstractC2334g.m4162a(i);
        if (iM4162a == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0035n0.m106G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM4162a == 1) {
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iM4162a == 2) {
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM4162a != 3) {
            return;
        }
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* renamed from: b */
    public static int m6b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(m12h(i, "Unknown visibility "));
    }

    /* renamed from: c */
    public static int m7c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m6b(view.getVisibility());
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m8d(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    /* renamed from: e */
    public static int m9e(String str, int i, int i4) {
        return (str.hashCode() + i) * i4;
    }

    /* renamed from: f */
    public static ClassCastException m10f(int i, ArrayList arrayList) {
        arrayList.get(i).getClass();
        return new ClassCastException();
    }

    /* renamed from: g */
    public static String m11g(int i, int i4, String str, String str2) {
        return str + i + str2 + i4;
    }

    /* renamed from: h */
    public static String m12h(int i, String str) {
        return str + i;
    }

    /* renamed from: i */
    public static String m13i(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m1154B());
        return sb.toString();
    }

    /* renamed from: j */
    public static String m14j(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: k */
    public static String m15k(String str, long j) {
        return str + j;
    }

    /* renamed from: l */
    public static String m16l(String str, String str2) {
        return str + str2;
    }

    /* renamed from: m */
    public static String m17m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: n */
    public static String m18n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: o */
    public static StringBuilder m19o(int i, int i4, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i4);
        sb.append(str3);
        return sb;
    }

    /* renamed from: p */
    public static void m20p(int i, HashMap map, String str, int i4, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i4));
    }

    /* renamed from: q */
    public static /* synthetic */ void m21q(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z7 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z7) {
                    executorService.shutdownNow();
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m22r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: s */
    public static void m23s(String str, int i, String str2) {
        AbstractC1101a.m2348F(str2, str + i);
    }

    /* renamed from: t */
    public static void m24t(String str, String str2, String str3) {
        AbstractC1101a.m2348F(str3, str + str2);
    }

    /* renamed from: u */
    public static String m25u(String str, String str2) {
        return str + str2;
    }

    /* renamed from: v */
    public static /* synthetic */ String m26v(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* renamed from: w */
    public static /* synthetic */ String m27w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* renamed from: x */
    public static /* synthetic */ String m28x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    /* renamed from: y */
    public static /* synthetic */ String m29y(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    /* renamed from: z */
    public static /* synthetic */ String m30z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }
}
