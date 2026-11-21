package p216z2;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.r0 */
/* loaded from: classes.dex */
public final class C2912r0 {

    /* renamed from: a */
    public int f10819a;

    /* renamed from: b */
    public int f10820b;

    /* renamed from: c */
    public int f10821c;

    /* renamed from: d */
    public int f10822d;

    /* renamed from: e */
    public int f10823e;

    /* renamed from: f */
    public boolean f10824f;

    /* renamed from: g */
    public boolean f10825g;

    /* renamed from: h */
    public boolean f10826h;

    /* renamed from: i */
    public boolean f10827i;

    /* renamed from: j */
    public boolean f10828j;

    /* renamed from: k */
    public boolean f10829k;

    /* renamed from: l */
    public int f10830l;

    /* renamed from: m */
    public long f10831m;

    /* renamed from: n */
    public int f10832n;

    /* renamed from: a */
    public final void m5051a(int i) {
        if ((this.f10822d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f10822d));
    }

    /* renamed from: b */
    public final int m5052b() {
        return this.f10825g ? this.f10820b - this.f10821c : this.f10823e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f10819a + ", mData=null, mItemCount=" + this.f10823e + ", mIsMeasuring=" + this.f10827i + ", mPreviousLayoutItemCount=" + this.f10820b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10821c + ", mStructureChanged=" + this.f10824f + ", mInPreLayout=" + this.f10825g + ", mRunSimpleAnimations=" + this.f10828j + ", mRunPredictiveAnimations=" + this.f10829k + '}';
    }
}
