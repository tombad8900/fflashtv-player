package p015b4;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import okhttp3.C2181z;
import p002a1.C0016e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b4.k */
/* loaded from: classes.dex */
public final class C0577k {

    /* renamed from: d */
    public static final Bitmap.Config[] f2303d;

    /* renamed from: e */
    public static final Bitmap.Config[] f2304e;

    /* renamed from: f */
    public static final Bitmap.Config[] f2305f;

    /* renamed from: g */
    public static final Bitmap.Config[] f2306g;

    /* renamed from: h */
    public static final Bitmap.Config[] f2307h;

    /* renamed from: a */
    public final C0571e f2308a = new C0571e(1);

    /* renamed from: b */
    public final C0016e f2309b = new C0016e(6);

    /* renamed from: c */
    public final HashMap f2310c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f2303d = configArr;
        f2304e = configArr;
        f2305f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f2306g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f2307h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: c */
    public static String m1327c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void m1328a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM1330d = m1330d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM1330d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM1330d.remove(num);
                return;
            } else {
                navigableMapM1330d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m1327c(AbstractC2478m.m4455c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* renamed from: b */
    public final Bitmap m1329b(int i, int i4, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM4456d = AbstractC2478m.m4456d(config) * i * i4;
        C0571e c0571e = this.f2308a;
        InterfaceC0574h interfaceC0574hM1316j = (InterfaceC0574h) ((ArrayDeque) c0571e.f933j).poll();
        if (interfaceC0574hM1316j == null) {
            interfaceC0574hM1316j = c0571e.m1316j();
        }
        C0576j c0576j = (C0576j) interfaceC0574hM1316j;
        c0576j.f2301b = iM4456d;
        c0576j.f2302c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i8 = AbstractC0575i.f2299a[config.ordinal()];
            configArr = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? new Bitmap.Config[]{config} : f2307h : f2306g : f2305f : f2303d;
        } else {
            configArr = f2304e;
        }
        int length = configArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i9];
            Integer num = (Integer) m1330d(config2).ceilingKey(Integer.valueOf(iM4456d));
            if (num == null || num.intValue() > iM4456d * 8) {
                i9++;
            } else if (num.intValue() != iM4456d || (config2 != null ? !config2.equals(config) : config != null)) {
                c0571e.m570c(c0576j);
                int iIntValue = num.intValue();
                InterfaceC0574h interfaceC0574hM1316j2 = (InterfaceC0574h) ((ArrayDeque) c0571e.f933j).poll();
                if (interfaceC0574hM1316j2 == null) {
                    interfaceC0574hM1316j2 = c0571e.m1316j();
                }
                c0576j = (C0576j) interfaceC0574hM1316j2;
                c0576j.f2301b = iIntValue;
                c0576j.f2302c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f2309b.m68y(c0576j);
        if (bitmap != null) {
            m1328a(Integer.valueOf(c0576j.f2301b), bitmap);
            bitmap.reconfigure(i, i4, config);
        }
        return bitmap;
    }

    /* renamed from: d */
    public final NavigableMap m1330d(Bitmap.Config config) {
        HashMap map = this.f2310c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: e */
    public final void m1331e(Bitmap bitmap) {
        int iM4455c = AbstractC2478m.m4455c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C0571e c0571e = this.f2308a;
        InterfaceC0574h interfaceC0574hM1316j = (InterfaceC0574h) ((ArrayDeque) c0571e.f933j).poll();
        if (interfaceC0574hM1316j == null) {
            interfaceC0574hM1316j = c0571e.m1316j();
        }
        C0576j c0576j = (C0576j) interfaceC0574hM1316j;
        c0576j.f2301b = iM4455c;
        c0576j.f2302c = config;
        this.f2309b.m40J(c0576j, bitmap);
        NavigableMap navigableMapM1330d = m1330d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM1330d.get(Integer.valueOf(c0576j.f2301b));
        navigableMapM1330d.put(Integer.valueOf(c0576j.f2301b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f2309b);
        sb.append(", sortedSizes=(");
        HashMap map = this.f2310c;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), C2181z.FRAGMENT_ENCODE_SET);
        }
        sb.append(")}");
        return sb.toString();
    }
}
