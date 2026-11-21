package p002a1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.AbstractC0157r0;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.InterfaceC0159s0;
import androidx.media3.common.AbstractC0195e;
import androidx.media3.common.AbstractC0198f;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0247v0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0714c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import p005a4.C0073c;
import p005a4.C0074c0;
import p005a4.C0088j0;
import p005a4.C0094o;
import p005a4.C0095p;
import p005a4.C0096q;
import p005a4.C0100u;
import p005a4.RunnableC0091l;
import p007a6.C0112d;
import p015b4.C0572f;
import p023c4.C0641e;
import p030d1.C0797a;
import p033d4.ExecutorServiceC0846e;
import p034d5.AbstractC0847a;
import p041e4.C0880a0;
import p041e4.C0883c;
import p041e4.C0898o;
import p041e4.C0907x;
import p041e4.InterfaceC0901r;
import p041e4.InterfaceC0902s;
import p048f2.C0934c;
import p048f2.C0935d;
import p048f2.C0936e;
import p050f4.C0940a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p066h4.C1176j;
import p066h4.InterfaceC1177k;
import p070i0.InterfaceC1216a;
import p082j3.C1488a;
import p082j3.C1489b;
import p082j3.C1490c;
import p082j3.C1493f;
import p082j3.C1495h;
import p084j5.InterfaceC1504c;
import p095l.C1619f;
import p095l.C1630p;
import p095l.MenuC1627m;
import p095l.RunnableC1617e;
import p095l.ViewOnKeyListenerC1621g;
import p104m.C1755o2;
import p104m.InterfaceC1775u1;
import p105m0.AbstractC1828m0;
import p114n0.InterfaceC1962n;
import p115n1.C1978h0;
import p115n1.InterfaceC1988o;
import p168t2.AbstractC2429w;
import p186v4.InterfaceC2545a;
import p210y3.C2804h;
import p210y3.InterfaceC2798b;
import p211y5.C2809a;
import p211y5.C2828o;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;
import p220z6.C2976d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.o */
/* loaded from: classes.dex */
public final class C0036o implements InterfaceC1216a, InterfaceC2545a, InterfaceC0902s, InterfaceC2798b, InterfaceC1962n, InterfaceC1177k, InterfaceC1504c, InterfaceC1775u1 {

    /* renamed from: l */
    public static C0036o f141l;

    /* renamed from: j */
    public final /* synthetic */ int f142j;

    /* renamed from: k */
    public Object f143k;

    public /* synthetic */ C0036o(int i, Object obj) {
        this.f142j = i;
        this.f143k = obj;
    }

    /* renamed from: m */
    public static C0036o m161m(Context context, int i) {
        AbstractC0714c.m1524j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0847a.f3754p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM4301f = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM4301f2 = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM4301f3 = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        C2809a c2809a = new C2809a(0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        C2828o c2828oM4951a = C2828o.m4953g(contextThemeWrapper.obtainStyledAttributes(AbstractC0847a.f3732A), c2809a).m4951a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0036o(colorStateListM4301f, colorStateListM4301f2, colorStateListM4301f3, dimensionPixelSize, c2828oM4951a, rect);
    }

    @Override // p114n0.InterfaceC1962n
    /* renamed from: a */
    public boolean mo162a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f143k;
        if (!swipeDismissBehavior.mo1775r(view)) {
            return false;
        }
        boolean z7 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f3086d;
        int width = (!(i == 0 && z7) && (i != 1 || z7)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    /* renamed from: b */
    public void m163b(int i, boolean z7) {
        C0088j0 c0088j0 = (C0088j0) this.f143k;
        if (z7) {
            c0088j0.m323a(i);
        } else {
            c0088j0.getClass();
        }
    }

    @Override // p066h4.InterfaceC1177k
    /* renamed from: c */
    public int mo164c() {
        return (mo168h() << 8) | mo168h();
    }

    @Override // p104m.InterfaceC1775u1
    /* renamed from: d */
    public void mo165d(MenuC1627m menuC1627m, MenuItem menuItem) {
        ((ViewOnKeyListenerC1621g) this.f143k).f6176p.removeCallbacksAndMessages(menuC1627m);
    }

    @Override // p066h4.InterfaceC1177k
    /* renamed from: e */
    public int mo166e(byte[] bArr, int i) throws C1176j {
        int i4 = 0;
        int i8 = 0;
        while (i4 < i && (i8 = ((InputStream) this.f143k).read(bArr, i4, i - i4)) != -1) {
            i4 += i8;
        }
        if (i4 == 0 && i8 == -1) {
            throw new C1176j();
        }
        return i4;
    }

    @Override // p186v4.InterfaceC2545a
    /* renamed from: f */
    public Object mo167f() {
        switch (this.f142j) {
            case 3:
                C0094o c0094o = (C0094o) this.f143k;
                return new RunnableC0091l((C0095p) c0094o.f441k, (C0073c) c0094o.f442l);
            default:
                C1755o2 c1755o2 = (C1755o2) this.f143k;
                return new C0100u((ExecutorServiceC0846e) c1755o2.f6694a, (ExecutorServiceC0846e) c1755o2.f6695b, (ExecutorServiceC0846e) c1755o2.f6696c, (ExecutorServiceC0846e) c1755o2.f6697d, (C0096q) c1755o2.f6698e, (C0096q) c1755o2.f6699f, (C0073c) c1755o2.f6700g);
        }
    }

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        switch (this.f142j) {
            case 16:
                return new C0883c(1, (C0880a0) this.f143k);
            default:
                return new C0940a((C0036o) this.f143k);
        }
    }

    @Override // p066h4.InterfaceC1177k
    /* renamed from: h */
    public short mo168h() throws IOException {
        int i = ((InputStream) this.f143k).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C1176j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public void m169i(int i, int i4, InterfaceC1988o interfaceC1988o) throws C0247v0 {
        int i8;
        int i9;
        int i10;
        long j;
        int i11;
        int i12;
        int i13;
        int i14;
        C0935d c0935d = (C0935d) this.f143k;
        C0936e c0936e = c0935d.f4091b;
        SparseArray sparseArray = c0935d.f4093c;
        C1132w c1132w = c0935d.f4103k;
        C1132w c1132w2 = c0935d.f4101i;
        int i15 = 1;
        int i16 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (c0935d.f4071I != 2) {
                    return;
                }
                C0934c c0934c = (C0934c) sparseArray.get(c0935d.f4077O);
                int i17 = c0935d.f4080R;
                C1132w c1132w3 = c0935d.f4108p;
                if (i17 != 4 || !"V_VP9".equals(c0934c.f4032b)) {
                    interfaceC1988o.mo3861h(i4);
                    return;
                } else {
                    c1132w3.m2510D(i4);
                    interfaceC1988o.readFully(c1132w3.f4799a, 0, i4);
                    return;
                }
            }
            if (i == 16877) {
                c0935d.m2102b(i);
                C0934c c0934c2 = c0935d.f4115w;
                int i18 = c0934c2.f4037g;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    interfaceC1988o.mo3861h(i4);
                    return;
                }
                byte[] bArr = new byte[i4];
                c0934c2.f4019O = bArr;
                interfaceC1988o.readFully(bArr, 0, i4);
                return;
            }
            if (i == 16981) {
                c0935d.m2102b(i);
                byte[] bArr2 = new byte[i4];
                c0935d.f4115w.f4039i = bArr2;
                interfaceC1988o.readFully(bArr2, 0, i4);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i4];
                interfaceC1988o.readFully(bArr3, 0, i4);
                c0935d.m2102b(i);
                c0935d.f4115w.f4040j = new C1978h0(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(c1132w.f4799a, (byte) 0);
                interfaceC1988o.readFully(c1132w.f4799a, 4 - i4, i4);
                c1132w.m2513G(0);
                c0935d.f4117y = (int) c1132w.m2537w();
                return;
            }
            if (i == 25506) {
                c0935d.m2102b(i);
                byte[] bArr4 = new byte[i4];
                c0935d.f4115w.f4041k = bArr4;
                interfaceC1988o.readFully(bArr4, 0, i4);
                return;
            }
            if (i != 30322) {
                throw C0247v0.createForMalformedContainer("Unexpected id: " + i, null);
            }
            c0935d.m2102b(i);
            byte[] bArr5 = new byte[i4];
            c0935d.f4115w.f4053w = bArr5;
            interfaceC1988o.readFully(bArr5, 0, i4);
            return;
        }
        if (c0935d.f4071I == 0) {
            c0935d.f4077O = (int) c0936e.m2110b(interfaceC1988o, false, true, 8);
            c0935d.f4078P = c0936e.f4122c;
            c0935d.f4073K = -9223372036854775807L;
            c0935d.f4071I = 1;
            c1132w2.m2510D(0);
        }
        C0934c c0934c3 = (C0934c) sparseArray.get(c0935d.f4077O);
        if (c0934c3 == null) {
            interfaceC1988o.mo3861h(i4 - c0935d.f4078P);
            c0935d.f4071I = 0;
            return;
        }
        c0934c3.f4029Y.getClass();
        if (c0935d.f4071I == 1) {
            c0935d.m2104e(interfaceC1988o, 3);
            int i19 = (c1132w2.f4799a[2] & 6) >> 1;
            int i20 = 255;
            if (i19 == 0) {
                c0935d.f4075M = 1;
                int[] iArr = c0935d.f4076N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c0935d.f4076N = iArr;
                iArr[0] = (i4 - c0935d.f4078P) - 3;
            } else {
                c0935d.m2104e(interfaceC1988o, 4);
                int i21 = (c1132w2.f4799a[3] & 255) + 1;
                c0935d.f4075M = i21;
                int[] iArr2 = c0935d.f4076N;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                c0935d.f4076N = iArr2;
                if (i19 == 2) {
                    int i22 = (i4 - c0935d.f4078P) - 4;
                    int i23 = c0935d.f4075M;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i19 != 1) {
                        if (i19 != 3) {
                            throw C0247v0.createForMalformedContainer("Unexpected lacing value: " + i19, null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = c0935d.f4075M - i15;
                            if (i24 >= i27) {
                                i8 = i15;
                                i9 = i16;
                                c0935d.f4076N[i27] = ((i4 - c0935d.f4078P) - i26) - i25;
                                break;
                            }
                            c0935d.f4076N[i24] = i16;
                            int i28 = i26 + 1;
                            c0935d.m2104e(interfaceC1988o, i28);
                            if (c1132w2.f4799a[i26] == 0) {
                                throw C0247v0.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i29 = i15;
                            int i30 = i16;
                            while (true) {
                                if (i30 >= 8) {
                                    i10 = i16;
                                    j = 0;
                                    i11 = i28;
                                    break;
                                }
                                int i31 = i29 << (7 - i30);
                                i10 = i16;
                                if ((c1132w2.f4799a[i26] & i31) != 0) {
                                    i11 = i28 + i30;
                                    c0935d.m2104e(interfaceC1988o, i11);
                                    j = c1132w2.f4799a[i26] & i20 & (~i31);
                                    while (i28 < i11) {
                                        j = (j << 8) | (c1132w2.f4799a[i28] & i20);
                                        i28++;
                                        i20 = 255;
                                    }
                                    if (i24 > 0) {
                                        j -= (1 << ((i30 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i30++;
                                    i16 = i10;
                                    i20 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i32 = (int) j;
                            int[] iArr3 = c0935d.f4076N;
                            if (i24 != 0) {
                                i32 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i32;
                            i25 += i32;
                            i24++;
                            i26 = i11;
                            i15 = i29;
                            i16 = i10;
                            i20 = 255;
                        }
                        throw C0247v0.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        i12 = c0935d.f4075M - 1;
                        if (i33 >= i12) {
                            break;
                        }
                        c0935d.f4076N[i33] = 0;
                        while (true) {
                            i13 = i35 + 1;
                            c0935d.m2104e(interfaceC1988o, i13);
                            int i36 = c1132w2.f4799a[i35] & 255;
                            int[] iArr4 = c0935d.f4076N;
                            i14 = iArr4[i33] + i36;
                            iArr4[i33] = i14;
                            if (i36 != 255) {
                                break;
                            } else {
                                i35 = i13;
                            }
                        }
                        i34 += i14;
                        i33++;
                        i35 = i13;
                    }
                    c0935d.f4076N[i12] = ((i4 - c0935d.f4078P) - i35) - i34;
                }
            }
            i8 = 1;
            i9 = 0;
            byte[] bArr6 = c1132w2.f4799a;
            c0935d.f4072J = c0935d.m2106g((bArr6[i8] & 255) | (bArr6[i9] << 8)) + c0935d.f4066D;
            c0935d.f4079Q = (c0934c3.f4034d == 2 || (i == 163 && (c1132w2.f4799a[2] & 128) == 128)) ? i8 : i9;
            c0935d.f4071I = 2;
            c0935d.f4074L = i9;
        } else {
            i8 = 1;
        }
        if (i == 163) {
            while (true) {
                int i37 = c0935d.f4074L;
                if (i37 >= c0935d.f4075M) {
                    c0935d.f4071I = 0;
                    return;
                } else {
                    c0935d.m2103c(c0934c3, ((c0935d.f4074L * c0934c3.f4035e) / 1000) + c0935d.f4072J, c0935d.f4079Q, c0935d.m2107h(interfaceC1988o, c0934c3, c0935d.f4076N[i37], false), 0);
                    c0935d.f4074L++;
                }
            }
        } else {
            while (true) {
                int i38 = c0935d.f4074L;
                if (i38 >= c0935d.f4075M) {
                    return;
                }
                int[] iArr5 = c0935d.f4076N;
                boolean z7 = i8;
                iArr5[i38] = c0935d.m2107h(interfaceC1988o, c0934c3, iArr5[i38], z7);
                c0935d.f4074L += z7 ? 1 : 0;
            }
        }
    }

    @Override // p210y3.InterfaceC2798b
    /* renamed from: k */
    public boolean mo54k(Object obj, File file, C2804h c2804h) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C0572f c0572f = (C0572f) this.f143k;
        byte[] bArr = (byte[]) c0572f.m1319c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c0572f.m1323g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c0572f.m1323g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c0572f.m1323g(bArr);
                return true;
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: l */
    public C1495h m170l() {
        C1490c c1490cM3172g;
        C1488a c1488a = (C1488a) this.f143k;
        C1493f c1493f = (C1493f) c1488a.f5724d;
        synchronized (c1493f) {
            c1488a.m3151b(true);
            c1490cM3172g = c1493f.m3172g(((C1489b) c1488a.f5722b).f5725a);
        }
        if (c1490cM3172g != null) {
            return new C1495h(c1490cM3172g);
        }
        return null;
    }

    @Override // p104m.InterfaceC1775u1
    /* renamed from: n */
    public void mo171n(MenuC1627m menuC1627m, C1630p c1630p) {
        ViewOnKeyListenerC1621g viewOnKeyListenerC1621g = (ViewOnKeyListenerC1621g) this.f143k;
        Handler handler = viewOnKeyListenerC1621g.f6176p;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1621g.f6178r;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1627m == ((C1619f) arrayList.get(i)).f6157b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i4 = i + 1;
        handler.postAtTime(new RunnableC1617e(this, i4 < arrayList.size() ? (C1619f) arrayList.get(i4) : null, c1630p, menuC1627m), menuC1627m, SystemClock.uptimeMillis() + 200);
    }

    /* renamed from: o */
    public AbstractC0157r0 m172o(Class cls) {
        String str;
        C2976d c2976dM5142a = AbstractC2987o.m5142a(cls);
        C0073c c0073c = (C0073c) this.f143k;
        HashMap map = C2976d.f11107c;
        Class cls2 = c2976dM5142a.f11109a;
        String canonicalName = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls2.getName());
                if (canonicalName == null) {
                    canonicalName = cls2.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return c0073c.m270B(c2976dM5142a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p070i0.InterfaceC1216a
    public void onCancel() {
        ((C0059z0) this.f143k).m243a();
    }

    /* renamed from: p */
    public void m173p(int i, long j) throws C0247v0 {
        C0935d c0935d = (C0935d) this.f143k;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C0247v0.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C0247v0.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                c0935d.m2102b(i);
                c0935d.f4115w.f4034d = (int) j;
                return;
            case 136:
                c0935d.m2102b(i);
                c0935d.f4115w.f4027W = j == 1;
                return;
            case 155:
                c0935d.f4073K = c0935d.m2106g(j);
                return;
            case 159:
                c0935d.m2102b(i);
                c0935d.f4115w.f4020P = (int) j;
                return;
            case 176:
                c0935d.m2102b(i);
                c0935d.f4115w.f4043m = (int) j;
                return;
            case 179:
                c0935d.m2101a(i);
                c0935d.f4067E.m317b(c0935d.m2106g(j));
                return;
            case 186:
                c0935d.m2102b(i);
                c0935d.f4115w.f4044n = (int) j;
                return;
            case 215:
                c0935d.m2102b(i);
                c0935d.f4115w.f4033c = (int) j;
                return;
            case 231:
                c0935d.f4066D = c0935d.m2106g(j);
                return;
            case 238:
                c0935d.f4080R = (int) j;
                return;
            case 241:
                if (c0935d.f4069G) {
                    return;
                }
                c0935d.m2101a(i);
                c0935d.f4068F.m317b(j);
                c0935d.f4069G = true;
                return;
            case 251:
                c0935d.f4081S = true;
                return;
            case 16871:
                c0935d.m2102b(i);
                c0935d.f4115w.f4037g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C0247v0.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C0247v0.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C0247v0.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C0247v0.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C0247v0.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                c0935d.f4118z = j + c0935d.f4111s;
                return;
            case 21432:
                int i4 = (int) j;
                c0935d.m2102b(i);
                if (i4 == 0) {
                    c0935d.f4115w.f4054x = 0;
                    return;
                }
                if (i4 == 1) {
                    c0935d.f4115w.f4054x = 2;
                    return;
                } else if (i4 == 3) {
                    c0935d.f4115w.f4054x = 1;
                    return;
                } else {
                    if (i4 != 15) {
                        return;
                    }
                    c0935d.f4115w.f4054x = 3;
                    return;
                }
            case 21680:
                c0935d.m2102b(i);
                c0935d.f4115w.f4046p = (int) j;
                return;
            case 21682:
                c0935d.m2102b(i);
                c0935d.f4115w.f4048r = (int) j;
                return;
            case 21690:
                c0935d.m2102b(i);
                c0935d.f4115w.f4047q = (int) j;
                return;
            case 21930:
                c0935d.m2102b(i);
                c0935d.f4115w.f4026V = j == 1;
                return;
            case 21938:
                c0935d.m2102b(i);
                C0934c c0934c = c0935d.f4115w;
                c0934c.f4055y = true;
                c0934c.f4045o = (int) j;
                return;
            case 21998:
                c0935d.m2102b(i);
                c0935d.f4115w.f4036f = (int) j;
                return;
            case 22186:
                c0935d.m2102b(i);
                c0935d.f4115w.f4023S = j;
                return;
            case 22203:
                c0935d.m2102b(i);
                c0935d.f4115w.f4024T = j;
                return;
            case 25188:
                c0935d.m2102b(i);
                c0935d.f4115w.f4021Q = (int) j;
                return;
            case 30114:
                c0935d.f4082T = j;
                return;
            case 30321:
                c0935d.m2102b(i);
                int i8 = (int) j;
                if (i8 == 0) {
                    c0935d.f4115w.f4049s = 0;
                    return;
                }
                if (i8 == 1) {
                    c0935d.f4115w.f4049s = 1;
                    return;
                } else if (i8 == 2) {
                    c0935d.f4115w.f4049s = 2;
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    c0935d.f4115w.f4049s = 3;
                    return;
                }
            case 2352003:
                c0935d.m2102b(i);
                c0935d.f4115w.f4035e = (int) j;
                return;
            case 2807729:
                c0935d.f4112t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c0935d.m2102b(i);
                        int i9 = (int) j;
                        if (i9 == 1) {
                            c0935d.f4115w.f4006B = 2;
                            return;
                        } else {
                            if (i9 != 2) {
                                return;
                            }
                            c0935d.f4115w.f4006B = 1;
                            return;
                        }
                    case 21946:
                        c0935d.m2102b(i);
                        int iM633g = C0216l.m633g((int) j);
                        if (iM633g != -1) {
                            c0935d.f4115w.f4005A = iM633g;
                            return;
                        }
                        return;
                    case 21947:
                        c0935d.m2102b(i);
                        c0935d.f4115w.f4055y = true;
                        int iM632f = C0216l.m632f((int) j);
                        if (iM632f != -1) {
                            c0935d.f4115w.f4056z = iM632f;
                            return;
                        }
                        return;
                    case 21948:
                        c0935d.m2102b(i);
                        c0935d.f4115w.f4007C = (int) j;
                        return;
                    case 21949:
                        c0935d.m2102b(i);
                        c0935d.f4115w.f4008D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: q */
    public void m174q() {
        ((C0058z) this.f143k).f280s.m119M();
    }

    @Override // p066h4.InterfaceC1177k
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f143k;
        if (j < 0) {
            return 0L;
        }
        long j8 = j;
        while (j8 > 0) {
            long jSkip = inputStream.skip(j8);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j8 -= jSkip;
        }
        return j - j8;
    }

    public /* synthetic */ C0036o(int i, boolean z7) {
        this.f142j = i;
    }

    public C0036o(C0074c0 c0074c0) {
        this.f142j = 13;
        this.f143k = Collections.unmodifiableMap(new HashMap(c0074c0.f327a));
    }

    public C0036o(Context context) {
        this.f142j = 11;
        this.f143k = new C0641e(context, 0);
    }

    public C0036o(C0201g c0201g) {
        this.f142j = 8;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = AbstractC1118i0.f4750a;
        if (i >= 29) {
            AbstractC0195e.m614d(usage);
        }
        if (i >= 32) {
            AbstractC0198f.m618a(usage);
        }
        this.f143k = usage.build();
    }

    public C0036o(int i) {
        this.f142j = i;
        switch (i) {
            case 10:
                this.f143k = new C0088j0(1);
                break;
            case 16:
                this.f143k = new C0880a0(7);
                break;
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                this.f143k = new C0898o(500L);
                break;
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                this.f143k = new C0036o(17);
                break;
            default:
                this.f143k = new Object();
                new Handler(Looper.getMainLooper(), new C0112d(0, this));
                break;
        }
    }

    public C0036o(C0161t0 c0161t0, InterfaceC0159s0 interfaceC0159s0) {
        this.f142j = 7;
        AbstractC2980h.m5136e("store", c0161t0);
        C0797a c0797a = C0797a.f3582k;
        AbstractC2980h.m5136e("defaultCreationExtras", c0797a);
        this.f143k = new C0073c(c0161t0, interfaceC0159s0, c0797a);
    }

    public C0036o(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C2828o c2828o, Rect rect) {
        this.f142j = 14;
        AbstractC0714c.m1526l(rect.left);
        AbstractC0714c.m1526l(rect.top);
        AbstractC0714c.m1526l(rect.right);
        AbstractC0714c.m1526l(rect.bottom);
        this.f143k = c2828o;
    }
}
