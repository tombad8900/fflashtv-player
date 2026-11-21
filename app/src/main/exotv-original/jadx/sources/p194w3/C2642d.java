package p194w3;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C2181z;
import p082j3.C1488a;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w3.d */
/* loaded from: classes.dex */
public final class C2642d implements Closeable {

    /* renamed from: j */
    public final File f9610j;

    /* renamed from: k */
    public final File f9611k;

    /* renamed from: l */
    public final File f9612l;

    /* renamed from: m */
    public final File f9613m;

    /* renamed from: o */
    public final long f9615o;

    /* renamed from: r */
    public BufferedWriter f9618r;

    /* renamed from: t */
    public int f9620t;

    /* renamed from: q */
    public long f9617q = 0;

    /* renamed from: s */
    public final LinkedHashMap f9619s = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: u */
    public long f9621u = 0;

    /* renamed from: v */
    public final ThreadPoolExecutor f9622v = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2640b());

    /* renamed from: w */
    public final CallableC2639a f9623w = new CallableC2639a(this);

    /* renamed from: n */
    public final int f9614n = 1;

    /* renamed from: p */
    public final int f9616p = 1;

    public C2642d(File file, long j) {
        this.f9610j = file;
        this.f9611k = new File(file, "journal");
        this.f9612l = new File(file, "journal.tmp");
        this.f9613m = new File(file, "journal.bkp");
        this.f9615o = j;
    }

    /* renamed from: D */
    public static C2642d m4735D(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m4736I(file2, file3, false);
            }
        }
        C2642d c2642d = new C2642d(file, j);
        if (c2642d.f9611k.exists()) {
            try {
                c2642d.m4742F();
                c2642d.m4741E();
                return c2642d;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c2642d.close();
                AbstractC2645g.m4750a(c2642d.f9610j);
            }
        }
        file.mkdirs();
        C2642d c2642d2 = new C2642d(file, j);
        c2642d2.m4744H();
        return c2642d2;
    }

    /* renamed from: I */
    public static void m4736I(File file, File file2, boolean z7) throws IOException {
        if (z7) {
            m4739g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: b */
    public static void m4737b(C2642d c2642d, C1488a c1488a, boolean z7) {
        synchronized (c2642d) {
            C2641c c2641c = (C2641c) c1488a.f5722b;
            if (c2641c.f9608f != c1488a) {
                throw new IllegalStateException();
            }
            if (z7 && !c2641c.f9607e) {
                for (int i = 0; i < c2642d.f9616p; i++) {
                    if (!((boolean[]) c1488a.f5723c)[i]) {
                        c1488a.m3150a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c2641c.f9606d[i].exists()) {
                        c1488a.m3150a();
                        return;
                    }
                }
            }
            for (int i4 = 0; i4 < c2642d.f9616p; i4++) {
                File file = c2641c.f9606d[i4];
                if (!z7) {
                    m4739g(file);
                } else if (file.exists()) {
                    File file2 = c2641c.f9605c[i4];
                    file.renameTo(file2);
                    long j = c2641c.f9604b[i4];
                    long length = file2.length();
                    c2641c.f9604b[i4] = length;
                    c2642d.f9617q = (c2642d.f9617q - j) + length;
                }
            }
            c2642d.f9620t++;
            c2641c.f9608f = null;
            if (c2641c.f9607e || z7) {
                c2641c.f9607e = true;
                c2642d.f9618r.append((CharSequence) "CLEAN");
                c2642d.f9618r.append(' ');
                c2642d.f9618r.append((CharSequence) c2641c.f9603a);
                c2642d.f9618r.append((CharSequence) c2641c.m4734a());
                c2642d.f9618r.append('\n');
                if (z7) {
                    c2642d.f9621u++;
                }
            } else {
                c2642d.f9619s.remove(c2641c.f9603a);
                c2642d.f9618r.append((CharSequence) "REMOVE");
                c2642d.f9618r.append(' ');
                c2642d.f9618r.append((CharSequence) c2641c.f9603a);
                c2642d.f9618r.append('\n');
            }
            m4740p(c2642d.f9618r);
            if (c2642d.f9617q > c2642d.f9615o || c2642d.m4748x()) {
                c2642d.f9622v.submit(c2642d.f9623w);
            }
        }
    }

    /* renamed from: c */
    public static void m4738c(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: g */
    public static void m4739g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: p */
    public static void m4740p(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: E */
    public final void m4741E() throws IOException {
        m4739g(this.f9612l);
        Iterator it = this.f9619s.values().iterator();
        while (it.hasNext()) {
            C2641c c2641c = (C2641c) it.next();
            C1488a c1488a = c2641c.f9608f;
            int i = this.f9616p;
            int i4 = 0;
            if (c1488a == null) {
                while (i4 < i) {
                    this.f9617q += c2641c.f9604b[i4];
                    i4++;
                }
            } else {
                c2641c.f9608f = null;
                while (i4 < i) {
                    m4739g(c2641c.f9605c[i4]);
                    m4739g(c2641c.f9606d[i4]);
                    i4++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: F */
    public final void m4742F() {
        File file = this.f9611k;
        C2644f c2644f = new C2644f(new FileInputStream(file), AbstractC2645g.f9630a);
        try {
            String strM4749b = c2644f.m4749b();
            String strM4749b2 = c2644f.m4749b();
            String strM4749b3 = c2644f.m4749b();
            String strM4749b4 = c2644f.m4749b();
            String strM4749b5 = c2644f.m4749b();
            if (!"libcore.io.DiskLruCache".equals(strM4749b) || !"1".equals(strM4749b2) || !Integer.toString(this.f9614n).equals(strM4749b3) || !Integer.toString(this.f9616p).equals(strM4749b4) || !C2181z.FRAGMENT_ENCODE_SET.equals(strM4749b5)) {
                throw new IOException("unexpected journal header: [" + strM4749b + ", " + strM4749b2 + ", " + strM4749b4 + ", " + strM4749b5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m4743G(c2644f.m4749b());
                    i++;
                } catch (EOFException unused) {
                    this.f9620t = i - this.f9619s.size();
                    if (c2644f.f9629n == -1) {
                        m4744H();
                    } else {
                        this.f9618r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC2645g.f9630a));
                    }
                    try {
                        c2644f.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c2644f.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: G */
    public final void m4743G(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f9619s;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C2641c c2641c = (C2641c) linkedHashMap.get(strSubstring);
        if (c2641c == null) {
            c2641c = new C2641c(this, strSubstring);
            linkedHashMap.put(strSubstring, c2641c);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c2641c.f9608f = new C1488a(this, c2641c);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c2641c.f9607e = true;
        c2641c.f9608f = null;
        if (strArrSplit.length != c2641c.f9609g.f9616p) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            try {
                c2641c.f9604b[i4] = Long.parseLong(strArrSplit[i4]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* renamed from: H */
    public final synchronized void m4744H() {
        try {
            BufferedWriter bufferedWriter = this.f9618r;
            if (bufferedWriter != null) {
                m4738c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9612l), AbstractC2645g.f9630a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f9614n));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f9616p));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C2641c c2641c : this.f9619s.values()) {
                    if (c2641c.f9608f != null) {
                        bufferedWriter2.write("DIRTY " + c2641c.f9603a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c2641c.f9603a + c2641c.m4734a() + '\n');
                    }
                }
                m4738c(bufferedWriter2);
                if (this.f9611k.exists()) {
                    m4736I(this.f9611k, this.f9613m, true);
                }
                m4736I(this.f9612l, this.f9611k, false);
                this.f9613m.delete();
                this.f9618r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9611k, true), AbstractC2645g.f9630a));
            } catch (Throwable th) {
                m4738c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: J */
    public final void m4745J() {
        while (this.f9617q > this.f9615o) {
            String str = (String) ((Map.Entry) this.f9619s.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f9618r == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C2641c c2641c = (C2641c) this.f9619s.get(str);
                    if (c2641c != null && c2641c.f9608f == null) {
                        for (int i = 0; i < this.f9616p; i++) {
                            File file = c2641c.f9605c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f9617q;
                            long[] jArr = c2641c.f9604b;
                            this.f9617q = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f9620t++;
                        this.f9618r.append((CharSequence) "REMOVE");
                        this.f9618r.append(' ');
                        this.f9618r.append((CharSequence) str);
                        this.f9618r.append('\n');
                        this.f9619s.remove(str);
                        if (m4748x()) {
                            this.f9622v.submit(this.f9623w);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f9618r == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f9619s.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1488a c1488a = ((C2641c) obj).f9608f;
                if (c1488a != null) {
                    c1488a.m3150a();
                }
            }
            m4745J();
            m4738c(this.f9618r);
            this.f9618r = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public final C1488a m4746k(String str) {
        synchronized (this) {
            try {
                if (this.f9618r == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C2641c c2641c = (C2641c) this.f9619s.get(str);
                if (c2641c == null) {
                    c2641c = new C2641c(this, str);
                    this.f9619s.put(str, c2641c);
                } else if (c2641c.f9608f != null) {
                    return null;
                }
                C1488a c1488a = new C1488a(this, c2641c);
                c2641c.f9608f = c1488a;
                this.f9618r.append((CharSequence) "DIRTY");
                this.f9618r.append(' ');
                this.f9618r.append((CharSequence) str);
                this.f9618r.append('\n');
                m4740p(this.f9618r);
                return c1488a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final synchronized C1629o m4747t(String str) {
        if (this.f9618r == null) {
            throw new IllegalStateException("cache is closed");
        }
        C2641c c2641c = (C2641c) this.f9619s.get(str);
        if (c2641c == null) {
            return null;
        }
        if (!c2641c.f9607e) {
            return null;
        }
        for (File file : c2641c.f9605c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f9620t++;
        this.f9618r.append((CharSequence) "READ");
        this.f9618r.append(' ');
        this.f9618r.append((CharSequence) str);
        this.f9618r.append('\n');
        if (m4748x()) {
            this.f9622v.submit(this.f9623w);
        }
        return new C1629o(c2641c.f9605c);
    }

    /* renamed from: x */
    public final boolean m4748x() {
        int i = this.f9620t;
        return i >= 2000 && i >= this.f9619s.size();
    }
}
