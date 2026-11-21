package p013b2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.c */
/* loaded from: classes.dex */
public final class C0551c extends AbstractC0558j {
    public static final Parcelable.Creator<C0551c> CREATOR = new C0002c(18);

    /* renamed from: k */
    public final String f2230k;

    /* renamed from: l */
    public final int f2231l;

    /* renamed from: m */
    public final int f2232m;

    /* renamed from: n */
    public final long f2233n;

    /* renamed from: o */
    public final long f2234o;

    /* renamed from: p */
    public final AbstractC0558j[] f2235p;

    public C0551c(String str, int i, int i4, long j, long j8, AbstractC0558j[] abstractC0558jArr) {
        super("CHAP");
        this.f2230k = str;
        this.f2231l = i;
        this.f2232m = i4;
        this.f2233n = j;
        this.f2234o = j8;
        this.f2235p = abstractC0558jArr;
    }

    @Override // p013b2.AbstractC0558j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0551c.class == obj.getClass()) {
            C0551c c0551c = (C0551c) obj;
            if (this.f2231l == c0551c.f2231l && this.f2232m == c0551c.f2232m && this.f2233n == c0551c.f2233n && this.f2234o == c0551c.f2234o) {
                String str = c0551c.f2230k;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(this.f2230k, str) && Arrays.equals(this.f2235p, c0551c.f2235p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f2231l) * 31) + this.f2232m) * 31) + ((int) this.f2233n)) * 31) + ((int) this.f2234o)) * 31;
        String str = this.f2230k;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2230k);
        parcel.writeInt(this.f2231l);
        parcel.writeInt(this.f2232m);
        parcel.writeLong(this.f2233n);
        parcel.writeLong(this.f2234o);
        AbstractC0558j[] abstractC0558jArr = this.f2235p;
        parcel.writeInt(abstractC0558jArr.length);
        for (AbstractC0558j abstractC0558j : abstractC0558jArr) {
            parcel.writeParcelable(abstractC0558j, 0);
        }
    }

    public C0551c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f2230k = string;
        this.f2231l = parcel.readInt();
        this.f2232m = parcel.readInt();
        this.f2233n = parcel.readLong();
        this.f2234o = parcel.readLong();
        int i4 = parcel.readInt();
        this.f2235p = new AbstractC0558j[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            this.f2235p[i8] = (AbstractC0558j) parcel.readParcelable(AbstractC0558j.class.getClassLoader());
        }
    }
}
