package p043e6;

import com.bumptech.glide.AbstractC0714c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002a1.C0036o;
import p005a4.C0094o;
import p156s.AbstractC2334g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e6.h */
/* loaded from: classes.dex */
public final class C0920h implements Iterator {

    /* renamed from: k */
    public String f3972k;

    /* renamed from: l */
    public final CharSequence f3973l;

    /* renamed from: m */
    public final AbstractC0913a f3974m;

    /* renamed from: o */
    public int f3976o;

    /* renamed from: p */
    public final /* synthetic */ C0036o f3977p;

    /* renamed from: j */
    public int f3971j = 2;

    /* renamed from: n */
    public int f3975n = 0;

    public C0920h(C0036o c0036o, C0094o c0094o, CharSequence charSequence) {
        this.f3977p = c0036o;
        this.f3974m = (AbstractC0913a) c0094o.f441k;
        this.f3976o = c0094o.f440j;
        this.f3973l = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC0913a abstractC0913a;
        int i = this.f3971j;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iM4162a = AbstractC2334g.m4162a(i);
        if (iM4162a == 0) {
            return true;
        }
        if (iM4162a == 2) {
            return false;
        }
        this.f3971j = 4;
        int i4 = this.f3975n;
        while (true) {
            int length = this.f3975n;
            if (length == -1) {
                this.f3971j = 3;
                string = null;
                break;
            }
            C0914b c0914b = (C0914b) this.f3977p.f143k;
            CharSequence charSequence = this.f3973l;
            int length2 = charSequence.length();
            AbstractC0714c.m1530p(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c0914b.mo2083a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f3975n = -1;
            } else {
                this.f3975n = length + 1;
            }
            int i8 = this.f3975n;
            if (i8 == i4) {
                int i9 = i8 + 1;
                this.f3975n = i9;
                if (i9 > charSequence.length()) {
                    this.f3975n = -1;
                }
            } else {
                while (true) {
                    abstractC0913a = this.f3974m;
                    if (i4 >= length || !abstractC0913a.mo2083a(charSequence.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                while (length > i4 && abstractC0913a.mo2083a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i10 = this.f3976o;
                if (i10 == 1) {
                    length = charSequence.length();
                    this.f3975n = -1;
                    while (length > i4 && abstractC0913a.mo2083a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.f3976o = i10 - 1;
                }
                string = charSequence.subSequence(i4, length).toString();
            }
        }
        this.f3972k = string;
        if (this.f3971j == 3) {
            return false;
        }
        this.f3971j = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3971j = 2;
        String str = this.f3972k;
        this.f3972k = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
