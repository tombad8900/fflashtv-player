package p075i6;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i6.c */
/* loaded from: classes.dex */
public abstract class AbstractC1276c {

    /* renamed from: a */
    public static final byte[] f5304a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i4 = 0; i4 < 26; i4++) {
            byte b7 = (byte) (i4 + 10);
            bArr[i4 + 65] = b7;
            bArr[i4 + 97] = b7;
        }
        f5304a = bArr;
    }
}
