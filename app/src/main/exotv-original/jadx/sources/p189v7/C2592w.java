package p189v7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import p182v.C2490e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.w */
/* loaded from: classes.dex */
public class C2592w extends AbstractC2585p {
    @Override // p189v7.AbstractC2585p
    /* renamed from: a */
    public final InterfaceC2572i0 mo3155a(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("file", c2558b0);
        File file = c2558b0.toFile();
        Logger logger = AbstractC2594y.f9345a;
        return new C2561d(new FileOutputStream(file, true), 1, new C2582n0());
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: b */
    public void mo3156b(C2558b0 c2558b0, C2558b0 c2558b02) throws IOException {
        AbstractC2980h.m5136e("source", c2558b0);
        AbstractC2980h.m5136e("target", c2558b02);
        if (c2558b0.toFile().renameTo(c2558b02.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c2558b0 + " to " + c2558b02);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: c */
    public final void mo3157c(C2558b0 c2558b0) throws IOException {
        if (c2558b0.toFile().mkdir()) {
            return;
        }
        C2490e c2490eMo3160i = mo3160i(c2558b0);
        if (c2490eMo3160i == null || !c2490eMo3160i.f9090c) {
            throw new IOException("failed to create directory: " + c2558b0);
        }
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: d */
    public final void mo3158d(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("path", c2558b0);
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = c2558b0.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: g */
    public final List mo3159g(C2558b0 c2558b0) throws IOException {
        File file = c2558b0.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + c2558b0);
            }
            throw new FileNotFoundException("no such file: " + c2558b0);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC2980h.m5133b(str);
            arrayList.add(c2558b0.m4590d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: i */
    public C2490e mo3160i(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("path", c2558b0);
        File file = c2558b0.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C2490e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: j */
    public final C2591v mo3161j(C2558b0 c2558b0) {
        return new C2591v(new RandomAccessFile(c2558b0.toFile(), "r"));
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: k */
    public final InterfaceC2572i0 mo3162k(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("file", c2558b0);
        File file = c2558b0.toFile();
        Logger logger = AbstractC2594y.f9345a;
        return new C2561d(new FileOutputStream(file, false), 1, new C2582n0());
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: l */
    public final InterfaceC2576k0 mo3163l(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("file", c2558b0);
        return AbstractC2557b.m4583h(c2558b0.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
