package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.offline.DownloadHelper;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.offline.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0408c implements Handler.Callback {

    /* renamed from: j */
    public final /* synthetic */ int f1789j;

    /* renamed from: k */
    public final /* synthetic */ Object f1790k;

    public /* synthetic */ C0408c(int i, Object obj) {
        this.f1789j = i;
        this.f1790k = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1789j) {
            case 0:
                return ((DownloadHelper.MediaPreparer) this.f1790k).handleDownloadHelperCallbackMessage(message);
            default:
                return ((DownloadManager) this.f1790k).handleMainMessage(message);
        }
    }
}
