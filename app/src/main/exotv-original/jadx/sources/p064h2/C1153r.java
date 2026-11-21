package p064h2;

import p063h1.AbstractC1101a;
import p115n1.C1978h0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.r */
/* loaded from: classes.dex */
public final class C1153r {

    /* renamed from: a */
    public final boolean f4940a;

    /* renamed from: b */
    public final String f4941b;

    /* renamed from: c */
    public final C1978h0 f4942c;

    /* renamed from: d */
    public final int f4943d;

    /* renamed from: e */
    public final byte[] f4944e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1153r(boolean z7, String str, int i, byte[] bArr, int i4, int i8, byte[] bArr2) {
        char c8 = 0;
        int i9 = 1;
        AbstractC1101a.m2353d((i == 0) ^ (bArr2 == null));
        this.f4940a = z7;
        this.f4941b = str;
        this.f4943d = i;
        this.f4944e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        c8 = '\uffff';
                        break;
                    }
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                case 1:
                    i9 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    AbstractC1101a.m2348F("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f4942c = new C1978h0(i9, i4, i8, bArr);
    }
}
