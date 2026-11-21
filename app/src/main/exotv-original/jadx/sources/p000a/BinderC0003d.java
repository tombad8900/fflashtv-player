package p000a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a.d */
/* loaded from: classes.dex */
public final class BinderC0003d extends Binder implements InterfaceC0001b {

    /* renamed from: c */
    public static final /* synthetic */ int f3c = 0;

    /* renamed from: b */
    public final /* synthetic */ C0004e f4b;

    public BinderC0003d(C0004e c0004e) {
        this.f4b = c0004e;
        attachInterface(this, InterfaceC0001b.f1a);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        String str = InterfaceC0001b.f1a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i4);
        }
        this.f4b.mo0a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
