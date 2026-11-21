package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p014b3.InterfaceC0566b;
import p175u0.ChoreographerFrameCallbackC2451c;
import p189v7.C2556a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0566b {
    @Override // p014b3.InterfaceC0566b
    /* renamed from: a */
    public final List mo544a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p014b3.InterfaceC0566b
    /* renamed from: b */
    public final Object mo545b(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC2451c(this, context.getApplicationContext()));
        return new C2556a0(7);
    }
}
