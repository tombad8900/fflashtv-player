package p077j$.time.chrono;

import p077j$.time.temporal.EnumC1436b;

/* renamed from: j$.time.chrono.e */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1364e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5432a;

    static {
        int[] iArr = new int[EnumC1436b.values().length];
        f5432a = iArr;
        try {
            iArr[EnumC1436b.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5432a[EnumC1436b.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5432a[EnumC1436b.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5432a[EnumC1436b.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5432a[EnumC1436b.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5432a[EnumC1436b.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5432a[EnumC1436b.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
