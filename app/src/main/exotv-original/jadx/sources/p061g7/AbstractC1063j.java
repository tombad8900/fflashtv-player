package p061g7;

import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p111m6.C1921p;

/* renamed from: g7.j */
/* loaded from: classes.dex */
public abstract class AbstractC1063j extends AbstractC1064k {
    /* renamed from: S */
    public static List m2250S(InterfaceC1061h interfaceC1061h) {
        Iterator it = interfaceC1061h.iterator();
        if (!it.hasNext()) {
            return C1921p.f7187j;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0715d.m1551T(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
