package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p049f3.AbstractC0937a;
import p049f3.C0938b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0937a abstractC0937a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f838a = abstractC0937a.m2116f(iconCompat.f838a, 1);
        byte[] bArr = iconCompat.f840c;
        if (abstractC0937a.mo2115e(2)) {
            Parcel parcel = ((C0938b) abstractC0937a).f4127e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f840c = bArr;
        iconCompat.f841d = abstractC0937a.m2117g(iconCompat.f841d, 3);
        iconCompat.f842e = abstractC0937a.m2116f(iconCompat.f842e, 4);
        iconCompat.f843f = abstractC0937a.m2116f(iconCompat.f843f, 5);
        iconCompat.f844g = (ColorStateList) abstractC0937a.m2117g(iconCompat.f844g, 6);
        String string = iconCompat.f846i;
        if (abstractC0937a.mo2115e(7)) {
            string = ((C0938b) abstractC0937a).f4127e.readString();
        }
        iconCompat.f846i = string;
        String string2 = iconCompat.f847j;
        if (abstractC0937a.mo2115e(8)) {
            string2 = ((C0938b) abstractC0937a).f4127e.readString();
        }
        iconCompat.f847j = string2;
        iconCompat.f845h = PorterDuff.Mode.valueOf(iconCompat.f846i);
        switch (iconCompat.f838a) {
            case -1:
                Parcelable parcelable = iconCompat.f841d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f839b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f841d;
                if (parcelable2 != null) {
                    iconCompat.f839b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f840c;
                iconCompat.f839b = bArr3;
                iconCompat.f838a = 3;
                iconCompat.f842e = 0;
                iconCompat.f843f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f840c, Charset.forName("UTF-16"));
                iconCompat.f839b = str;
                if (iconCompat.f838a == 2 && iconCompat.f847j == null) {
                    iconCompat.f847j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f839b = iconCompat.f840c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0937a abstractC0937a) {
        abstractC0937a.getClass();
        iconCompat.f846i = iconCompat.f845h.name();
        switch (iconCompat.f838a) {
            case -1:
                iconCompat.f841d = (Parcelable) iconCompat.f839b;
                break;
            case 1:
            case 5:
                iconCompat.f841d = (Parcelable) iconCompat.f839b;
                break;
            case 2:
                iconCompat.f840c = ((String) iconCompat.f839b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f840c = (byte[]) iconCompat.f839b;
                break;
            case 4:
            case 6:
                iconCompat.f840c = iconCompat.f839b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f838a;
        if (-1 != i) {
            abstractC0937a.m2120j(i, 1);
        }
        byte[] bArr = iconCompat.f840c;
        if (bArr != null) {
            abstractC0937a.mo2119i(2);
            Parcel parcel = ((C0938b) abstractC0937a).f4127e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f841d;
        if (parcelable != null) {
            abstractC0937a.m2121k(parcelable, 3);
        }
        int i4 = iconCompat.f842e;
        if (i4 != 0) {
            abstractC0937a.m2120j(i4, 4);
        }
        int i8 = iconCompat.f843f;
        if (i8 != 0) {
            abstractC0937a.m2120j(i8, 5);
        }
        ColorStateList colorStateList = iconCompat.f844g;
        if (colorStateList != null) {
            abstractC0937a.m2121k(colorStateList, 6);
        }
        String str = iconCompat.f846i;
        if (str != null) {
            abstractC0937a.mo2119i(7);
            ((C0938b) abstractC0937a).f4127e.writeString(str);
        }
        String str2 = iconCompat.f847j;
        if (str2 != null) {
            abstractC0937a.mo2119i(8);
            ((C0938b) abstractC0937a).f4127e.writeString(str2);
        }
    }
}
