package p193w2;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.lifecycle.RunnableC0127c0;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.z */
/* loaded from: classes.dex */
public final class C2638z {

    /* renamed from: a */
    public SurfaceSyncGroup f9601a;

    /* renamed from: a */
    public static /* synthetic */ void m4732a(C2638z c2638z, SurfaceView surfaceView, RunnableC0127c0 runnableC0127c0) {
        c2638z.getClass();
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        c2638z.f9601a = surfaceSyncGroup;
        AbstractC1101a.m2359j(surfaceSyncGroup.add(rootSurfaceControl, new RunnableC2637y()));
        runnableC0127c0.run();
        rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
    }

    /* renamed from: b */
    public final void m4733b() {
        SurfaceSyncGroup surfaceSyncGroup = this.f9601a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.f9601a = null;
        }
    }
}
