package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C2181z;
import p111m6.AbstractC1912g;
import p111m6.AbstractC1913h;
import p147q7.AbstractC2278c;
import p189v7.AbstractC2557b;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes.dex */
public final class C2120d {
    public static final C2120d INSTANCE;
    private static final Map<C2579m, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final C2119c[] STATIC_HEADER_TABLE;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.d$a */
    public static final class a {
        public C2119c[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<C2119c> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final InterfaceC2577l source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2576k0 interfaceC2576k0, int i) {
            this(interfaceC2576k0, i, 0, 4, null);
            AbstractC2980h.m5136e("source", interfaceC2576k0);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i4 = this.dynamicTableByteCount;
            if (i < i4) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i4 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            C2119c[] c2119cArr = this.dynamicTable;
            AbstractC1912g.m3732p0(c2119cArr, 0, c2119cArr.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i4;
            int i8 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i4 = this.nextHeaderIndex;
                    if (length < i4 || i <= 0) {
                        break;
                    }
                    C2119c c2119c = this.dynamicTable[length];
                    AbstractC2980h.m5133b(c2119c);
                    int i9 = c2119c.hpackSize;
                    i -= i9;
                    this.dynamicTableByteCount -= i9;
                    this.headerCount--;
                    i8++;
                }
                C2119c[] c2119cArr = this.dynamicTable;
                System.arraycopy(c2119cArr, i4 + 1, c2119cArr, i4 + 1 + i8, this.headerCount);
                this.nextHeaderIndex += i8;
            }
            return i8;
        }

        private final C2579m getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return C2120d.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - C2120d.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                C2119c[] c2119cArr = this.dynamicTable;
                if (iDynamicTableIndex < c2119cArr.length) {
                    C2119c c2119c = c2119cArr[iDynamicTableIndex];
                    AbstractC2980h.m5133b(c2119c);
                    return c2119c.name;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void insertIntoDynamicTable(int i, C2119c c2119c) {
            this.headerList.add(c2119c);
            int i4 = c2119c.hpackSize;
            if (i != -1) {
                C2119c c2119c2 = this.dynamicTable[dynamicTableIndex(i)];
                AbstractC2980h.m5133b(c2119c2);
                i4 -= c2119c2.hpackSize;
            }
            int i8 = this.maxDynamicTableByteCount;
            if (i4 > i8) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i4) - i8);
            if (i == -1) {
                int i9 = this.headerCount + 1;
                C2119c[] c2119cArr = this.dynamicTable;
                if (i9 > c2119cArr.length) {
                    C2119c[] c2119cArr2 = new C2119c[c2119cArr.length * 2];
                    System.arraycopy(c2119cArr, 0, c2119cArr2, c2119cArr.length, c2119cArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = c2119cArr2;
                }
                int i10 = this.nextHeaderIndex;
                this.nextHeaderIndex = i10 - 1;
                this.dynamicTable[i10] = c2119c;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i) + iEvictToRecoverBytes + i] = c2119c;
            }
            this.dynamicTableByteCount += i4;
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= C2120d.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return AbstractC2278c.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(C2120d.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - C2120d.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                C2119c[] c2119cArr = this.dynamicTable;
                if (iDynamicTableIndex < c2119cArr.length) {
                    List<C2119c> list = this.headerList;
                    C2119c c2119c = c2119cArr[iDynamicTableIndex];
                    AbstractC2980h.m5133b(c2119c);
                    list.add(c2119c);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new C2119c(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new C2119c(C2120d.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new C2119c(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new C2119c(C2120d.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<C2119c> getAndResetHeaderList() {
            List<C2119c> listM3747L0 = AbstractC1913h.m3747L0(this.headerList);
            this.headerList.clear();
            return listM3747L0;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final C2579m readByteString() {
            int i = readByte();
            boolean z7 = (i & 128) == 128;
            long j = readInt(i, 127);
            if (!z7) {
                return this.source.mo4610d(j);
            }
            C2573j c2573j = new C2573j();
            C2128l.INSTANCE.decode(this.source, j, c2573j);
            return c2573j.mo4610d(c2573j.f9314k);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.mo4614j()) {
                int iAnd = AbstractC2278c.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, C2120d.PREFIX_6_BITS) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, C2120d.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i4) {
            int i8 = i & i4;
            if (i8 < i4) {
                return i8;
            }
            int i9 = 0;
            while (true) {
                int i10 = readByte();
                if ((i10 & 128) == 0) {
                    return i4 + (i10 << i9);
                }
                i4 += (i10 & 127) << i9;
                i9 += 7;
            }
        }

        public a(InterfaceC2576k0 interfaceC2576k0, int i, int i4) {
            AbstractC2980h.m5136e("source", interfaceC2576k0);
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i4;
            this.headerList = new ArrayList();
            this.source = AbstractC2557b.m4578c(interfaceC2576k0);
            this.dynamicTable = new C2119c[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ a(InterfaceC2576k0 interfaceC2576k0, int i, int i4, int i8, AbstractC2977e abstractC2977e) {
            this(interfaceC2576k0, i, (i8 & 4) != 0 ? i : i4);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.d$b */
    public static final class b {
        public C2119c[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C2573j out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(int i, C2573j c2573j) {
            this(i, false, c2573j, 2, null);
            AbstractC2980h.m5136e("out", c2573j);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i4 = this.dynamicTableByteCount;
            if (i < i4) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i4 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            C2119c[] c2119cArr = this.dynamicTable;
            AbstractC1912g.m3732p0(c2119cArr, 0, c2119cArr.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i4;
            int i8 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i4 = this.nextHeaderIndex;
                    if (length < i4 || i <= 0) {
                        break;
                    }
                    C2119c c2119c = this.dynamicTable[length];
                    AbstractC2980h.m5133b(c2119c);
                    i -= c2119c.hpackSize;
                    int i9 = this.dynamicTableByteCount;
                    C2119c c2119c2 = this.dynamicTable[length];
                    AbstractC2980h.m5133b(c2119c2);
                    this.dynamicTableByteCount = i9 - c2119c2.hpackSize;
                    this.headerCount--;
                    i8++;
                }
                C2119c[] c2119cArr = this.dynamicTable;
                System.arraycopy(c2119cArr, i4 + 1, c2119cArr, i4 + 1 + i8, this.headerCount);
                C2119c[] c2119cArr2 = this.dynamicTable;
                int i10 = this.nextHeaderIndex;
                Arrays.fill(c2119cArr2, i10 + 1, i10 + 1 + i8, (Object) null);
                this.nextHeaderIndex += i8;
            }
            return i8;
        }

        private final void insertIntoDynamicTable(C2119c c2119c) {
            int i = c2119c.hpackSize;
            int i4 = this.maxDynamicTableByteCount;
            if (i > i4) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i4);
            int i8 = this.headerCount + 1;
            C2119c[] c2119cArr = this.dynamicTable;
            if (i8 > c2119cArr.length) {
                C2119c[] c2119cArr2 = new C2119c[c2119cArr.length * 2];
                System.arraycopy(c2119cArr, 0, c2119cArr2, c2119cArr.length, c2119cArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = c2119cArr2;
            }
            int i9 = this.nextHeaderIndex;
            this.nextHeaderIndex = i9 - 1;
            this.dynamicTable[i9] = c2119c;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int iMin = Math.min(i, 16384);
            int i4 = this.maxDynamicTableByteCount;
            if (i4 == iMin) {
                return;
            }
            if (iMin < i4) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(C2579m c2579m) throws EOFException {
            AbstractC2980h.m5136e("data", c2579m);
            if (this.useCompression) {
                C2128l c2128l = C2128l.INSTANCE;
                if (c2128l.encodedLength(c2579m) < c2579m.mo4634d()) {
                    C2573j c2573j = new C2573j();
                    c2128l.encode(c2579m, c2573j);
                    C2579m c2579mMo4610d = c2573j.mo4610d(c2573j.f9314k);
                    writeInt(c2579mMo4610d.mo4634d(), 127, 128);
                    this.out.m4654J(c2579mMo4610d);
                    return;
                }
            }
            writeInt(c2579m.mo4634d(), 127, 0);
            this.out.m4654J(c2579m);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void writeHeaders(List<C2119c> list) throws EOFException {
            int length;
            int length2;
            AbstractC2980h.m5136e("headerBlock", list);
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, C2120d.PREFIX_5_BITS, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, C2120d.PREFIX_5_BITS, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C2119c c2119c = list.get(i4);
                C2579m c2579mMo4643p = c2119c.name.mo4643p();
                C2579m c2579m = c2119c.value;
                C2120d c2120d = C2120d.INSTANCE;
                Integer num = c2120d.getNAME_TO_FIRST_INDEX().get(c2579mMo4643p);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (AbstractC2980h.m5132a(c2120d.getSTATIC_HEADER_TABLE()[iIntValue].value, c2579m)) {
                        length = length2;
                    } else if (AbstractC2980h.m5132a(c2120d.getSTATIC_HEADER_TABLE()[length2].value, c2579m)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i8 = this.nextHeaderIndex + 1;
                    int length3 = this.dynamicTable.length;
                    while (true) {
                        if (i8 >= length3) {
                            break;
                        }
                        C2119c c2119c2 = this.dynamicTable[i8];
                        AbstractC2980h.m5133b(c2119c2);
                        if (AbstractC2980h.m5132a(c2119c2.name, c2579mMo4643p)) {
                            C2119c c2119c3 = this.dynamicTable[i8];
                            AbstractC2980h.m5133b(c2119c3);
                            if (AbstractC2980h.m5132a(c2119c3.value, c2579m)) {
                                length2 = C2120d.INSTANCE.getSTATIC_HEADER_TABLE().length + (i8 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i8 - this.nextHeaderIndex) + C2120d.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i8++;
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.m4655K(64);
                    writeByteString(c2579mMo4643p);
                    writeByteString(c2579m);
                    insertIntoDynamicTable(c2119c);
                } else {
                    C2579m c2579m2 = C2119c.PSEUDO_PREFIX;
                    c2579mMo4643p.getClass();
                    AbstractC2980h.m5136e("prefix", c2579m2);
                    if (!c2579mMo4643p.mo4641m(0, c2579m2, c2579m2.mo4634d()) || AbstractC2980h.m5132a(C2119c.TARGET_AUTHORITY, c2579mMo4643p)) {
                        writeInt(length, C2120d.PREFIX_6_BITS, 64);
                        writeByteString(c2579m);
                        insertIntoDynamicTable(c2119c);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(c2579m);
                    }
                }
            }
        }

        public final void writeInt(int i, int i4, int i8) {
            if (i < i4) {
                this.out.m4655K(i | i8);
                return;
            }
            this.out.m4655K(i8 | i4);
            int i9 = i - i4;
            while (i9 >= 128) {
                this.out.m4655K(128 | (i9 & 127));
                i9 >>>= 7;
            }
            this.out.m4655K(i9);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(C2573j c2573j) {
            this(0, false, c2573j, 3, null);
            AbstractC2980h.m5136e("out", c2573j);
        }

        public b(int i, boolean z7, C2573j c2573j) {
            AbstractC2980h.m5136e("out", c2573j);
            this.headerTableSizeSetting = i;
            this.useCompression = z7;
            this.out = c2573j;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new C2119c[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ b(int i, boolean z7, C2573j c2573j, int i4, AbstractC2977e abstractC2977e) {
            this((i4 & 1) != 0 ? 4096 : i, (i4 & 2) != 0 ? true : z7, c2573j);
        }
    }

    static {
        C2120d c2120d = new C2120d();
        INSTANCE = c2120d;
        C2119c c2119c = new C2119c(C2119c.TARGET_AUTHORITY, C2181z.FRAGMENT_ENCODE_SET);
        C2579m c2579m = C2119c.TARGET_METHOD;
        C2119c c2119c2 = new C2119c(c2579m, "GET");
        C2119c c2119c3 = new C2119c(c2579m, "POST");
        C2579m c2579m2 = C2119c.TARGET_PATH;
        C2119c c2119c4 = new C2119c(c2579m2, "/");
        C2119c c2119c5 = new C2119c(c2579m2, "/index.html");
        C2579m c2579m3 = C2119c.TARGET_SCHEME;
        C2119c c2119c6 = new C2119c(c2579m3, "http");
        C2119c c2119c7 = new C2119c(c2579m3, "https");
        C2579m c2579m4 = C2119c.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new C2119c[]{c2119c, c2119c2, c2119c3, c2119c4, c2119c5, c2119c6, c2119c7, new C2119c(c2579m4, "200"), new C2119c(c2579m4, "204"), new C2119c(c2579m4, "206"), new C2119c(c2579m4, "304"), new C2119c(c2579m4, "400"), new C2119c(c2579m4, "404"), new C2119c(c2579m4, "500"), new C2119c("accept-charset", C2181z.FRAGMENT_ENCODE_SET), new C2119c("accept-encoding", "gzip, deflate"), new C2119c("accept-language", C2181z.FRAGMENT_ENCODE_SET), new C2119c("accept-ranges", C2181z.FRAGMENT_ENCODE_SET), new C2119c("accept", C2181z.FRAGMENT_ENCODE_SET), new C2119c("access-control-allow-origin", C2181z.FRAGMENT_ENCODE_SET), new C2119c("age", C2181z.FRAGMENT_ENCODE_SET), new C2119c("allow", C2181z.FRAGMENT_ENCODE_SET), new C2119c("authorization", C2181z.FRAGMENT_ENCODE_SET), new C2119c("cache-control", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-disposition", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-encoding", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-language", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-length", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-location", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-range", C2181z.FRAGMENT_ENCODE_SET), new C2119c("content-type", C2181z.FRAGMENT_ENCODE_SET), new C2119c("cookie", C2181z.FRAGMENT_ENCODE_SET), new C2119c("date", C2181z.FRAGMENT_ENCODE_SET), new C2119c("etag", C2181z.FRAGMENT_ENCODE_SET), new C2119c("expect", C2181z.FRAGMENT_ENCODE_SET), new C2119c("expires", C2181z.FRAGMENT_ENCODE_SET), new C2119c("from", C2181z.FRAGMENT_ENCODE_SET), new C2119c("host", C2181z.FRAGMENT_ENCODE_SET), new C2119c("if-match", C2181z.FRAGMENT_ENCODE_SET), new C2119c("if-modified-since", C2181z.FRAGMENT_ENCODE_SET), new C2119c("if-none-match", C2181z.FRAGMENT_ENCODE_SET), new C2119c("if-range", C2181z.FRAGMENT_ENCODE_SET), new C2119c("if-unmodified-since", C2181z.FRAGMENT_ENCODE_SET), new C2119c("last-modified", C2181z.FRAGMENT_ENCODE_SET), new C2119c("link", C2181z.FRAGMENT_ENCODE_SET), new C2119c("location", C2181z.FRAGMENT_ENCODE_SET), new C2119c("max-forwards", C2181z.FRAGMENT_ENCODE_SET), new C2119c("proxy-authenticate", C2181z.FRAGMENT_ENCODE_SET), new C2119c("proxy-authorization", C2181z.FRAGMENT_ENCODE_SET), new C2119c("range", C2181z.FRAGMENT_ENCODE_SET), new C2119c("referer", C2181z.FRAGMENT_ENCODE_SET), new C2119c("refresh", C2181z.FRAGMENT_ENCODE_SET), new C2119c("retry-after", C2181z.FRAGMENT_ENCODE_SET), new C2119c("server", C2181z.FRAGMENT_ENCODE_SET), new C2119c("set-cookie", C2181z.FRAGMENT_ENCODE_SET), new C2119c("strict-transport-security", C2181z.FRAGMENT_ENCODE_SET), new C2119c("transfer-encoding", C2181z.FRAGMENT_ENCODE_SET), new C2119c("user-agent", C2181z.FRAGMENT_ENCODE_SET), new C2119c("vary", C2181z.FRAGMENT_ENCODE_SET), new C2119c("via", C2181z.FRAGMENT_ENCODE_SET), new C2119c("www-authenticate", C2181z.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = c2120d.nameToFirstIndex();
    }

    private C2120d() {
    }

    private final Map<C2579m, Integer> nameToFirstIndex() {
        C2119c[] c2119cArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2119cArr.length);
        int length = c2119cArr.length;
        for (int i = 0; i < length; i++) {
            C2119c[] c2119cArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(c2119cArr2[i].name)) {
                linkedHashMap.put(c2119cArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<C2579m, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC2980h.m5135d("unmodifiableMap(result)", mapUnmodifiableMap);
        return mapUnmodifiableMap;
    }

    public final C2579m checkLowercase(C2579m c2579m) throws IOException {
        AbstractC2980h.m5136e("name", c2579m);
        int iMo4634d = c2579m.mo4634d();
        for (int i = 0; i < iMo4634d; i++) {
            byte bMo4638i = c2579m.mo4638i(i);
            if (65 <= bMo4638i && bMo4638i < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c2579m.m4675q()));
            }
        }
        return c2579m;
    }

    public final Map<C2579m, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final C2119c[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
