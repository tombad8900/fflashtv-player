package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;
import p077j$.util.DesugarTimeZone;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC0742b0 {

    /* renamed from: a */
    public static final AtomicReference f3235a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m1845a(Calendar calendar) {
        Calendar calendarM1847c = m1847c(calendar);
        Calendar calendarM1847c2 = m1847c(null);
        calendarM1847c2.set(calendarM1847c.get(1), calendarM1847c.get(2), calendarM1847c.get(5));
        return calendarM1847c2;
    }

    /* renamed from: b */
    public static Calendar m1846b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m1847c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
