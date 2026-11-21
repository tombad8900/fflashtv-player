package p198w7;

import androidx.lifecycle.C0149n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p102l6.C1687d;
import p102l6.C1690g;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1915j;
import p111m6.AbstractC1919n;
import p182v.C2490e;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2585p;
import p189v7.C2556a0;
import p189v7.C2558b0;
import p189v7.C2591v;
import p189v7.C2592w;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.f */
/* loaded from: classes.dex */
public final class C2710f extends AbstractC2585p {

    /* renamed from: e */
    public static final C2558b0 f9834e;

    /* renamed from: b */
    public final ClassLoader f9835b;

    /* renamed from: c */
    public final AbstractC2585p f9836c;

    /* renamed from: d */
    public final C1690g f9837d;

    static {
        String str = C2558b0.f9272k;
        f9834e = C2556a0.m4571c("/");
    }

    public C2710f(ClassLoader classLoader) {
        C2592w c2592w = AbstractC2585p.f9330a;
        AbstractC2980h.m5136e("systemFileSystem", c2592w);
        this.f9835b = classLoader;
        this.f9836c = c2592w;
        this.f9837d = new C1690g(new C0149n0(1, this));
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: a */
    public final InterfaceC2572i0 mo3155a(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("file", c2558b0);
        throw new IOException(this + " is read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: b */
    public final void mo3156b(C2558b0 c2558b0, C2558b0 c2558b02) throws IOException {
        AbstractC2980h.m5136e("source", c2558b0);
        AbstractC2980h.m5136e("target", c2558b02);
        throw new IOException(this + " is read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: c */
    public final void mo3157c(C2558b0 c2558b0) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: d */
    public final void mo3158d(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("path", c2558b0);
        throw new IOException(this + " is read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: g */
    public final List mo3159g(C2558b0 c2558b0) throws FileNotFoundException {
        C2558b0 c2558b02 = f9834e;
        c2558b02.getClass();
        String strM4675q = AbstractC2707c.m4769b(c2558b02, c2558b0, true).m4589c(c2558b02).f9273j.m4675q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z7 = false;
        for (C1687d c1687d : (List) this.f9837d.getValue()) {
            AbstractC2585p abstractC2585p = (AbstractC2585p) c1687d.f6486j;
            C2558b0 c2558b03 = (C2558b0) c1687d.f6487k;
            try {
                List listMo3159g = abstractC2585p.mo3159g(c2558b03.m4590d(strM4675q));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo3159g) {
                    if (C2556a0.m4570b((C2558b0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1915j.m3756w0(arrayList));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    C2558b0 c2558b04 = (C2558b0) obj2;
                    AbstractC2980h.m5136e("<this>", c2558b04);
                    arrayList2.add(c2558b02.m4590d(AbstractC1214p.m2664q0(AbstractC1206h.m2635I0(c2558b04.f9273j.m4675q(), c2558b03.f9273j.m4675q()), '\\', '/')));
                }
                AbstractC1919n.m3757x0(linkedHashSet, arrayList2);
                z7 = true;
            } catch (IOException unused) {
            }
        }
        if (z7) {
            return AbstractC1913h.m3747L0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: i */
    public final C2490e mo3160i(C2558b0 c2558b0) {
        AbstractC2980h.m5136e("path", c2558b0);
        if (!C2556a0.m4570b(c2558b0)) {
            return null;
        }
        C2558b0 c2558b02 = f9834e;
        c2558b02.getClass();
        String strM4675q = AbstractC2707c.m4769b(c2558b02, c2558b0, true).m4589c(c2558b02).f9273j.m4675q();
        for (C1687d c1687d : (List) this.f9837d.getValue()) {
            C2490e c2490eMo3160i = ((AbstractC2585p) c1687d.f6486j).mo3160i(((C2558b0) c1687d.f6487k).m4590d(strM4675q));
            if (c2490eMo3160i != null) {
                return c2490eMo3160i;
            }
        }
        return null;
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: j */
    public final C2591v mo3161j(C2558b0 c2558b0) throws FileNotFoundException {
        if (!C2556a0.m4570b(c2558b0)) {
            throw new FileNotFoundException("file not found: " + c2558b0);
        }
        C2558b0 c2558b02 = f9834e;
        c2558b02.getClass();
        String strM4675q = AbstractC2707c.m4769b(c2558b02, c2558b0, true).m4589c(c2558b02).f9273j.m4675q();
        for (C1687d c1687d : (List) this.f9837d.getValue()) {
            try {
                return ((AbstractC2585p) c1687d.f6486j).mo3161j(((C2558b0) c1687d.f6487k).m4590d(strM4675q));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c2558b0);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: k */
    public final InterfaceC2572i0 mo3162k(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("file", c2558b0);
        throw new IOException(this + " is read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: l */
    public final InterfaceC2576k0 mo3163l(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("file", c2558b0);
        if (!C2556a0.m4570b(c2558b0)) {
            throw new FileNotFoundException("file not found: " + c2558b0);
        }
        C2558b0 c2558b02 = f9834e;
        c2558b02.getClass();
        URL resource = this.f9835b.getResource(AbstractC2707c.m4769b(c2558b02, c2558b0, false).m4589c(c2558b02).f9273j.m4675q());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + c2558b0);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        AbstractC2980h.m5135d("getInputStream(...)", inputStream);
        return AbstractC2557b.m4584i(inputStream);
    }
}
