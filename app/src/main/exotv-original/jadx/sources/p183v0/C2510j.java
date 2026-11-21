package p183v0;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.bumptech.glide.AbstractC0714c;
import com.google.android.material.datepicker.RunnableC0748f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005a4.C0073c;
import p090k2.C1584b;
import p130p.C2187f;
import p156s.C2332e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.j */
/* loaded from: classes.dex */
public final class C2510j {

    /* renamed from: j */
    public static final Object f9141j = new Object();

    /* renamed from: k */
    public static volatile C2510j f9142k;

    /* renamed from: a */
    public final ReentrantReadWriteLock f9143a;

    /* renamed from: b */
    public final C2187f f9144b;

    /* renamed from: c */
    public volatile int f9145c;

    /* renamed from: d */
    public final Handler f9146d;

    /* renamed from: e */
    public final C2505e f9147e;

    /* renamed from: f */
    public final InterfaceC2509i f9148f;

    /* renamed from: g */
    public final C1584b f9149g;

    /* renamed from: h */
    public final int f9150h;

    /* renamed from: i */
    public final C2503c f9151i;

    public C2510j(C2518r c2518r) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f9143a = reentrantReadWriteLock;
        this.f9145c = 3;
        InterfaceC2509i interfaceC2509i = (InterfaceC2509i) c2518r.f9139b;
        this.f9148f = interfaceC2509i;
        int i = c2518r.f9138a;
        this.f9150h = i;
        this.f9151i = (C2503c) c2518r.f9140c;
        this.f9146d = new Handler(Looper.getMainLooper());
        this.f9144b = new C2187f(0);
        this.f9149g = new C1584b(23);
        C2505e c2505e = new C2505e(this);
        this.f9147e = c2505e;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f9145c = 0;
            } catch (Throwable th) {
                this.f9143a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m4523b() == 0) {
            try {
                interfaceC2509i.mo1424a(new C2504d(c2505e));
            } catch (Throwable th2) {
                m4525d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C2510j m4522a() {
        C2510j c2510j;
        synchronized (f9141j) {
            try {
                c2510j = f9142k;
                if (!(c2510j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c2510j;
    }

    /* renamed from: b */
    public final int m4523b() {
        this.f9143a.readLock().lock();
        try {
            return this.f9145c;
        } finally {
            this.f9143a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m4524c() {
        if (!(this.f9150h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m4523b() == 1) {
            return;
        }
        this.f9143a.writeLock().lock();
        try {
            if (this.f9145c == 0) {
                return;
            }
            this.f9145c = 0;
            this.f9143a.writeLock().unlock();
            C2505e c2505e = this.f9147e;
            C2510j c2510j = c2505e.f9135a;
            try {
                c2510j.f9148f.mo1424a(new C2504d(c2505e));
            } catch (Throwable th) {
                c2510j.m4525d(th);
            }
        } finally {
            this.f9143a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m4525d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9143a.writeLock().lock();
        try {
            this.f9145c = 2;
            arrayList.addAll(this.f9144b);
            this.f9144b.clear();
            this.f9143a.writeLock().unlock();
            this.f9146d.post(new RunnableC0748f(arrayList, this.f9145c, th));
        } catch (Throwable th2) {
            this.f9143a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #1 {all -> 0x00f7, blocks: (B:59:0x00c1, B:62:0x00c9, B:65:0x00d0, B:44:0x0085), top: B:96:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m4526e(CharSequence charSequence, int i, int i4) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i8;
        int i9;
        C2523w[] c2523wArr;
        if (!(m4523b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC0714c.m1524j("start should be <= than end", i <= i4);
        C2525y c2525y = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC0714c.m1524j("start should be < than charSequence length", i <= charSequence.length());
        AbstractC0714c.m1524j("end should be < than charSequence length", i4 <= charSequence.length());
        if (charSequence.length() == 0 || i == i4) {
            return charSequence;
        }
        C0073c c0073c = this.f9147e.f9136b;
        c0073c.getClass();
        boolean z7 = charSequence instanceof C2521u;
        if (z7) {
            ((C2521u) charSequence).m4534a();
        }
        if (z7) {
            c2525y = new C2525y((Spannable) charSequence);
            if (c2525y != null) {
            }
            i8 = i;
            i9 = i4;
            if (i8 == i9) {
            }
            ((C2521u) charSequence2).m4535b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i4 + 1, C2523w.class) <= i4) {
                    c2525y = new C2525y();
                    c2525y.f9185j = false;
                    c2525y.f9186k = new SpannableString(charSequence);
                }
                if (c2525y != null) {
                    while (i < r5) {
                    }
                }
                i8 = i;
                i9 = i4;
                if (i8 == i9) {
                    charSequence2 = charSequence;
                    if (!z7) {
                    }
                }
                ((C2521u) charSequence2).m4535b();
                return charSequence2;
            }
            try {
                c2525y = new C2525y((Spannable) charSequence);
                if (c2525y != null && (c2523wArr = (C2523w[]) c2525y.f9186k.getSpans(i, i4, C2523w.class)) != null && c2523wArr.length > 0) {
                    for (C2523w c2523w : c2523wArr) {
                        int spanStart = c2525y.f9186k.getSpanStart(c2523w);
                        int spanEnd = c2525y.f9186k.getSpanEnd(c2523w);
                        if (spanStart != i4) {
                            c2525y.removeSpan(c2523w);
                        }
                        i = Math.min(spanStart, i);
                        i4 = Math.max(spanEnd, i4);
                    }
                }
                i8 = i;
                i9 = i4;
                if (i8 == i9 || i8 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z7) {
                        return charSequence2;
                    }
                } else {
                    try {
                        charSequence2 = charSequence;
                    } catch (Throwable th2) {
                        charSequence2 = charSequence;
                        th = th2;
                    }
                    try {
                        C2525y c2525y2 = (C2525y) c0073c.m274H(charSequence2, i8, i9, Integer.MAX_VALUE, false, new C2332e(c2525y, 7, (C1584b) c0073c.f324k));
                        if (c2525y2 != null) {
                            Spannable spannable = c2525y2.f9186k;
                            if (z7) {
                                ((C2521u) charSequence2).m4535b();
                            }
                            return spannable;
                        }
                        if (!z7) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z7) {
                        }
                    }
                }
                ((C2521u) charSequence2).m4535b();
                return charSequence2;
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th = th;
                if (!z7) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z7) {
            throw th;
        }
        ((C2521u) charSequence2).m4535b();
        throw th;
    }

    /* renamed from: f */
    public final void m4527f(AbstractC2508h abstractC2508h) {
        AbstractC0714c.m1529o("initCallback cannot be null", abstractC2508h);
        this.f9143a.writeLock().lock();
        try {
            if (this.f9145c == 1 || this.f9145c == 2) {
                this.f9146d.post(new RunnableC0748f(Arrays.asList(abstractC2508h), this.f9145c, (Throwable) null));
            } else {
                this.f9144b.add(abstractC2508h);
            }
            this.f9143a.writeLock().unlock();
        } catch (Throwable th) {
            this.f9143a.writeLock().unlock();
            throw th;
        }
    }
}
