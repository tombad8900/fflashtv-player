package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.exotv.net.R;
import java.util.Calendar;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p216z2.C2890g0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public final class C0766x extends AbstractC2923x {

    /* renamed from: d */
    public final C0741b f3324d;

    /* renamed from: e */
    public final C0750h f3325e;

    /* renamed from: f */
    public final C0750h f3326f;

    /* renamed from: g */
    public final int f3327g;

    /* renamed from: h */
    public C0761s f3328h;

    /* renamed from: i */
    public int f3329i = 0;

    public C0766x(ContextThemeWrapper contextThemeWrapper, C0741b c0741b, C0750h c0750h, C0750h c0750h2) {
        C0761s c0761s = c0741b.f3228j;
        C0761s c0761s2 = c0741b.f3229k;
        C0761s c0761s3 = c0741b.f3231m;
        if (c0761s.f3306j.compareTo(c0761s3.f3306j) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0761s3.f3306j.compareTo(c0761s2.f3306j) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f3327g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0762t.f3313d) + (C0759q.m1860K(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f3324d = c0741b;
        this.f3325e = c0750h;
        this.f3326f = c0750h2;
        this.f3328h = c0761s3;
        if (this.f10870a.m5086a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f10871b = true;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        return this.f3324d.f3234p;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: b */
    public final long mo1467b(int i) {
        Calendar calendarM1845a = AbstractC0742b0.m1845a(this.f3324d.f3228j.f3306j);
        calendarM1845a.add(2, i);
        calendarM1845a.set(5, 1);
        Calendar calendarM1845a2 = AbstractC0742b0.m1845a(calendarM1845a);
        calendarM1845a2.get(2);
        calendarM1845a2.get(1);
        calendarM1845a2.getMaximum(7);
        calendarM1845a2.getActualMaximum(5);
        calendarM1845a2.getTimeInMillis();
        return calendarM1845a2.getTimeInMillis();
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    public final void mo1456d(AbstractC2920v0 abstractC2920v0, int i) {
        C0765w c0765w = (C0765w) abstractC2920v0;
        C0741b c0741b = this.f3324d;
        Calendar calendarM1845a = AbstractC0742b0.m1845a(c0741b.f3228j.f3306j);
        calendarM1845a.add(2, i);
        C0761s c0761s = new C0761s(calendarM1845a);
        c0765w.f3322u.setText(c0761s.m1864c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0765w.f3323v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m1842b() == null || !c0761s.equals(materialCalendarGridView.m1842b().f3315a)) {
            new C0762t(c0761s, c0741b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m1842b().getClass();
        throw null;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0759q.m1860K(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0765w(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C2890g0(-1, this.f3327g));
        return new C0765w(linearLayout, true);
    }

    /* renamed from: g */
    public final C0761s m1872g(int i) {
        Calendar calendarM1845a = AbstractC0742b0.m1845a(this.f3324d.f3228j.f3306j);
        calendarM1845a.add(2, i);
        return new C0761s(calendarM1845a);
    }

    /* renamed from: h */
    public final int m1873h(C0761s c0761s) {
        return this.f3324d.f3228j.m1865d(c0761s);
    }
}
