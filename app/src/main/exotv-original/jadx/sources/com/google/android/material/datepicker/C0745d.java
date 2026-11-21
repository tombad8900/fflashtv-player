package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.exotv.net.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C0745d extends BaseAdapter {

    /* renamed from: d */
    public static final int f3238d;

    /* renamed from: a */
    public final Calendar f3239a;

    /* renamed from: b */
    public final int f3240b;

    /* renamed from: c */
    public final int f3241c;

    static {
        f3238d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0745d() {
        Calendar calendarM1847c = AbstractC0742b0.m1847c(null);
        this.f3239a = calendarM1847c;
        this.f3240b = calendarM1847c.getMaximum(7);
        this.f3241c = calendarM1847c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3240b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i4 = this.f3240b;
        if (i >= i4) {
            return null;
        }
        int i8 = i + this.f3241c;
        if (i8 > i4) {
            i8 -= i4;
        }
        return Integer.valueOf(i8);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i + this.f3241c;
        int i8 = this.f3240b;
        if (i4 > i8) {
            i4 -= i8;
        }
        Calendar calendar = this.f3239a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, f3238d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0745d(int i) {
        Calendar calendarM1847c = AbstractC0742b0.m1847c(null);
        this.f3239a = calendarM1847c;
        this.f3240b = calendarM1847c.getMaximum(7);
        this.f3241c = i;
    }
}
