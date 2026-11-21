package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import p000a.C0002c;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: j */
    public final Bundle f579j;

    static {
        C2186e c2186e = new C2186e(0);
        c2186e.put("android.media.metadata.TITLE", 1);
        c2186e.put("android.media.metadata.ARTIST", 1);
        c2186e.put("android.media.metadata.DURATION", 0);
        c2186e.put("android.media.metadata.ALBUM", 1);
        c2186e.put("android.media.metadata.AUTHOR", 1);
        c2186e.put("android.media.metadata.WRITER", 1);
        c2186e.put("android.media.metadata.COMPOSER", 1);
        c2186e.put("android.media.metadata.COMPILATION", 1);
        c2186e.put("android.media.metadata.DATE", 1);
        c2186e.put("android.media.metadata.YEAR", 0);
        c2186e.put("android.media.metadata.GENRE", 1);
        c2186e.put("android.media.metadata.TRACK_NUMBER", 0);
        c2186e.put("android.media.metadata.NUM_TRACKS", 0);
        c2186e.put("android.media.metadata.DISC_NUMBER", 0);
        c2186e.put("android.media.metadata.ALBUM_ARTIST", 1);
        c2186e.put("android.media.metadata.ART", 2);
        c2186e.put("android.media.metadata.ART_URI", 1);
        c2186e.put("android.media.metadata.ALBUM_ART", 2);
        c2186e.put("android.media.metadata.ALBUM_ART_URI", 1);
        c2186e.put("android.media.metadata.USER_RATING", 3);
        c2186e.put("android.media.metadata.RATING", 3);
        c2186e.put("android.media.metadata.DISPLAY_TITLE", 1);
        c2186e.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c2186e.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c2186e.put("android.media.metadata.DISPLAY_ICON", 2);
        c2186e.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c2186e.put("android.media.metadata.MEDIA_ID", 1);
        c2186e.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c2186e.put("android.media.metadata.MEDIA_URI", 1);
        c2186e.put("android.media.metadata.ADVERTISEMENT", 0);
        c2186e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0002c(10);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f579j = parcel.readBundle(AbstractC0120b.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f579j);
    }
}
