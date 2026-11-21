package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.http.AbstractC2105d;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p008a7.InterfaceC0113a;
import p061g7.C1055b;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p077j$.time.Instant;
import p077j$.util.DateRetargetClass;
import p102l6.C1687d;
import p111m6.AbstractC1912g;
import p111m6.C1921p;
import p147q7.AbstractC2278c;
import p168t2.AbstractC2429w;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.y */
/* loaded from: classes.dex */
public final class C2180y implements Iterable, InterfaceC0113a {
    public static final b Companion = new b(null);
    private final String[] namesAndValues;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.y$a */
    public static final class a {
        private final List<String> namesAndValues = new ArrayList(20);

        public final a add(String str) {
            AbstractC2980h.m5136e("line", str);
            int iM2627A0 = AbstractC1206h.m2627A0(str, ':', 0, 6);
            if (iM2627A0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(str).toString());
            }
            String strSubstring = str.substring(0, iM2627A0);
            AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
            String string = AbstractC1206h.m2645S0(strSubstring).toString();
            String strSubstring2 = str.substring(iM2627A0 + 1);
            AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring2);
            add(string, strSubstring2);
            return this;
        }

        public final a addAll(C2180y c2180y) {
            AbstractC2980h.m5136e("headers", c2180y);
            int size = c2180y.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(c2180y.name(i), c2180y.value(i));
            }
            return this;
        }

        public final a addLenient$okhttp(String str) {
            AbstractC2980h.m5136e("line", str);
            int iM2627A0 = AbstractC1206h.m2627A0(str, ':', 1, 4);
            if (iM2627A0 != -1) {
                String strSubstring = str.substring(0, iM2627A0);
                AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
                String strSubstring2 = str.substring(iM2627A0 + 1);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring2);
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (str.charAt(0) != ':') {
                addLenient$okhttp(C2181z.FRAGMENT_ENCODE_SET, str);
                return this;
            }
            String strSubstring3 = str.substring(1);
            AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring3);
            addLenient$okhttp(C2181z.FRAGMENT_ENCODE_SET, strSubstring3);
            return this;
        }

        public final a addUnsafeNonAscii(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            C2180y.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final C2180y build() {
            return new C2180y((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String str) {
            AbstractC2980h.m5136e("name", str);
            int size = this.namesAndValues.size() - 2;
            int iM4305j = AbstractC2429w.m4305j(size, 0, -2);
            if (iM4305j > size) {
                return null;
            }
            while (!str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iM4305j) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final a removeAll(String str) {
            AbstractC2980h.m5136e("name", str);
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a set(String str, Date date) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", date);
            set(str, AbstractC2105d.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final a set(String str, Instant instant) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", instant);
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final a set(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            b bVar = C2180y.Companion;
            bVar.checkName(str);
            bVar.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final a add(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            b bVar = C2180y.Companion;
            bVar.checkName(str);
            bVar.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final a add(String str, Date date) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", date);
            add(str, AbstractC2105d.toHttpDateString(date));
            return this;
        }

        public final a addLenient$okhttp(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            this.namesAndValues.add(str);
            this.namesAndValues.add(AbstractC1206h.m2645S0(str2).toString());
            return this;
        }

        @IgnoreJRERequirement
        public final a add(String str, Instant instant) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", instant);
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.y$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= '\u007f') {
                    throw new IllegalArgumentException(AbstractC2278c.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= '\u007f')) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC2278c.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(AbstractC2278c.isSensitiveHeader(str2) ? C2181z.FRAGMENT_ENCODE_SET : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iM4305j = AbstractC2429w.m4305j(length, 0, -2);
            if (iM4305j > length) {
                return null;
            }
            while (!AbstractC1214p.m2661n0(str, strArr[length])) {
                if (length == iM4305j) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final C2180y m5264deprecated_of(String... strArr) {
            AbstractC2980h.m5136e("namesAndValues", strArr);
            return m3960of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: of */
        public final C2180y m3960of(String... strArr) {
            AbstractC2980h.m5136e("namesAndValues", strArr);
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i4 = 0; i4 < length; i4++) {
                String str = strArr2[i4];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i4] = AbstractC1206h.m2645S0(str).toString();
            }
            int iM4305j = AbstractC2429w.m4305j(0, strArr2.length - 1, 2);
            if (iM4305j >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i == iM4305j) {
                        break;
                    }
                    i += 2;
                }
            }
            return new C2180y(strArr2, null);
        }

        private b() {
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final C2180y m5263deprecated_of(Map<String, String> map) {
            AbstractC2980h.m5136e("headers", map);
            return m3959of(map);
        }

        /* renamed from: of */
        public final C2180y m3959of(Map<String, String> map) {
            AbstractC2980h.m5136e("<this>", map);
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = AbstractC1206h.m2645S0(key).toString();
                String string2 = AbstractC1206h.m2645S0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new C2180y(strArr, null);
        }
    }

    public /* synthetic */ C2180y(String[] strArr, AbstractC2977e abstractC2977e) {
        this(strArr);
    }

    /* renamed from: of */
    public static final C2180y m3957of(Map<String, String> map) {
        return Companion.m3959of(map);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m5262deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2180y) && Arrays.equals(this.namesAndValues, ((C2180y) obj).namesAndValues);
    }

    public final String get(String str) {
        AbstractC2980h.m5136e("name", str);
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        AbstractC2980h.m5136e("name", str);
        String str2 = get(str);
        if (str2 != null) {
            return AbstractC2105d.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        AbstractC2980h.m5136e("name", str);
        Date date = getDate(str);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<C1687d> iterator() {
        int size = size();
        C1687d[] c1687dArr = new C1687d[size];
        for (int i = 0; i < size; i++) {
            c1687dArr[i] = new C1687d(name(i), value(i));
        }
        return new C1055b(c1687dArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC2980h.m5135d("CASE_INSENSITIVE_ORDER", comparator);
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC2980h.m5135d("unmodifiableSet(result)", setUnmodifiableSet);
        return setUnmodifiableSet;
    }

    public final a newBuilder() {
        a aVar = new a();
        List<String> namesAndValues$okhttp = aVar.getNamesAndValues$okhttp();
        String[] strArr = this.namesAndValues;
        AbstractC2980h.m5136e("<this>", namesAndValues$okhttp);
        AbstractC2980h.m5136e("elements", strArr);
        namesAndValues$okhttp.addAll(AbstractC1912g.m3724h0(strArr));
        return aVar;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC2980h.m5135d("CASE_INSENSITIVE_ORDER", comparator);
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            Locale locale = Locale.US;
            AbstractC2980h.m5135d("US", locale);
            String lowerCase = strName.toLowerCase(locale);
            AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            String strValue = value(i);
            sb.append(strName);
            sb.append(": ");
            if (AbstractC2278c.isSensitiveHeader(strName)) {
                strValue = "\u2588\u2588";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        AbstractC2980h.m5136e("name", str);
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList == null) {
            return C1921p.f7187j;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC2980h.m5135d("{\n      Collections.unmodifiableList(result)\n    }", listUnmodifiableList);
        return listUnmodifiableList;
    }

    private C2180y(String[] strArr) {
        this.namesAndValues = strArr;
    }

    /* renamed from: of */
    public static final C2180y m3958of(String... strArr) {
        return Companion.m3960of(strArr);
    }
}
