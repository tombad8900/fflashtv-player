package p189v7;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import p198w7.AbstractC2707c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.b0 */
/* loaded from: classes.dex */
public final class C2558b0 implements Comparable {

    /* renamed from: k */
    public static final String f9272k;

    /* renamed from: j */
    public final C2579m f9273j;

    static {
        String str = File.separator;
        AbstractC2980h.m5135d("separator", str);
        f9272k = str;
    }

    public C2558b0(C2579m c2579m) {
        AbstractC2980h.m5136e("bytes", c2579m);
        this.f9273j = c2579m;
    }

    /* renamed from: a */
    public final ArrayList m4587a() {
        ArrayList arrayList = new ArrayList();
        int iM4768a = AbstractC2707c.m4768a(this);
        C2579m c2579m = this.f9273j;
        if (iM4768a == -1) {
            iM4768a = 0;
        } else if (iM4768a < c2579m.mo4634d() && c2579m.mo4638i(iM4768a) == 92) {
            iM4768a++;
        }
        int iMo4634d = c2579m.mo4634d();
        int i = iM4768a;
        while (iM4768a < iMo4634d) {
            if (c2579m.mo4638i(iM4768a) == 47 || c2579m.mo4638i(iM4768a) == 92) {
                arrayList.add(c2579m.mo4642n(i, iM4768a));
                i = iM4768a + 1;
            }
            iM4768a++;
        }
        if (i < c2579m.mo4634d()) {
            arrayList.add(c2579m.mo4642n(i, c2579m.mo4634d()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C2558b0 m4588b() {
        C2579m c2579m = AbstractC2707c.f9827d;
        C2579m c2579m2 = this.f9273j;
        if (AbstractC2980h.m5132a(c2579m2, c2579m)) {
            return null;
        }
        C2579m c2579m3 = AbstractC2707c.f9824a;
        if (AbstractC2980h.m5132a(c2579m2, c2579m3)) {
            return null;
        }
        C2579m c2579m4 = AbstractC2707c.f9825b;
        if (AbstractC2980h.m5132a(c2579m2, c2579m4)) {
            return null;
        }
        C2579m c2579m5 = AbstractC2707c.f9828e;
        c2579m2.getClass();
        AbstractC2980h.m5136e("suffix", c2579m5);
        int iMo4634d = c2579m2.mo4634d();
        byte[] bArr = c2579m5.f9317j;
        if (c2579m2.mo4641m(iMo4634d - bArr.length, c2579m5, bArr.length) && (c2579m2.mo4634d() == 2 || c2579m2.mo4641m(c2579m2.mo4634d() - 3, c2579m3, 1) || c2579m2.mo4641m(c2579m2.mo4634d() - 3, c2579m4, 1))) {
            return null;
        }
        int iM4672k = C2579m.m4672k(c2579m2, c2579m3);
        if (iM4672k == -1) {
            iM4672k = C2579m.m4672k(c2579m2, c2579m4);
        }
        if (iM4672k == 2 && m4592f() != null) {
            if (c2579m2.mo4634d() == 3) {
                return null;
            }
            return new C2558b0(C2579m.m4673o(c2579m2, 0, 3, 1));
        }
        if (iM4672k == 1) {
            AbstractC2980h.m5136e("prefix", c2579m4);
            if (c2579m2.mo4641m(0, c2579m4, c2579m4.mo4634d())) {
                return null;
            }
        }
        if (iM4672k != -1 || m4592f() == null) {
            return iM4672k == -1 ? new C2558b0(c2579m) : iM4672k == 0 ? new C2558b0(C2579m.m4673o(c2579m2, 0, 1, 1)) : new C2558b0(C2579m.m4673o(c2579m2, 0, iM4672k, 1));
        }
        if (c2579m2.mo4634d() == 2) {
            return null;
        }
        return new C2558b0(C2579m.m4673o(c2579m2, 0, 2, 1));
    }

    /* renamed from: c */
    public final C2558b0 m4589c(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("other", c2558b0);
        C2579m c2579m = c2558b0.f9273j;
        int iM4768a = AbstractC2707c.m4768a(this);
        C2579m c2579m2 = this.f9273j;
        C2558b0 c2558b02 = iM4768a == -1 ? null : new C2558b0(c2579m2.mo4642n(0, iM4768a));
        int iM4768a2 = AbstractC2707c.m4768a(c2558b0);
        if (!AbstractC2980h.m5132a(c2558b02, iM4768a2 != -1 ? new C2558b0(c2579m.mo4642n(0, iM4768a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + c2558b0).toString());
        }
        ArrayList arrayListM4587a = m4587a();
        ArrayList arrayListM4587a2 = c2558b0.m4587a();
        int iMin = Math.min(arrayListM4587a.size(), arrayListM4587a2.size());
        int i = 0;
        while (i < iMin && AbstractC2980h.m5132a(arrayListM4587a.get(i), arrayListM4587a2.get(i))) {
            i++;
        }
        if (i == iMin && c2579m2.mo4634d() == c2579m.mo4634d()) {
            return C2556a0.m4571c(".");
        }
        if (arrayListM4587a2.subList(i, arrayListM4587a2.size()).indexOf(AbstractC2707c.f9828e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + c2558b0).toString());
        }
        C2573j c2573j = new C2573j();
        C2579m c2579mM4770c = AbstractC2707c.m4770c(c2558b0);
        if (c2579mM4770c == null && (c2579mM4770c = AbstractC2707c.m4770c(this)) == null) {
            c2579mM4770c = AbstractC2707c.m4773f(f9272k);
        }
        int size = arrayListM4587a2.size();
        for (int i4 = i; i4 < size; i4++) {
            c2573j.m4654J(AbstractC2707c.f9828e);
            c2573j.m4654J(c2579mM4770c);
        }
        int size2 = arrayListM4587a.size();
        while (i < size2) {
            c2573j.m4654J((C2579m) arrayListM4587a.get(i));
            c2573j.m4654J(c2579mM4770c);
            i++;
        }
        return AbstractC2707c.m4771d(c2573j, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2558b0 c2558b0 = (C2558b0) obj;
        AbstractC2980h.m5136e("other", c2558b0);
        return this.f9273j.compareTo(c2558b0.f9273j);
    }

    /* renamed from: d */
    public final C2558b0 m4590d(String str) {
        AbstractC2980h.m5136e("child", str);
        C2573j c2573j = new C2573j();
        c2573j.m4661Q(str);
        return AbstractC2707c.m4769b(this, AbstractC2707c.m4771d(c2573j, false), false);
    }

    /* renamed from: e */
    public final Path m4591e() {
        Path path = Paths.get(this.f9273j.m4675q(), new String[0]);
        AbstractC2980h.m5135d("get(...)", path);
        return path;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2558b0) && AbstractC2980h.m5132a(((C2558b0) obj).f9273j, this.f9273j);
    }

    /* renamed from: f */
    public final Character m4592f() {
        C2579m c2579m = AbstractC2707c.f9824a;
        C2579m c2579m2 = this.f9273j;
        if (C2579m.m4671g(c2579m2, c2579m) != -1 || c2579m2.mo4634d() < 2 || c2579m2.mo4638i(1) != 58) {
            return null;
        }
        char cMo4638i = (char) c2579m2.mo4638i(0);
        if (('a' > cMo4638i || cMo4638i >= '{') && ('A' > cMo4638i || cMo4638i >= '[')) {
            return null;
        }
        return Character.valueOf(cMo4638i);
    }

    public final int hashCode() {
        return this.f9273j.hashCode();
    }

    public final File toFile() {
        return new File(this.f9273j.m4675q());
    }

    public final String toString() {
        return this.f9273j.m4675q();
    }
}
