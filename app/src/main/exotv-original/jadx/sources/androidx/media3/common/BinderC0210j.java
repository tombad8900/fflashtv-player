package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.j */
/* loaded from: classes.dex */
public final class BinderC0210j extends Binder {

    /* renamed from: c */
    public static final int f1137c;

    /* renamed from: b */
    public final AbstractC0983m0 f1138b;

    static {
        f1137c = AbstractC1118i0.f4750a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC0210j(ArrayList arrayList) {
        this.f1138b = AbstractC0983m0.m2165j(arrayList);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i4);
        }
        if (parcel2 == null) {
            return false;
        }
        AbstractC0983m0 abstractC0983m0 = this.f1138b;
        int size = abstractC0983m0.size();
        int i8 = parcel.readInt();
        while (i8 < size && parcel2.dataSize() < f1137c) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) abstractC0983m0.get(i8));
            i8++;
        }
        parcel2.writeInt(i8 < size ? 2 : 0);
        return true;
    }
}
