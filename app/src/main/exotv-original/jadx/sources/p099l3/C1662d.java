package p099l3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bumptech.glide.AbstractC0715d;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import p073i3.C1252a;
import p073i3.C1268q;
import p073i3.EnumC1257f;
import p137p6.InterfaceC2222c;
import p151r3.C2303o;
import p160s3.C2350a;
import p160s3.C2357h;
import p189v7.AbstractC2557b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.d */
/* loaded from: classes.dex */
public final class C1662d implements InterfaceC1666h {

    /* renamed from: a */
    public final Uri f6384a;

    /* renamed from: b */
    public final C2303o f6385b;

    public C1662d(Uri uri, C2303o c2303o) {
        this.f6384a = uri;
        this.f6385b = c2303o;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    @Override // p099l3.InterfaceC1666h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3366a(InterfaceC2222c interfaceC2222c) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        C2303o c2303o = this.f6385b;
        ContentResolver contentResolver = c2303o.f8055a.getContentResolver();
        Uri uri = this.f6384a;
        if (AbstractC2980h.m5132a(uri.getAuthority(), "com.android.contacts") && AbstractC2980h.m5132a(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && AbstractC2980h.m5132a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && AbstractC2980h.m5132a(pathSegments.get(size - 3), "audio") && AbstractC2980h.m5132a(pathSegments.get(size - 2), "albums")) {
            C2357h c2357h = c2303o.f8058d;
            AbstractC0715d abstractC0715d = c2357h.f8270a;
            C2350a c2350a = abstractC0715d instanceof C2350a ? (C2350a) abstractC0715d : null;
            if (c2350a != null) {
                int i = c2350a.f8260n;
                AbstractC0715d abstractC0715d2 = c2357h.f8271b;
                C2350a c2350a2 = abstractC0715d2 instanceof C2350a ? (C2350a) abstractC0715d2 : null;
                if (c2350a2 != null) {
                    int i4 = c2350a2.f8260n;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i4));
                } else {
                    bundle = null;
                }
                AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                }
            }
        } else {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new C1672n(new C1268q(AbstractC2557b.m4578c(AbstractC2557b.m4584i(inputStreamOpenInputStream)), new C1252a()), contentResolver.getType(uri), EnumC1257f.f5253l);
    }
}
