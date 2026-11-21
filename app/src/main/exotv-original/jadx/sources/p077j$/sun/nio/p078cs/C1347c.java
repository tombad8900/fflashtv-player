package p077j$.sun.nio.p078cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* renamed from: j$.sun.nio.cs.c */
/* loaded from: classes2.dex */
public final class C1347c extends Charset {

    /* renamed from: a */
    public static final C1347c f5398a;

    static {
        int i = AbstractC1348d.f5399a;
        f5398a = new C1347c("ISO-8859-1", new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"});
    }

    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return charset instanceof C1347c;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new C1345a(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new C1346b(this);
    }
}
