package p049f3;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0937a {

    /* renamed from: a */
    public final C2186e f4123a;

    /* renamed from: b */
    public final C2186e f4124b;

    /* renamed from: c */
    public final C2186e f4125c;

    public AbstractC0937a(C2186e c2186e, C2186e c2186e2, C2186e c2186e3) {
        this.f4123a = c2186e;
        this.f4124b = c2186e2;
        this.f4125c = c2186e3;
    }

    /* renamed from: a */
    public abstract C0938b mo2111a();

    /* renamed from: b */
    public final Class m2112b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2186e c2186e = this.f4125c;
        Class cls2 = (Class) c2186e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2186e.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m2113c(String str) throws NoSuchMethodException, SecurityException {
        C2186e c2186e = this.f4123a;
        Method method = (Method) c2186e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0937a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0937a.class);
        c2186e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method m2114d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C2186e c2186e = this.f4124b;
        Method method = (Method) c2186e.get(name);
        if (method != null) {
            return method;
        }
        Class clsM2112b = m2112b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2112b.getDeclaredMethod("write", cls, AbstractC0937a.class);
        c2186e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo2115e(int i);

    /* renamed from: f */
    public final int m2116f(int i, int i4) {
        return !mo2115e(i4) ? i : ((C0938b) this).f4127e.readInt();
    }

    /* renamed from: g */
    public final Parcelable m2117g(Parcelable parcelable, int i) {
        if (!mo2115e(i)) {
            return parcelable;
        }
        return ((C0938b) this).f4127e.readParcelable(C0938b.class.getClassLoader());
    }

    /* renamed from: h */
    public final InterfaceC0939c m2118h() {
        String string = ((C0938b) this).f4127e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0939c) m2113c(string).invoke(null, mo2111a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    /* renamed from: i */
    public abstract void mo2119i(int i);

    /* renamed from: j */
    public final void m2120j(int i, int i4) {
        mo2119i(i4);
        ((C0938b) this).f4127e.writeInt(i);
    }

    /* renamed from: k */
    public final void m2121k(Parcelable parcelable, int i) {
        mo2119i(i);
        ((C0938b) this).f4127e.writeParcelable(parcelable, 0);
    }

    /* renamed from: l */
    public final void m2122l(InterfaceC0939c interfaceC0939c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC0939c == null) {
            ((C0938b) this).f4127e.writeString(null);
            return;
        }
        try {
            ((C0938b) this).f4127e.writeString(m2112b(interfaceC0939c.getClass()).getName());
            C0938b c0938bMo2111a = mo2111a();
            try {
                m2114d(interfaceC0939c.getClass()).invoke(null, interfaceC0939c, c0938bMo2111a);
                Parcel parcel = c0938bMo2111a.f4127e;
                int i = c0938bMo2111a.f4131i;
                if (i >= 0) {
                    int i4 = c0938bMo2111a.f4126d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(iDataPosition - i4);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (!(e10.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
                }
                throw ((RuntimeException) e10.getCause());
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(interfaceC0939c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
