package p077j$.time;

import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;

/* renamed from: j$.time.f */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1395f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5492a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f5493b;

    static {
        int[] iArr = new int[EnumC1436b.values().length];
        f5493b = iArr;
        try {
            iArr[EnumC1436b.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5493b[EnumC1436b.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5493b[EnumC1436b.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5493b[EnumC1436b.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5493b[EnumC1436b.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5493b[EnumC1436b.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5493b[EnumC1436b.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5493b[EnumC1436b.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC1435a.values().length];
        f5492a = iArr2;
        try {
            iArr2[EnumC1435a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f5492a[EnumC1435a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f5492a[EnumC1435a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f5492a[EnumC1435a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
