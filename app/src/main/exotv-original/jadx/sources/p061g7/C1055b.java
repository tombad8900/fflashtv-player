package p061g7;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p111m6.AbstractC1908c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.b */
/* loaded from: classes.dex */
public class C1055b implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public final /* synthetic */ int f4470j;

    /* renamed from: k */
    public int f4471k;

    /* renamed from: l */
    public final Object f4472l;

    public /* synthetic */ C1055b(int i, Object obj) {
        this.f4470j = i;
        this.f4472l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4470j) {
            case 0:
                Iterator it = (Iterator) this.f4472l;
                while (this.f4471k > 0 && it.hasNext()) {
                    it.next();
                    this.f4471k--;
                }
                return it.hasNext();
            case 1:
                return this.f4471k < ((ViewGroup) this.f4472l).getChildCount();
            case 2:
                return this.f4471k < ((AbstractC1908c) this.f4472l).mo2621a();
            default:
                return this.f4471k < ((Object[]) this.f4472l).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4470j) {
            case 0:
                Iterator it = (Iterator) this.f4472l;
                while (this.f4471k > 0 && it.hasNext()) {
                    it.next();
                    this.f4471k--;
                }
                return it.next();
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f4472l;
                int i = this.f4471k;
                this.f4471k = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC1908c abstractC1908c = (AbstractC1908c) this.f4472l;
                int i4 = this.f4471k;
                this.f4471k = i4 + 1;
                return abstractC1908c.get(i4);
            default:
                try {
                    Object[] objArr = (Object[]) this.f4472l;
                    int i8 = this.f4471k;
                    this.f4471k = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f4471k--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4470j) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f4472l;
                int i = this.f4471k - 1;
                this.f4471k = i;
                viewGroup.removeViewAt(i);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1055b(Object[] objArr) {
        this.f4470j = 3;
        AbstractC2980h.m5136e("array", objArr);
        this.f4472l = objArr;
    }

    public C1055b(C1056c c1056c) {
        this.f4470j = 0;
        this.f4472l = c1056c.f4473a.iterator();
        this.f4471k = c1056c.f4474b;
    }
}
