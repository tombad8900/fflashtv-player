package androidx.media3.common;

import java.util.HashSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0229p0 {

    /* renamed from: a */
    public static final HashSet f1278a = new HashSet();

    /* renamed from: b */
    public static String f1279b = "media3.common";

    /* renamed from: a */
    public static synchronized void m658a(String str) {
        if (f1278a.add(str)) {
            f1279b += ", " + str;
        }
    }
}
