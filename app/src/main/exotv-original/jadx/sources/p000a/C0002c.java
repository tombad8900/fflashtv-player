package p000a;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0116a;
import android.support.v4.media.AbstractC0117b;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0241t0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.ArrayList;
import p000a.C0002c;
import p002a1.C0009b;
import p002a1.C0012c;
import p002a1.C0029k0;
import p002a1.C0037o0;
import p002a1.C0045s0;
import p003a2.C0061b;
import p003a2.C0062c;
import p013b2.C0549a;
import p013b2.C0550b;
import p013b2.C0551c;
import p013b2.C0552d;
import p013b2.C0553e;
import p013b2.C0554f;
import p013b2.C0560l;
import p013b2.C0561m;
import p013b2.C0562n;
import p013b2.C0563o;
import p013b2.C0564p;
import p021c2.C0631a;
import p021c2.C0632b;
import p021c2.C0633c;
import p052f6.AbstractC0983m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a.c */
/* loaded from: classes.dex */
public final class C0002c implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f2a;

    public /* synthetic */ C0002c(int i) {
        this.f2a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        InterfaceC0001b interfaceC0001b = null;
        Bundle bundle = null;
        switch (this.f2a) {
            case 0:
                C0004e c0004e = new C0004e();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = BinderC0003d.f3c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0001b.f1a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0001b)) {
                        C0000a c0000a = new C0000a();
                        c0000a.f0b = strongBinder;
                        interfaceC0001b = c0000a;
                    } else {
                        interfaceC0001b = (InterfaceC0001b) iInterfaceQueryLocalInterface;
                    }
                }
                c0004e.f5j = interfaceC0001b;
                return c0004e;
            case 1:
                return new C0009b(parcel);
            case 2:
                return new C0012c(parcel);
            case 3:
                C0029k0 c0029k0 = new C0029k0();
                c0029k0.f91j = parcel.readString();
                c0029k0.f92k = parcel.readInt();
                return c0029k0;
            case 4:
                C0037o0 c0037o0 = new C0037o0();
                c0037o0.f148n = null;
                c0037o0.f149o = new ArrayList();
                c0037o0.f150p = new ArrayList();
                c0037o0.f144j = parcel.createStringArrayList();
                c0037o0.f145k = parcel.createStringArrayList();
                c0037o0.f146l = (C0009b[]) parcel.createTypedArray(C0009b.CREATOR);
                c0037o0.f147m = parcel.readInt();
                c0037o0.f148n = parcel.readString();
                c0037o0.f149o = parcel.createStringArrayList();
                c0037o0.f150p = parcel.createTypedArrayList(C0012c.CREATOR);
                c0037o0.f151q = parcel.createTypedArrayList(C0029k0.CREATOR);
                return c0037o0;
            case 5:
                return new C0045s0(parcel);
            case 6:
                return new C0061b(parcel);
            case 7:
                return new C0062c(parcel);
            case 8:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0002c(8);

                    /* renamed from: j */
                    public final int f568j;

                    /* renamed from: k */
                    public final MediaDescriptionCompat f569k;

                    {
                        this.f568j = parcel.readInt();
                        this.f569k = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f568j + ", mDescription=" + this.f569k + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i4) {
                        parcel2.writeInt(this.f568j);
                        this.f569k.writeToParcel(parcel2, i4);
                    }
                };
            case 9:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM381g = AbstractC0116a.m381g(mediaDescription);
                CharSequence charSequenceM383i = AbstractC0116a.m383i(mediaDescription);
                CharSequence charSequenceM382h = AbstractC0116a.m382h(mediaDescription);
                CharSequence charSequenceM377c = AbstractC0116a.m377c(mediaDescription);
                Bitmap bitmapM379e = AbstractC0116a.m379e(mediaDescription);
                Uri uriM380f = AbstractC0116a.m380f(mediaDescription);
                Bundle bundleM378d = AbstractC0116a.m378d(mediaDescription);
                if (bundleM378d != null) {
                    bundleM378d = AbstractC0120b.m405P(bundleM378d);
                }
                Uri uriM391a = bundleM378d != null ? (Uri) bundleM378d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM391a == null) {
                    bundle = bundleM378d;
                } else if (!bundleM378d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM378d.size() != 2) {
                    bundleM378d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM378d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM378d;
                }
                if (uriM391a == null) {
                    uriM391a = AbstractC0117b.m391a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM381g, charSequenceM383i, charSequenceM382h, charSequenceM377c, bitmapM379e, uriM380f, bundle, uriM391a);
                mediaDescriptionCompat.f578r = mediaDescription;
                return mediaDescriptionCompat;
            case 10:
                return new MediaMetadataCompat(parcel);
            case 11:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 12:
                return new C0237s(parcel);
            case 13:
                return new C0234r(parcel);
            case 14:
                return new C0241t0(parcel);
            case 15:
                return new C0212j1(parcel);
            case 16:
                return new C0549a(parcel);
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                return new C0550b(parcel);
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                return new C0551c(parcel);
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                return new C0552d(parcel);
            case 20:
                return new C0553e(parcel);
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                return new C0554f(parcel);
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                return new C0560l(parcel);
            case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                return new C0561m(parcel);
            case 24:
                return new C0562n(parcel);
            case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new C0563o(string, string2, AbstractC0983m0.m2166k(strArrCreateStringArray));
            case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                return new C0564p(parcel);
            case AnalyticsListener.EVENT_CUES /* 27 */:
                return new C0631a(parcel);
            case AnalyticsListener.EVENT_METADATA /* 28 */:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, C0632b.class.getClassLoader());
                return new C0633c(arrayList);
            default:
                return new C0632b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2a) {
            case 0:
                return new C0004e[i];
            case 1:
                return new C0009b[i];
            case 2:
                return new C0012c[i];
            case 3:
                return new C0029k0[i];
            case 4:
                return new C0037o0[i];
            case 5:
                return new C0045s0[i];
            case 6:
                return new C0061b[i];
            case 7:
                return new C0062c[i];
            case 8:
                return new MediaBrowserCompat$MediaItem[i];
            case 9:
                return new MediaDescriptionCompat[i];
            case 10:
                return new MediaMetadataCompat[i];
            case 11:
                return new RatingCompat[i];
            case 12:
                return new C0237s[i];
            case 13:
                return new C0234r[i];
            case 14:
                return new C0241t0[i];
            case 15:
                return new C0212j1[i];
            case 16:
                return new C0549a[i];
            case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                return new C0550b[i];
            case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                return new C0551c[i];
            case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                return new C0552d[i];
            case 20:
                return new C0553e[i];
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                return new C0554f[i];
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                return new C0560l[i];
            case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                return new C0561m[i];
            case 24:
                return new C0562n[i];
            case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                return new C0563o[i];
            case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                return new C0564p[i];
            case AnalyticsListener.EVENT_CUES /* 27 */:
                return new C0631a[i];
            case AnalyticsListener.EVENT_METADATA /* 28 */:
                return new C0633c[i];
            default:
                return new C0632b[i];
        }
    }
}
