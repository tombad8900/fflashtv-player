package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import java.util.Arrays;
import java.util.List;
import okhttp3.C2181z;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.t0 */
/* loaded from: classes.dex */
public final class C0241t0 implements Parcelable {
    public static final Parcelable.Creator<C0241t0> CREATOR = new C0002c(14);

    /* renamed from: j */
    public final InterfaceC0238s0[] f1412j;

    /* renamed from: k */
    public final long f1413k;

    public C0241t0(InterfaceC0238s0... interfaceC0238s0Arr) {
        this(-9223372036854775807L, interfaceC0238s0Arr);
    }

    /* renamed from: a */
    public final C0241t0 m668a(InterfaceC0238s0... interfaceC0238s0Arr) {
        if (interfaceC0238s0Arr.length == 0) {
            return this;
        }
        int i = AbstractC1118i0.f4750a;
        InterfaceC0238s0[] interfaceC0238s0Arr2 = this.f1412j;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC0238s0Arr2, interfaceC0238s0Arr2.length + interfaceC0238s0Arr.length);
        System.arraycopy(interfaceC0238s0Arr, 0, objArrCopyOf, interfaceC0238s0Arr2.length, interfaceC0238s0Arr.length);
        return new C0241t0(this.f1413k, (InterfaceC0238s0[]) objArrCopyOf);
    }

    /* renamed from: b */
    public final C0241t0 m669b(C0241t0 c0241t0) {
        return c0241t0 == null ? this : m668a(c0241t0.f1412j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0241t0.class == obj.getClass()) {
            C0241t0 c0241t0 = (C0241t0) obj;
            if (Arrays.equals(this.f1412j, c0241t0.f1412j) && this.f1413k == c0241t0.f1413k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0120b.m428x(this.f1413k) + (Arrays.hashCode(this.f1412j) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1412j));
        long j = this.f1413k;
        if (j == -9223372036854775807L) {
            str = C2181z.FRAGMENT_ENCODE_SET;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC0238s0[] interfaceC0238s0Arr = this.f1412j;
        parcel.writeInt(interfaceC0238s0Arr.length);
        for (InterfaceC0238s0 interfaceC0238s0 : interfaceC0238s0Arr) {
            parcel.writeParcelable(interfaceC0238s0, 0);
        }
        parcel.writeLong(this.f1413k);
    }

    public C0241t0(long j, InterfaceC0238s0... interfaceC0238s0Arr) {
        this.f1413k = j;
        this.f1412j = interfaceC0238s0Arr;
    }

    public C0241t0(List list) {
        this((InterfaceC0238s0[]) list.toArray(new InterfaceC0238s0[0]));
    }

    public C0241t0(Parcel parcel) {
        this.f1412j = new InterfaceC0238s0[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0238s0[] interfaceC0238s0Arr = this.f1412j;
            if (i < interfaceC0238s0Arr.length) {
                interfaceC0238s0Arr[i] = (InterfaceC0238s0) parcel.readParcelable(InterfaceC0238s0.class.getClassLoader());
                i++;
            } else {
                this.f1413k = parcel.readLong();
                return;
            }
        }
    }
}
