package p183v0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bumptech.glide.AbstractC0714c;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.u */
/* loaded from: classes.dex */
public final class C2521u extends SpannableStringBuilder {

    /* renamed from: j */
    public final Class f9174j;

    /* renamed from: k */
    public final ArrayList f9175k;

    public C2521u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f9175k = new ArrayList();
        AbstractC0714c.m1529o("watcherClass cannot be null", cls);
        this.f9174j = cls;
    }

    /* renamed from: a */
    public final void m4534a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9175k;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2520t) arrayList.get(i)).f9173k.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m4535b() {
        m4538e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9175k;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2520t) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* renamed from: c */
    public final C2520t m4536c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9175k;
            if (i >= arrayList.size()) {
                return null;
            }
            C2520t c2520t = (C2520t) arrayList.get(i);
            if (c2520t.f9172j == obj) {
                return c2520t;
            }
            i++;
        }
    }

    /* renamed from: d */
    public final boolean m4537d(Object obj) {
        if (obj != null) {
            return this.f9174j == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    /* renamed from: e */
    public final void m4538e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9175k;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2520t) arrayList.get(i)).f9173k.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C2520t c2520tM4536c;
        if (m4537d(obj) && (c2520tM4536c = m4536c(obj)) != null) {
            obj = c2520tM4536c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C2520t c2520tM4536c;
        if (m4537d(obj) && (c2520tM4536c = m4536c(obj)) != null) {
            obj = c2520tM4536c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C2520t c2520tM4536c;
        if (m4537d(obj) && (c2520tM4536c = m4536c(obj)) != null) {
            obj = c2520tM4536c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        if (this.f9174j != cls) {
            return super.getSpans(i, i4, cls);
        }
        C2520t[] c2520tArr = (C2520t[]) super.getSpans(i, i4, C2520t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c2520tArr.length);
        for (int i8 = 0; i8 < c2520tArr.length; i8++) {
            objArr[i8] = c2520tArr[i8].f9172j;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        if (cls == null || this.f9174j == cls) {
            cls = C2520t.class;
        }
        return super.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C2520t c2520tM4536c;
        if (m4537d(obj)) {
            c2520tM4536c = m4536c(obj);
            if (c2520tM4536c != null) {
                obj = c2520tM4536c;
            }
        } else {
            c2520tM4536c = null;
        }
        super.removeSpan(obj);
        if (c2520tM4536c != null) {
            this.f9175k.remove(c2520tM4536c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence) {
        replace(i, i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i8) {
        if (m4537d(obj)) {
            C2520t c2520t = new C2520t(obj);
            this.f9175k.add(c2520t);
            obj = c2520t;
        }
        super.setSpan(obj, i, i4, i8);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new C2521u(this.f9174j, this, i, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence, int i8, int i9) {
        replace(i, i4, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i4, int i8) {
        super.insert(i, charSequence, i4, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence) {
        m4534a();
        super.replace(i, i4, charSequence);
        m4538e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i4, int i8) {
        super.insert(i, charSequence, i4, i8);
        return this;
    }

    public C2521u(Class cls, C2521u c2521u, int i, int i4) {
        super(c2521u, i, i4);
        this.f9175k = new ArrayList();
        AbstractC0714c.m1529o("watcherClass cannot be null", cls);
        this.f9174j = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence, int i8, int i9) {
        m4534a();
        super.replace(i, i4, charSequence, i8, i9);
        m4538e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
