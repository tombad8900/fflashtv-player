package p062h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p002a1.AbstractC0026j;
import p063h1.AbstractC1118i0;
import p063h1.AbstractC1128s;
import p063h1.C1129t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.u */
/* loaded from: classes.dex */
public final class C1095u extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f4635a;

    /* renamed from: b */
    public final /* synthetic */ Object f4636b;

    public /* synthetic */ C1095u(int i, Object obj) {
        this.f4635a = i;
        this.f4636b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4635a) {
            case 0:
                ((AbstractC0026j) this.f4636b).mo96i();
                break;
            default:
                C1129t c1129t = (C1129t) this.f4636b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                                    default:
                                        i = 6;
                                        break;
                                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (AbstractC1118i0.f4750a >= 29) {
                                            i = 9;
                                            break;
                                        }
                                        break;
                                }
                            } else if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i = type != 9 ? 8 : 7;
                                    }
                                }
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (AbstractC1118i0.f4750a >= 31 && i == 5) {
                    AbstractC1128s.m2477a(context, c1129t);
                    break;
                } else {
                    C1129t.m2478a(i, c1129t);
                    break;
                }
                break;
        }
    }
}
