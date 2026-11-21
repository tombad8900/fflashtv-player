package p109m4;

import java.util.ArrayList;
import p135p4.C2217d;
import p210y3.InterfaceC2807k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m4.c */
/* loaded from: classes.dex */
public final class C1898c {

    /* renamed from: a */
    public final ArrayList f7107a;

    public C1898c(int i) {
        switch (i) {
            case 1:
                this.f7107a = new ArrayList();
                break;
            case 2:
                this.f7107a = new ArrayList();
                break;
            case 3:
                this.f7107a = new ArrayList();
                break;
            default:
                this.f7107a = new ArrayList();
                break;
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC2807k m3672a(Class cls) {
        int size = this.f7107a.size();
        for (int i = 0; i < size; i++) {
            C2217d c2217d = (C2217d) this.f7107a.get(i);
            if (c2217d.f7741a.isAssignableFrom(cls)) {
                return c2217d.f7742b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public synchronized ArrayList m3673b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f7107a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C1897b c1897b = (C1897b) obj;
            if ((c1897b.f7104a.isAssignableFrom(cls) && cls2.isAssignableFrom(c1897b.f7105b)) && !arrayList.contains(c1897b.f7105b)) {
                arrayList.add(c1897b.f7105b);
            }
        }
        return arrayList;
    }
}
