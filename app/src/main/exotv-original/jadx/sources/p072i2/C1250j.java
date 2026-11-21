package p072i2;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1129t;
import p063h1.C1131v;
import p063h1.C1132w;
import p079j0.C1481i;
import p095l.C1629o;
import p105m0.AbstractC1828m0;
import p115n1.C1984k0;
import p115n1.C1999z;
import p115n1.InterfaceC1989p;
import p168t2.C2407e0;
import p168t2.C2409f0;
import p168t2.C2411g0;
import p168t2.InterfaceC2403c0;
import p168t2.InterfaceC2413h0;
import p184v1.C2528c;
import p216z2.AbstractC2920v0;
import p216z2.C2921w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.j */
/* loaded from: classes.dex */
public final class C1250j implements InterfaceC2403c0 {

    /* renamed from: j */
    public final /* synthetic */ int f5228j;

    /* renamed from: k */
    public int f5229k;

    /* renamed from: l */
    public final Object f5230l;

    /* renamed from: m */
    public final Object f5231m;

    /* renamed from: n */
    public final Cloneable f5232n;

    /* renamed from: o */
    public Object f5233o;

    public C1250j(C2921w c2921w) {
        this.f5228j = 2;
        this.f5229k = 0;
        this.f5230l = c2921w;
        this.f5231m = new C2528c();
        this.f5232n = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    @Override // p168t2.InterfaceC2403c0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo279a(C1132w c1132w) {
        C1108d0 c1108d0;
        C1108d0 c1108d02;
        SparseArray sparseArray;
        int i;
        C1131v c1131v;
        char c8;
        int i4;
        int i8;
        C1108d0 c1108d03;
        SparseArray sparseArray2 = (SparseArray) this.f5231m;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f5232n;
        C1131v c1131v2 = (C1131v) this.f5230l;
        C2407e0 c2407e0 = (C2407e0) this.f5233o;
        SparseArray sparseArray3 = c2407e0.f8531h;
        SparseBooleanArray sparseBooleanArray = c2407e0.f8532i;
        C1481i c1481i = c2407e0.f8529f;
        List list = c2407e0.f8526c;
        int i9 = c2407e0.f8524a;
        if (c1132w.m2535u() == 2) {
            if (i9 == 1 || i9 == 2 || c2407e0.f8537n == 1) {
                c1108d0 = (C1108d0) list.get(0);
            } else {
                c1108d0 = new C1108d0(((C1108d0) list.get(0)).m2399d());
                list.add(c1108d0);
            }
            if ((c1132w.m2535u() & 128) != 0) {
                c1132w.m2514H(1);
                int iM2507A = c1132w.m2507A();
                c1132w.m2514H(3);
                c1132w.m2519e((byte[]) c1131v2.f4792b, 0, 2);
                c1131v2.m2502s(0);
                c1131v2.m2505v(3);
                c2407e0.f8543t = c1131v2.m2494k(13);
                c1132w.m2519e((byte[]) c1131v2.f4792b, 0, 2);
                c1131v2.m2502s(0);
                c1131v2.m2505v(4);
                c1132w.m2514H(c1131v2.m2494k(12));
                if (i9 == 2 && c2407e0.f8541r == null) {
                    InterfaceC2413h0 interfaceC2413h0M3145a = c1481i.m3145a(21, new C1129t(21, null, 0, null, AbstractC1118i0.f4755f));
                    c2407e0.f8541r = interfaceC2413h0M3145a;
                    if (interfaceC2413h0M3145a != null) {
                        interfaceC2413h0M3145a.mo4251b(c1108d0, c2407e0.f8536m, new C2411g0(iM2507A, 21, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int iM2515a = c1132w.m2515a();
                while (iM2515a > 0) {
                    c1132w.m2519e((byte[]) c1131v2.f4792b, 0, 5);
                    c1131v2.m2502s(0);
                    int iM2494k = c1131v2.m2494k(8);
                    c1131v2.m2505v(3);
                    int iM2494k2 = c1131v2.m2494k(13);
                    c1131v2.m2505v(4);
                    int iM2494k3 = c1131v2.m2494k(12);
                    int i10 = c1132w.f4800b;
                    int i11 = i10 + iM2494k3;
                    int i12 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iM2535u = 0;
                    int i13 = iM2515a;
                    while (true) {
                        if (c1132w.f4800b >= i11) {
                            c1131v = c1131v2;
                            break;
                        }
                        int iM2535u2 = c1132w.m2535u();
                        c1131v = c1131v2;
                        int iM2535u3 = c1132w.f4800b + c1132w.m2535u();
                        if (iM2535u3 > i11) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (iM2535u2 == 5) {
                            long jM2537w = c1132w.m2537w();
                            if (jM2537w == 1094921523) {
                                i12 = 129;
                            } else if (jM2537w == 1161904947) {
                                i12 = 135;
                            } else if (jM2537w == 1094921524) {
                                i12 = 172;
                            } else if (jM2537w == 1212503619) {
                                i12 = 36;
                            }
                            i4 = iM2535u3;
                            i8 = iM2507A;
                            c1108d03 = c1108d0;
                        } else if (iM2535u2 == 106) {
                            i4 = iM2535u3;
                            i8 = iM2507A;
                            c1108d03 = c1108d0;
                            i12 = 129;
                        } else if (iM2535u2 == 122) {
                            i8 = iM2507A;
                            c1108d03 = c1108d0;
                            i12 = 135;
                            i4 = iM2535u3;
                        } else {
                            if (iM2535u2 == 127) {
                                int iM2535u4 = c1132w.m2535u();
                                if (iM2535u4 != 21) {
                                    if (iM2535u4 == 14) {
                                        i12 = 136;
                                    } else if (iM2535u4 == 33) {
                                        i12 = 139;
                                    }
                                }
                            } else if (iM2535u2 == 123) {
                                i12 = 138;
                            } else if (iM2535u2 == 10) {
                                strTrim = c1132w.m2533s(3, StandardCharsets.UTF_8).trim();
                                i4 = iM2535u3;
                                iM2535u = c1132w.m2535u();
                                i8 = iM2507A;
                                c1108d03 = c1108d0;
                            } else if (iM2535u2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c1132w.f4800b < iM2535u3) {
                                    String strTrim2 = c1132w.m2533s(3, StandardCharsets.UTF_8).trim();
                                    c1132w.m2535u();
                                    C1108d0 c1108d04 = c1108d0;
                                    byte[] bArr = new byte[4];
                                    c1132w.m2519e(bArr, 0, 4);
                                    arrayList2.add(new C2409f0(strTrim2, bArr));
                                    c1108d0 = c1108d04;
                                    iM2535u3 = iM2535u3;
                                    iM2507A = iM2507A;
                                }
                                i4 = iM2535u3;
                                i8 = iM2507A;
                                c1108d03 = c1108d0;
                                arrayList = arrayList2;
                                i12 = 89;
                            } else {
                                i4 = iM2535u3;
                                i8 = iM2507A;
                                c1108d03 = c1108d0;
                                if (iM2535u2 == 111) {
                                    i12 = 257;
                                }
                            }
                            i4 = iM2535u3;
                            i8 = iM2507A;
                            c1108d03 = c1108d0;
                        }
                        c1132w.m2514H(i4 - c1132w.f4800b);
                        c1108d0 = c1108d03;
                        c1131v2 = c1131v;
                        sparseArray3 = sparseArray4;
                        iM2507A = i8;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i14 = iM2507A;
                    C1108d0 c1108d05 = c1108d0;
                    c1132w.m2513G(i11);
                    C1129t c1129t = new C1129t(i12, strTrim, iM2535u, arrayList, Arrays.copyOfRange(c1132w.f4799a, i10, i11));
                    if (iM2494k == 6 || iM2494k == 5) {
                        iM2494k = i12;
                    }
                    int i15 = i13 - (iM2494k3 + 5);
                    int i16 = i9 == 2 ? iM2494k : iM2494k2;
                    if (sparseBooleanArray.get(i16)) {
                        c8 = 21;
                    } else {
                        c8 = 21;
                        InterfaceC2413h0 interfaceC2413h0M3145a2 = (i9 == 2 && iM2494k == 21) ? c2407e0.f8541r : c1481i.m3145a(iM2494k, c1129t);
                        if (i9 != 2 || iM2494k2 < sparseIntArray.get(i16, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED)) {
                            sparseIntArray.put(i16, iM2494k2);
                            sparseArray2.put(i16, interfaceC2413h0M3145a2);
                        }
                    }
                    iM2515a = i15;
                    c1108d0 = c1108d05;
                    c1131v2 = c1131v;
                    sparseArray3 = sparseArray5;
                    iM2507A = i14;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i17 = iM2507A;
                C1108d0 c1108d06 = c1108d0;
                int size = sparseIntArray.size();
                int i18 = 0;
                while (i18 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i18);
                    int iValueAt = sparseIntArray.valueAt(i18);
                    sparseBooleanArray.put(iKeyAt, true);
                    c2407e0.f8533j.put(iValueAt, true);
                    InterfaceC2413h0 interfaceC2413h0 = (InterfaceC2413h0) sparseArray2.valueAt(i18);
                    if (interfaceC2413h0 != null) {
                        if (interfaceC2413h0 != c2407e0.f8541r) {
                            i = i17;
                            c1108d02 = c1108d06;
                            interfaceC2413h0.mo4251b(c1108d02, c2407e0.f8536m, new C2411g0(i, iKeyAt, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED));
                        } else {
                            c1108d02 = c1108d06;
                            i = i17;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(iValueAt, interfaceC2413h0);
                    } else {
                        c1108d02 = c1108d06;
                        sparseArray = sparseArray6;
                        i = i17;
                    }
                    i18++;
                    sparseArray6 = sparseArray;
                    i17 = i;
                    c1108d06 = c1108d02;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i9 == 2) {
                    if (c2407e0.f8538o) {
                        return;
                    }
                    c2407e0.f8536m.endTracks();
                    c2407e0.f8537n = 0;
                    c2407e0.f8538o = true;
                    return;
                }
                sparseArray7.remove(this.f5229k);
                int i19 = i9 == 1 ? 0 : c2407e0.f8537n - 1;
                c2407e0.f8537n = i19;
                if (i19 == 0) {
                    c2407e0.f8536m.endTracks();
                    c2407e0.f8538o = true;
                }
            }
        }
    }

    @Override // p168t2.InterfaceC2403c0
    /* renamed from: b */
    public void mo280b(C1108d0 c1108d0, InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
    }

    /* renamed from: c */
    public void m2724c(View view, int i, boolean z7) {
        RecyclerView recyclerView = ((C2921w) this.f5230l).f10867a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2729h(i);
        ((C2528c) this.f5231m).m4547n(childCount, z7);
        if (z7) {
            m2732k(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1144M(view);
    }

    /* renamed from: d */
    public void m2725d(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z7) {
        RecyclerView recyclerView = ((C2921w) this.f5230l).f10867a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2729h(i);
        ((C2528c) this.f5231m).m4547n(childCount, z7);
        if (z7) {
            m2732k(view);
        }
        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
        if (abstractC2920v0M1144M != null) {
            if (!abstractC2920v0M1144M.m5070j() && !abstractC2920v0M1144M.m5075o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC2920v0M1144M);
                throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, sb));
            }
            if (RecyclerView.f2005J0) {
                Log.d("RecyclerView", "reAttach " + abstractC2920v0M1144M);
            }
            abstractC2920v0M1144M.f10857j &= -257;
        } else if (RecyclerView.f2004I0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: e */
    public void m2726e(int i) {
        int iM2729h = m2729h(i);
        ((C2528c) this.f5231m).m4548o(iM2729h);
        RecyclerView recyclerView = ((C2921w) this.f5230l).f10867a;
        View childAt = recyclerView.getChildAt(iM2729h);
        if (childAt != null) {
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(childAt);
            if (abstractC2920v0M1144M != null) {
                if (abstractC2920v0M1144M.m5070j() && !abstractC2920v0M1144M.m5075o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC2920v0M1144M);
                    throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, sb));
                }
                if (RecyclerView.f2005J0) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC2920v0M1144M);
                }
                abstractC2920v0M1144M.m5061a(256);
            }
        } else if (RecyclerView.f2004I0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM2729h);
            throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM2729h);
    }

    /* renamed from: f */
    public View m2727f(int i) {
        return ((C2921w) this.f5230l).f10867a.getChildAt(m2729h(i));
    }

    /* renamed from: g */
    public int m2728g() {
        return ((C2921w) this.f5230l).f10867a.getChildCount() - ((ArrayList) this.f5232n).size();
    }

    /* renamed from: h */
    public int m2729h(int i) {
        C2528c c2528c = (C2528c) this.f5231m;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C2921w) this.f5230l).f10867a.getChildCount();
        int i4 = i;
        while (i4 < childCount) {
            int iM4544k = i - (i4 - c2528c.m4544k(i4));
            if (iM4544k == 0) {
                while (c2528c.m4546m(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += iM4544k;
        }
        return -1;
    }

    /* renamed from: i */
    public View m2730i(int i) {
        return ((C2921w) this.f5230l).f10867a.getChildAt(i);
    }

    /* renamed from: j */
    public int m2731j() {
        return ((C2921w) this.f5230l).f10867a.getChildCount();
    }

    /* renamed from: k */
    public void m2732k(View view) {
        ((ArrayList) this.f5232n).add(view);
        C2921w c2921w = (C2921w) this.f5230l;
        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
        if (abstractC2920v0M1144M != null) {
            View view2 = abstractC2920v0M1144M.f10848a;
            RecyclerView recyclerView = c2921w.f10867a;
            int i = abstractC2920v0M1144M.f10864q;
            if (i != -1) {
                abstractC2920v0M1144M.f10863p = i;
            } else {
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                abstractC2920v0M1144M.f10863p = view2.getImportantForAccessibility();
            }
            if (recyclerView.m1165P()) {
                abstractC2920v0M1144M.f10864q = 4;
                recyclerView.f2019C0.add(abstractC2920v0M1144M);
            } else {
                WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: l */
    public void m2733l(View view) {
        if (((ArrayList) this.f5232n).remove(view)) {
            C2921w c2921w = (C2921w) this.f5230l;
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
            if (abstractC2920v0M1144M != null) {
                RecyclerView recyclerView = c2921w.f10867a;
                int i = abstractC2920v0M1144M.f10863p;
                if (recyclerView.m1165P()) {
                    abstractC2920v0M1144M.f10864q = i;
                    recyclerView.f2019C0.add(abstractC2920v0M1144M);
                } else {
                    View view2 = abstractC2920v0M1144M.f10848a;
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    view2.setImportantForAccessibility(i);
                }
                abstractC2920v0M1144M.f10863p = 0;
            }
        }
    }

    public String toString() {
        switch (this.f5228j) {
            case 2:
                return ((C2528c) this.f5231m).toString() + ", hidden list:" + ((ArrayList) this.f5232n).size();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1250j(C1999z c1999z, C1629o c1629o, byte[] bArr, C1984k0[] c1984k0Arr, int i) {
        this.f5228j = 0;
        this.f5230l = c1999z;
        this.f5231m = c1629o;
        this.f5232n = bArr;
        this.f5233o = c1984k0Arr;
        this.f5229k = i;
    }

    public C1250j(C2407e0 c2407e0, int i) {
        this.f5228j = 1;
        this.f5233o = c2407e0;
        this.f5230l = new C1131v(new byte[5], 5);
        this.f5231m = new SparseArray();
        this.f5232n = new SparseIntArray();
        this.f5229k = i;
    }
}
