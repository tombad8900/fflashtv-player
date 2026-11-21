package p041e4;

import com.bumptech.glide.C0718g;
import java.util.ArrayList;
import java.util.HashSet;
import p005a4.C0073c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.x */
/* loaded from: classes.dex */
public final class C0907x {

    /* renamed from: e */
    public static final C0880a0 f3946e = new C0880a0(10);

    /* renamed from: f */
    public static final C0882b0 f3947f = new C0882b0(2);

    /* renamed from: d */
    public final C0073c f3951d;

    /* renamed from: a */
    public final ArrayList f3948a = new ArrayList();

    /* renamed from: c */
    public final HashSet f3950c = new HashSet();

    /* renamed from: b */
    public final C0880a0 f3949b = f3946e;

    public C0907x(C0073c c0073c) {
        this.f3951d = c0073c;
    }

    /* renamed from: a */
    public final synchronized InterfaceC0901r m2070a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f3948a;
            int size = arrayList2.size();
            boolean z7 = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                C0906w c0906w = (C0906w) obj;
                if (this.f3950c.contains(c0906w)) {
                    z7 = true;
                } else if (c0906w.f3943a.isAssignableFrom(cls) && c0906w.f3944b.isAssignableFrom(cls2)) {
                    this.f3950c.add(c0906w);
                    arrayList.add(c0906w.f3945c.mo94g(this));
                    this.f3950c.remove(c0906w);
                }
            }
            if (arrayList.size() > 1) {
                C0880a0 c0880a0 = this.f3949b;
                C0073c c0073c = this.f3951d;
                c0880a0.getClass();
                return new C0881b(arrayList, 2, c0073c);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC0901r) arrayList.get(0);
            }
            if (z7) {
                return f3947f;
            }
            throw new C0718g("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f3950c.clear();
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized ArrayList m2071b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f3948a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                C0906w c0906w = (C0906w) obj;
                if (!this.f3950c.contains(c0906w) && c0906w.f3943a.isAssignableFrom(cls)) {
                    this.f3950c.add(c0906w);
                    arrayList.add(c0906w.f3945c.mo94g(this));
                    this.f3950c.remove(c0906w);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized ArrayList m2072c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f3948a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C0906w c0906w = (C0906w) obj;
            if (!arrayList.contains(c0906w.f3944b) && c0906w.f3943a.isAssignableFrom(cls)) {
                arrayList.add(c0906w.f3944b);
            }
        }
        return arrayList;
    }
}
