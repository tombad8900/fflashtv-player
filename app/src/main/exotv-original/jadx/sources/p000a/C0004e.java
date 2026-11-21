package p000a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a.e */
/* loaded from: classes.dex */
public class C0004e implements Parcelable {
    public static final Parcelable.Creator<C0004e> CREATOR = new C0002c(0);

    /* renamed from: j */
    public InterfaceC0001b f5j;

    /* renamed from: a */
    public void mo0a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f5j == null) {
                    this.f5j = new BinderC0003d(this);
                }
                parcel.writeStrongBinder(this.f5j.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
