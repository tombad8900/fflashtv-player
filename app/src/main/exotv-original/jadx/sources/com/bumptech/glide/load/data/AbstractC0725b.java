package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC0717f;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes.dex */
public abstract class AbstractC0725b implements InterfaceC0728e {

    /* renamed from: j */
    public final /* synthetic */ int f2847j;

    /* renamed from: k */
    public Object f2848k;

    /* renamed from: l */
    public final Comparable f2849l;

    /* renamed from: m */
    public final Object f2850m;

    public /* synthetic */ AbstractC0725b(int i, Comparable comparable, Object obj) {
        this.f2847j = i;
        this.f2850m = obj;
        this.f2849l = comparable;
    }

    /* renamed from: d */
    private final void m1644d() {
    }

    /* renamed from: f */
    private final void m1645f() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() {
        switch (this.f2847j) {
            case 0:
                Object obj = this.f2848k;
                if (obj != null) {
                    try {
                        mo1642g(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f2848k;
                if (obj2 != null) {
                    try {
                        mo1642g(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        switch (this.f2847j) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        int i = this.f2847j;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) {
        switch (this.f2847j) {
            case 0:
                try {
                    Object objMo1649h = mo1649h((AssetManager) this.f2850m, (String) this.f2849l);
                    this.f2848k = objMo1649h;
                    interfaceC0727d.mo49f(objMo1649h);
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    interfaceC0727d.mo47d(e);
                    return;
                }
            default:
                try {
                    Object objMo1643i = mo1643i((Uri) this.f2849l, (ContentResolver) this.f2850m);
                    this.f2848k = objMo1643i;
                    interfaceC0727d.mo49f(objMo1643i);
                    break;
                } catch (FileNotFoundException e8) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e8);
                    }
                    interfaceC0727d.mo47d(e8);
                }
        }
    }

    /* renamed from: g */
    public abstract void mo1642g(Object obj);

    /* renamed from: h */
    public abstract Object mo1649h(AssetManager assetManager, String str);

    /* renamed from: i */
    public abstract Object mo1643i(Uri uri, ContentResolver contentResolver);
}
