package p077j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import p077j$.time.zone.C1468f;
import p077j$.time.zone.C1469g;
import p077j$.time.zone.C1471i;

/* renamed from: j$.time.b0 */
/* loaded from: classes2.dex */
public final class C1353b0 extends AbstractC1462z {

    /* renamed from: d */
    public static final /* synthetic */ int f5421d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b */
    public final String f5422b;

    /* renamed from: c */
    public final transient C1468f f5423c;

    /* renamed from: V */
    public static C1353b0 m2924V(String str, boolean z7) {
        C1468f c1468fM3138a;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                    throw new C1354c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c1468fM3138a = C1471i.m3138a(str);
            } catch (C1469g e) {
                if (z7) {
                    throw e;
                }
                c1468fM3138a = null;
            }
            return new C1353b0(str, c1468fM3138a);
        }
        throw new C1354c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C1353b0(String str, C1468f c1468f) {
        this.f5422b = str;
        this.f5423c = c1468f;
    }

    @Override // p077j$.time.AbstractC1462z
    /* renamed from: q */
    public final String mo2920q() {
        return this.f5422b;
    }

    @Override // p077j$.time.AbstractC1462z
    /* renamed from: w */
    public final C1468f mo2921w() {
        C1468f c1468f = this.f5423c;
        return c1468f != null ? c1468f : C1471i.m3138a(this.f5422b);
    }

    private Object writeReplace() {
        return new C1457u((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p077j$.time.AbstractC1462z
    /* renamed from: P */
    public final void mo2918P(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f5422b);
    }
}
