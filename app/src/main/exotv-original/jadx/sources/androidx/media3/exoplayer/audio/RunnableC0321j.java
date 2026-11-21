package androidx.media3.exoplayer.audio;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Log;
import androidx.media3.exoplayer.audio.AudioSink;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p069h7.C1215q;
import p195w4.C2649b;
import p195w4.C2658e;
import p220z6.AbstractC2980h;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0321j implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1682j;

    /* renamed from: k */
    public final /* synthetic */ Object f1683k;

    /* renamed from: l */
    public final /* synthetic */ Object f1684l;

    /* renamed from: m */
    public final /* synthetic */ Object f1685m;

    /* renamed from: n */
    public final /* synthetic */ Object f1686n;

    public /* synthetic */ RunnableC0321j(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1682j = i;
        this.f1683k = obj;
        this.f1684l = obj2;
        this.f1685m = obj3;
        this.f1686n = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM1539y;
        File file;
        File file2;
        int i;
        switch (this.f1682j) {
            case 0:
                DefaultAudioSink.lambda$releaseAudioTrackAsync$1((AudioTrack) this.f1683k, (AudioSink.Listener) this.f1684l, (Handler) this.f1685m, (AudioSink.AudioTrackConfig) this.f1686n);
                return;
            case 1:
                C2649b c2649b = (C2649b) this.f1683k;
                String str = (String) this.f1684l;
                C1215q c1215q = (C1215q) this.f1685m;
                C2658e c2658e = (C2658e) this.f1686n;
                try {
                    file = new File(c2649b.f9643a.getFilesDir(), "update_apk");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    file2 = new File(file, "exotv_update.apk");
                    if (file2.exists() && file2.length() > 0 && AbstractC2980h.m5132a(c2649b.f9646d, str)) {
                        Log.i("ApkInstaller", "Reusing staged APK (" + file2.length() + " bytes), skipping download");
                    } else {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            for (File file3 : fileArrListFiles) {
                                file3.delete();
                            }
                        }
                        c2649b.f9646d = null;
                        c2649b.m4751a(str, file2, c1215q);
                        if (!file2.exists() || file2.length() == 0) {
                            throw new IllegalStateException("Downloaded APK is empty");
                        }
                        c2649b.f9646d = str;
                    }
                } catch (Throwable th) {
                    objM1539y = AbstractC0714c.m1539y(th);
                }
                try {
                    c2649b.m4753c(file2);
                    c2649b.m4752b(file2);
                    objM1539y = "ok";
                    c2649b.f9645c.post(new RunnableC0320i(c2658e, 11, objM1539y));
                    return;
                } catch (IOException e) {
                    File[] fileArrListFiles2 = file.listFiles();
                    if (fileArrListFiles2 != null) {
                        for (File file4 : fileArrListFiles2) {
                            file4.delete();
                        }
                    }
                    c2649b.f9646d = null;
                    throw e;
                }
            default:
                MainActivity mainActivity = ((C2649b) this.f1683k).f9643a;
                Intent intent = (Intent) this.f1684l;
                C2986n c2986n = (C2986n) this.f1685m;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1686n;
                try {
                    if (mainActivity.isFinishing()) {
                        mainActivity.startActivity(intent);
                    } else {
                        mainActivity.startActivity(intent);
                    }
                    Log.i("ApkInstaller", "Launched system installer UI");
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
