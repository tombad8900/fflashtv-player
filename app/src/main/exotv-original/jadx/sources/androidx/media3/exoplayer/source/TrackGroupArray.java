package androidx.media3.exoplayer.source;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.C0233q1;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.C2181z;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0974j0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class TrackGroupArray {
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new C0233q1[0]);
    private static final String FIELD_TRACK_GROUPS;
    private static final String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final AbstractC0983m0 trackGroups;

    static {
        int i = AbstractC1118i0.f4750a;
        FIELD_TRACK_GROUPS = Integer.toString(0, 36);
    }

    public TrackGroupArray(C0233q1... c0233q1Arr) {
        this.trackGroups = AbstractC0983m0.m2166k(c0233q1Arr);
        this.length = c0233q1Arr.length;
        verifyCorrectness();
    }

    public static TrackGroupArray fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        if (parcelableArrayList == null) {
            return new TrackGroupArray(new C0233q1[0]);
        }
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
            bundle2.getClass();
            c0974j0M2164i.m2141a(C0233q1.m661a(bundle2));
        }
        return new TrackGroupArray((C0233q1[]) c0974j0M2164i.m2159f().toArray(new C0233q1[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getTrackTypes$0(C0233q1 c0233q1) {
        return Integer.valueOf(c0233q1.f1321c);
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.trackGroups.size()) {
            int i4 = i + 1;
            for (int i8 = i4; i8 < this.trackGroups.size(); i8++) {
                if (((C0233q1) this.trackGroups.get(i)).equals(this.trackGroups.get(i8))) {
                    AbstractC1101a.m2365p(TAG, C2181z.FRAGMENT_ENCODE_SET, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i4;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.length == trackGroupArray.length && this.trackGroups.equals(trackGroupArray.trackGroups)) {
                return true;
            }
        }
        return false;
    }

    public C0233q1 get(int i) {
        return (C0233q1) this.trackGroups.get(i);
    }

    public AbstractC0983m0 getTrackTypes() {
        return AbstractC0983m0.m2165j(AbstractC1006u.m2206u(new C0448j(7), this.trackGroups));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
        }
        return this.hashCode;
    }

    public int indexOf(C0233q1 c0233q1) {
        int iIndexOf = this.trackGroups.indexOf(c0233q1);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = FIELD_TRACK_GROUPS;
        AbstractC0983m0 abstractC0983m0 = this.trackGroups;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC0983m0.size());
        Iterator<E> it = abstractC0983m0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0233q1) it.next()).m664d());
        }
        bundle.putParcelableArrayList(str, arrayList);
        return bundle;
    }
}
