package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p049f3.AbstractC0937a;
import p049f3.C0938b;
import p049f3.InterfaceC0939c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0937a abstractC0937a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0939c interfaceC0939cM2118h = remoteActionCompat.f825a;
        boolean z7 = true;
        if (abstractC0937a.mo2115e(1)) {
            interfaceC0939cM2118h = abstractC0937a.m2118h();
        }
        remoteActionCompat.f825a = (IconCompat) interfaceC0939cM2118h;
        CharSequence charSequence = remoteActionCompat.f826b;
        if (abstractC0937a.mo2115e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0938b) abstractC0937a).f4127e);
        }
        remoteActionCompat.f826b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f827c;
        if (abstractC0937a.mo2115e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0938b) abstractC0937a).f4127e);
        }
        remoteActionCompat.f827c = charSequence2;
        remoteActionCompat.f828d = (PendingIntent) abstractC0937a.m2117g(remoteActionCompat.f828d, 4);
        boolean z8 = remoteActionCompat.f829e;
        if (abstractC0937a.mo2115e(5)) {
            z8 = ((C0938b) abstractC0937a).f4127e.readInt() != 0;
        }
        remoteActionCompat.f829e = z8;
        boolean z9 = remoteActionCompat.f830f;
        if (!abstractC0937a.mo2115e(6)) {
            z7 = z9;
        } else if (((C0938b) abstractC0937a).f4127e.readInt() == 0) {
            z7 = false;
        }
        remoteActionCompat.f830f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0937a abstractC0937a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC0937a.getClass();
        IconCompat iconCompat = remoteActionCompat.f825a;
        abstractC0937a.mo2119i(1);
        abstractC0937a.m2122l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f826b;
        abstractC0937a.mo2119i(2);
        Parcel parcel = ((C0938b) abstractC0937a).f4127e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f827c;
        abstractC0937a.mo2119i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC0937a.m2121k(remoteActionCompat.f828d, 4);
        boolean z7 = remoteActionCompat.f829e;
        abstractC0937a.mo2119i(5);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = remoteActionCompat.f830f;
        abstractC0937a.mo2119i(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}
