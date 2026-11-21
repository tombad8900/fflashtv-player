package p077j$.time.chrono;

import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.chrono.n */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1379n {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5453a;

    static {
        int[] iArr = new int[EnumC1435a.values().length];
        f5453a = iArr;
        try {
            iArr[EnumC1435a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5453a[EnumC1435a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5453a[EnumC1435a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5453a[EnumC1435a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5453a[EnumC1435a.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5453a[EnumC1435a.ERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
