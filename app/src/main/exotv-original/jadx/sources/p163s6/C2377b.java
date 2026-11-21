package p163s6;

import java.io.Serializable;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1908c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s6.b */
/* loaded from: classes.dex */
public final class C2377b extends AbstractC1908c implements InterfaceC2376a, Serializable {

    /* renamed from: j */
    public final Enum[] f8374j;

    public C2377b(Enum[] enumArr) {
        AbstractC2980h.m5136e("entries", enumArr);
        this.f8374j = enumArr;
    }

    @Override // p111m6.AbstractC1908c
    /* renamed from: a */
    public final int mo2621a() {
        return this.f8374j.length;
    }

    @Override // p111m6.AbstractC1908c, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        Enum[] enumArr = this.f8374j;
        AbstractC2980h.m5136e("<this>", enumArr);
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f8374j;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // p111m6.AbstractC1908c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        Enum[] enumArr = this.f8374j;
        AbstractC2980h.m5136e("<this>", enumArr);
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p111m6.AbstractC1908c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
