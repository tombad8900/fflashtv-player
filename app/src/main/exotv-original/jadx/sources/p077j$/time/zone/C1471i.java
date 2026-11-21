package p077j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: j$.time.zone.i */
/* loaded from: classes2.dex */
public final class C1471i {

    /* renamed from: b */
    public static final CopyOnWriteArrayList f5674b;

    /* renamed from: c */
    public static final ConcurrentMap f5675c;

    /* renamed from: d */
    public static volatile Set f5676d;

    /* renamed from: a */
    public final Set f5677a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f5674b = copyOnWriteArrayList;
        f5675c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C1470h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* renamed from: a */
    public static C1468f m3138a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f5675c;
        C1471i c1471i = (C1471i) concurrentHashMap.get(str);
        if (c1471i == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new C1469g("No time-zone data files registered");
            }
            throw new C1469g("Unknown time-zone ID: ".concat(str));
        }
        if (c1471i.f5677a.contains(str)) {
            return new C1468f(TimeZone.getTimeZone(str));
        }
        throw new C1469g("Not a built-in time zone: ".concat(str));
    }

    /* renamed from: b */
    public static void m3139b(C1471i c1471i) {
        Objects.requireNonNull(c1471i, "provider");
        synchronized (C1471i.class) {
            try {
                for (String str : c1471i.f5677a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((C1471i) ((ConcurrentHashMap) f5675c).putIfAbsent(str, c1471i)) != null) {
                        throw new C1469g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c1471i);
                    }
                }
                f5676d = Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) f5675c).keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f5674b.add(c1471i);
    }

    public C1471i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f5677a = Collections.unmodifiableSet(linkedHashSet);
    }
}
