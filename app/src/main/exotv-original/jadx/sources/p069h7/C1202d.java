package p069h7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.d */
/* loaded from: classes.dex */
public final class C1202d implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public final CharSequence f5085j;

    /* renamed from: k */
    public int f5086k;

    /* renamed from: l */
    public int f5087l;

    /* renamed from: m */
    public int f5088m;

    /* renamed from: n */
    public int f5089n;

    public C1202d(CharSequence charSequence) {
        AbstractC2980h.m5136e("string", charSequence);
        this.f5085j = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4;
        int i8 = this.f5086k;
        if (i8 != 0) {
            return i8 == 1;
        }
        if (this.f5089n < 0) {
            this.f5086k = 2;
            return false;
        }
        CharSequence charSequence = this.f5085j;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i9 = this.f5087l; i9 < length2; i9++) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i4 = i9 + 1) < charSequence.length() && charSequence.charAt(i4) == '\n') ? 2 : 1;
                length = i9;
                this.f5086k = 1;
                this.f5089n = i;
                this.f5088m = length;
                return true;
            }
        }
        i = -1;
        this.f5086k = 1;
        this.f5089n = i;
        this.f5088m = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5086k = 0;
        int i = this.f5088m;
        int i4 = this.f5087l;
        this.f5087l = this.f5089n + i;
        return this.f5085j.subSequence(i4, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
