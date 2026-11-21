package p062h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import androidx.media3.exoplayer.dash.offline.ExecutorC0339a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p011b0.AbstractC0537c;
import p070i0.C1219d;
import p070i0.C1220e;
import p130p.C2182a;
import p130p.C2187f;
import p202x2.AbstractC2748d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1085k implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f4605j;

    /* renamed from: k */
    public final /* synthetic */ Context f4606k;

    public /* synthetic */ RunnableC1085k(Context context, int i) {
        this.f4605j = i;
        this.f4606k = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        C1219d c1219d;
        Object systemService;
        Context context;
        switch (this.f4605j) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f4606k;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            C2187f c2187f = AbstractC1089o.f4618p;
                            c2187f.getClass();
                            C2182a c2182a = new C2182a(c2187f);
                            while (true) {
                                if (c2182a.hasNext()) {
                                    AbstractC1089o abstractC1089o = (AbstractC1089o) ((WeakReference) c2182a.next()).get();
                                    if (abstractC1089o != null && (context = ((LayoutInflaterFactory2C1098x) abstractC1089o).f4699t) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            c1219d = systemService != null ? new C1219d(new C1220e(AbstractC1086l.m2297g(systemService))) : C1219d.f5101b;
                            if (c1219d.f5102a.f5103a.isEmpty()) {
                                String strM1264e = AbstractC0537c.m1264e(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC1086l.m2298h(systemService2, LocaleList.forLanguageTags(strM1264e));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            c1219d = AbstractC1089o.f4614l;
                            if (c1219d == null) {
                            }
                            if (c1219d.f5102a.f5103a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC1089o.f4617o = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1085k(this.f4606k, 2));
                break;
            default:
                AbstractC2748d.m4827t(this.f4606k, new ExecutorC0339a(), AbstractC2748d.f10139a, false);
                break;
        }
    }
}
