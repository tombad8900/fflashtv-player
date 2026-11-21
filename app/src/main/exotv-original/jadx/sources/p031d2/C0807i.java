package p031d2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.i */
/* loaded from: classes.dex */
public final class C0807i extends AbstractC0800b {
    public static final Parcelable.Creator<C0807i> CREATOR = new C0634d(8);

    /* renamed from: j */
    public final List f3618j;

    public C0807i(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(new C0806h(parcel));
        }
        this.f3618j = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f3618j;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            C0806h c0806h = (C0806h) list.get(i4);
            parcel.writeLong(c0806h.f3607a);
            parcel.writeByte(c0806h.f3608b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c0806h.f3609c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c0806h.f3610d ? (byte) 1 : (byte) 0);
            List list2 = c0806h.f3612f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i8 = 0; i8 < size2; i8++) {
                C0805g c0805g = (C0805g) list2.get(i8);
                parcel.writeInt(c0805g.f3605a);
                parcel.writeLong(c0805g.f3606b);
            }
            parcel.writeLong(c0806h.f3611e);
            parcel.writeByte(c0806h.f3613g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c0806h.f3614h);
            parcel.writeInt(c0806h.f3615i);
            parcel.writeInt(c0806h.f3616j);
            parcel.writeInt(c0806h.f3617k);
        }
    }

    public C0807i(ArrayList arrayList) {
        this.f3618j = Collections.unmodifiableList(arrayList);
    }
}
