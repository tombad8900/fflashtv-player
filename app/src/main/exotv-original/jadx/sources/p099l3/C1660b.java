package p099l3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.AbstractC0008a1;
import p029d0.AbstractC0795k;
import p040e3.C0878p;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1213o;
import p073i3.C1252a;
import p073i3.C1267p;
import p073i3.C1268q;
import p073i3.EnumC1257f;
import p111m6.AbstractC1913h;
import p137p6.InterfaceC2222c;
import p151r3.C2303o;
import p168t2.AbstractC2415i0;
import p185v3.AbstractC2536f;
import p189v7.AbstractC2557b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.b */
/* loaded from: classes.dex */
public final class C1660b implements InterfaceC1666h {

    /* renamed from: a */
    public final /* synthetic */ int f6378a;

    /* renamed from: b */
    public final Uri f6379b;

    /* renamed from: c */
    public final C2303o f6380c;

    public /* synthetic */ C1660b(Uri uri, C2303o c2303o, int i) {
        this.f6378a = i;
        this.f6379b = uri;
        this.f6380c = c2303o;
    }

    @Override // p099l3.InterfaceC1666h
    /* renamed from: a */
    public final Object mo3366a(InterfaceC2222c interfaceC2222c) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Integer numM2658k0;
        Drawable drawable;
        int i = this.f6378a;
        Uri uri = this.f6379b;
        C2303o c2303o = this.f6380c;
        boolean z7 = true;
        switch (i) {
            case 0:
                String strM3740E0 = AbstractC1913h.m3740E0(AbstractC1913h.m3750y0(1, uri.getPathSegments()), "/", null, null, null, 62);
                return new C1672n(new C1268q(AbstractC2557b.m4578c(AbstractC2557b.m4584i(c2303o.f8055a.getAssets().open(strM3740E0))), new C1252a()), AbstractC2536f.m4555b(MimeTypeMap.getSingleton(), strM3740E0), EnumC1257f.f5253l);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (AbstractC1206h.m2630D0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) AbstractC1913h.m3742G0(uri.getPathSegments());
                        if (str == null || (numM2658k0 = AbstractC1213o.m2658k0(str)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + uri);
                        }
                        int iIntValue = numM2658k0.intValue();
                        Context context = c2303o.f8055a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM4555b = AbstractC2536f.m4555b(MimeTypeMap.getSingleton(), charSequence.subSequence(AbstractC1206h.m2631E0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!AbstractC2980h.m5132a(strM4555b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new C1672n(new C1268q(AbstractC2557b.m4578c(AbstractC2557b.m4584i(resources.openRawResource(iIntValue, typedValue2))), new C1267p(typedValue2.density)), strM4555b, EnumC1257f.f5253l);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = AbstractC0715d.m1542D(context, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC0008a1.m12h(iIntValue, "Invalid resource ID: ").toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = AbstractC0795k.f3568a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                throw new IllegalStateException(AbstractC0008a1.m12h(iIntValue, "Invalid resource ID: ").toString());
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof C0878p)) {
                            z7 = false;
                        }
                        if (z7) {
                            drawable = new BitmapDrawable(context.getResources(), AbstractC2415i0.m4266g(drawable, c2303o.f8056b, c2303o.f8058d, c2303o.f8059e, c2303o.f8060f));
                        }
                        return new C1663e(drawable, z7, EnumC1257f.f5253l);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri);
        }
    }
}
