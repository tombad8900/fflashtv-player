package p115n1;

import androidx.media3.common.C0241t0;
import androidx.media3.common.InterfaceC0238s0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013b2.C0553e;
import p013b2.C0560l;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.v */
/* loaded from: classes.dex */
public final class C1995v {

    /* renamed from: c */
    public static final Pattern f7390c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f7391a = -1;

    /* renamed from: b */
    public int f7392b = -1;

    /* renamed from: a */
    public final boolean m3876a(String str) throws NumberFormatException {
        Matcher matcher = f7390c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = AbstractC1118i0.f4750a;
            int i4 = Integer.parseInt(strGroup, 16);
            int i8 = Integer.parseInt(matcher.group(2), 16);
            if (i4 <= 0 && i8 <= 0) {
                return false;
            }
            this.f7391a = i4;
            this.f7392b = i8;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m3877b(C0241t0 c0241t0) {
        int i = 0;
        while (true) {
            InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
            if (i >= interfaceC0238s0Arr.length) {
                return;
            }
            InterfaceC0238s0 interfaceC0238s0 = interfaceC0238s0Arr[i];
            if (interfaceC0238s0 instanceof C0553e) {
                C0553e c0553e = (C0553e) interfaceC0238s0;
                if ("iTunSMPB".equals(c0553e.f2242l) && m3876a(c0553e.f2243m)) {
                    return;
                }
            } else if (interfaceC0238s0 instanceof C0560l) {
                C0560l c0560l = (C0560l) interfaceC0238s0;
                if ("com.apple.iTunes".equals(c0560l.f2255k) && "iTunSMPB".equals(c0560l.f2256l) && m3876a(c0560l.f2257m)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
