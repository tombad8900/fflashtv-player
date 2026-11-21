package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0002c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0002c(9);

    /* renamed from: j */
    public final String f570j;

    /* renamed from: k */
    public final CharSequence f571k;

    /* renamed from: l */
    public final CharSequence f572l;

    /* renamed from: m */
    public final CharSequence f573m;

    /* renamed from: n */
    public final Bitmap f574n;

    /* renamed from: o */
    public final Uri f575o;

    /* renamed from: p */
    public final Bundle f576p;

    /* renamed from: q */
    public final Uri f577q;

    /* renamed from: r */
    public MediaDescription f578r;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f570j = str;
        this.f571k = charSequence;
        this.f572l = charSequence2;
        this.f573m = charSequence3;
        this.f574n = bitmap;
        this.f575o = uri;
        this.f576p = bundle;
        this.f577q = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f571k) + ", " + ((Object) this.f572l) + ", " + ((Object) this.f573m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionM375a = this.f578r;
        if (mediaDescriptionM375a == null) {
            MediaDescription.Builder builderM376b = AbstractC0116a.m376b();
            AbstractC0116a.m388n(builderM376b, this.f570j);
            AbstractC0116a.m390p(builderM376b, this.f571k);
            AbstractC0116a.m389o(builderM376b, this.f572l);
            AbstractC0116a.m384j(builderM376b, this.f573m);
            AbstractC0116a.m386l(builderM376b, this.f574n);
            AbstractC0116a.m387m(builderM376b, this.f575o);
            AbstractC0116a.m385k(builderM376b, this.f576p);
            AbstractC0117b.m392b(builderM376b, this.f577q);
            mediaDescriptionM375a = AbstractC0116a.m375a(builderM376b);
            this.f578r = mediaDescriptionM375a;
        }
        mediaDescriptionM375a.writeToParcel(parcel, i);
    }
}
