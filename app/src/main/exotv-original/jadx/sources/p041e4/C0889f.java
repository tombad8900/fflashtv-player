package p041e4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.io.IOException;
import java.io.InputStream;
import p023c4.C0641e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.f */
/* loaded from: classes.dex */
public final class C0889f implements InterfaceC0728e {

    /* renamed from: j */
    public final Resources.Theme f3905j;

    /* renamed from: k */
    public final Resources f3906k;

    /* renamed from: l */
    public final C0641e f3907l;

    /* renamed from: m */
    public final int f3908m;

    /* renamed from: n */
    public Object f3909n;

    public C0889f(Resources.Theme theme, Resources resources, C0641e c0641e, int i) {
        this.f3905j = theme;
        this.f3906k = resources;
        this.f3907l = c0641e;
        this.f3908m = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        switch (this.f3907l.f2533j) {
            case 1:
                return AssetFileDescriptor.class;
            case 2:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() throws IOException {
        Object obj = this.f3909n;
        if (obj != null) {
            try {
                switch (this.f3907l.f2533j) {
                    case 1:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 2:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) throws Resources.NotFoundException {
        Object objOpenRawResourceFd;
        try {
            C0641e c0641e = this.f3907l;
            Resources.Theme theme = this.f3905j;
            Resources resources = this.f3906k;
            int i = this.f3908m;
            switch (c0641e.f2533j) {
                case 1:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 2:
                    Context context = c0641e.f2534k;
                    objOpenRawResourceFd = AbstractC0714c.m1497J(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f3909n = objOpenRawResourceFd;
            interfaceC0727d.mo49f(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC0727d.mo47d(e);
        }
    }
}
