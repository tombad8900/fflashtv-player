package p124o3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.media.session.AbstractC0120b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.C2181z;
import p069h7.AbstractC1206h;
import p111m6.AbstractC1913h;
import p151r3.C2303o;
import p185v3.AbstractC2536f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o3.a */
/* loaded from: classes.dex */
public final class C2047a {

    /* renamed from: a */
    public final /* synthetic */ int f7564a;

    public /* synthetic */ C2047a(int i) {
        this.f7564a = i;
    }

    /* renamed from: a */
    public final Object m3940a(Object obj, C2303o c2303o) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.f7564a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!AbstractC2536f.m4557d(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = C2181z.FRAGMENT_ENCODE_SET;
                    }
                    if (path.length() > 0 && AbstractC0120b.m423s(path.charAt(0), '/', false) && ((String) AbstractC1913h.m3737B0(uri.getPathSegments())) != null) {
                        if (!AbstractC2980h.m5132a(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((C2181z) obj).toString();
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = c2303o.f8055a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC2980h.m5132a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC1206h.m2630D0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = C2181z.FRAGMENT_ENCODE_SET;
                }
                Resources resourcesForApplication = c2303o.f8055a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
