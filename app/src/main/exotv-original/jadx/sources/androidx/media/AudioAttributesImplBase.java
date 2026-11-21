package androidx.media;

import java.util.Arrays;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f968a = 0;

    /* renamed from: b */
    public int f969b = 0;

    /* renamed from: c */
    public int f970c = 0;

    /* renamed from: d */
    public int f971d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f969b == audioAttributesImplBase.f969b) {
            int i4 = this.f970c;
            int i8 = audioAttributesImplBase.f970c;
            int i9 = audioAttributesImplBase.f971d;
            if (i9 == -1) {
                int i10 = audioAttributesImplBase.f968a;
                int i11 = AudioAttributesCompat.f964b;
                if ((i8 & 1) != 1) {
                    i = 4;
                    if ((i8 & 4) != 4) {
                        switch (i10) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i9;
            }
            if (i == 6) {
                i8 |= 4;
            } else if (i == 7) {
                i8 |= 1;
            }
            if (i4 == (i8 & 273) && this.f968a == audioAttributesImplBase.f968a && this.f971d == i9) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f969b), Integer.valueOf(this.f970c), Integer.valueOf(this.f968a), Integer.valueOf(this.f971d)});
    }

    public final String toString() {
        String strM12h;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f971d != -1) {
            sb.append(" stream=");
            sb.append(this.f971d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f968a;
        int i4 = AudioAttributesCompat.f964b;
        switch (i) {
            case 0:
                strM12h = "USAGE_UNKNOWN";
                break;
            case 1:
                strM12h = "USAGE_MEDIA";
                break;
            case 2:
                strM12h = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM12h = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM12h = "USAGE_ALARM";
                break;
            case 5:
                strM12h = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM12h = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM12h = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM12h = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM12h = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM12h = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM12h = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM12h = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM12h = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM12h = "USAGE_GAME";
                break;
            case 15:
            default:
                strM12h = AbstractC0008a1.m12h(i, "unknown usage ");
                break;
            case 16:
                strM12h = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM12h);
        sb.append(" content=");
        sb.append(this.f969b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f970c).toUpperCase());
        return sb.toString();
    }
}
