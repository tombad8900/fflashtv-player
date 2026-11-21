package p005a4;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p063h1.C1132w;
import p066h4.C1192z;
import p109m4.InterfaceC1896a;
import p111m6.AbstractC1913h;
import p114n0.InterfaceC1962n;
import p115n1.InterfaceC1988o;
import p134p3.C2207a;
import p134p3.C2212f;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.j */
/* loaded from: classes.dex */
public final class C0087j implements InterfaceC1962n, InterfaceC1896a {

    /* renamed from: j */
    public int f385j;

    /* renamed from: k */
    public Object f386k;

    public /* synthetic */ C0087j(int i, Object obj) {
        this.f386k = obj;
        this.f385j = i;
    }

    @Override // p114n0.InterfaceC1962n
    /* renamed from: a */
    public boolean mo162a(View view) {
        ((BottomSheetBehavior) this.f386k).m1782E(this.f385j);
        return true;
    }

    /* renamed from: b */
    public void m317b(long j) {
        int i = this.f385j;
        long[] jArr = (long[]) this.f386k;
        if (i == jArr.length) {
            this.f386k = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f386k;
        int i4 = this.f385j;
        this.f385j = i4 + 1;
        jArr2[i4] = j;
    }

    /* renamed from: c */
    public void m318c(long[] jArr) {
        int length = this.f385j + jArr.length;
        long[] jArr2 = (long[]) this.f386k;
        if (length > jArr2.length) {
            this.f386k = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f386k, this.f385j, jArr.length);
        this.f385j = length;
    }

    @Override // p109m4.InterfaceC1896a
    /* renamed from: d */
    public InterfaceC0080f0 mo282d(InterfaceC0080f0 interfaceC0080f0, C2804h c2804h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC0080f0.get()).compress((Bitmap.CompressFormat) this.f386k, this.f385j, byteArrayOutputStream);
        interfaceC0080f0.mo305b();
        return new C1192z(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: e */
    public void m319e() {
        WeakReference weakReference;
        this.f385j = 0;
        Iterator it = ((LinkedHashMap) this.f386k).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C2212f c2212f = (C2212f) AbstractC1913h.m3737B0(arrayList);
                if (((c2212f == null || (weakReference = c2212f.f7730b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    int i8 = i4 - i;
                    if (((C2212f) arrayList.get(i8)).f7730b.get() == null) {
                        arrayList.remove(i8);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: f */
    public long m320f(int i) {
        if (i >= 0 && i < this.f385j) {
            return ((long[]) this.f386k)[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f385j);
    }

    /* renamed from: g */
    public long m321g(InterfaceC1988o interfaceC1988o) {
        C1132w c1132w = (C1132w) this.f386k;
        int i = 0;
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 1);
        int i4 = c1132w.f4799a[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i8 = 128;
        int i9 = 0;
        while ((i4 & i8) == 0) {
            i8 >>= 1;
            i9++;
        }
        int i10 = i4 & (~i8);
        interfaceC1988o.mo3862i(c1132w.f4799a, 1, i9);
        while (i < i9) {
            i++;
            i10 = (c1132w.f4799a[i] & 255) + (i10 << 8);
        }
        this.f385j = i9 + 1 + this.f385j;
        return i10;
    }

    /* renamed from: h */
    public synchronized void m322h(C2207a c2207a, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f386k;
            Object arrayList = linkedHashMap.get(c2207a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c2207a, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C2212f c2212f = new C2212f(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    arrayList2.add(c2212f);
                    break;
                }
                C2212f c2212f2 = (C2212f) arrayList2.get(i4);
                if (i < c2212f2.f7732d) {
                    i4++;
                } else if (c2212f2.f7729a == iIdentityHashCode && c2212f2.f7730b.get() == bitmap) {
                    arrayList2.set(i4, c2212f);
                } else {
                    arrayList2.add(i4, c2212f);
                }
            }
            int i8 = this.f385j;
            this.f385j = i8 + 1;
            if (i8 >= 10) {
                m319e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0087j(int i) {
        this.f386k = new long[i];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0087j(int i, boolean z7) {
        this(32);
        switch (i) {
            case 2:
                break;
            case 3:
            default:
                this.f386k = new C1132w(8);
                break;
            case 4:
                this.f386k = Bitmap.CompressFormat.JPEG;
                this.f385j = 100;
                break;
            case 5:
                this.f386k = new LinkedHashMap();
                break;
        }
    }
}
