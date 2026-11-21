package p194w3;

import java.io.File;
import p082j3.C1488a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w3.c */
/* loaded from: classes.dex */
public final class C2641c {

    /* renamed from: a */
    public final String f9603a;

    /* renamed from: b */
    public final long[] f9604b;

    /* renamed from: c */
    public final File[] f9605c;

    /* renamed from: d */
    public final File[] f9606d;

    /* renamed from: e */
    public boolean f9607e;

    /* renamed from: f */
    public C1488a f9608f;

    /* renamed from: g */
    public final /* synthetic */ C2642d f9609g;

    public C2641c(C2642d c2642d, String str) {
        this.f9609g = c2642d;
        this.f9603a = str;
        int i = c2642d.f9616p;
        File file = c2642d.f9610j;
        this.f9604b = new long[i];
        this.f9605c = new File[i];
        this.f9606d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i4 = 0; i4 < i; i4++) {
            sb.append(i4);
            this.f9605c[i4] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f9606d[i4] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public final String m4734a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f9604b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
