package p041e4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p178u4.AbstractC2470e;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.h */
/* loaded from: classes.dex */
public final class C0891h implements InterfaceC2801e {

    /* renamed from: b */
    public final InterfaceC0892i f3910b;

    /* renamed from: c */
    public final URL f3911c;

    /* renamed from: d */
    public final String f3912d;

    /* renamed from: e */
    public String f3913e;

    /* renamed from: f */
    public URL f3914f;

    /* renamed from: g */
    public volatile byte[] f3915g;

    /* renamed from: h */
    public int f3916h;

    public C0891h(URL url) {
        C0895l c0895l = InterfaceC0892i.f3917a;
        AbstractC2470e.m4446c("Argument must not be null", url);
        this.f3911c = url;
        this.f3912d = null;
        AbstractC2470e.m4446c("Argument must not be null", c0895l);
        this.f3910b = c0895l;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        if (this.f3915g == null) {
            this.f3915g = m2060c().getBytes(InterfaceC2801e.f10418a);
        }
        messageDigest.update(this.f3915g);
    }

    /* renamed from: c */
    public final String m2060c() {
        String str = this.f3912d;
        if (str != null) {
            return str;
        }
        URL url = this.f3911c;
        AbstractC2470e.m4446c("Argument must not be null", url);
        return url.toString();
    }

    /* renamed from: d */
    public final URL m2061d() {
        if (this.f3914f == null) {
            if (TextUtils.isEmpty(this.f3913e)) {
                String string = this.f3912d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f3911c;
                    AbstractC2470e.m4446c("Argument must not be null", url);
                    string = url.toString();
                }
                this.f3913e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f3914f = new URL(this.f3913e);
        }
        return this.f3914f;
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C0891h) {
            C0891h c0891h = (C0891h) obj;
            if (m2060c().equals(c0891h.m2060c()) && this.f3910b.equals(c0891h.f3910b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        if (this.f3916h == 0) {
            int iHashCode = m2060c().hashCode();
            this.f3916h = iHashCode;
            this.f3916h = this.f3910b.hashCode() + (iHashCode * 31);
        }
        return this.f3916h;
    }

    public final String toString() {
        return m2060c();
    }

    public C0891h(String str) {
        C0895l c0895l = InterfaceC0892i.f3917a;
        this.f3911c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f3912d = str;
            AbstractC2470e.m4446c("Argument must not be null", c0895l);
            this.f3910b = c0895l;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
