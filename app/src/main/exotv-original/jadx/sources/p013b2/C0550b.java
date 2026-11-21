package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p000a.C0002c;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.b */
/* loaded from: classes.dex */
public final class C0550b extends AbstractC0558j {
    public static final Parcelable.Creator<C0550b> CREATOR = new C0002c(17);

    /* renamed from: k */
    public final byte[] f2229k;

    public C0550b(String str, byte[] bArr) {
        super(str);
        this.f2229k = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0550b.class == obj.getClass()) {
            C0550b c0550b = (C0550b) obj;
            if (this.f2253j.equals(c0550b.f2253j) && Arrays.equals(this.f2229k, c0550b.f2229k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2229k) + AbstractC0008a1.m9e(this.f2253j, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2253j);
        parcel.writeByteArray(this.f2229k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0550b(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        super(string);
        this.f2229k = parcel.createByteArray();
    }
}
