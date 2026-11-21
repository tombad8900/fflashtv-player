package p041e4;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.C0734k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p023c4.C0641e;
import p083j4.C1501e;
import p096l0.InterfaceC1642b;
import p170t4.C2435b;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.b */
/* loaded from: classes.dex */
public final class C0881b implements InterfaceC0901r {

    /* renamed from: a */
    public final /* synthetic */ int f3886a;

    /* renamed from: b */
    public final Object f3887b;

    /* renamed from: c */
    public final Object f3888c;

    public /* synthetic */ C0881b(Object obj, int i, Object obj2) {
        this.f3886a = i;
        this.f3888c = obj;
        this.f3887b = obj2;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        switch (this.f3886a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                ArrayList arrayList = (ArrayList) this.f3888c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((InterfaceC0901r) obj2).mo2049a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f3888c).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) throws NumberFormatException {
        C0734k c0734k;
        C0900q c0900qMo2050b;
        Uri uri;
        switch (this.f3886a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C2435b c2435b = new C2435b(uri2);
                AssetManager assetManager = (AssetManager) this.f3888c;
                switch (((C0879a) this.f3887b).f3882j) {
                    case 0:
                        c0734k = new C0734k(assetManager, strSubstring, 0);
                        break;
                    default:
                        c0734k = new C0734k(assetManager, strSubstring, 1);
                        break;
                }
                return new C0900q(c2435b, c0734k);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c2804h.m4908c(C1501e.f5769b);
                return new C0900q(new C2435b(num), new C0889f(theme, theme != null ? theme.getResources() : ((Context) this.f3888c).getResources(), (C0641e) this.f3887b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f3888c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC2801e interfaceC2801e = null;
                for (int i8 = 0; i8 < size; i8++) {
                    InterfaceC0901r interfaceC0901r = (InterfaceC0901r) arrayList.get(i8);
                    if (interfaceC0901r.mo2049a(obj) && (c0900qMo2050b = interfaceC0901r.mo2050b(obj, i, i4, c2804h)) != null) {
                        interfaceC2801e = c0900qMo2050b.f3930a;
                        arrayList2.add(c0900qMo2050b.f3932c);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC2801e == null) {
                    return null;
                }
                return new C0900q(interfaceC2801e, new C0905v(arrayList2, (InterfaceC1642b) this.f3887b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f3887b;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC0901r) this.f3888c).mo2050b(uri, i, i4, c2804h);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC0901r interfaceC0901r2 = (InterfaceC0901r) this.f3887b;
                List<String> pathSegments = uri3.getPathSegments();
                C0900q c0900qMo2050b2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i9 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i9 != 0) {
                            c0900qMo2050b2 = interfaceC0901r2.mo2050b(Integer.valueOf(i9), i, i4, c2804h);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c0900qMo2050b2;
                    } catch (NumberFormatException e8) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c0900qMo2050b2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e8);
                        return c0900qMo2050b2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f3888c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC0901r2.mo2050b(Integer.valueOf(identifier), i, i4, c2804h);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f3886a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f3888c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0881b(Resources resources, InterfaceC0901r interfaceC0901r) {
        this.f3886a = 3;
        this.f3887b = resources;
        this.f3888c = interfaceC0901r;
    }

    public C0881b(Context context, C0641e c0641e) {
        this.f3886a = 1;
        this.f3888c = context.getApplicationContext();
        this.f3887b = c0641e;
    }

    public C0881b(Context context, InterfaceC0901r interfaceC0901r) {
        this.f3886a = 4;
        this.f3888c = context.getApplicationContext();
        this.f3887b = interfaceC0901r;
    }
}
