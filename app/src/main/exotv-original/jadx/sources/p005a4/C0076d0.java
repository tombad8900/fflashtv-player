package p005a4;

import com.bumptech.glide.load.data.InterfaceC0730g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p096l0.InterfaceC1642b;
import p178u4.AbstractC2470e;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.d0 */
/* loaded from: classes.dex */
public final class C0076d0 {

    /* renamed from: a */
    public final InterfaceC1642b f328a;

    /* renamed from: b */
    public final List f329b;

    /* renamed from: c */
    public final String f330c;

    public C0076d0(Class cls, Class cls2, Class cls3, List list, InterfaceC1642b interfaceC1642b) {
        this.f328a = interfaceC1642b;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f329b = list;
        this.f330c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final InterfaceC0080f0 m302a(int i, int i4, C0087j c0087j, InterfaceC0730g interfaceC0730g, C2804h c2804h) {
        InterfaceC1642b interfaceC1642b = this.f328a;
        Object objAcquire = interfaceC1642b.acquire();
        AbstractC2470e.m4446c("Argument must not be null", objAcquire);
        List list = (List) objAcquire;
        try {
            List list2 = this.f329b;
            int size = list2.size();
            InterfaceC0080f0 interfaceC0080f0M342a = null;
            for (int i8 = 0; i8 < size; i8++) {
                try {
                    interfaceC0080f0M342a = ((C0092m) list2.get(i8)).m342a(i, i4, c0087j, interfaceC0730g, c2804h);
                } catch (C0070a0 e) {
                    list.add(e);
                }
                if (interfaceC0080f0M342a != null) {
                    break;
                }
            }
            if (interfaceC0080f0M342a != null) {
                return interfaceC0080f0M342a;
            }
            throw new C0070a0(this.f330c, new ArrayList(list));
        } finally {
            interfaceC1642b.mo285g(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f329b.toArray()) + '}';
    }
}
