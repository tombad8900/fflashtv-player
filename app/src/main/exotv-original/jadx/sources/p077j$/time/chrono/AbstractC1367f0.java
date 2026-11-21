package p077j$.time.chrono;

import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.chrono.f0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1367f0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5437a;

    static {
        int[] iArr = new int[EnumC1435a.values().length];
        f5437a = iArr;
        try {
            iArr[EnumC1435a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5437a[EnumC1435a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5437a[EnumC1435a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
