package okhttp3.internal.p128io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2594y;
import p189v7.C2561d;
import p189v7.C2582n0;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.io.a */
/* loaded from: classes.dex */
public final class C2133a {
    static final /* synthetic */ C2133a $$INSTANCE = new C2133a();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.io.a$a */
    public static final class a implements InterfaceC2134b {
        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public InterfaceC2572i0 appendingSink(File file) {
            AbstractC2980h.m5136e("file", file);
            int i = 1;
            try {
                Logger logger = AbstractC2594y.f9345a;
                return new C2561d(new FileOutputStream(file, true), i, new C2582n0());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = AbstractC2594y.f9345a;
                return new C2561d(new FileOutputStream(file, true), i, new C2582n0());
            }
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public void delete(File file) throws IOException {
            AbstractC2980h.m5136e("file", file);
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public void deleteContents(File file) throws IOException {
            AbstractC2980h.m5136e("directory", file);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public boolean exists(File file) {
            AbstractC2980h.m5136e("file", file);
            return file.exists();
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public void rename(File file, File file2) throws IOException {
            AbstractC2980h.m5136e("from", file);
            AbstractC2980h.m5136e("to", file2);
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public InterfaceC2572i0 sink(File file) {
            AbstractC2980h.m5136e("file", file);
            int i = 1;
            try {
                Logger logger = AbstractC2594y.f9345a;
                return new C2561d(new FileOutputStream(file, false), i, new C2582n0());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = AbstractC2594y.f9345a;
                return new C2561d(new FileOutputStream(file, false), i, new C2582n0());
            }
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public long size(File file) {
            AbstractC2980h.m5136e("file", file);
            return file.length();
        }

        @Override // okhttp3.internal.p128io.InterfaceC2134b
        public InterfaceC2576k0 source(File file) {
            AbstractC2980h.m5136e("file", file);
            return AbstractC2557b.m4583h(file);
        }

        public String toString() {
            return "FileSystem.SYSTEM";
        }
    }

    private C2133a() {
    }
}
