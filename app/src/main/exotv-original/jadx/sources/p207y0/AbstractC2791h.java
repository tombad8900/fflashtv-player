package p207y0;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y0.h */
/* loaded from: classes.dex */
public abstract class AbstractC2791h {
    /* renamed from: a */
    public static void m4901a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* renamed from: b */
    public static FileDescriptor m4902b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* renamed from: c */
    public static long m4903c(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }
}
