package p031d2;

import androidx.media3.common.InterfaceC0238s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.b */
/* loaded from: classes.dex */
public abstract class AbstractC0800b implements InterfaceC0238s0 {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
