package p005a4;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.a0 */
/* loaded from: classes.dex */
public final class C0070a0 extends Exception {

    /* renamed from: o */
    public static final StackTraceElement[] f313o = new StackTraceElement[0];

    /* renamed from: j */
    public final List f314j;

    /* renamed from: k */
    public InterfaceC2801e f315k;

    /* renamed from: l */
    public int f316l;

    /* renamed from: m */
    public Class f317m;

    /* renamed from: n */
    public final String f318n;

    public C0070a0(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* renamed from: a */
    public static void m256a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C0070a0)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((C0070a0) th).f314j.iterator();
        while (it.hasNext()) {
            m256a((Throwable) it.next(), arrayList);
        }
    }

    /* renamed from: b */
    public static void m257b(List list, C0105z c0105z) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c0105z.append("Cause (");
            int i4 = i + 1;
            c0105z.append(String.valueOf(i4));
            c0105z.append(" of ");
            c0105z.append(String.valueOf(size));
            c0105z.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C0070a0) {
                ((C0070a0) th).m260e(c0105z);
            } else {
                m258c(th, c0105z);
            }
            i = i4;
        }
    }

    /* renamed from: c */
    public static void m258c(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: d */
    public final void m259d() {
        ArrayList arrayList = new ArrayList();
        m256a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i4 = i + 1;
            sb.append(i4);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i4;
        }
    }

    /* renamed from: e */
    public final void m260e(Appendable appendable) throws IOException {
        m258c(this, appendable);
        try {
            m257b(this.f314j, new C0105z(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f318n);
        Class cls = this.f317m;
        String str2 = C2181z.FRAGMENT_ENCODE_SET;
        if (cls != null) {
            str = ", " + this.f317m;
        } else {
            str = C2181z.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        int i = this.f316l;
        sb.append(i != 0 ? ", ".concat(AbstractC0008a1.m30z(i)) : C2181z.FRAGMENT_ENCODE_SET);
        if (this.f315k != null) {
            str2 = ", " + this.f315k;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        m256a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        m260e(System.err);
    }

    public C0070a0(String str, List list) {
        this.f318n = str;
        setStackTrace(f313o);
        this.f314j = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        m260e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        m260e(printWriter);
    }
}
