package p005a4;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.i0 */
/* loaded from: classes.dex */
public final class C0086i0 implements Handler.Callback {

    /* renamed from: j */
    public final /* synthetic */ int f384j;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f384j) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC0080f0) message.obj).mo305b();
                return true;
            default:
                int i = message.what;
                if (i == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
        }
    }
}
