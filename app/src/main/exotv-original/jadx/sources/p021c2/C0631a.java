package p021c2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.common.InterfaceC0238s0;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c2.a */
/* loaded from: classes.dex */
public final class C0631a implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C0631a> CREATOR = new C0002c(27);

    /* renamed from: j */
    public final long f2513j;

    /* renamed from: k */
    public final long f2514k;

    /* renamed from: l */
    public final long f2515l;

    /* renamed from: m */
    public final long f2516m;

    /* renamed from: n */
    public final long f2517n;

    public C0631a(long j, long j8, long j9, long j10, long j11) {
        this.f2513j = j;
        this.f2514k = j8;
        this.f2515l = j9;
        this.f2516m = j10;
        this.f2517n = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0631a.class == obj.getClass()) {
            C0631a c0631a = (C0631a) obj;
            if (this.f2513j == c0631a.f2513j && this.f2514k == c0631a.f2514k && this.f2515l == c0631a.f2515l && this.f2516m == c0631a.f2516m && this.f2517n == c0631a.f2517n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0120b.m428x(this.f2517n) + ((AbstractC0120b.m428x(this.f2516m) + ((AbstractC0120b.m428x(this.f2515l) + ((AbstractC0120b.m428x(this.f2514k) + ((AbstractC0120b.m428x(this.f2513j) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f2513j + ", photoSize=" + this.f2514k + ", photoPresentationTimestampUs=" + this.f2515l + ", videoStartPosition=" + this.f2516m + ", videoSize=" + this.f2517n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2513j);
        parcel.writeLong(this.f2514k);
        parcel.writeLong(this.f2515l);
        parcel.writeLong(this.f2516m);
        parcel.writeLong(this.f2517n);
    }

    public C0631a(Parcel parcel) {
        this.f2513j = parcel.readLong();
        this.f2514k = parcel.readLong();
        this.f2515l = parcel.readLong();
        this.f2516m = parcel.readLong();
        this.f2517n = parcel.readLong();
    }
}
