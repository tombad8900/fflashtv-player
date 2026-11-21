package p077j$.time;

import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;

/* renamed from: j$.time.v */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1458v {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5633a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f5634b;

    static {
        int[] iArr = new int[EnumC1436b.values().length];
        f5634b = iArr;
        try {
            iArr[EnumC1436b.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5634b[EnumC1436b.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5634b[EnumC1436b.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5634b[EnumC1436b.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5634b[EnumC1436b.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC1435a.values().length];
        f5633a = iArr2;
        try {
            iArr2[EnumC1435a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5633a[EnumC1435a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5633a[EnumC1435a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
