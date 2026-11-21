package p208y1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y1.c */
/* loaded from: classes.dex */
public final class C2795c {

    /* renamed from: a */
    public final ByteArrayOutputStream f10410a;

    /* renamed from: b */
    public final DataOutputStream f10411b;

    public C2795c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f10410a = byteArrayOutputStream;
        this.f10411b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public final byte[] m4906a(C2793a c2793a) throws IOException {
        DataOutputStream dataOutputStream = this.f10411b;
        ByteArrayOutputStream byteArrayOutputStream = this.f10410a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(c2793a.f10404j);
            dataOutputStream.writeByte(0);
            String str = c2793a.f10405k;
            if (str == null) {
                str = C2181z.FRAGMENT_ENCODE_SET;
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c2793a.f10406l);
            dataOutputStream.writeLong(c2793a.f10407m);
            dataOutputStream.write(c2793a.f10408n);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
