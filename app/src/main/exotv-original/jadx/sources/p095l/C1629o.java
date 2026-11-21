package p095l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.C0169a;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.MainActivity;
import com.exotv.net.model.BackupSource;
import com.exotv.net.model.Channel;
import com.exotv.net.model.ResolvedStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.C2181z;
import p002a1.C0021g0;
import p002a1.C0048u;
import p005a4.C0073c;
import p005a4.C0087j;
import p017b6.AbstractC0622v;
import p063h1.AbstractC1101a;
import p065h3.C1159d;
import p065h3.C1163h;
import p069h7.AbstractC1206h;
import p073i3.EnumC1257f;
import p090k2.InterfaceC1590h;
import p102l6.C1687d;
import p104m.C1719f2;
import p104m.C1736k;
import p104m.InterfaceC1748n;
import p104m.InterfaceC1771t0;
import p105m0.AbstractC1828m0;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.C1854v;
import p105m0.InterfaceC1833o;
import p108m3.C1895j;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p111m6.C1922q;
import p114n0.C1952d;
import p117n3.InterfaceC2002b;
import p134p3.C2207a;
import p134p3.C2208b;
import p134p3.C2209c;
import p134p3.C2212f;
import p134p3.InterfaceC2213g;
import p146q6.EnumC2273a;
import p151r3.C2299k;
import p151r3.C2303o;
import p151r3.C2306r;
import p154r6.AbstractC2320c;
import p160s3.C2350a;
import p160s3.C2357h;
import p160s3.EnumC2356g;
import p185v3.AbstractC2534d;
import p185v3.AbstractC2536f;
import p202x2.InterfaceC2747c;
import p213z.C2866d;
import p218z4.AbstractC2955l0;
import p218z4.C2952k;
import p218z4.C2953k0;
import p218z4.C2957m0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.o */
/* loaded from: classes.dex */
public class C1629o implements InterfaceC1590h, InterfaceC1639y, InterfaceC1625k, InterfaceC1771t0, InterfaceC2213g, InterfaceC2747c, InterfaceC1833o {

    /* renamed from: j */
    public Object f6229j;

    public /* synthetic */ C1629o(Object obj) {
        this.f6229j = obj;
    }

    /* renamed from: v */
    public static C2306r m3321v(C1895j c1895j, C2299k c2299k, C2207a c2207a, C2208b c2208b) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c2299k.f8027a.getResources(), c2208b.f7721a);
        EnumC1257f enumC1257f = EnumC1257f.f5251j;
        Map map = c2208b.f7722b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z7 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = AbstractC2536f.f9216a;
        if (c1895j != null && c1895j.f7103g) {
            z7 = true;
        }
        return new C2306r(bitmapDrawable, c2299k, enumC1257f, c2207a, str, zBooleanValue, z7);
    }

    @Override // p134p3.InterfaceC2213g
    /* renamed from: a */
    public void mo44a(int i) {
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: b */
    public void mo2315b(MenuC1627m menuC1627m, boolean z7) {
        if (menuC1627m instanceof SubMenuC1620f0) {
            ((SubMenuC1620f0) menuC1627m).f6159I.mo3294k().m3308c(false);
        }
        InterfaceC1639y interfaceC1639y = ((C1736k) this.f6229j).f6594n;
        if (interfaceC1639y != null) {
            interfaceC1639y.mo2315b(menuC1627m, z7);
        }
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: c */
    public int mo281c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p202x2.InterfaceC2747c
    /* renamed from: d */
    public void mo3322d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p134p3.InterfaceC2213g
    /* renamed from: e */
    public C2208b mo48e(C2207a c2207a) {
        return null;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: f */
    public long mo284f(int i) {
        AbstractC1101a.m2353d(i == 0);
        return 0L;
    }

    @Override // p134p3.InterfaceC2213g
    /* renamed from: g */
    public void mo50g(C2207a c2207a, Bitmap bitmap, Map map) {
        ((C0087j) this.f6229j).m322h(c2207a, bitmap, map, AbstractC0622v.m1392d(bitmap));
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: h */
    public void mo2264h(MenuC1627m menuC1627m) {
        C1719f2 c1719f2 = ((ActionMenuView) this.f6229j).f713D;
        if (c1719f2 != null) {
            c1719f2.mo2264h(menuC1627m);
        }
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: i */
    public boolean mo2316i(MenuC1627m menuC1627m) {
        C1736k c1736k = (C1736k) this.f6229j;
        if (menuC1627m == c1736k.f6592l) {
            return false;
        }
        ((SubMenuC1620f0) menuC1627m).f6160J.getClass();
        c1736k.getClass();
        InterfaceC1639y interfaceC1639y = c1736k.f6594n;
        if (interfaceC1639y != null) {
            return interfaceC1639y.mo2316i(menuC1627m);
        }
        return false;
    }

    @Override // p202x2.InterfaceC2747c
    /* renamed from: j */
    public void mo3323j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = C2181z.FRAGMENT_ENCODE_SET;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6229j).setResultCode(i);
    }

    @Override // p095l.InterfaceC1625k
    /* renamed from: k */
    public boolean mo2267k(MenuC1627m menuC1627m, MenuItem menuItem) {
        InterfaceC1748n interfaceC1748n = ((ActionMenuView) this.f6229j).f718I;
        if (interfaceC1748n == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C1719f2) interfaceC1748n).f6545j.f751P.f326m).iterator();
        while (it.hasNext()) {
            if (((C0021g0) it.next()).f77a.m149o()) {
                return true;
            }
        }
        return false;
    }

    @Override // p104m.InterfaceC1771t0
    /* renamed from: l */
    public void mo3324l(int i) {
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: m */
    public List mo291m(long j) {
        return j >= 0 ? (List) this.f6229j : Collections.EMPTY_LIST;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: n */
    public int mo292n() {
        return 1;
    }

    @Override // p104m.InterfaceC1771t0
    /* renamed from: o */
    public void mo3325o(int i) {
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        C1835o1 c1835o1 = c1844r1.f6934a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f6229j;
        if (!Objects.equals(coordinatorLayout.f821w, c1844r1)) {
            coordinatorLayout.f821w = c1844r1;
            boolean z7 = c1844r1.m3625d() > 0;
            coordinatorLayout.f822x = z7;
            coordinatorLayout.setWillNotDraw(!z7 && coordinatorLayout.getBackground() == null);
            if (!c1835o1.mo3578n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    if (childAt.getFitsSystemWindows() && ((C2866d) childAt.getLayoutParams()).f10572a != null && c1835o1.mo3578n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c1844r1;
    }

    @Override // p104m.InterfaceC1771t0
    /* renamed from: q */
    public void mo3326q(int i, float f8) {
    }

    /* renamed from: r */
    public C1952d mo3327r(int i) {
        return null;
    }

    /* renamed from: s */
    public C1952d mo3328s(int i) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2208b m3329t(C2299k c2299k, C2207a c2207a, C2357h c2357h, EnumC2356g enumC2356g) {
        C2208b c2208bMo48e;
        ?? r9;
        boolean zEquals;
        C2208b c2208b;
        if (c2299k.f8041o.f7992j) {
            C2209c c2209c = (C2209c) ((C1163h) this.f6229j).f4995c.getValue();
            if (c2209c != null) {
                c2208bMo48e = c2209c.f7723a.mo48e(c2207a);
                if (c2208bMo48e == null) {
                    C0087j c0087j = c2209c.f7724b;
                    synchronized (c0087j) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) c0087j.f386k).get(c2207a);
                            c2208b = null;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        break;
                                    }
                                    C2212f c2212f = (C2212f) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) c2212f.f7730b.get();
                                    C2208b c2208b2 = bitmap != null ? new C2208b(bitmap, c2212f.f7731c) : null;
                                    if (c2208b2 != null) {
                                        c2208b = c2208b2;
                                        break;
                                    }
                                    i++;
                                }
                                int i4 = c0087j.f385j;
                                c0087j.f385j = i4 + 1;
                                if (i4 >= 10) {
                                    c0087j.m319e();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c2208bMo48e = c2208b;
                }
            } else {
                c2208bMo48e = null;
            }
            if (c2208bMo48e != null) {
                Bitmap bitmap2 = c2208bMo48e.f7721a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (C0073c.m262D(c2299k, config)) {
                    Object obj = c2208bMo48e.f7722b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (!AbstractC2980h.m5132a(c2357h, C2357h.f8269c)) {
                        String str = (String) c2207a.f7720k.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(c2357h.toString());
                            if (zEquals) {
                            }
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            AbstractC0715d abstractC0715d = c2357h.f8270a;
                            int i8 = abstractC0715d instanceof C2350a ? ((C2350a) abstractC0715d).f8260n : Integer.MAX_VALUE;
                            AbstractC0715d abstractC0715d2 = c2357h.f8271b;
                            int i9 = abstractC0715d2 instanceof C2350a ? ((C2350a) abstractC0715d2).f8260n : Integer.MAX_VALUE;
                            double dM418n = AbstractC0120b.m418n(width, height, i8, i9, enumC2356g);
                            boolean zM4553a = AbstractC2534d.m4553a(c2299k);
                            if (zM4553a) {
                                double d8 = dM418n > 1.0d ? 1.0d : dM418n;
                                if (Math.abs(i8 - (d8 * width)) > 1.0d && Math.abs(i9 - (d8 * height)) > 1.0d) {
                                    r9 = 1;
                                }
                                r9 = 1;
                                zEquals = r9;
                                if (zEquals) {
                                }
                            } else {
                                if (i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE) {
                                    r9 = 1;
                                } else {
                                    int iAbs = Math.abs(i8 - width);
                                    r9 = 1;
                                    r9 = 1;
                                    if (iAbs <= 1) {
                                    }
                                }
                                if (i9 != Integer.MIN_VALUE && i9 != Integer.MAX_VALUE) {
                                    r9 = r9;
                                    if (Math.abs(i9 - height) > r9) {
                                    }
                                }
                                zEquals = r9;
                                if (zEquals) {
                                }
                            }
                            if ((dM418n == 1.0d || zM4553a) && (dM418n <= 1.0d || !zBooleanValue)) {
                                zEquals = r9;
                            }
                            if (zEquals) {
                            }
                        }
                    }
                } else {
                    zEquals = false;
                    if (zEquals) {
                        return c2208bMo48e;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: u */
    public C2207a m3330u(C2299k c2299k, Object obj, C2303o c2303o, C1159d c1159d) {
        String strMo3880a;
        Map linkedHashMap;
        c2299k.getClass();
        List list = c2299k.f8033g;
        List list2 = ((C1163h) this.f6229j).f4999g.f4979c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strMo3880a = null;
                break;
            }
            C1687d c1687d = (C1687d) list2.get(i);
            InterfaceC2002b interfaceC2002b = (InterfaceC2002b) c1687d.f6486j;
            if (((Class) c1687d.f6487k).isAssignableFrom(obj.getClass())) {
                AbstractC2980h.m5134c("null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>", interfaceC2002b);
                strMo3880a = interfaceC2002b.mo3880a(obj, c2303o);
                if (strMo3880a != null) {
                    break;
                }
            }
            i++;
        }
        if (strMo3880a == null) {
            return null;
        }
        Map map = c2299k.f8051y.f8071j;
        boolean zIsEmpty = map.isEmpty();
        C1922q c1922q = C1922q.f7188j;
        if (zIsEmpty) {
            linkedHashMap = c1922q;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new C2207a(strMo3880a, c1922q);
        }
        LinkedHashMap linkedHashMapM3764Y = AbstractC1924s.m3764Y(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            linkedHashMapM3764Y.put("coil#transformation_size", c2303o.f8058d.toString());
        }
        return new C2207a(strMo3880a, linkedHashMapM3764Y);
    }

    /* renamed from: w */
    public boolean mo3331w(int i, int i4, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3332x(Channel channel, AbstractC2320c abstractC2320c) throws Throwable {
        C2957m0 c2957m0;
        Iterable iterable;
        if (abstractC2320c instanceof C2957m0) {
            c2957m0 = (C2957m0) abstractC2320c;
            int i = c2957m0.f11025p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2957m0.f11025p = i - Integer.MIN_VALUE;
            } else {
                c2957m0 = new C2957m0(this, abstractC2320c);
            }
        }
        Object objM5128e = c2957m0.f11023n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2957m0.f11025p;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM5128e);
            if (channel.isBackup() && !channel.getBackups().isEmpty()) {
                BackupSource backupSource = (BackupSource) AbstractC1913h.m3736A0(channel.getBackups());
                return AbstractC0715d.m1551T(new ResolvedStream(backupSource.getUrl(), backupSource.getHeaders(), backupSource.getName()));
            }
            int i8 = AbstractC2955l0.f11018a[channel.getResolverKind().ordinal()];
            C2953k0 c2953k0 = C2953k0.f11014a;
            if (i8 == 1) {
                c2957m0.f11022m = channel;
                c2957m0.f11025p = 1;
                objM5128e = c2953k0.m5128e(channel, c2957m0);
            } else if (i8 == 2) {
                String idO = channel.getIdO();
                AbstractC2980h.m5133b(idO);
                String catO = channel.getCatO();
                AbstractC2980h.m5133b(catO);
                c2957m0.f11022m = channel;
                c2957m0.f11025p = 2;
                objM5128e = c2953k0.m5126a(idO, catO, c2957m0);
            } else if (i8 == 3) {
                C2952k c2952k = C2952k.f11010a;
                MainActivity mainActivity = (MainActivity) this.f6229j;
                c2957m0.f11022m = channel;
                c2957m0.f11025p = 3;
                objM5128e = c2952k.m5123k(mainActivity, channel, c2957m0);
            } else if (i8 == 4) {
                iterable = C1921p.f7187j;
            } else {
                if (i8 != 5) {
                    throw new C0048u();
                }
                String id = channel.getId();
                if (id == null && (id = channel.getIdO()) == null) {
                    id = C2181z.FRAGMENT_ENCODE_SET;
                }
                c2957m0.f11022m = channel;
                c2957m0.f11025p = 4;
                objM5128e = c2953k0.m5127d(id, c2957m0);
            }
            return enumC2273a;
        }
        if (i4 == 1) {
            channel = c2957m0.f11022m;
            AbstractC0714c.m1516d0(objM5128e);
            iterable = (List) objM5128e;
        } else if (i4 == 2) {
            channel = c2957m0.f11022m;
            AbstractC0714c.m1516d0(objM5128e);
            iterable = (List) objM5128e;
        } else if (i4 == 3) {
            channel = c2957m0.f11022m;
            AbstractC0714c.m1516d0(objM5128e);
            iterable = (List) objM5128e;
        } else {
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = c2957m0.f11022m;
            AbstractC0714c.m1516d0(objM5128e);
            iterable = (List) objM5128e;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!AbstractC1206h.m2630D0(((ResolvedStream) obj).getUrl())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            Log.w("Resolver", "resolve failed for '" + channel.getDisplayName() + "'");
            return arrayList;
        }
        if (arrayList.size() > 1) {
            Log.i("Resolver", "resolved " + arrayList.size() + " servers for '" + channel.getDisplayName() + "'");
        }
        return arrayList;
    }

    public C1629o(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f6229j = new C0169a(view);
            return;
        }
        C1854v c1854v = new C1854v(view);
        c1854v.f6949b = view;
        this.f6229j = c1854v;
    }
}
