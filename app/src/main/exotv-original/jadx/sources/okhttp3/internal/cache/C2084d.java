package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.concurrent.AbstractC2086a;
import okhttp3.internal.concurrent.C2088c;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.p128io.InterfaceC2134b;
import p002a1.AbstractC0008a1;
import p002a1.C0048u;
import p008a7.InterfaceC0113a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p069h7.C1204f;
import p102l6.C1693j;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2587r;
import p189v7.C2562d0;
import p189v7.C2564e0;
import p189v7.C2567g;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2576k0;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.cache.d */
/* loaded from: classes.dex */
public final class C2084d implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final C2088c cleanupQueue;
    private final e cleanupTask;
    private boolean closed;
    private final File directory;
    private final InterfaceC2134b fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private InterfaceC2575k journalWriter;
    private final LinkedHashMap<String, c> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final a Companion = new a(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final C1204f LEGAL_KEY_PATTERN = new C1204f("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$b */
    public final class b {
        private boolean done;
        private final c entry;
        final /* synthetic */ C2084d this$0;
        private final boolean[] written;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.cache.d$b$a */
        public static final class a extends AbstractC2981i implements InterfaceC2851l {
            final /* synthetic */ C2084d this$0;
            final /* synthetic */ b this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2084d c2084d, b bVar) {
                super(1);
                this.this$0 = c2084d;
                this.this$1 = bVar;
            }

            @Override // p212y6.InterfaceC2851l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IOException) obj);
                return C1693j.f6497a;
            }

            public final void invoke(IOException iOException) {
                AbstractC2980h.m5136e("it", iOException);
                C2084d c2084d = this.this$0;
                b bVar = this.this$1;
                synchronized (c2084d) {
                    bVar.detach$okhttp();
                }
            }
        }

        public b(C2084d c2084d, c cVar) {
            AbstractC2980h.m5136e("entry", cVar);
            this.this$0 = c2084d;
            this.entry = cVar;
            this.written = cVar.getReadable$okhttp() ? null : new boolean[c2084d.getValueCount$okhttp()];
        }

        public final void abort() {
            C2084d c2084d = this.this$0;
            synchronized (c2084d) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC2980h.m5132a(this.entry.getCurrentEditor$okhttp(), this)) {
                        c2084d.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            C2084d c2084d = this.this$0;
            synchronized (c2084d) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC2980h.m5132a(this.entry.getCurrentEditor$okhttp(), this)) {
                        c2084d.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (AbstractC2980h.m5132a(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final c getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final InterfaceC2572i0 newSink(int i) {
            C2084d c2084d = this.this$0;
            synchronized (c2084d) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!AbstractC2980h.m5132a(this.entry.getCurrentEditor$okhttp(), this)) {
                        return new C2567g();
                    }
                    if (!this.entry.getReadable$okhttp()) {
                        boolean[] zArr = this.written;
                        AbstractC2980h.m5133b(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new C2085e(c2084d.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i)), new a(c2084d, this));
                    } catch (FileNotFoundException unused) {
                        return new C2567g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final InterfaceC2576k0 newSource(int i) {
            C2084d c2084d = this.this$0;
            synchronized (c2084d) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                InterfaceC2576k0 interfaceC2576k0Source = null;
                if (!this.entry.getReadable$okhttp() || !AbstractC2980h.m5132a(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                    return null;
                }
                try {
                    interfaceC2576k0Source = c2084d.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i));
                } catch (FileNotFoundException unused) {
                }
                return interfaceC2576k0Source;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$c */
    public final class c {
        private final List<File> cleanFiles;
        private b currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ C2084d this$0;
        private boolean zombie;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.cache.d$c$a */
        public static final class a extends AbstractC2587r {
            private boolean closed;
            final /* synthetic */ C2084d this$0;
            final /* synthetic */ c this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2576k0 interfaceC2576k0, C2084d c2084d, c cVar) {
                super(interfaceC2576k0);
                this.this$0 = c2084d;
                this.this$1 = cVar;
            }

            @Override // p189v7.AbstractC2587r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.closed) {
                    return;
                }
                this.closed = true;
                C2084d c2084d = this.this$0;
                c cVar = this.this$1;
                synchronized (c2084d) {
                    cVar.setLockingSourceCount$okhttp(cVar.getLockingSourceCount$okhttp() - 1);
                    if (cVar.getLockingSourceCount$okhttp() == 0 && cVar.getZombie$okhttp()) {
                        c2084d.removeEntry$okhttp(cVar);
                    }
                }
            }
        }

        public c(C2084d c2084d, String str) {
            AbstractC2980h.m5136e("key", str);
            this.this$0 = c2084d;
            this.key = str;
            this.lengths = new long[c2084d.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = c2084d.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final InterfaceC2576k0 newSource(int i) {
            InterfaceC2576k0 interfaceC2576k0Source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return interfaceC2576k0Source;
            }
            this.lockingSourceCount++;
            return new a(interfaceC2576k0Source, this.this$0, this);
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final b getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(b bVar) {
            this.currentEditor = bVar;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            AbstractC2980h.m5136e("strings", list);
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                throw new C0048u();
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                throw new C0048u();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z7) {
            this.readable = z7;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z7) {
            this.zombie = z7;
        }

        public final d snapshot$okhttp() throws IOException {
            C2084d c2084d = this.this$0;
            if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(c2084d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2084d);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            int i = 0;
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i4 = 0; i4 < valueCount$okhttp; i4++) {
                    arrayList.add(newSource(i4));
                }
                return new d(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    AbstractC2278c.closeQuietly((InterfaceC2576k0) obj);
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(InterfaceC2575k interfaceC2575k) {
            AbstractC2980h.m5136e("writer", interfaceC2575k);
            for (long j : this.lengths) {
                interfaceC2575k.writeByte(32).mo4603z(j);
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$d */
    public final class d implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<InterfaceC2576k0> sources;
        final /* synthetic */ C2084d this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(C2084d c2084d, String str, long j, List<? extends InterfaceC2576k0> list, long[] jArr) {
            AbstractC2980h.m5136e("key", str);
            AbstractC2980h.m5136e("sources", list);
            AbstractC2980h.m5136e("lengths", jArr);
            this.this$0 = c2084d;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<InterfaceC2576k0> it = this.sources.iterator();
            while (it.hasNext()) {
                AbstractC2278c.closeQuietly(it.next());
            }
        }

        public final b edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final InterfaceC2576k0 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$e */
    public static final class e extends AbstractC2086a {
        public e(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            C2084d c2084d = C2084d.this;
            synchronized (c2084d) {
                if (!c2084d.initialized || c2084d.getClosed$okhttp()) {
                    return -1L;
                }
                try {
                    c2084d.trimToSize();
                } catch (IOException unused) {
                    c2084d.mostRecentTrimFailed = true;
                }
                try {
                    if (c2084d.journalRebuildRequired()) {
                        c2084d.rebuildJournal$okhttp();
                        c2084d.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    c2084d.mostRecentRebuildFailed = true;
                    c2084d.journalWriter = AbstractC2557b.m4577b(new C2567g());
                }
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$f */
    public static final class f extends AbstractC2981i implements InterfaceC2851l {
        public f() {
            super(1);
        }

        @Override // p212y6.InterfaceC2851l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IOException) obj);
            return C1693j.f6497a;
        }

        public final void invoke(IOException iOException) {
            AbstractC2980h.m5136e("it", iOException);
            C2084d c2084d = C2084d.this;
            if (!AbstractC2278c.assertionsEnabled || Thread.holdsLock(c2084d)) {
                C2084d.this.hasJournalErrors = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2084d);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.d$g */
    public static final class g implements Iterator, InterfaceC0113a {
        private final Iterator<c> delegate;
        private d nextSnapshot;
        private d removeSnapshot;

        public g() {
            Iterator<c> it = new ArrayList(C2084d.this.getLruEntries$okhttp().values()).iterator();
            AbstractC2980h.m5135d("ArrayList(lruEntries.values).iterator()", it);
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            d dVarSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            C2084d c2084d = C2084d.this;
            synchronized (c2084d) {
                if (c2084d.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    c next = this.delegate.next();
                    if (next != null && (dVarSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = dVarSnapshot$okhttp;
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            d dVar = this.removeSnapshot;
            if (dVar == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                C2084d.this.remove(dVar.key());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }

        @Override // java.util.Iterator
        public d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d dVar = this.nextSnapshot;
            this.removeSnapshot = dVar;
            this.nextSnapshot = null;
            AbstractC2980h.m5133b(dVar);
            return dVar;
        }
    }

    public C2084d(InterfaceC2134b interfaceC2134b, File file, int i, int i4, long j, C2090e c2090e) {
        AbstractC2980h.m5136e("fileSystem", interfaceC2134b);
        AbstractC2980h.m5136e("directory", file);
        AbstractC2980h.m5136e("taskRunner", c2090e);
        this.fileSystem = interfaceC2134b;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i4;
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = c2090e.newQueue();
        this.cleanupTask = new e(AbstractC0008a1.m18n(new StringBuilder(), AbstractC2278c.okHttpName, " Cache"));
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ b edit$default(C2084d c2084d, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return c2084d.edit(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final InterfaceC2575k newJournalWriter() {
        return AbstractC2557b.m4577b(new C2085e(this.fileSystem.appendingSink(this.journalFile), new f()));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<c> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            AbstractC2980h.m5135d("i.next()", next);
            c cVar = next;
            int i = 0;
            if (cVar.getCurrentEditor$okhttp() == null) {
                int i4 = this.valueCount;
                while (i < i4) {
                    this.size += cVar.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                cVar.setCurrentEditor$okhttp(null);
                int i8 = this.valueCount;
                while (i < i8) {
                    this.fileSystem.delete(cVar.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(cVar.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(this.fileSystem.source(this.journalFile));
        try {
            String strMo4617n = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n2 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n3 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n4 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            String strMo4617n5 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
            if (!AbstractC2980h.m5132a(MAGIC, strMo4617n) || !AbstractC2980h.m5132a(VERSION_1, strMo4617n2) || !AbstractC2980h.m5132a(String.valueOf(this.appVersion), strMo4617n3) || !AbstractC2980h.m5132a(String.valueOf(this.valueCount), strMo4617n4) || strMo4617n5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo4617n + ", " + strMo4617n2 + ", " + strMo4617n4 + ", " + strMo4617n5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(c2564e0M4578c.mo4617n(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (c2564e0M4578c.mo4614j()) {
                        this.journalWriter = newJournalWriter();
                    } else {
                        rebuildJournal$okhttp();
                    }
                    c2564e0M4578c.close();
                    return;
                }
            }
        } finally {
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iM2627A0 = AbstractC1206h.m2627A0(str, ' ', 0, 6);
        if (iM2627A0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iM2627A0 + 1;
        int iM2627A02 = AbstractC1206h.m2627A0(str, ' ', i, 4);
        if (iM2627A02 == -1) {
            strSubstring = str.substring(i);
            AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
            String str2 = REMOVE;
            if (iM2627A0 == str2.length() && AbstractC1214p.m2667t0(str, str2, false)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM2627A02);
            AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
        }
        c cVar = this.lruEntries.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.lruEntries.put(strSubstring, cVar);
        }
        if (iM2627A02 != -1) {
            String str3 = CLEAN;
            if (iM2627A0 == str3.length() && AbstractC1214p.m2667t0(str, str3, false)) {
                String strSubstring2 = str.substring(iM2627A02 + 1);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring2);
                List<String> listM2638L0 = AbstractC1206h.m2638L0(strSubstring2, new char[]{' '});
                cVar.setReadable$okhttp(true);
                cVar.setCurrentEditor$okhttp(null);
                cVar.setLengths$okhttp(listM2638L0);
                return;
            }
        }
        if (iM2627A02 == -1) {
            String str4 = DIRTY;
            if (iM2627A0 == str4.length() && AbstractC1214p.m2667t0(str, str4, false)) {
                cVar.setCurrentEditor$okhttp(new b(this, cVar));
                return;
            }
        }
        if (iM2627A02 == -1) {
            String str5 = READ;
            if (iM2627A0 == str5.length() && AbstractC1214p.m2667t0(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    private final boolean removeOldestEntry() {
        for (c cVar : this.lruEntries.values()) {
            if (!cVar.getZombie$okhttp()) {
                removeEntry$okhttp(cVar);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.m2624c(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<c> collectionValues = this.lruEntries.values();
                AbstractC2980h.m5135d("lruEntries.values", collectionValues);
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = cVar.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                InterfaceC2575k interfaceC2575k = this.journalWriter;
                AbstractC2980h.m5133b(interfaceC2575k);
                interfaceC2575k.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(b bVar, boolean z7) {
        AbstractC2980h.m5136e("editor", bVar);
        c entry$okhttp = bVar.getEntry$okhttp();
        if (!AbstractC2980h.m5132a(entry$okhttp.getCurrentEditor$okhttp(), bVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z7 && !entry$okhttp.getReadable$okhttp()) {
            int i = this.valueCount;
            for (int i4 = 0; i4 < i; i4++) {
                boolean[] written$okhttp = bVar.getWritten$okhttp();
                AbstractC2980h.m5133b(written$okhttp);
                if (!written$okhttp[i4]) {
                    bVar.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i4))) {
                    bVar.abort();
                    return;
                }
            }
        }
        int i8 = this.valueCount;
        for (int i9 = 0; i9 < i8; i9++) {
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i9);
            if (!z7 || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i9);
                this.fileSystem.rename(file, file2);
                long j = entry$okhttp.getLengths$okhttp()[i9];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i9] = size;
                this.size = (this.size - j) + size;
            }
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        InterfaceC2575k interfaceC2575k = this.journalWriter;
        AbstractC2980h.m5133b(interfaceC2575k);
        if (entry$okhttp.getReadable$okhttp() || z7) {
            entry$okhttp.setReadable$okhttp(true);
            interfaceC2575k.mo4600o(CLEAN).writeByte(32);
            interfaceC2575k.mo4600o(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(interfaceC2575k);
            interfaceC2575k.writeByte(10);
            if (z7) {
                long j8 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j8;
                entry$okhttp.setSequenceNumber$okhttp(j8);
            }
        } else {
            this.lruEntries.remove(entry$okhttp.getKey$okhttp());
            interfaceC2575k.mo4600o(REMOVE).writeByte(32);
            interfaceC2575k.mo4600o(entry$okhttp.getKey$okhttp());
            interfaceC2575k.writeByte(10);
        }
        interfaceC2575k.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final b edit(String str) {
        AbstractC2980h.m5136e("key", str);
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<c> collectionValues = this.lruEntries.values();
            AbstractC2980h.m5135d("lruEntries.values", collectionValues);
            for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                AbstractC2980h.m5135d("entry", cVar);
                removeEntry$okhttp(cVar);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            InterfaceC2575k interfaceC2575k = this.journalWriter;
            AbstractC2980h.m5133b(interfaceC2575k);
            interfaceC2575k.flush();
        }
    }

    public final synchronized d get(String str) {
        AbstractC2980h.m5136e("key", str);
        initialize();
        checkNotClosed();
        validateKey(str);
        c cVar = this.lruEntries.get(str);
        if (cVar == null) {
            return null;
        }
        d dVarSnapshot$okhttp = cVar.snapshot$okhttp();
        if (dVarSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC2575k interfaceC2575k = this.journalWriter;
        AbstractC2980h.m5133b(interfaceC2575k);
        interfaceC2575k.mo4600o(READ).writeByte(32).mo4600o(str).writeByte(10);
        if (journalRebuildRequired()) {
            C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return dVarSnapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final InterfaceC2134b getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, c> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = AbstractC2278c.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e8) {
                    C2385h.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e8.getMessage() + ", removing", 5, e8);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        try {
            InterfaceC2575k interfaceC2575k = this.journalWriter;
            if (interfaceC2575k != null) {
                interfaceC2575k.close();
            }
            C2562d0 c2562d0M4577b = AbstractC2557b.m4577b(this.fileSystem.sink(this.journalFileTmp));
            try {
                c2562d0M4577b.mo4600o(MAGIC);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4600o(VERSION_1);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4603z(this.appVersion);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4603z(this.valueCount);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.writeByte(10);
                for (c cVar : this.lruEntries.values()) {
                    if (cVar.getCurrentEditor$okhttp() != null) {
                        c2562d0M4577b.mo4600o(DIRTY);
                        c2562d0M4577b.writeByte(32);
                        c2562d0M4577b.mo4600o(cVar.getKey$okhttp());
                        c2562d0M4577b.writeByte(10);
                    } else {
                        c2562d0M4577b.mo4600o(CLEAN);
                        c2562d0M4577b.writeByte(32);
                        c2562d0M4577b.mo4600o(cVar.getKey$okhttp());
                        cVar.writeLengths$okhttp(c2562d0M4577b);
                        c2562d0M4577b.writeByte(10);
                    }
                }
                c2562d0M4577b.close();
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean remove(String str) {
        AbstractC2980h.m5136e("key", str);
        initialize();
        checkNotClosed();
        validateKey(str);
        c cVar = this.lruEntries.get(str);
        if (cVar == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(cVar);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(c cVar) {
        InterfaceC2575k interfaceC2575k;
        AbstractC2980h.m5136e("entry", cVar);
        if (!this.civilizedFileSystem) {
            if (cVar.getLockingSourceCount$okhttp() > 0 && (interfaceC2575k = this.journalWriter) != null) {
                interfaceC2575k.mo4600o(DIRTY);
                interfaceC2575k.writeByte(32);
                interfaceC2575k.mo4600o(cVar.getKey$okhttp());
                interfaceC2575k.writeByte(10);
                interfaceC2575k.flush();
            }
            if (cVar.getLockingSourceCount$okhttp() > 0 || cVar.getCurrentEditor$okhttp() != null) {
                cVar.setZombie$okhttp(true);
                return true;
            }
        }
        b currentEditor$okhttp = cVar.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i4 = 0; i4 < i; i4++) {
            this.fileSystem.delete(cVar.getCleanFiles$okhttp().get(i4));
            this.size -= cVar.getLengths$okhttp()[i4];
            cVar.getLengths$okhttp()[i4] = 0;
        }
        this.redundantOpCount++;
        InterfaceC2575k interfaceC2575k2 = this.journalWriter;
        if (interfaceC2575k2 != null) {
            interfaceC2575k2.mo4600o(REMOVE);
            interfaceC2575k2.writeByte(32);
            interfaceC2575k2.mo4600o(cVar.getKey$okhttp());
            interfaceC2575k2.writeByte(10);
        }
        this.lruEntries.remove(cVar.getKey$okhttp());
        if (journalRebuildRequired()) {
            C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z7) {
        this.closed = z7;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<d> snapshots() {
        initialize();
        return new g();
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized b edit(String str, long j) {
        AbstractC2980h.m5136e("key", str);
        initialize();
        checkNotClosed();
        validateKey(str);
        c cVar = this.lruEntries.get(str);
        if (j != ANY_SEQUENCE_NUMBER && (cVar == null || cVar.getSequenceNumber$okhttp() != j)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC2575k interfaceC2575k = this.journalWriter;
            AbstractC2980h.m5133b(interfaceC2575k);
            interfaceC2575k.mo4600o(DIRTY).writeByte(32).mo4600o(str).writeByte(10);
            interfaceC2575k.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, str);
                this.lruEntries.put(str, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.setCurrentEditor$okhttp(bVar);
            return bVar;
        }
        C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}
