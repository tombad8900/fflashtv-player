package com.bumptech.glide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p118n4.C2019p;
import p118n4.InterfaceC2004a;
import p144q4.InterfaceC2267c;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.l */
/* loaded from: classes.dex */
public final class C0723l implements InterfaceC2004a {

    /* renamed from: a */
    public final C2019p f2842a;

    /* renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C0738m f2843b;

    public C0723l(ComponentCallbacks2C0738m componentCallbacks2C0738m, C2019p c2019p) {
        this.f2843b = componentCallbacks2C0738m;
        this.f2842a = c2019p;
    }

    @Override // p118n4.InterfaceC2004a
    /* renamed from: a */
    public final void mo1640a(boolean z7) {
        if (z7) {
            synchronized (this.f2843b) {
                C2019p c2019p = this.f2842a;
                ArrayList arrayListM4457e = AbstractC2478m.m4457e((Set) c2019p.f7450l);
                int size = arrayListM4457e.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListM4457e.get(i);
                    i++;
                    InterfaceC2267c interfaceC2267c = (InterfaceC2267c) obj;
                    if (!interfaceC2267c.mo4074i() && !interfaceC2267c.mo4071f()) {
                        interfaceC2267c.clear();
                        if (c2019p.f7449k) {
                            ((HashSet) c2019p.f7451m).add(interfaceC2267c);
                        } else {
                            interfaceC2267c.mo4073h();
                        }
                    }
                }
            }
        }
    }
}
