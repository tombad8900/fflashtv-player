package p077j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: j$.time.format.d */
/* loaded from: classes2.dex */
public final class C1399d implements InterfaceC1400e {

    /* renamed from: a */
    public final InterfaceC1400e[] f5504a;

    /* renamed from: b */
    public final boolean f5505b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1399d(List list, boolean z7) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC1400e[]) arrayList.toArray(new InterfaceC1400e[arrayList.size()]), z7);
    }

    public C1399d(InterfaceC1400e[] interfaceC1400eArr, boolean z7) {
        this.f5504a = interfaceC1400eArr;
        this.f5505b = z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        int length = sb.length();
        boolean z7 = this.f5505b;
        if (z7) {
            c1413r.f5549c++;
        }
        try {
            for (InterfaceC1400e interfaceC1400e : this.f5504a) {
                if (!interfaceC1400e.mo3009w(c1413r, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z7) {
                c1413r.f5549c--;
            }
        }
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        boolean z7 = this.f5505b;
        InterfaceC1400e[] interfaceC1400eArr = this.f5504a;
        int i4 = 0;
        if (z7) {
            ArrayList arrayList = c1411p.f5542d;
            C1417v c1417vM3038c = c1411p.m3038c();
            c1417vM3038c.getClass();
            C1417v c1417v = new C1417v();
            ((HashMap) c1417v.f5553a).putAll(c1417vM3038c.f5553a);
            c1417v.f5554b = c1417vM3038c.f5554b;
            c1417v.f5555c = c1417vM3038c.f5555c;
            c1417v.f5556d = c1417vM3038c.f5556d;
            arrayList.add(c1417v);
            int length = interfaceC1400eArr.length;
            int iMo3008A = i;
            while (i4 < length) {
                iMo3008A = interfaceC1400eArr[i4].mo3008A(c1411p, charSequence, iMo3008A);
                if (iMo3008A < 0) {
                    c1411p.f5542d.remove(r8.size() - 1);
                    return i;
                }
                i4++;
            }
            c1411p.f5542d.remove(r8.size() - 2);
            return iMo3008A;
        }
        int length2 = interfaceC1400eArr.length;
        while (i4 < length2) {
            i = interfaceC1400eArr[i4].mo3008A(c1411p, charSequence, i);
            if (i < 0) {
                return i;
            }
            i4++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC1400e[] interfaceC1400eArr = this.f5504a;
        if (interfaceC1400eArr != null) {
            boolean z7 = this.f5505b;
            sb.append(z7 ? "[" : "(");
            for (InterfaceC1400e interfaceC1400e : interfaceC1400eArr) {
                sb.append(interfaceC1400e);
            }
            sb.append(z7 ? "]" : ")");
        }
        return sb.toString();
    }
}
