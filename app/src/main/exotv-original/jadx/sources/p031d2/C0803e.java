package p031d2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.e */
/* loaded from: classes.dex */
public final class C0803e extends AbstractC0800b {
    public static final Parcelable.Creator<C0803e> CREATOR = new C0634d(6);

    /* renamed from: j */
    public final long f3592j;

    /* renamed from: k */
    public final boolean f3593k;

    /* renamed from: l */
    public final boolean f3594l;

    /* renamed from: m */
    public final boolean f3595m;

    /* renamed from: n */
    public final boolean f3596n;

    /* renamed from: o */
    public final long f3597o;

    /* renamed from: p */
    public final long f3598p;

    /* renamed from: q */
    public final List f3599q;

    /* renamed from: r */
    public final boolean f3600r;

    /* renamed from: s */
    public final long f3601s;

    /* renamed from: t */
    public final int f3602t;

    /* renamed from: u */
    public final int f3603u;

    /* renamed from: v */
    public final int f3604v;

    public C0803e(long j, boolean z7, boolean z8, boolean z9, boolean z10, long j8, long j9, List list, boolean z11, long j10, int i, int i4, int i8) {
        this.f3592j = j;
        this.f3593k = z7;
        this.f3594l = z8;
        this.f3595m = z9;
        this.f3596n = z10;
        this.f3597o = j8;
        this.f3598p = j9;
        this.f3599q = Collections.unmodifiableList(list);
        this.f3600r = z11;
        this.f3601s = j10;
        this.f3602t = i;
        this.f3603u = i4;
        this.f3604v = i8;
    }

    @Override // p031d2.AbstractC0800b
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f3597o + ", programSplicePlaybackPositionUs= " + this.f3598p + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3592j);
        parcel.writeByte(this.f3593k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3594l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3595m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3596n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3597o);
        parcel.writeLong(this.f3598p);
        List list = this.f3599q;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            C0802d c0802d = (C0802d) list.get(i4);
            parcel.writeInt(c0802d.f3589a);
            parcel.writeLong(c0802d.f3590b);
            parcel.writeLong(c0802d.f3591c);
        }
        parcel.writeByte(this.f3600r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3601s);
        parcel.writeInt(this.f3602t);
        parcel.writeInt(this.f3603u);
        parcel.writeInt(this.f3604v);
    }

    public C0803e(Parcel parcel) {
        this.f3592j = parcel.readLong();
        this.f3593k = parcel.readByte() == 1;
        this.f3594l = parcel.readByte() == 1;
        this.f3595m = parcel.readByte() == 1;
        this.f3596n = parcel.readByte() == 1;
        this.f3597o = parcel.readLong();
        this.f3598p = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(new C0802d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f3599q = Collections.unmodifiableList(arrayList);
        this.f3600r = parcel.readByte() == 1;
        this.f3601s = parcel.readLong();
        this.f3602t = parcel.readInt();
        this.f3603u = parcel.readInt();
        this.f3604v = parcel.readInt();
    }
}
