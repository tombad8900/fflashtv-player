package androidx.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.C0275R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002a1.C0016e;
import p011b0.AbstractC0538d;
import p011b0.AbstractC0542h;
import p011b0.AbstractC0543i;
import p011b0.C0541g;
import p063h1.AbstractC1118i0;
import p130p.C2187f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final C0541g notificationBuilder;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api31 {
        private Api31() {
        }

        @SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(C0541g c0541g) {
            c0541g.f2216n = 1;
        }
    }

    public DownloadNotificationHelper(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        C0541g c0541g = new C0541g();
        c0541g.f2204b = new ArrayList();
        c0541g.f2205c = new ArrayList();
        c0541g.f2206d = new ArrayList();
        c0541g.f2209g = true;
        c0541g.f2216n = 0;
        Notification notification = new Notification();
        c0541g.f2218p = notification;
        c0541g.f2203a = applicationContext;
        c0541g.f2215m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        c0541g.f2219q = new ArrayList();
        c0541g.f2217o = true;
        this.notificationBuilder = c0541g;
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i4) {
        return buildNotification(context, i, pendingIntent, str, i4, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i4, int i8, int i9, boolean z7, boolean z8, boolean z9) {
        C0016e c0016e;
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        String str2 = str;
        C0541g c0541g = this.notificationBuilder;
        c0541g.f2218p.icon = i;
        String string = i4 == 0 ? null : context.getResources().getString(i4);
        CharSequence charSequenceSubSequence = string;
        if (string != null) {
            int length = string.length();
            charSequenceSubSequence = string;
            if (length > 5120) {
                charSequenceSubSequence = string.subSequence(0, 5120);
            }
        }
        c0541g.f2207e = charSequenceSubSequence;
        C0541g c0541g2 = this.notificationBuilder;
        c0541g2.f2208f = pendingIntent;
        if (str2 == null) {
            c0016e = null;
        } else {
            c0016e = new C0016e(5, false);
            int length2 = str2.length();
            CharSequence charSequenceSubSequence2 = str2;
            if (length2 > 5120) {
                charSequenceSubSequence2 = str2.subSequence(0, 5120);
            }
            c0016e.f63l = charSequenceSubSequence2;
        }
        c0541g2.m1269a(c0016e);
        C0541g c0541g3 = this.notificationBuilder;
        c0541g3.f2211i = i8;
        c0541g3.f2212j = i9;
        c0541g3.f2213k = z7;
        Notification notification = c0541g3.f2218p;
        if (z8) {
            notification.flags |= 2;
        } else {
            notification.flags &= -3;
        }
        c0541g3.f2209g = z9;
        if (AbstractC1118i0.f4750a >= 31) {
            Api31.setForegroundServiceBehavior(c0541g3);
        }
        C0541g c0541g4 = this.notificationBuilder;
        c0541g4.getClass();
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Context context2 = c0541g4.f2203a;
        ArrayList arrayList2 = c0541g4.f2219q;
        ArrayList arrayList3 = c0541g4.f2205c;
        String str3 = c0541g4.f2215m;
        ArrayList arrayList4 = c0541g4.f2206d;
        int i11 = Build.VERSION.SDK_INT;
        Notification.Builder builderM1270a = i11 >= 26 ? AbstractC0542h.m1270a(context2, str3) : new Notification.Builder(context2);
        Notification notification2 = c0541g4.f2218p;
        builderM1270a.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c0541g4.f2207e).setContentText(null).setContentInfo(null).setContentIntent(c0541g4.f2208f).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(c0541g4.f2211i, c0541g4.f2212j, c0541g4.f2213k);
        builderM1270a.setLargeIcon((Icon) null);
        builderM1270a.setSubText(null).setUsesChronometer(false).setPriority(0);
        Iterator it = c0541g4.f2204b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Bundle bundle3 = c0541g4.f2214l;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        builderM1270a.setShowWhen(c0541g4.f2209g);
        builderM1270a.setLocalOnly(false);
        builderM1270a.setGroup(null);
        builderM1270a.setSortKey(null);
        builderM1270a.setGroupSummary(false);
        builderM1270a.setCategory(null);
        builderM1270a.setColor(0);
        builderM1270a.setVisibility(0);
        builderM1270a.setPublicVersion(null);
        builderM1270a.setSound(notification2.sound, notification2.audioAttributes);
        if (i11 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2187f c2187f = new C2187f(arrayList2.size() + arrayList.size());
                    c2187f.addAll(arrayList);
                    c2187f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c2187f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                builderM1270a.addPerson((String) obj);
            }
        }
        if (arrayList4.size() > 0) {
            if (c0541g4.f2214l == null) {
                c0541g4.f2214l = new Bundle();
            }
            Bundle bundle4 = c0541g4.f2214l.getBundle("android.car.EXTENSIONS");
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            if (arrayList4.size() > 0) {
                Integer.toString(0);
                if (arrayList4.get(0) != null) {
                    throw new ClassCastException();
                }
                new Bundle();
                throw null;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (c0541g4.f2214l == null) {
                c0541g4.f2214l = new Bundle();
            }
            c0541g4.f2214l.putBundle("android.car.EXTENSIONS", bundle4);
            bundle2.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i13 = Build.VERSION.SDK_INT;
        builderM1270a.setExtras(c0541g4.f2214l);
        builderM1270a.setRemoteInputHistory(null);
        if (i13 >= 26) {
            AbstractC0542h.m1271b(builderM1270a);
            AbstractC0542h.m1273d(builderM1270a);
            AbstractC0542h.m1274e(builderM1270a);
            AbstractC0542h.m1275f(builderM1270a);
            AbstractC0542h.m1272c(builderM1270a);
            if (!TextUtils.isEmpty(str3)) {
                builderM1270a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i13 >= 29) {
            AbstractC0538d.m1266b(builderM1270a, c0541g4.f2217o);
            AbstractC0538d.m1267c(builderM1270a);
        }
        if (i13 >= 31 && (i10 = c0541g4.f2216n) != 0) {
            AbstractC0543i.m1276a(builderM1270a, i10);
        }
        C0016e c0016e2 = c0541g4.f2210h;
        if (c0016e2 != null) {
            new Notification.BigTextStyle(builderM1270a).setBigContentTitle(null).bigText((CharSequence) c0016e2.f63l);
        }
        Notification notificationBuild = i13 >= 26 ? builderM1270a.build() : builderM1270a.build();
        if (c0016e2 != null) {
            c0541g4.f2210h.getClass();
        }
        if (c0016e2 != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C0275R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C0275R.string.exo_download_failed);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list, int i4) {
        int i8;
        int i9;
        boolean z7;
        int i10;
        int i11;
        boolean z8;
        float f8 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = true;
        for (int i13 = 0; i13 < list.size(); i13++) {
            Download download = list.get(i13);
            int i14 = download.state;
            if (i14 == 0) {
                z11 = true;
            } else if (i14 == 2) {
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f8 += percentDownloaded;
                    z14 = false;
                }
                z12 |= download.getBytesDownloaded() > 0;
                i12++;
                z10 = true;
            } else if (i14 == 5) {
                z13 = true;
            } else if (i14 != 7) {
            }
        }
        if (z10) {
            i9 = C0275R.string.exo_download_downloading;
        } else {
            if (z11 && i4 != 0) {
                i8 = (i4 & 2) != 0 ? C0275R.string.exo_download_paused_for_wifi : (i4 & 1) != 0 ? C0275R.string.exo_download_paused_for_network : C0275R.string.exo_download_paused;
                z7 = false;
                if (z7) {
                }
                return buildNotification(context, i, pendingIntent, str, i8, i10, i11, z8, true, false);
            }
            if (!z13) {
                i8 = 0;
                z7 = true;
                if (z7) {
                    if (z10) {
                        int i15 = (int) (f8 / i12);
                        if (z14 && z12) {
                            z9 = true;
                        }
                        i11 = i15;
                        z8 = z9;
                    } else {
                        i11 = 0;
                        z8 = true;
                    }
                    i10 = 100;
                } else {
                    i10 = 0;
                    i11 = 0;
                    z8 = false;
                }
                return buildNotification(context, i, pendingIntent, str, i8, i10, i11, z8, true, false);
            }
            i9 = C0275R.string.exo_download_removing;
        }
        i8 = i9;
        z7 = true;
        if (z7) {
        }
        return buildNotification(context, i, pendingIntent, str, i8, i10, i11, z8, true, false);
    }
}
