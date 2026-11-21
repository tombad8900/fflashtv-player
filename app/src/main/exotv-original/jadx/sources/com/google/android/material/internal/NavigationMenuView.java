package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p095l.InterfaceC1612b0;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1612b0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // p095l.InterfaceC1612b0
    /* renamed from: c */
    public final void mo442c(MenuC1627m menuC1627m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
