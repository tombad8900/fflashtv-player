package p017b6;

import android.os.Parcel;
import android.os.Parcelable;
import p074i5.C1271c;
import p084j5.C1505d;
import p104m.C1735j2;
import p157s0.AbstractC2337b;
import p162s5.C2364b;
import p213z.C2867e;
import p216z2.C2906o0;
import p219z5.C2972b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.i0 */
/* loaded from: classes.dex */
public final class C0608i0 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f2410a;

    public /* synthetic */ C0608i0(int i) {
        this.f2410a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2410a) {
            case 0:
                return new C0610j0(parcel, classLoader);
            case 1:
                return new C1271c(parcel, classLoader);
            case 2:
                return new C1505d(parcel, classLoader);
            case 3:
                return new C1735j2(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2337b.f8188k;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new C2364b(parcel, classLoader);
            case 6:
                return new C2867e(parcel, classLoader);
            case 7:
                return new C2906o0(parcel, classLoader);
            default:
                return new C2972b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2410a) {
            case 0:
                return new C0610j0[i];
            case 1:
                return new C1271c[i];
            case 2:
                return new C1505d[i];
            case 3:
                return new C1735j2[i];
            case 4:
                return new AbstractC2337b[i];
            case 5:
                return new C2364b[i];
            case 6:
                return new C2867e[i];
            case 7:
                return new C2906o0[i];
            default:
                return new C2972b[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2410a) {
            case 0:
                return new C0610j0(parcel, null);
            case 1:
                return new C1271c(parcel, null);
            case 2:
                return new C1505d(parcel, null);
            case 3:
                return new C1735j2(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2337b.f8188k;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new C2364b(parcel, null);
            case 6:
                return new C2867e(parcel, null);
            case 7:
                return new C2906o0(parcel, null);
            default:
                return new C2972b(parcel, null);
        }
    }
}
