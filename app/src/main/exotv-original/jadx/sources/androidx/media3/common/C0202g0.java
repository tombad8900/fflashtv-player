package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0995q0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.g0 */
/* loaded from: classes.dex */
public final class C0202g0 {

    /* renamed from: i */
    public static final String f1100i;

    /* renamed from: j */
    public static final String f1101j;

    /* renamed from: k */
    public static final String f1102k;

    /* renamed from: l */
    public static final String f1103l;

    /* renamed from: m */
    public static final String f1104m;

    /* renamed from: n */
    public static final String f1105n;

    /* renamed from: o */
    public static final String f1106o;

    /* renamed from: p */
    public static final String f1107p;

    /* renamed from: a */
    public final UUID f1108a;

    /* renamed from: b */
    public final Uri f1109b;

    /* renamed from: c */
    public final AbstractC0995q0 f1110c;

    /* renamed from: d */
    public final boolean f1111d;

    /* renamed from: e */
    public final boolean f1112e;

    /* renamed from: f */
    public final boolean f1113f;

    /* renamed from: g */
    public final AbstractC0983m0 f1114g;

    /* renamed from: h */
    public final byte[] f1115h;

    static {
        int i = AbstractC1118i0.f4750a;
        f1100i = Integer.toString(0, 36);
        f1101j = Integer.toString(1, 36);
        f1102k = Integer.toString(2, 36);
        f1103l = Integer.toString(3, 36);
        f1104m = Integer.toString(4, 36);
        f1105n = Integer.toString(5, 36);
        f1106o = Integer.toString(6, 36);
        f1107p = Integer.toString(7, 36);
    }

    public C0202g0(C0199f0 c0199f0) {
        AbstractC1101a.m2359j((c0199f0.f1095f && c0199f0.f1091b == null) ? false : true);
        UUID uuid = c0199f0.f1090a;
        uuid.getClass();
        this.f1108a = uuid;
        this.f1109b = c0199f0.f1091b;
        this.f1110c = c0199f0.f1092c;
        this.f1111d = c0199f0.f1093d;
        this.f1113f = c0199f0.f1095f;
        this.f1112e = c0199f0.f1094e;
        this.f1114g = c0199f0.f1096g;
        byte[] bArr = c0199f0.f1097h;
        this.f1115h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    /* renamed from: a */
    public final C0199f0 m620a() {
        C0199f0 c0199f0 = new C0199f0();
        c0199f0.f1090a = this.f1108a;
        c0199f0.f1091b = this.f1109b;
        c0199f0.f1092c = this.f1110c;
        c0199f0.f1093d = this.f1111d;
        c0199f0.f1094e = this.f1112e;
        c0199f0.f1095f = this.f1113f;
        c0199f0.f1096g = this.f1114g;
        c0199f0.f1097h = this.f1115h;
        return c0199f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0202g0)) {
            return false;
        }
        C0202g0 c0202g0 = (C0202g0) obj;
        if (this.f1108a.equals(c0202g0.f1108a)) {
            Uri uri = c0202g0.f1109b;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f1109b, uri) && Objects.equals(this.f1110c, c0202g0.f1110c) && this.f1111d == c0202g0.f1111d && this.f1113f == c0202g0.f1113f && this.f1112e == c0202g0.f1112e && this.f1114g.equals(c0202g0.f1114g) && Arrays.equals(this.f1115h, c0202g0.f1115h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f1108a.hashCode() * 31;
        Uri uri = this.f1109b;
        return Arrays.hashCode(this.f1115h) + ((this.f1114g.hashCode() + ((((((((this.f1110c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f1111d ? 1 : 0)) * 31) + (this.f1113f ? 1 : 0)) * 31) + (this.f1112e ? 1 : 0)) * 31)) * 31);
    }
}
