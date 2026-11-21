package android.support.v4.media.session;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.p027ui.AdActivity;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import org.json.JSONObject;
import p002a1.AbstractC0008a1;
import p002a1.C0048u;
import p011b0.C0544j;
import p016b5.C0585h;
import p016b5.C0586i;
import p017b6.AbstractC0622v;
import p026c7.AbstractC0711e;
import p026c7.C0710d;
import p029d0.AbstractC0787c;
import p029d0.AbstractC0795k;
import p029d0.C0792h;
import p029d0.C0793i;
import p043e6.C0922j;
import p043e6.C0923k;
import p043e6.InterfaceC0921i;
import p044e7.C0926c;
import p046f0.AbstractC0928a;
import p063h1.InterfaceC1111f;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1339x;
import p076i7.C1319o;
import p088k0.C1548c;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1590h;
import p102l6.C1692i;
import p102l6.C1694k;
import p102l6.EnumC1686c;
import p102l6.InterfaceC1685b;
import p104m.C1780w0;
import p104m.ViewOnLongClickListenerC1751n2;
import p105m0.AbstractC1849t0;
import p111m6.C1922q;
import p112m7.C1941q;
import p140q0.ActionModeCallbackC2248h;
import p146q6.EnumC2273a;
import p148r.AbstractC2285g;
import p148r.C2281c;
import p148r.C2284f;
import p160s3.EnumC2356g;
import p163s6.C2377b;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2989q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public abstract class AbstractC0120b {
    /* renamed from: A */
    public static InterfaceC0921i m393A(InterfaceC0921i interfaceC0921i) {
        return ((interfaceC0921i instanceof C0923k) || (interfaceC0921i instanceof C0922j)) ? interfaceC0921i : interfaceC0921i instanceof Serializable ? new C0922j(interfaceC0921i) : new C0923k(interfaceC0921i);
    }

    /* renamed from: B */
    public static MappedByteBuffer m394B(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: C */
    public static void m395C(InterfaceC1590h interfaceC1590h, int i, InterfaceC1111f interfaceC1111f) {
        long jMo284f = interfaceC1590h.mo284f(i);
        List listMo291m = interfaceC1590h.mo291m(jMo284f);
        if (listMo291m.isEmpty()) {
            return;
        }
        if (i == interfaceC1590h.mo292n() - 1) {
            throw new IllegalStateException();
        }
        long jMo284f2 = interfaceC1590h.mo284f(i + 1) - interfaceC1590h.mo284f(i);
        if (jMo284f2 > 0) {
            interfaceC1111f.accept(new C1585c(listMo291m, jMo284f, jMo284f2));
        }
    }

    /* renamed from: G */
    public static void m396G(Window window, boolean z7) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC1849t0.m3631c(window, z7);
        } else {
            if (i >= 30) {
                AbstractC1849t0.m3630b(window, z7);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: H */
    public static void m397H(TextView textView, int i) {
        AbstractC0714c.m1526l(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0928a.m2095j(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: I */
    public static void m398I(TextView textView, int i) {
        AbstractC0714c.m1526l(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i4);
        }
    }

    /* renamed from: J */
    public static void m399J(TextView textView, int i) {
        AbstractC0714c.m1526l(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: K */
    public static void m400K(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0622v.m1406r(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1751n2 viewOnLongClickListenerC1751n2 = ViewOnLongClickListenerC1751n2.f6673t;
        if (viewOnLongClickListenerC1751n2 != null && viewOnLongClickListenerC1751n2.f6675j == view) {
            ViewOnLongClickListenerC1751n2.m3427b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1751n2(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1751n2 viewOnLongClickListenerC1751n22 = ViewOnLongClickListenerC1751n2.f6674u;
        if (viewOnLongClickListenerC1751n22 != null && viewOnLongClickListenerC1751n22.f6675j == view) {
            viewOnLongClickListenerC1751n22.m3428a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m401L(Activity activity, Intent intent) {
        String str;
        int iM1535u;
        AbstractC2980h.m5136e("activity", activity);
        C0586i c0586i = C0585h.f2325a;
        if (c0586i == null || (str = c0586i.f2331f) == null || AbstractC1206h.m2630D0(str)) {
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Double d8 = c0586i != null ? c0586i.f2332g : null;
        if (d8 == null) {
            iM1535u = 720;
        } else {
            Double d9 = d8.doubleValue() > 0.0d ? d8 : null;
            if (d9 != null) {
                double dDoubleValue = d9.doubleValue() * 60.0d;
                if (Double.isNaN(dDoubleValue)) {
                    throw new IllegalArgumentException("Cannot round NaN value.");
                }
                iM1535u = (int) AbstractC0714c.m1535u(Math.round(dDoubleValue), 5L, 2147483647L);
            }
        }
        long j = iM1535u * 60000;
        if (str != null) {
            long j8 = activity.getSharedPreferences("exotv_ads", 0).getLong("interstitial_last_shown_at", 0L);
            if (j8 <= 0 || jCurrentTimeMillis - j8 >= j) {
                Intent intentPutExtra = new Intent(activity, (Class<?>) AdActivity.class).putExtra("ad_url", str).putExtra("ad_next", intent);
                C0710d c0710d = AbstractC0711e.f2769j;
                activity.startActivity(intentPutExtra.putExtra("ad_duration_ms", AbstractC0711e.f2770k.mo1480c()));
                return;
            }
        }
        activity.startActivity(intent);
    }

    /* renamed from: M */
    public static final Object m402M(C1941q c1941q, C1941q c1941q2, InterfaceC2855p interfaceC2855p) throws Throwable {
        Object c1319o;
        Object objM2751H;
        try {
            AbstractC2989q.m5145b(interfaceC2855p);
            c1319o = interfaceC2855p.mo576c(c1941q2, c1941q);
        } catch (Throwable th) {
            c1319o = new C1319o(th, false);
        }
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        if (c1319o == enumC2273a || (objM2751H = c1941q.m2751H(c1319o)) == AbstractC1339x.f5379e) {
            return enumC2273a;
        }
        if (objM2751H instanceof C1319o) {
            throw ((C1319o) objM2751H).f5358a;
        }
        return AbstractC1339x.m2855p(objM2751H);
    }

    /* renamed from: N */
    public static int m403N(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m404O(InterfaceC1590h interfaceC1590h, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        int iMo281c;
        boolean z7;
        long j = c1598p.f6079a;
        if (j == -9223372036854775807L) {
            iMo281c = 0;
        } else {
            iMo281c = interfaceC1590h.mo281c(j);
            if (iMo281c == -1) {
                iMo281c = interfaceC1590h.mo292n();
            }
            if (iMo281c > 0 && interfaceC1590h.mo284f(iMo281c - 1) == j) {
                iMo281c--;
            }
        }
        if (j == -9223372036854775807L || iMo281c >= interfaceC1590h.mo292n()) {
            z7 = false;
        } else {
            List listMo291m = interfaceC1590h.mo291m(j);
            long jMo284f = interfaceC1590h.mo284f(iMo281c);
            if (!listMo291m.isEmpty()) {
                long j8 = c1598p.f6079a;
                if (j8 < jMo284f) {
                    interfaceC1111f.accept(new C1585c(listMo291m, j8, jMo284f - j8));
                    z7 = true;
                }
            }
        }
        for (int i = iMo281c; i < interfaceC1590h.mo292n(); i++) {
            m395C(interfaceC1590h, i, interfaceC1111f);
        }
        if (c1598p.f6080b) {
            if (z7) {
                iMo281c--;
            }
            for (int i4 = 0; i4 < iMo281c; i4++) {
                m395C(interfaceC1590h, i4, interfaceC1111f);
            }
            if (z7) {
                interfaceC1111f.accept(new C1585c(interfaceC1590h.mo291m(j), interfaceC1590h.mo284f(iMo281c), j - interfaceC1590h.mo284f(iMo281c)));
            }
        }
    }

    /* renamed from: P */
    public static Bundle m405P(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(AbstractC0120b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: Q */
    public static ActionMode.Callback m406Q(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC2248h) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC2248h) callback).f7799a;
    }

    /* renamed from: R */
    public static ActionMode.Callback m407R(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC2248h) || callback == null) ? callback : new ActionModeCallbackC2248h(callback, textView);
    }

    /* renamed from: a */
    public static final String m408a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        AbstractC2980h.m5133b(strOptString);
        if (AbstractC1206h.m2630D0(strOptString)) {
            return null;
        }
        return strOptString;
    }

    /* renamed from: b */
    public static final Map m409b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C1922q.f7188j;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC2980h.m5135d("keys(...)", itKeys);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.optString(next));
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static void m410c(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i4) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i4, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i4 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i4, 33);
    }

    /* renamed from: g */
    public static void m411g(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C0926c(2, 36, 1));
        }
    }

    /* renamed from: h */
    public static void m412h(int i, int i4, int i8) {
        if (i < 0 || i4 > i8) {
            StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM19o.append(i8);
            throw new IndexOutOfBoundsException(sbM19o.toString());
        }
        if (i > i4) {
            throw new IllegalArgumentException(AbstractC0008a1.m11g(i, i4, "fromIndex: ", " > toIndex: "));
        }
    }

    /* renamed from: i */
    public static int m413i(Context context) {
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : new C0544j(context).f2220a.areNotificationsEnabled() ? 0 : -1;
    }

    /* renamed from: j */
    public static int m414j(int i, int i4) {
        long j = i + i4;
        int i8 = (int) j;
        if (j == ((long) i8)) {
            return i8;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i4 + ")");
    }

    /* renamed from: k */
    public static int m415k(int i, int i4, int i8) {
        return i < i4 ? i4 : i > i8 ? i8 : i;
    }

    /* renamed from: l */
    public static void m416l(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: m */
    public static int m417m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: n */
    public static final double m418n(int i, int i4, int i8, int i9, EnumC2356g enumC2356g) {
        double d8 = i8 / i;
        double d9 = i9 / i4;
        int iOrdinal = enumC2356g.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d8, d9);
        }
        if (iOrdinal == 1) {
            return Math.min(d8, d9);
        }
        throw new C0048u();
    }

    /* renamed from: o */
    public static boolean m419o(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM420p = m420p(file, inputStreamOpenRawResource);
                m416l(inputStreamOpenRawResource);
                return zM420p;
            } catch (Throwable th) {
                th = th;
                m416l(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* renamed from: p */
    public static boolean m420p(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    m416l(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m416l(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m416l(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: q */
    public static final C2377b m421q(Enum[] enumArr) {
        AbstractC2980h.m5136e("entries", enumArr);
        return new C2377b(enumArr);
    }

    /* renamed from: r */
    public static boolean m422r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: s */
    public static final boolean m423s(char c8, char c9, boolean z7) {
        if (c8 == c9) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c9);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f3565c == r8.hashCode()) goto L21;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m424t(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListM1944a;
        ColorStateList colorStateList;
        C0792h c0792h;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0793i c0793i = new C0793i(resources, theme);
        synchronized (AbstractC0795k.f3570c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0795k.f3569b.get(c0793i);
                colorStateListM1944a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c0792h = (C0792h) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c0792h.f3564b.equals(resources.getConfiguration())) {
                        if (theme != null || c0792h.f3565c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = c0792h.f3563a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC0795k.f3568a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i4 = typedValue.type;
        if (i4 < 28 || i4 > 31) {
            try {
                colorStateListM1944a = AbstractC0787c.m1944a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM1944a == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (AbstractC0795k.f3570c) {
            try {
                WeakHashMap weakHashMap = AbstractC0795k.f3569b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c0793i);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c0793i, sparseArray2);
                }
                sparseArray2.append(i, new C0792h(colorStateListM1944a, c0793i.f3566a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListM1944a;
    }

    /* renamed from: u */
    public static Object m425u(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(AbstractC0715d.m1550S("Future was expected to be done: %s", future));
        }
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: v */
    public static File m426v(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static C1548c m427w(C1780w0 c1780w0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C1548c(AbstractC0928a.m2094i(c1780w0));
        }
        TextPaint textPaint = new TextPaint(c1780w0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1780w0.getBreakStrategy();
        int hyphenationFrequency = c1780w0.getHyphenationFrequency();
        if (c1780w0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c1780w0.getInputType() & 15) != 3) {
                boolean z7 = c1780w0.getLayoutDirection() == 1;
                switch (c1780w0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z7) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0928a.m2087b(DecimalFormatSymbols.getInstance(c1780w0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C1548c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* renamed from: x */
    public static int m428x(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: y */
    public static final boolean m429y(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
    }

    /* renamed from: z */
    public static InterfaceC1685b m430z(InterfaceC2840a interfaceC2840a) {
        EnumC1686c[] enumC1686cArr = EnumC1686c.f6485j;
        C1694k c1694k = new C1694k();
        c1694k.f6498j = interfaceC2840a;
        c1694k.f6499k = C1692i.f6496a;
        return c1694k;
    }

    /* renamed from: D */
    public abstract Object mo98D(Intent intent, int i);

    /* renamed from: E */
    public abstract void mo431E(C2284f c2284f, C2284f c2284f2);

    /* renamed from: F */
    public abstract void mo432F(C2284f c2284f, Thread thread);

    /* renamed from: d */
    public abstract boolean mo433d(AbstractC2285g abstractC2285g, C2281c c2281c, C2281c c2281c2);

    /* renamed from: e */
    public abstract boolean mo434e(AbstractC2285g abstractC2285g, Object obj, Object obj2);

    /* renamed from: f */
    public abstract boolean mo435f(AbstractC2285g abstractC2285g, C2284f c2284f, C2284f c2284f2);
}
