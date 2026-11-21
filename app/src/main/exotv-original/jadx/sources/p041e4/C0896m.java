package p041e4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.m */
/* loaded from: classes.dex */
public final class C0896m implements InterfaceC0728e {

    /* renamed from: m */
    public static final String[] f3922m = {"_data"};

    /* renamed from: j */
    public final /* synthetic */ int f3923j;

    /* renamed from: k */
    public final Object f3924k;

    /* renamed from: l */
    public final Object f3925l;

    public /* synthetic */ C0896m(Object obj, int i, Object obj2) {
        this.f3923j = i;
        this.f3924k = obj;
        this.f3925l = obj2;
    }

    /* renamed from: d */
    private final void m2064d() {
    }

    /* renamed from: f */
    private final void m2065f() {
    }

    /* renamed from: g */
    private final void m2066g() {
    }

    /* renamed from: h */
    private final void m2067h() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        switch (this.f3923j) {
            case 0:
                return File.class;
            default:
                return ((C0880a0) this.f3925l).m2048b();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() {
        int i = this.f3923j;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        switch (this.f3923j) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        int i = this.f3923j;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) {
        Object objWrap;
        switch (this.f3923j) {
            case 0:
                Cursor cursorQuery = ((Context) this.f3924k).getContentResolver().query((Uri) this.f3925l, f3922m, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC0727d.mo49f(new File(string));
                    return;
                }
                interfaceC0727d.mo47d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f3925l)));
                return;
            default:
                C0880a0 c0880a0 = (C0880a0) this.f3925l;
                byte[] bArr = (byte[]) this.f3924k;
                switch (c0880a0.f3885j) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC0727d.mo49f(objWrap);
                return;
        }
    }
}
