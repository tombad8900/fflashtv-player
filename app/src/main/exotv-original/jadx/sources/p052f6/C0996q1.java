package p052f6;

import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.q1 */
/* loaded from: classes.dex */
public final class C0996q1 extends AbstractC0995q0 {

    /* renamed from: p */
    public static final C0996q1 f4246p = new C0996q1(null, new Object[0], 0);

    /* renamed from: m */
    public final transient Object f4247m;

    /* renamed from: n */
    public final transient Object[] f4248n;

    /* renamed from: o */
    public final transient int f4249o;

    public C0996q1(Object obj, Object[] objArr, int i) {
        this.f4247m = obj;
        this.f4248n = objArr;
        this.f4249o = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // p052f6.AbstractC0995q0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f4248n;
            if (this.f4249o == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f4247m;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iM2202q = AbstractC1006u.m2202q(obj.hashCode());
                        while (true) {
                            int i = iM2202q & length;
                            int i4 = bArr[i] & 255;
                            if (i4 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                                break;
                            }
                            iM2202q = i + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iM2202q2 = AbstractC1006u.m2202q(obj.hashCode());
                        while (true) {
                            int i8 = iM2202q2 & length2;
                            int i9 = sArr[i8] & 65535;
                            if (i9 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            iM2202q2 = i8 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iM2202q3 = AbstractC1006u.m2202q(obj.hashCode());
                        while (true) {
                            int i10 = iM2202q3 & length3;
                            int i11 = iArr[i10];
                            if (i11 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            iM2202q3 = i10 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f4249o;
    }
}
