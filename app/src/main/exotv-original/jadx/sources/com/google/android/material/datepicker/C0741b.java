package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0741b implements Parcelable {
    public static final Parcelable.Creator<C0741b> CREATOR = new C0634d(1);

    /* renamed from: j */
    public final C0761s f3228j;

    /* renamed from: k */
    public final C0761s f3229k;

    /* renamed from: l */
    public final C0743c f3230l;

    /* renamed from: m */
    public final C0761s f3231m;

    /* renamed from: n */
    public final int f3232n;

    /* renamed from: o */
    public final int f3233o;

    /* renamed from: p */
    public final int f3234p;

    public C0741b(C0761s c0761s, C0761s c0761s2, C0743c c0743c, C0761s c0761s3, int i) {
        Objects.requireNonNull(c0761s, "start cannot be null");
        Objects.requireNonNull(c0761s2, "end cannot be null");
        Objects.requireNonNull(c0743c, "validator cannot be null");
        this.f3228j = c0761s;
        this.f3229k = c0761s2;
        this.f3231m = c0761s3;
        this.f3232n = i;
        this.f3230l = c0743c;
        if (c0761s3 != null && c0761s.f3306j.compareTo(c0761s3.f3306j) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0761s3 != null && c0761s3.f3306j.compareTo(c0761s2.f3306j) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC0742b0.m1847c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f3234p = c0761s.m1865d(c0761s2) + 1;
        this.f3233o = (c0761s2.f3308l - c0761s.f3308l) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0741b)) {
            return false;
        }
        C0741b c0741b = (C0741b) obj;
        return this.f3228j.equals(c0741b.f3228j) && this.f3229k.equals(c0741b.f3229k) && Objects.equals(this.f3231m, c0741b.f3231m) && this.f3232n == c0741b.f3232n && this.f3230l.equals(c0741b.f3230l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3228j, this.f3229k, this.f3231m, Integer.valueOf(this.f3232n), this.f3230l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3228j, 0);
        parcel.writeParcelable(this.f3229k, 0);
        parcel.writeParcelable(this.f3231m, 0);
        parcel.writeParcelable(this.f3230l, 0);
        parcel.writeInt(this.f3232n);
    }
}
