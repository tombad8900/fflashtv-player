package p121o0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.media3.exoplayer.source.preload.C0456a;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o0.c */
/* loaded from: classes.dex */
public final class C2037c extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0456a f7504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2037c(InputConnection inputConnection, C0456a c0456a) {
        super(inputConnection, false);
        this.f7504a = c0456a;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C1629o c1629o = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c1629o = new C1629o(new C2039e(inputContentInfo));
        }
        if (this.f7504a.m997c(c1629o, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
