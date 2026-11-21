package p202x2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p002a1.AbstractC0008a1;
import p189v7.C2556a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x2.d */
/* loaded from: classes.dex */
public abstract class AbstractC2748d {

    /* renamed from: a */
    public static final C2556a0 f10139a = new C2556a0(5);

    /* renamed from: b */
    public static final byte[] f10140b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f10141c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f10142d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f10143e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f10144f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f10145g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f10146h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f10147i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f10148j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m4808a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m4809b(C2746b[] c2746bArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C2746b c2746b : c2746bArr) {
            length += ((((c2746b.f10136g * 2) + 7) & (-8)) / 8) + (c2746b.f10134e * 2) + m4811d(bArr, c2746b.f10130a, c2746b.f10131b).getBytes(StandardCharsets.UTF_8).length + 16 + c2746b.f10135f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f10144f)) {
            int length2 = c2746bArr.length;
            while (i < length2) {
                C2746b c2746b2 = c2746bArr[i];
                m4824q(byteArrayOutputStream, c2746b2, m4811d(bArr, c2746b2.f10130a, c2746b2.f10131b));
                m4823p(byteArrayOutputStream, c2746b2);
                i++;
            }
        } else {
            for (C2746b c2746b3 : c2746bArr) {
                m4824q(byteArrayOutputStream, c2746b3, m4811d(bArr, c2746b3.f10130a, c2746b3.f10131b));
            }
            int length3 = c2746bArr.length;
            while (i < length3) {
                m4823p(byteArrayOutputStream, c2746bArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* renamed from: c */
    public static boolean m4810c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z7 = true;
        for (File file2 : fileArrListFiles) {
            z7 = m4810c(file2) && z7;
        }
        return z7;
    }

    /* renamed from: d */
    public static String m4811d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f10146h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f10145g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return AbstractC0008a1.m18n(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* renamed from: e */
    public static void m4812e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m4813f(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i4 = 0;
        while (i4 < i) {
            int i8 = inputStream.read(bArr, i4, i - i4);
            if (i8 < 0) {
                throw new IllegalStateException(AbstractC0008a1.m12h(i, "Not enough bytes to read: "));
            }
            i4 += i8;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m4814g(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM4820m = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iM4820m += (int) m4820m(byteArrayInputStream, 2);
            iArr[i4] = iM4820m;
        }
        return iArr;
    }

    /* renamed from: h */
    public static byte[] m4815h(FileInputStream fileInputStream, int i, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i8 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i8 < i) {
                int i9 = fileInputStream.read(bArr2);
                if (i9 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i9);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i4 - iInflate);
                    i8 += i9;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i8 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i8);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: i */
    public static C2746b[] m4816i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C2746b[] c2746bArr) throws IOException {
        byte[] bArr3 = f10147i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f10148j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM4820m = (int) m4820m(fileInputStream, 2);
            byte[] bArrM4815h = m4815h(fileInputStream, (int) m4820m(fileInputStream, 4), (int) m4820m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4815h);
            try {
                C2746b[] c2746bArrM4818k = m4818k(byteArrayInputStream, bArr2, iM4820m, c2746bArr);
                byteArrayInputStream.close();
                return c2746bArrM4818k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f10142d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM4820m2 = (int) m4820m(fileInputStream, 1);
        byte[] bArrM4815h2 = m4815h(fileInputStream, (int) m4820m(fileInputStream, 4), (int) m4820m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM4815h2);
        try {
            C2746b[] c2746bArrM4817j = m4817j(byteArrayInputStream2, iM4820m2, c2746bArr);
            byteArrayInputStream2.close();
            return c2746bArrM4817j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static C2746b[] m4817j(ByteArrayInputStream byteArrayInputStream, int i, C2746b[] c2746bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C2746b[0];
        }
        if (i != c2746bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i4 = 0; i4 < i; i4++) {
            int iM4820m = (int) m4820m(byteArrayInputStream, 2);
            iArr[i4] = (int) m4820m(byteArrayInputStream, 2);
            strArr[i4] = new String(m4813f(byteArrayInputStream, iM4820m), StandardCharsets.UTF_8);
        }
        for (int i8 = 0; i8 < i; i8++) {
            C2746b c2746b = c2746bArr[i8];
            if (!c2746b.f10131b.equals(strArr[i8])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i9 = iArr[i8];
            c2746b.f10134e = i9;
            c2746b.f10137h = m4814g(byteArrayInputStream, i9);
        }
        return c2746bArr;
    }

    /* renamed from: k */
    public static C2746b[] m4818k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C2746b[] c2746bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C2746b[0];
        }
        if (i != c2746bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i; i4++) {
            m4820m(byteArrayInputStream, 2);
            String str = new String(m4813f(byteArrayInputStream, (int) m4820m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM4820m = m4820m(byteArrayInputStream, 4);
            int iM4820m = (int) m4820m(byteArrayInputStream, 2);
            C2746b c2746b = null;
            if (c2746bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i8 = 0;
                while (true) {
                    if (i8 >= c2746bArr.length) {
                        break;
                    }
                    if (c2746bArr[i8].f10131b.equals(strSubstring)) {
                        c2746b = c2746bArr[i8];
                        break;
                    }
                    i8++;
                }
            }
            if (c2746b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c2746b.f10133d = jM4820m;
            int[] iArrM4814g = m4814g(byteArrayInputStream, iM4820m);
            if (Arrays.equals(bArr, f10146h)) {
                c2746b.f10134e = iM4820m;
                c2746b.f10137h = iArrM4814g;
            }
        }
        return c2746bArr;
    }

    /* renamed from: l */
    public static C2746b[] m4819l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f10143e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM4820m = (int) m4820m(fileInputStream, 1);
        byte[] bArrM4815h = m4815h(fileInputStream, (int) m4820m(fileInputStream, 4), (int) m4820m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4815h);
        try {
            C2746b[] c2746bArrM4821n = m4821n(byteArrayInputStream, str, iM4820m);
            byteArrayInputStream.close();
            return c2746bArrM4821n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m4820m(InputStream inputStream, int i) throws IOException {
        byte[] bArrM4813f = m4813f(inputStream, i);
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j += (bArrM4813f[i4] & 255) << (i4 * 8);
        }
        return j;
    }

    /* renamed from: n */
    public static C2746b[] m4821n(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C2746b[0];
        }
        C2746b[] c2746bArr = new C2746b[i];
        for (int i8 = 0; i8 < i; i8++) {
            int iM4820m = (int) m4820m(byteArrayInputStream, 2);
            int iM4820m2 = (int) m4820m(byteArrayInputStream, 2);
            c2746bArr[i8] = new C2746b(str, new String(m4813f(byteArrayInputStream, iM4820m), StandardCharsets.UTF_8), m4820m(byteArrayInputStream, 4), iM4820m2, (int) m4820m(byteArrayInputStream, 4), (int) m4820m(byteArrayInputStream, 4), new int[iM4820m2], new TreeMap());
        }
        int i9 = 0;
        while (i9 < i) {
            C2746b c2746b = c2746bArr[i9];
            int iAvailable = byteArrayInputStream.available();
            int i10 = c2746b.f10135f;
            int i11 = c2746b.f10136g;
            TreeMap treeMap = c2746b.f10138i;
            int i12 = iAvailable - i10;
            int iM4820m3 = i4;
            while (byteArrayInputStream.available() > i12) {
                iM4820m3 += (int) m4820m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM4820m3), 1);
                int iM4820m4 = (int) m4820m(byteArrayInputStream, 2);
                while (iM4820m4 > 0) {
                    m4820m(byteArrayInputStream, 2);
                    int iM4820m5 = (int) m4820m(byteArrayInputStream, 1);
                    if (iM4820m5 != 6 && iM4820m5 != 7) {
                        while (iM4820m5 > 0) {
                            m4820m(byteArrayInputStream, 1);
                            int i13 = i4;
                            int i14 = i9;
                            for (int iM4820m6 = (int) m4820m(byteArrayInputStream, 1); iM4820m6 > 0; iM4820m6--) {
                                m4820m(byteArrayInputStream, 2);
                            }
                            iM4820m5--;
                            i4 = i13;
                            i9 = i14;
                        }
                    }
                    iM4820m4--;
                    i4 = i4;
                    i9 = i9;
                }
            }
            int i15 = i4;
            int i16 = i9;
            if (byteArrayInputStream.available() != i12) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c2746b.f10137h = m4814g(byteArrayInputStream, c2746b.f10134e);
            BitSet bitSetValueOf = BitSet.valueOf(m4813f(byteArrayInputStream, (((i11 * 2) + 7) & (-8)) / 8));
            for (int i17 = i15; i17 < i11; i17++) {
                int i18 = bitSetValueOf.get(i17) ? 2 : i15;
                if (bitSetValueOf.get(i17 + i11)) {
                    i18 |= 4;
                }
                if (i18 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i17));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i15);
                    }
                    treeMap.put(Integer.valueOf(i17), Integer.valueOf(i18 | numValueOf.intValue()));
                }
            }
            i9 = i16 + 1;
            i4 = i15;
        }
        return c2746bArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m4822o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C2746b[] c2746bArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f10142d;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f10143e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM4809b = m4809b(c2746bArr, bArr3);
                m4828u(byteArrayOutputStream, c2746bArr.length, 1);
                m4828u(byteArrayOutputStream, bArrM4809b.length, 4);
                byte[] bArrM4808a = m4808a(bArrM4809b);
                m4828u(byteArrayOutputStream, bArrM4808a.length, 4);
                byteArrayOutputStream.write(bArrM4808a);
                return true;
            }
            byte[] bArr4 = f10145g;
            if (Arrays.equals(bArr, bArr4)) {
                m4828u(byteArrayOutputStream, c2746bArr.length, 1);
                for (C2746b c2746b : c2746bArr) {
                    int size = c2746b.f10138i.size() * 4;
                    String strM4811d = m4811d(bArr4, c2746b.f10130a, c2746b.f10131b);
                    Charset charset = StandardCharsets.UTF_8;
                    m4829v(byteArrayOutputStream, strM4811d.getBytes(charset).length);
                    m4829v(byteArrayOutputStream, c2746b.f10137h.length);
                    m4828u(byteArrayOutputStream, size, 4);
                    m4828u(byteArrayOutputStream, c2746b.f10132c, 4);
                    byteArrayOutputStream.write(strM4811d.getBytes(charset));
                    Iterator it = c2746b.f10138i.keySet().iterator();
                    while (it.hasNext()) {
                        m4829v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m4829v(byteArrayOutputStream, 0);
                    }
                    for (int i4 : c2746b.f10137h) {
                        m4829v(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f10144f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM4809b2 = m4809b(c2746bArr, bArr5);
                m4828u(byteArrayOutputStream, c2746bArr.length, 1);
                m4828u(byteArrayOutputStream, bArrM4809b2.length, 4);
                byte[] bArrM4808a2 = m4808a(bArrM4809b2);
                m4828u(byteArrayOutputStream, bArrM4808a2.length, 4);
                byteArrayOutputStream.write(bArrM4808a2);
                return true;
            }
            byte[] bArr6 = f10146h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m4829v(byteArrayOutputStream, c2746bArr.length);
            for (C2746b c2746b2 : c2746bArr) {
                String str = c2746b2.f10130a;
                TreeMap treeMap = c2746b2.f10138i;
                String strM4811d2 = m4811d(bArr6, str, c2746b2.f10131b);
                Charset charset2 = StandardCharsets.UTF_8;
                m4829v(byteArrayOutputStream, strM4811d2.getBytes(charset2).length);
                m4829v(byteArrayOutputStream, treeMap.size());
                m4829v(byteArrayOutputStream, c2746b2.f10137h.length);
                m4828u(byteArrayOutputStream, c2746b2.f10132c, 4);
                byteArrayOutputStream.write(strM4811d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m4829v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i8 : c2746b2.f10137h) {
                    m4829v(byteArrayOutputStream, i8);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m4829v(byteArrayOutputStream2, c2746bArr.length);
            int i9 = 2;
            int i10 = 2;
            for (C2746b c2746b3 : c2746bArr) {
                m4828u(byteArrayOutputStream2, c2746b3.f10132c, 4);
                m4828u(byteArrayOutputStream2, c2746b3.f10133d, 4);
                m4828u(byteArrayOutputStream2, c2746b3.f10136g, 4);
                String strM4811d3 = m4811d(bArr2, c2746b3.f10130a, c2746b3.f10131b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM4811d3.getBytes(charset3).length;
                m4829v(byteArrayOutputStream2, length2);
                i10 = i10 + 14 + length2;
                byteArrayOutputStream2.write(strM4811d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i10 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            }
            C2753i c2753i = new C2753i(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c2753i);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c2746bArr.length) {
                try {
                    C2746b c2746b4 = c2746bArr[i11];
                    m4829v(byteArrayOutputStream3, i11);
                    m4829v(byteArrayOutputStream3, c2746b4.f10134e);
                    i12 = i12 + 4 + (c2746b4.f10134e * i9);
                    int[] iArr = c2746b4.f10137h;
                    int length3 = iArr.length;
                    int i13 = i;
                    int i14 = i9;
                    int i15 = i13;
                    while (i15 < length3) {
                        int i16 = iArr[i15];
                        m4829v(byteArrayOutputStream3, i16 - i13);
                        i15++;
                        i13 = i16;
                    }
                    i11++;
                    i9 = i14;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
            }
            C2753i c2753i2 = new C2753i(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c2753i2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < c2746bArr.length) {
                try {
                    C2746b c2746b5 = c2746bArr[i17];
                    Iterator it3 = c2746b5.f10138i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m4825r(byteArrayOutputStream4, iIntValue, c2746b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m4826s(byteArrayOutputStream4, c2746b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m4829v(byteArrayOutputStream3, i17);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i19 = i18 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m4828u(byteArrayOutputStream3, length4, 4);
                            m4829v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i18 = i19 + length4;
                            i17++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            C2753i c2753i3 = new C2753i(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c2753i3);
            long j8 = 4;
            long size2 = j8 + j8 + 4 + (arrayList2.size() * 16);
            m4828u(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                C2753i c2753i4 = (C2753i) arrayList2.get(i20);
                int i21 = c2753i4.f10156a;
                byte[] bArr7 = c2753i4.f10157b;
                if (i21 == 1) {
                    j = 0;
                } else if (i21 == 2) {
                    j = 1;
                } else if (i21 == 3) {
                    j = 2;
                } else if (i21 == 4) {
                    j = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                m4828u(byteArrayOutputStream, j, 4);
                m4828u(byteArrayOutputStream, size2, 4);
                if (c2753i4.f10158c) {
                    long length5 = bArr7.length;
                    byte[] bArrM4808a3 = m4808a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM4808a3);
                    m4828u(byteArrayOutputStream, bArrM4808a3.length, 4);
                    m4828u(byteArrayOutputStream, length5, 4);
                    length = bArrM4808a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m4828u(byteArrayOutputStream, bArr7.length, 4);
                    m4828u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m4823p(ByteArrayOutputStream byteArrayOutputStream, C2746b c2746b) throws IOException {
        m4826s(byteArrayOutputStream, c2746b);
        int i = c2746b.f10136g;
        int[] iArr = c2746b.f10137h;
        int length = iArr.length;
        int i4 = 0;
        int i8 = 0;
        while (i4 < length) {
            int i9 = iArr[i4];
            m4829v(byteArrayOutputStream, i9 - i8);
            i4++;
            i8 = i9;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2746b.f10138i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i10 = iIntValue / 8;
                bArr[i10] = (byte) (bArr[i10] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i11 = iIntValue + i;
                int i12 = i11 / 8;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: q */
    public static void m4824q(ByteArrayOutputStream byteArrayOutputStream, C2746b c2746b, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m4829v(byteArrayOutputStream, str.getBytes(charset).length);
        m4829v(byteArrayOutputStream, c2746b.f10134e);
        m4828u(byteArrayOutputStream, c2746b.f10135f, 4);
        m4828u(byteArrayOutputStream, c2746b.f10132c, 4);
        m4828u(byteArrayOutputStream, c2746b.f10136g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: r */
    public static void m4825r(ByteArrayOutputStream byteArrayOutputStream, int i, C2746b c2746b) throws IOException {
        int i4 = c2746b.f10136g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i4) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2746b.f10138i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i8 = 0;
            for (int i9 = 1; i9 <= 4; i9 <<= 1) {
                if (i9 != 1 && (i9 & i) != 0) {
                    if ((i9 & iIntValue2) == i9) {
                        int i10 = (i8 * i4) + iIntValue;
                        int i11 = i10 / 8;
                        bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
                    }
                    i8++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: s */
    public static void m4826s(ByteArrayOutputStream byteArrayOutputStream, C2746b c2746b) throws IOException {
        int i = 0;
        for (Map.Entry entry : c2746b.f10138i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m4829v(byteArrayOutputStream, iIntValue - i);
                m4829v(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4827t(Context context, Executor executor, InterfaceC2747c interfaceC2747c, boolean z7) throws PackageManager.NameNotFoundException, IOException {
        boolean z8;
        ?? M4806a;
        byte[] bArr;
        C2746b[] c2746bArrM4819l;
        C2746b[] c2746bArr;
        C2746b[] c2746bArr2;
        byte[] bArr2;
        boolean z9;
        boolean z10;
        Throwable th;
        Throwable th2;
        boolean z11;
        boolean z12;
        ?? byteArrayOutputStream;
        boolean z13;
        C2745a c2745a;
        boolean z14;
        FileInputStream fileInputStreamM4806a;
        boolean z15;
        boolean z16;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z7) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z16 = j == packageInfo.lastUpdateTime;
                            if (z16) {
                                interfaceC2747c.mo3323j(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z16) {
                    }
                } else {
                    z16 = false;
                    if (z16) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC2752h.m4836c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C2745a c2745a2 = new C2745a(assets, executor, interfaceC2747c, name, file2);
            byte[] bArr3 = c2745a2.f10124c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c2745a2.m4807b(4, null);
                    }
                    c2745a2.f10127f = true;
                    try {
                        try {
                            M4806a = c2745a2.m4806a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            interfaceC2747c.mo3323j(6, e);
                            M4806a = 0;
                            bArr = f10140b;
                            if (M4806a != 0) {
                            }
                            c2746bArr = c2745a2.f10128g;
                            if (c2746bArr != null) {
                            }
                            InterfaceC2747c interfaceC2747c2 = c2745a2.f10123b;
                            c2746bArr2 = c2745a2.f10128g;
                            byte[] bArr4 = c2745a2.f10124c;
                            boolean z17 = M4806a;
                            z17 = M4806a;
                            if (c2746bArr2 != null) {
                            }
                            bArr2 = c2745a2.f10129h;
                            if (bArr2 != null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z15 = z11;
                            AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                        } catch (IOException e8) {
                            interfaceC2747c.mo3323j(7, e8);
                            M4806a = 0;
                            bArr = f10140b;
                            if (M4806a != 0) {
                            }
                            c2746bArr = c2745a2.f10128g;
                            if (c2746bArr != null) {
                            }
                            InterfaceC2747c interfaceC2747c22 = c2745a2.f10123b;
                            c2746bArr2 = c2745a2.f10128g;
                            byte[] bArr42 = c2745a2.f10124c;
                            boolean z172 = M4806a;
                            z172 = M4806a;
                            if (c2746bArr2 != null) {
                            }
                            bArr2 = c2745a2.f10129h;
                            if (bArr2 != null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z15 = z11;
                            AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                        }
                        if (M4806a != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e9) {
                                    interfaceC2747c.mo3323j(8, e9);
                                    try {
                                        M4806a.close();
                                    } catch (IOException e10) {
                                        interfaceC2747c.mo3323j(7, e10);
                                    }
                                    c2746bArrM4819l = null;
                                    c2745a2.f10128g = c2746bArrM4819l;
                                    c2746bArr = c2745a2.f10128g;
                                    if (c2746bArr != null) {
                                    }
                                    InterfaceC2747c interfaceC2747c222 = c2745a2.f10123b;
                                    c2746bArr2 = c2745a2.f10128g;
                                    byte[] bArr422 = c2745a2.f10124c;
                                    boolean z1722 = M4806a;
                                    z1722 = M4806a;
                                    if (c2746bArr2 != null) {
                                    }
                                    bArr2 = c2745a2.f10129h;
                                    if (bArr2 != null) {
                                    }
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z15 = z11;
                                    AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                                }
                            } catch (IOException e11) {
                                interfaceC2747c.mo3323j(7, e11);
                                M4806a.close();
                                c2746bArrM4819l = null;
                                c2745a2.f10128g = c2746bArrM4819l;
                                c2746bArr = c2745a2.f10128g;
                                if (c2746bArr != null) {
                                }
                                InterfaceC2747c interfaceC2747c2222 = c2745a2.f10123b;
                                c2746bArr2 = c2745a2.f10128g;
                                byte[] bArr4222 = c2745a2.f10124c;
                                boolean z17222 = M4806a;
                                z17222 = M4806a;
                                if (c2746bArr2 != null) {
                                }
                                bArr2 = c2745a2.f10129h;
                                if (bArr2 != null) {
                                }
                                if (z10) {
                                }
                                z12 = z10;
                                z15 = z11;
                                AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                            }
                            if (!Arrays.equals(bArr, m4813f(M4806a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c2746bArrM4819l = m4819l(M4806a, m4813f(M4806a, 4), c2745a2.f10126e);
                            try {
                                M4806a.close();
                            } catch (IOException e12) {
                                interfaceC2747c.mo3323j(7, e12);
                            }
                            c2745a2.f10128g = c2746bArrM4819l;
                        }
                        c2746bArr = c2745a2.f10128g;
                        if (c2746bArr != null && ((M4806a = Build.VERSION.SDK_INT) >= 31 || M4806a == 24 || M4806a == 25)) {
                            try {
                                M4806a = "dexopt/baseline.profm";
                                fileInputStreamM4806a = c2745a2.m4806a(assets, "dexopt/baseline.profm");
                                z14 = M4806a;
                            } catch (FileNotFoundException e13) {
                                interfaceC2747c.mo3323j(9, e13);
                                z14 = M4806a;
                            } catch (IOException e14) {
                                interfaceC2747c.mo3323j(7, e14);
                                z14 = M4806a;
                            } catch (IllegalStateException e15) {
                                c2745a2.f10128g = null;
                                interfaceC2747c.mo3323j(8, e15);
                                z14 = M4806a;
                            }
                            if (fileInputStreamM4806a == null) {
                                try {
                                    if (!Arrays.equals(f10141c, m4813f(fileInputStreamM4806a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM4813f = m4813f(fileInputStreamM4806a, 4);
                                    c2745a2.f10128g = m4816i(fileInputStreamM4806a, bArrM4813f, bArr3, c2746bArr);
                                    fileInputStreamM4806a.close();
                                    c2745a = c2745a2;
                                    M4806a = bArrM4813f;
                                    if (c2745a != null) {
                                        c2745a2 = c2745a;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM4806a != null) {
                                    fileInputStreamM4806a.close();
                                    z14 = M4806a;
                                }
                                c2745a = null;
                                M4806a = z14;
                                if (c2745a != null) {
                                }
                            }
                        }
                        InterfaceC2747c interfaceC2747c22222 = c2745a2.f10123b;
                        c2746bArr2 = c2745a2.f10128g;
                        byte[] bArr42222 = c2745a2.f10124c;
                        boolean z172222 = M4806a;
                        z172222 = M4806a;
                        if (c2746bArr2 != null && bArr42222 != null) {
                            byteArrayOutputStream = c2745a2.f10127f;
                            if (byteArrayOutputStream != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e16) {
                                interfaceC2747c22222.mo3323j(7, e16);
                                z13 = byteArrayOutputStream;
                            } catch (IllegalStateException e17) {
                                interfaceC2747c22222.mo3323j(8, e17);
                                z13 = byteArrayOutputStream;
                            }
                            if (m4822o(byteArrayOutputStream, bArr42222, c2746bArr2)) {
                                c2745a2.f10129h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z13 = byteArrayOutputStream;
                                c2745a2.f10128g = null;
                                z172222 = z13;
                            } else {
                                interfaceC2747c22222.mo3323j(5, null);
                                c2745a2.f10128g = null;
                                byteArrayOutputStream.close();
                                z172222 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = c2745a2.f10129h;
                        if (bArr2 != null) {
                            z10 = false;
                            z11 = true;
                        } else {
                            try {
                                if (!c2745a2.f10127f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c2745a2.f10125d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i = byteArrayInputStream.read(bArr5);
                                                                                    if (i <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i);
                                                                                    }
                                                                                }
                                                                                z11 = true;
                                                                                c2745a2.m4807b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c2745a2.f10129h = null;
                                                                                c2745a2.f10128g = null;
                                                                                z10 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e18) {
                                        e = e18;
                                        c2745a2.m4807b(6, e);
                                        z9 = z172222;
                                        z10 = false;
                                        z11 = z9;
                                        if (z10) {
                                        }
                                        z12 = z10;
                                        z15 = z11;
                                        AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                                    } catch (IOException e19) {
                                        e = e19;
                                        c2745a2.m4807b(7, e);
                                        z9 = z172222;
                                        z10 = false;
                                        z11 = z9;
                                        if (z10) {
                                        }
                                        z12 = z10;
                                        z15 = z11;
                                        AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                                    }
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    z172222 = true;
                                    c2745a2.m4807b(6, e);
                                    z9 = z172222;
                                    z10 = false;
                                    z11 = z9;
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z15 = z11;
                                    AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                                } catch (IOException e21) {
                                    e = e21;
                                    z172222 = true;
                                    c2745a2.m4807b(7, e);
                                    z9 = z172222;
                                    z10 = false;
                                    z11 = z9;
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z15 = z11;
                                    AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
                                }
                            } finally {
                                c2745a2.f10129h = null;
                                c2745a2.f10128g = null;
                            }
                        }
                        if (z10) {
                            m4812e(packageInfo, filesDir);
                        }
                        z12 = z10;
                        z15 = z11;
                    } finally {
                    }
                    bArr = f10140b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c2745a2.m4807b(4, null);
                        }
                        c2745a2.f10127f = true;
                        M4806a = c2745a2.m4806a(assets, "dexopt/baseline.prof");
                        bArr = f10140b;
                        if (M4806a != 0) {
                        }
                        c2746bArr = c2745a2.f10128g;
                        if (c2746bArr != null) {
                            M4806a = "dexopt/baseline.profm";
                            fileInputStreamM4806a = c2745a2.m4806a(assets, "dexopt/baseline.profm");
                            z14 = M4806a;
                            if (fileInputStreamM4806a == null) {
                            }
                        }
                        InterfaceC2747c interfaceC2747c222222 = c2745a2.f10123b;
                        c2746bArr2 = c2745a2.f10128g;
                        byte[] bArr422222 = c2745a2.f10124c;
                        boolean z1722222 = M4806a;
                        z1722222 = M4806a;
                        if (c2746bArr2 != null) {
                            byteArrayOutputStream = c2745a2.f10127f;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr2 = c2745a2.f10129h;
                        if (bArr2 != null) {
                        }
                        if (z10) {
                        }
                        z12 = z10;
                        z15 = z11;
                    } catch (IOException unused2) {
                        z8 = true;
                        c2745a2.m4807b(4, null);
                    }
                }
                AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
            }
            c2745a2.m4807b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z8 = true;
            z12 = false;
            z15 = z8;
            AbstractC2752h.m4836c(context, (z12 || !z7) ? false : z15);
        } catch (PackageManager.NameNotFoundException e22) {
            interfaceC2747c.mo3323j(7, e22);
            AbstractC2752h.m4836c(context, false);
        }
    }

    /* renamed from: u */
    public static void m4828u(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = (byte) ((j >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: v */
    public static void m4829v(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m4828u(byteArrayOutputStream, i, 2);
    }
}
