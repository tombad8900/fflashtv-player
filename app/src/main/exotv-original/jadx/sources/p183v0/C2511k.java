package p183v0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.InterfaceC0128d;
import androidx.lifecycle.InterfaceC0164v;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.k */
/* loaded from: classes.dex */
public final class C2511k implements InterfaceC0128d {

    /* renamed from: j */
    public final /* synthetic */ AbstractC0150o f9152j;

    public C2511k(EmojiCompatInitializer emojiCompatInitializer, AbstractC0150o abstractC0150o) {
        this.f9152j = abstractC0150o;
    }

    @Override // androidx.lifecycle.InterfaceC0128d
    /* renamed from: b */
    public final void mo554b(InterfaceC0164v interfaceC0164v) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC2501a.m4505a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2513m(), 500L);
        this.f9152j.mo575i(this);
    }
}
