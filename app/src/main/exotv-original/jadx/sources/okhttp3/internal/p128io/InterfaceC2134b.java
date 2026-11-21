package okhttp3.internal.p128io;

import java.io.File;
import okhttp3.internal.p128io.C2133a;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.io.b */
/* loaded from: classes.dex */
public interface InterfaceC2134b {
    public static final C2133a Companion = C2133a.$$INSTANCE;
    public static final InterfaceC2134b SYSTEM = new C2133a.a();

    InterfaceC2572i0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    InterfaceC2572i0 sink(File file);

    long size(File file);

    InterfaceC2576k0 source(File file);
}
