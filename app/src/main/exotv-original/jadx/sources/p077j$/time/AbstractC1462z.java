package p077j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p077j$.time.zone.C1468f;

/* renamed from: j$.time.z */
/* loaded from: classes2.dex */
public abstract class AbstractC1462z implements Serializable {

    /* renamed from: a */
    public static final Map f5642a;
    private static final long serialVersionUID = 8352817235686L;

    /* renamed from: P */
    public abstract void mo2918P(DataOutput dataOutput);

    /* renamed from: q */
    public abstract String mo2920q();

    /* renamed from: w */
    public abstract C1468f mo2921w();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f5642a = Collections.unmodifiableMap(map);
    }

    /* renamed from: F */
    public static AbstractC1462z m3122F(String str, C1351a0 c1351a0) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(c1351a0, "offset");
        if (str.isEmpty()) {
            return c1351a0;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (c1351a0.f5419b != 0) {
            str = str.concat(c1351a0.f5420c);
        }
        return new C1353b0(str, new C1468f(c1351a0));
    }

    /* renamed from: A */
    public static AbstractC1462z m3121A(String str, boolean z7) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return C1351a0.m2913V(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return m3123I(str, 3, z7);
        }
        if (str.startsWith("UT")) {
            return m3123I(str, 2, z7);
        }
        return C1353b0.m2924V(str, z7);
    }

    /* renamed from: I */
    public static AbstractC1462z m3123I(String str, int i, boolean z7) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return m3122F(strSubstring, C1351a0.f5416f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C1353b0.m2924V(str, z7);
        }
        try {
            C1351a0 c1351a0M2913V = C1351a0.m2913V(str.substring(i));
            if (c1351a0M2913V == C1351a0.f5416f) {
                return m3122F(strSubstring, c1351a0M2913V);
            }
            return m3122F(strSubstring, c1351a0M2913V);
        } catch (C1354c e) {
            throw new C1354c("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public AbstractC1462z() {
        if (getClass() != C1351a0.class && getClass() != C1353b0.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC1462z) {
            return mo2920q().equals(((AbstractC1462z) obj).mo2920q());
        }
        return false;
    }

    public int hashCode() {
        return mo2920q().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return mo2920q();
    }

    private Object writeReplace() {
        return new C1457u((byte) 7, this);
    }
}
