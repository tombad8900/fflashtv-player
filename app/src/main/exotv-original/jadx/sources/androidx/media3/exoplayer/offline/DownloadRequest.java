package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0235r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    public final String customCacheKey;
    public final byte[] data;

    /* renamed from: id */
    public final String f1786id;
    public final byte[] keySetId;
    public final String mimeType;
    public final List<C0212j1> streamKeys;
    public final Uri uri;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Builder {
        private String customCacheKey;
        private byte[] data;

        /* renamed from: id */
        private final String f1787id;
        private byte[] keySetId;
        private String mimeType;
        private List<C0212j1> streamKeys;
        private final Uri uri;

        public Builder(String str, Uri uri) {
            this.f1787id = str;
            this.uri = uri;
        }

        public DownloadRequest build() {
            String str = this.f1787id;
            Uri uri = this.uri;
            String str2 = this.mimeType;
            List list = this.streamKeys;
            if (list == null) {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                list = C0981l1.f4211n;
            }
            return new DownloadRequest(str, uri, str2, list, this.keySetId, this.customCacheKey, this.data);
        }

        public Builder setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setData(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder setKeySetId(byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = AbstractC0244u0.m687p(str);
            return this;
        }

        public Builder setStreamKeys(List<C0212j1> list) {
            this.streamKeys = list;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new DownloadRequest(this.f1786id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        List arrayList;
        AbstractC1101a.m2353d(this.f1786id.equals(downloadRequest.f1786id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                C0212j1 c0212j1 = downloadRequest.streamKeys.get(i);
                if (!arrayList.contains(c0212j1)) {
                    arrayList.add(c0212j1);
                }
            }
        }
        return new DownloadRequest(this.f1786id, downloadRequest.uri, downloadRequest.mimeType, arrayList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (this.f1786id.equals(downloadRequest.f1786id) && this.uri.equals(downloadRequest.uri)) {
            String str = this.mimeType;
            String str2 = downloadRequest.mimeType;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(str, str2) && this.streamKeys.equals(downloadRequest.streamKeys) && Arrays.equals(this.keySetId, downloadRequest.keySetId) && Objects.equals(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.uri.hashCode() + (this.f1786id.hashCode() * 961)) * 31;
        String str = this.mimeType;
        int iHashCode2 = (Arrays.hashCode(this.keySetId) + ((this.streamKeys.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.customCacheKey;
        return Arrays.hashCode(this.data) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public C0226o0 toMediaItem() {
        String str;
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        String str2 = this.f1786id;
        str2.getClass();
        Uri uri = this.uri;
        String str3 = this.customCacheKey;
        String str4 = this.mimeType;
        List<C0212j1> list2 = this.streamKeys;
        List listUnmodifiableList = (list2 == null || list2.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list2));
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        C0211j0 c0211j0 = null;
        if (uri != null) {
            C0202g0 c0202g0 = c0199f0.f1090a != null ? new C0202g0(c0199f0) : null;
            str = str2;
            c0211j0 = new C0211j0(uri, str4, c0202g0, null, listUnmodifiableList, str3, c0981l1, null, -9223372036854775807L);
        } else {
            str = str2;
        }
        return new C0226o0(str, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0);
    }

    public String toString() {
        return this.mimeType + ":" + this.f1786id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1786id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i4 = 0; i4 < this.streamKeys.size(); i4++) {
            parcel.writeParcelable(this.streamKeys.get(i4), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
    }

    private DownloadRequest(String str, Uri uri, String str2, List<C0212j1> list, byte[] bArr, String str3, byte[] bArr2) {
        int iM2420K = AbstractC1118i0.m2420K(uri, str2);
        if (iM2420K == 0 || iM2420K == 2 || iM2420K == 1) {
            AbstractC1101a.m2352c("customCacheKey must be null for type: " + iM2420K, str3 == null);
        }
        this.f1786id = str;
        this.uri = uri;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : AbstractC1118i0.f4755f;
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC1118i0.f4750a;
        this.f1786id = string;
        this.uri = Uri.parse(parcel.readString());
        this.mimeType = parcel.readString();
        int i4 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i4);
        for (int i8 = 0; i8 < i4; i8++) {
            arrayList.add((C0212j1) parcel.readParcelable(C0212j1.class.getClassLoader()));
        }
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = parcel.createByteArray();
    }
}
