package p050f4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.io.File;
import java.io.FileNotFoundException;
import p041e4.C0900q;
import p041e4.InterfaceC0901r;
import p171t5.AbstractC2436a;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f4.c */
/* loaded from: classes.dex */
public final class C0942c implements InterfaceC0728e {

    /* renamed from: t */
    public static final String[] f4136t = {"_data"};

    /* renamed from: j */
    public final Context f4137j;

    /* renamed from: k */
    public final InterfaceC0901r f4138k;

    /* renamed from: l */
    public final InterfaceC0901r f4139l;

    /* renamed from: m */
    public final Uri f4140m;

    /* renamed from: n */
    public final int f4141n;

    /* renamed from: o */
    public final int f4142o;

    /* renamed from: p */
    public final C2804h f4143p;

    /* renamed from: q */
    public final Class f4144q;

    /* renamed from: r */
    public volatile boolean f4145r;

    /* renamed from: s */
    public volatile InterfaceC0728e f4146s;

    public C0942c(Context context, InterfaceC0901r interfaceC0901r, InterfaceC0901r interfaceC0901r2, Uri uri, int i, int i4, C2804h c2804h, Class cls) {
        this.f4137j = context.getApplicationContext();
        this.f4138k = interfaceC0901r;
        this.f4139l = interfaceC0901r2;
        this.f4140m = uri;
        this.f4141n = i;
        this.f4142o = i4;
        this.f4143p = c2804h;
        this.f4144q = cls;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        return this.f4144q;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() {
        InterfaceC0728e interfaceC0728e = this.f4146s;
        if (interfaceC0728e != null) {
            interfaceC0728e.mo1646b();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        this.f4145r = true;
        InterfaceC0728e interfaceC0728e = this.f4146s;
        if (interfaceC0728e != null) {
            interfaceC0728e.cancel();
        }
    }

    /* renamed from: d */
    public final InterfaceC0728e m2123d() throws Throwable {
        C0900q c0900qMo2050b;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f4137j;
        C2804h c2804h = this.f4143p;
        int i = this.f4142o;
        int i4 = this.f4141n;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f4140m;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f4136t, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c0900qMo2050b = this.f4138k.mo2050b(file, i4, i, c2804h);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f4140m;
            boolean zM4339n = AbstractC2436a.m4339n(requireOriginal);
            InterfaceC0901r interfaceC0901r = this.f4139l;
            if (zM4339n && requireOriginal.getPathSegments().contains("picker")) {
                c0900qMo2050b = interfaceC0901r.mo2050b(requireOriginal, i4, i, c2804h);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                c0900qMo2050b = interfaceC0901r.mo2050b(requireOriginal, i4, i, c2804h);
            }
        }
        if (c0900qMo2050b != null) {
            return c0900qMo2050b.f3932c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) throws Throwable {
        try {
            InterfaceC0728e interfaceC0728eM2123d = m2123d();
            if (interfaceC0728eM2123d == null) {
                interfaceC0727d.mo47d(new IllegalArgumentException("Failed to build fetcher for: " + this.f4140m));
            } else {
                this.f4146s = interfaceC0728eM2123d;
                if (this.f4145r) {
                    cancel();
                } else {
                    interfaceC0728eM2123d.mo1648e(enumC0717f, interfaceC0727d);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0727d.mo47d(e);
        }
    }
}
