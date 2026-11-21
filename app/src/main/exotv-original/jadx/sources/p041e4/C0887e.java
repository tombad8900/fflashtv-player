package p041e4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.C0733j;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p171t5.AbstractC2436a;
import p217z3.C2931c;
import p217z3.InterfaceC2930b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.e */
/* loaded from: classes.dex */
public final class C0887e implements InterfaceC0728e {

    /* renamed from: j */
    public final /* synthetic */ int f3899j;

    /* renamed from: k */
    public final Comparable f3900k;

    /* renamed from: l */
    public final Object f3901l;

    /* renamed from: m */
    public Object f3902m;

    public /* synthetic */ C0887e(int i, Comparable comparable, Object obj) {
        this.f3899j = i;
        this.f3900k = comparable;
        this.f3901l = obj;
    }

    /* renamed from: d */
    public static C0887e m2055d(Context context, Uri uri, InterfaceC2930b interfaceC2930b) {
        return new C0887e(2, uri, new C2931c(ComponentCallbacks2C0713b.m1484a(context).f2776l.m1610a().m1615e(), interfaceC2930b, ComponentCallbacks2C0713b.m1484a(context).f2777m, context.getContentResolver()));
    }

    /* renamed from: f */
    private final void m2056f() {
    }

    /* renamed from: g */
    private final void m2057g() {
    }

    /* renamed from: h */
    private final void m2058h() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        switch (this.f3899j) {
            case 0:
                ((C0880a0) this.f3901l).getClass();
                return InputStream.class;
            case 1:
                return ((C0880a0) this.f3901l).m2048b();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() throws IOException {
        switch (this.f3899j) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f3902m).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                Object obj = this.f3902m;
                if (obj != null) {
                    try {
                        switch (((C0880a0) this.f3901l).f3885j) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f3902m;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        switch (this.f3899j) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        int i = this.f3899j;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) throws Throwable {
        Object objOpen;
        switch (this.f3899j) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM2047a = C0880a0.m2047a((String) this.f3900k);
                    this.f3902m = byteArrayInputStreamM2047a;
                    interfaceC0727d.mo49f(byteArrayInputStreamM2047a);
                    break;
                } catch (IllegalArgumentException e) {
                    interfaceC0727d.mo47d(e);
                }
            case 1:
                try {
                    C0880a0 c0880a0 = (C0880a0) this.f3901l;
                    File file = (File) this.f3900k;
                    switch (c0880a0.f3885j) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f3902m = objOpen;
                    interfaceC0727d.mo49f(objOpen);
                    break;
                } catch (FileNotFoundException e8) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e8);
                    }
                    interfaceC0727d.mo47d(e8);
                    return;
                }
            default:
                try {
                    InputStream inputStreamM2059i = m2059i();
                    this.f3902m = inputStreamM2059i;
                    interfaceC0727d.mo49f(inputStreamM2059i);
                    break;
                } catch (FileNotFoundException e9) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e9);
                    }
                    interfaceC0727d.mo47d(e9);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[PHI: r7
      0x002f: PHI (r7v6 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:23:0x004e, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream m2059i() throws Throwable {
        Cursor cursorMo5091a;
        ?? r72;
        String string;
        InputStream inputStreamOpenInputStream;
        int iM4334i;
        C2931c c2931c = (C2931c) this.f3901l;
        ContentResolver contentResolver = c2931c.f10885c;
        Uri uri = (Uri) this.f3900k;
        ?? r62 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorMo5091a = c2931c.f10883a.mo5091a(uri);
            } catch (Throwable th) {
                th = th;
                r62 = r72;
                if (r62 != 0) {
                    r62.close();
                }
                throw th;
            }
        } catch (SecurityException e) {
            e = e;
            cursorMo5091a = null;
        } catch (Throwable th2) {
            th = th2;
            if (r62 != 0) {
            }
            throw th;
        }
        if (cursorMo5091a != null) {
            try {
            } catch (SecurityException e8) {
                e = e8;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
                if (cursorMo5091a != null) {
                }
                string = null;
                if (TextUtils.isEmpty(string)) {
                }
                if (inputStreamOpenInputStream != null) {
                }
                if (iM4334i != -1) {
                }
            }
            if (cursorMo5091a.moveToFirst()) {
                string = cursorMo5091a.getString(0);
                cursorMo5091a.close();
                if (TextUtils.isEmpty(string)) {
                    inputStreamOpenInputStream = null;
                } else {
                    File file = new File(string);
                    if (file.exists() && 0 < file.length()) {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                        } catch (NullPointerException e9) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e9));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        try {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iM4334i = AbstractC2436a.m4334i(c2931c.f10886d, inputStreamOpenInputStream2, c2931c.f10884b);
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                try {
                                    r62.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException | NullPointerException e10) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
                        }
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                inputStreamOpenInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                    }
                } else {
                    iM4334i = -1;
                }
                return iM4334i != -1 ? new C0733j(inputStreamOpenInputStream, iM4334i) : inputStreamOpenInputStream;
            }
        }
        if (cursorMo5091a != null) {
            cursorMo5091a.close();
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
        }
        if (inputStreamOpenInputStream != null) {
        }
        if (iM4334i != -1) {
        }
    }
}
