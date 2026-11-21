package p195w4;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.content.FileProvider;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.RunnableC0321j;
import com.exotv.net.MainActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p002a1.AbstractC0008a1;
import p069h7.C1215q;
import p220z6.AbstractC2980h;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.b */
/* loaded from: classes.dex */
public final class C2649b {

    /* renamed from: a */
    public final MainActivity f9643a;

    /* renamed from: b */
    public final ExecutorService f9644b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public final Handler f9645c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public volatile String f9646d = null;

    /* renamed from: e */
    public long f9647e;

    public C2649b(MainActivity mainActivity) {
        File[] fileArrListFiles;
        this.f9643a = mainActivity;
        File file = new File(mainActivity.getFilesDir(), "update_apk");
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }

    /* renamed from: a */
    public final void m4751a(String str, File file, final C1215q c1215q) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC2980h.m5134c("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setRequestProperty("User-Agent", "exoTV-updater (Android)");
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (200 > responseCode || responseCode >= 300) {
                throw new IOException("Server returned HTTP " + responseCode + " \u2014 the update link may be invalid.");
            }
            final long contentLengthLong = httpURLConnection.getContentLengthLong();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED];
                    long j = 0;
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i < 0) {
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        final long j8 = i + j;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime2 - this.f9647e >= 100) {
                            this.f9647e = jElapsedRealtime2;
                            this.f9645c.post(new Runnable() { // from class: w4.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c1215q.mo576c(Long.valueOf(j8), Long.valueOf(contentLengthLong));
                                }
                            });
                        }
                        if (SystemClock.elapsedRealtime() - jElapsedRealtime > 900000) {
                            throw new IOException("Download timed out \u2014 connection too slow, please retry.");
                        }
                        j = j8;
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: b */
    public final void m4752b(File file) throws IOException {
        MainActivity mainActivity = this.f9643a;
        try {
            Uri uriM521d = FileProvider.m521d(mainActivity, mainActivity.getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriM521d, "application/vnd.android.package-archive");
            intent.addFlags(268435457);
            PackageManager packageManager = mainActivity.getPackageManager();
            List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : packageManager.queryIntentActivities(intent, 65536);
            AbstractC2980h.m5133b(listQueryIntentActivities);
            if (listQueryIntentActivities.isEmpty()) {
                throw new IOException("No system installer found on this device to open the update.");
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                try {
                    mainActivity.grantUriPermission(resolveInfo.activityInfo.packageName, uriM521d, 1);
                } catch (Throwable th) {
                    Log.w("ApkInstaller", "URI grant failed for " + resolveInfo.activityInfo.packageName, th);
                }
            }
            C2986n c2986n = new C2986n();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f9645c.post(new RunnableC0321j(this, intent, c2986n, countDownLatch, 2));
            try {
                if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                    throw new IOException("Timed out opening the system installer.");
                }
                Throwable th2 = (Throwable) c2986n.f11117j;
                if (th2 != null) {
                    throw new IOException(AbstractC0008a1.m25u("Could not open the system installer: ", th2.getMessage()));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while opening the system installer.");
            }
        } catch (Throwable th3) {
            throw new IOException(AbstractC0008a1.m25u("Could not share the update file with the installer: ", th3.getMessage()));
        }
    }

    /* renamed from: c */
    public final void m4753c(File file) throws PackageManager.NameNotFoundException, IOException {
        long length = file.length();
        if (length < 500000) {
            throw new IOException("Downloaded file too small (" + length + " bytes) \u2014 the update link did not return a full APK.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[4];
            int i = 0;
            while (i < 4) {
                int i4 = fileInputStream.read(bArr, i, 4 - i);
                if (i4 < 0) {
                    break;
                } else {
                    i += i4;
                }
            }
            if (bArr[0] != 80 || bArr[1] != 75 || bArr[2] != 3 || bArr[3] != 4) {
                throw new IOException("Downloaded file is not an APK (bad header) \u2014 the link may have returned an error page.");
            }
            fileInputStream.close();
            MainActivity mainActivity = this.f9643a;
            PackageManager packageManager = mainActivity.getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 0);
            if (packageArchiveInfo == null) {
                throw new IOException("Downloaded file is not a valid APK (cannot be parsed).");
            }
            if (!AbstractC2980h.m5132a(packageArchiveInfo.packageName, mainActivity.getPackageName())) {
                throw new IOException(AbstractC0008a1.m17m("Update file is for a different app (", packageArchiveInfo.packageName, ") \u2014 wrong APK on the server."));
            }
            int i8 = Build.VERSION.SDK_INT;
            if ((i8 >= 28 ? packageArchiveInfo.getLongVersionCode() : packageArchiveInfo.versionCode) < (i8 >= 28 ? packageManager.getPackageInfo(mainActivity.getPackageName(), 0).getLongVersionCode() : r8.versionCode)) {
                throw new IOException("This update is older than the installed app \u2014 nothing to install.");
            }
        } finally {
        }
    }
}
