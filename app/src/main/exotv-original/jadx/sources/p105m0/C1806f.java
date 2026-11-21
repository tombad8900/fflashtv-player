package p105m0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.f */
/* loaded from: classes.dex */
public final class C1806f implements InterfaceC1803e, InterfaceC1809g {

    /* renamed from: a */
    public final /* synthetic */ int f6869a = 0;

    /* renamed from: b */
    public ClipData f6870b;

    /* renamed from: c */
    public int f6871c;

    /* renamed from: d */
    public int f6872d;

    /* renamed from: e */
    public Uri f6873e;

    /* renamed from: f */
    public Bundle f6874f;

    public /* synthetic */ C1806f() {
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: a */
    public ClipData mo3521a() {
        return this.f6870b;
    }

    @Override // p105m0.InterfaceC1803e
    /* renamed from: b */
    public void mo3522b(Uri uri) {
        this.f6873e = uri;
    }

    @Override // p105m0.InterfaceC1803e
    public C1812h build() {
        return new C1812h(new C1806f(this));
    }

    @Override // p105m0.InterfaceC1803e
    /* renamed from: c */
    public void mo3523c(int i) {
        this.f6872d = i;
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: d */
    public int mo3524d() {
        return this.f6872d;
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: e */
    public ContentInfo mo3525e() {
        return null;
    }

    @Override // p105m0.InterfaceC1809g
    /* renamed from: f */
    public int mo3526f() {
        return this.f6871c;
    }

    @Override // p105m0.InterfaceC1803e
    public void setExtras(Bundle bundle) {
        this.f6874f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f6869a) {
            case 1:
                Uri uri = this.f6873e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f6870b.getDescription());
                sb.append(", source=");
                int i = this.f6871c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.f6872d;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                String str2 = C2181z.FRAGMENT_ENCODE_SET;
                if (uri == null) {
                    str = C2181z.FRAGMENT_ENCODE_SET;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.f6874f != null) {
                    str2 = ", hasExtras";
                }
                return AbstractC0008a1.m18n(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public C1806f(C1806f c1806f) {
        ClipData clipData = c1806f.f6870b;
        clipData.getClass();
        this.f6870b = clipData;
        int i = c1806f.f6871c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f6871c = i;
        int i4 = c1806f.f6872d;
        if ((i4 & 1) == i4) {
            this.f6872d = i4;
            this.f6873e = c1806f.f6873e;
            this.f6874f = c1806f.f6874f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
