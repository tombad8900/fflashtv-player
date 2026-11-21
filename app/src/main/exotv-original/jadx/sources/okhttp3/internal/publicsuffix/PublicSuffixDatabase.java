package okhttp3.internal.publicsuffix;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p061g7.C1056c;
import p061g7.C1060g;
import p061g7.InterfaceC1061h;
import p069h7.AbstractC1206h;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.C1921p;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p189v7.AbstractC2557b;
import p189v7.C2564e0;
import p189v7.C2589t;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final C2149a Companion = new C2149a(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = AbstractC0715d.m1551T("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C2149a {
        public /* synthetic */ C2149a(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i4;
            int iAnd;
            boolean z7;
            int iAnd2;
            int length = bArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = (i8 + length) / 2;
                while (i9 > -1 && bArr[i9] != 10) {
                    i9--;
                }
                int i10 = i9 + 1;
                int i11 = 1;
                while (true) {
                    i4 = i10 + i11;
                    if (bArr[i4] == 10) {
                        break;
                    }
                    i11++;
                }
                int i12 = i4 - i10;
                int i13 = i;
                boolean z8 = false;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (z8) {
                        iAnd = 46;
                        z7 = false;
                    } else {
                        boolean z9 = z8;
                        iAnd = AbstractC2278c.and(bArr2[i13][i14], 255);
                        z7 = z9;
                    }
                    iAnd2 = iAnd - AbstractC2278c.and(bArr[i10 + i15], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i15++;
                    i14++;
                    if (i15 == i12) {
                        break;
                    }
                    if (bArr2[i13].length != i14) {
                        z8 = z7;
                    } else {
                        if (i13 == bArr2.length - 1) {
                            break;
                        }
                        i13++;
                        z8 = true;
                        i14 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i16 = i12 - i15;
                        int length2 = bArr2[i13].length - i14;
                        int length3 = bArr2.length;
                        for (int i17 = i13 + 1; i17 < length3; i17++) {
                            length2 += bArr2[i17].length;
                        }
                        if (length2 >= i16) {
                            if (length2 <= i16) {
                                Charset charset = StandardCharsets.UTF_8;
                                AbstractC2980h.m5135d("UTF_8", charset);
                                return new String(bArr, i10, i12, charset);
                            }
                        }
                    }
                    i8 = i4 + 1;
                }
                length = i9;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private C2149a() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) throws InterruptedException {
        String str;
        String strBinarySearch;
        String strBinarySearch2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = list.get(i);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC2980h.m5135d("UTF_8", charset);
            byte[] bytes = str2.getBytes(charset);
            AbstractC2980h.m5135d("this as java.lang.String).getBytes(charset)", bytes);
            bArr[i] = bytes;
        }
        int i4 = 0;
        while (true) {
            str = null;
            if (i4 >= size) {
                strBinarySearch = null;
                break;
            }
            C2149a c2149a = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                AbstractC2980h.m5139h("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = c2149a.binarySearch(bArr2, bArr, i4);
            if (strBinarySearch != null) {
                break;
            }
            i4++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i8 = 0; i8 < length; i8++) {
                bArr3[i8] = WILDCARD_LABEL;
                C2149a c2149a2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    AbstractC2980h.m5139h("publicSuffixListBytes");
                    throw null;
                }
                strBinarySearch2 = c2149a2.binarySearch(bArr4, bArr3, i8);
                if (strBinarySearch2 != null) {
                    break;
                }
            }
            strBinarySearch2 = null;
        } else {
            strBinarySearch2 = null;
        }
        if (strBinarySearch2 != null) {
            int i9 = size - 1;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                C2149a c2149a3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    AbstractC2980h.m5139h("publicSuffixExceptionListBytes");
                    throw null;
                }
                String strBinarySearch3 = c2149a3.binarySearch(bArr5, bArr, i10);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return AbstractC1206h.m2638L0("!".concat(str), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listM2638L0 = C1921p.f7187j;
        List<String> listM2638L02 = strBinarySearch != null ? AbstractC1206h.m2638L0(strBinarySearch, new char[]{'.'}) : listM2638L0;
        if (strBinarySearch2 != null) {
            listM2638L0 = AbstractC1206h.m2638L0(strBinarySearch2, new char[]{'.'});
        }
        return listM2638L02.size() > listM2638L0.size() ? listM2638L02 : listM2638L0;
    }

    private final void readTheList() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(new C2589t(AbstractC2557b.m4584i(resourceAsStream)));
                try {
                    long j = c2564e0M4578c.readInt();
                    c2564e0M4578c.mo4623y(j);
                    byte[] bArrM4648D = c2564e0M4578c.f9290k.m4648D(j);
                    long j8 = c2564e0M4578c.readInt();
                    c2564e0M4578c.mo4623y(j8);
                    byte[] bArrM4648D2 = c2564e0M4578c.f9290k.m4648D(j8);
                    c2564e0M4578c.close();
                    synchronized (this) {
                        this.publicSuffixListBytes = bArrM4648D;
                        this.publicSuffixExceptionListBytes = bArrM4648D2;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z7 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z7 = true;
                } catch (IOException e) {
                    C2385h.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (!z7) {
                        return;
                    }
                }
            } finally {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List<String> splitDomain(String str) {
        int i = 0;
        List<String> listM2638L0 = AbstractC1206h.m2638L0(str, new char[]{'.'});
        if (!AbstractC2980h.m5132a(AbstractC1913h.m3741F0(listM2638L0), C2181z.FRAGMENT_ENCODE_SET)) {
            return listM2638L0;
        }
        int size = listM2638L0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Requested element count ", size, " is less than zero.").toString());
        }
        if (size == 0) {
            return C1921p.f7187j;
        }
        if (size >= listM2638L0.size()) {
            return AbstractC1913h.m3747L0(listM2638L0);
        }
        if (size == 1) {
            return AbstractC0715d.m1551T(AbstractC1913h.m3751z0(listM2638L0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<T> it = listM2638L0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        return AbstractC1914i.m3754u0(arrayList);
    }

    public final String getEffectiveTldPlusOne(String str) throws InterruptedException {
        int size;
        int size2;
        AbstractC2980h.m5136e("domain", str);
        String unicode = IDN.toUnicode(str);
        AbstractC2980h.m5135d("unicodeDomain", unicode);
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        int i = 0;
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i4 = size - size2;
        List<String> listSplitDomain2 = splitDomain(str);
        AbstractC2980h.m5136e("<this>", listSplitDomain2);
        InterfaceC1061h c1060g = new C1060g(2, listSplitDomain2);
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Requested element count ", i4, " is less than zero.").toString());
        }
        if (i4 != 0) {
            c1060g = new C1056c(c1060g, i4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) C2181z.FRAGMENT_ENCODE_SET);
        for (Object obj : c1060g) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC0714c.m1515d(sb, obj, null);
        }
        sb.append((CharSequence) C2181z.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        AbstractC2980h.m5136e("publicSuffixListBytes", bArr);
        AbstractC2980h.m5136e("publicSuffixExceptionListBytes", bArr2);
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
