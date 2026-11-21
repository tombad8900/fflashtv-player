package p194w3;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w3.e */
/* loaded from: classes.dex */
public final class C2643e extends ByteArrayOutputStream {

    /* renamed from: j */
    public final /* synthetic */ C2644f f9624j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2643e(C2644f c2644f, int i) {
        super(i);
        this.f9624j = c2644f;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f9624j.f9626k.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
