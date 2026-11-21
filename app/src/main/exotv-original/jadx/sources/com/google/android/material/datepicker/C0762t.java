package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.exotv.net.R;
import java.util.Calendar;
import p005a4.C0073c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: classes.dex */
public final class C0762t extends BaseAdapter {

    /* renamed from: d */
    public static final int f3313d = AbstractC0742b0.m1847c(null).getMaximum(4);

    /* renamed from: e */
    public static final int f3314e = (AbstractC0742b0.m1847c(null).getMaximum(7) + AbstractC0742b0.m1847c(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C0761s f3315a;

    /* renamed from: b */
    public C0073c f3316b;

    /* renamed from: c */
    public final C0741b f3317c;

    public C0762t(C0761s c0761s, C0741b c0741b) {
        this.f3315a = c0761s;
        this.f3317c = c0741b;
        throw null;
    }

    /* renamed from: a */
    public final int m1866a(int i) {
        do {
            i++;
            if (i > m1871f()) {
                return -1;
            }
        } while (!m1870e(i));
        return i;
    }

    /* renamed from: b */
    public final int m1867b(int i) {
        do {
            i--;
            if (i < m1868c()) {
                return -1;
            }
        } while (!m1870e(i));
        return i;
    }

    /* renamed from: c */
    public final int m1868c() {
        int firstDayOfWeek = this.f3317c.f3232n;
        C0761s c0761s = this.f3315a;
        Calendar calendar = c0761s.f3306j;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i4 = i - firstDayOfWeek;
        return i4 < 0 ? i4 + c0761s.f3309m : i4;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m1868c() || i > m1871f()) {
            return null;
        }
        int iM1868c = (i - m1868c()) + 1;
        Calendar calendarM1845a = AbstractC0742b0.m1845a(this.f3315a.f3306j);
        calendarM1845a.set(5, iM1868c);
        return Long.valueOf(calendarM1845a.getTimeInMillis());
    }

    /* renamed from: e */
    public final boolean m1870e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= this.f3317c.f3230l.f3236j;
        }
        return false;
    }

    /* renamed from: f */
    public final int m1871f() {
        return (m1868c() + this.f3315a.f3310n) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f3314e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f3315a.f3309m;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f3316b == null) {
            this.f3316b = new C0073c(context, 6);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM1868c = i - m1868c();
        if (iM1868c >= 0) {
            C0761s c0761s = this.f3315a;
            if (iM1868c >= c0761s.f3310n) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c0761s);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM1868c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        AbstractC0742b0.m1846b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
