package p088k0;

import android.text.SpannableStringBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import okhttp3.C2181z;
import p005a4.C0088j0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C1547b {

    /* renamed from: b */
    public static final String f5928b;

    /* renamed from: c */
    public static final String f5929c;

    /* renamed from: d */
    public static final C1547b f5930d;

    /* renamed from: e */
    public static final C1547b f5931e;

    /* renamed from: a */
    public final boolean f5932a;

    static {
        C0088j0 c0088j0 = AbstractC1551f.f5940c;
        f5928b = Character.toString('\u200e');
        f5929c = Character.toString('\u200f');
        f5930d = new C1547b(false);
        f5931e = new C1547b(true);
    }

    public C1547b(boolean z7) {
        C0088j0 c0088j0 = AbstractC1551f.f5938a;
        this.f5932a = z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f5926c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m3224a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m3225a(CharSequence charSequence) {
        byte directionality;
        C1546a c1546a = new C1546a(charSequence);
        c1546a.f5926c = 0;
        int i = 0;
        int i4 = 0;
        int i8 = 0;
        while (true) {
            int i9 = c1546a.f5926c;
            if (i9 < c1546a.f5925b && i == 0) {
                CharSequence charSequence2 = c1546a.f5924a;
                char cCharAt = charSequence2.charAt(i9);
                c1546a.f5927d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c1546a.f5926c);
                    c1546a.f5926c = Character.charCount(iCodePointAt) + c1546a.f5926c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c1546a.f5926c++;
                    char c8 = c1546a.f5927d;
                    directionality = c8 < '\u0700' ? C1546a.f5923e[c8] : Character.getDirectionality(c8);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i8 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i8++;
                                i4 = -1;
                                continue;
                            case 16:
                            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                                i8++;
                                i4 = 1;
                                continue;
                            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                                i8--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i8 == 0) {
                }
                i = i8;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m3226b(CharSequence charSequence) {
        C1546a c1546a = new C1546a(charSequence);
        c1546a.f5926c = c1546a.f5925b;
        int i = 0;
        while (true) {
            int i4 = i;
            while (c1546a.f5926c > 0) {
                byte bM3224a = c1546a.m3224a();
                if (bM3224a != 0) {
                    if (bM3224a == 1 || bM3224a == 2) {
                        if (i != 0) {
                            if (i4 == 0) {
                                break;
                            }
                        }
                    } else if (bM3224a != 9) {
                        switch (bM3224a) {
                            case 14:
                            case 15:
                                if (i4 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                                if (i4 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                                i++;
                                break;
                            default:
                                if (i4 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i4 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: c */
    public final SpannableStringBuilder m3227c(CharSequence charSequence) {
        C0088j0 c0088j0 = AbstractC1551f.f5940c;
        if (charSequence == null) {
            return null;
        }
        boolean zM326d = c0088j0.m326d(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM326d2 = (zM326d ? AbstractC1551f.f5939b : AbstractC1551f.f5938a).m326d(charSequence, charSequence.length());
        String str = C2181z.FRAGMENT_ENCODE_SET;
        String str2 = f5929c;
        String str3 = f5928b;
        boolean z7 = this.f5932a;
        spannableStringBuilder.append((CharSequence) ((z7 || !(zM326d2 || m3225a(charSequence) == 1)) ? (!z7 || (zM326d2 && m3225a(charSequence) != -1)) ? C2181z.FRAGMENT_ENCODE_SET : str2 : str3));
        if (zM326d != z7) {
            spannableStringBuilder.append(zM326d ? '\u202b' : '\u202a');
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\u202c');
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM326d3 = (zM326d ? AbstractC1551f.f5939b : AbstractC1551f.f5938a).m326d(charSequence, charSequence.length());
        if (!z7 && (zM326d3 || m3226b(charSequence) == 1)) {
            str = str3;
        } else if (z7 && (!zM326d3 || m3226b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
