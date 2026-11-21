package p005a4;

import com.bumptech.glide.load.data.InterfaceC0727d;
import java.io.File;
import java.util.List;
import p041e4.C0900q;
import p041e4.InterfaceC0901r;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.e */
/* loaded from: classes.dex */
public final class C0077e implements InterfaceC0083h, InterfaceC0727d {

    /* renamed from: j */
    public final List f331j;

    /* renamed from: k */
    public final C0085i f332k;

    /* renamed from: l */
    public final InterfaceC0081g f333l;

    /* renamed from: m */
    public int f334m = -1;

    /* renamed from: n */
    public InterfaceC2801e f335n;

    /* renamed from: o */
    public List f336o;

    /* renamed from: p */
    public int f337p;

    /* renamed from: q */
    public volatile C0900q f338q;

    /* renamed from: r */
    public File f339r;

    public C0077e(List list, C0085i c0085i, InterfaceC0081g interfaceC0081g) {
        this.f331j = list;
        this.f332k = c0085i;
        this.f333l = interfaceC0081g;
    }

    @Override // p005a4.InterfaceC0083h
    /* renamed from: a */
    public final boolean mo303a() {
        while (true) {
            List list = this.f336o;
            boolean z7 = false;
            if (list != null && this.f337p < list.size()) {
                this.f338q = null;
                while (!z7 && this.f337p < this.f336o.size()) {
                    List list2 = this.f336o;
                    int i = this.f337p;
                    this.f337p = i + 1;
                    InterfaceC0901r interfaceC0901r = (InterfaceC0901r) list2.get(i);
                    File file = this.f339r;
                    C0085i c0085i = this.f332k;
                    this.f338q = interfaceC0901r.mo2050b(file, c0085i.f370e, c0085i.f371f, c0085i.f374i);
                    if (this.f338q != null && this.f332k.m314c(this.f338q.f3932c.mo1641a()) != null) {
                        this.f338q.f3932c.mo1648e(this.f332k.f380o, this);
                        z7 = true;
                    }
                }
                return z7;
            }
            int i4 = this.f334m + 1;
            this.f334m = i4;
            if (i4 >= this.f331j.size()) {
                return false;
            }
            InterfaceC2801e interfaceC2801e = (InterfaceC2801e) this.f331j.get(this.f334m);
            C0085i c0085i2 = this.f332k;
            File fileMo1420b = c0085i2.f373h.m353a().mo1420b(new C0079f(interfaceC2801e, c0085i2.f379n));
            this.f339r = fileMo1420b;
            if (fileMo1420b != null) {
                this.f335n = interfaceC2801e;
                this.f336o = this.f332k.f368c.m1610a().m1616f(fileMo1420b);
                this.f337p = 0;
            }
        }
    }

    @Override // p005a4.InterfaceC0083h
    public final void cancel() {
        C0900q c0900q = this.f338q;
        if (c0900q != null) {
            c0900q.f3932c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: d */
    public final void mo47d(Exception exc) {
        this.f333l.mo311c(this.f335n, exc, this.f338q.f3932c, 3);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: f */
    public final void mo49f(Object obj) {
        this.f333l.mo310b(this.f335n, obj, this.f338q.f3932c, 3, this.f335n);
    }
}
