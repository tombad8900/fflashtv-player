package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.d */
/* loaded from: classes.dex */
public final class C0552d extends AbstractC0558j {
    public static final Parcelable.Creator<C0552d> CREATOR = new C0002c(19);

    /* renamed from: k */
    public final String f2236k;

    /* renamed from: l */
    public final boolean f2237l;

    /* renamed from: m */
    public final boolean f2238m;

    /* renamed from: n */
    public final String[] f2239n;

    /* renamed from: o */
    public final AbstractC0558j[] f2240o;

    public C0552d(String str, boolean z7, boolean z8, String[] strArr, AbstractC0558j[] abstractC0558jArr) {
        super("CTOC");
        this.f2236k = str;
        this.f2237l = z7;
        this.f2238m = z8;
        this.f2239n = strArr;
        this.f2240o = abstractC0558jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0552d.class == obj.getClass()) {
            C0552d c0552d = (C0552d) obj;
            if (this.f2237l == c0552d.f2237l && this.f2238m == c0552d.f2238m) {
                String str = c0552d.f2236k;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(this.f2236k, str) && Arrays.equals(this.f2239n, c0552d.f2239n) && Arrays.equals(this.f2240o, c0552d.f2240o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f2237l ? 1 : 0)) * 31) + (this.f2238m ? 1 : 0)) * 31;
        String str = this.f2236k;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2236k);
        parcel.writeByte(this.f2237l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2238m ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f2239n);
        AbstractC0558j[] abstractC0558jArr = this.f2240o;
        parcel.writeInt(abstractC0558jArr.length);
        for (AbstractC0558j abstractC0558j : abstractC0558jArr) {
            parcel.writeParcelable(abstractC0558j, 0);
        }
    }

    public C0552d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2236k = string;
        this.f2237l = parcel.readByte() != 0;
        this.f2238m = parcel.readByte() != 0;
        this.f2239n = parcel.createStringArray();
        int i4 = parcel.readInt();
        this.f2240o = new AbstractC0558j[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            this.f2240o[i8] = (AbstractC0558j) parcel.readParcelable(AbstractC0558j.class.getClassLoader());
        }
    }
}
