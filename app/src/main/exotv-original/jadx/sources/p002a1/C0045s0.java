package p002a1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.s0 */
/* loaded from: classes.dex */
public final class C0045s0 implements Parcelable {
    public static final Parcelable.Creator<C0045s0> CREATOR = new C0002c(5);

    /* renamed from: j */
    public final String f177j;

    /* renamed from: k */
    public final String f178k;

    /* renamed from: l */
    public final boolean f179l;

    /* renamed from: m */
    public final int f180m;

    /* renamed from: n */
    public final int f181n;

    /* renamed from: o */
    public final String f182o;

    /* renamed from: p */
    public final boolean f183p;

    /* renamed from: q */
    public final boolean f184q;

    /* renamed from: r */
    public final boolean f185r;

    /* renamed from: s */
    public final Bundle f186s;

    /* renamed from: t */
    public final boolean f187t;

    /* renamed from: u */
    public final int f188u;

    /* renamed from: v */
    public Bundle f189v;

    public C0045s0(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        this.f177j = abstractComponentCallbacksC0050v.getClass().getName();
        this.f178k = abstractComponentCallbacksC0050v.f240n;
        this.f179l = abstractComponentCallbacksC0050v.f248v;
        this.f180m = abstractComponentCallbacksC0050v.f213E;
        this.f181n = abstractComponentCallbacksC0050v.f214F;
        this.f182o = abstractComponentCallbacksC0050v.f215G;
        this.f183p = abstractComponentCallbacksC0050v.f218J;
        this.f184q = abstractComponentCallbacksC0050v.f247u;
        this.f185r = abstractComponentCallbacksC0050v.f217I;
        this.f186s = abstractComponentCallbacksC0050v.f241o;
        this.f187t = abstractComponentCallbacksC0050v.f216H;
        this.f188u = abstractComponentCallbacksC0050v.f229U.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f177j);
        sb.append(" (");
        sb.append(this.f178k);
        sb.append(")}:");
        if (this.f179l) {
            sb.append(" fromLayout");
        }
        int i = this.f181n;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f182o;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f183p) {
            sb.append(" retainInstance");
        }
        if (this.f184q) {
            sb.append(" removing");
        }
        if (this.f185r) {
            sb.append(" detached");
        }
        if (this.f187t) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f177j);
        parcel.writeString(this.f178k);
        parcel.writeInt(this.f179l ? 1 : 0);
        parcel.writeInt(this.f180m);
        parcel.writeInt(this.f181n);
        parcel.writeString(this.f182o);
        parcel.writeInt(this.f183p ? 1 : 0);
        parcel.writeInt(this.f184q ? 1 : 0);
        parcel.writeInt(this.f185r ? 1 : 0);
        parcel.writeBundle(this.f186s);
        parcel.writeInt(this.f187t ? 1 : 0);
        parcel.writeBundle(this.f189v);
        parcel.writeInt(this.f188u);
    }

    public C0045s0(Parcel parcel) {
        this.f177j = parcel.readString();
        this.f178k = parcel.readString();
        this.f179l = parcel.readInt() != 0;
        this.f180m = parcel.readInt();
        this.f181n = parcel.readInt();
        this.f182o = parcel.readString();
        this.f183p = parcel.readInt() != 0;
        this.f184q = parcel.readInt() != 0;
        this.f185r = parcel.readInt() != 0;
        this.f186s = parcel.readBundle();
        this.f187t = parcel.readInt() != 0;
        this.f189v = parcel.readBundle();
        this.f188u = parcel.readInt();
    }
}
