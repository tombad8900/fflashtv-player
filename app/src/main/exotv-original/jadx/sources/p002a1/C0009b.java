package p002a1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.b */
/* loaded from: classes.dex */
public final class C0009b implements Parcelable {
    public static final Parcelable.Creator<C0009b> CREATOR = new C0002c(1);

    /* renamed from: j */
    public final int[] f34j;

    /* renamed from: k */
    public final ArrayList f35k;

    /* renamed from: l */
    public final int[] f36l;

    /* renamed from: m */
    public final int[] f37m;

    /* renamed from: n */
    public final int f38n;

    /* renamed from: o */
    public final String f39o;

    /* renamed from: p */
    public final int f40p;

    /* renamed from: q */
    public final int f41q;

    /* renamed from: r */
    public final CharSequence f42r;

    /* renamed from: s */
    public final int f43s;

    /* renamed from: t */
    public final CharSequence f44t;

    /* renamed from: u */
    public final ArrayList f45u;

    /* renamed from: v */
    public final ArrayList f46v;

    /* renamed from: w */
    public final boolean f47w;

    public C0009b(C0006a c0006a) {
        int size = c0006a.f11a.size();
        this.f34j = new int[size * 6];
        if (!c0006a.f17g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f35k = new ArrayList(size);
        this.f36l = new int[size];
        this.f37m = new int[size];
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0051v0 c0051v0 = (C0051v0) c0006a.f11a.get(i4);
            int i8 = i + 1;
            this.f34j[i] = c0051v0.f253a;
            ArrayList arrayList = this.f35k;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0051v0.f254b;
            arrayList.add(abstractComponentCallbacksC0050v != null ? abstractComponentCallbacksC0050v.f240n : null);
            int[] iArr = this.f34j;
            iArr[i8] = c0051v0.f255c ? 1 : 0;
            iArr[i + 2] = c0051v0.f256d;
            iArr[i + 3] = c0051v0.f257e;
            int i9 = i + 5;
            iArr[i + 4] = c0051v0.f258f;
            i += 6;
            iArr[i9] = c0051v0.f259g;
            this.f36l[i4] = c0051v0.f260h.ordinal();
            this.f37m[i4] = c0051v0.f261i.ordinal();
        }
        this.f38n = c0006a.f16f;
        this.f39o = c0006a.f18h;
        this.f40p = c0006a.f28r;
        this.f41q = c0006a.f19i;
        this.f42r = c0006a.f20j;
        this.f43s = c0006a.f21k;
        this.f44t = c0006a.f22l;
        this.f45u = c0006a.f23m;
        this.f46v = c0006a.f24n;
        this.f47w = c0006a.f25o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f34j);
        parcel.writeStringList(this.f35k);
        parcel.writeIntArray(this.f36l);
        parcel.writeIntArray(this.f37m);
        parcel.writeInt(this.f38n);
        parcel.writeString(this.f39o);
        parcel.writeInt(this.f40p);
        parcel.writeInt(this.f41q);
        TextUtils.writeToParcel(this.f42r, parcel, 0);
        parcel.writeInt(this.f43s);
        TextUtils.writeToParcel(this.f44t, parcel, 0);
        parcel.writeStringList(this.f45u);
        parcel.writeStringList(this.f46v);
        parcel.writeInt(this.f47w ? 1 : 0);
    }

    public C0009b(Parcel parcel) {
        this.f34j = parcel.createIntArray();
        this.f35k = parcel.createStringArrayList();
        this.f36l = parcel.createIntArray();
        this.f37m = parcel.createIntArray();
        this.f38n = parcel.readInt();
        this.f39o = parcel.readString();
        this.f40p = parcel.readInt();
        this.f41q = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f42r = (CharSequence) creator.createFromParcel(parcel);
        this.f43s = parcel.readInt();
        this.f44t = (CharSequence) creator.createFromParcel(parcel);
        this.f45u = parcel.createStringArrayList();
        this.f46v = parcel.createStringArrayList();
        this.f47w = parcel.readInt() != 0;
    }
}
