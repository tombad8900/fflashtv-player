package p037e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import com.bumptech.glide.AbstractC0715d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p029d0.C0789e;
import p029d0.C0790f;
import p079j0.C1482j;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.g */
/* loaded from: classes.dex */
public final class C0856g extends AbstractC0715d {

    /* renamed from: n */
    public static final Class f3783n;

    /* renamed from: o */
    public static final Constructor f3784o;

    /* renamed from: p */
    public static final Method f3785p;

    /* renamed from: q */
    public static final Method f3786q;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f3784o = constructor;
        f3783n = cls;
        f3785p = method2;
        f3786q = method;
    }

    /* renamed from: s0 */
    public static boolean m2031s0(Object obj, ByteBuffer byteBuffer, int i, int i4, boolean z7) {
        try {
            return ((Boolean) f3785p.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i4), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t0 */
    public static Typeface m2032t0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f3783n, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f3786q.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: r */
    public final Typeface mo1604r(Context context, C0789e c0789e, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f3784o.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C0790f c0790f : c0789e.f3551a) {
                int i4 = c0790f.f3557f;
                File fileM426v = AbstractC0120b.m426v(context);
                if (fileM426v != null) {
                    try {
                        if (AbstractC0120b.m419o(fileM426v, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(fileM426v);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && m2031s0(objNewInstance, map, c0790f.f3556e, c0790f.f3553b, c0790f.f3554c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileM426v.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return m2032t0(objNewInstance);
        }
        return null;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: s */
    public final Typeface mo1605s(Context context, C1482j[] c1482jArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f3784o.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i4 = 0;
            C2192k c2192k = new C2192k(0);
            int length = c1482jArr.length;
            while (true) {
                if (i4 < length) {
                    C1482j c1482j = c1482jArr[i4];
                    Uri uri = c1482j.f5709a;
                    ByteBuffer byteBufferM394B = (ByteBuffer) c2192k.get(uri);
                    if (byteBufferM394B == null) {
                        byteBufferM394B = AbstractC0120b.m394B(context, uri);
                        c2192k.put(uri, byteBufferM394B);
                    }
                    if (byteBufferM394B == null || !m2031s0(objNewInstance, byteBufferM394B, c1482j.f5710b, c1482j.f5711c, c1482j.f5712d)) {
                        break;
                    }
                    i4++;
                } else {
                    Typeface typefaceM2032t0 = m2032t0(objNewInstance);
                    if (typefaceM2032t0 != null) {
                        return Typeface.create(typefaceM2032t0, i);
                    }
                }
            }
        }
        return null;
    }
}
