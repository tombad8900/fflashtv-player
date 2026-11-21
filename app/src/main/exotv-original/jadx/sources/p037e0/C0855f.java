package p037e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.AbstractC0120b;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.bumptech.glide.AbstractC0715d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p029d0.C0789e;
import p029d0.C0790f;
import p079j0.C1482j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.f */
/* loaded from: classes.dex */
public class C0855f extends AbstractC0715d {

    /* renamed from: n */
    public static Class f3778n;

    /* renamed from: o */
    public static Constructor f3779o;

    /* renamed from: p */
    public static Method f3780p;

    /* renamed from: q */
    public static Method f3781q;

    /* renamed from: r */
    public static boolean f3782r;

    /* renamed from: s0 */
    public static boolean m2029s0(Object obj, String str, int i, boolean z7) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m2030t0();
        try {
            return ((Boolean) f3780p.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: t0 */
    public static void m2030t0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3782r) {
            return;
        }
        f3782r = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f3779o = constructor;
        f3778n = cls;
        f3780p = method2;
        f3781q = method;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: r */
    public Typeface mo1604r(Context context, C0789e c0789e, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m2030t0();
        try {
            Object objNewInstance = f3779o.newInstance(null);
            for (C0790f c0790f : c0789e.f3551a) {
                File fileM426v = AbstractC0120b.m426v(context);
                if (fileM426v == null) {
                    return null;
                }
                try {
                    if (!AbstractC0120b.m419o(fileM426v, resources, c0790f.f3557f)) {
                        return null;
                    }
                    if (!m2029s0(objNewInstance, fileM426v.getPath(), c0790f.f3553b, c0790f.f3554c)) {
                        return null;
                    }
                    fileM426v.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM426v.delete();
                }
            }
            m2030t0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f3778n, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f3781q.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: s */
    public Typeface mo1605s(Context context, C1482j[] c1482jArr, int i) throws IOException {
        String str;
        if (c1482jArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo1609x(c1482jArr, i).f5709a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo1607u = mo1607u(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo1607u;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
