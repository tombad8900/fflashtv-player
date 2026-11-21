package p031d2;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.h */
/* loaded from: classes.dex */
public final class C0806h {

    /* renamed from: a */
    public final long f3607a;

    /* renamed from: b */
    public final boolean f3608b;

    /* renamed from: c */
    public final boolean f3609c;

    /* renamed from: d */
    public final boolean f3610d;

    /* renamed from: e */
    public final long f3611e;

    /* renamed from: f */
    public final List f3612f;

    /* renamed from: g */
    public final boolean f3613g;

    /* renamed from: h */
    public final long f3614h;

    /* renamed from: i */
    public final int f3615i;

    /* renamed from: j */
    public final int f3616j;

    /* renamed from: k */
    public final int f3617k;

    public C0806h(long j, boolean z7, boolean z8, boolean z9, ArrayList arrayList, long j8, boolean z10, long j9, int i, int i4, int i8) {
        this.f3607a = j;
        this.f3608b = z7;
        this.f3609c = z8;
        this.f3610d = z9;
        this.f3612f = Collections.unmodifiableList(arrayList);
        this.f3611e = j8;
        this.f3613g = z10;
        this.f3614h = j9;
        this.f3615i = i;
        this.f3616j = i4;
        this.f3617k = i8;
    }

    public C0806h(Parcel parcel) {
        this.f3607a = parcel.readLong();
        this.f3608b = parcel.readByte() == 1;
        this.f3609c = parcel.readByte() == 1;
        this.f3610d = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(new C0805g(parcel.readInt(), parcel.readLong()));
        }
        this.f3612f = Collections.unmodifiableList(arrayList);
        this.f3611e = parcel.readLong();
        this.f3613g = parcel.readByte() == 1;
        this.f3614h = parcel.readLong();
        this.f3615i = parcel.readInt();
        this.f3616j = parcel.readInt();
        this.f3617k = parcel.readInt();
    }
}
