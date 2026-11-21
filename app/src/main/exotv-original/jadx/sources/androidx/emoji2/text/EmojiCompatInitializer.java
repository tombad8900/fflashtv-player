package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.InterfaceC0164v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p014b3.C0565a;
import p014b3.InterfaceC0566b;
import p023c4.C0641e;
import p183v0.C2510j;
import p183v0.C2511k;
import p183v0.C2518r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0566b {
    @Override // p014b3.InterfaceC0566b
    /* renamed from: a */
    public final List mo544a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p014b3.InterfaceC0566b
    /* renamed from: b */
    public final Object mo545b(Context context) {
        Object objM1306b;
        C2518r c2518r = new C2518r(new C0641e(context));
        c2518r.f9138a = 1;
        if (C2510j.f9142k == null) {
            synchronized (C2510j.f9141j) {
                try {
                    if (C2510j.f9142k == null) {
                        C2510j.f9142k = new C2510j(c2518r);
                    }
                } finally {
                }
            }
        }
        C0565a c0565aM1304c = C0565a.m1304c(context);
        c0565aM1304c.getClass();
        synchronized (C0565a.f2270e) {
            try {
                objM1306b = c0565aM1304c.f2271a.get(ProcessLifecycleInitializer.class);
                if (objM1306b == null) {
                    objM1306b = c0565aM1304c.m1306b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0150o abstractC0150oMo224e = ((InterfaceC0164v) objM1306b).mo224e();
        abstractC0150oMo224e.mo568a(new C2511k(this, abstractC0150oMo224e));
        return Boolean.TRUE;
    }
}
