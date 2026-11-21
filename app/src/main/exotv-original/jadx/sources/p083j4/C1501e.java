package p083j4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.AbstractC0714c;
import java.util.List;
import p005a4.InterfaceC0080f0;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j4.e */
/* loaded from: classes.dex */
public final class C1501e implements InterfaceC2806j {

    /* renamed from: b */
    public static final C2803g f5769b = new C2803g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C2803g.f10419e);

    /* renamed from: a */
    public final Context f5770a;

    public C1501e(Context context) {
        this.f5770a = context.getApplicationContext();
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) {
        return m3179c((Uri) obj, c2804h);
    }

    /* renamed from: c */
    public final InterfaceC0080f0 m3179c(Uri uri, C2804h c2804h) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f5770a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e8) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e8);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c2804h.m4908c(f5769b) : null;
        Drawable drawableM1497J = theme == null ? AbstractC0714c.m1497J(context, contextCreatePackageContext, identifier, null) : AbstractC0714c.m1497J(context, context, identifier, theme);
        if (drawableM1497J != null) {
            return new C1500d(drawableM1497J, 0);
        }
        return null;
    }
}
