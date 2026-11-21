package p005a4;

import java.io.IOException;
import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.z */
/* loaded from: classes.dex */
public final class C0105z implements Appendable {

    /* renamed from: j */
    public final Appendable f498j;

    /* renamed from: k */
    public boolean f499k = true;

    public C0105z(Appendable appendable) {
        this.f498j = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c8) throws IOException {
        boolean z7 = this.f499k;
        Appendable appendable = this.f498j;
        if (z7) {
            this.f499k = false;
            appendable.append("  ");
        }
        this.f499k = c8 == '\n';
        appendable.append(c8);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = C2181z.FRAGMENT_ENCODE_SET;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) throws IOException {
        if (charSequence == null) {
            charSequence = C2181z.FRAGMENT_ENCODE_SET;
        }
        boolean z7 = this.f499k;
        Appendable appendable = this.f498j;
        boolean z8 = false;
        if (z7) {
            this.f499k = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i4 - 1) == '\n') {
            z8 = true;
        }
        this.f499k = z8;
        appendable.append(charSequence, i, i4);
        return this;
    }
}
