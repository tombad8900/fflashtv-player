package p216z2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.d1 */
/* loaded from: classes.dex */
public final class C2883d1 implements Parcelable {
    public static final Parcelable.Creator<C2883d1> CREATOR = new C0634d(25);

    /* renamed from: j */
    public int f10640j;

    /* renamed from: k */
    public int f10641k;

    /* renamed from: l */
    public int f10642l;

    /* renamed from: m */
    public int[] f10643m;

    /* renamed from: n */
    public int f10644n;

    /* renamed from: o */
    public int[] f10645o;

    /* renamed from: p */
    public ArrayList f10646p;

    /* renamed from: q */
    public boolean f10647q;

    /* renamed from: r */
    public boolean f10648r;

    /* renamed from: s */
    public boolean f10649s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10640j);
        parcel.writeInt(this.f10641k);
        parcel.writeInt(this.f10642l);
        if (this.f10642l > 0) {
            parcel.writeIntArray(this.f10643m);
        }
        parcel.writeInt(this.f10644n);
        if (this.f10644n > 0) {
            parcel.writeIntArray(this.f10645o);
        }
        parcel.writeInt(this.f10647q ? 1 : 0);
        parcel.writeInt(this.f10648r ? 1 : 0);
        parcel.writeInt(this.f10649s ? 1 : 0);
        parcel.writeList(this.f10646p);
    }
}
