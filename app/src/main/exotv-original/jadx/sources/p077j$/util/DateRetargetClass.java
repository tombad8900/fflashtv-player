package p077j$.util;

import androidx.media3.common.C0253x0;
import java.util.Date;
import p077j$.time.Instant;

/* loaded from: classes2.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.f5405c;
        long j = 1000;
        return Instant.m2871w(Math.floorDiv(time, j), ((int) Math.floorMod(time, j)) * C0253x0.CUSTOM_ERROR_CODE_BASE);
    }
}
