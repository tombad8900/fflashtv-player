package p210y3;

import android.text.TextUtils;
import p002a1.AbstractC0008a1;
import p189v7.C2556a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y3.g */
/* loaded from: classes.dex */
public final class C2803g {

    /* renamed from: e */
    public static final C2556a0 f10419e = new C2556a0(9);

    /* renamed from: a */
    public final Object f10420a;

    /* renamed from: b */
    public final InterfaceC2802f f10421b;

    /* renamed from: c */
    public final String f10422c;

    /* renamed from: d */
    public volatile byte[] f10423d;

    public C2803g(String str, Object obj, InterfaceC2802f interfaceC2802f) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f10422c = str;
        this.f10420a = obj;
        this.f10421b = interfaceC2802f;
    }

    /* renamed from: a */
    public static C2803g m4907a(String str, Object obj) {
        return new C2803g(str, obj, f10419e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2803g) {
            return this.f10422c.equals(((C2803g) obj).f10422c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10422c.hashCode();
    }

    public final String toString() {
        return AbstractC0008a1.m18n(new StringBuilder("Option{key='"), this.f10422c, "'}");
    }
}
