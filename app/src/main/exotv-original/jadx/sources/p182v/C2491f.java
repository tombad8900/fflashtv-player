package p182v;

import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.f */
/* loaded from: classes.dex */
public class C2491f implements InterfaceC2489d {

    /* renamed from: d */
    public final AbstractC2500o f9100d;

    /* renamed from: f */
    public int f9102f;

    /* renamed from: g */
    public int f9103g;

    /* renamed from: a */
    public AbstractC2500o f9097a = null;

    /* renamed from: b */
    public boolean f9098b = false;

    /* renamed from: c */
    public boolean f9099c = false;

    /* renamed from: e */
    public int f9101e = 1;

    /* renamed from: h */
    public int f9104h = 1;

    /* renamed from: i */
    public C2492g f9105i = null;

    /* renamed from: j */
    public boolean f9106j = false;

    /* renamed from: k */
    public final ArrayList f9107k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f9108l = new ArrayList();

    public C2491f(AbstractC2500o abstractC2500o) {
        this.f9100d = abstractC2500o;
    }

    @Override // p182v.InterfaceC2489d
    /* renamed from: a */
    public final void mo4462a(InterfaceC2489d interfaceC2489d) {
        ArrayList arrayList = this.f9108l;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!((C2491f) obj).f9106j) {
                return;
            }
        }
        this.f9099c = true;
        AbstractC2500o abstractC2500o = this.f9097a;
        if (abstractC2500o != null) {
            abstractC2500o.mo4462a(this);
        }
        if (this.f9098b) {
            this.f9100d.mo4462a(this);
            return;
        }
        int size2 = arrayList.size();
        C2491f c2491f = null;
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            C2491f c2491f2 = (C2491f) obj2;
            if (!(c2491f2 instanceof C2492g)) {
                i++;
                c2491f = c2491f2;
            }
        }
        if (c2491f != null && i == 1 && c2491f.f9106j) {
            C2492g c2492g = this.f9105i;
            if (c2492g != null) {
                if (!c2492g.f9106j) {
                    return;
                } else {
                    this.f9102f = this.f9104h * c2492g.f9103g;
                }
            }
            mo4479d(c2491f.f9103g + this.f9102f);
        }
        AbstractC2500o abstractC2500o2 = this.f9097a;
        if (abstractC2500o2 != null) {
            abstractC2500o2.mo4462a(this);
        }
    }

    /* renamed from: b */
    public final void m4477b(AbstractC2500o abstractC2500o) {
        this.f9107k.add(abstractC2500o);
        if (this.f9106j) {
            abstractC2500o.mo4462a(abstractC2500o);
        }
    }

    /* renamed from: c */
    public final void m4478c() {
        this.f9108l.clear();
        this.f9107k.clear();
        this.f9106j = false;
        this.f9103g = 0;
        this.f9099c = false;
        this.f9098b = false;
    }

    /* renamed from: d */
    public void mo4479d(int i) {
        if (this.f9106j) {
            return;
        }
        this.f9106j = true;
        this.f9103g = i;
        ArrayList arrayList = this.f9107k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            InterfaceC2489d interfaceC2489d = (InterfaceC2489d) obj;
            interfaceC2489d.mo4462a(interfaceC2489d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9100d.f9123b.f8861h0);
        sb.append(":");
        switch (this.f9101e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f9106j ? Integer.valueOf(this.f9103g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9108l.size());
        sb.append(":d=");
        sb.append(this.f9107k.size());
        sb.append(">");
        return sb.toString();
    }
}
