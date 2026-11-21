package p049f3;

import android.os.Parcel;
import android.util.SparseIntArray;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f3.b */
/* loaded from: classes.dex */
public final class C0938b extends AbstractC0937a {

    /* renamed from: d */
    public final SparseIntArray f4126d;

    /* renamed from: e */
    public final Parcel f4127e;

    /* renamed from: f */
    public final int f4128f;

    /* renamed from: g */
    public final int f4129g;

    /* renamed from: h */
    public final String f4130h;

    /* renamed from: i */
    public int f4131i;

    /* renamed from: j */
    public int f4132j;

    /* renamed from: k */
    public int f4133k;

    public C0938b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), C2181z.FRAGMENT_ENCODE_SET, new C2186e(0), new C2186e(0), new C2186e(0));
    }

    @Override // p049f3.AbstractC0937a
    /* renamed from: a */
    public final C0938b mo2111a() {
        Parcel parcel = this.f4127e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f4132j;
        if (i == this.f4128f) {
            i = this.f4129g;
        }
        return new C0938b(parcel, iDataPosition, i, AbstractC0008a1.m18n(new StringBuilder(), this.f4130h, "  "), this.f4123a, this.f4124b, this.f4125c);
    }

    @Override // p049f3.AbstractC0937a
    /* renamed from: e */
    public final boolean mo2115e(int i) {
        while (this.f4132j < this.f4129g) {
            int i4 = this.f4133k;
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i8 = this.f4132j;
            Parcel parcel = this.f4127e;
            parcel.setDataPosition(i8);
            int i9 = parcel.readInt();
            this.f4133k = parcel.readInt();
            this.f4132j += i9;
        }
        return this.f4133k == i;
    }

    @Override // p049f3.AbstractC0937a
    /* renamed from: i */
    public final void mo2119i(int i) {
        int i4 = this.f4131i;
        SparseIntArray sparseIntArray = this.f4126d;
        Parcel parcel = this.f4127e;
        if (i4 >= 0) {
            int i8 = sparseIntArray.get(i4);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i8);
            parcel.writeInt(iDataPosition - i8);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4131i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C0938b(Parcel parcel, int i, int i4, String str, C2186e c2186e, C2186e c2186e2, C2186e c2186e3) {
        super(c2186e, c2186e2, c2186e3);
        this.f4126d = new SparseIntArray();
        this.f4131i = -1;
        this.f4133k = -1;
        this.f4127e = parcel;
        this.f4128f = i;
        this.f4129g = i4;
        this.f4132j = i;
        this.f4130h = str;
    }
}
