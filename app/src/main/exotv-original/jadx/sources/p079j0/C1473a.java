package p079j0;

import java.util.Comparator;
import p098l2.C1654d;
import p159s2.C2343c;
import p159s2.C2344d;
import p193w2.C2604b0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1473a implements Comparator {

    /* renamed from: j */
    public final /* synthetic */ int f5683j;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5683j) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b7 = bArr[i];
                    byte b8 = bArr2[i];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
            case 1:
                return Integer.compare(((C1654d) obj2).f6327b, ((C1654d) obj).f6327b);
            case 2:
                return Integer.compare(((C2344d) obj).f8236a.f8239b, ((C2344d) obj2).f8236a.f8239b);
            case 3:
                return Long.compare(((C2343c) obj).f8233b, ((C2343c) obj2).f8233b);
            case 4:
                C2604b0 c2604b0 = (C2604b0) obj;
                C2604b0 c2604b02 = (C2604b0) obj2;
                int iCompare = Integer.compare(c2604b02.f9362b, c2604b0.f9362b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = c2604b0.f9363c.compareTo(c2604b02.f9363c);
                return iCompareTo != 0 ? iCompareTo : c2604b0.f9364d.compareTo(c2604b02.f9364d);
            default:
                C2604b0 c2604b03 = (C2604b0) obj;
                C2604b0 c2604b04 = (C2604b0) obj2;
                int iCompare2 = Integer.compare(c2604b04.f9361a, c2604b03.f9361a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = c2604b04.f9363c.compareTo(c2604b03.f9363c);
                return iCompareTo2 != 0 ? iCompareTo2 : c2604b04.f9364d.compareTo(c2604b03.f9364d);
        }
    }
}
