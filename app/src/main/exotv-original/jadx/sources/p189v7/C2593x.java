package p189v7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p182v.C2490e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.x */
/* loaded from: classes.dex */
public final class C2593x extends C2592w {
    /* renamed from: m */
    public static Long m4684m(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p189v7.C2592w, p189v7.AbstractC2585p
    /* renamed from: b */
    public final void mo3156b(C2558b0 c2558b0, C2558b0 c2558b02) throws IOException {
        AbstractC2980h.m5136e("source", c2558b0);
        AbstractC2980h.m5136e("target", c2558b02);
        try {
            Files.move(c2558b0.m4591e(), c2558b02.m4591e(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p189v7.C2592w, p189v7.AbstractC2585p
    /* renamed from: i */
    public final C2490e mo3160i(C2558b0 c2558b0) throws IOException {
        C2558b0 c2558b0M4571c;
        AbstractC2980h.m5136e("path", c2558b0);
        Path pathM4591e = c2558b0.m4591e();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathM4591e, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathM4591e) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C2558b0.f9272k;
                c2558b0M4571c = C2556a0.m4571c(symbolicLink.toString());
            } else {
                c2558b0M4571c = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM4684m = fileTimeCreationTime != null ? m4684m(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM4684m2 = fileTimeLastModifiedTime != null ? m4684m(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C2490e(zIsRegularFile, zIsDirectory, c2558b0M4571c, lValueOf, lM4684m, lM4684m2, fileTimeLastAccessTime != null ? m4684m(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p189v7.C2592w
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
