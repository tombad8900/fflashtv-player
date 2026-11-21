package p002a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.o0 */
/* loaded from: classes.dex */
public final class C0037o0 implements Parcelable {
    public static final Parcelable.Creator<C0037o0> CREATOR = new C0002c(4);

    /* renamed from: j */
    public ArrayList f144j;

    /* renamed from: k */
    public ArrayList f145k;

    /* renamed from: l */
    public C0009b[] f146l;

    /* renamed from: m */
    public int f147m;

    /* renamed from: n */
    public String f148n;

    /* renamed from: o */
    public ArrayList f149o;

    /* renamed from: p */
    public ArrayList f150p;

    /* renamed from: q */
    public ArrayList f151q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f144j);
        parcel.writeStringList(this.f145k);
        parcel.writeTypedArray(this.f146l, i);
        parcel.writeInt(this.f147m);
        parcel.writeString(this.f148n);
        parcel.writeStringList(this.f149o);
        parcel.writeTypedList(this.f150p);
        parcel.writeTypedList(this.f151q);
    }
}
