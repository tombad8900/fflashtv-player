package p063h1;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.media3.exoplayer.offline.DownloadService;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.u */
/* loaded from: classes.dex */
public abstract class AbstractC1130u {
    /* renamed from: a */
    public static void m2483a(DownloadService downloadService, String str, int i, int i4) {
        if (AbstractC1118i0.f4750a >= 26) {
            NotificationManager notificationManager = (NotificationManager) downloadService.getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, downloadService.getString(i), 2);
            if (i4 != 0) {
                notificationChannel.setDescription(downloadService.getString(i4));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
