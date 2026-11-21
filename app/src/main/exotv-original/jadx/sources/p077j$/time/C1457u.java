package p077j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;
import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.u */
/* loaded from: classes2.dex */
public final class C1457u implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a */
    public byte f5631a;

    /* renamed from: b */
    public Object f5632b;

    public C1457u() {
    }

    public C1457u(byte b7, Object obj) {
        this.f5631a = b7;
        this.f5632b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b7 = this.f5631a;
        Object obj = this.f5632b;
        objectOutput.writeByte(b7);
        switch (b7) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f5403a);
                objectOutput.writeInt(duration.f5404b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f5406a);
                objectOutput.writeInt(instant.f5407b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f5410a);
                objectOutput.writeByte(localDate.f5411b);
                objectOutput.writeByte(localDate.f5412c);
                return;
            case 4:
                ((C1426l) obj).m3079h0(objectOutput);
                return;
            case 5:
                C1424j c1424j = (C1424j) obj;
                LocalDate localDate2 = c1424j.f5570a;
                objectOutput.writeInt(localDate2.f5410a);
                objectOutput.writeByte(localDate2.f5411b);
                objectOutput.writeByte(localDate2.f5412c);
                c1424j.f5571b.m3079h0(objectOutput);
                return;
            case 6:
                C1393d0 c1393d0 = (C1393d0) obj;
                C1424j c1424j2 = c1393d0.f5487a;
                LocalDate localDate3 = c1424j2.f5570a;
                objectOutput.writeInt(localDate3.f5410a);
                objectOutput.writeByte(localDate3.f5411b);
                objectOutput.writeByte(localDate3.f5412c);
                c1424j2.f5571b.m3079h0(objectOutput);
                c1393d0.f5488b.m2919b0(objectOutput);
                c1393d0.f5489c.mo2918P(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C1353b0) obj).f5422b);
                return;
            case 8:
                ((C1351a0) obj).m2919b0(objectOutput);
                return;
            case 9:
                C1433s c1433s = (C1433s) obj;
                c1433s.f5594a.m3079h0(objectOutput);
                c1433s.f5595b.m2919b0(objectOutput);
                return;
            case 10:
                C1432r c1432r = (C1432r) obj;
                C1424j c1424j3 = c1432r.f5591a;
                LocalDate localDate4 = c1424j3.f5570a;
                objectOutput.writeInt(localDate4.f5410a);
                objectOutput.writeByte(localDate4.f5411b);
                objectOutput.writeByte(localDate4.f5412c);
                c1424j3.f5571b.m3079h0(objectOutput);
                c1432r.f5592b.m2919b0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C1459w) obj).f5636a);
                return;
            case 12:
                C1461y c1461y = (C1461y) obj;
                objectOutput.writeInt(c1461y.f5640a);
                objectOutput.writeByte(c1461y.f5641b);
                return;
            case 13:
                C1430p c1430p = (C1430p) obj;
                objectOutput.writeByte(c1430p.f5587a);
                objectOutput.writeByte(c1430p.f5588b);
                return;
            case 14:
                C1434t c1434t = (C1434t) obj;
                objectOutput.writeInt(c1434t.f5597a);
                objectOutput.writeInt(c1434t.f5598b);
                objectOutput.writeInt(c1434t.f5599c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b7 = objectInput.readByte();
        this.f5631a = b7;
        this.f5632b = m3110a(b7, objectInput);
    }

    /* renamed from: a */
    public static Object m3110a(byte b7, ObjectInput objectInput) throws IOException {
        switch (b7) {
            case 1:
                Duration duration = Duration.f5402c;
                long j = objectInput.readLong();
                long j8 = objectInput.readInt();
                return Duration.m2867A(Math.addExact(j, Math.floorDiv(j8, 1000000000L)), (int) Math.floorMod(j8, 1000000000L));
            case 2:
                Instant instant = Instant.f5405c;
                return Instant.m2870A(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.f5408d;
                return LocalDate.m2886b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C1426l.m3068c0(objectInput);
            case 5:
                C1424j c1424j = C1424j.f5568c;
                LocalDate localDate2 = LocalDate.f5408d;
                return C1424j.m3055I(LocalDate.m2886b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C1426l.m3068c0(objectInput));
            case 6:
                C1424j c1424j2 = C1424j.f5568c;
                LocalDate localDate3 = LocalDate.f5408d;
                C1424j c1424jM3055I = C1424j.m3055I(LocalDate.m2886b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C1426l.m3068c0(objectInput));
                C1351a0 c1351a0M2917a0 = C1351a0.m2917a0(objectInput);
                AbstractC1462z abstractC1462z = (AbstractC1462z) m3110a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(abstractC1462z, "zone");
                if (!(abstractC1462z instanceof C1351a0) || c1351a0M2917a0.equals(abstractC1462z)) {
                    return new C1393d0(c1424jM3055I, abstractC1462z, c1351a0M2917a0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C1353b0.f5421d;
                return AbstractC1462z.m3121A(objectInput.readUTF(), false);
            case 8:
                return C1351a0.m2917a0(objectInput);
            case 9:
                int i4 = C1433s.f5593c;
                return new C1433s(C1426l.m3068c0(objectInput), C1351a0.m2917a0(objectInput));
            case 10:
                int i8 = C1432r.f5590c;
                LocalDate localDate4 = LocalDate.f5408d;
                return new C1432r(C1424j.m3055I(LocalDate.m2886b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C1426l.m3068c0(objectInput)), C1351a0.m2917a0(objectInput));
            case 11:
                int i9 = C1459w.f5635b;
                return C1459w.m3111w(objectInput.readInt());
            case 12:
                int i10 = C1461y.f5639c;
                int i11 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                EnumC1435a.YEAR.m3094X(i11);
                EnumC1435a.MONTH_OF_YEAR.m3094X(b8);
                return new C1461y(i11, b8);
            case 13:
                int i12 = C1430p.f5586c;
                byte b9 = objectInput.readByte();
                byte b10 = objectInput.readByte();
                EnumC1428n enumC1428nM3081I = EnumC1428n.m3081I(b9);
                Objects.requireNonNull(enumC1428nM3081I, "month");
                EnumC1435a.DAY_OF_MONTH.m3094X(b10);
                if (b10 <= enumC1428nM3081I.m3083F()) {
                    return new C1430p(enumC1428nM3081I.getValue(), b10);
                }
                throw new C1354c("Illegal value for DayOfMonth field, value " + ((int) b10) + " is not valid for month " + enumC1428nM3081I.name());
            case 14:
                C1434t c1434t = C1434t.f5596d;
                return C1434t.m3089a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f5632b;
    }
}
