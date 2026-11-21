package p062h;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.bumptech.glide.AbstractC0714c;
import java.util.Calendar;
import p002a1.AbstractC0026j;
import p005a4.C0073c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.t */
/* loaded from: classes.dex */
public final class C1094t extends AbstractC0026j {

    /* renamed from: l */
    public final /* synthetic */ int f4632l = 1;

    /* renamed from: m */
    public final /* synthetic */ LayoutInflaterFactory2C1098x f4633m;

    /* renamed from: n */
    public final Object f4634n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094t(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x, C0073c c0073c) {
        super(layoutInflaterFactory2C1098x);
        this.f4633m = layoutInflaterFactory2C1098x;
        this.f4634n = c0073c;
    }

    @Override // p002a1.AbstractC0026j
    /* renamed from: e */
    public final IntentFilter mo92e() {
        switch (this.f4632l) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p002a1.AbstractC0026j
    /* renamed from: f */
    public final int mo93f() {
        Location location;
        boolean z7;
        long j;
        switch (this.f4632l) {
            case 0:
                return ((PowerManager) this.f4634n).isPowerSaveMode() ? 2 : 1;
            default:
                C0073c c0073c = (C0073c) this.f4634n;
                C1075d0 c1075d0 = (C1075d0) c0073c.f326m;
                LocationManager locationManager = (LocationManager) c0073c.f325l;
                if (c1075d0.f4528b > System.currentTimeMillis()) {
                    z7 = c1075d0.f4527a;
                } else {
                    Context context = (Context) c0073c.f324k;
                    Location lastKnownLocation = null;
                    if (AbstractC0714c.m1532r(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0714c.m1532r(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C1073c0.f4523d == null) {
                            C1073c0.f4523d = new C1073c0();
                        }
                        C1073c0 c1073c0 = C1073c0.f4523d;
                        c1073c0.m2252a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c1073c0.m2252a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z7 = c1073c0.f4526c == 1;
                        long j8 = c1073c0.f4525b;
                        long j9 = c1073c0.f4524a;
                        c1073c0.m2252a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j10 = c1073c0.f4525b;
                        if (j8 == -1 || j9 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j9) {
                                j8 = j10;
                            } else if (jCurrentTimeMillis > j8) {
                                j8 = j9;
                            }
                            j = j8 + 60000;
                        }
                        c1075d0.f4527a = z7;
                        c1075d0.f4528b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z7 = true;
                        }
                    }
                }
                return z7 ? 2 : 1;
        }
    }

    @Override // p002a1.AbstractC0026j
    /* renamed from: i */
    public final void mo96i() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f4632l) {
            case 0:
                this.f4633m.m2331m(true, true);
                break;
            default:
                this.f4633m.m2331m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094t(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x, Context context) {
        super(layoutInflaterFactory2C1098x);
        this.f4633m = layoutInflaterFactory2C1098x;
        this.f4634n = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
