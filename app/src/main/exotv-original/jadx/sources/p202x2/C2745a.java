package p202x2;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.drm.RunnableC0348f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x2.a */
/* loaded from: classes.dex */
public final class C2745a {

    /* renamed from: a */
    public final Executor f10122a;

    /* renamed from: b */
    public final InterfaceC2747c f10123b;

    /* renamed from: c */
    public final byte[] f10124c;

    /* renamed from: d */
    public final File f10125d;

    /* renamed from: e */
    public final String f10126e;

    /* renamed from: f */
    public boolean f10127f = false;

    /* renamed from: g */
    public C2746b[] f10128g;

    /* renamed from: h */
    public byte[] f10129h;

    public C2745a(AssetManager assetManager, Executor executor, InterfaceC2747c interfaceC2747c, String str, File file) {
        byte[] bArr;
        this.f10122a = executor;
        this.f10123b = interfaceC2747c;
        this.f10126e = str;
        this.f10125d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                    bArr = AbstractC2748d.f10146h;
                    break;
                case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                    bArr = AbstractC2748d.f10145g;
                    break;
                case AnalyticsListener.EVENT_CUES /* 27 */:
                    bArr = AbstractC2748d.f10144f;
                    break;
                case AnalyticsListener.EVENT_METADATA /* 28 */:
                case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                    bArr = AbstractC2748d.f10143e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC2748d.f10142d;
        }
        this.f10124c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m4806a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f10123b.mo3322d();
            return null;
        }
    }

    /* renamed from: b */
    public final void m4807b(int i, Serializable serializable) {
        this.f10122a.execute(new RunnableC0348f(this, i, serializable, 3));
    }
}
