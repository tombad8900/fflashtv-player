package p041e4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0249w;
import com.exotv.net.R;
import java.io.InputStream;
import java.util.Locale;
import okhttp3.C2181z;
import p005a4.InterfaceC0080f0;
import p063h1.AbstractC1118i0;
import p066h4.C1168c;
import p109m4.InterfaceC1896a;
import p193w2.InterfaceC2616h0;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.y */
/* loaded from: classes.dex */
public final class C0908y implements InterfaceC0902s, InterfaceC1896a, InterfaceC2616h0 {

    /* renamed from: j */
    public final /* synthetic */ int f3952j;

    /* renamed from: k */
    public final Resources f3953k;

    public /* synthetic */ C0908y(Resources resources, int i) {
        this.f3952j = i;
        this.f3953k = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m2073a(C0249w c0249w) throws Resources.NotFoundException {
        String displayName;
        String str = c0249w.f1512d;
        String str2 = c0249w.f1510b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = C2181z.FRAGMENT_ENCODE_SET;
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = AbstractC1118i0.f4750a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(displayName)) {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM2076e = m2076e(displayName, m2074b(c0249w));
        if (!TextUtils.isEmpty(strM2076e)) {
            return strM2076e;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = C2181z.FRAGMENT_ENCODE_SET;
        }
        return str2;
    }

    /* renamed from: b */
    public String m2074b(C0249w c0249w) throws Resources.NotFoundException {
        int i = c0249w.f1514f;
        int i4 = c0249w.f1514f;
        int i8 = i & 2;
        Resources resources = this.f3953k;
        String string = i8 != 0 ? resources.getString(R.string.exo_track_role_alternate) : C2181z.FRAGMENT_ENCODE_SET;
        if ((i4 & 4) != 0) {
            string = m2076e(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i4 & 8) != 0) {
            string = m2076e(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i4 & 1088) != 0 ? m2076e(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m2075c(C0249w c0249w) throws Resources.NotFoundException {
        String strM2073a;
        String str = c0249w.f1522n;
        int i = c0249w.f1518j;
        int i4 = c0249w.f1498C;
        int i8 = c0249w.f1530v;
        int i9 = c0249w.f1529u;
        String str2 = c0249w.f1519k;
        int iM680i = AbstractC0244u0.m680i(str);
        if (iM680i == -1) {
            if (AbstractC0244u0.m681j(str2) == null) {
                if (AbstractC0244u0.m673b(str2) == null) {
                    iM680i = (i9 == -1 && i8 == -1) ? (i4 == -1 && c0249w.f1499D == -1) ? -1 : 1 : 2;
                }
            }
        }
        String string = C2181z.FRAGMENT_ENCODE_SET;
        Resources resources = this.f3953k;
        if (iM680i == 2) {
            String strM2074b = m2074b(c0249w);
            String string2 = (i9 == -1 || i8 == -1) ? C2181z.FRAGMENT_ENCODE_SET : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i9), Integer.valueOf(i8));
            if (i != -1) {
                string = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
            }
            strM2073a = m2076e(strM2074b, string2, string);
        } else if (iM680i == 1) {
            String strM2073a2 = m2073a(c0249w);
            String string3 = (i4 == -1 || i4 < 1) ? C2181z.FRAGMENT_ENCODE_SET : i4 != 1 ? i4 != 2 ? (i4 == 6 || i4 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i4 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono);
            if (i != -1) {
                string = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
            }
            strM2073a = m2076e(strM2073a2, string3, string);
        } else {
            strM2073a = m2073a(c0249w);
        }
        if (strM2073a.length() != 0) {
            return strM2073a;
        }
        String str3 = c0249w.f1512d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    @Override // p109m4.InterfaceC1896a
    /* renamed from: d */
    public InterfaceC0080f0 mo282d(InterfaceC0080f0 interfaceC0080f0, C2804h c2804h) {
        if (interfaceC0080f0 == null) {
            return null;
        }
        return new C1168c(this.f3953k, interfaceC0080f0);
    }

    /* renamed from: e */
    public String m2076e(String... strArr) throws Resources.NotFoundException {
        String string = C2181z.FRAGMENT_ENCODE_SET;
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f3953k.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        switch (this.f3952j) {
            case 0:
                return new C0881b(this.f3953k, c0907x.m2070a(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C0881b(this.f3953k, c0907x.m2070a(Uri.class, InputStream.class));
            default:
                return new C0881b(this.f3953k, C0882b0.f3889b);
        }
    }

    public C0908y(Resources resources) {
        this.f3952j = 4;
        resources.getClass();
        this.f3953k = resources;
    }
}
