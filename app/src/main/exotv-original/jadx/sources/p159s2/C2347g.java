package p159s2;

import android.text.Layout;
import p002a1.AbstractC0008a1;
import p056g1.C1028a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s2.g */
/* loaded from: classes.dex */
public final class C2347g {

    /* renamed from: c */
    public CharSequence f8246c;

    /* renamed from: a */
    public long f8244a = 0;

    /* renamed from: b */
    public long f8245b = 0;

    /* renamed from: d */
    public int f8247d = 2;

    /* renamed from: e */
    public float f8248e = -3.4028235E38f;

    /* renamed from: f */
    public int f8249f = 1;

    /* renamed from: g */
    public int f8250g = 0;

    /* renamed from: h */
    public float f8251h = -3.4028235E38f;

    /* renamed from: i */
    public int f8252i = Integer.MIN_VALUE;

    /* renamed from: j */
    public float f8253j = 1.0f;

    /* renamed from: k */
    public int f8254k = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1028a m4177a() {
        Layout.Alignment alignment;
        float f8 = this.f8251h;
        float f9 = -3.4028235E38f;
        if (f8 == -3.4028235E38f) {
            int i = this.f8247d;
            f8 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i4 = this.f8252i;
        if (i4 == Integer.MIN_VALUE) {
            int i8 = this.f8247d;
            if (i8 == 1) {
                i4 = 0;
            } else if (i8 == 3) {
                i4 = 2;
            } else if (i8 != 4) {
                if (i8 != 5) {
                    i4 = 1;
                }
            }
        }
        C1028a c1028a = new C1028a();
        int i9 = this.f8247d;
        if (i9 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i9 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i9 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i9 != 4) {
            if (i9 != 5) {
                AbstractC0008a1.m23s("Unknown textAlignment: ", i9, "WebvttCueParser");
                alignment = null;
            }
        }
        c1028a.f4336c = alignment;
        float f10 = this.f8248e;
        int i10 = this.f8249f;
        if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
            if (f10 != -3.4028235E38f) {
                f9 = f10;
            } else if (i10 == 0) {
                f9 = 1.0f;
            }
        }
        c1028a.f4338e = f9;
        c1028a.f4339f = i10;
        c1028a.f4340g = this.f8250g;
        c1028a.f4341h = f8;
        c1028a.f4342i = i4;
        float f11 = this.f8253j;
        if (i4 == 0) {
            f8 = 1.0f - f8;
        } else if (i4 == 1) {
            f8 = f8 <= 0.5f ? f8 * 2.0f : (1.0f - f8) * 2.0f;
        } else if (i4 != 2) {
            throw new IllegalStateException(String.valueOf(i4));
        }
        c1028a.f4345l = Math.min(f11, f8);
        c1028a.f4349p = this.f8254k;
        CharSequence charSequence = this.f8246c;
        if (charSequence != null) {
            c1028a.f4334a = charSequence;
        }
        return c1028a;
    }
}
