package p077j$.time.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1426l;
import p077j$.time.LocalDate;
import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.chrono.e0 */
/* loaded from: classes2.dex */
public final class C1365e0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a */
    public byte f5433a;

    /* renamed from: b */
    public Object f5434b;

    public C1365e0() {
    }

    public C1365e0(byte b7, Object obj) {
        this.f5433a = b7;
        this.f5434b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b7 = this.f5433a;
        Object obj = this.f5434b;
        objectOutput.writeByte(b7);
        switch (b7) {
            case 1:
                objectOutput.writeUTF(((AbstractC1356a) obj).mo2939q());
                return;
            case 2:
                C1366f c1366f = (C1366f) obj;
                objectOutput.writeObject(c1366f.f5435a);
                objectOutput.writeObject(c1366f.f5436b);
                return;
            case 3:
                C1376k c1376k = (C1376k) obj;
                objectOutput.writeObject(c1376k.f5450a);
                objectOutput.writeObject(c1376k.f5451b);
                objectOutput.writeObject(c1376k.f5452c);
                return;
            case 4:
                C1389x c1389x = (C1389x) obj;
                c1389x.getClass();
                objectOutput.writeInt(c1389x.mo2878f(EnumC1435a.YEAR));
                objectOutput.writeByte(c1389x.mo2878f(EnumC1435a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1389x.mo2878f(EnumC1435a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C1390y) obj).f5483a);
                return;
            case 6:
                C1382q c1382q = (C1382q) obj;
                objectOutput.writeObject(c1382q.f5465a);
                objectOutput.writeInt(c1382q.mo2878f(EnumC1435a.YEAR));
                objectOutput.writeByte(c1382q.mo2878f(EnumC1435a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1382q.mo2878f(EnumC1435a.DAY_OF_MONTH));
                return;
            case 7:
                C1361c0 c1361c0 = (C1361c0) obj;
                c1361c0.getClass();
                objectOutput.writeInt(c1361c0.mo2878f(EnumC1435a.YEAR));
                objectOutput.writeByte(c1361c0.mo2878f(EnumC1435a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1361c0.mo2878f(EnumC1435a.DAY_OF_MONTH));
                return;
            case 8:
                C1373i0 c1373i0 = (C1373i0) obj;
                c1373i0.getClass();
                objectOutput.writeInt(c1373i0.mo2878f(EnumC1435a.YEAR));
                objectOutput.writeByte(c1373i0.mo2878f(EnumC1435a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1373i0.mo2878f(EnumC1435a.DAY_OF_MONTH));
                return;
            case 9:
                C1368g c1368g = (C1368g) obj;
                objectOutput.writeUTF(c1368g.f5439a.mo2939q());
                objectOutput.writeInt(c1368g.f5440b);
                objectOutput.writeInt(c1368g.f5441c);
                objectOutput.writeInt(c1368g.f5442d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM2979of;
        byte b7 = objectInput.readByte();
        this.f5433a = b7;
        switch (b7) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC1356a.f5425a;
                objM2979of = InterfaceC1377l.m2979of(objectInput.readUTF());
                break;
            case 2:
                objM2979of = ((ChronoLocalDate) objectInput.readObject()).mo2892L((C1426l) objectInput.readObject());
                break;
            case 3:
                objM2979of = ((InterfaceC1362d) objectInput.readObject()).mo2951E((C1351a0) objectInput.readObject()).mo2962D((AbstractC1462z) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = C1389x.f5477d;
                int i = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                C1387v.f5475c.getClass();
                objM2979of = new C1389x(LocalDate.m2886b0(i, b8, b9));
                break;
            case 5:
                C1390y c1390y = C1390y.f5481d;
                objM2979of = C1390y.m2999r(objectInput.readByte());
                break;
            case 6:
                C1380o c1380o = (C1380o) objectInput.readObject();
                int i4 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                c1380o.getClass();
                objM2979of = new C1382q(c1380o, i4, b10, b11);
                break;
            case 7:
                int i8 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                C1357a0.f5427c.getClass();
                objM2979of = new C1361c0(LocalDate.m2886b0(i8 + 1911, b12, b13));
                break;
            case 8:
                int i9 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                C1369g0.f5443c.getClass();
                objM2979of = new C1373i0(LocalDate.m2886b0(i9 - 543, b14, b15));
                break;
            case 9:
                int i10 = C1368g.f5438e;
                objM2979of = new C1368g(InterfaceC1377l.m2979of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f5434b = objM2979of;
    }

    private Object readResolve() {
        return this.f5434b;
    }
}
