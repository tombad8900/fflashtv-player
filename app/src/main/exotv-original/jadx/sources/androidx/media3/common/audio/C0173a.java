package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p052f6.AbstractC0983m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.a */
/* loaded from: classes.dex */
public final class C0173a {

    /* renamed from: a */
    public final AbstractC0983m0 f976a;

    /* renamed from: b */
    public final ArrayList f977b = new ArrayList();

    /* renamed from: c */
    public ByteBuffer[] f978c = new ByteBuffer[0];

    /* renamed from: d */
    public boolean f979d;

    public C0173a(AbstractC0983m0 abstractC0983m0) {
        this.f976a = abstractC0983m0;
        C0174b c0174b = C0174b.f980e;
        this.f979d = false;
    }

    /* renamed from: a */
    public final int m594a() {
        return this.f978c.length - 1;
    }

    /* renamed from: b */
    public final boolean m595b() {
        return this.f979d && ((InterfaceC0176d) this.f977b.get(m594a())).isEnded() && !this.f978c[m594a()].hasRemaining();
    }

    /* renamed from: c */
    public final boolean m596c() {
        return !this.f977b.isEmpty();
    }

    /* renamed from: d */
    public final void m597d(ByteBuffer byteBuffer) {
        boolean z7;
        for (boolean z8 = true; z8; z8 = z7) {
            z7 = false;
            int i = 0;
            while (i <= m594a()) {
                if (!this.f978c[i].hasRemaining()) {
                    ArrayList arrayList = this.f977b;
                    InterfaceC0176d interfaceC0176d = (InterfaceC0176d) arrayList.get(i);
                    if (!interfaceC0176d.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f978c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0176d.f985a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC0176d.queueInput(byteBuffer2);
                        this.f978c[i] = interfaceC0176d.getOutput();
                        z7 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f978c[i].hasRemaining();
                    } else if (!this.f978c[i].hasRemaining() && i < m594a()) {
                        ((InterfaceC0176d) arrayList.get(i + 1)).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0173a)) {
            return false;
        }
        AbstractC0983m0 abstractC0983m0 = ((C0173a) obj).f976a;
        AbstractC0983m0 abstractC0983m02 = this.f976a;
        if (abstractC0983m02.size() != abstractC0983m0.size()) {
            return false;
        }
        for (int i = 0; i < abstractC0983m02.size(); i++) {
            if (abstractC0983m02.get(i) != abstractC0983m0.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f976a.hashCode();
    }
}
