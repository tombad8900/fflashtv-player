package p147q7;

import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC2078h0;
import okhttp3.AbstractC2160j0;
import okhttp3.AbstractC2177v;
import okhttp3.C2070d0;
import okhttp3.C2072e0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.C2181z;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2178w;
import okhttp3.internal.http2.C2119c;
import okhttp3.internal.p128io.InterfaceC2134b;
import p002a1.AbstractC0008a1;
import p044e7.C0925b;
import p044e7.C0926c;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p069h7.C1204f;
import p077j$.util.DesugarTimeZone;
import p090k2.C1584b;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1915j;
import p111m6.C1910e;
import p111m6.C1921p;
import p111m6.C1922q;
import p171t5.AbstractC2436a;
import p189v7.AbstractC2557b;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.C2595z;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2989q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q7.c */
/* loaded from: classes.dex */
public abstract class AbstractC2278c {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final C2180y EMPTY_HEADERS = C2180y.Companion.m3960of(new String[0]);
    public static final AbstractC2078h0 EMPTY_REQUEST;
    public static final AbstractC2160j0 EMPTY_RESPONSE;
    private static final C2595z UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final C1204f VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = AbstractC2160j0.b.create$default(AbstractC2160j0.Companion, bArr, (C2070d0) null, 1, (Object) null);
        EMPTY_REQUEST = AbstractC2078h0.a.create$default(AbstractC2078h0.Companion, bArr, (C2070d0) null, 0, 0, 7, (Object) null);
        C2579m c2579m = C2579m.f9316m;
        C2579m[] c2579mArr = {C1584b.m3249n("efbbbf"), C1584b.m3249n("feff"), C1584b.m3249n("fffe"), C1584b.m3249n("0000ffff"), C1584b.m3249n("ffff0000")};
        ArrayList arrayList = new ArrayList(new C1910e(c2579mArr));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(-1);
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < 5) {
            C2579m c2579m2 = c2579mArr[i8];
            int i10 = i9 + 1;
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            if (size2 < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m14j("fromIndex (0) is greater than toIndex (", size2, ")."));
            }
            if (size2 > size3) {
                throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
            }
            int i11 = size2 - 1;
            int i12 = 0;
            while (true) {
                if (i12 > i11) {
                    i = -(i12 + 1);
                    break;
                }
                i = (i12 + i11) >>> 1;
                int iM417m = AbstractC0120b.m417m((Comparable) arrayList.get(i), c2579m2);
                if (iM417m < 0) {
                    i12 = i + 1;
                } else if (iM417m > 0) {
                    i11 = i - 1;
                }
            }
            arrayList2.set(i, Integer.valueOf(i9));
            i8++;
            i9 = i10;
        }
        if (((C2579m) arrayList.get(0)).mo4634d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            C2579m c2579m3 = (C2579m) arrayList.get(i13);
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList.size()) {
                C2579m c2579m4 = (C2579m) arrayList.get(i15);
                c2579m4.getClass();
                AbstractC2980h.m5136e("prefix", c2579m3);
                if (c2579m4.mo4641m(0, c2579m3, c2579m3.mo4634d())) {
                    if (c2579m4.mo4634d() == c2579m3.mo4634d()) {
                        throw new IllegalArgumentException(("duplicate option: " + c2579m4).toString());
                    }
                    if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                        arrayList.remove(i15);
                        arrayList2.remove(i15);
                    } else {
                        i15++;
                    }
                }
            }
            i13 = i14;
        }
        C2573j c2573j = new C2573j();
        AbstractC2557b.m4579d(0L, c2573j, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i16 = (int) (c2573j.f9314k / 4);
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = c2573j.readInt();
        }
        Object[] objArrCopyOf = Arrays.copyOf(c2579mArr, 5);
        AbstractC2980h.m5135d("copyOf(...)", objArrCopyOf);
        UNICODE_BOMS = new C2595z((C2579m[]) objArrCopyOf, iArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        AbstractC2980h.m5133b(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new C1204f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String strM2635I0 = AbstractC1206h.m2635I0(C2072e0.class.getName(), "okhttp3.");
        if (AbstractC1214p.m2660m0(strM2635I0, "Client", false)) {
            strM2635I0 = strM2635I0.substring(0, strM2635I0.length() - 6);
            AbstractC2980h.m5135d("substring(...)", strM2635I0);
        }
        okHttpName = strM2635I0;
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        AbstractC2980h.m5136e("<this>", list);
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final int and(byte b7, int i) {
        return b7 & i;
    }

    public static final InterfaceC2178w asFactory(AbstractC2177v abstractC2177v) {
        AbstractC2980h.m5136e("<this>", abstractC2177v);
        return new C0456a(12, abstractC2177v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC2177v asFactory$lambda$8(AbstractC2177v abstractC2177v, InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("$this_asFactory", abstractC2177v);
        AbstractC2980h.m5136e("it", interfaceC2075g);
        return abstractC2177v;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        AbstractC2980h.m5136e("<this>", obj);
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        AbstractC2980h.m5136e("<this>", obj);
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        AbstractC2980h.m5136e("<this>", str);
        return VERIFY_AS_IP_ADDRESS.m2624c(str);
    }

    public static final boolean canReuseConnectionFor(C2181z c2181z, C2181z c2181z2) {
        AbstractC2980h.m5136e("<this>", c2181z);
        AbstractC2980h.m5136e("other", c2181z2);
        return AbstractC2980h.m5132a(c2181z.host(), c2181z2.host()) && c2181z.port() == c2181z2.port() && AbstractC2980h.m5132a(c2181z.scheme(), c2181z2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("name", str);
        if (j < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    public static final void checkOffsetAndCount(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) throws IOException {
        AbstractC2980h.m5136e("<this>", closeable);
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        AbstractC2980h.m5136e("<this>", strArr);
        AbstractC2980h.m5136e("value", str);
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i4) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("delimiters", str2);
        while (i < i4) {
            if (AbstractC1206h.m2650v0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i4, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            i4 = str.length();
        }
        return delimiterOffset(str, str2, i, i4);
    }

    public static final boolean discard(InterfaceC2576k0 interfaceC2576k0, int i, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("<this>", interfaceC2576k0);
        AbstractC2980h.m5136e("timeUnit", timeUnit);
        try {
            return skipAll(interfaceC2576k0, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, InterfaceC2851l interfaceC2851l) {
        AbstractC2980h.m5136e("<this>", iterable);
        AbstractC2980h.m5136e("predicate", interfaceC2851l);
        ArrayList arrayList = C1921p.f7187j;
        for (T t8 : iterable) {
            if (((Boolean) interfaceC2851l.invoke(t8)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                AbstractC2989q.m5144a(arrayList).add(t8);
            }
        }
        return arrayList;
    }

    public static final String format(String str, Object... objArr) {
        AbstractC2980h.m5136e("format", str);
        AbstractC2980h.m5136e("args", objArr);
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        AbstractC2980h.m5136e("<this>", strArr);
        AbstractC2980h.m5136e("comparator", comparator);
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                int i4 = 0;
                while (true) {
                    if (i4 < strArr2.length) {
                        int i8 = i4 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i4]) == 0) {
                                return true;
                            }
                            i4 = i8;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("<this>", c2080i0);
        String str = c2080i0.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("block", interfaceC2840a);
        try {
            interfaceC2840a.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        AbstractC2980h.m5136e("elements", tArr);
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(AbstractC1914i.m3753t0(Arrays.copyOf(objArr, objArr.length)));
        AbstractC2980h.m5135d("unmodifiableList(listOf(*elements.clone()))", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        AbstractC2980h.m5136e("<this>", strArr);
        AbstractC2980h.m5136e("value", str);
        AbstractC2980h.m5136e("comparator", comparator);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        AbstractC2980h.m5136e("<this>", str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC2980h.m5137f(cCharAt, 31) <= 0 || AbstractC2980h.m5137f(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i4) {
        AbstractC2980h.m5136e("<this>", str);
        while (i < i4) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i4 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i4);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i4) {
        AbstractC2980h.m5136e("<this>", str);
        int i8 = i4 - 1;
        if (i <= i8) {
            while (true) {
                char cCharAt = str.charAt(i8);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i8 + 1;
                }
                if (i8 == i) {
                    break;
                }
                i8--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i4 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i4);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        AbstractC2980h.m5136e("<this>", str);
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        AbstractC2980h.m5136e("<this>", strArr);
        AbstractC2980h.m5136e("other", strArr2);
        AbstractC2980h.m5136e("comparator", comparator);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(InterfaceC2134b interfaceC2134b, File file) {
        AbstractC2980h.m5136e("<this>", interfaceC2134b);
        AbstractC2980h.m5136e("file", file);
        InterfaceC2572i0 interfaceC2572i0Sink = interfaceC2134b.sink(file);
        try {
            interfaceC2134b.delete(file);
            AbstractC2436a.m4330b(interfaceC2572i0Sink, null);
            return true;
        } catch (IOException unused) {
            AbstractC2436a.m4330b(interfaceC2572i0Sink, null);
            interfaceC2134b.delete(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2436a.m4330b(interfaceC2572i0Sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, InterfaceC2577l interfaceC2577l) throws SocketException {
        AbstractC2980h.m5136e("<this>", socket);
        AbstractC2980h.m5136e("source", interfaceC2577l);
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !interfaceC2577l.mo4614j();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        AbstractC2980h.m5136e("name", str);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final void notify(Object obj) {
        AbstractC2980h.m5136e("<this>", obj);
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        AbstractC2980h.m5136e("<this>", obj);
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 >= 'G') {
            return -1;
        }
        return c8 - '7';
    }

    public static final String peerName(Socket socket) {
        AbstractC2980h.m5136e("<this>", socket);
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        AbstractC2980h.m5135d("address.hostName", hostName);
        return hostName;
    }

    public static final Charset readBomAsCharset(InterfaceC2577l interfaceC2577l, Charset charset) {
        AbstractC2980h.m5136e("<this>", interfaceC2577l);
        AbstractC2980h.m5136e("default", charset);
        int iMo4612h = interfaceC2577l.mo4612h(UNICODE_BOMS);
        if (iMo4612h == -1) {
            return charset;
        }
        if (iMo4612h == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC2980h.m5135d("UTF_8", charset2);
            return charset2;
        }
        if (iMo4612h == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC2980h.m5135d("UTF_16BE", charset3);
            return charset3;
        }
        if (iMo4612h == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC2980h.m5135d("UTF_16LE", charset4);
            return charset4;
        }
        if (iMo4612h == 3) {
            Charset charset5 = AbstractC1199a.f5077a;
            Charset charset6 = AbstractC1199a.f5079c;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            AbstractC2980h.m5135d("forName(...)", charsetForName);
            AbstractC1199a.f5079c = charsetForName;
            return charsetForName;
        }
        if (iMo4612h != 4) {
            throw new AssertionError();
        }
        Charset charset7 = AbstractC1199a.f5077a;
        Charset charset8 = AbstractC1199a.f5078b;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        AbstractC2980h.m5135d("forName(...)", charsetForName2);
        AbstractC1199a.f5078b = charsetForName2;
        return charsetForName2;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        T tCast;
        Object fieldOrNull;
        AbstractC2980h.m5136e("instance", obj);
        AbstractC2980h.m5136e("fieldType", cls);
        AbstractC2980h.m5136e("fieldName", str);
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                tCast = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                AbstractC2980h.m5135d("c.superclass", superclass);
            }
        }
        return tCast;
    }

    public static final int readMedium(InterfaceC2577l interfaceC2577l) {
        AbstractC2980h.m5136e("<this>", interfaceC2577l);
        return and(interfaceC2577l.readByte(), 255) | (and(interfaceC2577l.readByte(), 255) << 16) | (and(interfaceC2577l.readByte(), 255) << 8);
    }

    public static final boolean skipAll(InterfaceC2576k0 interfaceC2576k0, int i, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("<this>", interfaceC2576k0);
        AbstractC2980h.m5136e("timeUnit", timeUnit);
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = interfaceC2576k0.timeout().hasDeadline() ? interfaceC2576k0.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        interfaceC2576k0.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C2573j c2573j = new C2573j();
            while (interfaceC2576k0.read(c2573j, 8192L) != -1) {
                c2573j.skip(c2573j.f9314k);
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC2576k0.timeout().clearDeadline();
                return true;
            }
            interfaceC2576k0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC2576k0.timeout().clearDeadline();
                return false;
            }
            interfaceC2576k0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                interfaceC2576k0.timeout().clearDeadline();
            } else {
                interfaceC2576k0.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z7) {
        AbstractC2980h.m5136e("name", str);
        return new ThreadFactory() { // from class: q7.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC2278c.threadFactory$lambda$1(str, z7, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z7, Runnable runnable) {
        AbstractC2980h.m5136e("$name", str);
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z7);
        return thread;
    }

    public static final void threadName(String str, InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            interfaceC2840a.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    public static final List<C2119c> toHeaderList(C2180y c2180y) {
        AbstractC2980h.m5136e("<this>", c2180y);
        C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, c2180y.size());
        ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(c0926cM1521g0));
        Iterator it = c0926cM1521g0.iterator();
        while (true) {
            C0925b c0925b = (C0925b) it;
            if (!c0925b.f3991l) {
                return arrayList;
            }
            int iNextInt = c0925b.nextInt();
            arrayList.add(new C2119c(c2180y.name(iNextInt), c2180y.value(iNextInt)));
        }
    }

    public static final C2180y toHeaders(List<C2119c> list) {
        AbstractC2980h.m5136e("<this>", list);
        C2180y.a aVar = new C2180y.a();
        for (C2119c c2119c : list) {
            aVar.addLenient$okhttp(c2119c.component1().m4675q(), c2119c.component2().m4675q());
        }
        return aVar.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        AbstractC2980h.m5135d("toHexString(this)", hexString);
        return hexString;
    }

    public static final String toHostHeader(C2181z c2181z, boolean z7) {
        String strHost;
        AbstractC2980h.m5136e("<this>", c2181z);
        if (AbstractC1206h.m2649u0(c2181z.host(), ":", false)) {
            strHost = "[" + c2181z.host() + ']';
        } else {
            strHost = c2181z.host();
        }
        if (!z7 && c2181z.port() == C2181z.Companion.defaultPort(c2181z.scheme())) {
            return strHost;
        }
        return strHost + ':' + c2181z.port();
    }

    public static /* synthetic */ String toHostHeader$default(C2181z c2181z, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z7 = false;
        }
        return toHostHeader(c2181z, z7);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        AbstractC2980h.m5136e("<this>", list);
        List<T> listUnmodifiableList = Collections.unmodifiableList(AbstractC1913h.m3748M0(list));
        AbstractC2980h.m5135d("unmodifiableList(toMutableList())", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        AbstractC2980h.m5136e("<this>", map);
        if (map.isEmpty()) {
            return C1922q.f7188j;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        AbstractC2980h.m5135d("{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }", mapUnmodifiableMap);
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        AbstractC2980h.m5136e("<this>", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i4) {
        AbstractC2980h.m5136e("<this>", str);
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i4);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i4));
        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i4 = str.length();
        }
        return trimSubstring(str, i, i4);
    }

    public static final void wait(Object obj) throws InterruptedException {
        AbstractC2980h.m5136e("<this>", obj);
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        AbstractC2980h.m5136e("<this>", exc);
        AbstractC2980h.m5136e("suppressed", list);
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0715d.m1557e(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(InterfaceC2575k interfaceC2575k, int i) {
        AbstractC2980h.m5136e("<this>", interfaceC2575k);
        interfaceC2575k.writeByte((i >>> 16) & 255);
        interfaceC2575k.writeByte((i >>> 8) & 255);
        interfaceC2575k.writeByte(i & 255);
    }

    public static final int and(short s8, int i) {
        return s8 & i;
    }

    public static final int delimiterOffset(String str, char c8, int i, int i4) {
        AbstractC2980h.m5136e("<this>", str);
        while (i < i4) {
            if (str.charAt(i) == c8) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c8, int i, int i4, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            i4 = str.length();
        }
        return delimiterOffset(str, c8, i, i4);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        AbstractC2980h.m5135d("toHexString(this)", hexString);
        return hexString;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final void closeQuietly(Socket socket) throws IOException {
        AbstractC2980h.m5136e("<this>", socket);
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e8) {
            if (!AbstractC2980h.m5132a(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) throws IOException {
        AbstractC2980h.m5136e("<this>", serverSocket);
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(C2573j c2573j, byte b7) throws EOFException {
        AbstractC2980h.m5136e("<this>", c2573j);
        int i = 0;
        while (!c2573j.mo4614j() && c2573j.m4666g(0L) == b7) {
            i++;
            c2573j.readByte();
        }
        return i;
    }
}
