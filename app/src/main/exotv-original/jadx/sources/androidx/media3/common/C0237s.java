package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p000a.C0002c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.s */
/* loaded from: classes.dex */
public final class C0237s implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0237s> CREATOR = new C0002c(12);

    /* renamed from: j */
    public final C0234r[] f1405j;

    /* renamed from: k */
    public int f1406k;

    /* renamed from: l */
    public final String f1407l;

    /* renamed from: m */
    public final int f1408m;

    public C0237s(String str, List list) {
        this(str, false, (C0234r[]) list.toArray(new C0234r[0]));
    }

    /* renamed from: a */
    public final C0237s m667a(String str) {
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(this.f1407l, str) ? this : new C0237s(str, false, this.f1405j);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0234r c0234r = (C0234r) obj;
        C0234r c0234r2 = (C0234r) obj2;
        UUID uuid = AbstractC0213k.f1162a;
        return uuid.equals(c0234r.f1325k) ? uuid.equals(c0234r2.f1325k) ? 0 : 1 : c0234r.f1325k.compareTo(c0234r2.f1325k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0237s.class == obj.getClass()) {
            C0237s c0237s = (C0237s) obj;
            String str = c0237s.f1407l;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(this.f1407l, str) && Arrays.equals(this.f1405j, c0237s.f1405j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1406k == 0) {
            String str = this.f1407l;
            this.f1406k = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f1405j);
        }
        return this.f1406k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1407l);
        parcel.writeTypedArray(this.f1405j, 0);
    }

    public C0237s(C0234r... c0234rArr) {
        this(null, true, c0234rArr);
    }

    public C0237s(String str, boolean z7, C0234r... c0234rArr) {
        this.f1407l = str;
        c0234rArr = z7 ? (C0234r[]) c0234rArr.clone() : c0234rArr;
        this.f1405j = c0234rArr;
        this.f1408m = c0234rArr.length;
        Arrays.sort(c0234rArr, this);
    }

    public C0237s(Parcel parcel) {
        this.f1407l = parcel.readString();
        C0234r[] c0234rArr = (C0234r[]) parcel.createTypedArray(C0234r.CREATOR);
        int i = AbstractC1118i0.f4750a;
        this.f1405j = c0234rArr;
        this.f1408m = c0234rArr.length;
    }
}
