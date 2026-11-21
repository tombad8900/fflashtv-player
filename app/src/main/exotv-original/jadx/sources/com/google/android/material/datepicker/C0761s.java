package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p021c2.C0634d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes.dex */
public final class C0761s implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0761s> CREATOR = new C0634d(3);

    /* renamed from: j */
    public final Calendar f3306j;

    /* renamed from: k */
    public final int f3307k;

    /* renamed from: l */
    public final int f3308l;

    /* renamed from: m */
    public final int f3309m;

    /* renamed from: n */
    public final int f3310n;

    /* renamed from: o */
    public final long f3311o;

    /* renamed from: p */
    public String f3312p;

    public C0761s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM1845a = AbstractC0742b0.m1845a(calendar);
        this.f3306j = calendarM1845a;
        this.f3307k = calendarM1845a.get(2);
        this.f3308l = calendarM1845a.get(1);
        this.f3309m = calendarM1845a.getMaximum(7);
        this.f3310n = calendarM1845a.getActualMaximum(5);
        this.f3311o = calendarM1845a.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0761s m1862a(int i, int i4) {
        Calendar calendarM1847c = AbstractC0742b0.m1847c(null);
        calendarM1847c.set(1, i);
        calendarM1847c.set(2, i4);
        return new C0761s(calendarM1847c);
    }

    /* renamed from: b */
    public static C0761s m1863b(long j) {
        Calendar calendarM1847c = AbstractC0742b0.m1847c(null);
        calendarM1847c.setTimeInMillis(j);
        return new C0761s(calendarM1847c);
    }

    /* renamed from: c */
    public final String m1864c() {
        if (this.f3312p == null) {
            long timeInMillis = this.f3306j.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0742b0.f3235a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f3312p = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f3312p;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3306j.compareTo(((C0761s) obj).f3306j);
    }

    /* renamed from: d */
    public final int m1865d(C0761s c0761s) {
        if (!(this.f3306j instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0761s.f3307k - this.f3307k) + ((c0761s.f3308l - this.f3308l) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0761s)) {
            return false;
        }
        C0761s c0761s = (C0761s) obj;
        return this.f3307k == c0761s.f3307k && this.f3308l == c0761s.f3308l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3307k), Integer.valueOf(this.f3308l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3308l);
        parcel.writeInt(this.f3307k);
    }
}
