package p005a4;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.AbstractC0120b;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.AbstractC0155q0;
import androidx.lifecycle.AbstractC0157r0;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.InterfaceC0159s0;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0732i;
import com.exotv.net.R;
import com.google.android.material.datepicker.C0755m;
import java.io.FileInputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.C2181z;
import p002a1.C0016e;
import p002a1.C0022h;
import p002a1.C0036o;
import p002a1.RunnableC0018f;
import p006a5.C0108c;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;
import p017b6.AbstractC0622v;
import p024c5.C0690s;
import p029d0.AbstractC0795k;
import p030d1.C0798b;
import p034d5.AbstractC0847a;
import p037e0.AbstractC0852c;
import p038e1.C0861b;
import p056g1.C1028a;
import p056g1.C1029b;
import p062h.C1075d0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1132w;
import p065h3.C1163h;
import p066h4.C1168c;
import p066h4.C1189w;
import p071i1.C1240s;
import p073i3.C1261j;
import p079j0.C1473a;
import p090k2.C1584b;
import p090k2.C1600r;
import p090k2.InterfaceC1590h;
import p090k2.InterfaceC1597o;
import p096l0.C1644d;
import p096l0.InterfaceC1642b;
import p100l4.C1674b;
import p104m.C1753o0;
import p104m.C1770t;
import p109m4.C1899d;
import p109m4.InterfaceC1896a;
import p111m6.AbstractC1912g;
import p112m7.C1943s;
import p115n1.C1984k0;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;
import p118n4.C2018o;
import p121o0.InterfaceC2040f;
import p143q3.InterfaceC2264f;
import p144q4.C2270f;
import p151r3.C2291c;
import p151r3.C2294f;
import p151r3.C2299k;
import p151r3.C2302n;
import p151r3.C2303o;
import p151r3.EnumC2290b;
import p151r3.InterfaceC2298j;
import p159s2.C2343c;
import p160s3.C2351b;
import p160s3.C2357h;
import p160s3.EnumC2356g;
import p168t2.AbstractC2429w;
import p168t2.C2411g0;
import p168t2.InterfaceC2403c0;
import p169t3.C2433a;
import p171t5.AbstractC2436a;
import p174u.C2442d;
import p174u.C2443e;
import p178u4.AbstractC2466a;
import p178u4.AbstractC2470e;
import p178u4.C2475j;
import p182v.C2487b;
import p183v0.C2503c;
import p183v0.C2516p;
import p183v0.C2519s;
import p183v0.C2522v;
import p183v0.C2523w;
import p183v0.InterfaceC2507g;
import p183v0.InterfaceC2515o;
import p185v3.AbstractC2531a;
import p185v3.AbstractC2534d;
import p185v3.AbstractC2536f;
import p185v3.C2540j;
import p185v3.C2541k;
import p185v3.ComponentCallbacks2C2542l;
import p185v3.InterfaceC2539i;
import p186v4.InterfaceC2545a;
import p186v4.InterfaceC2546b;
import p191w0.C2597a;
import p199x.C2719f;
import p210y3.C2804h;
import p210y3.InterfaceC2800d;
import p210y3.InterfaceC2801e;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;
import p220z6.AbstractC2989q;
import p220z6.C2976d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.c */
/* loaded from: classes.dex */
public final class C0073c implements InterfaceC2298j, InterfaceC1989p, InterfaceC1896a, InterfaceC2040f, InterfaceC2264f, InterfaceC1590h, InterfaceC2403c0, InterfaceC1642b {

    /* renamed from: n */
    public static C0073c f322n;

    /* renamed from: j */
    public final /* synthetic */ int f323j;

    /* renamed from: k */
    public Object f324k;

    /* renamed from: l */
    public Object f325l;

    /* renamed from: m */
    public Object f326m;

    public /* synthetic */ C0073c(int i) {
        this.f323j = i;
    }

    /* renamed from: D */
    public static boolean m262D(C2299k c2299k, Bitmap.Config config) {
        if (!AbstractC0622v.m1396h(config)) {
            return true;
        }
        if (!c2299k.f8038l) {
            return false;
        }
        C2433a c2433a = c2299k.f8029c;
        if (!(c2433a instanceof C2433a)) {
            return true;
        }
        ImageView imageView = c2433a.f8786k;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    /* renamed from: F */
    public static C0073c m263F(int i, int i4, Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0073c(context, context.obtainStyledAttributes(attributeSet, iArr, i, i4));
    }

    /* renamed from: K */
    private final void m264K() {
    }

    /* renamed from: L */
    private final void m265L() {
    }

    /* renamed from: p */
    public static final void m266p(C0073c c0073c, Network network, boolean z7) {
        boolean z8;
        Network[] allNetworks = ((ConnectivityManager) c0073c.f324k).getAllNetworks();
        int length = allNetworks.length;
        boolean z9 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (AbstractC2980h.m5132a(network2, network)) {
                z8 = z7;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) c0073c.f324k).getNetworkCapabilities(network2);
                z8 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z8) {
                z9 = true;
                break;
            }
            i++;
        }
        ComponentCallbacks2C2542l componentCallbacks2C2542l = (ComponentCallbacks2C2542l) c0073c.f325l;
        synchronized (componentCallbacks2C2542l) {
            try {
                if (((C1163h) componentCallbacks2C2542l.f9233j.get()) != null) {
                    componentCallbacks2C2542l.f9237n = z9;
                } else {
                    componentCallbacks2C2542l.m4560b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public static boolean m267u(Editable editable, KeyEvent keyEvent, boolean z7) {
        C2523w[] c2523wArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c2523wArr = (C2523w[]) editable.getSpans(selectionStart, selectionEnd, C2523w.class)) != null && c2523wArr.length > 0) {
                for (C2523w c2523w : c2523wArr) {
                    int spanStart = editable.getSpanStart(c2523w);
                    int spanEnd = editable.getSpanEnd(c2523w);
                    if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public static C2294f m268v(C2299k c2299k, Throwable th) {
        if (th instanceof C2302n) {
            c2299k.getClass();
            C2291c c2291c = c2299k.f8026A;
            c2291c.getClass();
            C2291c c2291c2 = AbstractC2534d.f9214a;
            c2291c.getClass();
        } else {
            c2299k.f8026A.getClass();
            C2291c c2291c3 = AbstractC2534d.f9214a;
        }
        return new C2294f(null, c2299k, th);
    }

    /* renamed from: A */
    public ImageHeaderParser$ImageType m269A() throws Throwable {
        switch (this.f323j) {
            case 11:
                return AbstractC2436a.m4336k((List) this.f325l, AbstractC2466a.m4441c((ByteBuffer) this.f324k));
            case 12:
                List list = (List) this.f326m;
                C1189w c1189w = (C1189w) ((C0732i) this.f324k).f2858k;
                c1189w.reset();
                return AbstractC2436a.m4335j(list, c1189w, (C0572f) this.f325l);
            default:
                List list2 = (List) this.f325l;
                C0732i c0732i = (C0732i) this.f326m;
                C0572f c0572f = (C0572f) this.f324k;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC2800d interfaceC2800d = (InterfaceC2800d) list2.get(i);
                    C1189w c1189w2 = null;
                    try {
                        C1189w c1189w3 = new C1189w(new FileInputStream(c0732i.m1656e().getFileDescriptor()), c0572f);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2596c = interfaceC2800d.mo2596c(c1189w3);
                            c1189w3.m2611c();
                            c0732i.m1656e();
                            if (imageHeaderParser$ImageTypeMo2596c != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo2596c;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1189w2 = c1189w3;
                            if (c1189w2 != null) {
                                c1189w2.m2611c();
                            }
                            c0732i.m1656e();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* renamed from: B */
    public AbstractC0157r0 m270B(C2976d c2976d, String str) {
        boolean zIsInstance;
        AbstractC0157r0 abstractC0157r0Mo177a;
        InterfaceC0159s0 interfaceC0159s0 = (InterfaceC0159s0) this.f325l;
        AbstractC2980h.m5136e("key", str);
        C0161t0 c0161t0 = (C0161t0) this.f324k;
        c0161t0.getClass();
        LinkedHashMap linkedHashMap = c0161t0.f946a;
        AbstractC0157r0 abstractC0157r0 = (AbstractC0157r0) linkedHashMap.get(str);
        Class clsM4304i = c2976d.f11109a;
        Map map = C2976d.f11106b;
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
        Integer num = (Integer) map.get(clsM4304i);
        if (num != null) {
            zIsInstance = AbstractC2989q.m5146c(num.intValue(), abstractC0157r0);
        } else {
            if (clsM4304i.isPrimitive()) {
                clsM4304i = AbstractC2429w.m4304i(AbstractC2987o.m5142a(clsM4304i));
            }
            zIsInstance = clsM4304i.isInstance(abstractC0157r0);
        }
        if (zIsInstance) {
            if (interfaceC0159s0 instanceof AbstractC0155q0) {
                AbstractC2980h.m5133b(abstractC0157r0);
            }
            AbstractC2980h.m5134c("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel", abstractC0157r0);
            return abstractC0157r0;
        }
        C0798b c0798b = new C0798b((AbstractC0150o) this.f326m);
        ((LinkedHashMap) c0798b.f933j).put(C0861b.f3798a, str);
        try {
            try {
                interfaceC0159s0.getClass();
                abstractC0157r0Mo177a = interfaceC0159s0.mo562b(AbstractC2429w.m4303h(c2976d), c0798b);
            } catch (AbstractMethodError unused) {
                abstractC0157r0Mo177a = interfaceC0159s0.mo177a(AbstractC2429w.m4303h(c2976d));
            }
        } catch (AbstractMethodError unused2) {
            abstractC0157r0Mo177a = interfaceC0159s0.mo562b(AbstractC2429w.m4303h(c2976d), c0798b);
        }
        AbstractC2980h.m5136e("viewModel", abstractC0157r0Mo177a);
        AbstractC0157r0 abstractC0157r02 = (AbstractC0157r0) linkedHashMap.put(str, abstractC0157r0Mo177a);
        if (abstractC0157r02 != null) {
            abstractC0157r02.m580a();
        }
        return abstractC0157r0Mo177a;
    }

    /* renamed from: C */
    public boolean m271C(CharSequence charSequence, int i, int i4, C2522v c2522v) {
        if ((c2522v.f9179c & 3) == 0) {
            InterfaceC2507g interfaceC2507g = (InterfaceC2507g) this.f326m;
            C2597a c2597aM4540b = c2522v.m4540b();
            int iM3506a = c2597aM4540b.m3506a(8);
            if (iM3506a != 0) {
                ((ByteBuffer) c2597aM4540b.f6855m).getShort(iM3506a + c2597aM4540b.f6852j);
            }
            C2503c c2503c = (C2503c) interfaceC2507g;
            c2503c.getClass();
            ThreadLocal threadLocal = C2503c.f9132b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i4) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c2503c.f9133a;
            String string = sb.toString();
            int i8 = AbstractC0852c.f3773a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i9 = c2522v.f9179c & 4;
            c2522v.f9179c = zHasGlyph ? i9 | 2 : i9 | 1;
        }
        return (c2522v.f9179c & 3) == 2;
    }

    /* renamed from: E */
    public boolean m272E(int i, C2442d c2442d, C2719f c2719f) {
        C2487b c2487b = (C2487b) this.f325l;
        int[] iArr = c2442d.f8877p0;
        int[] iArr2 = c2442d.f8881t;
        c2487b.f9076a = iArr[0];
        c2487b.f9077b = iArr[1];
        c2487b.f9078c = c2442d.m4396q();
        c2487b.f9079d = c2442d.m4392k();
        c2487b.f9084i = false;
        c2487b.f9085j = i;
        boolean z7 = c2487b.f9076a == 3;
        boolean z8 = c2487b.f9077b == 3;
        boolean z9 = z7 && c2442d.f8842W > 0.0f;
        boolean z10 = z8 && c2442d.f8842W > 0.0f;
        if (z9 && iArr2[0] == 4) {
            c2487b.f9076a = 1;
        }
        if (z10 && iArr2[1] == 4) {
            c2487b.f9077b = 1;
        }
        c2719f.m4786b(c2442d, c2487b);
        c2442d.m4381O(c2487b.f9080e);
        c2442d.m4378L(c2487b.f9081f);
        c2442d.f8824E = c2487b.f9083h;
        c2442d.m4375I(c2487b.f9082g);
        c2487b.f9085j = 0;
        return c2487b.f9084i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2303o m273G(C2299k c2299k, C2357h c2357h) {
        List list = c2299k.f8033g;
        Bitmap.Config config = c2299k.f8031e;
        if (list.isEmpty() || AbstractC1912g.m3725i0(AbstractC2536f.f9216a, config)) {
            if (AbstractC0622v.m1396h(config)) {
                if (m262D(c2299k, config)) {
                    if (!((InterfaceC2539i) this.f326m).mo3867a(c2357h)) {
                    }
                }
                config = Bitmap.Config.ARGB_8888;
            }
        }
        AbstractC0715d abstractC0715d = c2357h.f8270a;
        C2351b c2351b = C2351b.f8261n;
        return new C2303o(c2299k.f8027a, config, null, c2357h, (abstractC0715d.equals(c2351b) || c2357h.f8271b.equals(c2351b)) ? EnumC2356g.f8267k : c2299k.f8050x, AbstractC2534d.m4553a(c2299k), c2299k.f8039m && c2299k.f8033g.isEmpty() && config != Bitmap.Config.ALPHA_8, c2299k.f8040n, null, c2299k.f8035i, c2299k.f8036j, c2299k.f8051y, c2299k.f8041o, c2299k.f8042p, c2299k.f8043q);
    }

    /* renamed from: H */
    public Object m274H(CharSequence charSequence, int i, int i4, int i8, boolean z7, InterfaceC2515o interfaceC2515o) {
        int i9;
        char c8;
        C2516p c2516p = new C2516p((C2519s) ((C0022h) this.f325l).f80l);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i10 = 0;
        boolean zMo3799g = true;
        int iCharCount = i;
        loop0: while (true) {
            i9 = iCharCount;
            while (iCharCount < i4 && i10 < i8 && zMo3799g) {
                SparseArray sparseArray = c2516p.f9157c.f9170a;
                C2519s c2519s = sparseArray == null ? null : (C2519s) sparseArray.get(iCodePointAt);
                if (c2516p.f9155a == 2) {
                    if (c2519s != null) {
                        c2516p.f9157c = c2519s;
                        c2516p.f9160f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c2516p.m4529a();
                        } else if (iCodePointAt != 65039) {
                            C2519s c2519s2 = c2516p.f9157c;
                            if (c2519s2.f9171b != null) {
                                if (c2516p.f9160f != 1) {
                                    c2516p.f9158d = c2519s2;
                                    c2516p.m4529a();
                                } else if (c2516p.m4530b()) {
                                    c2516p.f9158d = c2516p.f9157c;
                                    c2516p.m4529a();
                                } else {
                                    c2516p.m4529a();
                                }
                                c8 = 3;
                            } else {
                                c2516p.m4529a();
                            }
                        }
                        c8 = 1;
                    }
                    c8 = 2;
                } else if (c2519s == null) {
                    c2516p.m4529a();
                    c8 = 1;
                } else {
                    c2516p.f9155a = 2;
                    c2516p.f9157c = c2519s;
                    c2516p.f9160f = 1;
                    c8 = 2;
                }
                c2516p.f9159e = iCodePointAt;
                if (c8 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i9)) + i9;
                    if (iCharCount < i4) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c8 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i4) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c8 == 3) {
                    if (z7 || !m271C(charSequence, i9, iCharCount, c2516p.f9158d.f9171b)) {
                        zMo3799g = interfaceC2515o.mo3799g(charSequence, i9, iCharCount, c2516p.f9158d.f9171b);
                        i10++;
                    }
                }
            }
            break loop0;
        }
        if (c2516p.f9155a == 2 && c2516p.f9157c.f9171b != null && ((c2516p.f9160f > 1 || c2516p.m4530b()) && i10 < i8 && zMo3799g && (z7 || !m271C(charSequence, i9, iCharCount, c2516p.f9157c.f9171b)))) {
            interfaceC2515o.mo3799g(charSequence, i9, iCharCount, c2516p.f9157c.f9171b);
        }
        return interfaceC2515o.mo3798e();
    }

    /* renamed from: I */
    public void m275I() {
        ((TypedArray) this.f325l).recycle();
    }

    /* renamed from: J */
    public void m276J(C2443e c2443e, int i, int i4, int i8) {
        c2443e.getClass();
        int i9 = c2443e.f8849b0;
        int i10 = c2443e.f8851c0;
        c2443e.f8849b0 = 0;
        c2443e.f8851c0 = 0;
        c2443e.m4381O(i4);
        c2443e.m4378L(i8);
        if (i9 < 0) {
            c2443e.f8849b0 = 0;
        } else {
            c2443e.f8849b0 = i9;
        }
        if (i10 < 0) {
            c2443e.f8851c0 = 0;
        } else {
            c2443e.f8851c0 = i10;
        }
        C2443e c2443e2 = (C2443e) this.f326m;
        c2443e2.f8903t0 = i;
        c2443e2.m4410U();
    }

    /* renamed from: M */
    public void m277M(C2443e c2443e) {
        ArrayList arrayList = (ArrayList) this.f324k;
        arrayList.clear();
        int size = c2443e.f8900q0.size();
        for (int i = 0; i < size; i++) {
            C2442d c2442d = (C2442d) c2443e.f8900q0.get(i);
            int[] iArr = c2442d.f8877p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c2442d);
            }
        }
        c2443e.f8902s0.f9089b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2303o m278N(C2303o c2303o) {
        boolean z7;
        boolean z8;
        Bitmap.Config config = c2303o.f8056b;
        EnumC2290b enumC2290b = c2303o.f8069o;
        boolean z9 = true;
        if (!AbstractC0622v.m1396h(config) || ((InterfaceC2539i) this.f326m).mo3868b()) {
            z7 = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z7 = true;
        }
        Bitmap.Config config2 = config;
        if (c2303o.f8069o.f7992j) {
            ComponentCallbacks2C2542l componentCallbacks2C2542l = (ComponentCallbacks2C2542l) this.f325l;
            synchronized (componentCallbacks2C2542l) {
                componentCallbacks2C2542l.m4559a();
                z8 = componentCallbacks2C2542l.f9237n;
            }
            if (z8) {
                z9 = z7;
            } else {
                enumC2290b = EnumC2290b.f7990m;
            }
        }
        return z9 ? new C2303o(c2303o.f8055a, config2, c2303o.f8057c, c2303o.f8058d, c2303o.f8059e, c2303o.f8060f, c2303o.f8061g, c2303o.f8062h, c2303o.f8063i, c2303o.f8064j, c2303o.f8065k, c2303o.f8066l, c2303o.f8067m, c2303o.f8068n, enumC2290b) : c2303o;
    }

    @Override // p168t2.InterfaceC2403c0
    /* renamed from: a */
    public void mo279a(C1132w c1132w) {
        long jM2399d;
        long j;
        AbstractC1101a.m2360k((C1108d0) this.f325l);
        int i = AbstractC1118i0.f4750a;
        C1108d0 c1108d0 = (C1108d0) this.f325l;
        synchronized (c1108d0) {
            try {
                long j8 = c1108d0.f4729c;
                jM2399d = j8 != -9223372036854775807L ? j8 + c1108d0.f4728b : c1108d0.m2399d();
            } finally {
            }
        }
        C1108d0 c1108d02 = (C1108d0) this.f325l;
        synchronized (c1108d02) {
            j = c1108d02.f4728b;
        }
        if (jM2399d == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        C0249w c0249w = (C0249w) this.f324k;
        if (j != c0249w.f1527s) {
            C0246v c0246vM692a = c0249w.m692a();
            c0246vM692a.f1452r = j;
            C0249w c0249w2 = new C0249w(c0246vM692a);
            this.f324k = c0249w2;
            ((InterfaceC1980i0) this.f326m).format(c0249w2);
        }
        int iM2515a = c1132w.m2515a();
        ((InterfaceC1980i0) this.f326m).sampleData(c1132w, iM2515a);
        ((InterfaceC1980i0) this.f326m).sampleMetadata(jM2399d, 1, iM2515a, 0, null);
    }

    @Override // p096l0.InterfaceC1642b
    public Object acquire() {
        Object objAcquire = ((C1644d) this.f326m).acquire();
        if (objAcquire == null) {
            objAcquire = ((InterfaceC2545a) this.f324k).mo167f();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof InterfaceC2546b) {
            ((InterfaceC2546b) objAcquire).mo304a().f9241a = false;
        }
        return objAcquire;
    }

    @Override // p168t2.InterfaceC2403c0
    /* renamed from: b */
    public void mo280b(C1108d0 c1108d0, InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        this.f325l = c1108d0;
        c2411g0.m4255a();
        c2411g0.m4256b();
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 5);
        this.f326m = interfaceC1980i0Track;
        interfaceC1980i0Track.format((C0249w) this.f324k);
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: c */
    public int mo281c(long j) {
        long[] jArr = (long[]) this.f326m;
        int iM2436a = AbstractC1118i0.m2436a(jArr, j, false);
        if (iM2436a < jArr.length) {
            return iM2436a;
        }
        return -1;
    }

    @Override // p109m4.InterfaceC1896a
    /* renamed from: d */
    public InterfaceC0080f0 mo282d(InterfaceC0080f0 interfaceC0080f0, C2804h c2804h) {
        Drawable drawable = (Drawable) interfaceC0080f0.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0087j) this.f325l).mo282d(C1168c.m2585e(((BitmapDrawable) drawable).getBitmap(), (InterfaceC0567a) this.f324k), c2804h);
        }
        if (drawable instanceof C1674b) {
            return ((C1899d) this.f326m).mo282d(interfaceC0080f0, c2804h);
        }
        return null;
    }

    @Override // p151r3.InterfaceC2298j
    /* renamed from: e */
    public void mo283e() {
        C0108c c0108c = ((C0690s) this.f324k).f2698u;
        ((ImageView) c0108c.f555f).setVisibility(8);
        ((TextView) c0108c.f552c).setVisibility(0);
        ((TextView) c0108c.f552c).setText((String) this.f325l);
    }

    @Override // p115n1.InterfaceC1989p
    public void endTracks() {
        ((InterfaceC1989p) this.f324k).endTracks();
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: f */
    public long mo284f(int i) {
        long[] jArr = (long[]) this.f326m;
        AbstractC1101a.m2353d(i >= 0);
        AbstractC1101a.m2353d(i < jArr.length);
        return jArr[i];
    }

    @Override // p096l0.InterfaceC1642b
    /* renamed from: g */
    public boolean mo285g(Object obj) {
        if (obj instanceof InterfaceC2546b) {
            ((InterfaceC2546b) obj).mo304a().f9241a = true;
        }
        switch (((C1584b) this.f325l).f6052j) {
            case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C1644d) this.f326m).mo285g(obj);
    }

    @Override // p121o0.InterfaceC2040f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f325l;
    }

    @Override // p143q3.InterfaceC2264f
    /* renamed from: h */
    public boolean mo286h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f324k;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: i */
    public Uri mo287i() {
        return (Uri) this.f324k;
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: j */
    public void mo288j() {
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: k */
    public Uri mo289k() {
        return (Uri) this.f326m;
    }

    @Override // p151r3.InterfaceC2298j
    /* renamed from: l */
    public void mo290l() {
        ((ImageView) ((C0690s) this.f326m).f2698u.f555f).setVisibility(0);
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: m */
    public List mo291m(long j) {
        List list = (List) this.f324k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f325l;
            int i4 = i * 2;
            if (jArr[i4] <= j && j < jArr[i4 + 1]) {
                C2343c c2343c = (C2343c) list.get(i);
                C1029b c1029b = c2343c.f8232a;
                if (c1029b.f4374e == -3.4028235E38f) {
                    arrayList2.add(c2343c);
                } else {
                    arrayList.add(c1029b);
                }
            }
        }
        Collections.sort(arrayList2, new C1473a(3));
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            C1028a c1028aM2226a = ((C2343c) arrayList2.get(i8)).f8232a.m2226a();
            c1028aM2226a.f4338e = (-1) - i8;
            c1028aM2226a.f4339f = 1;
            arrayList.add(c1028aM2226a.m2225a());
        }
        return arrayList;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: n */
    public int mo292n() {
        return ((long[]) this.f326m).length;
    }

    @Override // p121o0.InterfaceC2040f
    /* renamed from: o */
    public Object mo293o() {
        return null;
    }

    /* renamed from: q */
    public synchronized void m294q(InterfaceC2801e interfaceC2801e, C0104y c0104y) {
        C0071b c0071b = (C0071b) ((HashMap) this.f324k).put(interfaceC2801e, new C0071b(interfaceC2801e, c0104y, (ReferenceQueue) this.f325l));
        if (c0071b != null) {
            c0071b.f321c = null;
            c0071b.clear();
        }
    }

    /* renamed from: r */
    public void m295r(C0071b c0071b) {
        InterfaceC0080f0 interfaceC0080f0;
        synchronized (this) {
            ((HashMap) this.f324k).remove(c0071b.f319a);
            if (c0071b.f320b && (interfaceC0080f0 = c0071b.f321c) != null) {
                ((C0096q) this.f326m).m359e(c0071b.f319a, new C0104y(interfaceC0080f0, true, false, c0071b.f319a, (C0096q) this.f326m));
            }
        }
    }

    /* renamed from: s */
    public void m296s(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        InterfaceC1980i0[] interfaceC1980i0Arr = (InterfaceC1980i0[]) this.f325l;
        for (int i = 0; i < interfaceC1980i0Arr.length; i++) {
            c2411g0.m4255a();
            c2411g0.m4256b();
            InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 3);
            C0249w c0249w = (C0249w) ((List) this.f324k).get(i);
            String str = c0249w.f1522n;
            AbstractC1101a.m2352c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c0249w.f1509a;
            if (str2 == null) {
                c2411g0.m4256b();
                str2 = c2411g0.f8573e;
            }
            C0246v c0246v = new C0246v();
            c0246v.f1435a = str2;
            c0246v.f1447m = AbstractC0244u0.m687p(str);
            c0246v.f1439e = c0249w.f1513e;
            c0246v.f1438d = c0249w.f1512d;
            c0246v.f1430G = c0249w.f1503H;
            c0246v.f1450p = c0249w.f1525q;
            interfaceC1980i0Track.format(new C0249w(c0246v));
            interfaceC1980i0Arr[i] = interfaceC1980i0Track;
        }
    }

    @Override // p115n1.InterfaceC1989p
    public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
        ((InterfaceC1989p) this.f324k).seekMap(interfaceC1968c0);
    }

    @Override // p143q3.InterfaceC2264f
    public void shutdown() {
        ((ConnectivityManager) this.f324k).unregisterNetworkCallback((C2018o) this.f326m);
    }

    /* renamed from: t */
    public Bitmap m297t(BitmapFactory.Options options) {
        switch (this.f323j) {
            case 11:
                return BitmapFactory.decodeStream(new C1261j(AbstractC2466a.m4441c((ByteBuffer) this.f324k)), null, options);
            case 12:
                C1189w c1189w = (C1189w) ((C0732i) this.f324k).f2858k;
                c1189w.reset();
                return BitmapFactory.decodeStream(c1189w, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((C0732i) this.f326m).m1656e().getFileDescriptor(), null, options);
        }
    }

    public String toString() {
        switch (this.f323j) {
            case 8:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f324k);
                sb.append('{');
                C0016e c0016e = (C0016e) ((C0016e) this.f325l).f63l;
                String str = C2181z.FRAGMENT_ENCODE_SET;
                while (c0016e != null) {
                    Object obj = c0016e.f62k;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c0016e = (C0016e) c0016e.f63l;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p115n1.InterfaceC1989p
    public InterfaceC1980i0 track(int i, int i4) {
        SparseArray sparseArray = (SparseArray) this.f326m;
        InterfaceC1989p interfaceC1989p = (InterfaceC1989p) this.f324k;
        if (i4 != 3) {
            return interfaceC1989p.track(i, i4);
        }
        C1600r c1600r = (C1600r) sparseArray.get(i);
        if (c1600r != null) {
            return c1600r;
        }
        C1600r c1600r2 = new C1600r(interfaceC1989p.track(i, i4), (InterfaceC1597o) this.f325l);
        sparseArray.put(i, c1600r2);
        return c1600r2;
    }

    /* renamed from: w */
    public ColorStateList m298w(int i) {
        int resourceId;
        ColorStateList colorStateListM424t;
        TypedArray typedArray = (TypedArray) this.f325l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM424t = AbstractC0120b.m424t((Context) this.f324k, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM424t;
    }

    /* renamed from: x */
    public Drawable m299x(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f325l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0715d.m1542D((Context) this.f324k, resourceId);
    }

    /* renamed from: y */
    public Drawable m300y(int i) {
        int resourceId;
        Drawable drawableM3480c;
        if (!((TypedArray) this.f325l).hasValue(i) || (resourceId = ((TypedArray) this.f325l).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1770t c1770tM3453a = C1770t.m3453a();
        Context context = (Context) this.f324k;
        synchronized (c1770tM3453a) {
            drawableM3480c = c1770tM3453a.f6749a.m3480c(resourceId, context, true);
        }
        return drawableM3480c;
    }

    /* renamed from: z */
    public Typeface m301z(int i, int i4, C1753o0 c1753o0) {
        int resourceId = ((TypedArray) this.f325l).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f326m) == null) {
            this.f326m = new TypedValue();
        }
        Context context = (Context) this.f324k;
        TypedValue typedValue = (TypedValue) this.f326m;
        ThreadLocal threadLocal = AbstractC0795k.f3568a;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0795k.m1947a(context, resourceId, typedValue, i4, c1753o0, true, false);
    }

    public /* synthetic */ C0073c(Object obj, Object obj2, Object obj3, int i) {
        this.f323j = i;
        this.f324k = obj;
        this.f325l = obj2;
        this.f326m = obj3;
    }

    public C0073c(C1163h c1163h, ComponentCallbacks2C2542l componentCallbacks2C2542l) {
        Object c1984k0;
        this.f323j = 20;
        this.f324k = c1163h;
        this.f325l = componentCallbacks2C2542l;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z7 = AbstractC2531a.f9208a;
        } else {
            if (!AbstractC2531a.f9208a) {
                if (i != 26 && i != 27) {
                    c1984k0 = new C1984k0(true);
                } else {
                    c1984k0 = new C2541k();
                }
            }
            this.f326m = c1984k0;
        }
        c1984k0 = new C1984k0(false);
        this.f326m = c1984k0;
    }

    public C0073c() {
        this.f323j = 0;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0069a(0));
        this.f324k = new HashMap();
        this.f325l = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC0018f(4, this));
    }

    public C0073c(C0161t0 c0161t0, InterfaceC0159s0 interfaceC0159s0, AbstractC0150o abstractC0150o) {
        this.f323j = 7;
        AbstractC2980h.m5136e("store", c0161t0);
        AbstractC2980h.m5136e("extras", abstractC0150o);
        this.f324k = c0161t0;
        this.f325l = interfaceC0159s0;
        this.f326m = abstractC0150o;
    }

    public C0073c(ArrayList arrayList) {
        this.f323j = 23;
        this.f324k = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f325l = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C2343c c2343c = (C2343c) arrayList.get(i);
            int i4 = i * 2;
            long[] jArr = (long[]) this.f325l;
            jArr[i4] = c2343c.f8233b;
            jArr[i4 + 1] = c2343c.f8234c;
        }
        long[] jArr2 = (long[]) this.f325l;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f326m = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C0073c(List list) {
        this.f323j = 25;
        this.f324k = list;
        this.f325l = new InterfaceC1980i0[list.size()];
        this.f326m = new C1240s(new C0456a(14, this));
    }

    public C0073c(InterfaceC1989p interfaceC1989p, InterfaceC1597o interfaceC1597o) {
        this.f323j = 14;
        this.f324k = interfaceC1989p;
        this.f325l = interfaceC1597o;
        this.f326m = new SparseArray();
    }

    public C0073c(Context context, TypedArray typedArray) {
        this.f323j = 15;
        this.f324k = context;
        this.f325l = typedArray;
    }

    public C0073c(Runnable runnable) {
        this.f323j = 16;
        this.f326m = new CopyOnWriteArrayList();
        this.f324k = new HashMap();
        this.f325l = runnable;
    }

    public C0073c(Context context, LocationManager locationManager) {
        this.f323j = 9;
        this.f326m = new C1075d0();
        this.f324k = context;
        this.f325l = locationManager;
    }

    public C0073c(ConnectivityManager connectivityManager, ComponentCallbacks2C2542l componentCallbacks2C2542l) {
        this.f323j = 19;
        this.f324k = connectivityManager;
        this.f325l = componentCallbacks2C2542l;
        C2018o c2018o = new C2018o(1, this);
        this.f326m = c2018o;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c2018o);
    }

    public C0073c(Context context, int i) throws Resources.NotFoundException {
        this.f323j = i;
        switch (i) {
            case 10:
                this.f324k = context.getApplicationContext();
                this.f325l = AbstractC2534d.f9214a;
                this.f326m = new C2540j();
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2436a.m4344s(context, R.attr.materialCalendarStyle, C0755m.class.getCanonicalName()).data, AbstractC0847a.f3753o);
                this.f324k = C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
                C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
                C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
                C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
                ColorStateList colorStateListM4301f = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 7);
                this.f325l = C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
                C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
                this.f326m = C0036o.m161m(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(colorStateListM4301f.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
        }
    }

    public C0073c(C2443e c2443e) {
        this.f323j = 26;
        this.f324k = new ArrayList();
        this.f325l = new C2487b();
        this.f326m = c2443e;
    }

    public C0073c(C0022h c0022h, C1584b c1584b, C2503c c2503c, Set set) {
        this.f323j = 27;
        this.f324k = c1584b;
        this.f325l = c0022h;
        this.f326m = c2503c;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m274H(str, 0, str.length(), 1, true, new C1943s(str, 2));
        }
    }

    public C0073c(String str, int i) {
        this.f323j = i;
        switch (i) {
            case 24:
                C0246v c0246v = new C0246v();
                c0246v.f1447m = AbstractC0244u0.m687p(str);
                this.f324k = new C0249w(c0246v);
                break;
            default:
                C0016e c0016e = new C0016e(12, false);
                this.f325l = c0016e;
                this.f326m = c0016e;
                this.f324k = str;
                break;
        }
    }

    public C0073c(C1644d c1644d, InterfaceC2545a interfaceC2545a, C1584b c1584b) {
        this.f323j = 28;
        this.f326m = c1644d;
        this.f324k = interfaceC2545a;
        this.f325l = c1584b;
    }

    public C0073c(C2475j c2475j, ArrayList arrayList, C0572f c0572f) {
        this.f323j = 12;
        AbstractC2470e.m4446c("Argument must not be null", c0572f);
        this.f325l = c0572f;
        AbstractC2470e.m4446c("Argument must not be null", arrayList);
        this.f326m = arrayList;
        this.f324k = new C0732i(c2475j, c0572f);
    }

    public C0073c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C0572f c0572f) {
        this.f323j = 13;
        AbstractC2470e.m4446c("Argument must not be null", c0572f);
        this.f324k = c0572f;
        AbstractC2470e.m4446c("Argument must not be null", arrayList);
        this.f325l = arrayList;
        this.f326m = new C0732i(parcelFileDescriptor);
    }

    public C0073c(C0096q c0096q, C2270f c2270f, C0100u c0100u) {
        this.f323j = 3;
        this.f326m = c0096q;
        this.f325l = c2270f;
        this.f324k = c0100u;
    }
}
