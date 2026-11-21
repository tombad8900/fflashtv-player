package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.n */
/* loaded from: classes.dex */
public final class C0562n extends AbstractC0558j {
    public static final Parcelable.Creator<C0562n> CREATOR = new C0002c(24);

    /* renamed from: k */
    public final String f2263k;

    /* renamed from: l */
    public final byte[] f2264l;

    public C0562n(String str, byte[] bArr) {
        super("PRIV");
        this.f2263k = str;
        this.f2264l = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0562n.class == obj.getClass()) {
            C0562n c0562n = (C0562n) obj;
            String str = c0562n.f2263k;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f2263k, str) && Arrays.equals(this.f2264l, c0562n.f2264l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2263k;
        return Arrays.hashCode(this.f2264l) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p013b2.AbstractC0558j
    public final String toString() {
        return this.f2253j + ": owner=" + this.f2263k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2263k);
        parcel.writeByteArray(this.f2264l);
    }

    public C0562n(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2263k = string;
        this.f2264l = parcel.createByteArray();
    }
}
