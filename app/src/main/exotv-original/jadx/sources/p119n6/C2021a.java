package p119n6;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p111m6.AbstractC1909d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.a */
/* loaded from: classes.dex */
public final class C2021a implements ListIterator, InterfaceC0113a {

    /* renamed from: k */
    public int f7454k;

    /* renamed from: m */
    public int f7456m;

    /* renamed from: n */
    public final AbstractC1909d f7457n;

    /* renamed from: j */
    public final /* synthetic */ int f7453j = 0;

    /* renamed from: l */
    public int f7455l = -1;

    public C2021a(C2023c c2023c, int i) {
        this.f7457n = c2023c;
        this.f7454k = i;
        this.f7456m = ((AbstractList) c2023c).modCount;
    }

    /* renamed from: a */
    public void m3891a() {
        if (((AbstractList) ((C2022b) this.f7457n).f7462n).modCount != this.f7456m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f7453j) {
            case 0:
                m3891a();
                C2022b c2022b = (C2022b) this.f7457n;
                int i = this.f7454k;
                this.f7454k = i + 1;
                c2022b.add(i, obj);
                this.f7455l = -1;
                this.f7456m = ((AbstractList) c2022b).modCount;
                break;
            default:
                m3892b();
                C2023c c2023c = (C2023c) this.f7457n;
                int i4 = this.f7454k;
                this.f7454k = i4 + 1;
                c2023c.add(i4, obj);
                this.f7455l = -1;
                this.f7456m = ((AbstractList) c2023c).modCount;
                break;
        }
    }

    /* renamed from: b */
    public void m3892b() {
        if (((AbstractList) ((C2023c) this.f7457n)).modCount != this.f7456m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7453j) {
            case 0:
                if (this.f7454k < ((C2022b) this.f7457n).f7460l) {
                }
                break;
            default:
                if (this.f7454k < ((C2023c) this.f7457n).f7465k) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7453j) {
            case 0:
                if (this.f7454k > 0) {
                }
                break;
            default:
                if (this.f7454k > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7453j) {
            case 0:
                m3891a();
                int i = this.f7454k;
                C2022b c2022b = (C2022b) this.f7457n;
                if (i >= c2022b.f7460l) {
                    throw new NoSuchElementException();
                }
                this.f7454k = i + 1;
                this.f7455l = i;
                return c2022b.f7458j[c2022b.f7459k + i];
            default:
                m3892b();
                int i4 = this.f7454k;
                C2023c c2023c = (C2023c) this.f7457n;
                if (i4 >= c2023c.f7465k) {
                    throw new NoSuchElementException();
                }
                this.f7454k = i4 + 1;
                this.f7455l = i4;
                return c2023c.f7464j[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f7453j) {
        }
        return this.f7454k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7453j) {
            case 0:
                m3891a();
                int i = this.f7454k;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i - 1;
                this.f7454k = i4;
                this.f7455l = i4;
                C2022b c2022b = (C2022b) this.f7457n;
                return c2022b.f7458j[c2022b.f7459k + i4];
            default:
                m3892b();
                int i8 = this.f7454k;
                if (i8 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i8 - 1;
                this.f7454k = i9;
                this.f7455l = i9;
                return ((C2023c) this.f7457n).f7464j[i9];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f7453j) {
            case 0:
                i = this.f7454k;
                break;
            default:
                i = this.f7454k;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f7453j) {
            case 0:
                C2022b c2022b = (C2022b) this.f7457n;
                m3891a();
                int i = this.f7455l;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c2022b.mo3716b(i);
                this.f7454k = this.f7455l;
                this.f7455l = -1;
                this.f7456m = ((AbstractList) c2022b).modCount;
                return;
            default:
                C2023c c2023c = (C2023c) this.f7457n;
                m3892b();
                int i4 = this.f7455l;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c2023c.mo3716b(i4);
                this.f7454k = this.f7455l;
                this.f7455l = -1;
                this.f7456m = ((AbstractList) c2023c).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7453j) {
            case 0:
                m3891a();
                int i = this.f7455l;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C2022b) this.f7457n).set(i, obj);
                return;
            default:
                m3892b();
                int i4 = this.f7455l;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C2023c) this.f7457n).set(i4, obj);
                return;
        }
    }

    public C2021a(C2022b c2022b, int i) {
        this.f7457n = c2022b;
        this.f7454k = i;
        this.f7456m = ((AbstractList) c2022b).modCount;
    }
}
