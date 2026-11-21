package p021c2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.InterfaceC0238s0;
import java.util.ArrayList;
import p000a.C0002c;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c2.c */
/* loaded from: classes.dex */
public final class C0633c implements InterfaceC0238s0 {
    public static final Parcelable.Creator<C0633c> CREATOR = new C0002c(28);

    /* renamed from: j */
    public final ArrayList f2521j;

    public C0633c(ArrayList arrayList) {
        this.f2521j = arrayList;
        boolean z7 = false;
        if (!arrayList.isEmpty()) {
            long j = ((C0632b) arrayList.get(0)).f2519k;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C0632b) arrayList.get(i)).f2518j < j) {
                    z7 = true;
                    break;
                } else {
                    j = ((C0632b) arrayList.get(i)).f2519k;
                    i++;
                }
            }
        }
        AbstractC1101a.m2353d(!z7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0633c.class != obj.getClass()) {
            return false;
        }
        return this.f2521j.equals(((C0633c) obj).f2521j);
    }

    public final int hashCode() {
        return this.f2521j.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f2521j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f2521j);
    }
}
