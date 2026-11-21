package p037e0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p029d0.C0789e;
import p029d0.C0790f;
import p079j0.C1482j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.h */
/* loaded from: classes.dex */
public class C0857h extends C0855f {

    /* renamed from: s */
    public final Class f3787s;

    /* renamed from: t */
    public final Constructor f3788t;

    /* renamed from: u */
    public final Method f3789u;

    /* renamed from: v */
    public final Method f3790v;

    /* renamed from: w */
    public final Method f3791w;

    /* renamed from: x */
    public final Method f3792x;

    /* renamed from: y */
    public final Method f3793y;

    public C0857h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodMo2037y0;
        Constructor<?> constructor;
        Method methodM2033x0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM2033x0 = m2033x0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo2037y0 = mo2037y0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo2037y0 = null;
            constructor = null;
            methodM2033x0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f3787s = cls;
        this.f3788t = constructor;
        this.f3789u = methodM2033x0;
        this.f3790v = method;
        this.f3791w = method2;
        this.f3792x = method3;
        this.f3793y = methodMo2037y0;
    }

    /* renamed from: x0 */
    public static Method m2033x0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // p037e0.C0855f, com.bumptech.glide.AbstractC0715d
    /* renamed from: r */
    public final Typeface mo1604r(Context context, C0789e c0789e, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f3789u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1604r(context, c0789e, resources, i);
        }
        try {
            objNewInstance = this.f3788t.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C0790f[] c0790fArr = c0789e.f3551a;
            int length = c0790fArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    C0790f c0790f = c0790fArr[i4];
                    Context context2 = context;
                    if (m2034u0(context2, objNewInstance, c0790f.f3552a, c0790f.f3556e, c0790f.f3553b, c0790f.f3554c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0790f.f3555d))) {
                        i4++;
                        context = context2;
                    } else {
                        try {
                            this.f3792x.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (m2036w0(objNewInstance)) {
                    return mo2035v0(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // p037e0.C0855f, com.bumptech.glide.AbstractC0715d
    /* renamed from: s */
    public final Typeface mo1605s(Context context, C1482j[] c1482jArr, int i) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceMo2035v0;
        boolean zBooleanValue;
        if (c1482jArr.length >= 1) {
            Method method = this.f3789u;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C1482j c1482j : c1482jArr) {
                        if (c1482j.f5713e == 0) {
                            Uri uri = c1482j.f5709a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC0120b.m394B(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f3788t.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c1482jArr.length;
                        int i4 = 0;
                        boolean z7 = false;
                        while (true) {
                            Method method2 = this.f3792x;
                            if (i4 < length) {
                                C1482j c1482j2 = c1482jArr[i4];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c1482j2.f5709a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f3790v.invoke(objNewInstance, byteBuffer, Integer.valueOf(c1482j2.f5710b), null, Integer.valueOf(c1482j2.f5711c), Integer.valueOf(c1482j2.f5712d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z7 = true;
                                }
                                i4++;
                                z7 = z7;
                            } else if (!z7) {
                                method2.invoke(objNewInstance, null);
                            } else if (m2036w0(objNewInstance) && (typefaceMo2035v0 = mo2035v0(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo2035v0, i);
                            }
                        }
                    }
                } else {
                    C1482j c1482jMo1609x = mo1609x(c1482jArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c1482jMo1609x.f5709a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c1482jMo1609x.f5711c).setItalic(c1482jMo1609x.f5712d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public final boolean m2034u0(Context context, Object obj, String str, int i, int i4, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3789u.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: v */
    public final Typeface mo1608v(Context context, Resources resources, int i, String str, int i4) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f3789u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1608v(context, resources, i, str, i4);
        }
        try {
            objNewInstance = this.f3788t.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m2034u0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f3792x.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m2036w0(objNewInstance)) {
                return mo2035v0(objNewInstance);
            }
        }
        return null;
    }

    /* renamed from: v0 */
    public Typeface mo2035v0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f3787s, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f3793y.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: w0 */
    public final boolean m2036w0(Object obj) {
        try {
            return ((Boolean) this.f3791w.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: y0 */
    public Method mo2037y0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
