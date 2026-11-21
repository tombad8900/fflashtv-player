package androidx.media3.exoplayer.dash.manifest;

import p208y1.C2793a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class EventStream {
    public final C2793a[] events;
    public final long[] presentationTimesUs;
    public final String schemeIdUri;
    public final long timescale;
    public final String value;

    public EventStream(String str, String str2, long j, long[] jArr, C2793a[] c2793aArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.timescale = j;
        this.presentationTimesUs = jArr;
        this.events = c2793aArr;
    }

    /* renamed from: id */
    public String m875id() {
        return this.schemeIdUri + "/" + this.value;
    }
}
