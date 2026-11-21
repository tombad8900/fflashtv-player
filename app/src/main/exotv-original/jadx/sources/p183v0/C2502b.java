package p183v0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p090k2.C1584b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.b */
/* loaded from: classes.dex */
public final class C2502b extends C1584b {
    @Override // p090k2.C1584b
    /* renamed from: r */
    public final Signature[] mo3261r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
