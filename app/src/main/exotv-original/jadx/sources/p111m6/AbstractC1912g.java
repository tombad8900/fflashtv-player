package p111m6;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import p220z6.AbstractC2980h;

/* renamed from: m6.g */
/* loaded from: classes.dex */
public abstract class AbstractC1912g extends AbstractC0714c {
    /* renamed from: h0 */
    public static List m3724h0(Object[] objArr) {
        AbstractC2980h.m5136e("<this>", objArr);
        List listAsList = Arrays.asList(objArr);
        AbstractC2980h.m5135d("asList(...)", listAsList);
        return listAsList;
    }

    /* renamed from: i0 */
    public static boolean m3725i0(Object[] objArr, Object obj) {
        int i;
        AbstractC2980h.m5136e("<this>", objArr);
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (obj.equals(objArr[i4])) {
                    i = i4;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    /* renamed from: j0 */
    public static void m3726j0(int i, int i4, int i8, byte[] bArr, byte[] bArr2) {
        AbstractC2980h.m5136e("<this>", bArr);
        AbstractC2980h.m5136e("destination", bArr2);
        System.arraycopy(bArr, i4, bArr2, i, i8 - i4);
    }

    /* renamed from: k0 */
    public static void m3727k0(int i, int i4, int i8, int[] iArr, int[] iArr2) {
        AbstractC2980h.m5136e("<this>", iArr);
        AbstractC2980h.m5136e("destination", iArr2);
        System.arraycopy(iArr, i4, iArr2, i, i8 - i4);
    }

    /* renamed from: l0 */
    public static void m3728l0(int i, int i4, int i8, Object[] objArr, Object[] objArr2) {
        AbstractC2980h.m5136e("<this>", objArr);
        AbstractC2980h.m5136e("destination", objArr2);
        System.arraycopy(objArr, i4, objArr2, i, i8 - i4);
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m3729m0(int i, int i4, int i8, Object[] objArr, Object[] objArr2) {
        if ((i8 & 4) != 0) {
            i = 0;
        }
        m3728l0(0, i, i4, objArr, objArr2);
    }

    /* renamed from: n0 */
    public static byte[] m3730n0(byte[] bArr, int i, int i4) {
        AbstractC2980h.m5136e("<this>", bArr);
        AbstractC0714c.m1537w(i4, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i4);
        AbstractC2980h.m5135d("copyOfRange(...)", bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    /* renamed from: o0 */
    public static Object[] m3731o0(Object[] objArr, int i, int i4) {
        AbstractC2980h.m5136e("<this>", objArr);
        AbstractC0714c.m1537w(i4, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i4);
        AbstractC2980h.m5135d("copyOfRange(...)", objArrCopyOfRange);
        return objArrCopyOfRange;
    }

    /* renamed from: p0 */
    public static void m3732p0(Object[] objArr, int i, int i4) {
        AbstractC2980h.m5136e("<this>", objArr);
        Arrays.fill(objArr, i, i4, (Object) null);
    }

    /* renamed from: q0 */
    public static ArrayList m3733q0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public static char m3734r0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: s0 */
    public static List m3735s0(Object[] objArr) {
        AbstractC2980h.m5136e("<this>", objArr);
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C1910e(objArr)) : AbstractC0715d.m1551T(objArr[0]) : C1921p.f7187j;
    }
}
