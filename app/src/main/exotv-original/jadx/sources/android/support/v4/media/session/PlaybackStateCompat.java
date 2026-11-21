package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0119a(4);

    /* renamed from: j */
    public final int f592j;

    /* renamed from: k */
    public final long f593k;

    /* renamed from: l */
    public final long f594l;

    /* renamed from: m */
    public final float f595m;

    /* renamed from: n */
    public final long f596n;

    /* renamed from: o */
    public final int f597o;

    /* renamed from: p */
    public final CharSequence f598p;

    /* renamed from: q */
    public final long f599q;

    /* renamed from: r */
    public final ArrayList f600r;

    /* renamed from: s */
    public final long f601s;

    /* renamed from: t */
    public final Bundle f602t;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0121c();

        /* renamed from: j */
        public final String f603j;

        /* renamed from: k */
        public final CharSequence f604k;

        /* renamed from: l */
        public final int f605l;

        /* renamed from: m */
        public final Bundle f606m;

        public CustomAction(Parcel parcel) {
            this.f603j = parcel.readString();
            this.f604k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f605l = parcel.readInt();
            this.f606m = parcel.readBundle(AbstractC0120b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f604k) + ", mIcon=" + this.f605l + ", mExtras=" + this.f606m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f603j);
            TextUtils.writeToParcel(this.f604k, parcel, i);
            parcel.writeInt(this.f605l);
            parcel.writeBundle(this.f606m);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f592j = parcel.readInt();
        this.f593k = parcel.readLong();
        this.f595m = parcel.readFloat();
        this.f599q = parcel.readLong();
        this.f594l = parcel.readLong();
        this.f596n = parcel.readLong();
        this.f598p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f600r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f601s = parcel.readLong();
        this.f602t = parcel.readBundle(AbstractC0120b.class.getClassLoader());
        this.f597o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f592j + ", position=" + this.f593k + ", buffered position=" + this.f594l + ", speed=" + this.f595m + ", updated=" + this.f599q + ", actions=" + this.f596n + ", error code=" + this.f597o + ", error message=" + this.f598p + ", custom actions=" + this.f600r + ", active item id=" + this.f601s + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f592j);
        parcel.writeLong(this.f593k);
        parcel.writeFloat(this.f595m);
        parcel.writeLong(this.f599q);
        parcel.writeLong(this.f594l);
        parcel.writeLong(this.f596n);
        TextUtils.writeToParcel(this.f598p, parcel, i);
        parcel.writeTypedList(this.f600r);
        parcel.writeLong(this.f601s);
        parcel.writeBundle(this.f602t);
        parcel.writeInt(this.f597o);
    }
}
