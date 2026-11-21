package p002a1;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C0006a implements InterfaceC0031l0 {

    /* renamed from: a */
    public final ArrayList f11a;

    /* renamed from: b */
    public int f12b;

    /* renamed from: c */
    public int f13c;

    /* renamed from: d */
    public int f14d;

    /* renamed from: e */
    public int f15e;

    /* renamed from: f */
    public int f16f;

    /* renamed from: g */
    public boolean f17g;

    /* renamed from: h */
    public String f18h;

    /* renamed from: i */
    public int f19i;

    /* renamed from: j */
    public CharSequence f20j;

    /* renamed from: k */
    public int f21k;

    /* renamed from: l */
    public CharSequence f22l;

    /* renamed from: m */
    public ArrayList f23m;

    /* renamed from: n */
    public ArrayList f24n;

    /* renamed from: o */
    public boolean f25o;

    /* renamed from: p */
    public final C0035n0 f26p;

    /* renamed from: q */
    public boolean f27q;

    /* renamed from: r */
    public int f28r;

    public C0006a(C0035n0 c0035n0) {
        c0035n0.m114D();
        C0058z c0058z = c0035n0.f134t;
        if (c0058z != null) {
            c0058z.f278q.getClassLoader();
        }
        this.f11a = new ArrayList();
        this.f25o = false;
        this.f28r = -1;
        this.f26p = c0035n0;
    }

    @Override // p002a1.InterfaceC0031l0
    /* renamed from: a */
    public final boolean mo1a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f17g) {
            return true;
        }
        C0035n0 c0035n0 = this.f26p;
        if (c0035n0.f118d == null) {
            c0035n0.f118d = new ArrayList();
        }
        c0035n0.f118d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m2b(C0051v0 c0051v0) {
        this.f11a.add(c0051v0);
        c0051v0.f256d = this.f12b;
        c0051v0.f257e = this.f13c;
        c0051v0.f258f = this.f14d;
        c0051v0.f259g = this.f15e;
    }

    /* renamed from: c */
    public final void m3c(int i) {
        if (this.f17g) {
            if (C0035n0.m106G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f11a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0051v0 c0051v0 = (C0051v0) arrayList.get(i4);
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0051v0.f254b;
                if (abstractComponentCallbacksC0050v != null) {
                    abstractComponentCallbacksC0050v.f252z += i;
                    if (C0035n0.m106G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0051v0.f254b + " to " + c0051v0.f254b.f252z);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4d(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f28r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f27q);
            if (this.f16f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f16f));
            }
            if (this.f12b != 0 || this.f13c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f13c));
            }
            if (this.f14d != 0 || this.f15e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f14d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15e));
            }
            if (this.f19i != 0 || this.f20j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f19i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f20j);
            }
            if (this.f21k != 0 || this.f22l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f22l);
            }
        }
        ArrayList arrayList = this.f11a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0051v0 c0051v0 = (C0051v0) arrayList.get(i);
            switch (c0051v0.f253a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0051v0.f253a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0051v0.f254b);
            if (z7) {
                if (c0051v0.f256d != 0 || c0051v0.f257e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0051v0.f256d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0051v0.f257e));
                }
                if (c0051v0.f258f != 0 || c0051v0.f259g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0051v0.f258f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0051v0.f259g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f28r >= 0) {
            sb.append(" #");
            sb.append(this.f28r);
        }
        if (this.f18h != null) {
            sb.append(" ");
            sb.append(this.f18h);
        }
        sb.append("}");
        return sb.toString();
    }
}
